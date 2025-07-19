

# CertificateCode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | 证书兑换码 |  [optional]
**domain** | **String** | 证书兑换系统的域名，请先在网站配置域名及其对应的API地址 |  [optional]
**exchange** | **OffsetDateTime** | 兑换码完成兑换的时间 |  [optional]
**model** | **String** | 设备型号:iPhone,iPad,iPod |  [optional]
**quality** | **Integer** | 默认为0:不质保,最大不能超过365天，该值仅作为参考，不作为依据，具体以上游系统为准 |  [optional]
**query** | **String** | 证书查询码 |  [optional]
**reserve** | **Boolean** | 表示该兑换码是否是兑换的预定证书，该值仅作为参考，不作为依据，具体以上游系统为准 |  [optional]
**token** | **String** | 请求鉴权令牌 | 
**udid** | **String** | 绑定设备的UDID，兑换时绑定 |  [optional]



