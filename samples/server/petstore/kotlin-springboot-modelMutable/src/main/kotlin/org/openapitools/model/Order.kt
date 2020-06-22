package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import io.swagger.annotations.ApiModelProperty

/**
 * An order for a pets from the pet store
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */
data class Order(

    @ApiModelProperty(example = "null", value = "")
<<<<<<< HEAD
    @field:JsonProperty("id") var id: kotlin.Long? = null,

    @ApiModelProperty(example = "null", value = "")
    @field:JsonProperty("petId") var petId: kotlin.Long? = null,

    @ApiModelProperty(example = "null", value = "")
    @field:JsonProperty("quantity") var quantity: kotlin.Int? = null,

    @ApiModelProperty(example = "null", value = "")
    @field:JsonProperty("shipDate") var shipDate: java.time.OffsetDateTime? = null,

    @ApiModelProperty(example = "null", value = "Order Status")
    @field:JsonProperty("status") var status: Order.Status? = null,

    @ApiModelProperty(example = "null", value = "")
    @field:JsonProperty("complete") var complete: kotlin.Boolean? = null
=======
    @JsonProperty("id") var id: kotlin.Long? = null,

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("petId") var petId: kotlin.Long? = null,

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("quantity") var quantity: kotlin.Int? = null,

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("shipDate") var shipDate: java.time.OffsetDateTime? = null,

    @ApiModelProperty(example = "null", value = "Order Status")
    @JsonProperty("status") var status: Order.Status? = null,

    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("complete") var complete: kotlin.Boolean? = null
>>>>>>> ooof
) {

    /**
    * Order Status
    * Values: placed,approved,delivered
    */
    enum class Status(val value: kotlin.String) {
    
        @JsonProperty("placed") placed("placed"),
    
        @JsonProperty("approved") approved("approved"),
    
        @JsonProperty("delivered") delivered("delivered");
    
    }

}

