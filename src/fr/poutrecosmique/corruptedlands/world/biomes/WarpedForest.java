package fr.poutrecosmique.corruptedlands.world.biomes;

import java.util.Random;

import org.bukkit.Material;

public class WarpedForest extends NetherBiome {
	
	public WarpedForest() {
		super();
		main = Material.NETHERRACK;
		ores = new Material[] { Material.NETHER_QUARTZ_ORE, Material.NETHER_GOLD_ORE };
		sand = Material.WARPED_NYLIUM;
		gravel = Material.NETHER_WART_BLOCK;
		plants = new Material[] { Material.WARPED_ROOTS, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS };
		
		rdm = new Random();
	}

	@Override
	public Material getMaterialFor(Material block) {
		switch(block) {
		case COAL_ORE:
			return ores[0];
		case IRON_ORE:
			return ores[1];
		case GOLD_ORE:
			return ores[1];
		case DIAMOND_ORE:
			return Material.NETHERITE_SCRAP;
		case LAPIS_ORE:
			return ores[0];
		case EMERALD_ORE:
			return Material.NETHERITE_SCRAP;
		case REDSTONE_ORE:
			return ores[0];
		case SAND:
			return sand;
		case GRAVEL:
			return gravel;
		case GRASS:
			return randomPlant();
		case TALL_GRASS:
			return randomPlant();
		case WHEAT_SEEDS:
			return randomPlant();
		case CARROTS:
			return randomPlant();
		case POTATOES:
			return randomPlant();
		case MELON_STEM:
			return randomPlant();
		case PUMPKIN_STEM:
			return randomPlant();
		case BEETROOT_SEEDS:
			return randomPlant();
		case ATTACHED_MELON_STEM:
			return randomPlant();
		case ATTACHED_PUMPKIN_STEM:
			return randomPlant();
		case DANDELION:
			return randomPlant();
		case POPPY:
			return randomPlant();
		case AZURE_BLUET:
			return randomPlant();
		case RED_TULIP:
			return randomPlant();
		case ORANGE_TULIP:
			return randomPlant();
		case WHITE_TULIP:
			return randomPlant();
		case PINK_TULIP:
			return randomPlant();
		case OXEYE_DAISY:
			return randomPlant();
		case WATER:
			return Material.LAVA;
		case OAK_LOG:
			return Material.WARPED_STEM;
		case OAK_LEAVES:
			return Material.WARPED_WART_BLOCK;
		case OAK_PLANKS:
			return Material.WARPED_PLANKS;
		case OAK_SLAB:
			return Material.WARPED_SLAB;
		case OAK_STAIRS:
			return Material.WARPED_STAIRS;
		case OAK_FENCE:
			return Material.WARPED_FENCE;
		case OAK_FENCE_GATE:
			return Material.WARPED_FENCE_GATE;
		case OAK_DOOR:
			return Material.WARPED_DOOR;
		case OAK_TRAPDOOR:
			return Material.WARPED_TRAPDOOR;
		case OAK_BUTTON:
			return Material.WARPED_BUTTON;
		case OAK_PRESSURE_PLATE:
			return Material.WARPED_PRESSURE_PLATE;
		case OAK_SIGN:
			return Material.WARPED_SIGN;
		case OAK_WALL_SIGN:
			return Material.WARPED_WALL_SIGN;
		case SPRUCE_LOG:
			return Material.WARPED_STEM;
		case SPRUCE_LEAVES:
			return Material.WARPED_WART_BLOCK;
		case SPRUCE_PLANKS:
			return Material.WARPED_PLANKS;
		case SPRUCE_SLAB:
			return Material.WARPED_SLAB;
		case SPRUCE_STAIRS:
			return Material.WARPED_STAIRS;
		case SPRUCE_FENCE:
			return Material.WARPED_FENCE;
		case SPRUCE_FENCE_GATE:
			return Material.WARPED_FENCE_GATE;
		case SPRUCE_DOOR:
			return Material.WARPED_DOOR;
		case SPRUCE_TRAPDOOR:
			return Material.WARPED_TRAPDOOR;
		case SPRUCE_BUTTON:
			return Material.WARPED_BUTTON;
		case SPRUCE_PRESSURE_PLATE:
			return Material.WARPED_PRESSURE_PLATE;
		case SPRUCE_SIGN:
			return Material.WARPED_SIGN;
		case SPRUCE_WALL_SIGN:
			return Material.WARPED_WALL_SIGN;
		case BIRCH_LOG:
			return Material.WARPED_STEM;
		case BIRCH_LEAVES:
			return Material.WARPED_WART_BLOCK;
		case BIRCH_PLANKS:
			return Material.WARPED_PLANKS;
		case BIRCH_SLAB:
			return Material.WARPED_SLAB;
		case BIRCH_STAIRS:
			return Material.WARPED_STAIRS;
		case BIRCH_FENCE:
			return Material.WARPED_FENCE;
		case BIRCH_FENCE_GATE:
			return Material.WARPED_FENCE_GATE;
		case BIRCH_DOOR:
			return Material.WARPED_DOOR;
		case BIRCH_TRAPDOOR:
			return Material.WARPED_TRAPDOOR;
		case BIRCH_BUTTON:
			return Material.WARPED_BUTTON;
		case BIRCH_PRESSURE_PLATE:
			return Material.WARPED_PRESSURE_PLATE;
		case BIRCH_SIGN:
			return Material.WARPED_SIGN;
		case BIRCH_WALL_SIGN:
			return Material.WARPED_WALL_SIGN;
		case JUNGLE_LOG:
			return Material.WARPED_STEM;
		case JUNGLE_LEAVES:
			return Material.WARPED_WART_BLOCK;
		case JUNGLE_PLANKS:
			return Material.WARPED_PLANKS;
		case JUNGLE_SLAB:
			return Material.WARPED_SLAB;
		case JUNGLE_STAIRS:
			return Material.WARPED_STAIRS;
		case JUNGLE_FENCE:
			return Material.WARPED_FENCE;
		case JUNGLE_FENCE_GATE:
			return Material.WARPED_FENCE_GATE;
		case JUNGLE_DOOR:
			return Material.WARPED_DOOR;
		case JUNGLE_TRAPDOOR:
			return Material.WARPED_TRAPDOOR;
		case JUNGLE_BUTTON:
			return Material.WARPED_BUTTON;
		case JUNGLE_PRESSURE_PLATE:
			return Material.WARPED_PRESSURE_PLATE;
		case JUNGLE_SIGN:
			return Material.WARPED_SIGN;
		case JUNGLE_WALL_SIGN:
			return Material.WARPED_WALL_SIGN;
		case ACACIA_LOG:
			return Material.WARPED_STEM;
		case ACACIA_LEAVES:
			return Material.WARPED_WART_BLOCK;
		case ACACIA_PLANKS:
			return Material.WARPED_PLANKS;
		case ACACIA_SLAB:
			return Material.WARPED_SLAB;
		case ACACIA_STAIRS:
			return Material.WARPED_STAIRS;
		case ACACIA_FENCE:
			return Material.WARPED_FENCE;
		case ACACIA_FENCE_GATE:
			return Material.WARPED_FENCE_GATE;
		case ACACIA_DOOR:
			return Material.WARPED_DOOR;
		case ACACIA_TRAPDOOR:
			return Material.WARPED_TRAPDOOR;
		case ACACIA_BUTTON:
			return Material.WARPED_BUTTON;
		case ACACIA_PRESSURE_PLATE:
			return Material.WARPED_PRESSURE_PLATE;
		case ACACIA_SIGN:
			return Material.WARPED_SIGN;
		case ACACIA_WALL_SIGN:
			return Material.WARPED_WALL_SIGN;
		case GRASS_BLOCK:
			return Material.WARPED_NYLIUM;
		case DIRT:
			return Material.WARPED_NYLIUM;
			

			// Don't change the block already updated
		case LAVA:
			return Material.LAVA;
		case NETHER_QUARTZ_ORE:
			return Material.NETHER_QUARTZ_ORE;
		case NETHER_GOLD_ORE:
			return Material.NETHER_GOLD_ORE;
		case NETHERITE_SCRAP:
			return Material.NETHERITE_SCRAP;
		case SOUL_SOIL:
			return Material.SOUL_SOIL;
		case SOUL_FIRE:
			return Material.SOUL_FIRE;
		case CRIMSON_ROOTS:
			return Material.CRIMSON_ROOTS;
		case WARPED_ROOTS:
			return Material.WARPED_ROOTS;
		case CRIMSON_FUNGUS:
			return Material.CRIMSON_FUNGUS;
		case WARPED_FUNGUS:
			return Material.WARPED_FUNGUS;
		case CRIMSON_NYLIUM:
			return Material.CRIMSON_NYLIUM;
		case WARPED_NYLIUM:
			return Material.WARPED_NYLIUM;
		case SOUL_SAND:
			return Material.SOUL_SAND;
		case NETHER_WART_BLOCK:
			return Material.NETHER_WART_BLOCK;
		case NETHER_WART:
			return Material.NETHER_WART;
		case NETHERRACK:
			return Material.NETHERRACK;
		case BROWN_MUSHROOM:
			return Material.BROWN_MUSHROOM;
		case RED_MUSHROOM:
			return Material.RED_MUSHROOM;
		case FIRE:
			return Material.FIRE;
		case BASALT:
			return Material.BASALT;
		case BLACKSTONE:
			return Material.BLACKSTONE;
		case MAGMA_BLOCK:
			return Material.MAGMA_BLOCK;
		case CRIMSON_STEM:
			return Material.CRIMSON_STEM;
		case WARPED_STEM:
			return Material.WARPED_STEM;
		default:
			return main;
			
		}
	}
	
	private Material randomPlant() {
		if(rdm.nextBoolean()) { // 50% de chance
			return plants[rdm.nextInt(plants.length)];
		}
		
		return Material.AIR;
		
	}

}
