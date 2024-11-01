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

import java.util.Objects;
import java.util.Arrays;
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

@XmlType(name = "Tag", propOrder =
    { "id", "name" }
)


@XmlRootElement(name = "Tag")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "Tag")
@JsonPropertyOrder({
  Tag.JSON_PROPERTY_ID,
  Tag.JSON_PROPERTY_NAME
})
/**
  * A tag for a pet
  */

public class Tag  {
  
  public static final String JSON_PROPERTY_ID = "id";
  @XmlElement(name = "id")
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  @XmlElement(name = "name")
  private String name;

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "id")
  public Long getId() {
    return id;
  }

  /**
   * Set id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "id")
  public void setId(Long id) {
    this.id = id;
  }

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "name")
  public String getName() {
    return name;
  }

  /**
   * Set name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "name")
  public void setName(String name) {
    this.name = name;
  }

  public Tag name(String name) {
    this.name = name;
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
    Tag tag = (Tag) o;
    return Objects.equals(this.id, tag.id) &&
        Objects.equals(this.name, tag.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

