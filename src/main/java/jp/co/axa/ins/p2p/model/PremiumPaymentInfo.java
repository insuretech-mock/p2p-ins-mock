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
 * PremiumPaymentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-23T22:35:44.263279+09:00[Asia/Tokyo]")

public class PremiumPaymentInfo   {
  @JsonProperty("method")
  private String method;

  public PremiumPaymentInfo method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @ApiModelProperty(value = "")


  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumPaymentInfo premiumPaymentInfo = (PremiumPaymentInfo) o;
    return Objects.equals(this.method, premiumPaymentInfo.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumPaymentInfo {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

