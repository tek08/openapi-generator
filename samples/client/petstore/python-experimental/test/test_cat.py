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
try:
    from petstore_api.model import animal
except ImportError:
    animal = sys.modules[
        'petstore_api.model.animal']
try:
    from petstore_api.model import cat_all_of
except ImportError:
    cat_all_of = sys.modules[
        'petstore_api.model.cat_all_of']
from petstore_api.model.cat import Cat
=======

import unittest

import petstore_api
from petstore_api.models.cat import Cat  # noqa: E501
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestCat(unittest.TestCase):
    """Cat unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCat(self):
        """Test Cat"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = Cat()  # noqa: E501
=======
        # model = petstore_api.models.cat.Cat()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
