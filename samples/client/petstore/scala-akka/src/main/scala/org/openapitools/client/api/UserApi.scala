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
package org.openapitools.client.api

import org.openapitools.client.model.User
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object UserApi {

  def apply(baseUrl: String = "http://petstore.swagger.io/v2") = new UserApi(baseUrl)
}

class UserApi(baseUrl: String) {
  
  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
<<<<<<< HEAD
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param user Created user object
   */
  def createUser(user: User)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/user", "application/json")
      .withApiKey(apiKey, "AUTH_KEY", COOKIE)
      .withBody(user)
      .withDefaultErrorResponse[Unit]
=======
   * @param body Created user object
   */
  def createUser(body: User): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/user", "application/json")
      .withBody(body)
      .withDefaultSuccessResponse[Unit]
>>>>>>> ooof
      

  /**
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
<<<<<<< HEAD
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param user List of user object
   */
  def createUsersWithArrayInput(user: Seq[User])(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/user/createWithArray", "application/json")
      .withApiKey(apiKey, "AUTH_KEY", COOKIE)
      .withBody(user)
      .withDefaultErrorResponse[Unit]
=======
   * @param body List of user object
   */
  def createUsersWithArrayInput(body: Seq[User]): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/user/createWithArray", "application/json")
      .withBody(body)
      .withDefaultSuccessResponse[Unit]
>>>>>>> ooof
      

  /**
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
<<<<<<< HEAD
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param user List of user object
   */
  def createUsersWithListInput(user: Seq[User])(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/user/createWithList", "application/json")
      .withApiKey(apiKey, "AUTH_KEY", COOKIE)
      .withBody(user)
      .withDefaultErrorResponse[Unit]
=======
   * @param body List of user object
   */
  def createUsersWithListInput(body: Seq[User]): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/user/createWithList", "application/json")
      .withBody(body)
      .withDefaultSuccessResponse[Unit]
>>>>>>> ooof
      

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
<<<<<<< HEAD
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param username The name that needs to be deleted
   */
  def deleteUser(username: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/user/{username}", "application/json")
      .withApiKey(apiKey, "AUTH_KEY", COOKIE)
=======
   * @param username The name that needs to be deleted
   */
  def deleteUser(username: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/user/{username}", "application/json")
>>>>>>> ooof
      .withPathParam("username", username)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
      

  /**
   * Expected answers:
   *   code 200 : User (successful operation)
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.
   */
  def getUserByName(username: String): ApiRequest[User] =
    ApiRequest[User](ApiMethods.GET, baseUrl, "/user/{username}", "application/json")
      .withPathParam("username", username)
      .withSuccessResponse[User](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
      

  /**
   * Expected answers:
   *   code 200 : String (successful operation)
   *              Headers :
<<<<<<< HEAD
   *                Set-Cookie - Cookie authentication key for use with the `auth_cookie` apiKey authentication.
=======
>>>>>>> ooof
   *                X-Rate-Limit - calls per hour allowed by the user
   *                X-Expires-After - date in UTC when toekn expires
   *   code 400 :  (Invalid username/password supplied)
   * 
   * @param username The user name for login
   * @param password The password for login in clear text
   */
  def loginUser(username: String, password: String): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/user/login", "application/json")
      .withQueryParam("username", username)
      .withQueryParam("password", password)
      .withSuccessResponse[String](200)
      .withErrorResponse[Unit](400)
      
  object LoginUserHeaders {
<<<<<<< HEAD
    def setCookie(r: ApiReturnWithHeaders) = r.getStringHeader("Set-Cookie")
=======
>>>>>>> ooof
    def xRateLimit(r: ApiReturnWithHeaders) = r.getIntHeader("X-Rate-Limit")
    def xExpiresAfter(r: ApiReturnWithHeaders) = r.getOffsetDateTimeHeader("X-Expires-After")
  }

  /**
   * Expected answers:
   *   code 0 :  (successful operation)
<<<<<<< HEAD
   * 
   * Available security schemes:
   *   auth_cookie (apiKey)
   */
  def logoutUser()(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, baseUrl, "/user/logout", "application/json")
      .withApiKey(apiKey, "AUTH_KEY", COOKIE)
      .withDefaultErrorResponse[Unit]
=======
   */
  def logoutUser(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, baseUrl, "/user/logout", "application/json")
      .withDefaultSuccessResponse[Unit]
>>>>>>> ooof
      

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid user supplied)
   *   code 404 :  (User not found)
   * 
<<<<<<< HEAD
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param username name that need to be deleted
   * @param user Updated user object
   */
  def updateUser(username: String, user: User)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, baseUrl, "/user/{username}", "application/json")
      .withApiKey(apiKey, "AUTH_KEY", COOKIE)
      .withBody(user)
=======
   * @param username name that need to be deleted
   * @param body Updated user object
   */
  def updateUser(username: String, body: User): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, baseUrl, "/user/{username}", "application/json")
      .withBody(body)
>>>>>>> ooof
      .withPathParam("username", username)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
      



}

