package net.mcreator.tmzutils.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class SevereColdEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 2));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 50, 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 50, 1));
		for (int index0 = 0; index0 < 100; index0++) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 5000) {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 2);
							return;
						}
					});
				}
			}.startDelay(world);
		}
	}
}
