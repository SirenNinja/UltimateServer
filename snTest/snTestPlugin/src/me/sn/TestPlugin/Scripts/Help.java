package me.sn.TestPlugin.Scripts;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

/**
 * Created by SirenNinja on 4/11/2014.
 * Project: snTest.
 */
public class Help implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;

        // US command.
        if(cmd.getName().equalsIgnoreCase("us")){
            player.sendMessage(ChatColor.YELLOW + "==========[ UltimateServer Help v1.0]==========");
            player.sendMessage(ChatColor.BLUE + "/Fly | /Fly <player>" + ChatColor.GREEN + " Allows you or another player to fly.");
            player.sendMessage(ChatColor.BLUE + "/Heal | /Heal <player> " + ChatColor.GREEN + " Heals you or another player.");
            player.sendMessage(ChatColor.BLUE + "/Feed | /Feed <player> " + ChatColor.GREEN + " Feeds you or another player.");
            player.sendMessage(ChatColor.BLUE + "/Banned <player> " + ChatColor.GREEN + " Tells you if a player is banned or not.");
            player.sendMessage("");
            player.sendMessage(ChatColor.DARK_PURPLE + "Created by SirenNinja");
            player.sendMessage(ChatColor.YELLOW + "==========[ UltimateServer Help v1.0]==========");

        // UltimateServer command.
        }else if(cmd.getName().equalsIgnoreCase("ultimateserver")){
            player.sendMessage(ChatColor.YELLOW + "==========[ UltimateServer Help v1.0]==========");
            player.sendMessage(ChatColor.BLUE + "/Fly | /Fly <player>" + ChatColor.GREEN + " Allows you or another player to fly.");
            player.sendMessage(ChatColor.BLUE + "/Heal | /Heal <player> " + ChatColor.GREEN + " Heals you or another player.");
            player.sendMessage(ChatColor.BLUE + "/Feed | /Feed <player> " + ChatColor.GREEN + " Feeds you or another player.");
            player.sendMessage(ChatColor.BLUE + "/Banned <player> " + ChatColor.GREEN + " Tells you if a player is banned or not.");
            player.sendMessage("");
            player.sendMessage(ChatColor.DARK_PURPLE + "Created by SirenNinja");
            player.sendMessage(ChatColor.YELLOW + "==========[ UltimateServer Help v1.0]==========");
        }
        return true;
        }
}
