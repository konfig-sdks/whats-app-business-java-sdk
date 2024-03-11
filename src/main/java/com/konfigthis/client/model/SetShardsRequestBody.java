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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * SetShardsRequestBody
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SetShardsRequestBody {
  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private String cc;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private String pin;

  /**
   * Gets or Sets shards
   */
  @JsonAdapter(ShardsEnum.Adapter.class)
 public enum ShardsEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4),
    
    NUMBER_8(8),
    
    NUMBER_16(16),
    
    NUMBER_32(32);

    private Integer value;

    ShardsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShardsEnum fromValue(Integer value) {
      for (ShardsEnum b : ShardsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShardsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShardsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShardsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ShardsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHARDS = "shards";
  @SerializedName(SERIALIZED_NAME_SHARDS)
  private ShardsEnum shards;

  public SetShardsRequestBody() {
  }

  public SetShardsRequestBody cc(String cc) {
    
    
    
    
    this.cc = cc;
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<Country Code>", required = true, value = "")

  public String getCc() {
    return cc;
  }


  public void setCc(String cc) {
    
    
    
    this.cc = cc;
  }


  public SetShardsRequestBody phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<Phone Number>", required = true, value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public SetShardsRequestBody pin(String pin) {
    
    
    
    
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<Two-Step PIN>", required = true, value = "")

  public String getPin() {
    return pin;
  }


  public void setPin(String pin) {
    
    
    
    this.pin = pin;
  }


  public SetShardsRequestBody shards(ShardsEnum shards) {
    
    
    
    
    this.shards = shards;
    return this;
  }

   /**
   * Get shards
   * @return shards
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_32", required = true, value = "")

  public ShardsEnum getShards() {
    return shards;
  }


  public void setShards(ShardsEnum shards) {
    
    
    
    this.shards = shards;
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
   * @return the SetShardsRequestBody instance itself
   */
  public SetShardsRequestBody putAdditionalProperty(String key, Object value) {
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
    SetShardsRequestBody setShardsRequestBody = (SetShardsRequestBody) o;
    return Objects.equals(this.cc, setShardsRequestBody.cc) &&
        Objects.equals(this.phoneNumber, setShardsRequestBody.phoneNumber) &&
        Objects.equals(this.pin, setShardsRequestBody.pin) &&
        Objects.equals(this.shards, setShardsRequestBody.shards)&&
        Objects.equals(this.additionalProperties, setShardsRequestBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cc, phoneNumber, pin, shards, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetShardsRequestBody {\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
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
    openapiFields.add("cc");
    openapiFields.add("phone_number");
    openapiFields.add("pin");
    openapiFields.add("shards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cc");
    openapiRequiredFields.add("phone_number");
    openapiRequiredFields.add("pin");
    openapiRequiredFields.add("shards");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetShardsRequestBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SetShardsRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetShardsRequestBody is not found in the empty JSON string", SetShardsRequestBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetShardsRequestBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cc").toString()));
      }
      if (!jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if (!jsonObj.get("pin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetShardsRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetShardsRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetShardsRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetShardsRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SetShardsRequestBody>() {
           @Override
           public void write(JsonWriter out, SetShardsRequestBody value) throws IOException {
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
           public SetShardsRequestBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SetShardsRequestBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SetShardsRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetShardsRequestBody
  * @throws IOException if the JSON string is invalid with respect to SetShardsRequestBody
  */
  public static SetShardsRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetShardsRequestBody.class);
  }

 /**
  * Convert an instance of SetShardsRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

