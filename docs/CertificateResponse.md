

# CertificateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actual** | **Integer** | 实际支付 |  [optional]
**buy** | **String** | 购买地址 |  [optional]
**certificate** | **String** | Base64格式的证书P12文件 | 
**code** | **String** | 证书兑换码 |  [optional]
**contact** | **String** | 联系人 |  [optional]
**create** | **OffsetDateTime** | 创建时间 |  [optional]
**description** | **String** | 证书说明 |  [optional]
**device** | **String** | 设备名 |  [optional]
**domain** | **String** | 归属 |  [optional]
**experience** | **Integer** | 允许用户体验的次数 |  [optional]
**invisible** | **Boolean** | 隐形证书 |  [optional]
**lock** | **Integer** | 锁定:0,不加锁;100,导出锁;200,体验锁;300,解码锁;400,付款锁;500,优惠锁;600,包月锁;700,续费锁;800,备份锁;10000,杀死锁 |  [optional]
**mobile** | **String** | 预定证书的手机号 |  [optional]
**mobileprovision** | **String** | Base64格式的证书描述文件 | 
**name** | **String** | 证书名 |  [optional]
**notAfter** | **OffsetDateTime** | 过期时间 |  [optional]
**password** | **String** | 证书P12对应的密码 | 
**pay** | **String** | 购买 |  [optional]
**phone** | **String** | 预定证书的手机号 |  [optional]
**price** | **Integer** | 官方定价 |  [optional]
**profile** | **String** | 证书描述文件ID |  [optional]
**quality** | **Integer** | 证书质保天数 |  [optional]
**reserve** | **Boolean** | 是否为预定的证书 |  [optional]
**serialNumber** | **String** |  |  [optional]
**signed** | **Integer** | 用户签名应用的次数 |  [optional]
**tag** | **String** | 标记 |  [optional]
**team** | **String** | 证书TEAM |  [optional]
**teamId** | **String** |  |  [optional]
**title** | **String** | 标题 |  [optional]
**udid** | **String** | 证书的UDID | 
**uuid** | **String** | 上游渠道生成的证书的UUID |  [optional]
**valid** | **Boolean** | 证书是否有效 |  [optional]



