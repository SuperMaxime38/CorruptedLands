package fr.poutrecosmique.corruptedlands.world.biomes;

import org.bukkit.Material;

public class SoulSandValley extends NetherBiome {
	
	public SoulSandValley() {
		super();
		main = Material.SOUL_SOIL;
		ores = new Material[] { Material.NETHER_QUARTZ_ORE, Material.NETHER_GOLD_ORE };
		sand = Material.SOUL_SAND;
		gravel = Material.GRAVEL;
		plants = new Material[] { Material.CRIMSON_ROOTS, Material.SOUL_FIRE, Material.SOUL_FIRE };
	}

	@Override
	public Material getMaterialFor(Material block) {
		if(ignored.contains(block)) return block;
		
		switch(block) {
		case COAL_ORE:
			return ores[0];
		case IRON_ORE:
			return ores[1];
		case GOLD_ORE:
			return ores[1];
		case DIAMOND_ORE:
			return Material.ANCIENT_DEBRIS;
		case LAPIS_ORE:
			return ores[0];
		case EMERALD_ORE:
			return Material.ANCIENT_DEBRIS;
		case REDSTONE_ORE:
			return ores[0];
		case SAND:
			return sand;
		case GRAVEL:
			return gravel;
		case WATER:
			return Material.LAVA;
		case GRASS_BLOCK:
			return Material.SOUL_SAND;

			
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
		case MUSHROOM_STEM:
			return Material.AIR;
		case BROWN_MUSHROOM_BLOCK:
			return Material.AIR;
		case RED_MUSHROOM_BLOCK:
			return Material.AIR;
		case GRASS:
			return Material.AIR;
		case TALL_GRASS:
			return Material.AIR;
		case WHEAT_SEEDS:
			return Material.AIR;
		case CARROTS:
			return Material.AIR;
		case POTATOES:
			return Material.AIR;
		case MELON_STEM:
			return Material.AIR;
		case PUMPKIN_STEM:
			return Material.AIR;
		case BEETROOT_SEEDS:
			return Material.AIR;
		case ATTACHED_MELON_STEM:
			return Material.AIR;
		case ATTACHED_PUMPKIN_STEM:
			return Material.AIR;
		case DANDELION:
			return Material.AIR;
		case POPPY:
			return Material.AIR;
		case AZURE_BLUET:
			return Material.AIR;
		case RED_TULIP:
			return Material.AIR;
		case ORANGE_TULIP:
			return Material.AIR;
		case WHITE_TULIP:
			return Material.AIR;
		case PINK_TULIP:
			return Material.AIR;
		case OXEYE_DAISY:
			return Material.AIR;
		case VINE:
			return Material.AIR;
			
		default:
			return main;
			
		}
	}

}
