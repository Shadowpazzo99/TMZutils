
package net.mcreator.tmzutils.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tmzutils.procedures.FrostbiteStartEffProcedure;
import net.mcreator.tmzutils.procedures.FrostbiteEndEffProcedure;
import net.mcreator.tmzutils.procedures.FrostbiteEffectProcedure;

public class FrostbiteMobEffect extends MobEffect {
	public FrostbiteMobEffect() {
		super(MobEffectCategory.HARMFUL, -14928994);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tmz_utils.frostbite";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FrostbiteStartEffProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FrostbiteEffectProcedure.execute(world, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FrostbiteEndEffProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
