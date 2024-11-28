package lv.cebbys.mcmods.mythos.odyssey.content.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;

public abstract class AbstractSpellProjectile extends Projectile {
    protected AbstractSpellProjectile(EntityType<? extends Projectile> entity, Level level) {
        super(entity, level);
    }

    @Override
    protected final void handlePortal() {
        // We don't want to handle portals - Spell particles should not travel trough portals
    }
}
