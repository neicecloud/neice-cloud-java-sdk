# OpenApi

All URIs are relative to *https://neice.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCertificate1**](OpenApi.md#getCertificate1) | **GET** /open/api/v1/certificate | 获取开发的iOS设备证书
[**getCertificate2**](OpenApi.md#getCertificate2) | **POST** /open/api/v1/certificate/{udid} | 获取开发的iOS设备证书
[**getCertificate3**](OpenApi.md#getCertificate3) | **GET** /open/api/v1/certificate/{udid} | 获取开发的iOS设备证书
[**getCertificate4**](OpenApi.md#getCertificate4) | **POST** /open/api/v1/certificate | 获取开发的iOS设备证书
[**getEnterpriseCertificates**](OpenApi.md#getEnterpriseCertificates) | **GET** /open/api/v1/enterprise/certificates | 获取企业开发者证书
[**getEnterpriseCertificates1**](OpenApi.md#getEnterpriseCertificates1) | **POST** /open/api/v1/enterprise/certificates | 获取企业开发者证书


<a name="getCertificate1"></a>
# **getCertificate1**
> ResponseOfListOfCertificateResponse getCertificate1(udid, code)

获取开发的iOS设备证书

获取开发的iOS设备证书

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OpenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OpenApi apiInstance = new OpenApi(defaultClient);
    String udid = "udid_example"; // String | udid
    String code = "code_example"; // String | code
    try {
      ResponseOfListOfCertificateResponse result = apiInstance.getCertificate1(udid, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApi#getCertificate1");
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
 **code** | **String**| code | [optional]

### Return type

[**ResponseOfListOfCertificateResponse**](ResponseOfListOfCertificateResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getCertificate2"></a>
# **getCertificate2**
> ResponseOfListOfCertificateResponse getCertificate2(udid)

获取开发的iOS设备证书

获取开发的iOS设备证书

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OpenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OpenApi apiInstance = new OpenApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      ResponseOfListOfCertificateResponse result = apiInstance.getCertificate2(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApi#getCertificate2");
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

[**ResponseOfListOfCertificateResponse**](ResponseOfListOfCertificateResponse.md)

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

<a name="getCertificate3"></a>
# **getCertificate3**
> ResponseOfListOfCertificateResponse getCertificate3(udid)

获取开发的iOS设备证书

获取开发的iOS设备证书

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OpenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OpenApi apiInstance = new OpenApi(defaultClient);
    String udid = "udid_example"; // String | udid
    try {
      ResponseOfListOfCertificateResponse result = apiInstance.getCertificate3(udid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApi#getCertificate3");
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

[**ResponseOfListOfCertificateResponse**](ResponseOfListOfCertificateResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getCertificate4"></a>
# **getCertificate4**
> ResponseOfListOfCertificateResponse getCertificate4(request)

获取开发的iOS设备证书

获取开发的iOS设备证书

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OpenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OpenApi apiInstance = new OpenApi(defaultClient);
    CertificateRequest request = new CertificateRequest(); // CertificateRequest | request
    try {
      ResponseOfListOfCertificateResponse result = apiInstance.getCertificate4(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApi#getCertificate4");
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
 **request** | [**CertificateRequest**](CertificateRequest.md)| request |

### Return type

[**ResponseOfListOfCertificateResponse**](ResponseOfListOfCertificateResponse.md)

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

<a name="getEnterpriseCertificates"></a>
# **getEnterpriseCertificates**
> ResponseOfListOfOpenEnterpriseCertificate getEnterpriseCertificates()

获取企业开发者证书

获取企业开发者证书

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OpenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OpenApi apiInstance = new OpenApi(defaultClient);
    try {
      ResponseOfListOfOpenEnterpriseCertificate result = apiInstance.getEnterpriseCertificates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApi#getEnterpriseCertificates");
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

[**ResponseOfListOfOpenEnterpriseCertificate**](ResponseOfListOfOpenEnterpriseCertificate.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getEnterpriseCertificates1"></a>
# **getEnterpriseCertificates1**
> ResponseOfListOfOpenEnterpriseCertificate getEnterpriseCertificates1()

获取企业开发者证书

获取企业开发者证书

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OpenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OpenApi apiInstance = new OpenApi(defaultClient);
    try {
      ResponseOfListOfOpenEnterpriseCertificate result = apiInstance.getEnterpriseCertificates1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApi#getEnterpriseCertificates1");
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

[**ResponseOfListOfOpenEnterpriseCertificate**](ResponseOfListOfOpenEnterpriseCertificate.md)

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

