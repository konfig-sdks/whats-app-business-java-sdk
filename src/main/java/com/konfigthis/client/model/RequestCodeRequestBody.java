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
 * RequestCodeRequestBody
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RequestCodeRequestBody {
  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private String cc;

  public static final String SERIALIZED_NAME_CERT = "cert";
  @SerializedName(SERIALIZED_NAME_CERT)
  private String cert;

  /**
   * Method of receiving your registration code
   */
  @JsonAdapter(MethodEnum.Adapter.class)
 public enum MethodEnum {
    SMS("sms"),
    
    VOICE("voice");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private String pin;

  public RequestCodeRequestBody() {
  }

  public RequestCodeRequestBody cc(String cc) {
    
    
    
    
    this.cc = cc;
    return this;
  }

   /**
   * Numerical country code for the phone number you are registering
   * @return cc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<Country Code>", required = true, value = "Numerical country code for the phone number you are registering")

  public String getCc() {
    return cc;
  }


  public void setCc(String cc) {
    
    
    
    this.cc = cc;
  }


  public RequestCodeRequestBody cert(String cert) {
    
    
    
    
    this.cert = cert;
    return this;
  }

   /**
   * Base64-encoded Verified Name certificate
   * @return cert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<Valid Cert from Business Manager>", required = true, value = "Base64-encoded Verified Name certificate")

  public String getCert() {
    return cert;
  }


  public void setCert(String cert) {
    
    
    
    this.cert = cert;
  }


  public RequestCodeRequestBody method(MethodEnum method) {
    
    
    
    
    this.method = method;
    return this;
  }

   /**
   * Method of receiving your registration code
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "< sms | voice >", required = true, value = "Method of receiving your registration code")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    
    
    
    this.method = method;
  }


  public RequestCodeRequestBody phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number you are registering, without the country code or plus symbol (+)
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<Phone Number>", required = true, value = "Phone number you are registering, without the country code or plus symbol (+)")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public RequestCodeRequestBody pin(String pin) {
    
    
    
    
    this.pin = pin;
    return this;
  }

   /**
   * Existing 6-digit PIN — This is only required when two-factor verification is enabled on this account.
   * @return pin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<Two-Step Verification PIN", value = "Existing 6-digit PIN — This is only required when two-factor verification is enabled on this account.")

  public String getPin() {
    return pin;
  }


  public void setPin(String pin) {
    
    
    
    this.pin = pin;
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
   * @return the RequestCodeRequestBody instance itself
   */
  public RequestCodeRequestBody putAdditionalProperty(String key, Object value) {
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
    RequestCodeRequestBody requestCodeRequestBody = (RequestCodeRequestBody) o;
    return Objects.equals(this.cc, requestCodeRequestBody.cc) &&
        Objects.equals(this.cert, requestCodeRequestBody.cert) &&
        Objects.equals(this.method, requestCodeRequestBody.method) &&
        Objects.equals(this.phoneNumber, requestCodeRequestBody.phoneNumber) &&
        Objects.equals(this.pin, requestCodeRequestBody.pin)&&
        Objects.equals(this.additionalProperties, requestCodeRequestBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cc, cert, method, phoneNumber, pin, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCodeRequestBody {\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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
    openapiFields.add("cert");
    openapiFields.add("method");
    openapiFields.add("phone_number");
    openapiFields.add("pin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cc");
    openapiRequiredFields.add("cert");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("phone_number");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestCodeRequestBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RequestCodeRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestCodeRequestBody is not found in the empty JSON string", RequestCodeRequestBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RequestCodeRequestBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cc").toString()));
      }
      if (!jsonObj.get("cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (!jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if ((jsonObj.get("pin") != null && !jsonObj.get("pin").isJsonNull()) && !jsonObj.get("pin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestCodeRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestCodeRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestCodeRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestCodeRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestCodeRequestBody>() {
           @Override
           public void write(JsonWriter out, RequestCodeRequestBody value) throws IOException {
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
           public RequestCodeRequestBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RequestCodeRequestBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RequestCodeRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestCodeRequestBody
  * @throws IOException if the JSON string is invalid with respect to RequestCodeRequestBody
  */
  public static RequestCodeRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestCodeRequestBody.class);
  }

 /**
  * Convert an instance of RequestCodeRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

