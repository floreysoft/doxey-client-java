package com.floreysoft.doxey.api;

import com.floreysoft.doxey.invoke.ApiException;
import com.floreysoft.doxey.invoke.ApiClient;
import com.floreysoft.doxey.invoke.ApiResponse;
import com.floreysoft.doxey.invoke.Configuration;
import com.floreysoft.doxey.invoke.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import com.floreysoft.doxey.model.Params;
import com.floreysoft.doxey.model.Params1;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-05T14:54:28.765Z")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Convert the template document into a new document, given a Model
   * @param fileId Id of the file to convert (required)
   * @param locale The locale (&#39;de&#39;, &#39;en&#39; ...) (required)
   * @param currency The currency (&#39;USD&#39;, &#39;EUR&#39; ...) (required)
   * @param timezone The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...) (required)
   * @param format Target format (required)
   * @param model Variable model (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File converter(String fileId, String locale, String currency, String timezone, String format, Object model) throws ApiException {
    return converterWithHttpInfo(fileId, locale, currency, timezone, format, model).getData();
      }

  /**
   * 
   * Convert the template document into a new document, given a Model
   * @param fileId Id of the file to convert (required)
   * @param locale The locale (&#39;de&#39;, &#39;en&#39; ...) (required)
   * @param currency The currency (&#39;USD&#39;, &#39;EUR&#39; ...) (required)
   * @param timezone The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...) (required)
   * @param format Target format (required)
   * @param model Variable model (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> converterWithHttpInfo(String fileId, String locale, String currency, String timezone, String format, Object model) throws ApiException {
    Object localVarPostBody = model;
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling converter");
    }
    
    // verify the required parameter 'locale' is set
    if (locale == null) {
      throw new ApiException(400, "Missing the required parameter 'locale' when calling converter");
    }
    
    // verify the required parameter 'currency' is set
    if (currency == null) {
      throw new ApiException(400, "Missing the required parameter 'currency' when calling converter");
    }
    
    // verify the required parameter 'timezone' is set
    if (timezone == null) {
      throw new ApiException(400, "Missing the required parameter 'timezone' when calling converter");
    }
    
    // verify the required parameter 'format' is set
    if (format == null) {
      throw new ApiException(400, "Missing the required parameter 'format' when calling converter");
    }
    
    // verify the required parameter 'model' is set
    if (model == null) {
      throw new ApiException(400, "Missing the required parameter 'model' when calling converter");
    }
    
    // create path and map variables
    String localVarPath = "/converter";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileId", fileId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));

    
    
    final String[] localVarAccepts = {
      "application/octetstream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Convert the template document into a new document, given a Model
   * @param params The conversion parameters (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File directConverter(Params params) throws ApiException {
    return directConverterWithHttpInfo(params).getData();
      }

  /**
   * 
   * Convert the template document into a new document, given a Model
   * @param params The conversion parameters (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> directConverterWithHttpInfo(Params params) throws ApiException {
    Object localVarPostBody = params;
    
    // verify the required parameter 'params' is set
    if (params == null) {
      throw new ApiException(400, "Missing the required parameter 'params' when calling directConverter");
    }
    
    // create path and map variables
    String localVarPath = "/directConverter";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/octetstream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Convert the template document into a multi documents based on the given number of models
   * @param params The conversion parameters (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File zipConverter(Params1 params) throws ApiException {
    return zipConverterWithHttpInfo(params).getData();
      }

  /**
   * 
   * Convert the template document into a multi documents based on the given number of models
   * @param params The conversion parameters (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> zipConverterWithHttpInfo(Params1 params) throws ApiException {
    Object localVarPostBody = params;
    
    // verify the required parameter 'params' is set
    if (params == null) {
      throw new ApiException(400, "Missing the required parameter 'params' when calling zipConverter");
    }
    
    // create path and map variables
    String localVarPath = "/zipConverter";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/zip", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
