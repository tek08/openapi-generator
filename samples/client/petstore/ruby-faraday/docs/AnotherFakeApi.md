# Petstore::AnotherFakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call_123_test_special_tags**](AnotherFakeApi.md#call_123_test_special_tags) | **PATCH** /another-fake/dummy | To test special tags



## call_123_test_special_tags

<<<<<<< HEAD
> Client call_123_test_special_tags(client)
=======
> Client call_123_test_special_tags(body)
>>>>>>> ooof

To test special tags

To test special tags and operation ID starting with number

### Example

```ruby
# load the gem
require 'petstore'

api_instance = Petstore::AnotherFakeApi.new
<<<<<<< HEAD
client = Petstore::Client.new # Client | client model

begin
  #To test special tags
  result = api_instance.call_123_test_special_tags(client)
=======
body = Petstore::Client.new # Client | client model

begin
  #To test special tags
  result = api_instance.call_123_test_special_tags(body)
>>>>>>> ooof
  p result
rescue Petstore::ApiError => e
  puts "Exception when calling AnotherFakeApi->call_123_test_special_tags: #{e}"
end
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

