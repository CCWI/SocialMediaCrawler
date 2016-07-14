/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.Boolean;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the VerifyAddItem call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>Item</code> - Root container holding all values that define a new
 * listing.
 * <br> <B>Input property:</B> <code>IncludeExpressRequirements</code> - Indicates if the response should include detailed data relating to
 * whether an item would qualify as an Express listing. For
 * information about the Express-related data that can be returned
 * when IncludeExpressRequirements is set to true,
 * see the response of VerifyAddItem and see the
 * eBay Features Guide.
 * <br> <B>Input property:</B> <code>ExternalProductID</code> - <b>Deprecated.</b> Recommended usage for eBay.com listings is to  use <b>Item.ExternalProductID</b>. 
 * <br> <B>Output property:</B> <code>ReturnedItemID</code> - Represents the item ID for the new listing. VerifyAddItem does not
 * actually list an item, so 0 is returned instead of a normal item ID.
 * <br><br>
 * <span class="tablenote"><b>Note:</b>
 * Although we represent item IDs as strings in the schema, we recommend you store
 * them as 64-bit signed integers. If you choose to store item IDs as strings,
 * allocate at least 19 characters (assuming decimal digits are used) to hold them.
 * eBay will increase the size of IDs over time. Your code should be prepared to
 * handle IDs of up to 19 digits. For more information about item IDs, see
 * <a href=
 * "https://ebaydts.com/eBayKBDetails?KBid=468">
 * Common FAQs on eBay Item IDs and other eBay IDs</a> in the Knowledge Base.
 * </span>
 * <br> <B>Output property:</B> <code>ReturnedFees</code> - Child Fee containers provide the listing feature names, fees, and possible discounts
 * for the new item listing. The fees do not include the Final Value Fee (FVF), which
 * cannot be determined until an item is sold.
 * <br />
 * <br />
 * There is no guarantee that a PromotionalDiscount returned with VerifyAddItem will
 * be realized when the seller uses AddItem to list the same item. This is the result
 * of the timing of certain promotions.
 * <br> <B>Output property:</B> <code>ReturnedExpressListing</code> - Indicates whether the item would be listed on eBay Express.
 * See ExpressItemRequirements for hints about why this
 * value is true or false for a given item.
 * <br> <B>Output property:</B> <code>ReturnedExpressItemRequirements</code> - Contains details about why an item does or doesn't
 * qualify as an eBay Express listing. Only returned when
 * IncludeExpressRequirements is true the request.
 * <br>
 * <br>
 * The item requirements are assessed in this order:<br>
 * - SellerExpressEligible<br>
 * - ExpressOptOut<br>
 * - ExpressApproved<br>
 * - All other settings
 * <br> <B>Output property:</B> <code>ReturnedCategoryID</code> - ID of the primary category in which the item would be listed.
 * Only returned if you set Item.CategoryMappingAllowed to true in the request
 * and the ID you passed in PrimaryCategory was mapped to a new ID by eBay.
 * If the primary category has not changed or it has expired with no replacement,
 * CategoryID does not return a value.
 * <br> <B>Output property:</B> <code>ReturnedCategory2ID</code> - ID of the secondary category in which the item would be listed.
 * Only returned if you set Item.CategoryMappingAllowed to true in the request
 * and the ID you passed in SecondaryCategory was mapped to a new ID by eBay.
 * If the secondary category has not changed or it has expired with no replacement,
 * Category2ID does not return a value.
 * <br> <B>Output property:</B> <code>ReturnedDiscountReason</code> - The nature of the discount, if a discount would have applied
 * had this actually been listed at this time.
 * <br> <B>Output property:</B> <code>ReturnedProductSuggestions</code> - Provides a list of products recommended by eBay which match the item information
 * provided by the seller.
 * Not applicable to Half.com.
 * <br> <B>Output property:</B> <code>ReturnedListingRecommendations</code> - Container consisting of one or more <b>Recommendation</b> containers. Each <b>Recommendation</b> container provides a message to the seller on how a listing can be improved or brought up to standard in regards to top-rated seller/listing requirements, mandated or recommended Item Specifics, picture quality requirements, pricing and/or listing format recommendations, recommended keywords and/or Item Specifics in a Title, and/or a recommendation to offer fast handling (same-day handling or handling time of 1 day) and/or a free shipping option in order to qualify the listing for a Fast 'N Free badge.
 * <br><br>
 * This container is only returned if the <b>IncludeRecommendations</b>
 * flag was included and set to 'true' in the <b>VerifyAddItem</b> request, and if
 * at least one listing recommendation exists for the listing about to be listed. If
 * one or more listing recommendations are returned, it will be at the seller's
 * discretion about whether to revise the listing based on eBay's listing
 * recommendation(s) before actually creating the listing through an
 * <b>AddItem</b> call.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class VerifyAddItemCall extends com.ebay.sdk.ApiCall
{
  
  private ItemType item = null;
  private Boolean includeExpressRequirements = null;
  private ExternalProductIDType externalProductID = null;
  private String returnedItemID=null;
  private FeesType returnedFees=null;
  private Boolean returnedExpressListing=null;
  private ExpressItemRequirementsType returnedExpressItemRequirements=null;
  private String returnedCategoryID=null;
  private String returnedCategory2ID=null;
  private DiscountReasonCodeType[] returnedDiscountReason=null;
  private ProductSuggestionsType returnedProductSuggestions=null;
  private ListingRecommendationsType returnedListingRecommendations=null;

  private final String IMG_URL_FORMAT = "http://i0.ebayimg.ebay.com/i0/00/";
  private final String JPG_EXT = ".jpg";

  private String[] pictureFiles = null;


  /**
   * Constructor.
   */
  public VerifyAddItemCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public VerifyAddItemCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Enables a seller to specify the definition of a new item and submit the definition to eBay without creating a listing.&nbsp;<b>Also for Half.com</b>.
   * <br><br>
   * Sellers who engage in cross-border trade on sites that require a recoupment agreement, must agree to the
   * recoupment terms before adding or verifying items. This agreement allows eBay to reimburse
   * a buyer during a dispute and then recoup the cost from the seller. The US site is a recoupment site, and
   * the agreement is located <a href="https://scgi.ebay.com/ws/eBayISAPI.dll?CBTRecoupAgreement">here</a>.
   * The list of the sites where a user has agreed to the recoupment terms is returned by the GetUser response.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The FeesType object.
   */
  public FeesType verifyAddItem()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    VerifyAddItemRequestType req;
    req = new VerifyAddItemRequestType();

   if( this.pictureFiles != null )
    {
      if( item.getPictureDetails() == null )
      {
    	  PictureDetailsType pictureDetails = new PictureDetailsType();
    	  pictureDetails.setPhotoDisplay(PhotoDisplayCodeType.NONE);
          item.setPictureDetails(pictureDetails);
      }
      
      // Save urls back to item object.
      String[] uris = new String[pictureFiles.length];
      for(int i = 0; i < pictureFiles.length; i ++) {
           uris[i] = IMG_URL_FORMAT + (new Integer(i)).toString() + JPG_EXT;
      }
      item.getPictureDetails().setPictureURL(uris);
    }
    if (this.item != null)
      req.setItem(this.item);
    if (this.includeExpressRequirements != null)
      req.setIncludeExpressRequirements(this.includeExpressRequirements);
    if (this.externalProductID != null)
      req.setExternalProductID(this.externalProductID);

    VerifyAddItemResponseType resp = (VerifyAddItemResponseType) execute(req);

    this.returnedItemID = resp.getItemID();
    this.returnedFees = resp.getFees();
    this.returnedExpressListing = resp.isExpressListing();
    this.returnedExpressItemRequirements = resp.getExpressItemRequirements();
    this.returnedCategoryID = resp.getCategoryID();
    this.returnedCategory2ID = resp.getCategory2ID();
    this.returnedDiscountReason = resp.getDiscountReason();
    this.returnedProductSuggestions = resp.getProductSuggestions();
    this.returnedListingRecommendations = resp.getListingRecommendations();
    return this.getReturnedFees();
  }

  /**
   * Gets the VerifyAddItemRequestType.externalProductID.
   * @return ExternalProductIDType
   */
  public ExternalProductIDType getExternalProductID()
  {
    return this.externalProductID;
  }

  /**
   * Sets the VerifyAddItemRequestType.externalProductID.
   * @param externalProductID ExternalProductIDType
   */
  public void setExternalProductID(ExternalProductIDType externalProductID)
  {
    this.externalProductID = externalProductID;
  }

  /**
   * Gets the VerifyAddItemRequestType.includeExpressRequirements.
   * @return Boolean
   */
  public Boolean getIncludeExpressRequirements()
  {
    return this.includeExpressRequirements;
  }

  /**
   * Sets the VerifyAddItemRequestType.includeExpressRequirements.
   * @param includeExpressRequirements Boolean
   */
  public void setIncludeExpressRequirements(Boolean includeExpressRequirements)
  {
    this.includeExpressRequirements = includeExpressRequirements;
  }

  /**
   * Gets the VerifyAddItemRequestType.item.
   * @return ItemType
   */
  public ItemType getItem()
  {
    return this.item;
  }

  /**
   * Sets the VerifyAddItemRequestType.item.
   * @param item ItemType
   */
  public void setItem(ItemType item)
  {
    this.item = item;
  }
/**
   * Gets list of picture files for the item.
   * @return String[]
   */
  public String[] getPictureFiles() {
    return this.pictureFiles;
  }
/**
   * Sets list of picture files for the item. Before listing
   * the item, the attached picture service object (setPictureService())
   * to upload these picture files then set the picture property of the
   * item object.
   * @param pictureFiles String[]
   */
  public void setPictureFiles(String[] pictureFiles) {
    this.pictureFiles = pictureFiles;
  }
/**
   * Executes the API call. The picture files that you provided will not be
   * uploaded and some dummy urls will be used instead.
   * @param item ItemType
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return FeesType The estimated fees information.
   */
  public FeesType verifyAddItem(ItemType item)
    throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    VerifyAddItemRequestType request = new VerifyAddItemRequestType();
    request.setItem(item);

   if( this.pictureFiles != null )
    {
      if( item.getPictureDetails() == null )
      {
    	  PictureDetailsType pictureDetails = new PictureDetailsType();
    	  pictureDetails.setPhotoDisplay(PhotoDisplayCodeType.NONE);
          item.setPictureDetails(pictureDetails);
      }
      
      // Save urls back to item object.
      String[] uris = new String[pictureFiles.length];
      for(int i = 0; i < pictureFiles.length; i ++) {
           uris[i] = IMG_URL_FORMAT + (new Integer(i)).toString() + JPG_EXT;
      }
      item.getPictureDetails().setPictureURL(uris);
    }
    
    VerifyAddItemResponseType resp = (VerifyAddItemResponseType)execute(request);
    return resp.getFees();
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedCategory2ID.
   * 
   * @return String
   */
  public String getReturnedCategory2ID()
  {
    return this.returnedCategory2ID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedCategoryID.
   * 
   * @return String
   */
  public String getReturnedCategoryID()
  {
    return this.returnedCategoryID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedDiscountReason.
   * 
   * @return DiscountReasonCodeType[]
   */
  public DiscountReasonCodeType[] getReturnedDiscountReason()
  {
    return this.returnedDiscountReason;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedExpressItemRequirements.
   * 
   * @return ExpressItemRequirementsType
   */
  public ExpressItemRequirementsType getReturnedExpressItemRequirements()
  {
    return this.returnedExpressItemRequirements;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedExpressListing.
   * 
   * @return Boolean
   */
  public Boolean getReturnedExpressListing()
  {
    return this.returnedExpressListing;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedFees.
   * 
   * @return FeesType
   */
  public FeesType getReturnedFees()
  {
    return this.returnedFees;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedItemID.
   * 
   * @return String
   */
  public String getReturnedItemID()
  {
    return this.returnedItemID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedListingRecommendations.
   * 
   * @return ListingRecommendationsType
   */
  public ListingRecommendationsType getReturnedListingRecommendations()
  {
    return this.returnedListingRecommendations;
  }

  /**
   * Valid after executing the API.
   * Gets the returned VerifyAddItemResponseType.returnedProductSuggestions.
   * 
   * @return ProductSuggestionsType
   */
  public ProductSuggestionsType getReturnedProductSuggestions()
  {
    return this.returnedProductSuggestions;
  }

}

