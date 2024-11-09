/*
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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * OuterComposite
 */
@JsonPropertyOrder({
  OuterComposite.JSON_PROPERTY_MY_NUMBER,
  OuterComposite.JSON_PROPERTY_MY_STRING,
  OuterComposite.JSON_PROPERTY_MY_BOOLEAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
public class OuterComposite {
  public static final String JSON_PROPERTY_MY_NUMBER = "my_number";
  @javax.annotation.Nullable
  private BigDecimal myNumber;

  public static final String JSON_PROPERTY_MY_STRING = "my_string";
  @javax.annotation.Nullable
  private String myString;

  public static final String JSON_PROPERTY_MY_BOOLEAN = "my_boolean";
  @javax.annotation.Nullable
  private Boolean myBoolean;

  public OuterComposite() { 
  }

  public OuterComposite myNumber(@javax.annotation.Nullable BigDecimal myNumber) {
    this.myNumber = myNumber;
    return this;
  }

  /**
   * Get myNumber
   * @return myNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getMyNumber() {
    return myNumber;
  }


  @JsonProperty(JSON_PROPERTY_MY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyNumber(@javax.annotation.Nullable BigDecimal myNumber) {
    this.myNumber = myNumber;
  }


  public OuterComposite myString(@javax.annotation.Nullable String myString) {
    this.myString = myString;
    return this;
  }

  /**
   * Get myString
   * @return myString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMyString() {
    return myString;
  }


  @JsonProperty(JSON_PROPERTY_MY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyString(@javax.annotation.Nullable String myString) {
    this.myString = myString;
  }


  public OuterComposite myBoolean(@javax.annotation.Nullable Boolean myBoolean) {
    this.myBoolean = myBoolean;
    return this;
  }

  /**
   * Get myBoolean
   * @return myBoolean
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMyBoolean() {
    return myBoolean;
  }


  @JsonProperty(JSON_PROPERTY_MY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyBoolean(@javax.annotation.Nullable Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }


  /**
   * Return true if this OuterComposite object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `my_number` to the URL query string
    if (getMyNumber() != null) {
      joiner.add(String.format("%smy_number%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMyNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `my_string` to the URL query string
    if (getMyString() != null) {
      joiner.add(String.format("%smy_string%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMyString()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `my_boolean` to the URL query string
    if (getMyBoolean() != null) {
      joiner.add(String.format("%smy_boolean%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMyBoolean()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }

    public static class Builder {

    private OuterComposite instance;

    public Builder() {
      this(new OuterComposite());
    }

    protected Builder(OuterComposite instance) {
      this.instance = instance;
    }

    public OuterComposite.Builder myNumber(BigDecimal myNumber) {
      this.instance.myNumber = myNumber;
      return this;
    }
    public OuterComposite.Builder myString(String myString) {
      this.instance.myString = myString;
      return this;
    }
    public OuterComposite.Builder myBoolean(Boolean myBoolean) {
      this.instance.myBoolean = myBoolean;
      return this;
    }


    /**
    * returns a built OuterComposite instance.
    *
    * The builder is not reusable.
    */
    public OuterComposite build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static OuterComposite.Builder builder() {
    return new OuterComposite.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public OuterComposite.Builder toBuilder() {
    return new OuterComposite.Builder()
      .myNumber(getMyNumber())
      .myString(getMyString())
      .myBoolean(getMyBoolean());
  }

}

