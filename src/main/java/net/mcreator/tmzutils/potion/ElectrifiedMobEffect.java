
package net.mcreator.tmzutils.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tmzutils.procedures.ElectrifiedOnEffectActiveTickProcedure;

public class ElectrifiedMobEffect extends MobEffect {
	public ElectrifiedMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tmz_utils.electrified";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ElectrifiedOnEffectActiveTickProcedure.execute(world, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
