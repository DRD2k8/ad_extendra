package net.teddy0008.ad_extendra.item.globe;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.teddy0008.ad_extendra.client.renderer.block.globe.CustomGlobeRenderer;

import java.util.function.Consumer;

public class GlobeItem extends BlockItem {
    public GlobeItem(Block pBlock, Item.Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private CustomGlobeRenderer.ItemRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if(this.renderer == null) {
                    renderer = new CustomGlobeRenderer.ItemRenderer();
                }
                return this.renderer;
            }
        });
    }
}
