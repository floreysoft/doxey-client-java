# DefaultApi

All URIs are relative to *https://ultradox-api.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**converter**](DefaultApi.md#converter) | **POST** /converter | 
[**directConverter**](DefaultApi.md#directConverter) | **POST** /directConverter | 
[**zipConverter**](DefaultApi.md#zipConverter) | **POST** /zipConverter | 


<a name="converter"></a>
# **converter**
> File converter(fileId, locale, currency, timezone, format, model)



Convert the template document into a new document, given a Model

### Example
```java
// Import classes:
//import com.floreysoft.ultradox.api.ApiClient;
//import com.floreysoft.ultradox.api.ApiException;
//import com.floreysoft.ultradox.api.Configuration;
//import com.floreysoft.ultradox.api.auth.*;
//import com.floreysoft.ultradox.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String fileId = "fileId_example"; // String | Id of the file to convert
String locale = "locale_example"; // String | The locale ('de', 'en' ...)
String currency = "currency_example"; // String | The currency ('USD', 'EUR' ...)
String timezone = "timezone_example"; // String | The timezone ('Europe/Berlin', 'GMT+06:00' ...)
String format = "format_example"; // String | Target format
Object model = null; // Object | Variable model
try {
    File result = apiInstance.converter(fileId, locale, currency, timezone, format, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#converter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| Id of the file to convert |
 **locale** | **String**| The locale (&#39;de&#39;, &#39;en&#39; ...) |
 **currency** | **String**| The currency (&#39;USD&#39;, &#39;EUR&#39; ...) |
 **timezone** | **String**| The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...) |
 **format** | **String**| Target format | [enum: pdf, txt, odt, html, docx]
 **model** | **Object**| Variable model |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octetstream, application/json

<a name="directConverter"></a>
# **directConverter**
> File directConverter(params)



Convert the template document into a new document, given a Model

### Example
```java
// Import classes:
//import com.floreysoft.ultradox.api.ApiClient;
//import com.floreysoft.ultradox.api.ApiException;
//import com.floreysoft.ultradox.api.Configuration;
//import com.floreysoft.ultradox.api.auth.*;
//import com.floreysoft.ultradox.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Params params = new Params(); // Params | The conversion parameters
try {
    File result = apiInstance.directConverter(params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#directConverter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **params** | [**Params**](Params.md)| The conversion parameters |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octetstream, application/json

<a name="zipConverter"></a>
# **zipConverter**
> File zipConverter(params)



Convert the template document into a multi documents based on the given number of models

### Example
```java
// Import classes:
//import com.floreysoft.ultradox.api.ApiClient;
//import com.floreysoft.ultradox.api.ApiException;
//import com.floreysoft.ultradox.api.Configuration;
//import com.floreysoft.ultradox.api.auth.*;
//import com.floreysoft.ultradox.api.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Params1 params = new Params1(); // Params1 | The conversion parameters
try {
    File result = apiInstance.zipConverter(params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#zipConverter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **params** | [**Params1**](Params1.md)| The conversion parameters |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, application/json

