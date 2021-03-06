package io.reactivesw.catalog.category.application.model.action;

import io.reactivesw.common.model.UpdateAction;
import io.reactivesw.common.model.LocalizedString;

/**
 * Created by Davis on 16/12/6.
 */
public class SetMetaKeywords implements UpdateAction {
  /**
   * The Meta keywords.
   */
  private LocalizedString metaKeywords;

  /**
   * Gets meta keywords.
   *
   * @return the meta keywords
   */
  public LocalizedString getMetaKeywords() {
    return metaKeywords;
  }

  /**
   * Sets meta keywords.
   *
   * @param metaKeywords the meta keywords
   */
  public void setMetaKeywords(LocalizedString metaKeywords) {
    this.metaKeywords = metaKeywords;
  }
}
