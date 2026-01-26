package fr.poutrecosmique.corruptedlands.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public abstract class NetherMob {
	
	public static List<EntityType> netherMobs = new ArrayList<EntityType>(Arrays.asList(EntityType.PIGLIN, EntityType.PIGLIN_BRUTE, EntityType.ZOMBIFIED_PIGLIN, EntityType.HOGLIN, EntityType.BLAZE, EntityType.GHAST, EntityType.WITHER_SKELETON,
			EntityType.WITHER, EntityType.SKELETON, EntityType.STRIDER, EntityType.ENDERMAN));
	
	public static boolean isNetherMob(EntityType type) {
		return netherMobs.contains(type);
	}
	
	LivingEntity e;
	EntityType type;
	
	public NetherMob(EntityType type) {
		this.type = type;
	}
	
	public EntityType getType() {
		return type;
	}

	protected void spawn(Location loc) {
		e = (LivingEntity) loc.getWorld().spawnEntity(loc, type);
	}
	
	protected abstract void defaultMob();
}
