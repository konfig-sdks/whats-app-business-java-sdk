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
 * Date/time by component
 */
@ApiModel(description = "Date/time by component")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DateTimeComponent {
  public static final String SERIALIZED_NAME_DAY_OF_MONTH = "day_of_month";
  @SerializedName(SERIALIZED_NAME_DAY_OF_MONTH)
  private Integer dayOfMonth;

  /**
   * Both strings and numbers are accepted. If different from the value derived from the date (if specified), use the derived value.
   */
  @JsonAdapter(DayOfWeekEnum.Adapter.class)
 public enum DayOfWeekEnum {
    /**
     * Monday
     */
    MONDAY(1),
    
    /**
     * Tuesday
     */
    TUESDAY(2),
    
    /**
     * Wednesday
     */
    WEDNESDAY(3),
    
    /**
     * Thursday
     */
    THURSDAY(4),
    
    /**
     * Friday
     */
    FRIDAY(5),
    
    /**
     * Saturday
     */
    SATURDAY(6),
    
    /**
     * Sunday
     */
    SUNDAY(7);

    private Integer value;

    DayOfWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayOfWeekEnum fromValue(Integer value) {
      for (DayOfWeekEnum b : DayOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DayOfWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DAY_OF_WEEK = "day_of_week";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
  private DayOfWeekEnum dayOfWeek;

  public static final String SERIALIZED_NAME_HOUR = "hour";
  @SerializedName(SERIALIZED_NAME_HOUR)
  private Integer hour;

  public static final String SERIALIZED_NAME_MINUTE = "minute";
  @SerializedName(SERIALIZED_NAME_MINUTE)
  private Integer minute;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public DateTimeComponent() {
  }

  public DateTimeComponent dayOfMonth(Integer dayOfMonth) {
    
    
    
    
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * The day of month
   * @return dayOfMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "The day of month")

  public Integer getDayOfMonth() {
    return dayOfMonth;
  }


  public void setDayOfMonth(Integer dayOfMonth) {
    
    
    
    this.dayOfMonth = dayOfMonth;
  }


  public DateTimeComponent dayOfWeek(DayOfWeekEnum dayOfWeek) {
    
    
    
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Both strings and numbers are accepted. If different from the value derived from the date (if specified), use the derived value.
   * @return dayOfWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_5", value = "Both strings and numbers are accepted. If different from the value derived from the date (if specified), use the derived value.")

  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }


  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    
    
    
    this.dayOfWeek = dayOfWeek;
  }


  public DateTimeComponent hour(Integer hour) {
    
    
    
    
    this.hour = hour;
    return this;
  }

   /**
   * The hour
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "The hour")

  public Integer getHour() {
    return hour;
  }


  public void setHour(Integer hour) {
    
    
    
    this.hour = hour;
  }


  public DateTimeComponent minute(Integer minute) {
    
    
    
    
    this.minute = minute;
    return this;
  }

   /**
   * The minute
   * @return minute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "33", value = "The minute")

  public Integer getMinute() {
    return minute;
  }


  public void setMinute(Integer minute) {
    
    
    
    this.minute = minute;
  }


  public DateTimeComponent month(Integer month) {
    
    
    
    
    this.month = month;
    return this;
  }

   /**
   * The month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The month")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    
    
    
    this.month = month;
  }


  public DateTimeComponent year(Integer year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * The year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1977", value = "The year")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    
    
    
    this.year = year;
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
   * @return the DateTimeComponent instance itself
   */
  public DateTimeComponent putAdditionalProperty(String key, Object value) {
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
    DateTimeComponent dateTimeComponent = (DateTimeComponent) o;
    return Objects.equals(this.dayOfMonth, dateTimeComponent.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, dateTimeComponent.dayOfWeek) &&
        Objects.equals(this.hour, dateTimeComponent.hour) &&
        Objects.equals(this.minute, dateTimeComponent.minute) &&
        Objects.equals(this.month, dateTimeComponent.month) &&
        Objects.equals(this.year, dateTimeComponent.year)&&
        Objects.equals(this.additionalProperties, dateTimeComponent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfMonth, dayOfWeek, hour, minute, month, year, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeComponent {\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("day_of_month");
    openapiFields.add("day_of_week");
    openapiFields.add("hour");
    openapiFields.add("minute");
    openapiFields.add("month");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DateTimeComponent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DateTimeComponent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DateTimeComponent is not found in the empty JSON string", DateTimeComponent.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DateTimeComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DateTimeComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DateTimeComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DateTimeComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<DateTimeComponent>() {
           @Override
           public void write(JsonWriter out, DateTimeComponent value) throws IOException {
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
           public DateTimeComponent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DateTimeComponent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DateTimeComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DateTimeComponent
  * @throws IOException if the JSON string is invalid with respect to DateTimeComponent
  */
  public static DateTimeComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DateTimeComponent.class);
  }

 /**
  * Convert an instance of DateTimeComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
