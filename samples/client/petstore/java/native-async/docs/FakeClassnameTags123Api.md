# FakeClassnameTags123Api

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testClassname**](FakeClassnameTags123Api.md#testClassname) | **PATCH** /fake_classname_test | To test class name in snake case



## testClassname

<<<<<<< HEAD
> CompletableFuture<Client> testClassname(body)
=======
> Client testClassname(body)
>>>>>>> ooof

To test class name in snake case

To test class name in snake case

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FakeClassnameTags123Api;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");
        
        // Configure API key authorization: api_key_query
        ApiKeyAuth api_key_query = (ApiKeyAuth) defaultClient.getAuthentication("api_key_query");
        api_key_query.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_query.setApiKeyPrefix("Token");

        FakeClassnameTags123Api apiInstance = new FakeClassnameTags123Api(defaultClient);
        Client body = new Client(); // Client | client model
        try {
<<<<<<< HEAD
            CompletableFuture<Client> result = apiInstance.testClassname(body);

=======
            Client result = apiInstance.testClassname(body);
>>>>>>> ooof
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FakeClassnameTags123Api#testClassname");
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
 **body** | [**Client**](Client.md)| client model |

### Return type

<<<<<<< HEAD
CompletableFuture<[**Client**](Client.md)>

=======
[**Client**](Client.md)
>>>>>>> ooof

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

