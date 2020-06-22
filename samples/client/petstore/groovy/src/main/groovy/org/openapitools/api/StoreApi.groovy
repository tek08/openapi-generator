package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Order

class StoreApi {
    String basePath = "http://petstore.swagger.io/v2"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteOrder ( String orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/store/order/${orderId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def getInventory ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/store/inventory"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "map",
                    Integer.class )

    }

    def getOrderById ( Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/store/order/${orderId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Order.class )

    }

<<<<<<< HEAD
    def placeOrder ( Order order, Closure onSuccess, Closure onFailure)  {
=======
    def placeOrder ( Order body, Closure onSuccess, Closure onFailure)  {
>>>>>>> ooof
        String resourcePath = "/store/order"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
<<<<<<< HEAD
        if (order == null) {
            throw new RuntimeException("missing required params order")
=======
        if (body == null) {
            throw new RuntimeException("missing required params body")
>>>>>>> ooof
        }



        contentType = 'application/json';
<<<<<<< HEAD
        bodyParams = order
=======
        bodyParams = body
>>>>>>> ooof


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Order.class )

    }

}
