package fr.poutrecosmique.corruptedlands.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import fr.poutrecosmique.corruptedlands.world.ClusterManager;

public class WaterListener implements Listener {
	
	@EventHandler
	public static void placeWaterBucket(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		Location loc = p.getLocation();
		
		// Hors de l'overworld on s'en fout
		if(!Bukkit.getWorlds().get(0).equals(loc.getWorld())) return;
		
		int i = 0;
		while(i < ClusterManager.getClusters().size() && ClusterManager.getClusters().get(i).getOrigin().distance(loc) >= ClusterManager.getClusters().get(i).getRadius()) {
			i++;
		}
		
		if(i == ClusterManager.getClusters().size()) {
			return;
		}
		
		if(p.getInventory().getItemInMainHand().getType().equals(Material.WATER_BUCKET)) {
			event.setCancelled(true);
			p.getInventory().getItemInMainHand().setType(Material.BUCKET);
			p.updateInventory();
			p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_BURN, 1, 1.25f);
		}
	}

}
