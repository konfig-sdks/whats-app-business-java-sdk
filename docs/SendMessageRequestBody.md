

# SendMessageRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audio** | **Object** |  |  [optional] |
|**contacts** | [**List&lt;Contact&gt;**](Contact.md) |  |  [optional] |
|**document** | **Object** |  |  [optional] |
|**hsm** | [**Hsm**](Hsm.md) |  |  [optional] |
|**image** | **Object** |  |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**previewUrl** | **Boolean** | Specifying preview_url in the request is optional when not including a URL in your message. To include a URL preview, set preview_url to true in the message body and make sure the URL begins with http:// or https://. For more information, see the Sending URLs in Text Messages section. |  [optional] |
|**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | Determines whether the recipient is an individual or a group Specifying recipient_type in the request is optional when the value is individual. However, recipient_type is required when using group. If sending a text message to a group, see the Sending Group Messages documentation. |  [optional] |
|**text** | [**Text**](Text.md) |  |  [optional] |
|**to** | **String** | When recipient_type is individual, this field is the WhatsApp ID (phone number) returned from contacts endpoint. When recipient_type is group, this field is the WhatsApp group ID. |  |
|**ttl** | **Object** |  |  [optional] |
|**type** | **MessageType** |  |  [optional] |
|**video** | **Object** |  |  [optional] |



## Enum: RecipientTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;individual&quot; |
| GROUP | &quot;group&quot; |



