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
from petstore_api.model.additional_properties_integer import AdditionalPropertiesInteger
=======

import unittest

import petstore_api
from petstore_api.models.additional_properties_integer import AdditionalPropertiesInteger  # noqa: E501
from petstore_api.rest import ApiException
from petstore_api.exceptions import ApiTypeError
>>>>>>> ooof


class TestAdditionalPropertiesInteger(unittest.TestCase):
    """AdditionalPropertiesInteger unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAdditionalPropertiesInteger(self):
        """Test AdditionalPropertiesInteger"""
        # can make model without additional properties
        model = AdditionalPropertiesInteger()

        # can make one with additional properties
        model = AdditionalPropertiesInteger(some_key=3)
        assert model['some_key'] == 3

        # type checking works on additional properties
<<<<<<< HEAD
        with self.assertRaises(petstore_api.ApiTypeError) as exc:
=======
        with self.assertRaises(ApiTypeError) as exc:
>>>>>>> ooof
            model = AdditionalPropertiesInteger(some_key=11.3)


if __name__ == '__main__':
    unittest.main()
