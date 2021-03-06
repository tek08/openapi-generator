<?php

/**
<<<<<<< HEAD
 * OpenAPI Petstore
 * PHP version 7.2
 *
 * @package OpenAPIServer
=======
 * User
 *
 * PHP version 7.1
 *
 * @package OpenAPIServer\Model
>>>>>>> ooof
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
<<<<<<< HEAD
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
=======
>>>>>>> ooof
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

<<<<<<< HEAD
use OpenAPIServer\BaseModel;
=======
use OpenAPIServer\Interfaces\ModelInterface;
>>>>>>> ooof

/**
 * User
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
<<<<<<< HEAD
class User extends BaseModel
{
    /**
     * @var string Models namespace.
     * Can be required for data deserialization when model contains referenced schemas.
     */
    protected const MODELS_NAMESPACE = '\OpenAPIServer\Model';

    /**
     * @var string Constant with OAS schema of current class.
     * Should be overwritten by inherited class.
     */
    protected const MODEL_SCHEMA = <<<'SCHEMA'
{
  "title" : "a User",
=======
class User implements ModelInterface
{
    private const MODEL_SCHEMA = <<<'SCHEMA'
{
>>>>>>> ooof
  "type" : "object",
  "properties" : {
    "id" : {
      "type" : "integer",
<<<<<<< HEAD
      "format" : "int64"
=======
      "format" : "int64",
      "x-is-unique" : true
>>>>>>> ooof
    },
    "username" : {
      "type" : "string"
    },
    "firstName" : {
      "type" : "string"
    },
    "lastName" : {
      "type" : "string"
    },
    "email" : {
      "type" : "string"
    },
    "password" : {
      "type" : "string"
    },
    "phone" : {
      "type" : "string"
    },
    "userStatus" : {
      "type" : "integer",
      "description" : "User Status",
      "format" : "int32"
    }
  },
<<<<<<< HEAD
  "description" : "A User who is purchasing from the pet store",
=======
>>>>>>> ooof
  "xml" : {
    "name" : "User"
  }
}
SCHEMA;
<<<<<<< HEAD
=======

    /** @var int $id */
    private $id;

    /** @var string $username */
    private $username;

    /** @var string $firstName */
    private $firstName;

    /** @var string $lastName */
    private $lastName;

    /** @var string $email */
    private $email;

    /** @var string $password */
    private $password;

    /** @var string $phone */
    private $phone;

    /** @var int $userStatus User Status*/
    private $userStatus;

    /**
     * Returns model schema.
     *
     * @param bool $assoc When TRUE, returned objects will be converted into associative arrays. Default FALSE.
     *
     * @return array
     */
    public static function getOpenApiSchema($assoc = false)
    {
        return json_decode(static::MODEL_SCHEMA, $assoc);
    }
>>>>>>> ooof
}
