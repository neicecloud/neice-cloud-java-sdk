# neice-cloud-java-sdk

内测云分发开发者API接口
- API version: 1.0.0
  - Build date: 2023-09-14T22:42:54.556275+08:00[Asia/Shanghai]

内测云开发者服务平台应用程序接口文档

  For more information, please visit [https://neice.cloud](https://neice.cloud)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>cloud.neice</groupId>
  <artifactId>neice-cloud-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cloud.neice:neice-cloud-java-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/neice-cloud-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.BalanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    BalanceApi apiInstance = new BalanceApi(defaultClient);
    try {
      OutResponseOfBalance result = apiInstance.getBalance();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#getBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://neice.cloud*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BalanceApi* | [**getBalance**](docs/BalanceApi.md#getBalance) | **POST** /api/user/v1/balance | 获取用户余额
*DeviceApi* | [**getCertificate**](docs/DeviceApi.md#getCertificate) | **POST** /api/aas/v1/certificate | 获取iOS设备证书
*DeviceApi* | [**getCertificates**](docs/DeviceApi.md#getCertificates) | **POST** /api/aas/v1/certificates | 获取iOS设备证书列表
*DeviceApi* | [**register**](docs/DeviceApi.md#register) | **POST** /api/aas/v1/register | iOS设备注册
*EndpointApi* | [**getEndpoint**](docs/EndpointApi.md#getEndpoint) | **POST** /endpoint/getEndpoint | 获取签名节点入口
*OauthApi* | [**getToken**](docs/OauthApi.md#getToken) | **POST** /oauth2/token | 获取Token
*OauthApi* | [**getUserInfo**](docs/OauthApi.md#getUserInfo) | **GET** /oauth2/userInfo | 获取用户信息
*OauthApi* | [**getUserInfo1**](docs/OauthApi.md#getUserInfo1) | **POST** /oauth2/userInfo | 获取用户信息


## Documentation for Models

 - [Balance](docs/Balance.md)
 - [DeviceRequest](docs/DeviceRequest.md)
 - [Endpoint](docs/Endpoint.md)
 - [HttpEntity](docs/HttpEntity.md)
 - [OutResponseOfBalance](docs/OutResponseOfBalance.md)
 - [OutResponseOfListOfPersonalCertificate](docs/OutResponseOfListOfPersonalCertificate.md)
 - [OutResponseOfPersonalCertificate](docs/OutResponseOfPersonalCertificate.md)
 - [PersonalCertificate](docs/PersonalCertificate.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - all: All scope is trusted!


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

henryxm@163.com

