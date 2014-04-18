package me.sn.TestPlugin.Scripts;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

/**
 * Created by SirenNinja on 4/11/2014.
 */
public class Fly implements CommandExecutor{
    public boolean Fly = false;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
                Player player = (Player) sender;
                if(cmd.getName().equalsIgnoreCase("Fly")){
                    if(args.length == 1){
                        Player user = player.getServer().getPlayer(args[0]);
                        if(Fly == true){
                            user.setAllowFlight(false);
                            Fly = false;
                            user.sendMessage(ChatColor.RED + "Flying has been disabled for " + user.getDisplayName());

                        }else if(!Fly == true){
                            user.setAllowFlight(true);
                            Fly = true;
                            user.sendMessage(ChatColor.GREEN + "Flying has been enabled for " + user.getDisplayName());

                        }
                    }else{
                        if(Fly == true){
                            player.setAllowFlight(false);
                            Fly = false;
                            player.sendMessage(ChatColor.RED + "Flying has been disabled for " + player.getDisplayName());

                        }else if(!Fly == true){
                            player.setAllowFlight(true);
                            Fly = true;
                            player.sendMessage(ChatColor.GREEN + "Flying has been enabled for " + player.getDisplayName());

                        }
                    }
                }
        return true;
        }
    }
