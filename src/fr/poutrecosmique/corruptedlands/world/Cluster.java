package fr.poutrecosmique.corruptedlands.world;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.block.Block;

import fr.poutrecosmique.corruptedlands.world.biomes.NetherBiome;
import fr.poutrecosmique.corruptedlands.world.biomes.NetherWastes;

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
		
		radius = 1;
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
		
		int x = origin.getBlockX() - radius;
		int y = origin.getBlockY() - radius;
		int z = origin.getBlockZ() - radius;
		
		int maxX = origin.getBlockX() + radius;
		int maxY = origin.getBlockY() + radius;
		int maxZ = origin.getBlockZ() + radius;
		
		Block b;
		
		while(x < maxX) {
			while(z < maxZ) {
				while(y < maxY) {
					b = origin.getWorld().getBlockAt(x, y, z);
					if(b.getLocation().distance(origin) <= radius) {
						b.setType(biome.getMaterialFor(b.getType()));
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
	
	public boolean isMergeable(Cluster c) {
		int distance = (int) origin.distance(c.getOrigin());
		
		return distance <= radius + c.getRadius();
	}
	
	public void merge(Cluster c) {
		Location loc = c.getOrigin().subtract(origin).multiply(0.5);
		this.origin = loc;
		
		// This cluster is smaller than the other one
		if(radius < c.getRadius()) {
			radius = c.getRadius();
			biome = c.getBiome();
		}
	}
	
	
}
