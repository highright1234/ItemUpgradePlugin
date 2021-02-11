package com.github.highright1234.itemupgradeplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items_ItemStack {
    public static final ItemStack magwang = new ItemStack(Material.RABBIT_HIDE);
    public static final ItemStack attack_magwang = new ItemStack(Material.RABBIT_HIDE);

    public Items_ItemStack() {
        ItemMeta magwang_IM = magwang.getItemMeta();
        magwang_IM.setCustomModelData(1);
        magwang_IM.setDisplayName(ChatColor.WHITE + "마광");
        magwang.setItemMeta(magwang_IM);

        ItemMeta attack_magwang_IM = attack_magwang.getItemMeta();
        attack_magwang_IM.setCustomModelData(100);
        attack_magwang_IM.setDisplayName(ChatColor.WHITE+"공격속성 마광");
        attack_magwang.setItemMeta(attack_magwang_IM);
    }
}
