package fr.poutrecosmique.corruptedlands.world;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

import fr.poutrecosmique.corruptedlands.world.biomes.CrimsonForest;
import fr.poutrecosmique.corruptedlands.world.biomes.NetherBiome;
import fr.poutrecosmique.corruptedlands.world.biomes.NetherWastes;
import fr.poutrecosmique.corruptedlands.world.biomes.WarpedForest;

public class Cluster {
	
	Location origin;
	int radius;
	NetherBiome biome;
	Random rdm;

	public Cluster(Location origin) {
		this.origin = origin;
		rdm = new Random();
		biome = new NetherWastes();
		
		radius = 1;
	}
	
	public Cluster(Location origin, NetherBiome biome) {
		this.origin = origin;
		this.biome = biome;
		rdm = new Random();
		
		radius = 1;
	}
	
	public Cluster(Location origin, NetherBiome biome, int radius) {
		this.origin = origin;
		this.biome = biome;
		this.radius = radius;
		rdm = new Random();
	}
	
	public Location getOrigin() {
		return origin;
	}
	
	public NetherBiome getBiome() {
		return biome;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setOrigin(Location origin) {
		this.origin = origin;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setBiome(NetherBiome biome) {
		this.biome = biome;
	}
	
	@Override
	public String toString() {
		return "Cluster [origin=" + origin + ", radius=" + radius + ", biome=" + biome + "]";
	}
	
	public void expend() {
		radius++;
		
		int minX = origin.getBlockX() - radius;
		int minY = origin.getBlockY() - radius;
		int minZ = origin.getBlockZ() - radius;
		
		int x = minX;
		int y = minY;
		int z = minZ;
		
		int maxX = origin.getBlockX() + radius;
		int maxY = origin.getBlockY() + radius;
		int maxZ = origin.getBlockZ() + radius;
		
		Block b;
		Material m;
		
		while(x < maxX) {
			while(z < maxZ) {
				while(y < maxY) {
					b = origin.getWorld().getBlockAt(x, y, z);
					if(b.getLocation().distance(origin) <= radius) {
						m = biome.getMaterialFor(b.getType());
						b.setType(m);
						if(m == Material.LAVA) {
							lavaPropagation(b, 1);
							b.setType(m);
						} else if((m == Material.CRIMSON_NYLIUM || m == Material.WARPED_NYLIUM) && isNearbyEdge(x, y, z, 2)) {
							randomPlant(b);
						} else if(biome instanceof CrimsonForest && m == Material.NETHER_WART_BLOCK && isNearbyEdge(x, y, z, 2)) {
							((CrimsonForest) biome).weepingVines(b.getRelative(BlockFace.DOWN));
						}
						
					}
					y++;
				}
				y = origin.getBlockY() - radius;
				z++;
			}
			z = origin.getBlockZ() - radius;
			x++;
		}
	}
	
	private boolean isNearbyEdge(int x, int y, int z, int distance) {
		return origin.distance(new Location(origin.getWorld(), x, y, z)) >= radius - distance;
	}
	
	private void lavaPropagation(Block b, int counter) {
		
		if(counter > 1024) return;

		lavaPropagationWorker(b.getRelative(BlockFace.DOWN), counter);
		lavaPropagationWorker(b.getRelative(BlockFace.UP), counter);
		lavaPropagationWorker(b.getRelative(BlockFace.NORTH), counter);
		lavaPropagationWorker(b.getRelative(BlockFace.SOUTH), counter);
		lavaPropagationWorker(b.getRelative(BlockFace.WEST), counter);
		lavaPropagationWorker(b.getRelative(BlockFace.EAST), counter);
		
	}
	
	private void lavaPropagationWorker(Block otherBlock, int counter) {
		if(otherBlock.getType() == Material.WATER) {
			otherBlock.setType(Material.LAVA);
			lavaPropagation(otherBlock, counter + 1);
			otherBlock.setType(Material.LAVA);
		}
	}
	

	private void randomPlant(Block b) {
		int luck = rdm.nextInt(100);
		if(luck < 10) { // 10% de chance
			if(biome instanceof WarpedForest) {
				((WarpedForest) biome).twistingVines(b.getRelative(BlockFace.UP));
			}
		} else if(luck >= 80) { // 20%
			b.getRelative(BlockFace.UP).setType(biome.getPlants()[rdm.nextInt(biome.getPlants().length)]);
		}
		
	}
	
	public boolean isMergeable(Cluster c) {
		int distance = (int) origin.distance(c.getOrigin());
		
		return distance <= radius + c.getRadius();
	}
	
	public void merge(Cluster c) {
		Location loc = c.getOrigin().add(origin).multiply(0.5);
		this.origin = loc;
		
		// This cluster is smaller than the other one
		if(radius < c.getRadius()) {
			radius = c.getRadius() / 2;
			biome = c.getBiome();
		} else {
			radius /= 2;
		}
	}
	
}
