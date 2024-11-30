/*
 * 内测云分发开发者API接口
 * 内测云开发者服务平台应用程序接口文档
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: henryxm@163.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.neice.api;

import cloud.neice.ApiCallback;
import cloud.neice.ApiClient;
import cloud.neice.ApiException;
import cloud.neice.ApiResponse;
import cloud.neice.Configuration;
import cloud.neice.Pair;
import cloud.neice.ProgressRequestBody;
import cloud.neice.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cloud.neice.model.CertificateRequest;
import cloud.neice.model.OutResponseOfListOfCertificateResponse;
import cloud.neice.model.OutResponseOfListOfOpenEnterpriseCertificate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenApi {
    private ApiClient localVarApiClient;

    public OpenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OpenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCertificate1
     * @param udid udid (required)
     * @param code code (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate1Call(String udid, String code, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open/api/v1/certificate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (code != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("code", code));
        }

        if (udid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("udid", udid));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCertificate1ValidateBeforeCall(String udid, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'udid' is set
        if (udid == null) {
            throw new ApiException("Missing the required parameter 'udid' when calling getCertificate1(Async)");
        }
        

        okhttp3.Call localVarCall = getCertificate1Call(udid, code, _callback);
        return localVarCall;

    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @param code code (optional)
     * @return OutResponseOfListOfCertificateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public OutResponseOfListOfCertificateResponse getCertificate1(String udid, String code) throws ApiException {
        ApiResponse<OutResponseOfListOfCertificateResponse> localVarResp = getCertificate1WithHttpInfo(udid, code);
        return localVarResp.getData();
    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @param code code (optional)
     * @return ApiResponse&lt;OutResponseOfListOfCertificateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutResponseOfListOfCertificateResponse> getCertificate1WithHttpInfo(String udid, String code) throws ApiException {
        okhttp3.Call localVarCall = getCertificate1ValidateBeforeCall(udid, code, null);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取开发的iOS设备证书 (asynchronously)
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @param code code (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate1Async(String udid, String code, final ApiCallback<OutResponseOfListOfCertificateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificate1ValidateBeforeCall(udid, code, _callback);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCertificate2
     * @param udid udid (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate2Call(String udid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open/api/v1/certificate/{udid}"
            .replaceAll("\\{" + "udid" + "\\}", localVarApiClient.escapeString(udid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCertificate2ValidateBeforeCall(String udid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'udid' is set
        if (udid == null) {
            throw new ApiException("Missing the required parameter 'udid' when calling getCertificate2(Async)");
        }
        

        okhttp3.Call localVarCall = getCertificate2Call(udid, _callback);
        return localVarCall;

    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @return OutResponseOfListOfCertificateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public OutResponseOfListOfCertificateResponse getCertificate2(String udid) throws ApiException {
        ApiResponse<OutResponseOfListOfCertificateResponse> localVarResp = getCertificate2WithHttpInfo(udid);
        return localVarResp.getData();
    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @return ApiResponse&lt;OutResponseOfListOfCertificateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutResponseOfListOfCertificateResponse> getCertificate2WithHttpInfo(String udid) throws ApiException {
        okhttp3.Call localVarCall = getCertificate2ValidateBeforeCall(udid, null);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取开发的iOS设备证书 (asynchronously)
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate2Async(String udid, final ApiCallback<OutResponseOfListOfCertificateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificate2ValidateBeforeCall(udid, _callback);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCertificate3
     * @param udid udid (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate3Call(String udid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open/api/v1/certificate/{udid}"
            .replaceAll("\\{" + "udid" + "\\}", localVarApiClient.escapeString(udid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCertificate3ValidateBeforeCall(String udid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'udid' is set
        if (udid == null) {
            throw new ApiException("Missing the required parameter 'udid' when calling getCertificate3(Async)");
        }
        

        okhttp3.Call localVarCall = getCertificate3Call(udid, _callback);
        return localVarCall;

    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @return OutResponseOfListOfCertificateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public OutResponseOfListOfCertificateResponse getCertificate3(String udid) throws ApiException {
        ApiResponse<OutResponseOfListOfCertificateResponse> localVarResp = getCertificate3WithHttpInfo(udid);
        return localVarResp.getData();
    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @return ApiResponse&lt;OutResponseOfListOfCertificateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutResponseOfListOfCertificateResponse> getCertificate3WithHttpInfo(String udid) throws ApiException {
        okhttp3.Call localVarCall = getCertificate3ValidateBeforeCall(udid, null);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取开发的iOS设备证书 (asynchronously)
     * 获取开发的iOS设备证书
     * @param udid udid (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate3Async(String udid, final ApiCallback<OutResponseOfListOfCertificateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificate3ValidateBeforeCall(udid, _callback);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCertificate4
     * @param certificateRequest certificateRequest (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate4Call(CertificateRequest certificateRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = certificateRequest;

        // create path and map variables
        String localVarPath = "/open/api/v1/certificate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCertificate4ValidateBeforeCall(CertificateRequest certificateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'certificateRequest' is set
        if (certificateRequest == null) {
            throw new ApiException("Missing the required parameter 'certificateRequest' when calling getCertificate4(Async)");
        }
        

        okhttp3.Call localVarCall = getCertificate4Call(certificateRequest, _callback);
        return localVarCall;

    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param certificateRequest certificateRequest (required)
     * @return OutResponseOfListOfCertificateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public OutResponseOfListOfCertificateResponse getCertificate4(CertificateRequest certificateRequest) throws ApiException {
        ApiResponse<OutResponseOfListOfCertificateResponse> localVarResp = getCertificate4WithHttpInfo(certificateRequest);
        return localVarResp.getData();
    }

    /**
     * 获取开发的iOS设备证书
     * 获取开发的iOS设备证书
     * @param certificateRequest certificateRequest (required)
     * @return ApiResponse&lt;OutResponseOfListOfCertificateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutResponseOfListOfCertificateResponse> getCertificate4WithHttpInfo(CertificateRequest certificateRequest) throws ApiException {
        okhttp3.Call localVarCall = getCertificate4ValidateBeforeCall(certificateRequest, null);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取开发的iOS设备证书 (asynchronously)
     * 获取开发的iOS设备证书
     * @param certificateRequest certificateRequest (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCertificate4Async(CertificateRequest certificateRequest, final ApiCallback<OutResponseOfListOfCertificateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCertificate4ValidateBeforeCall(certificateRequest, _callback);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfCertificateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEnterpriseCertificates
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnterpriseCertificatesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open/api/v1/enterprise/certificates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEnterpriseCertificatesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getEnterpriseCertificatesCall(_callback);
        return localVarCall;

    }

    /**
     * 获取企业开发者证书
     * 获取企业开发者证书
     * @return OutResponseOfListOfOpenEnterpriseCertificate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public OutResponseOfListOfOpenEnterpriseCertificate getEnterpriseCertificates() throws ApiException {
        ApiResponse<OutResponseOfListOfOpenEnterpriseCertificate> localVarResp = getEnterpriseCertificatesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 获取企业开发者证书
     * 获取企业开发者证书
     * @return ApiResponse&lt;OutResponseOfListOfOpenEnterpriseCertificate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutResponseOfListOfOpenEnterpriseCertificate> getEnterpriseCertificatesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getEnterpriseCertificatesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfOpenEnterpriseCertificate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取企业开发者证书 (asynchronously)
     * 获取企业开发者证书
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnterpriseCertificatesAsync(final ApiCallback<OutResponseOfListOfOpenEnterpriseCertificate> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEnterpriseCertificatesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfOpenEnterpriseCertificate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEnterpriseCertificates1
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnterpriseCertificates1Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open/api/v1/enterprise/certificates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEnterpriseCertificates1ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getEnterpriseCertificates1Call(_callback);
        return localVarCall;

    }

    /**
     * 获取企业开发者证书
     * 获取企业开发者证书
     * @return OutResponseOfListOfOpenEnterpriseCertificate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public OutResponseOfListOfOpenEnterpriseCertificate getEnterpriseCertificates1() throws ApiException {
        ApiResponse<OutResponseOfListOfOpenEnterpriseCertificate> localVarResp = getEnterpriseCertificates1WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 获取企业开发者证书
     * 获取企业开发者证书
     * @return ApiResponse&lt;OutResponseOfListOfOpenEnterpriseCertificate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutResponseOfListOfOpenEnterpriseCertificate> getEnterpriseCertificates1WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getEnterpriseCertificates1ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfOpenEnterpriseCertificate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取企业开发者证书 (asynchronously)
     * 获取企业开发者证书
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnterpriseCertificates1Async(final ApiCallback<OutResponseOfListOfOpenEnterpriseCertificate> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEnterpriseCertificates1ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OutResponseOfListOfOpenEnterpriseCertificate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
