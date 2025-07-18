/*
 * The Selling Partner API for Amazon Warehousing and Distribution
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory.
 *
 * OpenAPI spec version: 2024-05-09
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.awd.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of your label.
 */
@JsonAdapter(LabelStatus.Adapter.class)
public enum LabelStatus {
  
  GENERATING("GENERATING"),
  
  GENERATED("GENERATED"),
  
  GENERATION_FAILED("GENERATION_FAILED"),
  
  NOT_READY("NOT_READY");

  private String value;

  LabelStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LabelStatus fromValue(String text) {
    for (LabelStatus b : LabelStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LabelStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LabelStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LabelStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LabelStatus.fromValue(String.valueOf(value));
    }
  }
}

