# OpenApiPetstore.AnotherFakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call123testSpecialTags**](AnotherFakeApi.md#call123testSpecialTags) | **PATCH** /another-fake/dummy | To test special tags



## call123testSpecialTags

<<<<<<< HEAD
> Client call123testSpecialTags(client)
=======
> Client call123testSpecialTags(body)
>>>>>>> ooof

To test special tags

To test special tags and operation ID starting with number

### Example

```javascript
import OpenApiPetstore from 'open_api_petstore';

let apiInstance = new OpenApiPetstore.AnotherFakeApi();
<<<<<<< HEAD
let client = new OpenApiPetstore.Client(); // Client | client model
apiInstance.call123testSpecialTags(client).then((data) => {
=======
let body = new OpenApiPetstore.Client(); // Client | client model
apiInstance.call123testSpecialTags(body).then((data) => {
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

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

