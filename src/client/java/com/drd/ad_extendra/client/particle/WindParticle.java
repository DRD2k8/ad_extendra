package com.drd.ad_extendra.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;

public class WindParticle extends TextureSheetParticle {
    WindParticle(ClientLevel clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(clientWorld, x, y, z, velocityX, velocityY, velocityZ);
        this.setSize(0.02F, 0.02F);
        this.quadSize *= this.random.nextFloat() * 0.6F + 0.2F;
        this.xd = velocityX * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.yd = velocityY * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.zd = velocityZ * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.lifetime = (int)(50.0 / (Math.random() * 0.8 + 0.2));
    }

    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.lifetime-- <= 0) {
            this.remove();
        } else {
            this.xd -= 0.01;
            if (this.level != null) {
                this.move(this.xd, this.yd, this.zd);
            }

            this.xd *= 0.8500000238418579;
            this.yd *= 0.8500000238418579;
            this.zd *= 0.8500000238418579;
        }
    }

    public float getQuadSize(float tickDelta) {
        float f = ((float)this.age + tickDelta) / (float)this.lifetime;
        return this.quadSize * (1.0F - f * f * 0.5F);
    }

    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public Provider(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType defaultParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i) {
            WindParticle windParticle = new WindParticle(clientWorld, d, e, f, g, h, i);
            windParticle.pickSprite(this.spriteProvider);
            return windParticle;
        }
    }
}
