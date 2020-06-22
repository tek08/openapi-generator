package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



<<<<<<< HEAD
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class User  implements Serializable {
=======
public class User  implements Serializable {
>>>>>>> ooof
  
  private @Valid Long id;
  private @Valid String username;
  private @Valid String firstName;
  private @Valid String lastName;
  private @Valid String email;
  private @Valid String password;
  private @Valid String phone;
  private @Valid Integer userStatus;

  /**
   **/
  public User id(Long id) {
    this.id = id;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
<<<<<<< HEAD

  public void setId(Long id) {
    this.id = id;
  }/**
=======
  public void setId(Long id) {
    this.id = id;
  }

  /**
>>>>>>> ooof
   **/
  public User username(String username) {
    this.username = username;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
<<<<<<< HEAD

  public void setUsername(String username) {
    this.username = username;
  }/**
=======
  public void setUsername(String username) {
    this.username = username;
  }

  /**
>>>>>>> ooof
   **/
  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
<<<<<<< HEAD

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }/**
=======
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
>>>>>>> ooof
   **/
  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
<<<<<<< HEAD

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }/**
=======
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
>>>>>>> ooof
   **/
  public User email(String email) {
    this.email = email;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
<<<<<<< HEAD

  public void setEmail(String email) {
    this.email = email;
  }/**
=======
  public void setEmail(String email) {
    this.email = email;
  }

  /**
>>>>>>> ooof
   **/
  public User password(String password) {
    this.password = password;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
<<<<<<< HEAD

  public void setPassword(String password) {
    this.password = password;
  }/**
=======
  public void setPassword(String password) {
    this.password = password;
  }

  /**
>>>>>>> ooof
   **/
  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
<<<<<<< HEAD

  public void setPhone(String phone) {
    this.phone = phone;
  }/**
=======
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
>>>>>>> ooof
   * User Status
   **/
  public User userStatus(Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "User Status")
  @JsonProperty("userStatus")
  public Integer getUserStatus() {
    return userStatus;
  }
<<<<<<< HEAD

=======
>>>>>>> ooof
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

<<<<<<< HEAD
=======

>>>>>>> ooof
  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
<<<<<<< HEAD


=======
>>>>>>> ooof
}

