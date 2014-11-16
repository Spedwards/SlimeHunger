package me.pinkslime.SlimeHunger;

import org.spongepowered.api.entity.Player;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id="SlimeHunger", name="SlimeHunger", version="1.0")
public class Main {
	
	@Subscribe
	public void onEnable(PreInitializationEvent e) {
		
		
		
	}
	
	@Subscribe
	public void onPlayerMove(PlayerMoveEvent e) {
		
		Player player = e.getPlayer();
		
		if (player.hasPermission("uh.hunger")) {
													// Player has permission,
			if (player.getFoodLevel() < 20) {		// and his food level is less than 20 (full),
				player.setFoodLevel(20);			// set his food level to 20
				player.setSaturation(20);			// and his saturation to 20
			}
			
		}
		
	}
	
}