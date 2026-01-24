package fr.poutrecosmique.corruptedlands.world.biomes;

import java.util.Random;

import org.bukkit.Material;

public abstract class NetherBiome {
	
	Material main;
	Material[] ores;
	Material sand;
	Material gravel;
	Material[] plants;
	
	Random rdm;
	
	public abstract Material getMaterialFor(Material block);
	
}
