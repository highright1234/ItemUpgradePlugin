package com.github.highright1234.itemupgradeplugin;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

public class Random_System implements Listener {
    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        if (event.getInventory().getType() == InventoryType.SMITHING &&
                event.getSlotType() == InventoryType.SlotType.RESULT &&
                event.getCurrentItem() != null &&
                event.getCurrentItem().getType() == Material.END_PORTAL_FRAME &&
                event.getCurrentItem().getItemMeta() != null) {
            if (event.getInventory().getItem(0) != null) {
                ItemStack item1 = event.getInventory().getItem(0);
                if (item1 != null) {
                    if (item1.getItemMeta() != null) {
                        event.setCurrentItem(new Items_ItemStack().AttackMagwangItemPatch(item1, 10, 12));
                    }
                }
            }
        }

//        if (event.getInventory().getType() == InventoryType.SMITHING &&
//                event.getInventory().getType() == InventoryType.SMITHING &&
//                event.getCurrentItem() != null &&
//                event.getCurrentItem().getType() == Material.NETHERITE_SWORD &&
//                event.getCurrentItem().getItemMeta().hasCustomModelData() &&
//                event.getCurrentItem().getItemMeta().getCustomModelData() == 2 &&
//            Math.random() <= 0.1) {
//            event.setCurrentItem(null);
//            ItemStack index0 = event.getInventory().getItem(0);
//            if (index0 != null) {
//                if (index0.getAmount() != 0) {
//                    index0.setAmount(index0.getAmount() - 1);
//                    event.getInventory().setItem(0, index0);
//                }
//            }
//            ItemStack index1 = event.getInventory().getItem(1);
//            if (index1 != null) {
//                if (index1.getAmount() != 0) {
//                    index1.setAmount(index1.getAmount() - 1);
//                    event.getInventory().setItem(1, index1);
//                }
//            }
//            Player p = (Player) event.getWhoClicked();
//            p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
//            event.setCancelled(true);
//        }
    }
}
