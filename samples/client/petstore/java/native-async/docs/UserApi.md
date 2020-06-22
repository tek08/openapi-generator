# UserApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**createUsersWithArrayInput**](UserApi.md#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array
[**createUsersWithListInput**](UserApi.md#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user
[**getUserByName**](UserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name
[**loginUser**](UserApi.md#loginUser) | **GET** /user/login | Logs user into the system
[**logoutUser**](UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{username} | Updated user



## createUser

<<<<<<< HEAD
> CompletableFuture<Void> createUser(body)
=======
> createUser(body)
>>>>>>> ooof

Create user

This can only be done by the logged in user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        User body = new User(); // User | Created user object
        try {
<<<<<<< HEAD
            CompletableFuture<Void> result = apiInstance.createUser(body);

=======
            apiInstance.createUser(body);
>>>>>>> ooof
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
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
 **body** | [**User**](User.md)| Created user object |

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
| **0** | successful operation |  -  |


## createUsersWithArrayInput

<<<<<<< HEAD
> CompletableFuture<Void> createUsersWithArrayInput(body)
=======
> createUsersWithArrayInput(body)
>>>>>>> ooof

Creates list of users with given input array

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        List<User> body = Arrays.asList(); // List<User> | List of user object
        try {
<<<<<<< HEAD
            CompletableFuture<Void> result = apiInstance.createUsersWithArrayInput(body);

=======
            apiInstance.createUsersWithArrayInput(body);
>>>>>>> ooof
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUsersWithArrayInput");
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
 **body** | [**List&lt;User&gt;**](User.md)| List of user object |

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
| **0** | successful operation |  -  |


## createUsersWithListInput

<<<<<<< HEAD
> CompletableFuture<Void> createUsersWithListInput(body)
=======
> createUsersWithListInput(body)
>>>>>>> ooof

Creates list of users with given input array

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        List<User> body = Arrays.asList(); // List<User> | List of user object
        try {
<<<<<<< HEAD
            CompletableFuture<Void> result = apiInstance.createUsersWithListInput(body);

=======
            apiInstance.createUsersWithListInput(body);
>>>>>>> ooof
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUsersWithListInput");
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
 **body** | [**List&lt;User&gt;**](User.md)| List of user object |

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
| **0** | successful operation |  -  |


## deleteUser

<<<<<<< HEAD
> CompletableFuture<Void> deleteUser(username)
=======
> deleteUser(username)
>>>>>>> ooof

Delete user

This can only be done by the logged in user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be deleted
        try {
<<<<<<< HEAD
            CompletableFuture<Void> result = apiInstance.deleteUser(username);

=======
            apiInstance.deleteUser(username);
>>>>>>> ooof
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#deleteUser");
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
 **username** | **String**| The name that needs to be deleted |

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
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## getUserByName

<<<<<<< HEAD
> CompletableFuture<User> getUserByName(username)
=======
> User getUserByName(username)
>>>>>>> ooof

Get user by user name

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing.
        try {
<<<<<<< HEAD
            CompletableFuture<User> result = apiInstance.getUserByName(username);

=======
            User result = apiInstance.getUserByName(username);
>>>>>>> ooof
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserByName");
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
 **username** | **String**| The name that needs to be fetched. Use user1 for testing. |

### Return type

<<<<<<< HEAD
CompletableFuture<[**User**](User.md)>

=======
[**User**](User.md)
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
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## loginUser

<<<<<<< HEAD
> CompletableFuture<String> loginUser(username, password)
=======
> String loginUser(username, password)
>>>>>>> ooof

Logs user into the system

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | The user name for login
        String password = "password_example"; // String | The password for login in clear text
        try {
<<<<<<< HEAD
            CompletableFuture<String> result = apiInstance.loginUser(username, password);

=======
            String result = apiInstance.loginUser(username, password);
>>>>>>> ooof
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#loginUser");
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
 **username** | **String**| The user name for login |
 **password** | **String**| The password for login in clear text |

### Return type

<<<<<<< HEAD
CompletableFuture<**String**>

=======
**String**
>>>>>>> ooof

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * X-Rate-Limit - calls per hour allowed by the user <br>  * X-Expires-After - date in UTC when token expires <br>  |
| **400** | Invalid username/password supplied |  -  |


## logoutUser

<<<<<<< HEAD
> CompletableFuture<Void> logoutUser()
=======
> logoutUser()
>>>>>>> ooof

Logs out current logged in user session

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
<<<<<<< HEAD
            CompletableFuture<Void> result = apiInstance.logoutUser();

=======
            apiInstance.logoutUser();
>>>>>>> ooof
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#logoutUser");
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
| **0** | successful operation |  -  |


## updateUser

<<<<<<< HEAD
> CompletableFuture<Void> updateUser(username, body)
=======
> updateUser(username, body)
>>>>>>> ooof

Updated user

This can only be done by the logged in user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;
<<<<<<< HEAD
import java.util.concurrent.CompletableFuture;
=======
>>>>>>> ooof

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://petstore.swagger.io:80/v2");

        UserApi apiInstance = new UserApi(defaultClient);
        String username = "username_example"; // String | name that need to be deleted
        User body = new User(); // User | Updated user object
        try {
<<<<<<< HEAD
            CompletableFuture<Void> result = apiInstance.updateUser(username, body);

=======
            apiInstance.updateUser(username, body);
>>>>>>> ooof
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUser");
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
 **username** | **String**| name that need to be deleted |
 **body** | [**User**](User.md)| Updated user object |

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
| **400** | Invalid user supplied |  -  |
| **404** | User not found |  -  |

