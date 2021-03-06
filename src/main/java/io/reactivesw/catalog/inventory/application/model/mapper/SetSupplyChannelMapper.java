package io.reactivesw.catalog.inventory.application.model.mapper;

import io.reactivesw.catalog.inventory.application.model.action.SetSupplyChannel;
import io.reactivesw.catalog.inventory.domain.entity.InventoryEntryEntity;
import io.reactivesw.common.model.Reference;
import io.reactivesw.common.model.UpdateAction;

/**
 * Created by Davis on 16/12/21.
 */
public class SetSupplyChannelMapper implements InventoryEntryUpdateMapper<InventoryEntryEntity> {
  @Override
  public void handle(InventoryEntryEntity entity, UpdateAction action) {
    String channelId = ((SetSupplyChannel) action).getSupplyChannel().getId();
    entity.setSupplyChannel(channelId);
  }
}
