package net.mcreator.tmzutils.procedures;

import javax.annotation.Nullable;

public class ColdEndEffProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
								_ent.getDisplayName(), _ent.level().getServer(), _ent),
								("attribute @s minecraft:generic.max_health base set " + (new java.text.DecimalFormat("#").format((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + 6))));
			}
		}
	}
}
