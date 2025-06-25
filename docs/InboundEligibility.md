
# InboundEligibility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ineligibilityReasons** | [**List&lt;OrderIneligibilityReason&gt;**](OrderIneligibilityReason.md) | If there are order level eligibility issues, then this list will contain those error codes and descriptions. |  [optional]
**packagesToInbound** | [**List&lt;SkuEligibility&gt;**](SkuEligibility.md) | Details on SKU eligibility for each inbound package. | 
**previewedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the eligibility check is performed. | 
**status** | [**InboundEligibilityStatus**](InboundEligibilityStatus.md) |  | 



