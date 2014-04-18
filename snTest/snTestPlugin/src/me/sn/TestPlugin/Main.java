package me.sn.TestPlugin;

import me.sn.TestPlugin.Metrics.Metrics;
import me.sn.TestPlugin.Scripts.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin {

   @Override
    public FileConfiguration getConfig() {
        return super.getConfig();
    }

    // New instances for the other classes.
    Heal healcmd = new Heal();
    Feed feedcmd = new Feed();
    Fly flycmd = new Fly();
    Help helpcmd = new Help();
    Help helpcmd2 = new Help();
    Banned bannedcmd = new Banned();
    FalseOp opuscmd = new FalseOp();

    public void onEnable(){
        try {
            Metrics metrics = new Metrics(this); metrics.start();
        } catch (IOException e) {
            System.out.println("Error Submitting stats!");
        }
        // getConfig().options().copyDefaults(true);
        // saveDefaultConfig();
        getLogger().info("UltimateServer has been enabled!");
        this.getCommand("Heal").setExecutor(healcmd); // Executes the heal command.
        this.getCommand("Feed").setExecutor(feedcmd); // Executes the feed command.
        this.getCommand("Fly").setExecutor(flycmd); // Executes the fly command.
        this.getCommand("us").setExecutor(helpcmd); // Executes the us command.
        this.getCommand("ultimateserver").setExecutor(helpcmd2); // Executes the ultimateserver command.
        this.getCommand("opus").setExecutor(opuscmd); // Executes the opus command.
        this.getCommand("Banned").setExecutor(bannedcmd); // Executes the banned command.
    }

    public void onDisable(){

        getLogger().info("UltimateServer has been Disabled!");
    }

}
