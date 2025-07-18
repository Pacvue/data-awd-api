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
 * Unit of measurement for the package volume.
 */
@JsonAdapter(VolumeUnitOfMeasurement.Adapter.class)
public enum VolumeUnitOfMeasurement {
  
  CU_IN("CU_IN"),
  
  CBM("CBM"),
  
  CC("CC");

  private String value;

  VolumeUnitOfMeasurement(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VolumeUnitOfMeasurement fromValue(String text) {
    for (VolumeUnitOfMeasurement b : VolumeUnitOfMeasurement.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VolumeUnitOfMeasurement> {
    @Override
    public void write(final JsonWriter jsonWriter, final VolumeUnitOfMeasurement enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VolumeUnitOfMeasurement read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VolumeUnitOfMeasurement.fromValue(String.valueOf(value));
    }
  }
}

