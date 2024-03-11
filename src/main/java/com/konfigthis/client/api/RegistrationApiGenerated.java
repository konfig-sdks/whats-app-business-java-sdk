/*
 * WhatsApp Business API
 * See https://developers.facebook.com/docs/whatsapp
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.RegisterAccountRequestBody;
import com.konfigthis.client.model.RequestCodeRequestBody;
import com.konfigthis.client.model.RequestCodeResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RegistrationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RegistrationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public RegistrationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call requestCodeCall(RequestCodeRequestBody requestCodeRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = requestCodeRequestBody;

        // create path and map variables
        String localVarPath = "/account";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call requestCodeValidateBeforeCall(RequestCodeRequestBody requestCodeRequestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'requestCodeRequestBody' is set
        if (requestCodeRequestBody == null) {
            throw new ApiException("Missing the required parameter 'requestCodeRequestBody' when calling requestCode(Async)");
        }

        return requestCodeCall(requestCodeRequestBody, _callback);

    }


    private ApiResponse<Void> requestCodeWithHttpInfo(RequestCodeRequestBody requestCodeRequestBody) throws ApiException {
        okhttp3.Call localVarCall = requestCodeValidateBeforeCall(requestCodeRequestBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call requestCodeAsync(RequestCodeRequestBody requestCodeRequestBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestCodeValidateBeforeCall(requestCodeRequestBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RequestCodeRequestBuilder {
        private final String cc;
        private final String cert;
        private final String method;
        private final String phoneNumber;
        private String pin;

        private RequestCodeRequestBuilder(String cc, String cert, String method, String phoneNumber) {
            this.cc = cc;
            this.cert = cert;
            this.method = method;
            this.phoneNumber = phoneNumber;
        }

        /**
         * Set pin
         * @param pin Existing 6-digit PIN — This is only required when two-factor verification is enabled on this account. (optional)
         * @return RequestCodeRequestBuilder
         */
        public RequestCodeRequestBuilder pin(String pin) {
            this.pin = pin;
            return this;
        }
        
        /**
         * Build call for requestCode
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created: the account already exists. You are already registered, so you do not need to do anything else. </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Created: the account does not exist. Depending on the method selected in the request, check your SMS or voice number for the registration code. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            RequestCodeRequestBody requestCodeRequestBody = buildBodyParams();
            return requestCodeCall(requestCodeRequestBody, _callback);
        }

        private RequestCodeRequestBody buildBodyParams() {
            RequestCodeRequestBody requestCodeRequestBody = new RequestCodeRequestBody();
            requestCodeRequestBody.cc(this.cc);
            requestCodeRequestBody.cert(this.cert);
            if (this.method != null)
            requestCodeRequestBody.method(RequestCodeRequestBody.MethodEnum.fromValue(this.method));
            requestCodeRequestBody.phoneNumber(this.phoneNumber);
            requestCodeRequestBody.pin(this.pin);
            return requestCodeRequestBody;
        }

        /**
         * Execute requestCode request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created: the account already exists. You are already registered, so you do not need to do anything else. </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Created: the account does not exist. Depending on the method selected in the request, check your SMS or voice number for the registration code. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            RequestCodeRequestBody requestCodeRequestBody = buildBodyParams();
            requestCodeWithHttpInfo(requestCodeRequestBody);
        }

        /**
         * Execute requestCode request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created: the account already exists. You are already registered, so you do not need to do anything else. </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Created: the account does not exist. Depending on the method selected in the request, check your SMS or voice number for the registration code. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            RequestCodeRequestBody requestCodeRequestBody = buildBodyParams();
            return requestCodeWithHttpInfo(requestCodeRequestBody);
        }

        /**
         * Execute requestCode request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created: the account already exists. You are already registered, so you do not need to do anything else. </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Created: the account does not exist. Depending on the method selected in the request, check your SMS or voice number for the registration code. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            RequestCodeRequestBody requestCodeRequestBody = buildBodyParams();
            return requestCodeAsync(requestCodeRequestBody, _callback);
        }
    }

    /**
     * Request-Code
     * 
     * @param requestCodeRequestBody  (required)
     * @return RequestCodeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created: the account already exists. You are already registered, so you do not need to do anything else. </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Created: the account does not exist. Depending on the method selected in the request, check your SMS or voice number for the registration code. </td><td>  -  </td></tr>
     </table>
     */
    public RequestCodeRequestBuilder requestCode(String cc, String cert, String method, String phoneNumber) throws IllegalArgumentException {
        if (cc == null) throw new IllegalArgumentException("\"cc\" is required but got null");
            

        if (cert == null) throw new IllegalArgumentException("\"cert\" is required but got null");
            

        if (method == null) throw new IllegalArgumentException("\"method\" is required but got null");
            

        if (phoneNumber == null) throw new IllegalArgumentException("\"phoneNumber\" is required but got null");
            

        return new RequestCodeRequestBuilder(cc, cert, method, phoneNumber);
    }
    private okhttp3.Call verifyAccountCall(RegisterAccountRequestBody registerAccountRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = registerAccountRequestBody;

        // create path and map variables
        String localVarPath = "/account/verify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call verifyAccountValidateBeforeCall(RegisterAccountRequestBody registerAccountRequestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'registerAccountRequestBody' is set
        if (registerAccountRequestBody == null) {
            throw new ApiException("Missing the required parameter 'registerAccountRequestBody' when calling verifyAccount(Async)");
        }

        return verifyAccountCall(registerAccountRequestBody, _callback);

    }


    private ApiResponse<Void> verifyAccountWithHttpInfo(RegisterAccountRequestBody registerAccountRequestBody) throws ApiException {
        okhttp3.Call localVarCall = verifyAccountValidateBeforeCall(registerAccountRequestBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call verifyAccountAsync(RegisterAccountRequestBody registerAccountRequestBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyAccountValidateBeforeCall(registerAccountRequestBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class VerifyAccountRequestBuilder {
        private final String code;

        private VerifyAccountRequestBuilder(String code) {
            this.code = code;
        }

        /**
         * Build call for verifyAccount
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            RegisterAccountRequestBody registerAccountRequestBody = buildBodyParams();
            return verifyAccountCall(registerAccountRequestBody, _callback);
        }

        private RegisterAccountRequestBody buildBodyParams() {
            RegisterAccountRequestBody registerAccountRequestBody = new RegisterAccountRequestBody();
            registerAccountRequestBody.code(this.code);
            return registerAccountRequestBody;
        }

        /**
         * Execute verifyAccount request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            RegisterAccountRequestBody registerAccountRequestBody = buildBodyParams();
            verifyAccountWithHttpInfo(registerAccountRequestBody);
        }

        /**
         * Execute verifyAccount request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            RegisterAccountRequestBody registerAccountRequestBody = buildBodyParams();
            return verifyAccountWithHttpInfo(registerAccountRequestBody);
        }

        /**
         * Execute verifyAccount request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            RegisterAccountRequestBody registerAccountRequestBody = buildBodyParams();
            return verifyAccountAsync(registerAccountRequestBody, _callback);
        }
    }

    /**
     * Register-Account
     * 
     * @param registerAccountRequestBody  (required)
     * @return VerifyAccountRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public VerifyAccountRequestBuilder verifyAccount(String code) throws IllegalArgumentException {
        if (code == null) throw new IllegalArgumentException("\"code\" is required but got null");
            

        return new VerifyAccountRequestBuilder(code);
    }
}