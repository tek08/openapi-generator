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

import org.openapitools.client.models.OuterEnum
import org.openapitools.client.models.OuterEnumDefaultValue
import org.openapitools.client.models.OuterEnumInteger
import org.openapitools.client.models.OuterEnumIntegerDefaultValue

import com.squareup.moshi.Json
import java.io.Serializable
<<<<<<< HEAD

/**
 * 
 * @param enumStringRequired 
 * @param enumString 
=======
/**
 * 
 * @param enumString 
 * @param enumStringRequired 
>>>>>>> ooof
 * @param enumInteger 
 * @param enumNumber 
 * @param outerEnum 
 * @param outerEnumInteger 
 * @param outerEnumDefaultValue 
 * @param outerEnumIntegerDefaultValue 
 */

data class EnumTest (
    @Json(name = "enum_string_required")
    val enumStringRequired: EnumTest.EnumStringRequired,
    @Json(name = "enum_string")
    val enumString: EnumTest.EnumString? = null,
    @Json(name = "enum_integer")
    val enumInteger: EnumTest.EnumInteger? = null,
    @Json(name = "enum_number")
    val enumNumber: EnumTest.EnumNumber? = null,
    @Json(name = "outerEnum")
    val outerEnum: OuterEnum? = null,
    @Json(name = "outerEnumInteger")
    val outerEnumInteger: OuterEnumInteger? = null,
    @Json(name = "outerEnumDefaultValue")
    val outerEnumDefaultValue: OuterEnumDefaultValue? = null,
    @Json(name = "outerEnumIntegerDefaultValue")
    val outerEnumIntegerDefaultValue: OuterEnumIntegerDefaultValue? = null
<<<<<<< HEAD
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

=======
) 
: Serializable 

{
	companion object {
		private const val serialVersionUID: Long = 123
	}
>>>>>>> ooof
    /**
    * 
    * Values: uPPER,lower,eMPTY
    */
    
<<<<<<< HEAD
    enum class EnumStringRequired(val value: kotlin.String){
=======
    enum class EnumString(val value: kotlin.String){
>>>>>>> ooof
        @Json(name = "UPPER") uPPER("UPPER"),
        @Json(name = "lower") lower("lower"),
        @Json(name = "") eMPTY("");
    }
    /**
    * 
    * Values: uPPER,lower,eMPTY
    */
    
<<<<<<< HEAD
    enum class EnumString(val value: kotlin.String){
=======
    enum class EnumStringRequired(val value: kotlin.String){
>>>>>>> ooof
        @Json(name = "UPPER") uPPER("UPPER"),
        @Json(name = "lower") lower("lower"),
        @Json(name = "") eMPTY("");
    }
    /**
    * 
    * Values: _1,minus1
    */
    
    enum class EnumInteger(val value: kotlin.Int){
<<<<<<< HEAD
        @Json(name = "1") _1(1),
        @Json(name = "-1") minus1(-1);
=======
        @Json(name = 1) _1(1),
        @Json(name = -1) minus1(-1);
>>>>>>> ooof
    }
    /**
    * 
    * Values: _1period1,minus1Period2
    */
    
    enum class EnumNumber(val value: kotlin.Double){
<<<<<<< HEAD
        @Json(name = "1.1") _1period1(1.1),
        @Json(name = "-1.2") minus1Period2(-1.2);
=======
        @Json(name = 1.1) _1period1(1.1),
        @Json(name = -1.2) minus1Period2(-1.2);
>>>>>>> ooof
    }
}

