package com.floreysoft.doxey.api;

import com.floreysoft.doxey.invoke.ApiException;
import com.floreysoft.doxey.invoke.ApiClient;
import com.floreysoft.doxey.invoke.ApiResponse;
import com.floreysoft.doxey.invoke.Configuration;
import com.floreysoft.doxey.invoke.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import com.floreysoft.doxey.model.Params;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-31T12:22:28.113Z")
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
   * Merge the template document into a new document, given a Model
   * @param apiKey API key (required)
   * @param template URL (http or data) of the source file (required)
   * @param locale The locale (&#39;de&#39;, &#39;en&#39; ...) (required)
   * @param currency The currency (&#39;USD&#39;, &#39;EUR&#39; ...) (required)
   * @param timezone The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...) (required)
   * @param format Target format (required)
   * @param model Variable model (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File mergeGet(String apiKey, String template, String locale, String currency, String timezone, String format, Object model) throws ApiException {
    return mergeGetWithHttpInfo(apiKey, template, locale, currency, timezone, format, model).getData();
      }

  /**
   * 
   * Merge the template document into a new document, given a Model
   * @param apiKey API key (required)
   * @param template URL (http or data) of the source file (required)
   * @param locale The locale (&#39;de&#39;, &#39;en&#39; ...) (required)
   * @param currency The currency (&#39;USD&#39;, &#39;EUR&#39; ...) (required)
   * @param timezone The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...) (required)
   * @param format Target format (required)
   * @param model Variable model (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> mergeGetWithHttpInfo(String apiKey, String template, String locale, String currency, String timezone, String format, Object model) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling mergeGet");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling mergeGet");
    }
    
    // verify the required parameter 'locale' is set
    if (locale == null) {
      throw new ApiException(400, "Missing the required parameter 'locale' when calling mergeGet");
    }
    
    // verify the required parameter 'currency' is set
    if (currency == null) {
      throw new ApiException(400, "Missing the required parameter 'currency' when calling mergeGet");
    }
    
    // verify the required parameter 'timezone' is set
    if (timezone == null) {
      throw new ApiException(400, "Missing the required parameter 'timezone' when calling mergeGet");
    }
    
    // verify the required parameter 'format' is set
    if (format == null) {
      throw new ApiException(400, "Missing the required parameter 'format' when calling mergeGet");
    }
    
    // verify the required parameter 'model' is set
    if (model == null) {
      throw new ApiException(400, "Missing the required parameter 'model' when calling mergeGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/merge";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiKey", apiKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "template", template));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "model", model));

    
    
    final String[] localVarAccepts = {
      "application/octetstream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Merge the template document into a new document, given a Model
   * @param params The conversion parameters (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File mergePost(Params params) throws ApiException {
    return mergePostWithHttpInfo(params).getData();
      }

  /**
   * 
   * Merge the template document into a new document, given a Model
   * @param params The conversion parameters (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> mergePostWithHttpInfo(Params params) throws ApiException {
    Object localVarPostBody = params;
    
    // verify the required parameter 'params' is set
    if (params == null) {
      throw new ApiException(400, "Missing the required parameter 'params' when calling mergePost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/merge";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/zip", "application/pdf", "application/docx", "application/odt", "text/html", "text/plain", "application/octetstream", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
