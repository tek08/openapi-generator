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
    from petstore_api.model import child_cat
except ImportError:
    child_cat = sys.modules[
        'petstore_api.model.child_cat']
try:
    from petstore_api.model import child_dog
except ImportError:
    child_dog = sys.modules[
        'petstore_api.model.child_dog']
try:
    from petstore_api.model import child_lizard
except ImportError:
    child_lizard = sys.modules[
        'petstore_api.model.child_lizard']
try:
    from petstore_api.model import grandparent_animal
except ImportError:
    grandparent_animal = sys.modules[
        'petstore_api.model.grandparent_animal']
from petstore_api.model.parent_pet import ParentPet
=======

import unittest

import petstore_api
>>>>>>> ooof


class TestParentPet(unittest.TestCase):
    """ParentPet unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testParentPet(self):
        """Test ParentPet"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = ParentPet()  # noqa: E501
=======
        # model = petstore_api.ParentPet()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
