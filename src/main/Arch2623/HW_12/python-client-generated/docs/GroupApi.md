# swagger_client.GroupApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_group**](GroupApi.md#add_group) | **POST** /Group | Добавить группу
[**delete_group**](GroupApi.md#delete_group) | **DELETE** /Group/deleteById/{groupId} | Удаляет группу
[**get_group_by_id**](GroupApi.md#get_group_by_id) | **GET** /Group/findById/{groupId} | Найти группу по ID
[**update_group**](GroupApi.md#update_group) | **PUT** /Group | Обновить группу

# **add_group**
> Group add_group(body)

Добавить группу

Добавить группу в базу

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
body = swagger_client.Group() # Group | Создать новую группу в базе

try:
    # Добавить группу
    api_response = api_instance.add_group(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupApi->add_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Создать новую группу в базе | 

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_group**
> delete_group(group_id, group_id=group_id)

Удаляет группу

Удаляет группу

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
group_id = 789 # int | ID пользователя
group_id = 'group_id_example' # str |  (optional)

try:
    # Удаляет группу
    api_instance.delete_group(group_id, group_id=group_id)
except ApiException as e:
    print("Exception when calling GroupApi->delete_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **int**| ID пользователя | 
 **group_id** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_group_by_id**
> Group get_group_by_id(group_id)

Найти группу по ID

вернуть группу

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
group_id = 789 # int | Идентификатор группы

try:
    # Найти группу по ID
    api_response = api_instance.get_group_by_id(group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupApi->get_group_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **int**| Идентификатор группы | 

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_group**
> Group update_group(body)

Обновить группу

Обновить группу

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GroupApi()
body = swagger_client.Group() # Group | Обновить существующую группу в базе

try:
    # Обновить группу
    api_response = api_instance.update_group(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupApi->update_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Обновить существующую группу в базе | 

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

