
package net.mcreator.tmzutils.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tmzutils.procedures.ModeratelyColdStartEffProcedure;
import net.mcreator.tmzutils.procedures.ModeratelyColdEndEffProcedure;
import net.mcreator.tmzutils.procedures.ModeratelyColdEffectProcedure;

public class ModeratelyColdMobEffect extends MobEffect {
	public ModeratelyColdMobEffect() {
		super(MobEffectCategory.HARMFUL, -9257788);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tmz_utils.moderately_cold";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ModeratelyColdStartEffProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ModeratelyColdEffectProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ModeratelyColdEndEffProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
