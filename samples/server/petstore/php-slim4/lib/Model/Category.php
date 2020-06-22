<?php

/**
<<<<<<< HEAD
 * OpenAPI Petstore
 * PHP version 7.2
 *
 * @package OpenAPIServer
=======
 * Category
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
 * Category
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
<<<<<<< HEAD
class Category extends BaseModel
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
  "title" : "Pet category",
=======
class Category implements ModelInterface
{
    private const MODEL_SCHEMA = <<<'SCHEMA'
{
  "required" : [ "name" ],
>>>>>>> ooof
  "type" : "object",
  "properties" : {
    "id" : {
      "type" : "integer",
      "format" : "int64"
    },
    "name" : {
<<<<<<< HEAD
      "pattern" : "^[a-zA-Z0-9]+[a-zA-Z0-9\\.\\-_]*[a-zA-Z0-9]+$",
      "type" : "string"
    }
  },
  "description" : "A category for a pet",
=======
      "type" : "string",
      "default" : "default-name"
    }
  },
>>>>>>> ooof
  "xml" : {
    "name" : "Category"
  }
}
SCHEMA;
<<<<<<< HEAD
=======

    /** @var int $id */
    private $id;

    /** @var string $name */
    private $name;

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
