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

import org.openapitools.client.models.ReadOnlyFirst

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer
<<<<<<< HEAD

=======
>>>>>>> ooof
/**
 * 
 * @param arrayOfString 
 * @param arrayArrayOfInteger 
 * @param arrayArrayOfModel 
 */
@Serializable
data class ArrayTest (
<<<<<<< HEAD
    @SerialName(value = "array_of_string") val arrayOfString: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "array_array_of_integer") val arrayArrayOfInteger: kotlin.collections.List<kotlin.collections.List<kotlin.Long>>? = null,
    @SerialName(value = "array_array_of_model") val arrayArrayOfModel: kotlin.collections.List<kotlin.collections.List<ReadOnlyFirst>>? = null
)
=======
    @SerialName(value = "array_of_string") val arrayOfString: kotlin.Array<kotlin.String>? = null,
    @SerialName(value = "array_array_of_integer") val arrayArrayOfInteger: kotlin.Array<kotlin.Array<kotlin.Long>>? = null,
    @SerialName(value = "array_array_of_model") val arrayArrayOfModel: kotlin.Array<kotlin.Array<ReadOnlyFirst>>? = null
) 


>>>>>>> ooof

