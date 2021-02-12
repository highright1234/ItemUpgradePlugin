package com.github.highright1234.itemupgradeplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import static com.github.highright1234.itemupgradeplugin.Items_ItemStack.*;


@SuppressWarnings("deprecation")
public class ItemUpgradePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new SmithListener(), this);
        Bukkit.getPluginManager().registerEvents(new Random_System(), this);
        getRecipe();

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void getRecipe() {
        SmithingRecipe recipe = new SmithingRecipe(new NamespacedKey(this, "test"),
                new ItemStack(Material.AIR, 1), // any material seems fine
                new RecipeChoice.MaterialChoice(Material.NETHERITE_SWORD),
                new RecipeChoice.MaterialChoice(Material.RABBIT_HIDE)
        );
        Bukkit.addRecipe(recipe);

        ShapedRecipe magwang_recipe = new ShapedRecipe(magwang);
        magwang_recipe.shape("***","*%*","***");
        magwang_recipe.setIngredient('*', Material.IRON_INGOT);
        magwang_recipe.setIngredient('%', Material.DRAGON_BREATH);
        Bukkit.addRecipe(magwang_recipe);

        ShapedRecipe attack_magwang_recipe = new ShapedRecipe(attack_magwang);
        attack_magwang_recipe.shape("*%*","%&%","*%*");
        attack_magwang_recipe.setIngredient('*', Material.WITHER_SKELETON_SKULL);
        attack_magwang_recipe.setIngredient('%', Material.BLAZE_ROD);
        attack_magwang_recipe.setIngredient('&', Material.BLAZE_ROD);
        Bukkit.addRecipe(attack_magwang_recipe);
    }
}
