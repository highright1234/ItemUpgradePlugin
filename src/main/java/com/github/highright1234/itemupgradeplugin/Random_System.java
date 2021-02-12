package com.github.highright1234.itemupgradeplugin;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class Random_System implements Listener {
    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        if (event.getInventory().getType() == InventoryType.SMITHING) {
            if (event.getCurrentItem() != null) {
                if (event.getCurrentItem().getType() == Material.NETHERITE_SWORD) {
                    if (event.getCurrentItem().getItemMeta().hasCustomModelData()) {
                        if (event.getCurrentItem().getItemMeta().getCustomModelData() == 2) {
                            event.getCurrentItem().setType(Material.AIR);
                            // TODO random
                        }
                    }
                }
            }
        }
    }
}
