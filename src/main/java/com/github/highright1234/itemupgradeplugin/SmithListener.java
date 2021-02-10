package com.github.highright1234.itemupgradeplugin;

import com.github.highright1234.itemupgradeplugin.utils.Upgrade;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmithingInventory;

import java.util.Objects;

public class SmithListener implements Listener {

    @EventHandler
    public void onPrepareSmithEvent(PrepareSmithingEvent event){
        SmithingInventory inventory = event.getInventory();

        ItemStack tool = inventory.getItem(0);
        ItemStack modifier = inventory.getItem(1);

        new Upgrade(inventory, Objects.requireNonNull(tool), modifier, Material.IRON_SHOVEL, Material.DIAMOND, Material.DIAMOND_SHOVEL);
    }
}
