package io.reactivesw.customer.server.common.types;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by umasuo on 16/11/17.
 */
@ApiModel(description = "A SubRate is used to calculate the taxPortions field in a carts or order. It is useful if the total tax of a country is a combination of multiple taxes (e.g. state and local taxes).")
public class SubRate {


  @ApiModelProperty(required = true)
  private String name;

  @ApiModelProperty(value = "Number Percentage in the range of [0..1].", required = true)
  private Float amount;
}
