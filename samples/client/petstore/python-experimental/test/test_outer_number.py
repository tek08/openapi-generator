# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import
<<<<<<< HEAD
import sys
import unittest

import petstore_api
from petstore_api.model.outer_number import OuterNumber
=======

import unittest

import petstore_api
from petstore_api.models.outer_number import OuterNumber  # noqa: E501
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestOuterNumber(unittest.TestCase):
    """OuterNumber unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testOuterNumber(self):
        """Test OuterNumber"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = OuterNumber()  # noqa: E501
=======
        # model = petstore_api.models.outer_number.OuterNumber()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
