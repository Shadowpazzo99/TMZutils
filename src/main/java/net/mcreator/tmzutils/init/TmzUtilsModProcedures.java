
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tmzutils.init;

import net.mcreator.tmzutils.procedures.ElectrifiedOnEffectActiveTickProcedure;
import net.mcreator.tmzutils.procedures.CrystallizerPlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class TmzUtilsModProcedures {
	public static void load() {
		new ElectrifiedOnEffectActiveTickProcedure();
		new CrystallizerPlayerFinishesUsingItemProcedure();
	}
}
