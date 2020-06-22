package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



<<<<<<< HEAD
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class Order  implements Serializable {
=======
public class Order  implements Serializable {
>>>>>>> ooof
  
  private @Valid Long id;
  private @Valid Long petId;
  private @Valid Integer quantity;
  private @Valid Date shipDate;

public enum StatusEnum {

    PLACED(String.valueOf("placed")), APPROVED(String.valueOf("approved")), DELIVERED(String.valueOf("delivered"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid StatusEnum status;
  private @Valid Boolean complete = false;

  /**
   **/
  public Order id(Long id) {
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
  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("petId")
  public Long getPetId() {
    return petId;
  }
<<<<<<< HEAD

  public void setPetId(Long petId) {
    this.petId = petId;
  }/**
=======
  public void setPetId(Long petId) {
    this.petId = petId;
  }

  /**
>>>>>>> ooof
   **/
  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
<<<<<<< HEAD

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }/**
=======
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
>>>>>>> ooof
   **/
  public Order shipDate(Date shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }
<<<<<<< HEAD

  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }/**
=======
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  /**
>>>>>>> ooof
   * Order Status
   **/
  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "Order Status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
<<<<<<< HEAD

  public void setStatus(StatusEnum status) {
    this.status = status;
  }/**
=======
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
>>>>>>> ooof
   **/
  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }
<<<<<<< HEAD

=======
>>>>>>> ooof
  public void setComplete(Boolean complete) {
    this.complete = complete;
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

