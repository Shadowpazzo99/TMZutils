
package net.mcreator.tmzutils.potion;

public class SevereColdMobEffect extends MobEffect {

	public SevereColdMobEffect() {
		super(MobEffectCategory.HARMFUL, -13473350);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tmz_utils.severe_cold";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SevereColdStartEffProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SevereColdEffectProcedure.execute(world, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SevereColdEndEffProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
