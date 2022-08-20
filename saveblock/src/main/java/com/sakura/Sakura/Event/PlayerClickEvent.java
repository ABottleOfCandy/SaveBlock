package com.sakura.Sakura.Event;

import com.sakura.Sakura.Api.SetSaveBlock;
import com.sakura.Sakura.SaveBlock;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class PlayerClickEvent implements Listener {
    private SaveBlock plugin;
    @EventHandler
    public void playerclick(PlayerInteractEvent event) throws InterruptedException {
        if (Objects.isNull(event.getItem())){
            return;
        }else{
            ItemStack item = event.getItem();
            String display = item.getItemMeta().getDisplayName();
            Location location = event.getPlayer().getLocation();
            System.out.println(display);
            plugin = SaveBlock.getInstance();
            switch (display){
                case "§a自救平台":
                    FileConfiguration file = plugin.getConfig();
                    if (file.getBoolean("SaveBlock.setting.OnEnable")){
                        new SetSaveBlock().use(location, event.getPlayer());
                    }
                    break;
                case "1":
//                    new SetSaveBlock().use(location, event.getPlayer());
//
//                    break;

            }
        }


    }
}
