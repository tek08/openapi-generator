@file:Suppress("unused")
package org.openapitools.client.infrastructure

import java.lang.RuntimeException

<<<<<<< HEAD
open class ClientException(message: kotlin.String? = null, val statusCode: Int = -1, val response: Response? = null) : RuntimeException(message) {
=======
open class ClientException : RuntimeException {

    /**
     * Constructs an [ClientException] with no detail message.
     */
    constructor() : super()

    /**
     * Constructs an [ClientException] with the specified detail message.

     * @param   message   the detail message.
     */
    constructor(message: kotlin.String) : super(message)
>>>>>>> ooof

    companion object {
        private const val serialVersionUID: Long = 123L
    }
}

<<<<<<< HEAD
open class ServerException(message: kotlin.String? = null, val statusCode: Int = -1, val response: Response? = null) : RuntimeException(message) {
=======
open class ServerException : RuntimeException {

    /**
     * Constructs an [ServerException] with no detail message.
     */
    constructor() : super()

    /**
     * Constructs an [ServerException] with the specified detail message.

     * @param   message   the detail message.
     */
    constructor(message: kotlin.String) : super(message)
>>>>>>> ooof

    companion object {
        private const val serialVersionUID: Long = 456L
    }
}