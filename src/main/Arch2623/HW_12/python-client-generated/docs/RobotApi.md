# swagger_client.RobotApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_robot**](RobotApi.md#add_robot) | **POST** /Robot | Добавить робота
[**delete_robot**](RobotApi.md#delete_robot) | **DELETE** /Robot/deleteById/{robotId} | Удаляет робота
[**get_robot_by_id**](RobotApi.md#get_robot_by_id) | **GET** /Robot/findById/{robotId} | Найти робота по ID
[**update_robot**](RobotApi.md#update_robot) | **PUT** /Robot | Обновить робота

# **add_robot**
> Robot add_robot(body)

Добавить робота

Добавить робота в базу

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
body = swagger_client.Robot() # Robot | Создание нового робота в базе

try:
    # Добавить робота
    api_response = api_instance.add_robot(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RobotApi->add_robot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Создание нового робота в базе | 

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_robot**
> delete_robot(robot_id, robot_id=robot_id)

Удаляет робота

Удаляет робота

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
robot_id = 789 # int | ID робота
robot_id = 'robot_id_example' # str |  (optional)

try:
    # Удаляет робота
    api_instance.delete_robot(robot_id, robot_id=robot_id)
except ApiException as e:
    print("Exception when calling RobotApi->delete_robot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robot_id** | **int**| ID робота | 
 **robot_id** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_robot_by_id**
> Robot get_robot_by_id(robot_id)

Найти робота по ID

вернуть робота

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
robot_id = 789 # int | Идентификатор робота

try:
    # Найти робота по ID
    api_response = api_instance.get_robot_by_id(robot_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RobotApi->get_robot_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robot_id** | **int**| Идентификатор робота | 

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_robot**
> Robot update_robot(body)

Обновить робота

Обновить робота

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.RobotApi()
body = swagger_client.Robot() # Robot | Обновить существующего робота в базе

try:
    # Обновить робота
    api_response = api_instance.update_robot(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RobotApi->update_robot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Обновить существующего робота в базе | 

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

