# BackupRestoreApi

All URIs are relative to *http://whatsapp.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**settingsPost**](BackupRestoreApi.md#settingsPost) | **POST** /settings/backup | Backup-Settings |
| [**settingsPost_0**](BackupRestoreApi.md#settingsPost_0) | **POST** /settings/restore | Restore-Settings |


<a name="settingsPost"></a>
# **settingsPost**
> BackupSettingsResponse settingsPost(backupSettingsRequestBody).execute();

Backup-Settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackupRestoreApi;
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
    String password = "password_example"; // Used to encrypt backup data for security
    try {
      BackupSettingsResponse result = client
              .backupRestore
              .settingsPost(password)
              .execute();
      System.out.println(result);
      System.out.println(result.getSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupRestoreApi#settingsPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BackupSettingsResponse> response = client
              .backupRestore
              .settingsPost(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupRestoreApi#settingsPost");
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
| **backupSettingsRequestBody** | [**BackupSettingsRequestBody**](BackupSettingsRequestBody.md)|  | |

### Return type

[**BackupSettingsResponse**](BackupSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="settingsPost_0"></a>
# **settingsPost_0**
> settingsPost_0(restoreSettingsRequestBody).execute();

Restore-Settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackupRestoreApi;
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
    String data = "data_example"; // The data that was returned by the /v1/settings/backup API call
    String password = "password_example"; // The password you used in the /v1/settings/backup API call to encrypt the backup data
    try {
      client
              .backupRestore
              .settingsPost_0(data, password)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupRestoreApi#settingsPost_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .backupRestore
              .settingsPost_0(data, password)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupRestoreApi#settingsPost_0");
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
| **restoreSettingsRequestBody** | [**RestoreSettingsRequestBody**](RestoreSettingsRequestBody.md)|  | |

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

