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
from petstore_api.model.complex_quadrilateral import ComplexQuadrilateral
=======

import unittest

import petstore_api
>>>>>>> ooof


class TestComplexQuadrilateral(unittest.TestCase):
    """ComplexQuadrilateral unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testComplexQuadrilateral(self):
        """Test ComplexQuadrilateral"""
        # FIXME: construct object with mandatory attributes with example values
<<<<<<< HEAD
        # model = ComplexQuadrilateral()  # noqa: E501
=======
        # model = petstore_api.ComplexQuadrilateral()  # noqa: E501
>>>>>>> ooof
        pass


if __name__ == '__main__':
    unittest.main()
