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
    from petstore_api.model import foo
except ImportError:
    foo = sys.modules[
        'petstore_api.model.foo']
from petstore_api.model.inline_response_default import InlineResponseDefault
=======

import unittest

import petstore_api
>>>>>>> ooof


class TestInlineResponseDefault(unittest.TestCase):
    """InlineResponseDefault unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testInlineResponseDefault(self):
        """Test InlineResponseDefault"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = InlineResponseDefault()  # noqa: E501
=======
        # model = petstore_api.InlineResponseDefault()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
