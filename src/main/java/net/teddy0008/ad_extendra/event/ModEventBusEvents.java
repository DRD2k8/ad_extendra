package net.teddy0008.ad_extendra.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.entity.ModEntities;
import net.teddy0008.ad_extendra.entity.mob.Freeze;
import net.teddy0008.ad_extendra.particle.ModParticles;
import net.teddy0008.ad_extendra.particle.WindParticle;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.FREEZE.get(), Freeze.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticles.WIND.get(), WindParticle.Provider::new);
    }
}
