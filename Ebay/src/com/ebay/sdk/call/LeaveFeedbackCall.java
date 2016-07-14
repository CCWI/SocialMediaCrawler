/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.call;

import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the LeaveFeedback call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>FeedbackDetail</code> - Helper wrapper to set LeaveFeedbackRequestType CommentText, CommentType, ItemID:
 * CommentText sets LeaveFeedbackRequestType.CommentText: 
 * Textual comment that explains, clarifies, or justifies the Feedback rating
 * specified in <b>CommentType</b>. 
 * <br><br> 
 * This comment will still be displayed even if submitted Feedback is withdrawn.
 * CommentType sets LeaveFeedbackRequestType.CommentType: 
 * This value indicates the Feedback rating for the user specified in the 
 * <b>TargetUser</b> field. This field is required in <b>LeaveFeedback</b>. 
 * <br><br>
 * A Positive rating increases the user's Feedback score, a Negative rating decreases the user's Feedback score, and a Neutral rating does not affect the user's Feedback score. 
 * <br><br>
 * Sellers cannot leave Neutral or Negative ratings for buyers. 
 * ItemID sets LeaveFeedbackRequestType.ItemID: 
 * Unique identifier for an eBay item listing. A listing can have multiple
 * order line items, but only one <b>ItemID</b>. Unless an
 * <b>OrderLineItemID</b> is specified in the <b>LeaveFeedback</b> request, the <b>ItemID</b> is
 * required along with the <b>TargetUser</b> to identify an order line item
 * existing between the caller and the <b>TargetUser</b> that requires feedback. A
 * Feedback entry will be posted for this order line item. If there are
 * multiple order line items between the two order partners that still
 * require feedback, the <b>TransactionID</b> will also be required to isolate the
 * targeted order line item. Feedback cannot be left for order line items
 * with creation dates more than 60 days in the past.
 * <br> <B>Input property:</B> <code>TransactionID</code> - Unique identifier for an eBay order line item (transaction). If there
 * are multiple order line items between the two order partners that still
 * require feedback, the <b>TransactionID</b> is required along with the
 * corresponding <b>ItemID</b> and <b>TargetUser</b> to isolate the targeted order line
 * item. If an <b>OrderLineItemID</b> is included in the response to identify a
 * specific order line item, none of the preceding fields (<b>ItemID</b>,
 * <b>TransactionID</b>, <b>TargetUser</b>) are needed. Feedback cannot be left for order
 * line items with creation dates more than 60 days in the past.
 * <br> <B>Input property:</B> <code>TargetUser</code> - This eBay User ID identifies the recipient user for whom the feedback is being
 * left.
 * <br> <B>Input property:</B> <code>SellerItemRatingDetailArray</code> - Container for detailed seller ratings (DSRs). If a buyer is providing DSRs,
 * they are specified in this container. Sellers have access to the number of
 * ratings they've received, as well as to the averages of the DSRs they've
 * received in each DSR area (i.e., to the average of ratings in the
 * item-description area, etc.).
 * <br> <B>Input property:</B> <code>OrderLineItemID</code> - <b>OrderLineItemID</b> is a unique identifier for an eBay order line item and
 * is based upon the concatenation of <b>ItemID</b> and <b>TransactionID</b>, with a
 * hyphen in between these two IDs. If an <b>OrderLineItemID</b> is included in
 * the request, the <b>ItemID</b>, <b>TransactionID</b>, and <b>TargetUser</b> fields are not
 * required. Feedback cannot be left for order line items with creation
 * dates more than 60 days in the past. 
 * <br> <B>Output property:</B> <code>ReturnedFeedbackID</code> - The ID of the feedback that has been left.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class LeaveFeedbackCall extends com.ebay.sdk.ApiCall
{
  
  private FeedbackDetailType feedbackDetail = null;
  private String transactionID = null;
  private String targetUser = null;
  private ItemRatingDetailArrayType sellerItemRatingDetailArray = null;
  private String orderLineItemID = null;
  private String returnedFeedbackID=null;


  /**
   * Constructor.
   */
  public LeaveFeedbackCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public LeaveFeedbackCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Enables a buyer and seller to leave feedback for their order partner at the
   * conclusion of a successful order. Feedback is left at the order line item level, 
   * so multiple line item orders may have multiple Feedback entries.&nbsp;<b>
   * Also for Half.com</b>.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The void object.
   */
  public void leaveFeedback()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    LeaveFeedbackRequestType req;
    req = new LeaveFeedbackRequestType();

    if( this.targetUser == null )
      throw new SdkException("TargetUser property is not set.");
    if( this.feedbackDetail == null )
      throw new SdkException("FeedbackDetail property is not set.");
    if( this.feedbackDetail.getItemID() == null )
      throw new SdkException("FeedbackDetail.getItemID() property is not set.");
    if( this.feedbackDetail.getCommentText() == null )
      throw new SdkException("FeedbackDetail.getCommentText() property is not set.");
    if( this.feedbackDetail.getCommentType() == null )
      throw new SdkException("FeedbackDetail.getCommentType() property is not set.");

    req.setDetailLevel(this.getDetailLevel());
    if (this.feedbackDetail != null)
    {
      req.setCommentText(this.feedbackDetail.getCommentText());
      req.setCommentType(this.feedbackDetail.getCommentType());
      req.setItemID(this.feedbackDetail.getItemID());
    }
    if (this.transactionID != null)
      req.setTransactionID(this.transactionID);
    if (this.targetUser != null)
      req.setTargetUser(this.targetUser);
    if (this.sellerItemRatingDetailArray != null)
      req.setSellerItemRatingDetailArray(this.sellerItemRatingDetailArray);
    if (this.orderLineItemID != null)
      req.setOrderLineItemID(this.orderLineItemID);

    LeaveFeedbackResponseType resp = (LeaveFeedbackResponseType) execute(req);

    this.returnedFeedbackID = resp.getFeedbackID();

  }

  /**
   * Gets the LeaveFeedbackRequestType.feedbackDetail.
   * @return FeedbackDetailType
   */
  public FeedbackDetailType getFeedbackDetail()
  {
    return this.feedbackDetail;
  }

  /**
   * Sets the LeaveFeedbackRequestType.feedbackDetail.
   * @param feedbackDetail FeedbackDetailType
   */
  public void setFeedbackDetail(FeedbackDetailType feedbackDetail)
  {
    this.feedbackDetail = feedbackDetail;
  }

  /**
   * Gets the LeaveFeedbackRequestType.orderLineItemID.
   * @return String
   */
  public String getOrderLineItemID()
  {
    return this.orderLineItemID;
  }

  /**
   * Sets the LeaveFeedbackRequestType.orderLineItemID.
   * @param orderLineItemID String
   */
  public void setOrderLineItemID(String orderLineItemID)
  {
    this.orderLineItemID = orderLineItemID;
  }

  /**
   * Gets the LeaveFeedbackRequestType.sellerItemRatingDetailArray.
   * @return ItemRatingDetailArrayType
   */
  public ItemRatingDetailArrayType getSellerItemRatingDetailArray()
  {
    return this.sellerItemRatingDetailArray;
  }

  /**
   * Sets the LeaveFeedbackRequestType.sellerItemRatingDetailArray.
   * @param sellerItemRatingDetailArray ItemRatingDetailArrayType
   */
  public void setSellerItemRatingDetailArray(ItemRatingDetailArrayType sellerItemRatingDetailArray)
  {
    this.sellerItemRatingDetailArray = sellerItemRatingDetailArray;
  }

  /**
   * Gets the LeaveFeedbackRequestType.targetUser.
   * @return String
   */
  public String getTargetUser()
  {
    return this.targetUser;
  }

  /**
   * Sets the LeaveFeedbackRequestType.targetUser.
   * @param targetUser String
   */
  public void setTargetUser(String targetUser)
  {
    this.targetUser = targetUser;
  }

  /**
   * Gets the LeaveFeedbackRequestType.transactionID.
   * @return String
   */
  public String getTransactionID()
  {
    return this.transactionID;
  }

  /**
   * Sets the LeaveFeedbackRequestType.transactionID.
   * @param transactionID String
   */
  public void setTransactionID(String transactionID)
  {
    this.transactionID = transactionID;
  }

  /**
   * Valid after executing the API.
   * Gets the returned LeaveFeedbackResponseType.returnedFeedbackID.
   * 
   * @return String
   */
  public String getReturnedFeedbackID()
  {
    return this.returnedFeedbackID;
  }

}

