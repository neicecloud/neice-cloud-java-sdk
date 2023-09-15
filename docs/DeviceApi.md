# DeviceApi

All URIs are relative to *https://neice.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCertificate**](DeviceApi.md#getCertificate) | **POST** /api/aas/v1/certificate | 获取iOS设备证书
[**getCertificates**](DeviceApi.md#getCertificates) | **POST** /api/aas/v1/certificates | 获取iOS设备证书列表
[**register**](DeviceApi.md#register) | **POST** /api/aas/v1/register | iOS设备注册


<a name="getCertificate"></a>
# **getCertificate**
> OutResponseOfPersonalCertificate getCertificate(udid)

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
      OutResponseOfPersonalCertificate result = apiInstance.getCertificate(udid);
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

[**OutResponseOfPersonalCertificate**](OutResponseOfPersonalCertificate.md)

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
> OutResponseOfListOfPersonalCertificate getCertificates(limit, page, asc)

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
      OutResponseOfListOfPersonalCertificate result = apiInstance.getCertificates(limit, page, asc);
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

[**OutResponseOfListOfPersonalCertificate**](OutResponseOfListOfPersonalCertificate.md)

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
> OutResponseOfPersonalCertificate register(deviceRequest)

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
    DeviceRequest deviceRequest = new DeviceRequest(); // DeviceRequest | deviceRequest
    try {
      OutResponseOfPersonalCertificate result = apiInstance.register(deviceRequest);
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
 **deviceRequest** | [**DeviceRequest**](DeviceRequest.md)| deviceRequest |

### Return type

[**OutResponseOfPersonalCertificate**](OutResponseOfPersonalCertificate.md)

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

