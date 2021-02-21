package com.github.highright1234.itemupgradeplugin;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmithingInventory;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.UUID;


public class SmithListener implements Listener {

    @EventHandler
    public void onPrepareSmithEvent(PrepareSmithingEvent event) {
        SmithingInventory inventory = event.getInventory();

        ItemStack tool = inventory.getItem(0);
        ItemStack modifier = inventory.getItem(1);

        if (tool == null || modifier == null) {
            return;
        }

        if (tool.getType() != Material.NETHERITE_SWORD || modifier.getType() != Material.RABBIT_HIDE) {
            return;
        }
        if (!modifier.getItemMeta().hasCustomModelData()) {
            return;
        }
        if (modifier.getItemMeta().getCustomModelData() != 100) {
            return;
        }
        ItemStack result = tool.clone();
        ItemMeta meta = tool.getItemMeta();
        if (meta.hasCustomModelData()) {
            if (meta.getCustomModelData() == 1) {
                meta.setCustomModelData(2);
                AttributeModifier attribute = new AttributeModifier(UUID.randomUUID(),
                        "generic.attack_damage",
                        12, AttributeModifier.Operation.ADD_NUMBER,
                        EquipmentSlot.HAND);
                meta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
                meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attribute);
                result.setItemMeta(meta);
                event.setResult(result);
            }
        } else {
            ItemStack returnitem = new Items_ItemStack().RandomItemUpgradeBefore(10,10,"asdf", 1);
            event.setResult(returnitem);
//            meta.setCustomModelData(1);
//            AttributeModifier attribute = new AttributeModifier(UUID.randomUUID(),
//                    "generic.attack_damage",
//                    10, AttributeModifier.Operation.ADD_NUMBER,
//                    EquipmentSlot.HAND);
//            meta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
//            meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attribute);
//            result.setItemMeta(meta);
//            event.setResult(result);
        }
    }
}

