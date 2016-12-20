package io.reactivesw.catalog.product.domain.entity;

import io.reactivesw.common.entity.BaseIdEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by umasuo on 16/11/23.
 */
@Getter
@Setter
@Entity
@Table(name = "catalog_product_catalog_data")
public class ProductCatalogDataEntity extends BaseIdEntity {

  /**
   * is the product been published.
   */
  @Column
  private Boolean published;

  /**
   * has staged changed.
   */
  @Column(name = "staged_changed")
  private Boolean stagedChanged;

  /**
   * current data.
   */
  @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
  private ProductDataEntity current;

  /**
   * staged data.
   */
  @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
  private ProductDataEntity staged;
}
