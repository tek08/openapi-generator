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
    from petstore_api.model import quadrilateral_interface
except ImportError:
    quadrilateral_interface = sys.modules[
        'petstore_api.model.quadrilateral_interface']
try:
    from petstore_api.model import shape_interface
except ImportError:
    shape_interface = sys.modules[
        'petstore_api.model.shape_interface']
from petstore_api.model.simple_quadrilateral import SimpleQuadrilateral
=======

import unittest

import petstore_api
>>>>>>> ooof


class TestSimpleQuadrilateral(unittest.TestCase):
    """SimpleQuadrilateral unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSimpleQuadrilateral(self):
        """Test SimpleQuadrilateral"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = SimpleQuadrilateral()  # noqa: E501
=======
        # model = petstore_api.SimpleQuadrilateral()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
