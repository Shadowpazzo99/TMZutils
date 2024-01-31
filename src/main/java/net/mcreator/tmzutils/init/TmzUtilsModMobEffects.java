
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tmzutils.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tmzutils.potion.SlightlyColdMobEffect;
import net.mcreator.tmzutils.potion.SevereColdMobEffect;
import net.mcreator.tmzutils.potion.ModeratelyColdMobEffect;
import net.mcreator.tmzutils.potion.FrostbiteMobEffect;
import net.mcreator.tmzutils.potion.ElectrifiedMobEffect;
import net.mcreator.tmzutils.potion.CrystalizationMobEffect;
import net.mcreator.tmzutils.potion.ColdMobEffect;
import net.mcreator.tmzutils.TmzUtilsMod;

public class TmzUtilsModMobEffects {
	public static MobEffect ELECTRIFIED;
	public static MobEffect SLIGHTLY_COLD;
	public static MobEffect MODERATELY_COLD;
	public static MobEffect COLD;
	public static MobEffect SEVERE_COLD;
	public static MobEffect FROSTBITE;
	public static MobEffect CRYSTALIZATION;

	public static void load() {
		ELECTRIFIED = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "electrified"), new ElectrifiedMobEffect());
		SLIGHTLY_COLD = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "slightly_cold"), new SlightlyColdMobEffect());
		MODERATELY_COLD = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "moderately_cold"), new ModeratelyColdMobEffect());
		COLD = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "cold"), new ColdMobEffect());
		SEVERE_COLD = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "severe_cold"), new SevereColdMobEffect());
		FROSTBITE = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "frostbite"), new FrostbiteMobEffect());
		CRYSTALIZATION = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(TmzUtilsMod.MODID, "crystalization"), new CrystalizationMobEffect());
	}
}
