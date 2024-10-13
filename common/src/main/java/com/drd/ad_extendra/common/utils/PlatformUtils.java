package com.drd.ad_extendra.common.utils;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import org.apache.commons.lang3.NotImplementedException;

import java.util.function.Supplier;

public class PlatformUtils {
    @ExpectPlatform
    public static Supplier<Item> createSpawnEggItem(Supplier<? extends EntityType<? extends Mob>> type, int primaryColor, int secondaryColor, Item.Properties properties) {
        throw new NotImplementedException();
    }
}
