<?php

namespace OpenAPI\Client;

use GuzzleHttp\Client;
use PHPUnit\Framework\TestCase;

class ExceptionTest extends TestCase
{
<<<<<<< HEAD
    public function testNotFound()
    {
        $this->expectException(\OpenAPI\Client\ApiException::class);
        $this->expectExceptionCode(404);
        $this->expectExceptionMessage('http://petstore.swagger.io/INVALID_URL/store/inventory');
=======
    /**
     * @expectedException \OpenAPI\Client\ApiException
     * @expectedExceptionCode 404
     * @expectedExceptionMessage http://petstore.swagger.io/INVALID_URL/store/inventory
     */
    public function testNotFound()
    {
>>>>>>> ooof
        $config = new Configuration();
        $config->setHost('http://petstore.swagger.io/INVALID_URL');

        $api = new Api\StoreApi(
            new Client(),
            $config
        );
        $api->getInventory();
    }

<<<<<<< HEAD
    public function testWrongHost()
    {
        $this->expectException(\OpenAPI\Client\ApiException::class);
        $this->expectExceptionMessage('Could not resolve');
        $this->expectExceptionMessage('wrong_host.zxc');
=======
    /**
     * @expectedException \OpenAPI\Client\ApiException
     * @expectedExceptionMessage Could not resolve host
     */
    public function testWrongHost()
    {
>>>>>>> ooof
        $config = new Configuration();
        $config->setHost('http://wrong_host.zxc');

        $api = new Api\StoreApi(
            new Client(),
            $config
        );
        $api->getInventory();
    }
}
