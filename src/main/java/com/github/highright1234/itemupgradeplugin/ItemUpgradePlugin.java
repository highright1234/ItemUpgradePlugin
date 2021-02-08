package com.github.highright1234.itemupgradeplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemUpgradePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        SmithingRecipe recipe =new SmithingRecipe(new NamespacedKey(this, "test"),
                new ItemStack(Material.AIR), // any material seems fine
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
