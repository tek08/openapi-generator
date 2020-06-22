/**
* OpenAPI Petstore
* Test for issue 4062
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json

/**
* An enum with complex-ish naming
* Values: MY_FIRST_VALUE,MY_SECOND_VALUE
*/

enum class PetEnum(val value: kotlin.String){


    @Json(name = "myFirstValue")
    MY_FIRST_VALUE("myFirstValue"),


    @Json(name = "MY_SECOND_VALUE")
    MY_SECOND_VALUE("MY_SECOND_VALUE");



<<<<<<< HEAD
    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

=======
>>>>>>> ooof
}

