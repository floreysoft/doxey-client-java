# DefaultApi

All URIs are relative to *https://api.doxey.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mergeGet**](DefaultApi.md#mergeGet) | **GET** /v1/merge | 
[**mergePost**](DefaultApi.md#mergePost) | **POST** /v1/merge | 


<a name="mergeGet"></a>
# **mergeGet**
> File mergeGet(apiKey, template, locale, currency, timezone, format, model)



Merge the template document into a new document, given a Model

### Example
```java
// Import classes:
//import com.floreysoft.doxey.invoke.ApiException;
//import com.floreysoft.doxey.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | API key
String template = "template_example"; // String | URL (http or data) of the source file
String locale = "locale_example"; // String | The locale ('de', 'en' ...)
String currency = "currency_example"; // String | The currency ('USD', 'EUR' ...)
String timezone = "timezone_example"; // String | The timezone ('Europe/Berlin', 'GMT+06:00' ...)
String format = "format_example"; // String | Target format
Object model = null; // Object | Variable model
try {
    File result = apiInstance.mergeGet(apiKey, template, locale, currency, timezone, format, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#mergeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| API key |
 **template** | **String**| URL (http or data) of the source file |
 **locale** | **String**| The locale (&#39;de&#39;, &#39;en&#39; ...) |
 **currency** | **String**| The currency (&#39;USD&#39;, &#39;EUR&#39; ...) |
 **timezone** | **String**| The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...) |
 **format** | **String**| Target format | [enum: pdf, txt, odt, html, docx]
 **model** | [**Object**](.md)| Variable model |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octetstream, application/json

<a name="mergePost"></a>
# **mergePost**
> File mergePost(params)



Merge the template document into a new document, given a Model

### Example
```java
// Import classes:
//import com.floreysoft.doxey.invoke.ApiException;
//import com.floreysoft.doxey.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Params params = new Params(); // Params | The conversion parameters
try {
    File result = apiInstance.mergePost(params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#mergePost");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, application/pdf, application/docx, application/odt, text/html, text/plain, application/octetstream, application/json

