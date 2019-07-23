package jp.co.axa.ins.p2p.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-23T22:35:44.263279+09:00[Asia/Tokyo]")

public class Product   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("premium")
  private Long premium;

  @JsonProperty("insuranceAmount")
  private Long insuranceAmount;

  @JsonProperty("minNumberInGroup")
  private Long minNumberInGroup;

  @JsonProperty("maxNumberInGroup")
  private Long maxNumberInGroup;

  public Product id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product premium(Long premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Get premium
   * @return premium
  */
  @ApiModelProperty(value = "")


  public Long getPremium() {
    return premium;
  }

  public void setPremium(Long premium) {
    this.premium = premium;
  }

  public Product insuranceAmount(Long insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
    return this;
  }

  /**
   * Get insuranceAmount
   * @return insuranceAmount
  */
  @ApiModelProperty(value = "")


  public Long getInsuranceAmount() {
    return insuranceAmount;
  }

  public void setInsuranceAmount(Long insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }

  public Product minNumberInGroup(Long minNumberInGroup) {
    this.minNumberInGroup = minNumberInGroup;
    return this;
  }

  /**
   * Get minNumberInGroup
   * @return minNumberInGroup
  */
  @ApiModelProperty(value = "")


  public Long getMinNumberInGroup() {
    return minNumberInGroup;
  }

  public void setMinNumberInGroup(Long minNumberInGroup) {
    this.minNumberInGroup = minNumberInGroup;
  }

  public Product maxNumberInGroup(Long maxNumberInGroup) {
    this.maxNumberInGroup = maxNumberInGroup;
    return this;
  }

  /**
   * Get maxNumberInGroup
   * @return maxNumberInGroup
  */
  @ApiModelProperty(value = "")


  public Long getMaxNumberInGroup() {
    return maxNumberInGroup;
  }

  public void setMaxNumberInGroup(Long maxNumberInGroup) {
    this.maxNumberInGroup = maxNumberInGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.premium, product.premium) &&
        Objects.equals(this.insuranceAmount, product.insuranceAmount) &&
        Objects.equals(this.minNumberInGroup, product.minNumberInGroup) &&
        Objects.equals(this.maxNumberInGroup, product.maxNumberInGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, premium, insuranceAmount, minNumberInGroup, maxNumberInGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    minNumberInGroup: ").append(toIndentedString(minNumberInGroup)).append("\n");
    sb.append("    maxNumberInGroup: ").append(toIndentedString(maxNumberInGroup)).append("\n");
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

