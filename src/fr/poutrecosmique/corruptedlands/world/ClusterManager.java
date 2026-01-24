package fr.poutrecosmique.corruptedlands.world;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.scheduler.BukkitRunnable;

import fr.poutrecosmique.corruptedlands.CorruptedLands;

public class ClusterManager {
	
	static List<Cluster> clusters = new ArrayList<Cluster>();
	
	
	static int delay = 30;
	
	public static void addCluster(Cluster c) {
		clusters.add(c);
	}
	
	public static void removeCluster(Cluster c) {
		clusters.remove(c);
	}
	
	public static List<Cluster> getClusters() {
		return clusters;
	}
	
	public static void clearClusters() {
		clusters.clear();
	}
	
	public static void printClusters() {
		for(Cluster c : clusters) {
			System.out.println(c.toString());
		}
	}
	
	public static void gameTimer(CorruptedLands main) {
		new BukkitRunnable() {

			@Override
			public void run() {
				update();
			}
			
		}.runTaskTimer(main, 0, delay*20); // *20 bcs it's in ticks
	}
	
	public static void update() {
		checkMerge();
		
		for(Cluster c : clusters) {
			c.expend();
		}
	}
	
	public static void checkMerge() {
		if(clusters.size() < 2) return;
		
		int i = 0;
		int j;
		Cluster current;
		Cluster next;
		while(i < clusters.size()) {
			
			j = 0;
			current = clusters.get(i);
			
			while(j < clusters.size()) {
				
				next = clusters.get(j);
				if(current == next) continue; // Same one we don't care
				
				if(current.isMergeable(next)) {
					current.merge(next);
					clusters.remove(next);
				}
				
				j++;
			}
			
			i++;
		}
	}
}
