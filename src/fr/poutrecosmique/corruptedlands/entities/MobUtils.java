package fr.poutrecosmique.corruptedlands.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class MobUtils {
	
	static Random rdm = new Random();
	
	public enum EquipmentPiece {
		HELMET,
		CHESTPLATE,
		LEGGINGS,
		BOOTS,
		SWORD,
		AXE,
		CROSSBOW
		
	}
	
	private enum Rarity {
		LEATHER,
		IRON,
		GOLDEN,
		DIAMOND,
		NETHERITE
	}
	
	private static List<Enchantment> defensive_enchants = new ArrayList<Enchantment>(Arrays.asList(Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_FIRE, Enchantment.PROTECTION_FALL,
			Enchantment.PROTECTION_EXPLOSIONS, Enchantment.PROTECTION_PROJECTILE, Enchantment.THORNS));
	
	private static List<Enchantment> offensive_enchants = new ArrayList<Enchantment>(Arrays.asList(Enchantment.FIRE_ASPECT, Enchantment.DAMAGE_ALL, Enchantment.DAMAGE_UNDEAD, Enchantment.DAMAGE_ARTHROPODS, Enchantment.KNOCKBACK, Enchantment.FIRE_ASPECT,
			Enchantment.PIERCING, Enchantment.MULTISHOT));
	
	public static List<EntityType> passivesMobs = new ArrayList<EntityType>(Arrays.asList(EntityType.COW, EntityType.SHEEP, EntityType.PIG, EntityType.CHICKEN));
	
	public static ItemStack getItem(EquipmentPiece piece, boolean isDefensive) {
		int rarity = rdm.nextInt(100);
		
		ItemStack item;
		
		
		// 20% chance
		if(rarity < 20) {
			// Leather armor
			item = convertToPiece(piece, Rarity.LEATHER);
		}
		
		// 30% chance
		else if(rarity < 50) {
			// Iron armor
			item = convertToPiece(piece, Rarity.IRON);
		}
		
		// 40% chance
		else if(rarity < 90) {
			// Gold armor
			item = convertToPiece(piece, Rarity.GOLDEN);
		}
		
		// 8% chance
		else if(rarity < 98) {
			// Diamond armor
			item = convertToPiece(piece, Rarity.DIAMOND);
		}
		
		//2% chance
		else {
			// Netherite armor
			item = convertToPiece(piece, Rarity.NETHERITE);
		}
		
		enchantItem(item, isDefensive);
		
		return item;
	}
	
	private static void enchantItem(ItemStack item, boolean isDefensive) {
		int enchantAmount = rdm.nextInt(100);
		
		// 15% chance for no enchants
		if(enchantAmount < 15) {
			return;
			
		// 20% chance
		} else if(enchantAmount < 35) {
			applyEnchant(item, isDefensive);
			
		// 35% chance
		} else if(enchantAmount < 70) {
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			
		// 20% chance
		} else if(enchantAmount < 90) {
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			
		// 9% chance
		} else if(enchantAmount < 99) {
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			
		// 1% chance
		} else {
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
			applyEnchant(item, isDefensive);
		}
		
	}
	
	private static void applyEnchant(ItemStack item, boolean isDefensive) {
		
		Enchantment enchant;
		
		if(isDefensive) {
			enchant = defensive_enchants.get(rdm.nextInt(defensive_enchants.size()));
		} else {
			enchant = offensive_enchants.get(rdm.nextInt(offensive_enchants.size()));
		}

		int enchantLevel = rdm.nextInt(100);
		
		// 30 % 1
		if(enchantLevel < 30) {
			item.addUnsafeEnchantment(enchant, 1);

		// 30% chance 2
		} else if(enchantLevel < 60) {
			item.addUnsafeEnchantment(enchant, 2);

		// 20% chance 3
		} else if(enchantLevel < 80) {
			item.addUnsafeEnchantment(enchant, 3);
			
		// 15% chance 4
		} else if(enchantLevel < 95) {
			item.addUnsafeEnchantment(enchant, 4);
		
		// 5% chance 5
		} else {
			item.addUnsafeEnchantment(enchant, 5);
		}
	}
	
	private static ItemStack convertToPiece(EquipmentPiece piece, Rarity rarity) {
		return new ItemStack(Material.getMaterial(rarity.toString() + "_" + piece.toString()));
	}
	
}
