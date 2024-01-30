/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tmzutils.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tmzutils.item.CrystallizerItem;
import net.mcreator.tmzutils.TmzUtilsMod;

public class TmzUtilsModItems {
	public static Item CRYSTALLIZER;

	public static void load() {
		CRYSTALLIZER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TmzUtilsMod.MODID, "crystallizer"), new CrystallizerItem());
	}

	public static void clientLoad() {
	}
}
