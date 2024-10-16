package com.drd.ad_extendra.common.entities.projectiles;

import com.drd.ad_extendra.common.registry.ModEntityTypes;
import com.drd.ad_extendra.common.registry.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class IceCharge extends ThrowableItemProjectile {
    public IceCharge(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public IceCharge(Level pLevel) {
        super(ModEntityTypes.ICE_CHARGE.get(), pLevel);
    }

    public IceCharge(Level pLevel, LivingEntity livingEntity) {
        super(ModEntityTypes.ICE_CHARGE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.ICE_CHARGE.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        Entity entity = pResult.getEntity();
        Entity entity1 = this.getOwner();
        LivingEntity livingentity;
        if (entity instanceof LivingEntity) {
            livingentity = (LivingEntity)entity;
            livingentity.hurt(this.damageSources().mobProjectile(this, (LivingEntity)entity1), 2.0F);
            livingentity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 255), this.getEffectSource());
        }
    }
}
