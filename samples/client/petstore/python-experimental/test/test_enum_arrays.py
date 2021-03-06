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
from petstore_api.model.enum_arrays import EnumArrays
=======

import unittest

import petstore_api
from petstore_api.models.enum_arrays import EnumArrays  # noqa: E501
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestEnumArrays(unittest.TestCase):
    """EnumArrays unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

<<<<<<< HEAD
    def test_enumarrays_init(self):
        #
        # Check various combinations of valid values.
        #
        fish_or_crab = EnumArrays(just_symbol=">=")
        self.assertEqual(fish_or_crab.just_symbol, ">=")
        # if optional property is unset we raise an exception
        with self.assertRaises(petstore_api.ApiAttributeError) as exc:
            self.assertEqual(fish_or_crab.array_enum, None)

        fish_or_crab = EnumArrays(just_symbol="$", array_enum=["fish"])
        self.assertEqual(fish_or_crab.just_symbol, "$")
        self.assertEqual(fish_or_crab.array_enum, ["fish"])

        fish_or_crab = EnumArrays(just_symbol=">=", array_enum=["fish"])
        self.assertEqual(fish_or_crab.just_symbol, ">=")
        self.assertEqual(fish_or_crab.array_enum, ["fish"])

        fish_or_crab = EnumArrays(just_symbol="$", array_enum=["crab"])
        self.assertEqual(fish_or_crab.just_symbol, "$")
        self.assertEqual(fish_or_crab.array_enum, ["crab"])


        #
        # Check if setting invalid values fails
        #
        with self.assertRaises(petstore_api.ApiValueError) as exc:
            fish_or_crab = EnumArrays(just_symbol="<=")

        with self.assertRaises(petstore_api.ApiValueError) as exc:
            fish_or_crab = EnumArrays(just_symbol="$", array_enum=["dog"])

        with self.assertRaises(petstore_api.ApiTypeError) as exc:
            fish_or_crab = EnumArrays(just_symbol=["$"], array_enum=["crab"])


    def test_enumarrays_setter(self):

        #
        # Check various combinations of valid values
        #
        fish_or_crab = EnumArrays()

        fish_or_crab.just_symbol = ">="
        self.assertEqual(fish_or_crab.just_symbol, ">=")

        fish_or_crab.just_symbol = "$"
        self.assertEqual(fish_or_crab.just_symbol, "$")

        fish_or_crab.array_enum = []
        self.assertEqual(fish_or_crab.array_enum, [])

        fish_or_crab.array_enum = ["fish"]
        self.assertEqual(fish_or_crab.array_enum, ["fish"])

        fish_or_crab.array_enum = ["fish", "fish", "fish"]
        self.assertEqual(fish_or_crab.array_enum, ["fish", "fish", "fish"])

        fish_or_crab.array_enum = ["crab"]
        self.assertEqual(fish_or_crab.array_enum, ["crab"])

        fish_or_crab.array_enum = ["crab", "fish"]
        self.assertEqual(fish_or_crab.array_enum, ["crab", "fish"])

        fish_or_crab.array_enum = ["crab", "fish", "crab", "fish"]
        self.assertEqual(fish_or_crab.array_enum, ["crab", "fish", "crab", "fish"])

        #
        # Check if setting invalid values fails
        #
        fish_or_crab = EnumArrays()
        with self.assertRaises(petstore_api.ApiValueError) as exc:
            fish_or_crab.just_symbol = "!="

        with self.assertRaises(petstore_api.ApiTypeError) as exc:
            fish_or_crab.just_symbol = ["fish"]

        with self.assertRaises(petstore_api.ApiValueError) as exc:
            fish_or_crab.array_enum = ["cat"]

        with self.assertRaises(petstore_api.ApiValueError) as exc:
            fish_or_crab.array_enum = ["fish", "crab", "dog"]

        with self.assertRaises(petstore_api.ApiTypeError) as exc:
            fish_or_crab.array_enum = "fish"


    def test_todict(self):
        #
        # Check if dictionary serialization works
        #
        dollar_fish_crab_dict = {
            'just_symbol': "$",
            'array_enum': ["fish", "crab"]
        }

        dollar_fish_crab = EnumArrays(
            just_symbol="$", array_enum=["fish", "crab"])

        self.assertEqual(dollar_fish_crab_dict, dollar_fish_crab.to_dict())

        #
        # Sanity check for different arrays
        #
        dollar_crab_fish_dict = {
            'just_symbol': "$",
            'array_enum': ["crab", "fish"]
        }

        dollar_fish_crab = EnumArrays(
            just_symbol="$", array_enum=["fish", "crab"])

        self.assertNotEqual(dollar_crab_fish_dict, dollar_fish_crab.to_dict())


    def test_equals(self):
        #
        # Check if object comparison works
        #
        fish1 = EnumArrays(just_symbol="$", array_enum=["fish"])
        fish2 = EnumArrays(just_symbol="$", array_enum=["fish"])
        self.assertEqual(fish1, fish2)

        fish = EnumArrays(just_symbol="$", array_enum=["fish"])
        crab = EnumArrays(just_symbol="$", array_enum=["crab"])
        self.assertNotEqual(fish, crab)

        dollar = EnumArrays(just_symbol="$")
        greater = EnumArrays(just_symbol=">=")
        self.assertNotEqual(dollar, greater)
=======
    def testEnumArrays(self):
        """Test EnumArrays"""
        # FIXME: construct object with mandatory attributes with example values
        # model = petstore_api.models.enum_arrays.EnumArrays()  # noqa: E501
        pass

>>>>>>> ooof

if __name__ == '__main__':
    unittest.main()
