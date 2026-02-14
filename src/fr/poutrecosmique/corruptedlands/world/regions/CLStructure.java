package fr.poutrecosmique.corruptedlands.world.regions;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Structure;
import org.bukkit.block.structure.UsageMode;
import org.bukkit.scheduler.BukkitRunnable;

import fr.poutrecosmique.corruptedlands.CorruptedLands;

public class CLStructure {
	
	private final Location origin;
	private final CLStrctureType type;
	private final String id;
	
	private static final CorruptedLands main = CorruptedLands.getInstance();
	
	public CLStructure(Location origin, CLStrctureType type, String id) {
		this.origin = origin;
		this.type = type;
		this.id = id;
		
		spawn();
	}
	
	public Location getOrigin() {
		return origin;
	}
	
	public CLStrctureType getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	
	private void spawn() {
		Material formerMat = origin.getBlock().getType();
		origin.getBlock().setType(Material.STRUCTURE_BLOCK);
		
		Structure s = (Structure) origin.getBlock().getState();
		
		s.setAuthor("PoutreCosmique");
		s.setUsageMode(UsageMode.LOAD);
		s.setStructureName(id);
		
		s.update();
		
		Block activator = origin.getBlock().getRelative(BlockFace.DOWN);
		Material formerAct = activator.getType();
		
		activator.setType(Material.REDSTONE_BLOCK);
		
		new BukkitRunnable() {

			@Override
			public void run() {
				origin.getBlock().setType(formerMat);
				activator.setType(formerAct);
			}
			
		}.runTaskLater(main, 1);
	}

}
