package fr.poutrecosmique.corruptedlands.world.biomes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.bukkit.Material;

public abstract class NetherBiome {
	
	Material main;
	Material[] ores;
	Material sand;
	Material gravel;
	Material[] plants;
	
	ArrayList<Material> ignored = new ArrayList<>(Arrays.asList(Material.AIR, Material.CAVE_AIR, Material.VOID_AIR, Material.OBSIDIAN, Material.BEDROCK,Material.NETHER_PORTAL, Material.END_PORTAL, Material.END_PORTAL_FRAME,
			Material.LAVA, Material.NETHERRACK, Material.SOUL_SAND, Material.SOUL_SOIL, Material.NETHER_QUARTZ_ORE, Material.NETHER_GOLD_ORE, Material.ANCIENT_DEBRIS, Material.FIRE, Material.SOUL_FIRE,
			Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS, Material.CRIMSON_ROOTS, Material.WARPED_ROOTS, Material.NETHER_WART_BLOCK, Material.WARPED_NYLIUM, Material.CRIMSON_NYLIUM, Material.BASALT,
			Material.BLACKSTONE, Material.MAGMA_BLOCK, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS, Material.CRIMSON_STAIRS, Material.WARPED_STAIRS, Material.CRIMSON_SLAB, Material.WARPED_SLAB,
			Material.CRIMSON_STEM, Material.WARPED_STEM, Material.CRIMSON_HYPHAE, Material.WARPED_HYPHAE, Material.CHEST, Material.TRAPPED_CHEST, Material.ENDER_CHEST, Material.ANVIL, Material.BEACON,Material.ENCHANTING_TABLE,
			Material.WARPED_WART_BLOCK, Material.TWISTING_VINES_PLANT, Material.WEEPING_VINES_PLANT, Material.SHROOMLIGHT, Material.STONE_BRICKS, Material.CHISELED_STONE_BRICKS, Material.STONE_BRICK_SLAB,
			Material.STONE_BRICK_STAIRS, Material.IRON_BARS, Material.GOLD_BLOCK, Material.BONE_BLOCK));
	
	Random rdm;
	
	public abstract Material getMaterialFor(Material block);
	
	public Material[] getPlants() {
		return plants;
	}
	
}
