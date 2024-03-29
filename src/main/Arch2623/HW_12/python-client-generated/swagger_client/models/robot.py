# coding: utf-8

"""
    Robot service 3.0

    API сервис управления роботом - пылесосом.  # noqa: E501

    OpenAPI spec version: 1.0.11
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class Robot(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'id': 'int',
        'model': 'str',
        'version': 'str',
        'charge': 'int',
        'garbage_container': 'int',
        'robot_pollution': 'int',
        'next_service': 'int',
        'serial_number': 'str',
        'ip_address': 'int',
        'group_id': 'int'
    }

    attribute_map = {
        'id': 'id',
        'model': 'model',
        'version': 'version',
        'charge': 'charge',
        'garbage_container': 'garbageContainer',
        'robot_pollution': 'robotPollution',
        'next_service': 'nextService',
        'serial_number': 'serialNumber',
        'ip_address': 'ipAddress',
        'group_id': 'groupId'
    }

    def __init__(self, id=None, model=None, version=None, charge=None, garbage_container=None, robot_pollution=None, next_service=None, serial_number=None, ip_address=None, group_id=None):  # noqa: E501
        """Robot - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._model = None
        self._version = None
        self._charge = None
        self._garbage_container = None
        self._robot_pollution = None
        self._next_service = None
        self._serial_number = None
        self._ip_address = None
        self._group_id = None
        self.discriminator = None
        if id is not None:
            self.id = id
        self.model = model
        self.version = version
        self.charge = charge
        self.garbage_container = garbage_container
        self.robot_pollution = robot_pollution
        self.next_service = next_service
        self.serial_number = serial_number
        self.ip_address = ip_address
        self.group_id = group_id

    @property
    def id(self):
        """Gets the id of this Robot.  # noqa: E501


        :return: The id of this Robot.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Robot.


        :param id: The id of this Robot.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def model(self):
        """Gets the model of this Robot.  # noqa: E501


        :return: The model of this Robot.  # noqa: E501
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this Robot.


        :param model: The model of this Robot.  # noqa: E501
        :type: str
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def version(self):
        """Gets the version of this Robot.  # noqa: E501


        :return: The version of this Robot.  # noqa: E501
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """Sets the version of this Robot.


        :param version: The version of this Robot.  # noqa: E501
        :type: str
        """
        if version is None:
            raise ValueError("Invalid value for `version`, must not be `None`")  # noqa: E501

        self._version = version

    @property
    def charge(self):
        """Gets the charge of this Robot.  # noqa: E501


        :return: The charge of this Robot.  # noqa: E501
        :rtype: int
        """
        return self._charge

    @charge.setter
    def charge(self, charge):
        """Sets the charge of this Robot.


        :param charge: The charge of this Robot.  # noqa: E501
        :type: int
        """
        if charge is None:
            raise ValueError("Invalid value for `charge`, must not be `None`")  # noqa: E501

        self._charge = charge

    @property
    def garbage_container(self):
        """Gets the garbage_container of this Robot.  # noqa: E501


        :return: The garbage_container of this Robot.  # noqa: E501
        :rtype: int
        """
        return self._garbage_container

    @garbage_container.setter
    def garbage_container(self, garbage_container):
        """Sets the garbage_container of this Robot.


        :param garbage_container: The garbage_container of this Robot.  # noqa: E501
        :type: int
        """
        if garbage_container is None:
            raise ValueError("Invalid value for `garbage_container`, must not be `None`")  # noqa: E501

        self._garbage_container = garbage_container

    @property
    def robot_pollution(self):
        """Gets the robot_pollution of this Robot.  # noqa: E501


        :return: The robot_pollution of this Robot.  # noqa: E501
        :rtype: int
        """
        return self._robot_pollution

    @robot_pollution.setter
    def robot_pollution(self, robot_pollution):
        """Sets the robot_pollution of this Robot.


        :param robot_pollution: The robot_pollution of this Robot.  # noqa: E501
        :type: int
        """
        if robot_pollution is None:
            raise ValueError("Invalid value for `robot_pollution`, must not be `None`")  # noqa: E501

        self._robot_pollution = robot_pollution

    @property
    def next_service(self):
        """Gets the next_service of this Robot.  # noqa: E501


        :return: The next_service of this Robot.  # noqa: E501
        :rtype: int
        """
        return self._next_service

    @next_service.setter
    def next_service(self, next_service):
        """Sets the next_service of this Robot.


        :param next_service: The next_service of this Robot.  # noqa: E501
        :type: int
        """
        if next_service is None:
            raise ValueError("Invalid value for `next_service`, must not be `None`")  # noqa: E501

        self._next_service = next_service

    @property
    def serial_number(self):
        """Gets the serial_number of this Robot.  # noqa: E501


        :return: The serial_number of this Robot.  # noqa: E501
        :rtype: str
        """
        return self._serial_number

    @serial_number.setter
    def serial_number(self, serial_number):
        """Sets the serial_number of this Robot.


        :param serial_number: The serial_number of this Robot.  # noqa: E501
        :type: str
        """
        if serial_number is None:
            raise ValueError("Invalid value for `serial_number`, must not be `None`")  # noqa: E501

        self._serial_number = serial_number

    @property
    def ip_address(self):
        """Gets the ip_address of this Robot.  # noqa: E501


        :return: The ip_address of this Robot.  # noqa: E501
        :rtype: int
        """
        return self._ip_address

    @ip_address.setter
    def ip_address(self, ip_address):
        """Sets the ip_address of this Robot.


        :param ip_address: The ip_address of this Robot.  # noqa: E501
        :type: int
        """
        if ip_address is None:
            raise ValueError("Invalid value for `ip_address`, must not be `None`")  # noqa: E501

        self._ip_address = ip_address

    @property
    def group_id(self):
        """Gets the group_id of this Robot.  # noqa: E501


        :return: The group_id of this Robot.  # noqa: E501
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this Robot.


        :param group_id: The group_id of this Robot.  # noqa: E501
        :type: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
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
        if issubclass(Robot, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Robot):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
