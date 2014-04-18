package me.sn.TestPlugin.Scripts;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

/**
 * Created by SirenNinja on 4/11/2014.
 */
public class Feed implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("Feed")){
            if(args.length == 1){
                Player user = player.getServer().getPlayer(args[0]);
                user.setFoodLevel(20);
                user.sendMessage(ChatColor.AQUA + "You've been fed!");
                player.sendMessage(ChatColor.AQUA + "You fed " + user.getDisplayName());
            }else{
                player.setFoodLevel(20);
                player.sendMessage(ChatColor.AQUA + "You fed yourself");
            }
        }
        return true;
    }
}
