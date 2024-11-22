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

/**
  * Model for testing model name same as property name
  */

public class Name  {
  
  @JsonbProperty("name")
  private Integer name;

  @JsonbProperty("snake_case")
  private Integer snakeCase;

  @JsonbProperty("property")
  private String property;

  @JsonbProperty("123Number")
  private Integer _123number;

  public Name() {
  }

 @JsonbCreator
  public Name(
    @JsonbProperty(value = "snake_case", nillable = true) Integer snakeCase, 
    @JsonbProperty(value = "123Number", nillable = true) Integer _123number
  ) {
    this.snakeCase = snakeCase;
    this._123number = _123number;
  }
  
  /**
   * Get name
   * @return name
   **/
  public Integer getName() {
    return name;
  }

  /**
   * Set name
   */
  public void setName(Integer name) {
    this.name = name;
  }

  public Name name(Integer name) {
    this.name = name;
    return this;
  }

  /**
   * Get snakeCase
   * @return snakeCase
   **/
  public Integer getSnakeCase() {
    return snakeCase;
  }


  /**
   * Get property
   * @return property
   **/
  public String getProperty() {
    return property;
  }

  /**
   * Set property
   */
  public void setProperty(String property) {
    this.property = property;
  }

  public Name property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Get _123number
   * @return _123number
   **/
  public Integer get123number() {
    return _123number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123number, name._123number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123number);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123number: ").append(toIndentedString(_123number)).append("\n");
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

