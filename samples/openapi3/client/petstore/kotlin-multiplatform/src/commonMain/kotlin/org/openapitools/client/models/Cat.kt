/**
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
package org.openapitools.client.models

import org.openapitools.client.models.Animal
import org.openapitools.client.models.CatAllOf

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer
<<<<<<< HEAD

/**
 * 
 * @param className 
 * @param color 
=======
/**
 * 
>>>>>>> ooof
 * @param declawed 
 */
@Serializable
data class Cat (
<<<<<<< HEAD
    @SerialName(value = "className") @Required override val className: kotlin.String,
    @SerialName(value = "color") override val color: kotlin.String? = null,
    @SerialName(value = "declawed") val declawed: kotlin.Boolean? = null
) : Animal
=======
    @SerialName(value = "className") @Required val className: kotlin.String,
    @SerialName(value = "declawed") val declawed: kotlin.Boolean? = null,
    @SerialName(value = "color") val color: kotlin.String? = null
) 


>>>>>>> ooof

