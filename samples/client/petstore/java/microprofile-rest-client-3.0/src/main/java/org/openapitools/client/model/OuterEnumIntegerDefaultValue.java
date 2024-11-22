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
 * Gets or Sets OuterEnumIntegerDefaultValue
 */
@JsonbTypeSerializer(OuterEnumIntegerDefaultValue.Serializer.class)
@JsonbTypeDeserializer(OuterEnumIntegerDefaultValue.Deserializer.class)
public enum OuterEnumIntegerDefaultValue {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  OuterEnumIntegerDefaultValue(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static final class Deserializer implements JsonbDeserializer<OuterEnumIntegerDefaultValue> {
    @Override
    public OuterEnumIntegerDefaultValue deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
      return fromValue(parser.getString());
    }
  }

  public static final class Serializer implements JsonbSerializer<OuterEnumIntegerDefaultValue> {
    @Override
    public void serialize(OuterEnumIntegerDefaultValue obj, JsonGenerator generator, SerializationContext ctx) {
      generator.write(obj.value);
    }
  }

  public static OuterEnumIntegerDefaultValue fromValue(String text) {
    for (OuterEnumIntegerDefaultValue b : OuterEnumIntegerDefaultValue.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

