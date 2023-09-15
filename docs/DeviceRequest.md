

# DeviceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callback** | **String** | 预定证书激活时可通过回调地址将证书推送到业务系统中，为空将不会回调 |  [optional]
**name** | **String** | 当调用的预定证书激活时，激活通知短信将发送该名称，方便区分 |  [optional]
**phone** | **String** | 预定手机:设备激活后发送可以安装APP的通知短信 |  [optional]
**quality** | **Integer** | 增加质保天数后台可能会增加计费 |  [optional]
**reserve** | **Boolean** | 证书预定参数开关如果卡设备，将在设备处于激活状态时通知用户安装 |  [optional]
**udid** | **String** | iOS或iPad设备UDID | 



