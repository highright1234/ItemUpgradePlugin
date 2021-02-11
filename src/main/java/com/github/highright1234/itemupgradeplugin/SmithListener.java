package com.github.highright1234.itemupgradeplugin;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmithingInventory;
import org.bukkit.inventory.meta.ItemMeta;


public class SmithListener implements Listener {

    @EventHandler
    public void onPrepareSmithEvent(PrepareSmithingEvent event) {
        SmithingInventory inventory = event.getInventory();

        ItemStack tool = inventory.getItem(0);
        ItemStack modifier = inventory.getItem(1);

        if (tool == null || modifier == null) {
            return;
        }

        if (tool.getType() != Material.NETHERITE_SWORD || modifier.getType() != Material.NETHERITE_INGOT) {
            return;
        }
        ItemStack result = tool.clone();
        ItemMeta meta = tool.getItemMeta();
        if (meta.hasCustomModelData()) {
            if (meta.getCustomModelData() == 1) {
                meta.setCustomModelData(2);
                meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,
                        new AttributeModifier("generic.attack_damage", 9, AttributeModifier.Operation.ADD_NUMBER));
                result.setItemMeta(meta);
                event.setResult(result);
            }
        } else {
            meta.setCustomModelData(1);
            result.setItemMeta(meta);
            event.setResult(result);
        }
    }
}

