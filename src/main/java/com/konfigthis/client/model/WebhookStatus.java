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
import com.konfigthis.client.model.Error;
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
public class WebhookStatus {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  /**
   * Status of message
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    /**
     * Message received by WhatsApp server (One checkmark in WhatsApp Mobile)
     */
    SENT("sent"),
    
    /**
     * Message delivered to recipient (Two checkmarks in WhatsApp Mobile)
     */
    DELIVERED("delivered"),
    
    /**
     * Message read by recipient (Two blue checkmarks in WhatsApp Mobile)
     */
    READ("read"),
    
    /**
     * Message failed to send (Red error triangle in WhatsApp Mobile)
     */
    FAILED("failed"),
    
    /**
     * Message deleted by the user
     */
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public WebhookStatus() {
  }

  public WebhookStatus errors(List<Error> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public WebhookStatus addErrorsItem(Error errorsItem) {
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


  public WebhookStatus id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Message ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gBGGEgZHMlEfAgkM1RBkhDRr7t8", value = "Message ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public WebhookStatus recipientId(String recipientId) {
    
    
    
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * WhatsApp ID of recipient
   * @return recipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12064001000", value = "WhatsApp ID of recipient")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    
    
    
    this.recipientId = recipientId;
  }


  public WebhookStatus status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of message
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FAILED", value = "Status of message")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public WebhookStatus timestamp(String timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of the status message
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1533332775", value = "Timestamp of the status message")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    
    
    
    this.timestamp = timestamp;
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
   * @return the WebhookStatus instance itself
   */
  public WebhookStatus putAdditionalProperty(String key, Object value) {
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
    WebhookStatus webhookStatus = (WebhookStatus) o;
    return Objects.equals(this.errors, webhookStatus.errors) &&
        Objects.equals(this.id, webhookStatus.id) &&
        Objects.equals(this.recipientId, webhookStatus.recipientId) &&
        Objects.equals(this.status, webhookStatus.status) &&
        Objects.equals(this.timestamp, webhookStatus.timestamp)&&
        Objects.equals(this.additionalProperties, webhookStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, id, recipientId, status, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookStatus {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("id");
    openapiFields.add("recipient_id");
    openapiFields.add("status");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookStatus is not found in the empty JSON string", WebhookStatus.openapiRequiredFields.toString()));
        }
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
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("recipient_id") != null && !jsonObj.get("recipient_id").isJsonNull()) && !jsonObj.get("recipient_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookStatus>() {
           @Override
           public void write(JsonWriter out, WebhookStatus value) throws IOException {
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
           public WebhookStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookStatus
  * @throws IOException if the JSON string is invalid with respect to WebhookStatus
  */
  public static WebhookStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookStatus.class);
  }

 /**
  * Convert an instance of WebhookStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
