# GroupsApi

All URIs are relative to *http://whatsapp.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Create-Group |
| [**deleteGroupIcon**](GroupsApi.md#deleteGroupIcon) | **DELETE** /groups/{GroupId}/icon | Delete-Group-Icon |
| [**deleteInvite**](GroupsApi.md#deleteInvite) | **DELETE** /groups/{GroupId}/invite | Delete-Group-Invite |
| [**demoteAdmin**](GroupsApi.md#demoteAdmin) | **DELETE** /groups/{GroupId}/admins | Demote-Group-Admin |
| [**getAll**](GroupsApi.md#getAll) | **GET** /groups | Get-All-Groups |
| [**getIconBinary**](GroupsApi.md#getIconBinary) | **GET** /groups/{GroupId}/icon | Get-Group-Icon-Binary |
| [**getInfo**](GroupsApi.md#getInfo) | **GET** /groups/{GroupId} | Get-Group-Info |
| [**getInviteDetails**](GroupsApi.md#getInviteDetails) | **GET** /groups/{GroupId}/invite | Get-Group-Invite |
| [**leaveGroup**](GroupsApi.md#leaveGroup) | **POST** /groups/{GroupId}/leave | Leave-Group |
| [**promoteToAdmin**](GroupsApi.md#promoteToAdmin) | **PATCH** /groups/{GroupId}/admins | Promote-To-Group-Admin |
| [**removeParticipant**](GroupsApi.md#removeParticipant) | **DELETE** /groups/{GroupId}/participants | Remove-Group-Participant |
| [**setGroupIcon**](GroupsApi.md#setGroupIcon) | **POST** /groups/{GroupId}/icon | Set-Group-Icon |
| [**updateInfo**](GroupsApi.md#updateInfo) | **PUT** /groups/{GroupId} | Update-Group-Info |


<a name="createGroup"></a>
# **createGroup**
> GroupsResponse createGroup(createGroupRequestBody).execute();

Create-Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String subject = "subject_example";
    try {
      GroupsResponse result = client
              .groups
              .createGroup(subject)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsResponse> response = client
              .groups
              .createGroup(subject)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
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
| **createGroupRequestBody** | [**CreateGroupRequestBody**](CreateGroupRequestBody.md)|  | |

### Return type

[**GroupsResponse**](GroupsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="deleteGroupIcon"></a>
# **deleteGroupIcon**
> deleteGroupIcon(groupId, _file).groupsDeleteGroupIconRequest(groupsDeleteGroupIconRequest).execute();

Delete-Group-Icon

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String groupId = "groupId_example"; // 
    File _file = new File("/path/to/file");
    try {
      client
              .groups
              .deleteGroupIcon(groupId, _file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupIcon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .deleteGroupIcon(groupId, _file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupIcon");
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
| **groupId** | **String**|  | |
| **_file** | **File**|  | |
| **groupsDeleteGroupIconRequest** | [**GroupsDeleteGroupIconRequest**](GroupsDeleteGroupIconRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="deleteInvite"></a>
# **deleteInvite**
> deleteInvite(groupId).execute();

Delete-Group-Invite

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String groupId = "groupId_example"; // 
    try {
      client
              .groups
              .deleteInvite(groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteInvite");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .deleteInvite(groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteInvite");
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
| **groupId** | **String**|  | |

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

<a name="demoteAdmin"></a>
# **demoteAdmin**
> demoteAdmin(groupId, groupAdminRequestBody).execute();

Demote-Group-Admin

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    List<String> waIds = Arrays.asList(); // The WhatsApp IDs of the people to be added or removed as group admins
    String groupId = "groupId_example"; // 
    try {
      client
              .groups
              .demoteAdmin(waIds, groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#demoteAdmin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .demoteAdmin(waIds, groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#demoteAdmin");
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
| **groupId** | **String**|  | |
| **groupAdminRequestBody** | [**GroupAdminRequestBody**](GroupAdminRequestBody.md)|  | |

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

<a name="getAll"></a>
# **getAll**
> GroupsResponse getAll().execute();

Get-All-Groups

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
      GroupsResponse result = client
              .groups
              .getAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupsResponse> response = client
              .groups
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getAll");
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

[**GroupsResponse**](GroupsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getIconBinary"></a>
# **getIconBinary**
> getIconBinary(groupId).execute();

Get-Group-Icon-Binary

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String groupId = "groupId_example"; // 
    try {
      client
              .groups
              .getIconBinary(groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getIconBinary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .getIconBinary(groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getIconBinary");
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
| **groupId** | **String**|  | |

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

<a name="getInfo"></a>
# **getInfo**
> GroupResponse getInfo(groupId).execute();

Get-Group-Info

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String groupId = "groupId_example"; // 
    try {
      GroupResponse result = client
              .groups
              .getInfo(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupResponse> response = client
              .groups
              .getInfo(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getInfo");
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
| **groupId** | **String**|  | |

### Return type

[**GroupResponse**](GroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getInviteDetails"></a>
# **getInviteDetails**
> GroupInviteResponse getInviteDetails(groupId).execute();

Get-Group-Invite

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String groupId = "groupId_example"; // 
    try {
      GroupInviteResponse result = client
              .groups
              .getInviteDetails(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
      System.out.println(result.getGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getInviteDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupInviteResponse> response = client
              .groups
              .getInviteDetails(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getInviteDetails");
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
| **groupId** | **String**|  | |

### Return type

[**GroupInviteResponse**](GroupInviteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="leaveGroup"></a>
# **leaveGroup**
> leaveGroup(groupId).execute();

Leave-Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String groupId = "groupId_example"; // 
    try {
      client
              .groups
              .leaveGroup(groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#leaveGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .leaveGroup(groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#leaveGroup");
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
| **groupId** | **String**|  | |

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

<a name="promoteToAdmin"></a>
# **promoteToAdmin**
> promoteToAdmin(groupId, groupAdminRequestBody).execute();

Promote-To-Group-Admin

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    List<String> waIds = Arrays.asList(); // The WhatsApp IDs of the people to be added or removed as group admins
    String groupId = "groupId_example"; // 
    try {
      client
              .groups
              .promoteToAdmin(waIds, groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#promoteToAdmin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .promoteToAdmin(waIds, groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#promoteToAdmin");
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
| **groupId** | **String**|  | |
| **groupAdminRequestBody** | [**GroupAdminRequestBody**](GroupAdminRequestBody.md)|  | |

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

<a name="removeParticipant"></a>
# **removeParticipant**
> removeParticipant(groupId, removeGroupParticipantRequestBody).execute();

Remove-Group-Participant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    List<String> waIds = Arrays.asList(); // 
    String groupId = "groupId_example"; // 
    try {
      client
              .groups
              .removeParticipant(waIds, groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeParticipant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .removeParticipant(waIds, groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeParticipant");
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
| **groupId** | **String**|  | |
| **removeGroupParticipantRequestBody** | [**RemoveGroupParticipantRequestBody**](RemoveGroupParticipantRequestBody.md)|  | |

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

<a name="setGroupIcon"></a>
# **setGroupIcon**
> setGroupIcon(groupId, _file).groupsSetGroupIconRequest(groupsSetGroupIconRequest).execute();

Set-Group-Icon

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String groupId = "groupId_example"; // 
    File _file = new File("/path/to/file");
    try {
      client
              .groups
              .setGroupIcon(groupId, _file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#setGroupIcon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .setGroupIcon(groupId, _file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#setGroupIcon");
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
| **groupId** | **String**|  | |
| **_file** | **File**|  | |
| **groupsSetGroupIconRequest** | [**GroupsSetGroupIconRequest**](GroupsSetGroupIconRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateInfo"></a>
# **updateInfo**
> updateInfo(groupId, updateGroupInfoRequestBody).execute();

Update-Group-Info

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WhatsAppBusiness;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupsApi;
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
    String subject = "subject_example";
    String groupId = "groupId_example"; // 
    try {
      client
              .groups
              .updateInfo(subject, groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .groups
              .updateInfo(subject, groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateInfo");
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
| **groupId** | **String**|  | |
| **updateGroupInfoRequestBody** | [**UpdateGroupInfoRequestBody**](UpdateGroupInfoRequestBody.md)|  | |

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

