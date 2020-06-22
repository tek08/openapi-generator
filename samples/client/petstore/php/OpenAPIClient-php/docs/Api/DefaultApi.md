# OpenAPI\Client\DefaultApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fooGet**](DefaultApi.md#fooGet) | **GET** /foo | 


<<<<<<< HEAD

## fooGet

=======
# **fooGet**
>>>>>>> ooof
> \OpenAPI\Client\Model\InlineResponseDefault fooGet()



### Example
<<<<<<< HEAD

=======
>>>>>>> ooof
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

<<<<<<< HEAD

=======
>>>>>>> ooof
$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->fooGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->fooGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
<<<<<<< HEAD

=======
>>>>>>> ooof
This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\InlineResponseDefault**](../Model/InlineResponseDefault.md)

### Authorization

No authorization required

### HTTP request headers

<<<<<<< HEAD
- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)
=======
 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
>>>>>>> ooof

