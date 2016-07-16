package com.huoxingpai.Plugin;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public final class EventListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.setJoinMessage(event.getPlayer().getName() + ", 欢迎来到我的世界！");
		
		PlayerInventory inventory = event.getPlayer().getInventory();
		
		ItemStack itemstack = new ItemStack(Material.DIAMOND_SWORD);
		inventory.addItem(itemstack);
		Player player = event.getPlayer();
		Location loc = player.getLocation();
		
		World world = player.getWorld();
		
	    Sheep sheep = world.spawn(loc, Sheep.class);


	}

}
