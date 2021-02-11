package com.github.highright1234.itemupgradeplugin.utils;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmithingInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class Upgrade {

    public Upgrade(SmithingInventory inventory, ItemStack getTool, ItemStack getModifier, Material getDefault, Material getSource, Material getChanged) {
        ItemMeta meta = getTool.getItemMeta();
        meta.getCustomModelData();

        if(getTool == null|| getModifier == null){
            return;
        }

        if(getTool.getType() != getDefault || getModifier.getType() != getSource){
            return;
        }

        ItemStack result = new ItemStack(getChanged);
        result.setItemMeta(meta);
        inventory.setResult(result);
    }


}
