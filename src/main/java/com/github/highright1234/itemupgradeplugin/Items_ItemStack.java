package com.github.highright1234.itemupgradeplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.UUID;

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
    public ItemStack RandomItemUpgradeBefore(int RandomUpgrade, int RandomDestruction, String ItemName, int customModelData) {
        ItemStack returnItem = new ItemStack(Material.END_PORTAL_FRAME, 1);
        ItemMeta returnItemMeta = returnItem.getItemMeta();
        returnItemMeta.setDisplayName(ChatColor.WHITE+ItemName);
        ArrayList<String> lores = new ArrayList<>();
        lores.add(ChatColor.GRAY+"아이템: "+ChatColor.WHITE+ItemName);
        lores.add(ChatColor.GRAY+"강화성공확률: "+ChatColor.GOLD+RandomUpgrade+"%");
        lores.add(ChatColor.GRAY+"아이템파괴화률: "+ChatColor.RED+RandomDestruction+"%");
        returnItemMeta.setLore(lores);
        returnItemMeta.setCustomModelData(customModelData);
        returnItem.setItemMeta(returnItemMeta);
        return returnItem;
    }

    public ItemStack AttackMagwangItemPatch(ItemStack item, int customModelData, int attack_damage) {
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(customModelData);
        AttributeModifier attribute = new AttributeModifier(UUID.randomUUID(),
                "generic.attack_damage",
                attack_damage, AttributeModifier.Operation.ADD_NUMBER,
                EquipmentSlot.HAND);
        meta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attribute);
        item.setItemMeta(meta);
        return item;
    }
}
