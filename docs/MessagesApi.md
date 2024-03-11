# MessagesApi

All URIs are relative to *http://whatsapp.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**markAsRead**](MessagesApi.md#markAsRead) | **PUT** /messages/{MessageID} | Mark-Message-As-Read |
| [**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | Send-Message |


<a name="markAsRead"></a>
# **markAsRead**
> markAsRead(messageID, markMessageAsReadRequestBody).execute();

Mark-Message-As-Read

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    String status = "read";
    String messageID = "messageID_example"; // Message ID from Webhook
    try {
      client
              .messages
              .markAsRead(status, messageID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#markAsRead");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .messages
              .markAsRead(status, messageID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#markAsRead");
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
| **messageID** | **String**| Message ID from Webhook | |
| **markMessageAsReadRequestBody** | [**MarkMessageAsReadRequestBody**](MarkMessageAsReadRequestBody.md)|  | |

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

<a name="sendMessage"></a>
# **sendMessage**
> MessageResponse sendMessage(sendMessageRequestBody).execute();

Send-Message

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
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
    String to = "to_example"; // When recipient_type is individual, this field is the WhatsApp ID (phone number) returned from contacts endpoint. When recipient_type is group, this field is the WhatsApp group ID.
    Object audio = null;
    List<Contact> contacts = Arrays.asList(); // 
    Object document = null;
    Hsm hsm = new Hsm();
    Object image = null;
    Location location = new Location();
    Boolean previewUrl = true; // Specifying preview_url in the request is optional when not including a URL in your message. To include a URL preview, set preview_url to true in the message body and make sure the URL begins with http:// or https://. For more information, see the Sending URLs in Text Messages section.
    String recipientType = "individual"; // Determines whether the recipient is an individual or a group Specifying recipient_type in the request is optional when the value is individual. However, recipient_type is required when using group. If sending a text message to a group, see the Sending Group Messages documentation.
    Text text = new Text();
    Object ttl = null;
    MessageType type = MessageType.fromValue("audio");
    Object video = null;
    try {
      MessageResponse result = client
              .messages
              .sendMessage(to)
              .audio(audio)
              .contacts(contacts)
              .document(document)
              .hsm(hsm)
              .image(image)
              .location(location)
              .previewUrl(previewUrl)
              .recipientType(recipientType)
              .text(text)
              .ttl(ttl)
              .type(type)
              .video(video)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
      System.out.println(result.getMessages());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#sendMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageResponse> response = client
              .messages
              .sendMessage(to)
              .audio(audio)
              .contacts(contacts)
              .document(document)
              .hsm(hsm)
              .image(image)
              .location(location)
              .previewUrl(previewUrl)
              .recipientType(recipientType)
              .text(text)
              .ttl(ttl)
              .type(type)
              .video(video)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#sendMessage");
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
| **sendMessageRequestBody** | [**SendMessageRequestBody**](SendMessageRequestBody.md)|  | |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

