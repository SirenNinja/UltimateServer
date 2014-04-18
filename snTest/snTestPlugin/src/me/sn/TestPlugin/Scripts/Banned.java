package me.sn.TestPlugin.Scripts;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
/**
 * Created by SirenNinja on 4/11/2014.
 * Project: snTest.
 * Credit goes to sohardhun15 for the banlist. Thank you!
 */
public class Banned implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("banned")) {
            if (args.length == 1) {
                    if (Bukkit.getBanList(BanList.Type.NAME).isBanned(args[0])) {
                        player.sendMessage(ChatColor.GOLD + args[0] + ChatColor.RED + " is banned!");
                    } else if (!Bukkit.getBanList(BanList.Type.NAME).isBanned(args[0])) {
                        player.sendMessage(ChatColor.GOLD + args[0] + ChatColor.GREEN + " is not banned or not found!");
                    } else {
                        player.sendMessage("That player wasn't found!");
                    }
            }else{
                player.sendMessage("Wrong usage! Use /banned <player>");
            }
        }
        return true;
    }
}

