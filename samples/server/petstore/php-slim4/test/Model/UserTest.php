<?php

/**
<<<<<<< HEAD
 * OpenAPI Petstore
 * PHP version 7.2
 *
 * @package OpenAPIServer
=======
 * UserTest
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
use OpenAPIServer\Model\User;

/**
 * UserTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\User
 */
class UserTest extends TestCase
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
     * Test "User"
     */
    public function testUser()
    {
        $testUser = new User();
<<<<<<< HEAD
        $namespacedClassname = User::getModelsNamespace() . '\\User';
        $this->assertSame('\\' . User::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "User" model has not been implemented yet.'
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
            'Test of "id" property in "User" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "username"
     */
    public function testPropertyUsername()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "username" property in "User" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "firstName"
     */
    public function testPropertyFirstName()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "firstName" property in "User" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "lastName"
     */
    public function testPropertyLastName()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "lastName" property in "User" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "email"
     */
    public function testPropertyEmail()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "email" property in "User" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "password"
     */
    public function testPropertyPassword()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "password" property in "User" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "phone"
     */
    public function testPropertyPhone()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "phone" property in "User" model has not been implemented yet.'
        );
=======
>>>>>>> ooof
    }

    /**
     * Test attribute "userStatus"
     */
    public function testPropertyUserStatus()
    {
<<<<<<< HEAD
        $this->markTestIncomplete(
            'Test of "userStatus" property in "User" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = User::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
=======
>>>>>>> ooof
    }
}
