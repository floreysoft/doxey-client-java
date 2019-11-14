# doxey-client-java

Doxey API
- API version: 1.0.0
  - Build date: 2019-11-14T10:53:54.676Z

Generate personalized documents using doxey template language

  For more information, please visit [https://doxey.io](https://doxey.io)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.floreysoft</groupId>
  <artifactId>doxey-client-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.floreysoft:doxey-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/doxey-client-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.floreysoft.doxey.invoke.*;
import com.floreysoft.doxey.invoke.auth.*;
import com.floreysoft.doxey.model.*;
import com.floreysoft.doxey.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String apiKey = "apiKey_example"; // String | API key
        String fileId = "fileId_example"; // String | Id of the file to convert
        String locale = "locale_example"; // String | The locale ('de', 'en' ...)
        String currency = "currency_example"; // String | The currency ('USD', 'EUR' ...)
        String timezone = "timezone_example"; // String | The timezone ('Europe/Berlin', 'GMT+06:00' ...)
        String format = "format_example"; // String | Target format
        Object model = null; // Object | Variable model
        try {
            File result = apiInstance.converter(apiKey, fileId, locale, currency, timezone, format, model);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#converter");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.doxey.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**converter**](docs/DefaultApi.md#converter) | **POST** /converter | 
*DefaultApi* | [**directConverter**](docs/DefaultApi.md#directConverter) | **POST** /directConverter | 
*DefaultApi* | [**zipConverter**](docs/DefaultApi.md#zipConverter) | **POST** /zipConverter | 


## Documentation for Models

 - [Model](docs/Model.md)
 - [Params](docs/Params.md)
 - [Params1](docs/Params1.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@floreysoft.com

