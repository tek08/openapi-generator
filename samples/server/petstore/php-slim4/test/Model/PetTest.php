<?php

/**
<<<<<<< HEAD
 * OpenAPI Petstore
 * PHP version 7.2
 *
 * @package OpenAPIServer
=======
 * PetTest
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
=======
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
>>>>>>> ooof
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
use OpenAPIServer\Model\Pet;

/**
 * PetTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Pet
 */
class PetTest extends TestCase
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
     * Test "Pet"
     */
    public function testPet()
    {
        $testPet = new Pet();
<<<<<<< HEAD
        $namespacedClassname = Pet::getModelsNamespace() . '\\Pet';
        $this->assertSame('\\' . Pet::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "Pet" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "id" property in "Pet" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "category"
     */
    public function testPropertyCategory()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "category" property in "Pet" model has not been implemented yet.'
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
            'Test of "name" property in "Pet" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "photoUrls"
     */
    public function testPropertyPhotoUrls()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "photoUrls" property in "Pet" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "tags"
     */
    public function testPropertyTags()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "tags" property in "Pet" model has not been implemented yet.'
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
            'Test of "status" property in "Pet" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Pet::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
=======
>>>>>>> ooof
    }
}
