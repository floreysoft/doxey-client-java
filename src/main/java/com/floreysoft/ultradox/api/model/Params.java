/*
 * Ultradox API
 * Generate personalized documents using ultradox template language
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@floreysoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.floreysoft.ultradox.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Params
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T14:26:10.962Z")
public class Params {
  @SerializedName("templatecontent")
  private String templatecontent = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("timezone")
  private String timezone = null;

  /**
   * Target format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    PDF("pdf"),
    
    TXT("txt"),
    
    ODT("odt"),
    
    HTML("html"),
    
    DOCX("docx");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("format")
  private FormatEnum format = null;

  @SerializedName("model")
  private Object model = null;

  public Params templatecontent(String templatecontent) {
    this.templatecontent = templatecontent;
    return this;
  }

   /**
   * Base64 encoded template file
   * @return templatecontent
  **/
  @ApiModelProperty(required = true, value = "Base64 encoded template file")
  public String getTemplatecontent() {
    return templatecontent;
  }

  public void setTemplatecontent(String templatecontent) {
    this.templatecontent = templatecontent;
  }

  public Params locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale (&#39;de&#39;, &#39;en&#39; ...)
   * @return locale
  **/
  @ApiModelProperty(required = true, value = "The locale ('de', 'en' ...)")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Params currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency (&#39;USD&#39;, &#39;EUR&#39; ...)
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The currency ('USD', 'EUR' ...)")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Params timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone (&#39;Europe/Berlin&#39;, &#39;GMT+06:00&#39; ...)
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "The timezone ('Europe/Berlin', 'GMT+06:00' ...)")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Params format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Target format
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Target format")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public Params model(Object model) {
    this.model = model;
    return this;
  }

   /**
   * Model data
   * @return model
  **/
  @ApiModelProperty(required = true, value = "Model data")
  public Object getModel() {
    return model;
  }

  public void setModel(Object model) {
    this.model = model;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params params = (Params) o;
    return Objects.equals(this.templatecontent, params.templatecontent) &&
        Objects.equals(this.locale, params.locale) &&
        Objects.equals(this.currency, params.currency) &&
        Objects.equals(this.timezone, params.timezone) &&
        Objects.equals(this.format, params.format) &&
        Objects.equals(this.model, params.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templatecontent, locale, currency, timezone, format, model);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params {\n");
    
    sb.append("    templatecontent: ").append(toIndentedString(templatecontent)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

