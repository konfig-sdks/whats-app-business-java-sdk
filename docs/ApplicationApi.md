# ApplicationApi

All URIs are relative to *http://whatsapp.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSettings**](ApplicationApi.md#getSettings) | **GET** /settings/application | Get-Application-Settings |
| [**listMediaProviders**](ApplicationApi.md#listMediaProviders) | **GET** /settings/application/media/providers | Get-Media-Providers |
| [**removeProvider**](ApplicationApi.md#removeProvider) | **DELETE** /settings/application/media/providers/{ProviderName} | Delete-Media-Providers |
| [**resetSettings**](ApplicationApi.md#resetSettings) | **DELETE** /settings/application | Reset-Application-Settings |
| [**setShards**](ApplicationApi.md#setShards) | **POST** /account/shards | Set-Shards |
| [**updateMediaProviders**](ApplicationApi.md#updateMediaProviders) | **POST** /settings/application/media/providers | Update-Media-Providers |
| [**updateSettings**](ApplicationApi.md#updateSettings) | **PATCH** /settings/application | Update-Application-Settings |


<a name="getSettings"></a>
# **getSettings**
> ApplicationSettings getSettings().execute();

Get-Application-Settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    try {
      ApplicationSettings result = client
              .application
              .getSettings()
              .execute();
      System.out.println(result);
      System.out.println(result.getCallbackBackoffDelayMs());
      System.out.println(result.getCallbackPersist());
      System.out.println(result.getHeartbeatInterval());
      System.out.println(result.getMaxCallbackBackoffDelayMs());
      System.out.println(result.getMedia());
      System.out.println(result.getOnCallPager());
      System.out.println(result.getPassThrough());
      System.out.println(result.getSentStatus());
      System.out.println(result.getUnhealthyInterval());
      System.out.println(result.getWebhooks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationSettings> response = client
              .application
              .getSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
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

[**ApplicationSettings**](ApplicationSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listMediaProviders"></a>
# **listMediaProviders**
> GetMediaProvidersResponse listMediaProviders().execute();

Get-Media-Providers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    try {
      GetMediaProvidersResponse result = client
              .application
              .listMediaProviders()
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
      System.out.println(result.getSettings());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listMediaProviders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetMediaProvidersResponse> response = client
              .application
              .listMediaProviders()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listMediaProviders");
      System.err.println("Status code: " + e.getStatusCode());
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

[**GetMediaProvidersResponse**](GetMediaProvidersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeProvider"></a>
# **removeProvider**
> removeProvider(providerName).execute();

Delete-Media-Providers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String providerName = "providerName_example"; // Provider Name
    try {
      client
              .application
              .removeProvider(providerName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeProvider");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .removeProvider(providerName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeProvider");
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
| **providerName** | **String**| Provider Name | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="resetSettings"></a>
# **resetSettings**
> resetSettings().execute();

Reset-Application-Settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    try {
      client
              .application
              .resetSettings()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#resetSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .resetSettings()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#resetSettings");
      System.err.println("Status code: " + e.getStatusCode());
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="setShards"></a>
# **setShards**
> setShards(setShardsRequestBody).execute();

Set-Shards

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String cc = "cc_example";
    String phoneNumber = "phoneNumber_example";
    String pin = "pin_example";
    Integer shards = 1;
    try {
      client
              .application
              .setShards(cc, phoneNumber, pin, shards)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#setShards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .setShards(cc, phoneNumber, pin, shards)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#setShards");
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
| **setShardsRequestBody** | [**SetShardsRequestBody**](SetShardsRequestBody.md)|  | |

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

<a name="updateMediaProviders"></a>
# **updateMediaProviders**
> updateMediaProviders(mediaProvider).execute();

Update-Media-Providers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    try {
      client
              .application
              .updateMediaProviders()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateMediaProviders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .updateMediaProviders()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateMediaProviders");
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
| **mediaProvider** | [**List&lt;MediaProvider&gt;**](MediaProvider.md)|  | |

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

<a name="updateSettings"></a>
# **updateSettings**
> Response updateSettings(applicationSettings).execute();

Update-Application-Settings

If a field is not present in the request, no change is made to that setting. For example, if on_call_pager is not sent with the request, the existing configuration for on_call_pager is unchanged.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String callbackBackoffDelayMs = "3000"; // Backoff delay for a failed callback in milliseconds This setting is used to configure the amount of time the backoff delays before retrying a failed callback. The backoff delay increases linearly by this value each time a callback fails to get a HTTPS 200 OK response. The backoff delay is capped by the max_callback_backoff_delay_ms setting.
    Boolean callbackPersist = true; // Stores callbacks on disk until they are successfully acknowledged by the Webhook or not. Restart required.
    Integer heartbeatInterval = 5; // Multiconnect: Interval of the Master node monitoring of Coreapp nodes in seconds
    String maxCallbackBackoffDelayMs = "900000"; // Maximum delay for a failed callback in milliseconds
    Media media = new Media();
    String onCallPager = "onCallPager_example"; // Set to valid WhatsApp Group with users who wish to see alerts for critical errors and messages.
    Boolean passThrough = true; // When true, removes messages from the local database after they are delivered to or read by the recipient. When false, saves all messages on local storage until they are explicitly deleted. When messages are sent, they are stored in a local database. This database is used as the application's history. Since the business keeps its own history, you can specify whether you want message pass_through or not. Restart required.
    Boolean sentStatus = false; // Receive a notification that a message is sent to server. When true, you will receive a message indicating that a message has been sent. If false (default), you will not receive notification.
    Integer unhealthyInterval = 30; // Multiconnect: Maximum amount of seconds a Master node waits for a Coreapp node to respond to a heartbeat before considering it unhealthy and starting the failover process.
    Webhooks webhooks = new Webhooks();
    try {
      Response result = client
              .application
              .updateSettings()
              .callbackBackoffDelayMs(callbackBackoffDelayMs)
              .callbackPersist(callbackPersist)
              .heartbeatInterval(heartbeatInterval)
              .maxCallbackBackoffDelayMs(maxCallbackBackoffDelayMs)
              .media(media)
              .onCallPager(onCallPager)
              .passThrough(passThrough)
              .sentStatus(sentStatus)
              .unhealthyInterval(unhealthyInterval)
              .webhooks(webhooks)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Response> response = client
              .application
              .updateSettings()
              .callbackBackoffDelayMs(callbackBackoffDelayMs)
              .callbackPersist(callbackPersist)
              .heartbeatInterval(heartbeatInterval)
              .maxCallbackBackoffDelayMs(maxCallbackBackoffDelayMs)
              .media(media)
              .onCallPager(onCallPager)
              .passThrough(passThrough)
              .sentStatus(sentStatus)
              .unhealthyInterval(unhealthyInterval)
              .webhooks(webhooks)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateSettings");
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
| **applicationSettings** | [**ApplicationSettings**](ApplicationSettings.md)|  | |

### Return type

[**Response**](Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

