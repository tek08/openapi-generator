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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class Capitalization  implements Serializable {
=======
public class Capitalization  implements Serializable {
>>>>>>> ooof
  
  private @Valid String smallCamel;
  private @Valid String capitalCamel;
  private @Valid String smallSnake;
  private @Valid String capitalSnake;
  private @Valid String scAETHFlowPoints;
  private @Valid String ATT_NAME;

  /**
   **/
  public Capitalization smallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("smallCamel")
  public String getSmallCamel() {
    return smallCamel;
  }
<<<<<<< HEAD

  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }/**
=======
  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  /**
>>>>>>> ooof
   **/
  public Capitalization capitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("CapitalCamel")
  public String getCapitalCamel() {
    return capitalCamel;
  }
<<<<<<< HEAD

  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }/**
=======
  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  /**
>>>>>>> ooof
   **/
  public Capitalization smallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("small_Snake")
  public String getSmallSnake() {
    return smallSnake;
  }
<<<<<<< HEAD

  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }/**
=======
  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  /**
>>>>>>> ooof
   **/
  public Capitalization capitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("Capital_Snake")
  public String getCapitalSnake() {
    return capitalSnake;
  }
<<<<<<< HEAD

  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }/**
=======
  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  /**
>>>>>>> ooof
   **/
  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("SCA_ETH_Flow_Points")
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }
<<<<<<< HEAD

  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }/**
=======
  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  /**
>>>>>>> ooof
   * Name of the pet 
   **/
  public Capitalization ATT_NAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "Name of the pet ")
  @JsonProperty("ATT_NAME")
  public String getATTNAME() {
    return ATT_NAME;
  }
<<<<<<< HEAD

=======
>>>>>>> ooof
  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
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
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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

