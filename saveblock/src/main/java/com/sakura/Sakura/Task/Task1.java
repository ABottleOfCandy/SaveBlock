package com.sakura.Sakura.Task;

import com.sakura.Sakura.Api.SetSaveBlock;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Task1 extends BukkitRunnable {


    private Location location;
    private Player player;
    public Task1(Location location, Player player){
        this.location = location;
        this.player = player;
    }


    @Override
    public void run() {
        new SetSaveBlock().delete(location,player);
    }
}
