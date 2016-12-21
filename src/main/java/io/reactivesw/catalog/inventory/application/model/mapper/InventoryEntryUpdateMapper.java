package io.reactivesw.catalog.inventory.application.model.mapper;

import com.google.common.collect.ImmutableMap;

import io.reactivesw.catalog.category.application.model.mapper.CategoryUpdateMapper;
import io.reactivesw.catalog.inventory.application.model.action.AddQuantityAction;
import io.reactivesw.common.model.Update;

import org.apache.commons.collections4.Put;

import java.util.Map;

/**
 * Created by Davis on 16/12/21.
 */
public interface InventoryEntryUpdateMapper<E> extends Update<E> {
  Map<Class<?>, InventoryEntryUpdateMapper> updateMappers = ImmutableMap.<Class<?>,
      InventoryEntryUpdateMapper>builder()
      .put(AddQuantityAction.class, new AddQuantityMapper()).build();

  /**
   * @param clazz
   * @return
   */
  static InventoryEntryUpdateMapper getMapper(Class<?> clazz) {
    return updateMappers.get(clazz);
  }
}
