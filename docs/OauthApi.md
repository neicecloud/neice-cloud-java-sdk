# OauthApi

All URIs are relative to *https://neice.cloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken**](OauthApi.md#getToken) | **POST** /oauth2/token | 获取Token
[**getUserInfo**](OauthApi.md#getUserInfo) | **GET** /oauth2/userInfo | 获取用户信息
[**getUserInfo1**](OauthApi.md#getUserInfo1) | **POST** /oauth2/userInfo | 获取用户信息


<a name="getToken"></a>
# **getToken**
> String getToken(clientId, clientSecret)

获取Token

获取Token

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.models.*;
import cloud.neice.api.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");

    OauthApi apiInstance = new OauthApi(defaultClient);
    String clientId = "clientId_example"; // String | client_id
    String clientSecret = "clientSecret_example"; // String | client_secret
    try {
      String result = apiInstance.getToken(clientId, clientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#getToken");
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
 **clientId** | **String**| client_id |
 **clientSecret** | **String**| client_secret |

### Return type

**String**

### Authorization

No authorization required

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

<a name="getUserInfo"></a>
# **getUserInfo**
> Object getUserInfo()

获取用户信息

获取用户信息

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OauthApi apiInstance = new OauthApi(defaultClient);
    try {
      Object result = apiInstance.getUserInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#getUserInfo");
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

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getUserInfo1"></a>
# **getUserInfo1**
> Object getUserInfo1()

获取用户信息

获取用户信息

### Example
```java
// Import classes:
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.Configuration;
import cloud.neice.auth.*;
import cloud.neice.models.*;
import cloud.neice.api.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://neice.cloud");
    
    // Configure OAuth2 access token for authorization: Authorization
    OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setAccessToken("YOUR ACCESS TOKEN");

    OauthApi apiInstance = new OauthApi(defaultClient);
    try {
      Object result = apiInstance.getUserInfo1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#getUserInfo1");
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

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

