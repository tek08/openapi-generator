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
=======

>>>>>>> ooof
/**
 * Model for testing model name same as property name
 **/
@ApiModel(description = "Model for testing model name same as property name")
<<<<<<< HEAD
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class Name  implements Serializable {
=======
public class Name  implements Serializable {
>>>>>>> ooof
  
  private @Valid Integer name;
  private @Valid Integer snakeCase;
  private @Valid String property;
  private @Valid Integer _123number;

  /**
   **/
  public Name name(Integer name) {
    this.name = name;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public Integer getName() {
    return name;
  }
<<<<<<< HEAD

  public void setName(Integer name) {
    this.name = name;
  }/**
=======
  public void setName(Integer name) {
    this.name = name;
  }

  /**
>>>>>>> ooof
   **/
  public Name snakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("snake_case")
  public Integer getSnakeCase() {
    return snakeCase;
  }
<<<<<<< HEAD

  public void setSnakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
  }/**
=======
  public void setSnakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
  }

  /**
>>>>>>> ooof
   **/
  public Name property(String property) {
    this.property = property;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
<<<<<<< HEAD

  public void setProperty(String property) {
    this.property = property;
  }/**
=======
  public void setProperty(String property) {
    this.property = property;
  }

  /**
>>>>>>> ooof
   **/
  public Name _123number(Integer _123number) {
    this._123number = _123number;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("123Number")
  public Integer get123number() {
    return _123number;
  }
<<<<<<< HEAD

=======
>>>>>>> ooof
  public void set123number(Integer _123number) {
    this._123number = _123number;
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

