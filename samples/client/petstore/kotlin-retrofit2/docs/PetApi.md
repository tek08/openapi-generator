# PetApi

All URIs are relative to *http://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
<<<<<<< HEAD
[**addPet**](PetApi.md#addPet) | **POST** pet | Add a new pet to the store
[**deletePet**](PetApi.md#deletePet) | **DELETE** pet/{petId} | Deletes a pet
[**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** pet/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** pet/findByTags | Finds Pets by tags
[**getPetById**](PetApi.md#getPetById) | **GET** pet/{petId} | Find pet by ID
[**updatePet**](PetApi.md#updatePet) | **PUT** pet | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** pet/{petId} | Updates a pet in the store with form data
[**uploadFile**](PetApi.md#uploadFile) | **POST** pet/{petId}/uploadImage | uploads an image


=======
[**addPet**](PetApi.md#addPet) | **POST** /pet | Add a new pet to the store
[**deletePet**](PetApi.md#deletePet) | **DELETE** /pet/{petId} | Deletes a pet
[**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** /pet/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** /pet/findByTags | Finds Pets by tags
[**getPetById**](PetApi.md#getPetById) | **GET** /pet/{petId} | Find pet by ID
[**updatePet**](PetApi.md#updatePet) | **PUT** /pet | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** /pet/{petId} | Updates a pet in the store with form data
[**uploadFile**](PetApi.md#uploadFile) | **POST** /pet/{petId}/uploadImage | uploads an image


<a name="addPet"></a>
# **addPet**
> addPet(body)
>>>>>>> ooof

Add a new pet to the store

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val body : Pet =  // Pet | Pet object that needs to be added to the store

webService.addPet(body)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val body : Pet =  // Pet | Pet object that needs to be added to the store
try {
    apiInstance.addPet(body)
} catch (e: ClientException) {
    println("4xx response calling PetApi#addPet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#addPet")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization


<<<<<<< HEAD
=======
Configure petstore_auth:
    ApiClient.accessToken = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<<<<<<< HEAD
=======
<a name="deletePet"></a>
# **deletePet**
> deletePet(petId, apiKey)
>>>>>>> ooof

Deletes a pet

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val petId : kotlin.Long = 789 // kotlin.Long | Pet id to delete
val apiKey : kotlin.String = apiKey_example // kotlin.String | 

webService.deletePet(petId, apiKey)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val petId : kotlin.Long = 789 // kotlin.Long | Pet id to delete
val apiKey : kotlin.String = apiKey_example // kotlin.String | 
try {
    apiInstance.deletePet(petId, apiKey)
} catch (e: ClientException) {
    println("4xx response calling PetApi#deletePet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#deletePet")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **kotlin.Long**| Pet id to delete |
 **apiKey** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


<<<<<<< HEAD
=======
Configure petstore_auth:
    ApiClient.accessToken = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<<<<<<< HEAD
=======
<a name="findPetsByStatus"></a>
# **findPetsByStatus**
> kotlin.Array&lt;Pet&gt; findPetsByStatus(status)
>>>>>>> ooof

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val status : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Status values that need to be considered for filter

val result : kotlin.collections.List<Pet> = webService.findPetsByStatus(status)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val status : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Status values that need to be considered for filter
try {
    val result : kotlin.Array<Pet> = apiInstance.findPetsByStatus(status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#findPetsByStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#findPetsByStatus")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
<<<<<<< HEAD
 **status** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Status values that need to be considered for filter | [enum: available, pending, sold]

### Return type

[**kotlin.collections.List&lt;Pet&gt;**](Pet.md)
=======
 **status** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Status values that need to be considered for filter | [enum: available, pending, sold]

### Return type

[**kotlin.Array&lt;Pet&gt;**](Pet.md)
>>>>>>> ooof

### Authorization


<<<<<<< HEAD
=======
Configure petstore_auth:
    ApiClient.accessToken = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<<<<<<< HEAD
=======
<a name="findPetsByTags"></a>
# **findPetsByTags**
> kotlin.Array&lt;Pet&gt; findPetsByTags(tags)
>>>>>>> ooof

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val tags : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Tags to filter by

val result : kotlin.collections.List<Pet> = webService.findPetsByTags(tags)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Tags to filter by
try {
    val result : kotlin.Array<Pet> = apiInstance.findPetsByTags(tags)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#findPetsByTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#findPetsByTags")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
<<<<<<< HEAD
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Tags to filter by |

### Return type

[**kotlin.collections.List&lt;Pet&gt;**](Pet.md)
=======
 **tags** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Tags to filter by |

### Return type

[**kotlin.Array&lt;Pet&gt;**](Pet.md)
>>>>>>> ooof

### Authorization


<<<<<<< HEAD
=======
Configure petstore_auth:
    ApiClient.accessToken = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<<<<<<< HEAD
=======
<a name="getPetById"></a>
# **getPetById**
> Pet getPetById(petId)
>>>>>>> ooof

Find pet by ID

Returns a single pet

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val petId : kotlin.Long = 789 // kotlin.Long | ID of pet to return

val result : Pet = webService.getPetById(petId)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val petId : kotlin.Long = 789 // kotlin.Long | ID of pet to return
try {
    val result : Pet = apiInstance.getPetById(petId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#getPetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#getPetById")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **kotlin.Long**| ID of pet to return |

### Return type

[**Pet**](Pet.md)

### Authorization


<<<<<<< HEAD
=======
Configure api_key:
    ApiClient.apiKey["api_key"] = ""
    ApiClient.apiKeyPrefix["api_key"] = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<<<<<<< HEAD
=======
<a name="updatePet"></a>
# **updatePet**
> updatePet(body)
>>>>>>> ooof

Update an existing pet

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val body : Pet =  // Pet | Pet object that needs to be added to the store

webService.updatePet(body)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val body : Pet =  // Pet | Pet object that needs to be added to the store
try {
    apiInstance.updatePet(body)
} catch (e: ClientException) {
    println("4xx response calling PetApi#updatePet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#updatePet")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization


<<<<<<< HEAD
=======
Configure petstore_auth:
    ApiClient.accessToken = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

<<<<<<< HEAD
=======
<a name="updatePetWithForm"></a>
# **updatePetWithForm**
> updatePetWithForm(petId, name, status)
>>>>>>> ooof

Updates a pet in the store with form data

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val petId : kotlin.Long = 789 // kotlin.Long | ID of pet that needs to be updated
val name : kotlin.String = name_example // kotlin.String | Updated name of the pet
val status : kotlin.String = status_example // kotlin.String | Updated status of the pet

webService.updatePetWithForm(petId, name, status)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val petId : kotlin.Long = 789 // kotlin.Long | ID of pet that needs to be updated
val name : kotlin.String = name_example // kotlin.String | Updated name of the pet
val status : kotlin.String = status_example // kotlin.String | Updated status of the pet
try {
    apiInstance.updatePetWithForm(petId, name, status)
} catch (e: ClientException) {
    println("4xx response calling PetApi#updatePetWithForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#updatePetWithForm")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **kotlin.Long**| ID of pet that needs to be updated |
 **name** | **kotlin.String**| Updated name of the pet | [optional]
 **status** | **kotlin.String**| Updated status of the pet | [optional]

### Return type

null (empty response body)

### Authorization


<<<<<<< HEAD
=======
Configure petstore_auth:
    ApiClient.accessToken = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<<<<<<< HEAD
=======
<a name="uploadFile"></a>
# **uploadFile**
> ApiResponse uploadFile(petId, additionalMetadata, file)
>>>>>>> ooof

uploads an image

### Example
```kotlin
// Import classes:
<<<<<<< HEAD
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PetApi::class.java)
val petId : kotlin.Long = 789 // kotlin.Long | ID of pet to update
val additionalMetadata : kotlin.String = additionalMetadata_example // kotlin.String | Additional data to pass to server
val file : java.io.File = BINARY_DATA_HERE // java.io.File | file to upload

val result : ApiResponse = webService.uploadFile(petId, additionalMetadata, file)
=======
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PetApi()
val petId : kotlin.Long = 789 // kotlin.Long | ID of pet to update
val additionalMetadata : kotlin.String = additionalMetadata_example // kotlin.String | Additional data to pass to server
val file : java.io.File = BINARY_DATA_HERE // java.io.File | file to upload
try {
    val result : ApiResponse = apiInstance.uploadFile(petId, additionalMetadata, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#uploadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#uploadFile")
    e.printStackTrace()
}
>>>>>>> ooof
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **kotlin.Long**| ID of pet to update |
 **additionalMetadata** | **kotlin.String**| Additional data to pass to server | [optional]
 **file** | **java.io.File**| file to upload | [optional]

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization


<<<<<<< HEAD
=======
Configure petstore_auth:
    ApiClient.accessToken = ""
>>>>>>> ooof

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

