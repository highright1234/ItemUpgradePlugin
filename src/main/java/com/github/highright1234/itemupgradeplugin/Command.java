package com.github.highright1234.itemupgradeplugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

import static com.github.highright1234.itemupgradeplugin.Items_ItemStack.attack_magwang;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (args.length == 1) {
                if (args[0] == "attack_magwang") {

                } else if (args[0] == "magwang") {

                }
            }
            Objects.requireNonNull(((Player) sender).getPlayer()).getInventory().addItem(attack_magwang);
        }
        return false;
    }
}
