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
try:
    from petstore_api.model import animal
except ImportError:
    animal = sys.modules[
        'petstore_api.model.animal']
try:
    from petstore_api.model import dog_all_of
except ImportError:
    dog_all_of = sys.modules[
        'petstore_api.model.dog_all_of']
from petstore_api.model.dog import Dog
=======

import unittest

import petstore_api
>>>>>>> ooof


class TestDog(unittest.TestCase):
    """Dog unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDog(self):
        """Test Dog"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = Dog()  # noqa: E501
=======
        # model = petstore_api.Dog()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
