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

import unittest

import petstore_api
from petstore_api.api.another_fake_api import AnotherFakeApi  # noqa: E501
<<<<<<< HEAD
=======
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestAnotherFakeApi(unittest.TestCase):
    """AnotherFakeApi unit test stubs"""

    def setUp(self):
<<<<<<< HEAD
        self.api = AnotherFakeApi()  # noqa: E501
=======
        self.api = petstore_api.api.another_fake_api.AnotherFakeApi()  # noqa: E501
>>>>>>> ooof

    def tearDown(self):
        pass

<<<<<<< HEAD
    def test_call_123_test_special_tags(self):
        """Test case for call_123_test_special_tags
=======
    def test_test_special_tags(self):
        """Test case for test_special_tags
>>>>>>> ooof

        To test special tags  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
