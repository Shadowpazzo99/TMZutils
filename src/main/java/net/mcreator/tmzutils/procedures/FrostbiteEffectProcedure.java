package net.mcreator.tmzutils.procedures;

import javax.annotation.Nullable;

public class FrostbiteEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 2));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 50, 3));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 50, 2));
		while (true) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 60) {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 4);
							return;
						}
					});
				}
			}.startDelay(world);
		}
	}
}
