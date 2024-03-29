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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Contact;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.MessageContext;
import com.konfigthis.client.model.MessageType;
import com.konfigthis.client.model.WebhookAudio;
import com.konfigthis.client.model.WebhookDocument;
import com.konfigthis.client.model.WebhookImage;
import com.konfigthis.client.model.WebhookLocation;
import com.konfigthis.client.model.WebhookSystem;
import com.konfigthis.client.model.WebhookText;
import com.konfigthis.client.model.WebhookVideo;
import com.konfigthis.client.model.WebhookVoice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookMessage {
  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private WebhookAudio audio;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<Contact> contacts = null;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private MessageContext context;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private WebhookDocument document;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private WebhookImage image;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private WebhookLocation location;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private WebhookSystem system;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private WebhookText text;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private MessageType type = MessageType.TEXT;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private WebhookVideo video;

  public static final String SERIALIZED_NAME_VOICE = "voice";
  @SerializedName(SERIALIZED_NAME_VOICE)
  private WebhookVoice voice;

  public WebhookMessage() {
  }

  public WebhookMessage audio(WebhookAudio audio) {
    
    
    
    
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookAudio getAudio() {
    return audio;
  }


  public void setAudio(WebhookAudio audio) {
    
    
    
    this.audio = audio;
  }


  public WebhookMessage contacts(List<Contact> contacts) {
    
    
    
    
    this.contacts = contacts;
    return this;
  }

  public WebhookMessage addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Contact> getContacts() {
    return contacts;
  }


  public void setContacts(List<Contact> contacts) {
    
    
    
    this.contacts = contacts;
  }


  public WebhookMessage context(MessageContext context) {
    
    
    
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageContext getContext() {
    return context;
  }


  public void setContext(MessageContext context) {
    
    
    
    this.context = context;
  }


  public WebhookMessage document(WebhookDocument document) {
    
    
    
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookDocument getDocument() {
    return document;
  }


  public void setDocument(WebhookDocument document) {
    
    
    
    this.document = document;
  }


  public WebhookMessage errors(List<Error> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public WebhookMessage addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    
    
    
    this.errors = errors;
  }


  public WebhookMessage from(String from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * WhatsApp ID of the sender
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16315551234", value = "WhatsApp ID of the sender")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    
    
    
    this.from = from;
  }


  public WebhookMessage groupId(String groupId) {
    
    
    
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Optional. WhatsApp group ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. WhatsApp group ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    
    
    
    this.groupId = groupId;
  }


  public WebhookMessage id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Message ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABGGFlA5FpafAgo6tHcNmNjXmuSfX", value = "Message ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public WebhookMessage image(WebhookImage image) {
    
    
    
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookImage getImage() {
    return image;
  }


  public void setImage(WebhookImage image) {
    
    
    
    this.image = image;
  }


  public WebhookMessage location(WebhookLocation location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookLocation getLocation() {
    return location;
  }


  public void setLocation(WebhookLocation location) {
    
    
    
    this.location = location;
  }


  public WebhookMessage system(WebhookSystem system) {
    
    
    
    
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookSystem getSystem() {
    return system;
  }


  public void setSystem(WebhookSystem system) {
    
    
    
    this.system = system;
  }


  public WebhookMessage text(WebhookText text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookText getText() {
    return text;
  }


  public void setText(WebhookText text) {
    
    
    
    this.text = text;
  }


  public WebhookMessage timestamp(String timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Message received timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1518694235", value = "Message received timestamp")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    
    
    
    this.timestamp = timestamp;
  }


  public WebhookMessage type(MessageType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageType getType() {
    return type;
  }


  public void setType(MessageType type) {
    
    
    
    this.type = type;
  }


  public WebhookMessage video(WebhookVideo video) {
    
    
    
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookVideo getVideo() {
    return video;
  }


  public void setVideo(WebhookVideo video) {
    
    
    
    this.video = video;
  }


  public WebhookMessage voice(WebhookVoice voice) {
    
    
    
    
    this.voice = voice;
    return this;
  }

   /**
   * Get voice
   * @return voice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookVoice getVoice() {
    return voice;
  }


  public void setVoice(WebhookVoice voice) {
    
    
    
    this.voice = voice;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the WebhookMessage instance itself
   */
  public WebhookMessage putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookMessage webhookMessage = (WebhookMessage) o;
    return Objects.equals(this.audio, webhookMessage.audio) &&
        Objects.equals(this.contacts, webhookMessage.contacts) &&
        Objects.equals(this.context, webhookMessage.context) &&
        Objects.equals(this.document, webhookMessage.document) &&
        Objects.equals(this.errors, webhookMessage.errors) &&
        Objects.equals(this.from, webhookMessage.from) &&
        Objects.equals(this.groupId, webhookMessage.groupId) &&
        Objects.equals(this.id, webhookMessage.id) &&
        Objects.equals(this.image, webhookMessage.image) &&
        Objects.equals(this.location, webhookMessage.location) &&
        Objects.equals(this.system, webhookMessage.system) &&
        Objects.equals(this.text, webhookMessage.text) &&
        Objects.equals(this.timestamp, webhookMessage.timestamp) &&
        Objects.equals(this.type, webhookMessage.type) &&
        Objects.equals(this.video, webhookMessage.video) &&
        Objects.equals(this.voice, webhookMessage.voice)&&
        Objects.equals(this.additionalProperties, webhookMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, contacts, context, document, errors, from, groupId, id, image, location, system, text, timestamp, type, video, voice, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookMessage {\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("audio");
    openapiFields.add("contacts");
    openapiFields.add("context");
    openapiFields.add("document");
    openapiFields.add("errors");
    openapiFields.add("from");
    openapiFields.add("group_id");
    openapiFields.add("id");
    openapiFields.add("image");
    openapiFields.add("location");
    openapiFields.add("system");
    openapiFields.add("text");
    openapiFields.add("timestamp");
    openapiFields.add("type");
    openapiFields.add("video");
    openapiFields.add("voice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookMessage is not found in the empty JSON string", WebhookMessage.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `audio`
      if (jsonObj.get("audio") != null && !jsonObj.get("audio").isJsonNull()) {
        WebhookAudio.validateJsonObject(jsonObj.getAsJsonObject("audio"));
      }
      if (jsonObj.get("contacts") != null && !jsonObj.get("contacts").isJsonNull()) {
        JsonArray jsonArraycontacts = jsonObj.getAsJsonArray("contacts");
        if (jsonArraycontacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contacts` to be an array in the JSON string but got `%s`", jsonObj.get("contacts").toString()));
          }

          // validate the optional field `contacts` (array)
          for (int i = 0; i < jsonArraycontacts.size(); i++) {
            Contact.validateJsonObject(jsonArraycontacts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `context`
      if (jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) {
        MessageContext.validateJsonObject(jsonObj.getAsJsonObject("context"));
      }
      // validate the optional field `document`
      if (jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) {
        WebhookDocument.validateJsonObject(jsonObj.getAsJsonObject("document"));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            Error.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonNull()) && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        WebhookImage.validateJsonObject(jsonObj.getAsJsonObject("image"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        WebhookLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `system`
      if (jsonObj.get("system") != null && !jsonObj.get("system").isJsonNull()) {
        WebhookSystem.validateJsonObject(jsonObj.getAsJsonObject("system"));
      }
      // validate the optional field `text`
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) {
        WebhookText.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      // validate the optional field `video`
      if (jsonObj.get("video") != null && !jsonObj.get("video").isJsonNull()) {
        WebhookVideo.validateJsonObject(jsonObj.getAsJsonObject("video"));
      }
      // validate the optional field `voice`
      if (jsonObj.get("voice") != null && !jsonObj.get("voice").isJsonNull()) {
        WebhookVoice.validateJsonObject(jsonObj.getAsJsonObject("voice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookMessage>() {
           @Override
           public void write(JsonWriter out, WebhookMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookMessage instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookMessage
  * @throws IOException if the JSON string is invalid with respect to WebhookMessage
  */
  public static WebhookMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookMessage.class);
  }

 /**
  * Convert an instance of WebhookMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

