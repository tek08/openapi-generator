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
from petstore_api.model.client import Client
=======

import unittest

import petstore_api
from petstore_api.models.client import Client  # noqa: E501
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestClient(unittest.TestCase):
    """Client unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testClient(self):
        """Test Client"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = Client()  # noqa: E501
=======
        # model = petstore_api.models.client.Client()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
