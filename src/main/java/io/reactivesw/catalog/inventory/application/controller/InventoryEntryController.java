package io.reactivesw.catalog.inventory.application.controller;

import static io.reactivesw.route.InventoryEntryRouter.INVENTORY_ENTRY_ROOT;

import io.reactivesw.catalog.inventory.application.model.InventoryEntry;
import io.reactivesw.catalog.inventory.application.model.InventoryEntryDraft;
import io.reactivesw.catalog.inventory.domain.service.InventoryEntryService;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Davis on 16/12/21.
 */
@RestController
public class InventoryEntryController {
  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(InventoryEntryController.class);

  /**
   * The Inventory entry service.
   */
  @Autowired
  private transient InventoryEntryService inventoryEntryService;

  /**
   * Create inventory entry inventory entry.
   *
   * @param draft the draft
   * @return the inventory entry
   */
  @ApiOperation("Create InventoryEntry")
  @PostMapping(INVENTORY_ENTRY_ROOT)
  public InventoryEntry createInventoryEntry(InventoryEntryDraft draft) {
    LOG.debug("enter createInventoryEntry, inventory entry draft is : {}", draft.toString());

    InventoryEntry result = inventoryEntryService.createInventoryEntry(draft);

    LOG.debug("end createInventoryEntry, new InventoryEntry is : {}", result.toString());

    return result;
  }
}