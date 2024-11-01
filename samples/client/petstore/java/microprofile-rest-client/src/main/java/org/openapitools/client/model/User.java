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
  * A User who is purchasing from the pet store
  */

public class User  {
  
  @JsonbProperty("id")
  private Long id;

  @JsonbProperty("username")
  private String username;

  @JsonbProperty("firstName")
  private String firstName;

  @JsonbProperty("lastName")
  private String lastName;

  @JsonbProperty("email")
  private String email;

  @JsonbProperty("password")
  private String password;

  @JsonbProperty("phone")
  private String phone;

 /**
  * User Status
  */
  @JsonbProperty("userStatus")
  private Integer userStatus;

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

  public User id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  public String getUsername() {
    return username;
  }

  /**
   * Set username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  public String getFirstName() {
    return firstName;
  }

  /**
   * Set firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  public String getLastName() {
    return lastName;
  }

  /**
   * Set lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  public String getEmail() {
    return email;
  }

  /**
   * Set email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  public String getPassword() {
    return password;
  }

  /**
   * Set password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  public String getPhone() {
    return phone;
  }

  /**
   * Set phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * User Status
   * @return userStatus
   **/
  public Integer getUserStatus() {
    return userStatus;
  }

  /**
   * Set userStatus
   */
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  public User userStatus(Integer userStatus) {
    this.userStatus = userStatus;
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.userStatus, user.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, password, phone, userStatus);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

