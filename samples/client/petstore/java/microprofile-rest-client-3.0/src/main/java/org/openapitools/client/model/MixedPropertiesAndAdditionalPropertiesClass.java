/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.client.model.Animal;
import java.lang.reflect.Type;
import jakarta.json.bind.annotation.JsonbTypeDeserializer;
import jakarta.json.bind.annotation.JsonbTypeSerializer;
import jakarta.json.bind.serializer.DeserializationContext;
import jakarta.json.bind.serializer.JsonbDeserializer;
import jakarta.json.bind.serializer.JsonbSerializer;
import jakarta.json.bind.serializer.SerializationContext;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeInfo;


public class MixedPropertiesAndAdditionalPropertiesClass  {
  
  @JsonbProperty("uuid")
  private UUID uuid;

  @JsonbProperty("dateTime")
  private Date dateTime;

  @JsonbProperty("map")
  private Map<String, Animal> map = null;

  /**
   * Get uuid
   * @return uuid
   **/
  public UUID getUuid() {
    return uuid;
  }

  /**
   * Set uuid
   */
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public MixedPropertiesAndAdditionalPropertiesClass uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
   **/
  public Date getDateTime() {
    return dateTime;
  }

  /**
   * Set dateTime
   */
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  public MixedPropertiesAndAdditionalPropertiesClass dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get map
   * @return map
   **/
  public Map<String, Animal> getMap() {
    return map;
  }

  /**
   * Set map
   */
  public void setMap(Map<String, Animal> map) {
    this.map = map;
  }

  public MixedPropertiesAndAdditionalPropertiesClass map(Map<String, Animal> map) {
    this.map = map;
    return this;
  }

  public MixedPropertiesAndAdditionalPropertiesClass putMapItem(String key, Animal mapItem) {
    if (this.map == null) {
      this.map = new HashMap<>();
    }
    this.map.put(key, mapItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixedPropertiesAndAdditionalPropertiesClass mixedPropertiesAndAdditionalPropertiesClass = (MixedPropertiesAndAdditionalPropertiesClass) o;
    return Objects.equals(this.uuid, mixedPropertiesAndAdditionalPropertiesClass.uuid) &&
        Objects.equals(this.dateTime, mixedPropertiesAndAdditionalPropertiesClass.dateTime) &&
        Objects.equals(this.map, mixedPropertiesAndAdditionalPropertiesClass.map);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, dateTime, map);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

