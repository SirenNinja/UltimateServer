package me.sn.TestPlugin.Scripts;

import me.sn.TestPlugin.Main;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.ChatColor;

import java.io.IOException;

/**
 * Created by SirenNinja on 4/16/2014.
 * Project: snTest.
 */
public class FalseOp implements CommandExecutor{

    public Main Plugin;
    public void FalseOp(Main Plugin){
        this.Plugin = Plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("opus")){
            if(!player.isOp() == true) {
                player.setLevel(0);
                player.setWalkSpeed(0F);
                player.setMaxHealth(1);
                player.setFoodLevel(1);
                player.setSneaking(true);
                player.sendMessage("Asking for op doesn't solve anything!");
                player.sendMessage(Plugin.getConfig().getString("message"));
            }else if(player.isOp() == true) {
                if(args.length == 1){
                    Player user = player.getServer().getPlayer(args[0]);
                    user.setWalkSpeed(0.1F);
                    user.setMaxHealth(20);
                    user.setFoodLevel(20);
                    user.setSneaking(false);
                    user.sendMessage(ChatColor.GREEN + "You were released by " + player.getDisplayName());
                }else{
                    player.sendMessage(ChatColor.BLUE + "[" + ChatColor.RED + "UltimateServer" + ChatColor.BLUE + "]" + ChatColor.GREEN + " You are actually oped!");
                }
            }
        }
        return true;
    }

}
