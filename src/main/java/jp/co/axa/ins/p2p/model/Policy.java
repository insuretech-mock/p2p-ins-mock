package jp.co.axa.ins.p2p.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Policy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-23T22:35:44.263279+09:00[Asia/Tokyo]")

public class Policy   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("productId")
  private Long productId;

  @JsonProperty("pooledAmount")
  private Long pooledAmount;

  @JsonProperty("members")
  @Valid
  private List<Long> members = null;

  public Policy id(Long id) {
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

  public Policy productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Policy pooledAmount(Long pooledAmount) {
    this.pooledAmount = pooledAmount;
    return this;
  }

  /**
   * Get pooledAmount
   * @return pooledAmount
  */
  @ApiModelProperty(value = "")


  public Long getPooledAmount() {
    return pooledAmount;
  }

  public void setPooledAmount(Long pooledAmount) {
    this.pooledAmount = pooledAmount;
  }

  public Policy members(List<Long> members) {
    this.members = members;
    return this;
  }

  public Policy addMembersItem(Long membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Put userId of the member of the policy
   * @return members
  */
  @ApiModelProperty(value = "Put userId of the member of the policy")


  public List<Long> getMembers() {
    return members;
  }

  public void setMembers(List<Long> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.id, policy.id) &&
        Objects.equals(this.productId, policy.productId) &&
        Objects.equals(this.pooledAmount, policy.pooledAmount) &&
        Objects.equals(this.members, policy.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, pooledAmount, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    pooledAmount: ").append(toIndentedString(pooledAmount)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

