# DeviceApi

All URIs are relative to *https://neice.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExchangeCode**](DeviceApi.md#createExchangeCode) | **POST** /aas/api/v1/exchange/code | 创建iOS设备证书兑换码
[**getCertificate**](DeviceApi.md#getCertificate) | **POST** /aas/api/v1/certificate | 获取iOS设备证书
[**getCertificates**](DeviceApi.md#getCertificates) | **POST** /aas/api/v1/certificates | 获取iOS设备证书列表
[**getStatus**](DeviceApi.md#getStatus) | **POST** /aas/api/v1/status | 获取证书支持类型
[**register**](DeviceApi.md#register) | **POST** /aas/api/v1/register | iOS设备注册
[**registers**](DeviceApi.md#registers) | **POST** /aas/api/v1/registers | iOS设备批量提交注册
[**renewable**](DeviceApi.md#renewable) | **POST** /aas/api/v1/renewable | 查询设备是否可以补签


<a name="createExchangeCode"></a>
# **createExchangeCode**
> ResponseOfCertificateCode createExchangeCode(request)

创建iOS设备证书兑换码

创建iOS设备证书兑换码

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    CertificateCode request = new CertificateCode(); // CertificateCode | request
    try {
      ResponseOfCertificateCode result = apiInstance.createExchangeCode(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#createExchangeCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CertificateCode**](CertificateCode.md)| request |

### Return type

[**ResponseOfCertificateCode**](ResponseOfCertificateCode.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getCertificate"></a>
# **getCertificate**
> ResponseOfPersonalCertificate getCertificate(udid)

获取iOS设备证书

获取iOS设备证书

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      ResponseOfPersonalCertificate result = apiInstance.getCertificate(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **udid** | **String**| udid |

### Return type

[**ResponseOfPersonalCertificate**](ResponseOfPersonalCertificate.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getCertificates"></a>
# **getCertificates**
> ResponseOfListOfPersonalCertificate getCertificates(limit, page, asc)

获取iOS设备证书列表

获取iOS设备证书列表

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    Integer limit = 56; // Integer | limit
    Integer page = 56; // Integer | page
    Boolean asc = true; // Boolean | asc
    try {
      ResponseOfListOfPersonalCertificate result = apiInstance.getCertificates(limit, page, asc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getCertificates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| limit |
 **page** | **Integer**| page |
 **asc** | **Boolean**| asc | [optional]

### Return type

[**ResponseOfListOfPersonalCertificate**](ResponseOfListOfPersonalCertificate.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getStatus"></a>
# **getStatus**
> ResponseOfStatus getStatus()

获取证书支持类型

获取证书支持类型

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    try {
      ResponseOfStatus result = apiInstance.getStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOfStatus**](ResponseOfStatus.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="register"></a>
# **register**
> ResponseOfPersonalCertificate register(request)

iOS设备注册

iOS设备注册

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    DeviceRequest request = new DeviceRequest(); // DeviceRequest | request
    try {
      ResponseOfPersonalCertificate result = apiInstance.register(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#register");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DeviceRequest**](DeviceRequest.md)| request |

### Return type

[**ResponseOfPersonalCertificate**](ResponseOfPersonalCertificate.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="registers"></a>
# **registers**
> ResponseOfstring registers(deviceRequests)

iOS设备批量提交注册

请确保批量提交的数据的准性，提交后不可撤销，批量提交注册将不直接返回证书，请通过回调接口接收证书，如果没提供回调接口，可使用查询接口查询

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    List<DeviceRequest> deviceRequests = Arrays.asList(); // List<DeviceRequest> | deviceRequests
    try {
      ResponseOfstring result = apiInstance.registers(deviceRequests);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#registers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceRequests** | [**List&lt;DeviceRequest&gt;**](DeviceRequest.md)| deviceRequests |

### Return type

[**ResponseOfstring**](ResponseOfstring.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="renewable"></a>
# **renewable**
> ResponseOfRenewable renewable(udid)

查询设备是否可以补签

查询指定UDID的设备是否可以免费补签

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      ResponseOfRenewable result = apiInstance.renewable(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#renewable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **udid** | **String**| udid |

### Return type

[**ResponseOfRenewable**](ResponseOfRenewable.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

