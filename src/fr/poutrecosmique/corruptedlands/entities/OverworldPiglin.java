package fr.poutrecosmique.corruptedlands.entities;

import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import fr.poutrecosmique.corruptedlands.entities.MobUtils.EquipmentPiece;

public class OverworldPiglin extends NetherMob {
	
	public OverworldPiglin(Location loc) {
		super(EntityType.PIGLIN);
		spawn(loc);
		((Piglin) e).setImmuneToZombification(true);
		defaultMob();
	}

	@Override
	public void setmaxHealth(double maxHealth) {
		e.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(maxHealth);
	}

	@Override
	public void addPotionEffect(PotionEffect effect) {
		e.addPotionEffect(effect);
	}

	@Override
	public void setEquipment(EquipmentSlot slot, ItemStack item) {
		e.getEquipment().setItem(slot, item);
	}

	@Override
	protected void defaultMob() {
		e.getEquipment().setItem(EquipmentSlot.HEAD, MobUtils.getItem(EquipmentPiece.HELMET, true));
		e.getEquipment().setItem(EquipmentSlot.CHEST, MobUtils.getItem(EquipmentPiece.CHESTPLATE, true));
		e.getEquipment().setItem(EquipmentSlot.LEGS, MobUtils.getItem(EquipmentPiece.LEGGINGS, true));
		e.getEquipment().setItem(EquipmentSlot.FEET, MobUtils.getItem(EquipmentPiece.BOOTS, true));
	}

}
