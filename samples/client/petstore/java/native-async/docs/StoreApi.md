# StoreApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](StoreApi.md#deleteOrder) | **DELETE** /store/order/{order_id} | Delete purchase order by ID
[**getInventory**](StoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status
[**getOrderById**](StoreApi.md#getOrderById) | **GET** /store/order/{order_id} | Find purchase order by ID
[**placeOrder**](StoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet



## deleteOrder

<<<<<<< HEAD
> CompletableFuture<Void> deleteOrder(orderId)
=======
> deleteOrder(orderId)
>>>>>>> ooof

Delete purchase order by ID

For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoreApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        StoreApi apiInstance = new StoreApi(defaultClient);
        String orderId = "orderId_example"; // String | ID of the order that needs to be deleted
        try {
<<<<<<< HEAD
            CompletableFuture<Void> result = apiInstance.deleteOrder(orderId);

=======
            apiInstance.deleteOrder(orderId);
>>>>>>> ooof
        } catch (ApiException e) {
            System.err.println("Exception when calling StoreApi#deleteOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID of the order that needs to be deleted |

### Return type

<<<<<<< HEAD

CompletableFuture<void> (empty response body)
=======
null (empty response body)
>>>>>>> ooof

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |


## getInventory

<<<<<<< HEAD
> CompletableFuture<Map<String, Integer>> getInventory()
=======
> Map&lt;String, Integer&gt; getInventory()
>>>>>>> ooof

Returns pet inventories by status

Returns a map of status codes to quantities

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoreApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        StoreApi apiInstance = new StoreApi(defaultClient);
        try {
<<<<<<< HEAD
            CompletableFuture<Map<String, Integer>> result = apiInstance.getInventory();

=======
            Map<String, Integer> result = apiInstance.getInventory();
>>>>>>> ooof
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoreApi#getInventory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

<<<<<<< HEAD
CompletableFuture<**Map&lt;String, Integer&gt;**>

=======
**Map&lt;String, Integer&gt;**
>>>>>>> ooof

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getOrderById

<<<<<<< HEAD
> CompletableFuture<Order> getOrderById(orderId)
=======
> Order getOrderById(orderId)
>>>>>>> ooof

Find purchase order by ID

For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoreApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        StoreApi apiInstance = new StoreApi(defaultClient);
        Long orderId = 56L; // Long | ID of pet that needs to be fetched
        try {
<<<<<<< HEAD
            CompletableFuture<Order> result = apiInstance.getOrderById(orderId);

=======
            Order result = apiInstance.getOrderById(orderId);
>>>>>>> ooof
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoreApi#getOrderById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| ID of pet that needs to be fetched |

### Return type

<<<<<<< HEAD
CompletableFuture<[**Order**](Order.md)>

=======
[**Order**](Order.md)
>>>>>>> ooof

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |


## placeOrder

<<<<<<< HEAD
> CompletableFuture<Order> placeOrder(body)
=======
> Order placeOrder(body)
>>>>>>> ooof

Place an order for a pet

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoreApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        StoreApi apiInstance = new StoreApi(defaultClient);
        Order body = new Order(); // Order | order placed for purchasing the pet
        try {
<<<<<<< HEAD
            CompletableFuture<Order> result = apiInstance.placeOrder(body);

=======
            Order result = apiInstance.placeOrder(body);
>>>>>>> ooof
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoreApi#placeOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| order placed for purchasing the pet |

### Return type

<<<<<<< HEAD
CompletableFuture<[**Order**](Order.md)>

=======
[**Order**](Order.md)
>>>>>>> ooof

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Order |  -  |

