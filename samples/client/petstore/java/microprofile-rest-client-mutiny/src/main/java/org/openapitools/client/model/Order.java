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
import java.util.Date;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * An order for a pets from the pet store
  */

public class Order  {
  
  @JsonbProperty("id")
  private Long id;

  @JsonbProperty("petId")
  private Long petId;

  @JsonbProperty("quantity")
  private Integer quantity;

  @JsonbProperty("shipDate")
  private Date shipDate;

  @JsonbTypeSerializer(StatusEnum.Serializer.class)
  @JsonbTypeDeserializer(StatusEnum.Deserializer.class)
  public enum StatusEnum {

    PLACED(String.valueOf("placed")), APPROVED(String.valueOf("approved")), DELIVERED(String.valueOf("delivered"));


    String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Deserializer implements JsonbDeserializer<StatusEnum> {
        @Override
        public StatusEnum deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(parser.getString())) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + parser.getString() + "'");
        }
    }

    public static final class Serializer implements JsonbSerializer<StatusEnum> {
        @Override
        public void serialize(StatusEnum obj, JsonGenerator generator, SerializationContext ctx) {
            generator.write(obj.value);
        }
    }
  }

 /**
  * Order Status
  */
  @JsonbProperty("status")
  private StatusEnum status;

  @JsonbProperty("complete")
  private Boolean complete = false;

  /**
   * Get id
   * @return id
   **/
  public Long getId() {
    return id;
  }

  /**
   * Set id
   */
  public void setId(Long id) {
    this.id = id;
  }

  public Order id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get petId
   * @return petId
   **/
  public Long getPetId() {
    return petId;
  }

  /**
   * Set petId
   */
  public void setPetId(Long petId) {
    this.petId = petId;
  }

  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   **/
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Set quantity
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get shipDate
   * @return shipDate
   **/
  public Date getShipDate() {
    return shipDate;
  }

  /**
   * Set shipDate
   */
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  public Order shipDate(Date shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Order Status
   * @return status
   **/
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * Set status
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get complete
   * @return complete
   **/
  public Boolean getComplete() {
    return complete;
  }

  /**
   * Set complete
   */
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
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
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.petId, order.petId) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petId, quantity, shipDate, status, complete);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

