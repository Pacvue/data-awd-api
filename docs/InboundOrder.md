
# InboundOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date when this order was created. | 
**destinationDetails** | [**DestinationDetails**](DestinationDetails.md) | Destination details of an inbound order based on the assigned region and DC for the order. |  [optional]
**externalReferenceId** | **String** | Reference ID that can be used to correlate the order with partner resources. |  [optional]
**orderId** | **String** | Inbound order ID. | 
**orderStatus** | [**InboundStatus**](InboundStatus.md) | Inbound order status. | 
**originAddress** | [**Address**](Address.md) | Origin address from where the inbound order will be shipped. | 
**packagesToInbound** | [**List&lt;DistributionPackageQuantity&gt;**](DistributionPackageQuantity.md) | List of packages to be inbounded. | 
**preferences** | [**InboundPreferences**](InboundPreferences.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date when this order was last updated. |  [optional]



