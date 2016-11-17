package io.reactivesw.customer.server.cart.models;

import java.time.ZonedDateTime;

import io.reactivesw.customer.server.cart.enums.TransactionState;
import io.reactivesw.customer.server.cart.enums.TransactionType;
import io.reactivesw.customer.server.common.types.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A representation of a financial transactions. Transactions are either created by the solution
 * implementation to trigger a new transaction at the PSP or created by the PSP integration as the
 * result of a notification by the PSP. Created by umasuo on 16/11/17.
 */
@ApiModel(description = "A representation of a financial transactions. " +
        "Transactions are either created by the solution implementation to trigger a new transaction at the PSP or created by the PSP integration as the result of a notification by the PSP.")
public class Transaction {


  @ApiModelProperty(value = "The unique ID of this object.", required = true)
  private String id;

  @ApiModelProperty(value = "The time at which the transaction took place.", required = false)
  private ZonedDateTime timestamp;

  @ApiModelProperty(value = "The type of this transaction.", required = true)
  private TransactionType type;

  @ApiModelProperty(required = true)
  private Money amount;

  @ApiModelProperty(value = "The identifier that is used by the interface that managed the transaction (usually the PSP). " +
          "If a matching interaction was logged in the interfaceInteractions array, the corresponding interaction should be findable with this ID.",
          required = false)
  private String interactionId;

  @ApiModelProperty(value = "The state of this transaction.",
          required = true)
  private TransactionState state;


}
