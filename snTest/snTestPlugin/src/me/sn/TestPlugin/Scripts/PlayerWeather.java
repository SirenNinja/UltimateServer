package me.sn.TestPlugin.Scripts;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by SirenNinja on 4/12/2014.
 * Project: snTest.
 */
public class PlayerWeather implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("pweather")){
            if(args.length == 2){
                Player user = player.getServer().getPlayer(args[0]);

            }
        }
        return true;
    }
}
