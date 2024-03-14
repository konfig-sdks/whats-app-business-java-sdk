<div align="center">

[![Visit Whatsapp](./header.png)](https://developers.facebook.com&#x2F;docs&#x2F;whatsapp)

# [Whatsapp](https://developers.facebook.com&#x2F;docs&#x2F;whatsapp)

See https://developers.facebook.com/docs/whatsapp

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=WhatsApp&%20serviceName=Business%20&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>whats-app-business-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:whats-app-business-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/whats-app-business-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://whatsapp.local*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**getSettings**](docs/ApplicationApi.md#getSettings) | **GET** /settings/application | Get-Application-Settings
*ApplicationApi* | [**listMediaProviders**](docs/ApplicationApi.md#listMediaProviders) | **GET** /settings/application/media/providers | Get-Media-Providers
*ApplicationApi* | [**removeProvider**](docs/ApplicationApi.md#removeProvider) | **DELETE** /settings/application/media/providers/{ProviderName} | Delete-Media-Providers
*ApplicationApi* | [**resetSettings**](docs/ApplicationApi.md#resetSettings) | **DELETE** /settings/application | Reset-Application-Settings
*ApplicationApi* | [**setShards**](docs/ApplicationApi.md#setShards) | **POST** /account/shards | Set-Shards
*ApplicationApi* | [**updateMediaProviders**](docs/ApplicationApi.md#updateMediaProviders) | **POST** /settings/application/media/providers | Update-Media-Providers
*ApplicationApi* | [**updateSettings**](docs/ApplicationApi.md#updateSettings) | **PATCH** /settings/application | Update-Application-Settings
*BackupRestoreApi* | [**settingsPost**](docs/BackupRestoreApi.md#settingsPost) | **POST** /settings/backup | Backup-Settings
*BackupRestoreApi* | [**settingsPost_0**](docs/BackupRestoreApi.md#settingsPost_0) | **POST** /settings/restore | Restore-Settings
*BusinessProfileApi* | [**get**](docs/BusinessProfileApi.md#get) | **GET** /settings/business/profile | Get-Business-Profile
*BusinessProfileApi* | [**update**](docs/BusinessProfileApi.md#update) | **POST** /settings/business/profile | Update-Business-Profile
*CertificatesApi* | [**deleteWebhookCa**](docs/CertificatesApi.md#deleteWebhookCa) | **DELETE** /certificates/webhooks/ca | Delete Webhook CA Certificate
*CertificatesApi* | [**downloadCaCertificate**](docs/CertificatesApi.md#downloadCaCertificate) | **GET** /certificates/external/ca | Download-CA-Certificate
*CertificatesApi* | [**downloadWebhookCaCertificate**](docs/CertificatesApi.md#downloadWebhookCaCertificate) | **GET** /certificates/webhooks/ca | Download Webhook CA Certificate
*CertificatesApi* | [**uploadExternalCertificate**](docs/CertificatesApi.md#uploadExternalCertificate) | **POST** /certificates/external | Upload-Certificate
*CertificatesApi* | [**uploadWebhookCaCertificate**](docs/CertificatesApi.md#uploadWebhookCaCertificate) | **POST** /certificates/webhooks/ca | Upload Webhook CA Certificate
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /contacts | Check-Contact
*GroupsApi* | [**createGroup**](docs/GroupsApi.md#createGroup) | **POST** /groups | Create-Group
*GroupsApi* | [**deleteGroupIcon**](docs/GroupsApi.md#deleteGroupIcon) | **DELETE** /groups/{GroupId}/icon | Delete-Group-Icon
*GroupsApi* | [**deleteInvite**](docs/GroupsApi.md#deleteInvite) | **DELETE** /groups/{GroupId}/invite | Delete-Group-Invite
*GroupsApi* | [**demoteAdmin**](docs/GroupsApi.md#demoteAdmin) | **DELETE** /groups/{GroupId}/admins | Demote-Group-Admin
*GroupsApi* | [**getAll**](docs/GroupsApi.md#getAll) | **GET** /groups | Get-All-Groups
*GroupsApi* | [**getIconBinary**](docs/GroupsApi.md#getIconBinary) | **GET** /groups/{GroupId}/icon | Get-Group-Icon-Binary
*GroupsApi* | [**getInfo**](docs/GroupsApi.md#getInfo) | **GET** /groups/{GroupId} | Get-Group-Info
*GroupsApi* | [**getInviteDetails**](docs/GroupsApi.md#getInviteDetails) | **GET** /groups/{GroupId}/invite | Get-Group-Invite
*GroupsApi* | [**leaveGroup**](docs/GroupsApi.md#leaveGroup) | **POST** /groups/{GroupId}/leave | Leave-Group
*GroupsApi* | [**promoteToAdmin**](docs/GroupsApi.md#promoteToAdmin) | **PATCH** /groups/{GroupId}/admins | Promote-To-Group-Admin
*GroupsApi* | [**removeParticipant**](docs/GroupsApi.md#removeParticipant) | **DELETE** /groups/{GroupId}/participants | Remove-Group-Participant
*GroupsApi* | [**setGroupIcon**](docs/GroupsApi.md#setGroupIcon) | **POST** /groups/{GroupId}/icon | Set-Group-Icon
*GroupsApi* | [**updateInfo**](docs/GroupsApi.md#updateInfo) | **PUT** /groups/{GroupId} | Update-Group-Info
*HealthApi* | [**checkStatus**](docs/HealthApi.md#checkStatus) | **GET** /health | Check-Health
*HealthApi* | [**getAppStats**](docs/HealthApi.md#getAppStats) | **GET** /stats/app | Get-App-Stats
*HealthApi* | [**getDbStats**](docs/HealthApi.md#getDbStats) | **GET** /stats/db | Get-DB-Stats
*HealthApi* | [**getMetricsData**](docs/HealthApi.md#getMetricsData) | **GET** /metrics | Get-Metrics (since v2.21.3)
*HealthApi* | [**getSupportInfo**](docs/HealthApi.md#getSupportInfo) | **GET** /support | Get-Support-Info
*MediaApi* | [**download**](docs/MediaApi.md#download) | **GET** /media/{MediaId} | Download-Media
*MediaApi* | [**removeMedia**](docs/MediaApi.md#removeMedia) | **DELETE** /media/{MediaId} | Delete-Media
*MediaApi* | [**uploadMedia**](docs/MediaApi.md#uploadMedia) | **POST** /media | Upload-Media
*MessagesApi* | [**markAsRead**](docs/MessagesApi.md#markAsRead) | **PUT** /messages/{MessageID} | Mark-Message-As-Read
*MessagesApi* | [**sendMessage**](docs/MessagesApi.md#sendMessage) | **POST** /messages | Send-Message
*ProfileApi* | [**getAbout**](docs/ProfileApi.md#getAbout) | **GET** /settings/profile/about | Get-Profile-About
*ProfileApi* | [**getPhoto**](docs/ProfileApi.md#getPhoto) | **GET** /settings/profile/photo | Get-Profile-Photo
*ProfileApi* | [**removePhoto**](docs/ProfileApi.md#removePhoto) | **DELETE** /settings/profile/photo | Delete-Profile-Photo
*ProfileApi* | [**updateAbout**](docs/ProfileApi.md#updateAbout) | **PATCH** /settings/profile/about | Update-Profile-About
*ProfileApi* | [**updatePhoto**](docs/ProfileApi.md#updatePhoto) | **POST** /settings/profile/photo | Update-Profile-Photo
*RegistrationApi* | [**requestCode**](docs/RegistrationApi.md#requestCode) | **POST** /account | Request-Code
*RegistrationApi* | [**verifyAccount**](docs/RegistrationApi.md#verifyAccount) | **POST** /account/verify | Register-Account
*TwoStepVerificationApi* | [**disable**](docs/TwoStepVerificationApi.md#disable) | **DELETE** /settings/account/two-step | Disable-Two-Step
*TwoStepVerificationApi* | [**enableAccount**](docs/TwoStepVerificationApi.md#enableAccount) | **POST** /settings/account/two-step | Enable-Two-Step
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /users | Create-User
*UsersApi* | [**getByUsername**](docs/UsersApi.md#getByUsername) | **GET** /users/{UserUsername} | Get-User
*UsersApi* | [**performLogin**](docs/UsersApi.md#performLogin) | **POST** /users/login | Login-User
*UsersApi* | [**performLogout**](docs/UsersApi.md#performLogout) | **POST** /users/logout | Logout-User
*UsersApi* | [**removeUser**](docs/UsersApi.md#removeUser) | **DELETE** /users/{UserUsername} | Delete-User
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /users/{UserUsername} | Update-User


## Documentation for Models

 - [Address](docs/Address.md)
 - [ApplicationSettings](docs/ApplicationSettings.md)
 - [AudioById](docs/AudioById.md)
 - [AudioByProvider](docs/AudioByProvider.md)
 - [BackupSettings](docs/BackupSettings.md)
 - [BackupSettingsRequestBody](docs/BackupSettingsRequestBody.md)
 - [BackupSettingsResponse](docs/BackupSettingsResponse.md)
 - [Basic](docs/Basic.md)
 - [BusinessProfile](docs/BusinessProfile.md)
 - [BusinessSettings](docs/BusinessSettings.md)
 - [BusinessSettingsBusiness](docs/BusinessSettingsBusiness.md)
 - [CheckContact](docs/CheckContact.md)
 - [CheckContactRequestBody](docs/CheckContactRequestBody.md)
 - [CheckContactResponse](docs/CheckContactResponse.md)
 - [CheckContactResponseAllOf](docs/CheckContactResponseAllOf.md)
 - [CheckHealthResponse](docs/CheckHealthResponse.md)
 - [ConfigBasic](docs/ConfigBasic.md)
 - [ConfigBearer](docs/ConfigBearer.md)
 - [Contact](docs/Contact.md)
 - [CreateGroupRequestBody](docs/CreateGroupRequestBody.md)
 - [CreateUserRequestBody](docs/CreateUserRequestBody.md)
 - [Currency](docs/Currency.md)
 - [DateTimeComponent](docs/DateTimeComponent.md)
 - [DateTimeObject](docs/DateTimeObject.md)
 - [DateTimeUnixEpoch](docs/DateTimeUnixEpoch.md)
 - [DetailedUserResponse](docs/DetailedUserResponse.md)
 - [DetailedUserResponseAllOf](docs/DetailedUserResponseAllOf.md)
 - [DetailedUserResponseItem](docs/DetailedUserResponseItem.md)
 - [DocumentById](docs/DocumentById.md)
 - [DocumentByProvider](docs/DocumentByProvider.md)
 - [Email](docs/Email.md)
 - [EnableTwoStepRequestBody](docs/EnableTwoStepRequestBody.md)
 - [Error](docs/Error.md)
 - [GatewayNodeStatus](docs/GatewayNodeStatus.md)
 - [GatewayStatus](docs/GatewayStatus.md)
 - [GetBusinessProfileResponse](docs/GetBusinessProfileResponse.md)
 - [GetBusinessProfileResponseAllOf](docs/GetBusinessProfileResponseAllOf.md)
 - [GetMediaProvidersResponse](docs/GetMediaProvidersResponse.md)
 - [GetMediaProvidersResponseAllOf](docs/GetMediaProvidersResponseAllOf.md)
 - [GetProfileAboutResponse](docs/GetProfileAboutResponse.md)
 - [GetProfilePhotoResponse](docs/GetProfilePhotoResponse.md)
 - [Group](docs/Group.md)
 - [GroupAdminRequestBody](docs/GroupAdminRequestBody.md)
 - [GroupInfo](docs/GroupInfo.md)
 - [GroupInvite](docs/GroupInvite.md)
 - [GroupInviteResponse](docs/GroupInviteResponse.md)
 - [GroupInviteResponseAllOf](docs/GroupInviteResponseAllOf.md)
 - [GroupResponse](docs/GroupResponse.md)
 - [GroupResponseAllOf](docs/GroupResponseAllOf.md)
 - [GroupsDeleteGroupIconRequest](docs/GroupsDeleteGroupIconRequest.md)
 - [GroupsResponse](docs/GroupsResponse.md)
 - [GroupsResponseAllOf](docs/GroupsResponseAllOf.md)
 - [GroupsSetGroupIconRequest](docs/GroupsSetGroupIconRequest.md)
 - [Hsm](docs/Hsm.md)
 - [ImageById](docs/ImageById.md)
 - [ImageByProvider](docs/ImageByProvider.md)
 - [Language](docs/Language.md)
 - [LocalizableParam](docs/LocalizableParam.md)
 - [Location](docs/Location.md)
 - [LoginAdminRequestBody](docs/LoginAdminRequestBody.md)
 - [MarkMessageAsReadRequestBody](docs/MarkMessageAsReadRequestBody.md)
 - [Media](docs/Media.md)
 - [MediaProvider](docs/MediaProvider.md)
 - [MediaProviderSettings](docs/MediaProviderSettings.md)
 - [MediaProviderSettingsApplication](docs/MediaProviderSettingsApplication.md)
 - [MediaProviderSettingsApplicationMedia](docs/MediaProviderSettingsApplicationMedia.md)
 - [Message](docs/Message.md)
 - [MessageContext](docs/MessageContext.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [MessageResponseAllOf](docs/MessageResponseAllOf.md)
 - [MessageType](docs/MessageType.md)
 - [Meta](docs/Meta.md)
 - [Name](docs/Name.md)
 - [Org](docs/Org.md)
 - [Phone](docs/Phone.md)
 - [ProfileAbout](docs/ProfileAbout.md)
 - [ProfileAboutSettings](docs/ProfileAboutSettings.md)
 - [ProfileAboutSettingsProfile](docs/ProfileAboutSettingsProfile.md)
 - [ProfilePhotoSettings](docs/ProfilePhotoSettings.md)
 - [ProfilePhotoSettingsProfile](docs/ProfilePhotoSettingsProfile.md)
 - [ProfilePhotoSettingsProfilePhoto](docs/ProfilePhotoSettingsProfilePhoto.md)
 - [ProfileUpdatePhotoRequest](docs/ProfileUpdatePhotoRequest.md)
 - [Provider](docs/Provider.md)
 - [RegisterAccountRequestBody](docs/RegisterAccountRequestBody.md)
 - [RemoveGroupParticipantRequestBody](docs/RemoveGroupParticipantRequestBody.md)
 - [RequestCodeAccount](docs/RequestCodeAccount.md)
 - [RequestCodeRequestBody](docs/RequestCodeRequestBody.md)
 - [RequestCodeResponse](docs/RequestCodeResponse.md)
 - [Response](docs/Response.md)
 - [RestoreSettingsRequestBody](docs/RestoreSettingsRequestBody.md)
 - [SendMessageRequestBody](docs/SendMessageRequestBody.md)
 - [SetShardsRequestBody](docs/SetShardsRequestBody.md)
 - [Text](docs/Text.md)
 - [UpdateGroupInfoRequestBody](docs/UpdateGroupInfoRequestBody.md)
 - [UpdateUserRequestBody](docs/UpdateUserRequestBody.md)
 - [UploadMedia](docs/UploadMedia.md)
 - [UploadMediaResponse](docs/UploadMediaResponse.md)
 - [UploadMediaResponseAllOf](docs/UploadMediaResponseAllOf.md)
 - [Url](docs/Url.md)
 - [UserLoginResponse](docs/UserLoginResponse.md)
 - [UserLoginResponseAllOf](docs/UserLoginResponseAllOf.md)
 - [UserLoginResponseItem](docs/UserLoginResponseItem.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserResponseAllOf](docs/UserResponseAllOf.md)
 - [UserResponseItem](docs/UserResponseItem.md)
 - [UserRole](docs/UserRole.md)
 - [VideoById](docs/VideoById.md)
 - [VideoByProvider](docs/VideoByProvider.md)
 - [WebhookAudio](docs/WebhookAudio.md)
 - [WebhookContact](docs/WebhookContact.md)
 - [WebhookContactProfile](docs/WebhookContactProfile.md)
 - [WebhookDocument](docs/WebhookDocument.md)
 - [WebhookEvent](docs/WebhookEvent.md)
 - [WebhookImage](docs/WebhookImage.md)
 - [WebhookLocation](docs/WebhookLocation.md)
 - [WebhookMessage](docs/WebhookMessage.md)
 - [WebhookStatus](docs/WebhookStatus.md)
 - [WebhookSystem](docs/WebhookSystem.md)
 - [WebhookText](docs/WebhookText.md)
 - [WebhookVideo](docs/WebhookVideo.md)
 - [WebhookVoice](docs/WebhookVoice.md)
 - [Webhooks](docs/Webhooks.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
