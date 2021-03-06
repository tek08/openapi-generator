package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ModelApiResponse
import org.openapitools.model.Pet

class PetApi {
    String basePath = "http://petstore.swagger.io/v2"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

<<<<<<< HEAD
    def addPet ( Pet pet, Closure onSuccess, Closure onFailure)  {
=======
    def addPet ( Pet body, Closure onSuccess, Closure onFailure)  {
>>>>>>> ooof
        String resourcePath = "/pet"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
<<<<<<< HEAD
        if (pet == null) {
            throw new RuntimeException("missing required params pet")
=======
        if (body == null) {
            throw new RuntimeException("missing required params body")
>>>>>>> ooof
        }



        contentType = 'application/json';
<<<<<<< HEAD
        bodyParams = pet
=======
        bodyParams = body
>>>>>>> ooof


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
<<<<<<< HEAD
                    Pet.class )
=======
                    null )
>>>>>>> ooof

    }

    def deletePet ( Long petId, String apiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pet/${petId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (petId == null) {
            throw new RuntimeException("missing required params petId")
        }


        if (apiKey != null) {
            headerParams.put("api_key", apiKey)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def findPetsByStatus ( List<String> status, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pet/findByStatus"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (status == null) {
            throw new RuntimeException("missing required params status")
        }

        if (status != null) {
            queryParams.put("status", status)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    Pet.class )

    }

    def findPetsByTags ( List<String> tags, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pet/findByTags"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (tags == null) {
            throw new RuntimeException("missing required params tags")
        }

        if (tags != null) {
            queryParams.put("tags", tags)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    Pet.class )

    }

    def getPetById ( Long petId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pet/${petId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (petId == null) {
            throw new RuntimeException("missing required params petId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Pet.class )

    }

<<<<<<< HEAD
    def updatePet ( Pet pet, Closure onSuccess, Closure onFailure)  {
=======
    def updatePet ( Pet body, Closure onSuccess, Closure onFailure)  {
>>>>>>> ooof
        String resourcePath = "/pet"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
<<<<<<< HEAD
        if (pet == null) {
            throw new RuntimeException("missing required params pet")
=======
        if (body == null) {
            throw new RuntimeException("missing required params body")
>>>>>>> ooof
        }



        contentType = 'application/json';
<<<<<<< HEAD
        bodyParams = pet
=======
        bodyParams = body
>>>>>>> ooof


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
<<<<<<< HEAD
                    Pet.class )
=======
                    null )
>>>>>>> ooof

    }

    def updatePetWithForm ( Long petId, String name, String status, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pet/${petId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (petId == null) {
            throw new RuntimeException("missing required params petId")
        }




        contentType = 'application/x-www-form-urlencoded';
        bodyParams = [:]
        bodyParams.put("name", name)
        bodyParams.put("status", status)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def uploadFile ( Long petId, String additionalMetadata, File file, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pet/${petId}/uploadImage"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (petId == null) {
            throw new RuntimeException("missing required params petId")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("additionalMetadata", additionalMetadata)
        bodyParams.put("file", file)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ModelApiResponse.class )

    }

}
