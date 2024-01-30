
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tmzutils.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tmzutils.potion.ElectrifiedMobEffect;
import net.mcreator.tmzutils.TmzUtilsMod;

public class TmzUtilsModMobEffects {
	public static MobEffect ELECTRIFIED;

	public static void load() {
		ELECTRIFIED = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "electrified"), new ElectrifiedMobEffect());
	}
}
