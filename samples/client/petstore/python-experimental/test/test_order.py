# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

<<<<<<< HEAD
    The version of the OpenAPI document: 1.0.0
=======
    OpenAPI spec version: 1.0.0
>>>>>>> ooof
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import
<<<<<<< HEAD
import sys
import unittest

import petstore_api
from petstore_api.model.order import Order
=======

import unittest

import petstore_api
from petstore_api.models.order import Order  # noqa: E501
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestOrder(unittest.TestCase):
    """Order unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testOrder(self):
        """Test Order"""
<<<<<<< HEAD
        order = Order()
        order.status = "placed"
        self.assertEqual("placed", order.status)
        with self.assertRaises(petstore_api.ApiValueError):
            order.status = "invalid"

=======
        # FIXME: construct object with mandatory attributes with example values
        # model = petstore_api.models.order.Order()  # noqa: E501
        pass
>>>>>>> ooof


if __name__ == '__main__':
    unittest.main()
