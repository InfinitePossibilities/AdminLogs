package com.InfiniteOne.AdminLogs;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.InfiniteOne.AdminLogs.events.OwnerJoinEvent;

public class AdminLogs extends JavaPlugin {
	
	public static AdminLogs plugin;
	public static List<String> ignoredCommands;
	public static List<HistoryItem> commandHistory;
	public static List<Player> hiddenPlayers;
	public static List<Player> mutedPlayers;
	
	@Override
	public void onEnable() {
		
		infConfig();
		infEvents();
		
		System.out.println("[AdminLogs] Enabled successfully!");
	}
	
	@Override
	public void onDisable() {
		plugin = null;
		System.out.println("[AdminLogs] Disabled successfully!");
	}
	
	private void infConfig() {
		this.getConfig();
		saveDefaultConfig();
		getDataFolder();
	}
	
	private void infEvents() {
		  PluginManager pm = getServer().getPluginManager();
		  pm.registerEvents(new OwnerJoinEvent(this), this);
	}
	
}
