/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.*;

@XmlType(name = "ModelApiResponse", propOrder =
    { "code", "type", "message" }
)


@XmlRootElement(name = "ModelApiResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "ModelApiResponse")
@JsonPropertyOrder({
  ModelApiResponse.JSON_PROPERTY_CODE,
  ModelApiResponse.JSON_PROPERTY_TYPE,
  ModelApiResponse.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("ApiResponse")
/**
  * Describes the result of uploading an image resource
  */

public class ModelApiResponse  {
  
  public static final String JSON_PROPERTY_CODE = "code";
  @XmlElement(name = "code")
  private Integer code;

  public static final String JSON_PROPERTY_TYPE = "type";
  @XmlElement(name = "type")
  private String type;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @XmlElement(name = "message")
  private String message;

  /**
   * Get code
   * @return code
   **/
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "code")
  public Integer getCode() {
    return code;
  }

  /**
   * Set code
   */
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "code")
  public void setCode(Integer code) {
    this.code = code;
  }

  public ModelApiResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "type")
  public String getType() {
    return type;
  }

  /**
   * Set type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "type")
  public void setType(String type) {
    this.type = type;
  }

  public ModelApiResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "message")
  public String getMessage() {
    return message;
  }

  /**
   * Set message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "message")
  public void setMessage(String message) {
    this.message = message;
  }

  public ModelApiResponse message(String message) {
    this.message = message;
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
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.code, _apiResponse.code) &&
        Objects.equals(this.type, _apiResponse.type) &&
        Objects.equals(this.message, _apiResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, message);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

