# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from petstore_api.configuration import Configuration


class FormatTest(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'integer': 'int',
        'int32': 'int',
        'int64': 'int',
        'number': 'float',
        'float': 'float',
        'double': 'float',
        'string': 'str',
        'byte': 'str',
        'binary': 'file',
        'date': 'date',
        'date_time': 'datetime',
        'uuid': 'str',
        'password': 'str',
        'pattern_with_digits': 'str',
        'pattern_with_digits_and_delimiter': 'str'
    }

    attribute_map = {
        'integer': 'integer',
        'int32': 'int32',
        'int64': 'int64',
        'number': 'number',
        'float': 'float',
        'double': 'double',
        'string': 'string',
        'byte': 'byte',
        'binary': 'binary',
        'date': 'date',
        'date_time': 'dateTime',
        'uuid': 'uuid',
        'password': 'password',
        'pattern_with_digits': 'pattern_with_digits',
        'pattern_with_digits_and_delimiter': 'pattern_with_digits_and_delimiter'
    }

    def __init__(self, integer=None, int32=None, int64=None, number=None, float=None, double=None, string=None, byte=None, binary=None, date=None, date_time=None, uuid=None, password=None, pattern_with_digits=None, pattern_with_digits_and_delimiter=None, local_vars_configuration=None):  # noqa: E501
        """FormatTest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._integer = None
        self._int32 = None
        self._int64 = None
        self._number = None
        self._float = None
        self._double = None
        self._string = None
        self._byte = None
        self._binary = None
        self._date = None
        self._date_time = None
        self._uuid = None
        self._password = None
        self._pattern_with_digits = None
        self._pattern_with_digits_and_delimiter = None
        self.discriminator = None

        if integer is not None:
            self.integer = integer
        if int32 is not None:
            self.int32 = int32
        if int64 is not None:
            self.int64 = int64
        self.number = number
        if float is not None:
            self.float = float
        if double is not None:
            self.double = double
        if string is not None:
            self.string = string
        self.byte = byte
        if binary is not None:
            self.binary = binary
        self.date = date
        if date_time is not None:
            self.date_time = date_time
        if uuid is not None:
            self.uuid = uuid
        self.password = password
        if pattern_with_digits is not None:
            self.pattern_with_digits = pattern_with_digits
        if pattern_with_digits_and_delimiter is not None:
            self.pattern_with_digits_and_delimiter = pattern_with_digits_and_delimiter

    @property
    def integer(self):
        """Gets the integer of this FormatTest.  # noqa: E501


        :return: The integer of this FormatTest.  # noqa: E501
        :rtype: int
        """
        return self._integer

    @integer.setter
    def integer(self, integer):
        """Sets the integer of this FormatTest.


        :param integer: The integer of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type integer: int
=======
        :type: int
>>>>>>> ooof
        """
        if (self.local_vars_configuration.client_side_validation and
                integer is not None and integer > 100):  # noqa: E501
            raise ValueError("Invalid value for `integer`, must be a value less than or equal to `100`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                integer is not None and integer < 10):  # noqa: E501
            raise ValueError("Invalid value for `integer`, must be a value greater than or equal to `10`")  # noqa: E501

        self._integer = integer

    @property
    def int32(self):
        """Gets the int32 of this FormatTest.  # noqa: E501


        :return: The int32 of this FormatTest.  # noqa: E501
        :rtype: int
        """
        return self._int32

    @int32.setter
    def int32(self, int32):
        """Sets the int32 of this FormatTest.


        :param int32: The int32 of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type int32: int
=======
        :type: int
>>>>>>> ooof
        """
        if (self.local_vars_configuration.client_side_validation and
                int32 is not None and int32 > 200):  # noqa: E501
            raise ValueError("Invalid value for `int32`, must be a value less than or equal to `200`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                int32 is not None and int32 < 20):  # noqa: E501
            raise ValueError("Invalid value for `int32`, must be a value greater than or equal to `20`")  # noqa: E501

        self._int32 = int32

    @property
    def int64(self):
        """Gets the int64 of this FormatTest.  # noqa: E501


        :return: The int64 of this FormatTest.  # noqa: E501
        :rtype: int
        """
        return self._int64

    @int64.setter
    def int64(self, int64):
        """Sets the int64 of this FormatTest.


        :param int64: The int64 of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type int64: int
=======
        :type: int
>>>>>>> ooof
        """

        self._int64 = int64

    @property
    def number(self):
        """Gets the number of this FormatTest.  # noqa: E501


        :return: The number of this FormatTest.  # noqa: E501
        :rtype: float
        """
        return self._number

    @number.setter
    def number(self, number):
        """Sets the number of this FormatTest.


        :param number: The number of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type number: float
=======
        :type: float
>>>>>>> ooof
        """
        if self.local_vars_configuration.client_side_validation and number is None:  # noqa: E501
            raise ValueError("Invalid value for `number`, must not be `None`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                number is not None and number > 543.2):  # noqa: E501
            raise ValueError("Invalid value for `number`, must be a value less than or equal to `543.2`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                number is not None and number < 32.1):  # noqa: E501
            raise ValueError("Invalid value for `number`, must be a value greater than or equal to `32.1`")  # noqa: E501

        self._number = number

    @property
    def float(self):
        """Gets the float of this FormatTest.  # noqa: E501


        :return: The float of this FormatTest.  # noqa: E501
        :rtype: float
        """
        return self._float

    @float.setter
    def float(self, float):
        """Sets the float of this FormatTest.


        :param float: The float of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type float: float
=======
        :type: float
>>>>>>> ooof
        """
        if (self.local_vars_configuration.client_side_validation and
                float is not None and float > 987.6):  # noqa: E501
            raise ValueError("Invalid value for `float`, must be a value less than or equal to `987.6`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                float is not None and float < 54.3):  # noqa: E501
            raise ValueError("Invalid value for `float`, must be a value greater than or equal to `54.3`")  # noqa: E501

        self._float = float

    @property
    def double(self):
        """Gets the double of this FormatTest.  # noqa: E501


        :return: The double of this FormatTest.  # noqa: E501
        :rtype: float
        """
        return self._double

    @double.setter
    def double(self, double):
        """Sets the double of this FormatTest.


        :param double: The double of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type double: float
=======
        :type: float
>>>>>>> ooof
        """
        if (self.local_vars_configuration.client_side_validation and
                double is not None and double > 123.4):  # noqa: E501
            raise ValueError("Invalid value for `double`, must be a value less than or equal to `123.4`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                double is not None and double < 67.8):  # noqa: E501
            raise ValueError("Invalid value for `double`, must be a value greater than or equal to `67.8`")  # noqa: E501

        self._double = double

    @property
    def string(self):
        """Gets the string of this FormatTest.  # noqa: E501


        :return: The string of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._string

    @string.setter
    def string(self, string):
        """Sets the string of this FormatTest.


        :param string: The string of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type string: str
=======
        :type: str
>>>>>>> ooof
        """
        if (self.local_vars_configuration.client_side_validation and
                string is not None and not re.search(r'[a-z]', string, flags=re.IGNORECASE)):  # noqa: E501
            raise ValueError(r"Invalid value for `string`, must be a follow pattern or equal to `/[a-z]/i`")  # noqa: E501

        self._string = string

    @property
    def byte(self):
        """Gets the byte of this FormatTest.  # noqa: E501


        :return: The byte of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._byte

    @byte.setter
    def byte(self, byte):
        """Sets the byte of this FormatTest.


        :param byte: The byte of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type byte: str
=======
        :type: str
>>>>>>> ooof
        """
        if self.local_vars_configuration.client_side_validation and byte is None:  # noqa: E501
            raise ValueError("Invalid value for `byte`, must not be `None`")  # noqa: E501

        self._byte = byte

    @property
    def binary(self):
        """Gets the binary of this FormatTest.  # noqa: E501


        :return: The binary of this FormatTest.  # noqa: E501
        :rtype: file
        """
        return self._binary

    @binary.setter
    def binary(self, binary):
        """Sets the binary of this FormatTest.


        :param binary: The binary of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type binary: file
=======
        :type: file
>>>>>>> ooof
        """

        self._binary = binary

    @property
    def date(self):
        """Gets the date of this FormatTest.  # noqa: E501


        :return: The date of this FormatTest.  # noqa: E501
        :rtype: date
        """
        return self._date

    @date.setter
    def date(self, date):
        """Sets the date of this FormatTest.


        :param date: The date of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type date: date
=======
        :type: date
>>>>>>> ooof
        """
        if self.local_vars_configuration.client_side_validation and date is None:  # noqa: E501
            raise ValueError("Invalid value for `date`, must not be `None`")  # noqa: E501

        self._date = date

    @property
    def date_time(self):
        """Gets the date_time of this FormatTest.  # noqa: E501


        :return: The date_time of this FormatTest.  # noqa: E501
        :rtype: datetime
        """
        return self._date_time

    @date_time.setter
    def date_time(self, date_time):
        """Sets the date_time of this FormatTest.


        :param date_time: The date_time of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type date_time: datetime
=======
        :type: datetime
>>>>>>> ooof
        """

        self._date_time = date_time

    @property
    def uuid(self):
        """Gets the uuid of this FormatTest.  # noqa: E501


        :return: The uuid of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid):
        """Sets the uuid of this FormatTest.


        :param uuid: The uuid of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type uuid: str
=======
        :type: str
>>>>>>> ooof
        """

        self._uuid = uuid

    @property
    def password(self):
        """Gets the password of this FormatTest.  # noqa: E501


        :return: The password of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this FormatTest.


        :param password: The password of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type password: str
=======
        :type: str
>>>>>>> ooof
        """
        if self.local_vars_configuration.client_side_validation and password is None:  # noqa: E501
            raise ValueError("Invalid value for `password`, must not be `None`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                password is not None and len(password) > 64):
            raise ValueError("Invalid value for `password`, length must be less than or equal to `64`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                password is not None and len(password) < 10):
            raise ValueError("Invalid value for `password`, length must be greater than or equal to `10`")  # noqa: E501

        self._password = password

    @property
    def pattern_with_digits(self):
        """Gets the pattern_with_digits of this FormatTest.  # noqa: E501

        A string that is a 10 digit number. Can have leading zeros.  # noqa: E501

        :return: The pattern_with_digits of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._pattern_with_digits

    @pattern_with_digits.setter
    def pattern_with_digits(self, pattern_with_digits):
        """Sets the pattern_with_digits of this FormatTest.

        A string that is a 10 digit number. Can have leading zeros.  # noqa: E501

        :param pattern_with_digits: The pattern_with_digits of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type pattern_with_digits: str
=======
        :type: str
>>>>>>> ooof
        """
        if (self.local_vars_configuration.client_side_validation and
                pattern_with_digits is not None and not re.search(r'^\d{10}$', pattern_with_digits)):  # noqa: E501
            raise ValueError(r"Invalid value for `pattern_with_digits`, must be a follow pattern or equal to `/^\d{10}$/`")  # noqa: E501

        self._pattern_with_digits = pattern_with_digits

    @property
    def pattern_with_digits_and_delimiter(self):
        """Gets the pattern_with_digits_and_delimiter of this FormatTest.  # noqa: E501

        A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.  # noqa: E501

        :return: The pattern_with_digits_and_delimiter of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._pattern_with_digits_and_delimiter

    @pattern_with_digits_and_delimiter.setter
    def pattern_with_digits_and_delimiter(self, pattern_with_digits_and_delimiter):
        """Sets the pattern_with_digits_and_delimiter of this FormatTest.

        A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.  # noqa: E501

        :param pattern_with_digits_and_delimiter: The pattern_with_digits_and_delimiter of this FormatTest.  # noqa: E501
<<<<<<< HEAD
        :type pattern_with_digits_and_delimiter: str
=======
        :type: str
>>>>>>> ooof
        """
        if (self.local_vars_configuration.client_side_validation and
                pattern_with_digits_and_delimiter is not None and not re.search(r'^image_\d{1,3}$', pattern_with_digits_and_delimiter, flags=re.IGNORECASE)):  # noqa: E501
            raise ValueError(r"Invalid value for `pattern_with_digits_and_delimiter`, must be a follow pattern or equal to `/^image_\d{1,3}$/i`")  # noqa: E501

        self._pattern_with_digits_and_delimiter = pattern_with_digits_and_delimiter

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, FormatTest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, FormatTest):
            return True

        return self.to_dict() != other.to_dict()
