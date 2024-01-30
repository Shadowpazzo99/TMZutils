/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.tmzutils;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.tmzutils.init.TmzUtilsModProcedures;
import net.mcreator.tmzutils.init.TmzUtilsModMobEffects;
import net.mcreator.tmzutils.init.TmzUtilsModItems;

import net.fabricmc.api.ModInitializer;

public class TmzUtilsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "tmz_utils";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing TmzUtilsMod");

		TmzUtilsModMobEffects.load();

		TmzUtilsModItems.load();

		TmzUtilsModProcedures.load();

	}
}
