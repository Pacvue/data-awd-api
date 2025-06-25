
# ProductQuantity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**List&lt;ProductAttribute&gt;**](ProductAttribute.md) | Contains attributes for this instance of the product. For example, item color, or other attributes that distinguish the product beyond the SKU. This is metadata for the product and Amazon does not process this data. |  [optional]
**quantity** | **Integer** | Product quantity. | 
**sku** | **String** | The seller or merchant SKU. | 
**expiration** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date for the SKU. Values are in [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date-time format. |  [optional]
**prepDetails** | [**PrepDetails**](PrepDetails.md) | Preparation details of a product which contains the prep category, prep owner and the label owner. If not passed while creating an inbound order, NO_PREP will be used on the product by-default. Prep instructions will be generated based on the category passed |  [optional]



