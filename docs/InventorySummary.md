
# InventorySummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expirationDetails** | [**List&lt;ExpirationDetails&gt;**](ExpirationDetails.md) | The expiration details of the inventory. This object will only appear if the &#x60;details&#x60; parameter in the request is set to &#x60;SHOW&#x60;. |  [optional]
**inventoryDetails** | [**InventoryDetails**](InventoryDetails.md) |  |  [optional]
**sku** | **String** | The seller or merchant SKU. | 
**totalInboundQuantity** | **Long** | Total quantity that is in-transit from the seller and has not yet been received at an AWD Distribution Center |  [optional]
**totalOnhandQuantity** | **Long** | Total quantity that is present in AWD distribution centers. |  [optional]



