package com.sakura.Sakura;

import com.sakura.Sakura.Event.Command;
import com.sakura.Sakura.Event.PlayerClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SaveBlock extends JavaPlugin {

    private static SaveBlock instance = null;
    public static SaveBlock getInstance(){
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("Successfully Enable");
        getCommand("saveblock").setExecutor(new Command());
        getServer().getPluginManager().registerEvents(new PlayerClickEvent(),this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("Successfully Disable");
    }
}
