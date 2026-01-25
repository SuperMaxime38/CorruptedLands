package fr.poutrecosmique.corruptedlands.world.biomes;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class CrimsonForest extends NetherBiome {
	
	public CrimsonForest() {
		super();
		main = Material.NETHERRACK;
		ores = new Material[] { Material.NETHER_QUARTZ_ORE, Material.NETHER_GOLD_ORE };
		sand = Material.CRIMSON_NYLIUM;
		gravel = Material.NETHER_WART_BLOCK;
		plants = new Material[] { Material.CRIMSON_ROOTS, Material.CRIMSON_ROOTS, Material.CRIMSON_ROOTS, Material.CRIMSON_FUNGUS, Material.WARPED_FUNGUS };
		
		rdm = new Random();
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
		case AIR:
			return Material.AIR;
			
		case OAK_LOG:
			return Material.CRIMSON_STEM;
		case OAK_LEAVES:
			return leaf();
		case OAK_PLANKS:
			return Material.CRIMSON_PLANKS;
		case OAK_SLAB:
			return Material.CRIMSON_SLAB;
		case OAK_STAIRS:
			return Material.CRIMSON_STAIRS;
		case OAK_FENCE:
			return Material.CRIMSON_FENCE;
		case OAK_FENCE_GATE:
			return Material.CRIMSON_FENCE_GATE;
		case OAK_DOOR:
			return Material.CRIMSON_DOOR;
		case OAK_TRAPDOOR:
			return Material.CRIMSON_TRAPDOOR;
		case OAK_BUTTON:
			return Material.CRIMSON_BUTTON;
		case OAK_PRESSURE_PLATE:
			return Material.CRIMSON_PRESSURE_PLATE;
		case OAK_SIGN:
			return Material.CRIMSON_SIGN;
		case OAK_WALL_SIGN:
			return Material.CRIMSON_WALL_SIGN;
		case SPRUCE_LOG:
			return Material.CRIMSON_STEM;
		case SPRUCE_LEAVES:
			return leaf();
		case SPRUCE_PLANKS:
			return Material.CRIMSON_PLANKS;
		case SPRUCE_SLAB:
			return Material.CRIMSON_SLAB;
		case SPRUCE_STAIRS:
			return Material.CRIMSON_STAIRS;
		case SPRUCE_FENCE:
			return Material.CRIMSON_FENCE;
		case SPRUCE_FENCE_GATE:
			return Material.CRIMSON_FENCE_GATE;
		case SPRUCE_DOOR:
			return Material.CRIMSON_DOOR;
		case SPRUCE_TRAPDOOR:
			return Material.CRIMSON_TRAPDOOR;
		case SPRUCE_BUTTON:
			return Material.CRIMSON_BUTTON;
		case SPRUCE_PRESSURE_PLATE:
			return Material.CRIMSON_PRESSURE_PLATE;
		case SPRUCE_SIGN:
			return Material.CRIMSON_SIGN;
		case SPRUCE_WALL_SIGN:
			return Material.CRIMSON_WALL_SIGN;
		case BIRCH_LOG:
			return Material.CRIMSON_STEM;
		case BIRCH_LEAVES:
			return leaf();
		case BIRCH_PLANKS:
			return Material.CRIMSON_PLANKS;
		case BIRCH_SLAB:
			return Material.CRIMSON_SLAB;
		case BIRCH_STAIRS:
			return Material.CRIMSON_STAIRS;
		case BIRCH_FENCE:
			return Material.CRIMSON_FENCE;
		case BIRCH_FENCE_GATE:
			return Material.CRIMSON_FENCE_GATE;
		case BIRCH_DOOR:
			return Material.CRIMSON_DOOR;
		case BIRCH_TRAPDOOR:
			return Material.CRIMSON_TRAPDOOR;
		case BIRCH_BUTTON:
			return Material.CRIMSON_BUTTON;
		case BIRCH_PRESSURE_PLATE:
			return Material.CRIMSON_PRESSURE_PLATE;
		case BIRCH_SIGN:
			return Material.CRIMSON_SIGN;
		case BIRCH_WALL_SIGN:
			return Material.CRIMSON_WALL_SIGN;
		case JUNGLE_LOG:
			return Material.CRIMSON_STEM;
		case JUNGLE_LEAVES:
			return leaf();
		case JUNGLE_PLANKS:
			return Material.CRIMSON_PLANKS;
		case JUNGLE_SLAB:
			return Material.CRIMSON_SLAB;
		case JUNGLE_STAIRS:
			return Material.CRIMSON_STAIRS;
		case JUNGLE_FENCE:
			return Material.CRIMSON_FENCE;
		case JUNGLE_FENCE_GATE:
			return Material.CRIMSON_FENCE_GATE;
		case JUNGLE_DOOR:
			return Material.CRIMSON_DOOR;
		case JUNGLE_TRAPDOOR:
			return Material.CRIMSON_TRAPDOOR;
		case JUNGLE_BUTTON:
			return Material.CRIMSON_BUTTON;
		case JUNGLE_PRESSURE_PLATE:
			return Material.CRIMSON_PRESSURE_PLATE;
		case JUNGLE_SIGN:
			return Material.CRIMSON_SIGN;
		case JUNGLE_WALL_SIGN:
			return Material.CRIMSON_WALL_SIGN;
		case VINE:
			return Material.WEEPING_VINES_PLANT;
		case ACACIA_LOG:
			return Material.CRIMSON_STEM;
		case ACACIA_LEAVES:
			return leaf();
		case ACACIA_PLANKS:
			return Material.CRIMSON_PLANKS;
		case ACACIA_SLAB:
			return Material.CRIMSON_SLAB;
		case ACACIA_STAIRS:
			return Material.CRIMSON_STAIRS;
		case ACACIA_FENCE:
			return Material.CRIMSON_FENCE;
		case ACACIA_FENCE_GATE:
			return Material.CRIMSON_FENCE_GATE;
		case ACACIA_DOOR:
			return Material.CRIMSON_DOOR;
		case ACACIA_TRAPDOOR:
			return Material.CRIMSON_TRAPDOOR;
		case ACACIA_BUTTON:
			return Material.CRIMSON_BUTTON;
		case ACACIA_PRESSURE_PLATE:
			return Material.CRIMSON_PRESSURE_PLATE;
		case ACACIA_SIGN:
			return Material.CRIMSON_SIGN;
		case ACACIA_WALL_SIGN:
			return Material.CRIMSON_WALL_SIGN;
		case DARK_OAK_LOG:
			return Material.CRIMSON_STEM;
		case DARK_OAK_LEAVES:
			return leaf();
		case DARK_OAK_PLANKS:
			return Material.CRIMSON_PLANKS;
		case DARK_OAK_SLAB:
			return Material.CRIMSON_SLAB;
		case DARK_OAK_STAIRS:
			return Material.CRIMSON_STAIRS;
		case DARK_OAK_FENCE:
			return Material.CRIMSON_FENCE;
		case DARK_OAK_FENCE_GATE:
			return Material.CRIMSON_FENCE_GATE;
		case DARK_OAK_DOOR:
			return Material.CRIMSON_DOOR;
		case DARK_OAK_TRAPDOOR:
			return Material.CRIMSON_TRAPDOOR;
		case DARK_OAK_BUTTON:
			return Material.CRIMSON_BUTTON;
		case DARK_OAK_PRESSURE_PLATE:
			return Material.CRIMSON_PRESSURE_PLATE;
		case DARK_OAK_SIGN:
			return Material.CRIMSON_SIGN;
		case DARK_OAK_WALL_SIGN:
			return Material.CRIMSON_WALL_SIGN;
		case MUSHROOM_STEM:
			return Material.CRIMSON_STEM;
		case BROWN_MUSHROOM_BLOCK:
			return leaf();
		case RED_MUSHROOM_BLOCK:
			return leaf();
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
			
		case GRASS_BLOCK:
			return Material.CRIMSON_NYLIUM;
		default:
			return main;
			
		}
	}
	
	private Material leaf() {
		if(rdm.nextInt(100) < 7) return Material.SHROOMLIGHT;
		return Material.NETHER_WART_BLOCK;
	}
	
	public void weepingVines(Block b) {
		int luck = rdm.nextInt(100);
		
		// 10% chance of weeping vines, 70% chance to continue an existing one
		if(b.getType() == Material.AIR && (luck < 10 || luck < 70 && b.getRelative(BlockFace.UP).getType() == Material.WEEPING_VINES)) {
			b.setType(Material.WEEPING_VINES_PLANT);
			weepingVines(b.getRelative(BlockFace.DOWN));
		}
	}
	
	public Material randomPlant() {
		return plants[rdm.nextInt(plants.length)];
	}

}
