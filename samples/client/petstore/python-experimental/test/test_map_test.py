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
    from petstore_api.model import string_boolean_map
except ImportError:
    string_boolean_map = sys.modules[
        'petstore_api.model.string_boolean_map']
from petstore_api.model.map_test import MapTest
=======

import unittest

import petstore_api
from petstore_api.models.map_test import MapTest  # noqa: E501
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestMapTest(unittest.TestCase):
    """MapTest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

<<<<<<< HEAD
    def test_maptest_init(self):
        #
        # Test MapTest construction with valid values
        #
        up_or_low_dict = {
            'UPPER': "UP",
            'lower': "low"
        }
        map_enum_test = MapTest(map_of_enum_string=up_or_low_dict)

        self.assertEqual(map_enum_test.map_of_enum_string, up_or_low_dict)

        map_of_map_of_strings = {
            'valueDict': up_or_low_dict
        }
        map_enum_test = MapTest(map_map_of_string=map_of_map_of_strings)

        self.assertEqual(map_enum_test.map_map_of_string, map_of_map_of_strings)

        #
        # Make sure that the init fails for invalid enum values
        #
        black_or_white_dict = {
            'black': "UP",
            'white': "low"
        }
        with self.assertRaises(petstore_api.ApiValueError):
            MapTest(map_of_enum_string=black_or_white_dict)

    def test_maptest_setter(self):
        #
        # Check with some valid values
        #
        map_enum_test = MapTest()
        up_or_low_dict = {
            'UPPER': "UP",
            'lower': "low"
        }
        map_enum_test.map_of_enum_string = up_or_low_dict
        self.assertEqual(map_enum_test.map_of_enum_string, up_or_low_dict)

        #
        # Check if the setter fails for invalid enum values
        #
        map_enum_test = MapTest()
        black_or_white_dict = {
            'black': "UP",
            'white': "low"
        }
        with self.assertRaises(petstore_api.ApiValueError):
            map_enum_test.map_of_enum_string = black_or_white_dict

    def test_todict(self):
        #
        # Check dictionary serialization
        #
        map_enum_test = MapTest()
        up_or_low_dict = {
            'UPPER': "UP",
            'lower': "low"
        }
        map_of_map_of_strings = {
            'valueDict': up_or_low_dict
        }
        indirect_map = string_boolean_map.StringBooleanMap(**{
            'option1': True
        })
        direct_map = {
            'option2': False
        }
        map_enum_test.map_of_enum_string = up_or_low_dict
        map_enum_test.map_map_of_string = map_of_map_of_strings
        map_enum_test.indirect_map = indirect_map
        map_enum_test.direct_map = direct_map

        self.assertEqual(map_enum_test.map_of_enum_string, up_or_low_dict)
        self.assertEqual(map_enum_test.map_map_of_string, map_of_map_of_strings)
        self.assertEqual(map_enum_test.indirect_map, indirect_map)
        self.assertEqual(map_enum_test.direct_map, direct_map)

        expected_dict = {
            'map_of_enum_string': up_or_low_dict,
            'map_map_of_string': map_of_map_of_strings,
            'indirect_map': indirect_map.to_dict(),
            'direct_map': direct_map
        }

        self.assertEqual(map_enum_test.to_dict(), expected_dict)
=======
    def testMapTest(self):
        """Test MapTest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = petstore_api.models.map_test.MapTest()  # noqa: E501
        pass

>>>>>>> ooof

if __name__ == '__main__':
    unittest.main()
