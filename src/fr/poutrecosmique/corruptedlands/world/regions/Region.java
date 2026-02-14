package fr.poutrecosmique.corruptedlands.world.regions;

import java.util.Random;

import org.bukkit.Location;

import fr.poutrecosmique.corruptedlands.world.Cluster;
import fr.poutrecosmique.corruptedlands.world.ClusterManager;
import fr.poutrecosmique.corruptedlands.world.biomes.BasaltDeltas;

public class Region {
	
	private Location origin;
	
	private static final int SIZE = 432;
	private static final int AVAILABLE_SIZE = 368;
	private static final int MIN_Y = 30;
	private static Random rdm;
	
	private static CLStructure structure; // Will be null if in Basalt Deltas
	
	
	public Region(Location origin) {
		this.origin = origin;
		
		rdm = new Random();
		
		spawnStructure();
	}
	
	public Location getOrigin() {
		return origin;
	}
	
	public static int getSize() {
		return SIZE;
	}
	
	public static int getAvailableSize() {
		return AVAILABLE_SIZE;
	}
	
	public CLStructure getStructure() {
		return structure;
	}
	
	
	private void spawnStructure() {
		int luck = rdm.nextInt(5);
		
		int x, y, z;
		x = rdm.nextInt(AVAILABLE_SIZE);
		y = rdm.nextInt(30);
		z = rdm.nextInt(AVAILABLE_SIZE);
		
		Location loc = new Location(origin.getWorld(), origin.getX() + x, MIN_Y + y, origin.getZ() + z);
		
		if(luck < 2) { 	// Nether Fortress
			
			structure = new CLStructure(loc, CLStrctureType.NETHER_FORTRESS, "fortress");
			
		} else { 		// Bastion
			
			Cluster c = ClusterManager.getCluster(loc);
			if(c == null || c.getBiome() instanceof BasaltDeltas) return;  // Bastion ne spawnent pas dans un basalt delta
				
			luck = rdm.nextInt(4);
			
			switch(luck) {
			
			case 0:
				structure = new CLStructure(loc, CLStrctureType.BASTION, "bastion/bridge");
				return;
				
			case 1:
				structure = new CLStructure(loc, CLStrctureType.BASTION, "bastion/hoglin_stable");
				return;
				
			case 2:
				structure = new CLStructure(loc, CLStrctureType.BASTION, "bastion/units");
				return;
				
			case 3:
				structure = new CLStructure(loc, CLStrctureType.BASTION, "bastion/treasure");
				return;
			}
			
		}
	}

}
