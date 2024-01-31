
package net.mcreator.tmzutils.potion;

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

		FrostbiteStartEffProcedure.execute();
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FrostbiteEffectProcedure.execute();
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FrostbiteEndEffProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
