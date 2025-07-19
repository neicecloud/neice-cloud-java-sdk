

# CertificateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | 通过设备证书兑换码可以兑换设备证书 |  [optional]
**force** | **Boolean** | 强制触发证书查询刷新:证书模式下，系统如果检查该设备证书不为空，将不会触发渠道证书拉取同步，增加强制后，将强制系统查询各渠道证书 |  [optional]
**id** | **String** | 证书的UUID |  [optional]
**model** | **String** | 指定设备型号:iPhone,iPad,iPod,如不指定则使用任何设备 |  [optional]
**phone** | **String** | 如果你兑换的预定证书，需输入手机号用以接收激活通知 |  [optional]
**reserve** | **Boolean** | 预定证书 |  [optional]
**udid** | **String** | iOS设备的UDID |  [optional]
**version** | **String** | 传递APP客户端的版本号 |  [optional]



