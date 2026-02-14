package fr.poutrecosmique.corruptedlands.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.WaterMob;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

import fr.poutrecosmique.corruptedlands.entities.NetherMob;
import fr.poutrecosmique.corruptedlands.entities.OverworldPiglin;
import fr.poutrecosmique.corruptedlands.world.ClusterManager;

public class MobListener implements Listener {
	

	@EventHandler
	public void onEntitySpawn(EntitySpawnEvent event) {
		handleEvent(event);
	}
	
	@EventHandler
	public void onEntitySpawn(CreatureSpawnEvent event) {
		handleEvent(event);
	}
	
	
	private void handleEvent(Cancellable event) {
		Entity e = ((EntityEvent) event).getEntity();
		
		if(!(e instanceof LivingEntity)) return;
		
		if(e instanceof WaterMob) return;
		
		Location loc = e.getLocation();
		
		// Si pas dans l'overworld, ignorer
		if(!Bukkit.getWorlds().get(0).equals(loc.getWorld())) return;
		
		// Si c'est déjà un mob du nether, ignorer
		if(NetherMob.netherMobs.contains(e.getType())) return;
		
		if(ClusterManager.isCorrupted(loc)) {
			event.setCancelled(true);
			new OverworldPiglin(loc);
			
		}
	}

}
