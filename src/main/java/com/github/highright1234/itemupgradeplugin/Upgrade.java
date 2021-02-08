package com.github.highright1234.itemupgradeplugin;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmithingInventory;

public class Upgrade implements Listener{
    @EventHandler
    public void onPrepareSmithingEvent(PrepareSmithingEvent event){
        SmithingInventory inventory = event.getInventory();

        ItemStack tool = inventory.getItem(0);
        ItemStack modifier = inventory.getItem(1);


        System.out.println("1");
        if(tool ==null|| modifier ==null){
            return;
        }
        System.out.println("2");
        if(tool.getType()!= Material.IRON_SHOVEL|| modifier.getType()!= Material.DIAMOND){
            return;
        }
        System.out.println("3");
        ItemStack result = new ItemStack(Material.DIAMOND_SHOVEL, 1);
        event.setResult(result);
        inventory.setResult(result);
    }

}
