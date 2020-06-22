package org.openapitools.api;

import org.openapitools.api.ApiUtils
import java.util.List
import org.openapitools.model.User

class UserApi {
    String basePath = "http://petstore.swagger.io/v2"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

<<<<<<< HEAD
    def createUser ( User user, Closure onSuccess, Closure onFailure)  {
=======
    def createUser ( User body, Closure onSuccess, Closure onFailure)  {
>>>>>>> ooof
        String resourcePath = "/user"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
<<<<<<< HEAD
        if (user == null) {
            throw new RuntimeException("missing required params user")
=======
        if (body == null) {
            throw new RuntimeException("missing required params body")
>>>>>>> ooof
        }



        contentType = 'application/json';
<<<<<<< HEAD
        bodyParams = user
=======
        bodyParams = body
>>>>>>> ooof


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

<<<<<<< HEAD
    def createUsersWithArrayInput ( List<User> user, Closure onSuccess, Closure onFailure)  {
=======
    def createUsersWithArrayInput ( List<User> body, Closure onSuccess, Closure onFailure)  {
>>>>>>> ooof
        String resourcePath = "/user/createWithArray"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
<<<<<<< HEAD
        if (user == null) {
            throw new RuntimeException("missing required params user")
=======
        if (body == null) {
            throw new RuntimeException("missing required params body")
>>>>>>> ooof
        }



        contentType = 'application/json';
<<<<<<< HEAD
        bodyParams = user
=======
        bodyParams = body
>>>>>>> ooof


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

<<<<<<< HEAD
    def createUsersWithListInput ( List<User> user, Closure onSuccess, Closure onFailure)  {
=======
    def createUsersWithListInput ( List<User> body, Closure onSuccess, Closure onFailure)  {
>>>>>>> ooof
        String resourcePath = "/user/createWithList"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
<<<<<<< HEAD
        if (user == null) {
            throw new RuntimeException("missing required params user")
=======
        if (body == null) {
            throw new RuntimeException("missing required params body")
>>>>>>> ooof
        }



        contentType = 'application/json';
<<<<<<< HEAD
        bodyParams = user
=======
        bodyParams = body
>>>>>>> ooof


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def deleteUser ( String username, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/${username}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def getUserByName ( String username, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/${username}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    User.class )

    }

    def loginUser ( String username, String password, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/login"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }
        // verify required params are set
        if (password == null) {
            throw new RuntimeException("missing required params password")
        }

        if (username != null) {
            queryParams.put("username", username)
        }
        if (password != null) {
            queryParams.put("password", password)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def logoutUser ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/logout"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

<<<<<<< HEAD
    def updateUser ( String username, User user, Closure onSuccess, Closure onFailure)  {
=======
    def updateUser ( String username, User body, Closure onSuccess, Closure onFailure)  {
>>>>>>> ooof
        String resourcePath = "/user/${username}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }
        // verify required params are set
<<<<<<< HEAD
        if (user == null) {
            throw new RuntimeException("missing required params user")
=======
        if (body == null) {
            throw new RuntimeException("missing required params body")
>>>>>>> ooof
        }



        contentType = 'application/json';
<<<<<<< HEAD
        bodyParams = user
=======
        bodyParams = body
>>>>>>> ooof


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

}
