

# DeviceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callback** | **String** | 预定证书激活时可通过回调地址将证书推送到业务系统中，为空将不会回调 |  [optional]
**code** | **String** | 可使用兑换码注册设备 |  [optional]
**model** | **String** | 兑换设备的手机型号，非必要参数 |  [optional]
**name** | **String** | 当调用的预定证书激活时，激活通知短信将发送该名称，方便区分，允许为空值 |  [optional]
**param** | **String** | 额外透传参数，非必要参数 |  [optional]
**phone** | **String** | 预定手机:设备激活后发送可以安装APP的通知短信，当注册预定证书时，电话号码不能为空值 |  [optional]
**quality** | **Integer** | 增加质保天数后台可能会增加计费 |  [optional]
**refer** | **String** | 下游系统可以标记该设备的注册用户，上游系统将透传回去，非必要参数 |  [optional]
**renew** | **Boolean** | 标记该设备是否是免费补签请求 |  [optional]
**reserve** | **Boolean** | 证书预定参数开关如果卡设备，将在设备处于激活状态时通知用户安装 |  [optional]
**system** | **String** | 兑换设备的系统，非必要参数 |  [optional]
**udid** | **String** | iOS或iPad设备UDID | 
**uuid** | **String** | 免费补签时，指定需要补签证书对应的UUID |  [optional]
**version** | **String** | 兑换设备的客户端版本，非必要参数 |  [optional]



