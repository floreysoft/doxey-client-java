
# Params

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiKey** | **String** | API key | 
**templatecontent** | **String** | Base64 encoded template file |  [optional]
**template** | **String** | URL (http or data) of the template file |  [optional]
**locale** | **String** | The locale (&#39;de&#39;, &#39;en&#39; ...) | 
**currency** | **String** | The currency (&#39;USD&#39;, &#39;EUR&#39; ...) | 
**timezone** | **String** | The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...) | 
**format** | [**FormatEnum**](#FormatEnum) | Target format | 
**model** | **Object** | Model data | 


<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
PDF | &quot;pdf&quot;
TXT | &quot;txt&quot;
ODT | &quot;odt&quot;
HTML | &quot;html&quot;
DOCX | &quot;docx&quot;
PDFZIP | &quot;pdfzip&quot;
TXTZIP | &quot;txtzip&quot;
ODTZIP | &quot;odtzip&quot;
HTMLZIP | &quot;htmlzip&quot;
DOCXZIP | &quot;docxzip&quot;



