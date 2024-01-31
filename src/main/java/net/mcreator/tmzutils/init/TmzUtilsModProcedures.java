
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tmzutils.init;

import net.mcreator.tmzutils.procedures.SlightlyColdEffectProcedure;
import net.mcreator.tmzutils.procedures.SevereColdStartEffProcedure;
import net.mcreator.tmzutils.procedures.SevereColdEndEffProcedure;
import net.mcreator.tmzutils.procedures.SevereColdEffectProcedure;
import net.mcreator.tmzutils.procedures.ModeratelyColdStartEffProcedure;
import net.mcreator.tmzutils.procedures.ModeratelyColdEndEffProcedure;
import net.mcreator.tmzutils.procedures.ModeratelyColdEffectProcedure;
import net.mcreator.tmzutils.procedures.FrostbiteStartEffProcedure;
import net.mcreator.tmzutils.procedures.FrostbiteEndEffProcedure;
import net.mcreator.tmzutils.procedures.FrostbiteEffectProcedure;
import net.mcreator.tmzutils.procedures.ElectrifiedOnEffectActiveTickProcedure;
import net.mcreator.tmzutils.procedures.CrystallizerPlayerFinishesUsingItemProcedure;
import net.mcreator.tmzutils.procedures.CrystalizationStartEffProcedure;
import net.mcreator.tmzutils.procedures.CrystalizationEndEffProcedure;
import net.mcreator.tmzutils.procedures.CrystalizationEffectProcedure;
import net.mcreator.tmzutils.procedures.ColdStartEffProcedure;
import net.mcreator.tmzutils.procedures.ColdEndEffProcedure;
import net.mcreator.tmzutils.procedures.ColdEffectProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class TmzUtilsModProcedures {
	public static void load() {
		new ElectrifiedOnEffectActiveTickProcedure();
		new CrystallizerPlayerFinishesUsingItemProcedure();
		new SlightlyColdEffectProcedure();
		new ModeratelyColdEffectProcedure();
		new ModeratelyColdStartEffProcedure();
		new ModeratelyColdEndEffProcedure();
		new ColdEffectProcedure();
		new ColdEndEffProcedure();
		new ColdStartEffProcedure();
		new SevereColdEffectProcedure();
		new SevereColdEndEffProcedure();
		new SevereColdStartEffProcedure();
		new FrostbiteEffectProcedure();
		new FrostbiteEndEffProcedure();
		new FrostbiteStartEffProcedure();
		new CrystalizationEffectProcedure();
		new CrystalizationEndEffProcedure();
		new CrystalizationStartEffProcedure();
	}
}
