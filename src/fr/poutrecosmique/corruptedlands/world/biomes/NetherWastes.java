package fr.poutrecosmique.corruptedlands.world.biomes;

import java.util.Random;

import org.bukkit.Material;

public class NetherWastes extends NetherBiome {
	
	public NetherWastes() {
		super();
		main = Material.NETHERRACK;
		ores = new Material[] { Material.NETHER_QUARTZ_ORE, Material.NETHER_GOLD_ORE };
		sand = Material.SOUL_SAND;
		gravel = Material.GRAVEL;
		plants = new Material[] { Material.RED_MUSHROOM, Material.BROWN_MUSHROOM, Material.FIRE };
		
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
		case AIR:
			return Material.AIR;

			
			// ERADICATE
		case OAK_LOG:
			return Material.AIR;
		case OAK_LEAVES:
			return Material.AIR;
		case SPRUCE_LOG:
			return Material.AIR;
		case SPRUCE_LEAVES:
			return Material.AIR;
		case BIRCH_LOG:
			return Material.AIR;
		case BIRCH_LEAVES:
			return Material.AIR;
		case JUNGLE_LOG:
			return Material.AIR;
		case JUNGLE_LEAVES:
			return Material.AIR;
		case ACACIA_LOG:
			return Material.AIR;
		case ACACIA_LEAVES:
			return Material.AIR;
		case DARK_OAK_LOG:
			return Material.AIR;
		case DARK_OAK_LEAVES:
			return Material.AIR;
			
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
