package fr.poutrecosmique.corruptedlands.world.regions;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class RegionManager {
	
	private static HashMap<Location, Region> regions = new HashMap<Location, Region>();
	
	public static Region getRegion(int x, int z) {
		return regions.get(new Location(Bukkit.getWorlds().get(0), x, 50, z));
	}
	
	public static void addRegion(Region r) {
		regions.put(r.getOrigin(), r);
	}
	
	public static boolean contains(int x, int z) {
		return regions.containsKey(new Location(Bukkit.getWorlds().get(0), x, 50, z));
	}
}
