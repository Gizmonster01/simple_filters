package monster.giz.simple_filters;

import monster.giz.simple_filters.blocks.SFBlocks;
import monster.giz.simple_filters.render.block.entity.FilterBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

import static monster.giz.simple_filters.blocks.entity.SFBlockEntities.FILTER_BLOCK_ENTITY;

public class SimpleFiltersClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockEntityRendererFactories.register(FILTER_BLOCK_ENTITY, FilterBlockEntityRenderer::new);
		BlockRenderLayerMap.INSTANCE.putBlock(SFBlocks.FILTER_BLOCK, RenderLayer.getCutout());
	}

}