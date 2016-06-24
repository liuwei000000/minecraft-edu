package com.huoxingpai.Plugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DavidPlugin extends JavaPlugin {

	@Override
	public void onEnable(){
		getLogger().info("我的插件来了！");
		for (Player player : Bukkit.getServer().getOnlinePlayers()) {
		    getLogger().info(player.getName());		   
		}
		
		
		getServer().getPluginManager().registerEvents(new EventListener(), this);
	}
	
	@Override
	public void onDisable(){

	}
}
