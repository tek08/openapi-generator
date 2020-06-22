<?php

namespace OpenAPI\Client;

use OpenAPI\Client\Api\UserApi;
use PHPUnit\Framework\TestCase;

class UserApiTest extends TestCase
{

    /** @var UserApi*/
    private $api;

<<<<<<< HEAD
    public function setUp(): void
=======
    public function setUp()
>>>>>>> ooof
    {
        $this->api = new Api\UserApi();
    }

    // test login use
    public function testLoginUser()
    {
        // initialize the API client
        // login
        $response = $this->api->loginUser('xxxxx', 'yyyyyyyy');
        
<<<<<<< HEAD
        $this->assertIsString($response);

        $pattern = '/logged in user session/';
        $assertMessage = "response string starts with 'logged in user session'";
        $this->assertIsString($response);
        if (method_exists($this, 'assertMatchesRegularExpression')) {
            $this->assertMatchesRegularExpression($pattern, $response, $assertMessage);
        } else {
            $this->assertRegExp($pattern, $response, $assertMessage);
        }
=======
        $this->assertInternalType('string', $response);
        $this->assertRegExp(
            '/logged in user session/',
            $response,
            "response string starts with 'logged in user session'"
        );
>>>>>>> ooof
    }
}
