
package net.mcreator.tmzutils.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tmzutils.procedures.SlightlyColdEffectProcedure;

public class SlightlyColdMobEffect extends MobEffect {
	public SlightlyColdMobEffect() {
		super(MobEffectCategory.HARMFUL, -9257788);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tmz_utils.slightly_cold";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SlightlyColdEffectProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
