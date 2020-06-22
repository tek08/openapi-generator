package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import org.joda.time.LocalDate;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



<<<<<<< HEAD
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class FormatTest  implements Serializable {
=======
public class FormatTest  implements Serializable {
>>>>>>> ooof
  
  private @Valid Integer integer;
  private @Valid Integer int32;
  private @Valid Long int64;
  private @Valid BigDecimal number;
  private @Valid Float _float;
  private @Valid Double _double;
  private @Valid String string;
  private @Valid byte[] _byte;
  private @Valid File binary;
  private @Valid LocalDate date;
  private @Valid Date dateTime;
  private @Valid UUID uuid;
  private @Valid String password;
  private @Valid BigDecimal bigDecimal;

  /**
   * minimum: 10
   * maximum: 100
   **/
  public FormatTest integer(Integer integer) {
    this.integer = integer;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("integer")
 @Min(10) @Max(100)  public Integer getInteger() {
    return integer;
  }
<<<<<<< HEAD

  public void setInteger(Integer integer) {
    this.integer = integer;
  }/**
=======
  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  /**
>>>>>>> ooof
   * minimum: 20
   * maximum: 200
   **/
  public FormatTest int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("int32")
 @Min(20) @Max(200)  public Integer getInt32() {
    return int32;
  }
<<<<<<< HEAD

  public void setInt32(Integer int32) {
    this.int32 = int32;
  }/**
=======
  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest int64(Long int64) {
    this.int64 = int64;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("int64")
  public Long getInt64() {
    return int64;
  }
<<<<<<< HEAD

  public void setInt64(Long int64) {
    this.int64 = int64;
  }/**
=======
  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  /**
>>>>>>> ooof
   * minimum: 32.1
   * maximum: 543.2
   **/
  public FormatTest number(BigDecimal number) {
    this.number = number;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("number")
  @NotNull
 @DecimalMin("32.1") @DecimalMax("543.2")  public BigDecimal getNumber() {
    return number;
  }
<<<<<<< HEAD

  public void setNumber(BigDecimal number) {
    this.number = number;
  }/**
=======
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  /**
>>>>>>> ooof
   * minimum: 54.3
   * maximum: 987.6
   **/
  public FormatTest _float(Float _float) {
    this._float = _float;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("float")
 @DecimalMin("54.3") @DecimalMax("987.6")  public Float getFloat() {
    return _float;
  }
<<<<<<< HEAD

  public void setFloat(Float _float) {
    this._float = _float;
  }/**
=======
  public void setFloat(Float _float) {
    this._float = _float;
  }

  /**
>>>>>>> ooof
   * minimum: 67.8
   * maximum: 123.4
   **/
  public FormatTest _double(Double _double) {
    this._double = _double;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("double")
 @DecimalMin("67.8") @DecimalMax("123.4")  public Double getDouble() {
    return _double;
  }
<<<<<<< HEAD

  public void setDouble(Double _double) {
    this._double = _double;
  }/**
=======
  public void setDouble(Double _double) {
    this._double = _double;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest string(String string) {
    this.string = string;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("string")
 @Pattern(regexp="/[a-z]/i")  public String getString() {
    return string;
  }
<<<<<<< HEAD

  public void setString(String string) {
    this.string = string;
  }/**
=======
  public void setString(String string) {
    this.string = string;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("byte")
  @NotNull
 @Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")  public byte[] getByte() {
    return _byte;
  }
<<<<<<< HEAD

  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }/**
=======
  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest binary(File binary) {
    this.binary = binary;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("binary")
  public File getBinary() {
    return binary;
  }
<<<<<<< HEAD

  public void setBinary(File binary) {
    this.binary = binary;
  }/**
=======
  public void setBinary(File binary) {
    this.binary = binary;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest date(LocalDate date) {
    this.date = date;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("date")
  @NotNull
  public LocalDate getDate() {
    return date;
  }
<<<<<<< HEAD

  public void setDate(LocalDate date) {
    this.date = date;
  }/**
=======
  public void setDate(LocalDate date) {
    this.date = date;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("dateTime")
  public Date getDateTime() {
    return dateTime;
  }
<<<<<<< HEAD

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }/**
=======
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(example = "72f98069-206d-4f12-9f12-3d1e525a8e84", value = "")
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }
<<<<<<< HEAD

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }/**
=======
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
>>>>>>> ooof
   **/
  public FormatTest password(String password) {
    this.password = password;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("password")
  @NotNull
 @Size(min=10,max=64)  public String getPassword() {
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
  public FormatTest bigDecimal(BigDecimal bigDecimal) {
    this.bigDecimal = bigDecimal;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("BigDecimal")
  public BigDecimal getBigDecimal() {
    return bigDecimal;
  }
<<<<<<< HEAD

=======
>>>>>>> ooof
  public void setBigDecimal(BigDecimal bigDecimal) {
    this.bigDecimal = bigDecimal;
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
    FormatTest formatTest = (FormatTest) o;
    return Objects.equals(this.integer, formatTest.integer) &&
        Objects.equals(this.int32, formatTest.int32) &&
        Objects.equals(this.int64, formatTest.int64) &&
        Objects.equals(this.number, formatTest.number) &&
        Objects.equals(this._float, formatTest._float) &&
        Objects.equals(this._double, formatTest._double) &&
        Objects.equals(this.string, formatTest.string) &&
        Objects.equals(this._byte, formatTest._byte) &&
        Objects.equals(this.binary, formatTest.binary) &&
        Objects.equals(this.date, formatTest.date) &&
        Objects.equals(this.dateTime, formatTest.dateTime) &&
        Objects.equals(this.uuid, formatTest.uuid) &&
        Objects.equals(this.password, formatTest.password) &&
        Objects.equals(this.bigDecimal, formatTest.bigDecimal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, _byte, binary, date, dateTime, uuid, password, bigDecimal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
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

