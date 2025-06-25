# AwdApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelInbound**](AwdApi.md#cancelInbound) | **POST** /awd/2024-05-09/inboundOrders/{orderId}/cancellation | 
[**checkInboundEligibility**](AwdApi.md#checkInboundEligibility) | **POST** /awd/2024-05-09/inboundEligibility | 
[**confirmInbound**](AwdApi.md#confirmInbound) | **POST** /awd/2024-05-09/inboundOrders/{orderId}/confirmation | 
[**createInbound**](AwdApi.md#createInbound) | **POST** /awd/2024-05-09/inboundOrders | 
[**getInbound**](AwdApi.md#getInbound) | **GET** /awd/2024-05-09/inboundOrders/{orderId} | 
[**getInboundShipment**](AwdApi.md#getInboundShipment) | **GET** /awd/2024-05-09/inboundShipments/{shipmentId} | 
[**getInboundShipmentLabels**](AwdApi.md#getInboundShipmentLabels) | **GET** /awd/2024-05-09/inboundShipments/{shipmentId}/labels | 
[**listInboundShipments**](AwdApi.md#listInboundShipments) | **GET** /awd/2024-05-09/inboundShipments | 
[**listInventory**](AwdApi.md#listInventory) | **GET** /awd/2024-05-09/inventory | 
[**updateInbound**](AwdApi.md#updateInbound) | **PUT** /awd/2024-05-09/inboundOrders/{orderId} | 
[**updateInboundShipmentTransportDetails**](AwdApi.md#updateInboundShipmentTransportDetails) | **PUT** /awd/2024-05-09/inboundShipments/{shipmentId}/transport | 


<a name="cancelInbound"></a>
# **cancelInbound**
> cancelInbound(orderId)



Cancels an AWD Inbound order and its associated shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String orderId = "orderId_example"; // String | The ID of the inbound order you want to cancel.
try {
    apiInstance.cancelInbound(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#cancelInbound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The ID of the inbound order you want to cancel. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkInboundEligibility"></a>
# **checkInboundEligibility**
> InboundEligibility checkInboundEligibility(body)



Determines if the packages you specify are eligible for an AWD inbound order and contains error details for ineligible packages.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
InboundPackages body = new InboundPackages(); // InboundPackages | Represents the packages you want to inbound.
try {
    InboundEligibility result = apiInstance.checkInboundEligibility(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#checkInboundEligibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InboundPackages**](InboundPackages.md)| Represents the packages you want to inbound. |

### Return type

[**InboundEligibility**](InboundEligibility.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmInbound"></a>
# **confirmInbound**
> confirmInbound(orderId)



Confirms an AWD inbound order in &#x60;DRAFT&#x60; status.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String orderId = "orderId_example"; // String | The ID of the inbound order that you want to confirm.
try {
    apiInstance.confirmInbound(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#confirmInbound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The ID of the inbound order that you want to confirm. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInbound"></a>
# **createInbound**
> InboundOrderReference createInbound(body)



Creates a draft AWD inbound order with a list of packages for inbound shipment. The operation creates one shipment per order.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
InboundOrderCreationData body = new InboundOrderCreationData(); // InboundOrderCreationData | Payload for creating an inbound order.
try {
    InboundOrderReference result = apiInstance.createInbound(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#createInbound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InboundOrderCreationData**](InboundOrderCreationData.md)| Payload for creating an inbound order. |

### Return type

[**InboundOrderReference**](InboundOrderReference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInbound"></a>
# **getInbound**
> InboundOrder getInbound(orderId)



Retrieves an AWD inbound order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 2 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String orderId = "orderId_example"; // String | The ID of the inbound order that you want to retrieve.
try {
    InboundOrder result = apiInstance.getInbound(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#getInbound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The ID of the inbound order that you want to retrieve. |

### Return type

[**InboundOrder**](InboundOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInboundShipment"></a>
# **getInboundShipment**
> InboundShipment getInboundShipment(shipmentId, skuQuantities)



Retrieves an AWD inbound shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 2 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api)

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String shipmentId = "shipmentId_example"; // String | ID for the shipment. A shipment contains the cases being inbounded.
String skuQuantities = "SHOW"; // String | If equal to `SHOW`, the response includes the shipment SKU quantity details.  Defaults to `HIDE`, in which case the response does not contain SKU quantities
try {
    InboundShipment result = apiInstance.getInboundShipment(shipmentId, skuQuantities);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#getInboundShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| ID for the shipment. A shipment contains the cases being inbounded. |
 **skuQuantities** | **String**| If equal to &#x60;SHOW&#x60;, the response includes the shipment SKU quantity details.  Defaults to &#x60;HIDE&#x60;, in which case the response does not contain SKU quantities | [optional] [enum: SHOW, HIDE]

### Return type

[**InboundShipment**](InboundShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInboundShipmentLabels"></a>
# **getInboundShipmentLabels**
> ShipmentLabels getInboundShipmentLabels(shipmentId, pageType, formatType)



Retrieves the box labels for a shipment ID that you specify. This is an asynchronous operation. If the label status is &#x60;GENERATED&#x60;, then the label URL is available.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 2 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String shipmentId = "shipmentId_example"; // String | ID for the shipment.
String pageType = "PLAIN_PAPER"; // String | Page type for the generated labels. The default is `PLAIN_PAPER`.
String formatType = "PDF"; // String | The format type of the output file that contains your labels. The default format type is `PDF`.
try {
    ShipmentLabels result = apiInstance.getInboundShipmentLabels(shipmentId, pageType, formatType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#getInboundShipmentLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| ID for the shipment. |
 **pageType** | **String**| Page type for the generated labels. The default is &#x60;PLAIN_PAPER&#x60;. | [optional] [enum: THERMAL_NONPCP, PLAIN_PAPER, LETTER_6]
 **formatType** | **String**| The format type of the output file that contains your labels. The default format type is &#x60;PDF&#x60;. | [optional] [enum: PDF]

### Return type

[**ShipmentLabels**](ShipmentLabels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInboundShipments"></a>
# **listInboundShipments**
> ShipmentListing listInboundShipments(sortBy, sortOrder, shipmentStatus, updatedAfter, updatedBefore, maxResults, nextToken)



Retrieves a summary of all the inbound AWD shipments associated with a merchant, with the ability to apply optional filters.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String sortBy = "sortBy_example"; // String | Field to sort results by. By default, the response will be sorted by UPDATED_AT.
String sortOrder = "ASCENDING"; // String | Sort the response in ASCENDING or DESCENDING order. By default, the response will be sorted in DESCENDING order.
String shipmentStatus = "CREATED"; // String | Filter by inbound shipment status.
OffsetDateTime updatedAfter = OffsetDateTime.now(); // OffsetDateTime | List the inbound shipments that were updated after a certain time (inclusive). The date must be in <a href='https://developer-docs.amazon.com/sp-api/docs/iso-8601'>ISO 8601</a> format.
OffsetDateTime updatedBefore = OffsetDateTime.now(); // OffsetDateTime | List the inbound shipments that were updated before a certain time (inclusive). The date must be in <a href='https://developer-docs.amazon.com/sp-api/docs/iso-8601'>ISO 8601</a> format.
Integer maxResults = 25; // Integer | Maximum number of results to return.
String nextToken = "SampleToken"; // String | A token that is used to retrieve the next page of results. The response includes `nextToken` when the number of results exceeds the specified `maxResults` value. To get the next page of results, call the operation with this token and include the same arguments as the call that produced the token. To get a complete list, call this operation until `nextToken` is null. Note that this operation can return empty pages.
try {
    ShipmentListing result = apiInstance.listInboundShipments(sortBy, sortOrder, shipmentStatus, updatedAfter, updatedBefore, maxResults, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#listInboundShipments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **String**| Field to sort results by. By default, the response will be sorted by UPDATED_AT. | [optional] [enum: UPDATED_AT, CREATED_AT]
 **sortOrder** | **String**| Sort the response in ASCENDING or DESCENDING order. By default, the response will be sorted in DESCENDING order. | [optional] [enum: ASCENDING, DESCENDING]
 **shipmentStatus** | **String**| Filter by inbound shipment status. | [optional] [enum: CREATED, SHIPPED, IN_TRANSIT, RECEIVING, DELIVERED, CLOSED, CANCELLED]
 **updatedAfter** | **OffsetDateTime**| List the inbound shipments that were updated after a certain time (inclusive). The date must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. | [optional]
 **updatedBefore** | **OffsetDateTime**| List the inbound shipments that were updated before a certain time (inclusive). The date must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. | [optional]
 **maxResults** | **Integer**| Maximum number of results to return. | [optional] [default to 25]
 **nextToken** | **String**| A token that is used to retrieve the next page of results. The response includes &#x60;nextToken&#x60; when the number of results exceeds the specified &#x60;maxResults&#x60; value. To get the next page of results, call the operation with this token and include the same arguments as the call that produced the token. To get a complete list, call this operation until &#x60;nextToken&#x60; is null. Note that this operation can return empty pages. | [optional]

### Return type

[**ShipmentListing**](ShipmentListing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInventory"></a>
# **listInventory**
> InventoryListing listInventory(sku, sortOrder, details, nextToken, maxResults)



Lists AWD inventory associated with a merchant with the ability to apply optional filters.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 2 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String sku = "TestSKU"; // String | Filter by seller or merchant SKU for the item.
String sortOrder = "sortOrder_example"; // String | Sort the response in `ASCENDING` or `DESCENDING` order.
String details = "SHOW"; // String | Set to `SHOW` to return summaries with additional inventory details. Defaults to `HIDE,` which returns only inventory summary totals.
String nextToken = "SampleToken"; // String | A token that is used to retrieve the next page of results. The response includes `nextToken` when the number of results exceeds the specified `maxResults` value. To get the next page of results, call the operation with this token and include the same arguments as the call that produced the token. To get a complete list, call this operation until `nextToken` is null. Note that this operation can return empty pages.
Integer maxResults = 25; // Integer | Maximum number of results to return.
try {
    InventoryListing result = apiInstance.listInventory(sku, sortOrder, details, nextToken, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#listInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **String**| Filter by seller or merchant SKU for the item. | [optional]
 **sortOrder** | **String**| Sort the response in &#x60;ASCENDING&#x60; or &#x60;DESCENDING&#x60; order. | [optional] [enum: ASCENDING, DESCENDING]
 **details** | **String**| Set to &#x60;SHOW&#x60; to return summaries with additional inventory details. Defaults to &#x60;HIDE,&#x60; which returns only inventory summary totals. | [optional] [enum: SHOW, HIDE]
 **nextToken** | **String**| A token that is used to retrieve the next page of results. The response includes &#x60;nextToken&#x60; when the number of results exceeds the specified &#x60;maxResults&#x60; value. To get the next page of results, call the operation with this token and include the same arguments as the call that produced the token. To get a complete list, call this operation until &#x60;nextToken&#x60; is null. Note that this operation can return empty pages. | [optional]
 **maxResults** | **Integer**| Maximum number of results to return. | [optional] [default to 25]

### Return type

[**InventoryListing**](InventoryListing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInbound"></a>
# **updateInbound**
> updateInbound(orderId, body)



Updates an AWD inbound order that is in &#x60;DRAFT&#x60; status and not yet confirmed. Use this operation to update the &#x60;packagesToInbound&#x60;, &#x60;originAddress&#x60; and &#x60;preferences&#x60; attributes.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String orderId = "orderId_example"; // String | The ID of the inbound order that you want to update.
InboundOrder body = new InboundOrder(); // InboundOrder | Represents an AWD inbound order.
try {
    apiInstance.updateInbound(orderId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#updateInbound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The ID of the inbound order that you want to update. |
 **body** | [**InboundOrder**](InboundOrder.md)| Represents an AWD inbound order. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInboundShipmentTransportDetails"></a>
# **updateInboundShipmentTransportDetails**
> updateInboundShipmentTransportDetails(shipmentId, body)



Updates transport details for an AWD shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.awd.ApiException;
//import io.swagger.client.awd.api.AwdApi;


AwdApi apiInstance = new AwdApi();
String shipmentId = "shipmentId_example"; // String | The shipment ID.
TransportationDetails body = new TransportationDetails(); // TransportationDetails | Transportation details for the shipment.
try {
    apiInstance.updateInboundShipmentTransportDetails(shipmentId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AwdApi#updateInboundShipmentTransportDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| The shipment ID. |
 **body** | [**TransportationDetails**](TransportationDetails.md)| Transportation details for the shipment. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

