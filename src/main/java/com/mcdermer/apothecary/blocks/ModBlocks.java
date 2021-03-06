package com.mcdermer.apothecary.blocks;

import com.mcdermer.apothecary.items.ModItems;
import com.mcdermer.apothecary.proxy.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static CropBase cropTea;
	
	public static void init() {
		cropTea = register(new CropBase("cropTea", ModItems.seedCamellia, ModItems.leafCamellia), null);
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		if (!(itemBlock == null)) {
			GameRegistry.register(itemBlock);
		}

		if (block instanceof ItemModelProvider) {
			((ItemModelProvider)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
