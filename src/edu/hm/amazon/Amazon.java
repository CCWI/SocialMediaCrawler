package edu.hm.amazon;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import edu.hm.amazon.jax.*;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.JAXBException;

public class Amazon {

	// The personal access key from your account
	private static final String AWS_ACCESS_KEY_ID = "";

	// The personal secret key from your account
	private static final String AWS_SECRET_KEY = "";

	// The AWS Konto ID from your account
	private static final String ASSOCIATE_TAG = "erneuerbare-20-21";

	// endpoint url according to the location you want to get the information
	// from
	private static final String ENDPOINT = "ecs.amazonaws.com";

	// helper class to sign the url's
	private SignedRequestsHelper signedRequestsHelper = null;

	public Amazon() {

		try {

			if (signedRequestsHelper == null) {

				signedRequestsHelper = SignedRequestsHelper.getInstance(ENDPOINT, AWS_ACCESS_KEY_ID, AWS_SECRET_KEY);

			}

		} catch (IllegalArgumentException | UnsupportedEncodingException | NoSuchAlgorithmException
				| InvalidKeyException e) {
			e.printStackTrace();
		}

	}

	public List<AmazonProduktSuche> findProduct(String schluesselwort, int page, int minprice, int maxprice) {
		List<AmazonProduktSuche> produktSucheList = new ArrayList<AmazonProduktSuche>();
		// map of the request parameters
		Map<String, String> params = new HashMap<String, String>();

		params.put("Service", "AWSECommerceService");
		params.put("Version", "2011-08-01");
		params.put("Operation", "ItemSearch");
		params.put("SearchIndex", "All");
		params.put("Condition", "All");
		params.put("Availability", "Available");
		params.put("Keywords", schluesselwort);
		params.put("ItemPage", Integer.toString(page));
		params.put("MaximumPrice", Integer.toString(maxprice));
		params.put("MinimumPrice", Integer.toString(minprice));
		params.put("AssociateTag", ASSOCIATE_TAG);

		try {
			// signs the request url
			String url = signedRequestsHelper.sign(params);
			JAXBContext jaxbContext = JAXBContext.newInstance("edu.hm.amazon.jax");
			// Unmarshaller konvertiert XML File in Java Objekt
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ItemSearchResponse itemSearchResponse = (ItemSearchResponse) unmarshaller.unmarshal(new URL(url));

			// iterates over the response items
			for (Items item : itemSearchResponse.getItems()) {
				if (item.getItem().size() == 0) {
					break;
				} else {
					AmazonProduktSuche aps = new AmazonProduktSuche();
					aps.setSchluesselwort(schluesselwort);
					aps.setTreffer(item.getTotalResults());
					if (item.getTotalPages() != null)
						aps.setTotalpages(item.getTotalPages());

					for (Item i : item.getItem()) {
						ItemAttributes itemAttr = i.getItemAttributes();
						aps.setAsin(i.getASIN());
						aps.setTitle(itemAttr.getTitle());
						getProductInformation(i.getASIN(), aps);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						produktSucheList.add(aps);
					}
				}
			}
		} catch (JAXBException | MalformedURLException e) {
			e.printStackTrace();
		}
		return produktSucheList;
	}

	public void getProductInformation(String isbn, AmazonProduktSuche aps) {
		// map of the request parameters
		Map<String, String> params = new HashMap<String, String>();

		params.put("Service", "AWSECommerceService");
		params.put("Version", "2011-08-01");
		params.put("Operation", "ItemLookup");
		params.put("ResponseGroup", "Large");
		params.put("ItemId", isbn);
		params.put("AssociateTag", ASSOCIATE_TAG);

		try {
			// signs the request url
			String url = signedRequestsHelper.sign(params);

			JAXBContext jaxbContext = JAXBContext.newInstance("edu.hm.amazon.jax");
			// Unmarshaller konvertiert XML File in Java Objekt
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ItemLookupResponse itemLookupResponse = (ItemLookupResponse) unmarshaller.unmarshal(new URL(url));

			// iterates over the response items
			for (Items item : itemLookupResponse.getItems()) {
				for (Item i : item.getItem()) {
					ItemAttributes itemAttr = i.getItemAttributes();
					CustomerReviews reviews = i.getCustomerReviews();
					String revUrl = reviews.getIFrameURL();

					if (itemAttr.getAudienceRating() != null)
						aps.setTypename(itemAttr.getAudienceRating());

					if (itemAttr.getEdition() != null)
						aps.setEdition(itemAttr.getEdition());
					if (itemAttr.getModel() != null)
						aps.setModel(itemAttr.getModel());
					if (itemAttr.getReleaseDate() != null)
						aps.setJahr(itemAttr.getReleaseDate());
					if (itemAttr.getWarranty() != null)
						aps.setWarranty(itemAttr.getWarranty());
					if (revUrl != null)
						aps.setRevUrl(revUrl);
					if (itemAttr.getAuthor() != null && !itemAttr.getAuthor().isEmpty())
						aps.setAutor(itemAttr.getAuthor().get(0));
					if (i.getItemAttributes().getProductGroup() != null)
						aps.setLabel(i.getItemAttributes().getProductGroup());
					if (itemAttr.getListPrice() != null)
						aps.setListpreis(itemAttr.getListPrice().getFormattedPrice());
					if (itemAttr.getGenre() != null)
						aps.setGenre(itemAttr.getGenre());
					if (itemAttr.getBinding() != null)
						aps.setBinding(itemAttr.getBinding());

				}
			}
		} catch (JAXBException | MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
