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
import java.lang.Integer;
import java.util.Calendar;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;
/**
 * Wrapper class of the GetOrders call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>OrderIDArray</code> - A container for eBay order IDs. If one or more order IDs are specified in this
 * container, no other call-specific input fields are applicable.
 * <br><br>
 * Not applicable to Half.com.
 * <br> <B>Input property:</B> <code>CreateTimeFrom</code> - The <b>CreateTimeFrom</b> and <b>CreateTimeTo</b> fields
 * specify a date range for retrieving orders. The <b>CreateTimeFrom</b> field is the
 * starting date range. All eBay orders that were created within this date range are
 * returned in the output. The maximum date range that may be specified with the
 * <b>CreateTimeFrom</b> and <b>CreateTimeTo</b> fields is 90 
 * days. <b>CreateTimeFrom</b>/<b>CreateTimeTo</b> date
 * filters are ignored if the <b>NumberOfDays</b> date filter is used in the request, or if
 * one or more order IDs are passed in the request.
 * <br>
 * Applicable to Half.com.
 * <br> <B>Input property:</B> <code>CreateTimeTo</code> - The <b>CreateTimeFrom</b> and <b>CreateTimeTo</b> fields specify a date range for retrieving
 * orders. The <b>CreateTimeTo</b> field is the ending date range. All eBay orders that were
 * created within this date range are returned in the output. The maximum
 * date range that may be specified with the <b>CreateTimeFrom</b> and <b>CreateTimeTo</b> fields
 * is 90 days. If the <b>CreateTimeFrom</b> field is used and the
 * <b>CreateTimeTo</b> field is omitted, the "TimeTo" value defaults to the present time or
 * to 90 days past the <b>CreateTimeFrom</b> value (if <b>CreateTimeFrom</b> value is more than 90
 * days in the past). <b>CreateTimeFrom</b>/<b>CreateTimeTo</b> date filters are ignored if the
 * <b>NumberOfDays</b> date filter is used in the request, or if one or more order IDs are
 * passed in the request.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * If a GetOrders call is made within a few seconds after the creation of a multiple
 * line item order, the caller runs the risk of retrieving orders that are in an
 * inconsistent state, since the order consolidation involved in a multi-line item order
 * may not have been completed. For
 * this reason, it is recommended that sellers include the
 * <b>CreateTimeTo</b> field in the call, and set its value to: <i>
 * Current Time</i> - 2 minutes.
 * <br><br>
 * Applicable to Half.com.
 * <br> <B>Input property:</B> <code>OrderRole</code> - Filters the returned orders based on the role of the user. The user's role is
 * either buyer or seller. If this field is used with a date filter, returned orders
 * must satisfy both the date range and the OrderRole value.
 * <br>
 * Applicable to eBay.com and Half.com.
 * <br> <B>Input property:</B> <code>OrderStatus</code> - The field is used to retrieve orders that are in a specific state. If this field is used with a date filter, only orders that satisfy both the date range and the <b>OrderStatus</b> value are retrieved. 
 * <br><br>
 * For eBay orders, this field's value can be set to 'Active', 'Completed', 'Canceled' or 'Inactive' to retrieve orders in these states. The 'Shipped' value is only applicable for Half.com orders. 
 * <br><br>
 * To retrieve Half.com orders, this field's value should be set to 'Shipped', and the <b>ListingType</b> field should be included and set to 'Half'. 
 * <br><br>
 * If one or more <b>OrderID</b> values are specified through the <b>OrderIDArray</b> container, the <b>OrderStatus</b> field should not be used, and it is ignored if it is used. 
 * <br> <B>Input property:</B> <code>ListingType</code> - Specify Half to retrieve Half.com orders.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * Do not use this field if you are retrieving eBay orders.
 * <br><br>
 * This field cannot be used as a listing type filter on eBay.com. If not
 * provided, or if you specify any value other than Half, this field has
 * no useful effect and the call retrieves eBay orders of all types. Also,
 * you can't retrieve both eBay and Half.com orders in the same response.
 * </span>
 * <br> <B>Input property:</B> <code>Pagination</code> - If many orders are	available to retrieve, you may need to call GetOrders multiple times to retrieve all
 * the data. Each result set is returned as a page of entries. Use the
 * Pagination filters to control the maximum number of entries to
 * retrieve per page (i.e., per call), the page number to retrieve, and
 * other data.
 * <br> <B>Input property:</B> <code>ModTimeFrom</code> - The ModTimeFrom and ModTimeTo fields specify a date range for retrieving
 * existing orders that have been modified within this time window (for example,
 * 'Incomplete' status to 'Pending' status or 'Pending' status to 'Complete' status). The
 * ModTimeFrom field is the starting date range. All eBay orders that were last
 * modified within this date range are returned in the output. The maximum date
 * range that may be specified with the ModTimeFrom and ModTimeTo fields is 30
 * days. ModTimeFrom/ModTimeTo date filters are ignored if the
 * CreateTimeFrom/CreateTimeTo or NumberOfDays date filters are used in the
 * request, or if one or more order IDs are passed in the request.
 * <br><br>
 * Applicable to Half.com.
 * <br> <B>Input property:</B> <code>ModTimeTo</code> - The ModTimeFrom and ModTimeTo fields specify a date range for retrieving
 * existing orders that have been modified within this time window (for example,
 * 'Incomplete' status to 'Pending' status or 'Pending' status to 'Complete'
 * status). The ModTimeTo field is the ending date range. All eBay orders that were
 * last modified within this date range are returned in the output. The maximum
 * date range that may be specified with the ModTimeFrom and ModTimeTo fields is 30
 * days. If the ModTimeFrom field is used and the ModTimeTo field is omitted, the
 * "TimeTo" value defaults to the present time (if ModTimeFrom value is less than
 * 30 days in the past) or to 30 days past the ModTimeFrom value.
 * ModTimeFrom/ModTimeTo date filters are ignored if the
 * CreateTimeFrom/CreateTimeTo or NumberOfDays date filters are used in the
 * request, or if one or more order IDs are passed in the request.
 * <br><br>
 * Applicable to Half.com.
 * <br> <B>Input property:</B> <code>NumberOfDays</code> - This filter specifies the number of days (24-hour periods) in the past to search
 * for orders. All eBay orders that were either created or modified within this
 * period are returned in the output. This field cannot be used in conjunction with
 * the CreateTimeFrom/CreateTimeTo or ModTimeFrom/ModTimeTo date filters. This date 
 * filter is ignored if one or more order IDs are passed in the request.
 * <br><br>
 * Applicable to Half.com.
 * <br> <B>Input property:</B> <code>IncludeFinalValueFee</code> - Indicates whether to include the Final Value Fee (FVF) for all Transaction objects in the
 * response. The Final Value Fee is returned in Transaction.FinalValueFee. The Final
 * Value Fee is assessed right after the creation of an eBay order line item.
 * <br>
 * <br> <B>Input property:</B> <code>SortingOrder</code> - Specifies how orders returned by this call should be sorted (using <strong>LastModifiedTime</strong> as the sort key). A value of <code>Ascending</code> returns the earliest modified orders first, and a value of <code>Descending</code> returns the latest modified orders first.
 * <br/><br/>
 * Default: <code>Ascending</code>
 * <br> <B>Output property:</B> <code>ReturnedPaginationResult</code> - Contains information regarding the pagination of
 * data, including the total number of pages and the total
 * number of orders.
 * <br> <B>Output property:</B> <code>ReturnedHasMoreOrders</code> - A true value indicates that there are more orders to be
 * retrieved. Additional GetOrders calls with higher page numbers or more
 * entries per page must be made to retrieve these orders. If false, no more
 * orders are available or no orders match the request (based on the input
 * filters).
 * <br> <B>Output property:</B> <code>ReturnedOrderArray</code> - The set of orders that match the order IDs or filter criteria specified.
 * Also applicable to Half.com (only returns orders that have not been marked as shipped).
 * <br> <B>Output property:</B> <code>ReturnedOrdersPerPage</code> - Indicates the number of orders that can be
 * returned per page of data (i.e., per call). This is the same value
 * specified in the Pagination.EntriesPerPage input (or the default value, if
 * EntriesPerPage was not specified). This is not necessarily the actual
 * number of orders returned per page (see ReturnedOrderCountActual).
 * <br> <B>Output property:</B> <code>ReturnedPageNumber</code> - Indicates the page number of data returned in the response. 
 * This is the same value specified in the
 * Pagination.PageNumber input. If orders are returned, the first page is 1.
 * <br> <B>Output property:</B> <code>ReturnedReturnedOrderCountActual</code> - Indicates the total number of orders returned.
 * 
 * @author Ron Murphy
 * @version 1.0
 */

public class GetOrdersCall extends com.ebay.sdk.ApiCall
{
  
  private OrderIDArrayType orderIDArray = null;
  private Calendar createTimeFrom = null;
  private Calendar createTimeTo = null;
  private TradingRoleCodeType orderRole = null;
  private OrderStatusCodeType orderStatus = null;
  private ListingTypeCodeType listingType = null;
  private PaginationType pagination = null;
  private Calendar modTimeFrom = null;
  private Calendar modTimeTo = null;
  private Integer numberOfDays = null;
  private Boolean includeFinalValueFee = null;
  private SortOrderCodeType sortingOrder = null;
  private PaginationResultType returnedPaginationResult=null;
  private Boolean returnedHasMoreOrders=null;
  private OrderType[] returnedOrderArray=null;
  private Integer returnedOrdersPerPage=null;
  private Integer returnedPageNumber=null;
  private Integer returnedReturnedOrderCountActual=null;


  /**
   * Constructor.
   */
  public GetOrdersCall() {
  }

  /**
   * Constructor.
   * @param apiContext The ApiContext object to be used to make the call.
   */
  public GetOrdersCall(ApiContext apiContext) {
    super(apiContext);
    

  }

  /**
   * Retrieves the orders for which the authenticated user is a participant, either as the buyer
   * or the seller.&nbsp;<b>Also for Half.com</b>. The call returns all the
   * orders that meet the request specifications.
   * 
   * <br>
   * @throws ApiException
   * @throws SdkException
   * @throws Exception
   * @return The OrderType[] object.
   */
  public OrderType[] getOrders()
      throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException, java.lang.Exception
  {
    GetOrdersRequestType req;
    req = new GetOrdersRequestType();
    req.setDetailLevel(this.getDetailLevel());
    if (this.orderIDArray != null)
      req.setOrderIDArray(this.orderIDArray);
    if (this.createTimeFrom != null)
      req.setCreateTimeFrom(this.createTimeFrom);
    if (this.createTimeTo != null)
      req.setCreateTimeTo(this.createTimeTo);
    if (this.orderRole != null)
      req.setOrderRole(this.orderRole);
    if (this.orderStatus != null)
      req.setOrderStatus(this.orderStatus);
    if (this.listingType != null)
      req.setListingType(this.listingType);
    if (this.pagination != null)
      req.setPagination(this.pagination);
    if (this.modTimeFrom != null)
      req.setModTimeFrom(this.modTimeFrom);
    if (this.modTimeTo != null)
      req.setModTimeTo(this.modTimeTo);
    if (this.numberOfDays != null)
      req.setNumberOfDays(this.numberOfDays);
    if (this.includeFinalValueFee != null)
      req.setIncludeFinalValueFee(this.includeFinalValueFee);
    if (this.sortingOrder != null)
      req.setSortingOrder(this.sortingOrder);

    GetOrdersResponseType resp = (GetOrdersResponseType) execute(req);

    this.returnedPaginationResult = resp.getPaginationResult();
    this.returnedHasMoreOrders = resp.isHasMoreOrders();
    this.returnedOrderArray = (resp.getOrderArray() == null? null: resp.getOrderArray().getOrder());
    this.returnedOrdersPerPage = resp.getOrdersPerPage();
    this.returnedPageNumber = resp.getPageNumber();
    this.returnedReturnedOrderCountActual = resp.getReturnedOrderCountActual();
    return this.getReturnedOrderArray();
  }

  /**
   * Gets the GetOrdersRequestType.createTimeFrom.
   * @return Calendar
   */
  public Calendar getCreateTimeFrom()
  {
    return this.createTimeFrom;
  }

  /**
   * Sets the GetOrdersRequestType.createTimeFrom.
   * @param createTimeFrom Calendar
   */
  public void setCreateTimeFrom(Calendar createTimeFrom)
  {
    this.createTimeFrom = createTimeFrom;
  }

  /**
   * Gets the GetOrdersRequestType.createTimeTo.
   * @return Calendar
   */
  public Calendar getCreateTimeTo()
  {
    return this.createTimeTo;
  }

  /**
   * Sets the GetOrdersRequestType.createTimeTo.
   * @param createTimeTo Calendar
   */
  public void setCreateTimeTo(Calendar createTimeTo)
  {
    this.createTimeTo = createTimeTo;
  }

  /**
   * Gets the GetOrdersRequestType.includeFinalValueFee.
   * @return Boolean
   */
  public Boolean getIncludeFinalValueFee()
  {
    return this.includeFinalValueFee;
  }

  /**
   * Sets the GetOrdersRequestType.includeFinalValueFee.
   * @param includeFinalValueFee Boolean
   */
  public void setIncludeFinalValueFee(Boolean includeFinalValueFee)
  {
    this.includeFinalValueFee = includeFinalValueFee;
  }

  /**
   * Gets the GetOrdersRequestType.listingType.
   * @return ListingTypeCodeType
   */
  public ListingTypeCodeType getListingType()
  {
    return this.listingType;
  }

  /**
   * Sets the GetOrdersRequestType.listingType.
   * @param listingType ListingTypeCodeType
   */
  public void setListingType(ListingTypeCodeType listingType)
  {
    this.listingType = listingType;
  }

  /**
   * Gets the GetOrdersRequestType.modTimeFrom.
   * @return Calendar
   */
  public Calendar getModTimeFrom()
  {
    return this.modTimeFrom;
  }

  /**
   * Sets the GetOrdersRequestType.modTimeFrom.
   * @param modTimeFrom Calendar
   */
  public void setModTimeFrom(Calendar modTimeFrom)
  {
    this.modTimeFrom = modTimeFrom;
  }

  /**
   * Gets the GetOrdersRequestType.modTimeTo.
   * @return Calendar
   */
  public Calendar getModTimeTo()
  {
    return this.modTimeTo;
  }

  /**
   * Sets the GetOrdersRequestType.modTimeTo.
   * @param modTimeTo Calendar
   */
  public void setModTimeTo(Calendar modTimeTo)
  {
    this.modTimeTo = modTimeTo;
  }

  /**
   * Gets the GetOrdersRequestType.numberOfDays.
   * @return Integer
   */
  public Integer getNumberOfDays()
  {
    return this.numberOfDays;
  }

  /**
   * Sets the GetOrdersRequestType.numberOfDays.
   * @param numberOfDays Integer
   */
  public void setNumberOfDays(Integer numberOfDays)
  {
    this.numberOfDays = numberOfDays;
  }

  /**
   * Gets the GetOrdersRequestType.orderIDArray.
   * @return OrderIDArrayType
   */
  public OrderIDArrayType getOrderIDArray()
  {
    return this.orderIDArray;
  }

  /**
   * Sets the GetOrdersRequestType.orderIDArray.
   * @param orderIDArray OrderIDArrayType
   */
  public void setOrderIDArray(OrderIDArrayType orderIDArray)
  {
    this.orderIDArray = orderIDArray;
  }

  /**
   * Gets the GetOrdersRequestType.orderRole.
   * @return TradingRoleCodeType
   */
  public TradingRoleCodeType getOrderRole()
  {
    return this.orderRole;
  }

  /**
   * Sets the GetOrdersRequestType.orderRole.
   * @param orderRole TradingRoleCodeType
   */
  public void setOrderRole(TradingRoleCodeType orderRole)
  {
    this.orderRole = orderRole;
  }

  /**
   * Gets the GetOrdersRequestType.orderStatus.
   * @return OrderStatusCodeType
   */
  public OrderStatusCodeType getOrderStatus()
  {
    return this.orderStatus;
  }

  /**
   * Sets the GetOrdersRequestType.orderStatus.
   * @param orderStatus OrderStatusCodeType
   */
  public void setOrderStatus(OrderStatusCodeType orderStatus)
  {
    this.orderStatus = orderStatus;
  }

  /**
   * Gets the GetOrdersRequestType.pagination.
   * @return PaginationType
   */
  public PaginationType getPagination()
  {
    return this.pagination;
  }

  /**
   * Sets the GetOrdersRequestType.pagination.
   * @param pagination PaginationType
   */
  public void setPagination(PaginationType pagination)
  {
    this.pagination = pagination;
  }

  /**
   * Gets the GetOrdersRequestType.sortingOrder.
   * @return SortOrderCodeType
   */
  public SortOrderCodeType getSortingOrder()
  {
    return this.sortingOrder;
  }

  /**
   * Sets the GetOrdersRequestType.sortingOrder.
   * @param sortingOrder SortOrderCodeType
   */
  public void setSortingOrder(SortOrderCodeType sortingOrder)
  {
    this.sortingOrder = sortingOrder;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetOrdersResponseType.returnedHasMoreOrders.
   * 
   * @return Boolean
   */
  public Boolean getReturnedHasMoreOrders()
  {
    return this.returnedHasMoreOrders;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetOrdersResponseType.returnedOrderArray.
   * 
   * @return OrderType[]
   */
  public OrderType[] getReturnedOrderArray()
  {
    return this.returnedOrderArray;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetOrdersResponseType.returnedOrdersPerPage.
   * 
   * @return Integer
   */
  public Integer getReturnedOrdersPerPage()
  {
    return this.returnedOrdersPerPage;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetOrdersResponseType.returnedPageNumber.
   * 
   * @return Integer
   */
  public Integer getReturnedPageNumber()
  {
    return this.returnedPageNumber;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetOrdersResponseType.returnedPaginationResult.
   * 
   * @return PaginationResultType
   */
  public PaginationResultType getReturnedPaginationResult()
  {
    return this.returnedPaginationResult;
  }

  /**
   * Valid after executing the API.
   * Gets the returned GetOrdersResponseType.returnedReturnedOrderCountActual.
   * 
   * @return Integer
   */
  public Integer getReturnedReturnedOrderCountActual()
  {
    return this.returnedReturnedOrderCountActual;
  }

}

