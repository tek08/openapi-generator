# OpenApiPetstore.FakeClassnameTags123Api

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**testClassname**](FakeClassnameTags123Api.md#testClassname) | **PATCH** /fake_classname_test | To test class name in snake case



## testClassname

<<<<<<< HEAD
> Client testClassname(client)
=======
> Client testClassname(body)
>>>>>>> ooof

To test class name in snake case

To test class name in snake case

### Example

```javascript
import OpenApiPetstore from 'open_api_petstore';
let defaultClient = OpenApiPetstore.ApiClient.instance;
// Configure API key authorization: api_key_query
let api_key_query = defaultClient.authentications['api_key_query'];
api_key_query.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_query.apiKeyPrefix = 'Token';

let apiInstance = new OpenApiPetstore.FakeClassnameTags123Api();
<<<<<<< HEAD
let client = new OpenApiPetstore.Client(); // Client | client model
apiInstance.testClassname(client).then((data) => {
=======
let body = new OpenApiPetstore.Client(); // Client | client model
apiInstance.testClassname(body).then((data) => {
>>>>>>> ooof
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
<<<<<<< HEAD
 **client** | [**Client**](Client.md)| client model | 
=======
 **body** | [**Client**](Client.md)| client model | 
>>>>>>> ooof

### Return type

[**Client**](Client.md)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

