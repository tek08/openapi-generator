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
    from petstore_api.model import child_cat_all_of
except ImportError:
    child_cat_all_of = sys.modules[
        'petstore_api.model.child_cat_all_of']
try:
    from petstore_api.model import parent_pet
except ImportError:
    parent_pet = sys.modules[
        'petstore_api.model.parent_pet']
from petstore_api.model.child_cat import ChildCat
=======

import unittest

import petstore_api
>>>>>>> ooof


class TestChildCat(unittest.TestCase):
    """ChildCat unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testChildCat(self):
        """Test ChildCat"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = ChildCat()  # noqa: E501
=======
        # model = petstore_api.ChildCat()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
