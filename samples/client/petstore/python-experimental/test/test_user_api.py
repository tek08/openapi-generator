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
from petstore_api.api.user_api import UserApi  # noqa: E501
<<<<<<< HEAD
=======
from petstore_api.rest import ApiException
>>>>>>> ooof


class TestUserApi(unittest.TestCase):
    """UserApi unit test stubs"""

    def setUp(self):
<<<<<<< HEAD
        self.api = UserApi()  # noqa: E501
=======
        self.api = petstore_api.api.user_api.UserApi()  # noqa: E501
>>>>>>> ooof

    def tearDown(self):
        pass

    def test_create_user(self):
        """Test case for create_user

        Create user  # noqa: E501
        """
        pass

    def test_create_users_with_array_input(self):
        """Test case for create_users_with_array_input

        Creates list of users with given input array  # noqa: E501
        """
        pass

    def test_create_users_with_list_input(self):
        """Test case for create_users_with_list_input

        Creates list of users with given input array  # noqa: E501
        """
        pass

    def test_delete_user(self):
        """Test case for delete_user

        Delete user  # noqa: E501
        """
        pass

    def test_get_user_by_name(self):
        """Test case for get_user_by_name

        Get user by user name  # noqa: E501
        """
        pass

    def test_login_user(self):
        """Test case for login_user

        Logs user into the system  # noqa: E501
        """
        pass

    def test_logout_user(self):
        """Test case for logout_user

        Logs out current logged in user session  # noqa: E501
        """
        pass

    def test_update_user(self):
        """Test case for update_user

        Updated user  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
