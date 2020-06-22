/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.Order

import org.openapitools.client.infrastructure.*
import io.ktor.client.request.forms.formData
import kotlinx.serialization.UnstableDefault
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor

class StoreApi @UseExperimental(UnstableDefault::class) constructor(
<<<<<<< HEAD
    baseUrl: kotlin.String = "http://petstore.swagger.io/v2",
    httpClientEngine: HttpClientEngine? = null,
    serializer: KotlinxSerializer
) : ApiClient(baseUrl, httpClientEngine, serializer) {
=======
        baseUrl: kotlin.String = "http://petstore.swagger.io/v2",
        httpClientEngine: HttpClientEngine? = null,
        serializer: KotlinxSerializer)
    : ApiClient(baseUrl, httpClientEngine, serializer) {
>>>>>>> ooof

    @UseExperimental(UnstableDefault::class)
    constructor(
        baseUrl: kotlin.String = "http://petstore.swagger.io/v2",
        httpClientEngine: HttpClientEngine? = null,
<<<<<<< HEAD
        jsonConfiguration: JsonConfiguration = JsonConfiguration.Default
    ) : this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     * @param orderId ID of the order that needs to be deleted 
     * @return void
     */
    suspend fun deleteOrder(orderId: kotlin.String): HttpResponse<Unit> {
=======
        jsonConfiguration: JsonConfiguration = JsonConfiguration.Default)
    : this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    /**
    * Delete purchase order by ID
    * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
    * @param orderId ID of the order that needs to be deleted 
    * @return void
    */
    suspend fun deleteOrder(orderId: kotlin.String) : HttpResponse<Unit> {
>>>>>>> ooof

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
<<<<<<< HEAD
            "/store/order/{orderId}".replace("{" + "orderId" + "}", "$orderId"),
=======
            "/store/order/{orderId}".replace("{"+"orderId"+"}", "$orderId"),
>>>>>>> ooof
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
<<<<<<< HEAD
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     * @return kotlin.collections.Map<kotlin.String, kotlin.Int>
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getInventory(): HttpResponse<kotlin.collections.Map<kotlin.String, kotlin.Int>> {
=======
    * Returns pet inventories by status
    * Returns a map of status codes to quantities
    * @return kotlin.collections.Map<kotlin.String, kotlin.Int>
    */
    @Suppress("UNCHECKED_CAST")
    suspend fun getInventory() : HttpResponse<kotlin.collections.Map<kotlin.String, kotlin.Int>> {
>>>>>>> ooof

        val localVariableAuthNames = listOf<String>("api_key")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/store/inventory",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetInventoryResponse>().map { value }
    }

    @Serializable
<<<<<<< HEAD
    private class GetInventoryResponse(val value: Map<kotlin.String, kotlin.Int>) {
        @Serializer(GetInventoryResponse::class)
        companion object : KSerializer<GetInventoryResponse> {
            private val serializer: KSerializer<Map<kotlin.String, kotlin.Int>> = (kotlin.String.serializer() to kotlin.Int.serializer()).map
                override val descriptor = StringDescriptor.withName("GetInventoryResponse")
                override fun serialize(encoder: Encoder, obj: GetInventoryResponse) = serializer.serialize(encoder, obj.value)
                override fun deserialize(decoder: Decoder) = GetInventoryResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     * @param orderId ID of pet that needs to be fetched 
     * @return Order
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrderById(orderId: kotlin.Long): HttpResponse<Order> {
=======
private class GetInventoryResponse(val value: Map<kotlin.String, kotlin.Int>) {
    @Serializer(GetInventoryResponse::class)
    companion object : KSerializer<GetInventoryResponse> {
        private val serializer: KSerializer<Map<kotlin.String, kotlin.Int>> = (kotlin.String.serializer() to kotlin.Int.serializer()).map
            override val descriptor = StringDescriptor.withName("GetInventoryResponse")
            override fun serialize(encoder: Encoder, obj: GetInventoryResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetInventoryResponse(serializer.deserialize(decoder))
    }
}

    /**
    * Find purchase order by ID
    * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
    * @param orderId ID of pet that needs to be fetched 
    * @return Order
    */
    @Suppress("UNCHECKED_CAST")
    suspend fun getOrderById(orderId: kotlin.Long) : HttpResponse<Order> {
>>>>>>> ooof

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
<<<<<<< HEAD
            "/store/order/{orderId}".replace("{" + "orderId" + "}", "$orderId"),
=======
            "/store/order/{orderId}".replace("{"+"orderId"+"}", "$orderId"),
>>>>>>> ooof
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
<<<<<<< HEAD
     * Place an order for a pet
     * 
     * @param body order placed for purchasing the pet 
     * @return Order
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun placeOrder(body: Order): HttpResponse<Order> {
=======
    * Place an order for a pet
    * 
    * @param body order placed for purchasing the pet 
    * @return Order
    */
    @Suppress("UNCHECKED_CAST")
    suspend fun placeOrder(body: Order) : HttpResponse<Order> {
>>>>>>> ooof

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/store/order",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

<<<<<<< HEAD

=======
    
>>>>>>> ooof


    companion object {
        internal fun setMappers(serializer: KotlinxSerializer) {
            serializer.setMapper(GetInventoryResponse::class, GetInventoryResponse.serializer())
            
        }
    }
}
