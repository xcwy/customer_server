package io.reactivesw.catalog.producttype.application.model.action;

import io.reactivesw.common.model.PlainEnumValue;
import io.reactivesw.common.model.UpdateAction;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Davis on 16/12/12.
 */
@Getter
@Setter
public class AddPlainEnumValue implements UpdateAction {
  /**
   * The Attribute name.
   */
  private String attributeName;

  /**
   * The Value.
   */
  private PlainEnumValue value;
}
