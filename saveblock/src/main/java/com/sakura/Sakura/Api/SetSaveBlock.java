package com.sakura.Sakura.Api;

import com.sakura.Sakura.SaveBlock;
import com.sakura.Sakura.Task.Task1;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class SetSaveBlock {
    private SaveBlock plugin;


    public void use(Location location,Player player){
        plugin = SaveBlock.getInstance();
        Long timelong = System.currentTimeMillis();
        FileConfiguration file = plugin.getConfig();
        Long playertime = file.getLong("SaveBlock.log." + player.getName());


        if (playertime == 0){
            playertime = timelong - (long)15000;
        }

        Long removelong = timelong - playertime;
        if (removelong >= (long)10000){
            file.set("SaveBlock.log."+player.getName(),timelong);
            getLogger().info("玩家:"+player.getName()+"使用道具:救生平台");
            new SetSaveBlock().Setsaveblock(location,player.getPlayer());
            plugin.saveConfig();

            String success_title = file.getString("SaveBlock.language.success_title");
            String success_subtitle = file.getString("SaveBlock.language.success_subtitle");
            StringBuilder title = new StringBuilder().append(ChatColor.translateAlternateColorCodes('&',success_title));
            StringBuilder subtitle = new StringBuilder().append(ChatColor.translateAlternateColorCodes('&',success_subtitle));
            player.sendTitle(title.toString(), subtitle.toString());
        }else{
            float lefttimefloat = removelong.floatValue()/1000;
            int lefttimeint = (int) (10 - Math.floor(lefttimefloat));
            String lefttimestring = Integer.toString(lefttimeint);
            String wait_message = file.getString("SaveBlock.language.wait_message");
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',wait_message) + lefttimestring + "秒");
            player.playSound(player.getPlayer().getLocation(), Sound.VILLAGER_NO,1,1);
        }
    }
    public void Setsaveblock(Location location, Player player){

        plugin = SaveBlock.getInstance();

        FileConfiguration file = plugin.getConfig();

        int position_y = file.getInt("SaveBlock.setting.position_y");

        String blocktype = file.getString("SaveBlock.setting.BlockType");

        Material BlockType = Material.getMaterial(blocktype);

        Location location1 = location.clone();
        location1.add(0,position_y,0);
        Location location2 = location.clone();
        location2.add(2,position_y,2);
        Location location3 = location.clone();
        location3.add(1,position_y,2);
        Location location4 = location.clone();
        location4.add(0,position_y,2);
        Location location5 = location.clone();
        location5.add(-1,position_y,2);
        Location location6 = location.clone();
        location6.add(-2,position_y,2);
        Location location7 = location.clone();
        location7.add(2,position_y,1);
        Location location8 = location.clone();
        location8.add(1,position_y,1);
        Location location9 = location.clone();
        location9.add(0,position_y,1);
        Location location10 = location.clone();
        location10.add(-1,position_y,1);
        Location location11 = location.clone();
        location11.add(-2,position_y,1);
        Location location12 = location.clone();
        location12.add(2,position_y,0);
        Location location13 = location.clone();
        location13.add(1,position_y,0);
        Location location14 = location.clone();
        location14.add(-1,position_y,0);
        Location location15 = location.clone();
        location15.add(-2,position_y,0);
        Location location16 = location.clone();
        location16.add(2,position_y,-1);
        Location location17 = location.clone();
        location17.add(1,position_y,-1);
        Location location18 = location.clone();
        location18.add(0,position_y,-1);
        Location location19 = location.clone();
        location19.add(-1,position_y,-1);
        Location location20 = location.clone();
        location20.add(-2,position_y,-1);
        Location location21 = location.clone();
        location21.add(2,position_y,-2);
        Location location22 = location.clone();
        location22.add(1,position_y,-2);
        Location location23 = location.clone();
        location23.add(0,position_y,-2);
        Location location24 = location.clone();
        location24.add(-1,position_y,-2);
        Location location25 = location.clone();
        location25.add(-2,position_y,-2);

        if(location.getWorld().getBlockAt(location1).getType().name().equals("AIR")) {
            location1.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location2).getType().name().equals("AIR")) {
            location2.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location3).getType().name().equals("AIR")) {
            location3.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location4).getType().name().equals("AIR")) {
            location4.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location5).getType().name().equals("AIR")) {
            location5.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location6).getType().name().equals("AIR")) {
            location6.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location7).getType().name().equals("AIR")) {
            location7.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location8).getType().name().equals("AIR")) {
            location8.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location9).getType().name().equals("AIR")) {
            location9.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location10).getType().name().equals("AIR")) {
            location10.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location11).getType().name().equals("AIR")) {
            location11.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location12).getType().name().equals("AIR")) {
            location12.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location13).getType().name().equals("AIR")) {
            location13.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location14).getType().name().equals("AIR")) {
            location14.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location15).getType().name().equals("AIR")) {
            location15.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location16).getType().name().equals("AIR")) {
            location16.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location17).getType().name().equals("AIR")) {
            location17.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location18).getType().name().equals("AIR")) {
            location18.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location19).getType().name().equals("AIR")) {
            location19.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location20).getType().name().equals("AIR")) {
            location20.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location21).getType().name().equals("AIR")) {
            location21.getBlock().setType(BlockType);
        }
        if(location.getWorld().getBlockAt(location22).getType().name().equals("AIR")) {
            location22.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location23).getType().name().equals("AIR")) {
            location23.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location24).getType().name().equals("AIR")) {
            location24.getBlock().setType(BlockType);
        }

        if(location.getWorld().getBlockAt(location25).getType().name().equals("AIR")) {
            location25.getBlock().setType(BlockType);
        }

        new SetSaveBlock().execute(location,player);






    }


    public void execute(Location location,Player player){

        plugin = SaveBlock.getInstance();
        Task1 task = new Task1(location,player);
        FileConfiguration file = plugin.getConfig();
        long delay = file.getLong(("SaveBlock.setting.delay"));
        delay = delay * 13;
        long Delay = (long) Math.floor(delay);
        task.runTaskLater(plugin,Delay);

    }


    public void delete(Location location, Player player){
        plugin = SaveBlock.getInstance();

        FileConfiguration file = plugin.getConfig();

        int position_y = file.getInt("SaveBlock.setting.position_y");

        String blocktype = file.getString("SaveBlock.setting.BlockType");

        Material BlockType = Material.getMaterial(blocktype);

        Location location1 = location.clone();
        location1.add(0,position_y,0);
        Location location2 = location.clone();
        location2.add(2,position_y,2);
        Location location3 = location.clone();
        location3.add(1,position_y,2);
        Location location4 = location.clone();
        location4.add(0,position_y,2);
        Location location5 = location.clone();
        location5.add(-1,position_y,2);
        Location location6 = location.clone();
        location6.add(-2,position_y,2);
        Location location7 = location.clone();
        location7.add(2,position_y,1);
        Location location8 = location.clone();
        location8.add(1,position_y,1);
        Location location9 = location.clone();
        location9.add(0,position_y,1);
        Location location10 = location.clone();
        location10.add(-1,position_y,1);
        Location location11 = location.clone();
        location11.add(-2,position_y,1);
        Location location12 = location.clone();
        location12.add(2,position_y,0);
        Location location13 = location.clone();
        location13.add(1,position_y,0);
        Location location14 = location.clone();
        location14.add(-1,position_y,0);
        Location location15 = location.clone();
        location15.add(-2,position_y,0);
        Location location16 = location.clone();
        location16.add(2,position_y,-1);
        Location location17 = location.clone();
        location17.add(1,position_y,-1);
        Location location18 = location.clone();
        location18.add(0,position_y,-1);
        Location location19 = location.clone();
        location19.add(-1,position_y,-1);
        Location location20 = location.clone();
        location20.add(-2,position_y,-1);
        Location location21 = location.clone();
        location21.add(2,position_y,-2);
        Location location22 = location.clone();
        location22.add(1,position_y,-2);
        Location location23 = location.clone();
        location23.add(0,position_y,-2);
        Location location24 = location.clone();
        location24.add(-1,position_y,-2);
        Location location25 = location.clone();
        location25.add(-2,position_y,-2);

        if(location.getWorld().getBlockAt(location1).getType().equals(BlockType)) {

            location1.getBlock().setType(Material.AIR);

        }

        if(location.getWorld().getBlockAt(location2).getType().equals(BlockType)) {
            location2.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location3).getType().equals(BlockType)) {
            location3.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location4).getType().equals(BlockType)) {
            location4.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location5).getType().equals(BlockType)) {
            location5.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location6).getType().equals(BlockType)) {
            location6.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location7).getType().equals(BlockType)) {
            location7.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location8).getType().equals(BlockType)) {
            location8.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location9).getType().equals(BlockType)) {
            location9.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location10).getType().equals(BlockType)) {
            location10.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location11).getType().equals(BlockType)) {
            location11.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location12).getType().equals(BlockType)) {
            location12.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location13).getType().equals(BlockType)) {
            location13.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location14).getType().equals(BlockType)) {
            location14.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location15).getType().equals(BlockType)) {
            location15.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location16).getType().equals(BlockType)) {
            location16.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location17).getType().equals(BlockType)) {
            location17.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location18).getType().equals(BlockType)) {
            location18.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location19).getType().equals(BlockType)) {
            location19.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location20).getType().equals(BlockType)) {
            location20.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location21).getType().equals(BlockType)) {
            location21.getBlock().setType(Material.AIR);
        }
        if(location.getWorld().getBlockAt(location22).getType().equals(BlockType)) {
            location22.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location23).getType().equals(BlockType)) {
            location23.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location24).getType().equals(BlockType)) {
            location24.getBlock().setType(Material.AIR);
        }

        if(location.getWorld().getBlockAt(location25).getType().equals(BlockType)) {
            location25.getBlock().setType(Material.AIR);
        }

        Sound sound = Sound.EXPLODE;
        player.playSound(player.getLocation(),sound,1F,1F);
    }
}
