<?php

/**
<<<<<<< HEAD
 * OpenAPI Petstore
 * PHP version 7.2
 *
 * @package OpenAPIServer
=======
 * InlineObjectTest
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
=======
 * OpenAPI Petstore
 *
>>>>>>> ooof
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\InlineObject;

/**
 * InlineObjectTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\InlineObject
 */
class InlineObjectTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
<<<<<<< HEAD
    public static function setUpBeforeClass(): void
=======
    public static function setUpBeforeClass()
>>>>>>> ooof
    {
    }

    /**
     * Setup before running each test case
     */
<<<<<<< HEAD
    public function setUp(): void
=======
    public function setUp()
>>>>>>> ooof
    {
    }

    /**
     * Clean up after running each test case
     */
<<<<<<< HEAD
    public function tearDown(): void
=======
    public function tearDown()
>>>>>>> ooof
    {
    }

    /**
     * Clean up after running all test cases
     */
<<<<<<< HEAD
    public static function tearDownAfterClass(): void
=======
    public static function tearDownAfterClass()
>>>>>>> ooof
    {
    }

    /**
     * Test "InlineObject"
     */
    public function testInlineObject()
    {
        $testInlineObject = new InlineObject();
<<<<<<< HEAD
        $namespacedClassname = InlineObject::getModelsNamespace() . '\\InlineObject';
        $this->assertSame('\\' . InlineObject::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "InlineObject" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "name" property in "InlineObject" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "status" property in "InlineObject" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
<<<<<<< HEAD
        $schemaArr = InlineObject::getOpenApiSchema();
=======
        $schemaObject = InlineObject::getOpenApiSchema();
        $schemaArr = InlineObject::getOpenApiSchema(true);
        $this->assertIsObject($schemaObject);
>>>>>>> ooof
        $this->assertIsArray($schemaArr);
    }
}
