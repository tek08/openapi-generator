<?php

/**
<<<<<<< HEAD
 * OpenAPI Petstore
 * PHP version 7.2
 *
 * @package OpenAPIServer
=======
 * InlineObject1
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
 * InlineObject1
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
<<<<<<< HEAD
class InlineObject1 extends BaseModel
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
=======
class InlineObject1 implements ModelInterface
{
    private const MODEL_SCHEMA = <<<'SCHEMA'
>>>>>>> ooof
{
  "type" : "object",
  "properties" : {
    "additionalMetadata" : {
      "type" : "string",
      "description" : "Additional data to pass to server"
    },
    "file" : {
      "type" : "string",
      "description" : "file to upload",
      "format" : "binary"
    }
  }
}
SCHEMA;
<<<<<<< HEAD
=======

    /** @var string $additionalMetadata Additional data to pass to server*/
    private $additionalMetadata;

    /** @var \SplFileObject $file file to upload*/
    private $file;

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
