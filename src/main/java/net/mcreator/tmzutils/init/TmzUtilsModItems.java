/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tmzutils.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tmzutils.item.ReinforcedLeatherArmorItem;
import net.mcreator.tmzutils.item.CrystallizerItem;
import net.mcreator.tmzutils.TmzUtilsMod;

public class TmzUtilsModItems {
	public static Item REINFORCED_LEATHER_ARMOR_HELMET;
	public static Item REINFORCED_LEATHER_ARMOR_CHESTPLATE;
	public static Item REINFORCED_LEATHER_ARMOR_LEGGINGS;
	public static Item REINFORCED_LEATHER_ARMOR_BOOTS;
	public static Item CRYSTALLIZER;

	public static void load() {
		REINFORCED_LEATHER_ARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TmzUtilsMod.MODID, "reinforced_leather_armor_helmet"), new ReinforcedLeatherArmorItem.Helmet());
		REINFORCED_LEATHER_ARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TmzUtilsMod.MODID, "reinforced_leather_armor_chestplate"), new ReinforcedLeatherArmorItem.Chestplate());
		REINFORCED_LEATHER_ARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TmzUtilsMod.MODID, "reinforced_leather_armor_leggings"), new ReinforcedLeatherArmorItem.Leggings());
		REINFORCED_LEATHER_ARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TmzUtilsMod.MODID, "reinforced_leather_armor_boots"), new ReinforcedLeatherArmorItem.Boots());
		CRYSTALLIZER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TmzUtilsMod.MODID, "crystallizer"), new CrystallizerItem());
	}

	public static void clientLoad() {
	}
}
