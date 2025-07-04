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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.awd.model.PackageDimensions;
import io.swagger.client.awd.model.PackageVolume;
import io.swagger.client.awd.model.PackageWeight;
import java.io.IOException;

/**
 * Package weight and dimension.
 */
@ApiModel(description = "Package weight and dimension.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-25T16:01:36.172+08:00")
public class MeasurementData {
  @SerializedName("dimensions")
  private PackageDimensions dimensions = null;

  @SerializedName("volume")
  private PackageVolume volume = null;

  @SerializedName("weight")
  private PackageWeight weight = null;

  public MeasurementData dimensions(PackageDimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Dimensions of the package. Dimensions are required when creating an inbound or outbound order.
   * @return dimensions
  **/
  @ApiModelProperty(value = "Dimensions of the package. Dimensions are required when creating an inbound or outbound order.")
  public PackageDimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(PackageDimensions dimensions) {
    this.dimensions = dimensions;
  }

  public MeasurementData volume(PackageVolume volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Volume of the package.
   * @return volume
  **/
  @ApiModelProperty(value = "Volume of the package.")
  public PackageVolume getVolume() {
    return volume;
  }

  public void setVolume(PackageVolume volume) {
    this.volume = volume;
  }

  public MeasurementData weight(PackageWeight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight of the package.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "Weight of the package.")
  public PackageWeight getWeight() {
    return weight;
  }

  public void setWeight(PackageWeight weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementData measurementData = (MeasurementData) o;
    return Objects.equals(this.dimensions, measurementData.dimensions) &&
        Objects.equals(this.volume, measurementData.volume) &&
        Objects.equals(this.weight, measurementData.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, volume, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementData {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

