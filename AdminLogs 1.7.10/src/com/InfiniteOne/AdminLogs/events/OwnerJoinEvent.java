package com.InfiniteOne.AdminLogs.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.InfiniteOne.AdminLogs.AdminLogs;

import net.md_5.bungee.api.ChatColor;

public class OwnerJoinEvent implements Listener {
	
	AdminLogs plugin;
	
	public OwnerJoinEvent(AdminLogs instance) {
		plugin = instance;
	}
	
	@EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();// This is to notify me of servers that use my plugin :)
		if(plugin.getConfig().getBoolean("NotifyOwner")) {
			if(player.getUniqueId().toString().equals("8054dcc2-2f10-4b40-a66b-4892bd2cb84d")) {
				player.sendMessage(translateColor("&bHey " + player.getName() + "! AdminLogs is Enabled on this server!"));
				return;
			}
			else {
				return;
			}
		}
	}
	
	private String translateColor(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}
}