package com.huoxingpai.Plugin;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public final class EventListener implements Listener {
	long i = 0;

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.setJoinMessage(event.getPlayer().getName() + ", ��ӭ�����ҵ����磡");

		PlayerInventory inventory = event.getPlayer().getInventory();
		ItemStack itemstack = new ItemStack(Material.DIAMOND_SWORD);
		if (!inventory.contains(itemstack)) {
			inventory.addItem(itemstack);
			event.setJoinMessage(event.getPlayer().getName() + ", �����ʯ����");
		}

		itemstack = new ItemStack(Material.STICK);		
		if (!inventory.containsAtLeast(itemstack, 1)) {
			event.setJoinMessage(event.getPlayer().getName() + ", ���ħ������");
			inventory.addItem(itemstack);
		}
		
		Player player = event.getPlayer();
		Location loc = player.getLocation();
		World world = player.getWorld();

	}

	@EventHandler
	public void onMove(PlayerMoveEvent event) {

	}

	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Location loc = player.getLocation();
		World world = player.getWorld();
		if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
			if (event.getMaterial() == Material.DIAMOND_SWORD) {
				World w = player.getWorld();
				Sheep sheep = w.spawn(loc, Sheep.class);
			}
			if (event.getMaterial() == Material.STICK) {
				World w = player.getWorld();
				Wolf wolf = w.spawn(loc, Wolf.class);
			}
		}
	}

}
