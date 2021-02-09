package com.github.highright1234.itemupgradeplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;


public class ItemUpgradePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Upgrade(), this);
        SmithingRecipe recipe =new SmithingRecipe(new NamespacedKey(this, "test"),
                new ItemStack(Material.AIR, 1), // any material seems fine
                new RecipeChoice.MaterialChoice(Material.IRON_SHOVEL),
                new RecipeChoice.MaterialChoice(Material.DIAMOND)
        );
        Bukkit.addRecipe(recipe);

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
