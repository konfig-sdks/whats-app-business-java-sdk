# RegistrationApi

All URIs are relative to *http://whatsapp.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestCode**](RegistrationApi.md#requestCode) | **POST** /account | Request-Code |
| [**verifyAccount**](RegistrationApi.md#verifyAccount) | **POST** /account/verify | Register-Account |


<a name="requestCode"></a>
# **requestCode**
> requestCode(requestCodeRequestBody).execute();

Request-Code

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RegistrationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://whatsapp.local";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    WhatsAppBusiness client = new WhatsAppBusiness(configuration);
    String cc = "cc_example"; // Numerical country code for the phone number you are registering
    String cert = "cert_example"; // Base64-encoded Verified Name certificate
    String method = "sms"; // Method of receiving your registration code
    String phoneNumber = "phoneNumber_example"; // Phone number you are registering, without the country code or plus symbol (+)
    String pin = "pin_example"; // Existing 6-digit PIN — This is only required when two-factor verification is enabled on this account.
    try {
      client
              .registration
              .requestCode(cc, cert, method, phoneNumber)
              .pin(pin)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#requestCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .registration
              .requestCode(cc, cert, method, phoneNumber)
              .pin(pin)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#requestCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestCodeRequestBody** | [**RequestCodeRequestBody**](RequestCodeRequestBody.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created: the account already exists. You are already registered, so you do not need to do anything else. |  -  |
| **202** | Created: the account does not exist. Depending on the method selected in the request, check your SMS or voice number for the registration code. |  -  |

<a name="verifyAccount"></a>
# **verifyAccount**
> verifyAccount(registerAccountRequestBody).execute();

Register-Account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RegistrationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://whatsapp.local";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    WhatsAppBusiness client = new WhatsAppBusiness(configuration);
    String code = "code_example";
    try {
      client
              .registration
              .verifyAccount(code)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#verifyAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .registration
              .verifyAccount(code)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#verifyAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerAccountRequestBody** | [**RegisterAccountRequestBody**](RegisterAccountRequestBody.md)|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

