package io.reactivesw.order.cart.domain.entity.value;

import io.reactivesw.common.entity.BaseIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by umasuo on 16/11/17.
 */
@Entity
@Table(name = "order_cart_item_state")
public class ItemStateValue extends BaseIdEntity {

  /**
   * quantity that affected by the state.
   */
  @Column
  private Integer quantity;

  /**
   * an state Id.
   */
  @Column
  private String state;

  /**
   * Gets quantity.
   *
   * @return the quantity
   */
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets quantity.
   *
   * @param quantity the quantity
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Gets state.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Sets state.
   *
   * @param state the state
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * to string method.
   *
   * @return String
   */
  @Override
  public String toString() {
    return "ItemStateValue{"
        + "quantity=" + quantity
        + ", state='" + state + '\''
        + '}';
  }
}
