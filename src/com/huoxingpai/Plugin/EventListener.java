package com.huoxingpai.Plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class EventListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.setJoinMessage(event.getPlayer().getName() + ", ��ӭ�����ҵ����磡");
	}	

}
