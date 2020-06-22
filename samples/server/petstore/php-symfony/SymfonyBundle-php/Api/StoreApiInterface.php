<?php
/**
 * StoreApiInterface
<<<<<<< HEAD
 * PHP version 7.1.3
=======
 * PHP version 5
>>>>>>> ooof
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\Order;

/**
 * StoreApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface StoreApiInterface
{

    /**
     * Sets authentication method api_key
     *
     * @param string $value Value of the api_key authentication method.
     *
     * @return void
     */
    public function setapi_key($value);

    /**
     * Operation deleteOrder
     *
     * Delete purchase order by ID
     *
     * @param  string $orderId  ID of the order that needs to be deleted (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function deleteOrder($orderId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getInventory
     *
     * Returns pet inventories by status
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return int
     *
     */
    public function getInventory(&$responseCode, array &$responseHeaders);

    /**
     * Operation getOrderById
     *
     * Find purchase order by ID
     *
     * @param  int $orderId  ID of pet that needs to be fetched (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Order
     *
     */
    public function getOrderById($orderId, &$responseCode, array &$responseHeaders);

    /**
     * Operation placeOrder
     *
     * Place an order for a pet
     *
     * @param  OpenAPI\Server\Model\Order $body  order placed for purchasing the pet (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\Order
     *
     */
    public function placeOrder(Order $body, &$responseCode, array &$responseHeaders);
}
