package me.sn.TestPlugin.Scripts;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

/**
 * Created by SirenNinja on 4/11/2014.
 */
public class Heal implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;
    if(cmd.getName().equalsIgnoreCase("heal")){
        if(args.length == 1){
            Player user = player.getServer().getPlayer(args[0]);
            user.setHealth(20);
            user.sendMessage(ChatColor.AQUA + "You've been healed!");
            player.sendMessage(ChatColor.AQUA + "You healed " + user.getDisplayName());
        }else{
            player.setHealth(20);
            player.sendMessage(ChatColor.AQUA + "You healed yourself");
        }
    }else{

    }
        return true;
    }
}
