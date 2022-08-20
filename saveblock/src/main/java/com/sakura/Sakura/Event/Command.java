package com.sakura.Sakura.Event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.LinkedList;
import java.util.List;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (label.equalsIgnoreCase("saveblock" ) || label.equalsIgnoreCase("sb")){

                if (args.length >= 1){
                    if (args[0].equalsIgnoreCase("help")){

                        if (player.hasPermission("saveblock.help")){
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7==================================================="));
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&f[SaveBlock]&f命令:&e/saveblock give <player> <1>"));
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7==================================================="));
                        }else {
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&f[SaveBlock]&c你没有权限执行这条指令"));
                        }


                    } else if (args[0].equalsIgnoreCase("give")) {
                        if (args.length <= 2){
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&f[SaveBlock]&c无效的指令&f请输入&e/saveblock help"));
                        }else {
                            Player toplayer = Bukkit.getPlayer(args[1]);
                            if (!toplayer.isOnline()){
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&f[SaveBlock]&c你输入的玩家不在线"));
                            }




                            if (args[2].equalsIgnoreCase("1")){
                                List<String> list = new LinkedList<String>();

                                ItemStack item = new ItemStack(Material.BLAZE_ROD);
                                ItemMeta itemMeta = item.getItemMeta();
                                itemMeta.setDisplayName(ChatColor.GREEN + "自救平台");
                                list.add(ChatColor.BLUE + "在掉入虚空时可以拯救你");
                                list.add(ChatColor.YELLOW + "点我使用");
                                itemMeta.setLore(list);
                                item.setItemMeta(itemMeta);
                                toplayer.getInventory().setItemInHand(item);

                            }

                        }
                    }else {

                        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&f[SaveBlock]&c您输入的指令不存在&f请输入&e/saveblock help"));
                    }

                }else{
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&f[SaveBlock]&c无效的指令&f请输入&e/saveblock help"));
                }
            }
        }else{
            System.out.println("[Save_Block]"+ Color.RED + "请在服务器内执行");
        }

        return false;
    }
}
