package com.mcdermer.apothecary.items;

import com.mcdermer.apothecary.blocks.ModBlocks;
import com.mcdermer.apothecary.proxy.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static SeedBase seedCamellia;
	public static ItemBase leafCamellia;
	public static ItemBase driedCamellia;
	public static ItemBase groundCamellia;
	public static ItemBase mortarpestle;

	public static void init() 
	{
		leafCamellia = register(new ItemBase("leafCamellia", "Camellia Sinensis").setCreativeTab(CreativeTabs.MATERIALS));
		seedCamellia = (SeedBase) register(new SeedBase("seedCamellia", ModBlocks.cropTea, "Camellia Sinensis").setCreativeTab(CreativeTabs.MATERIALS));
		driedCamellia = register(new ItemBase("driedCamellia", "Camellia Sinensis").setCreativeTab(CreativeTabs.MATERIALS));
		groundCamellia = register(new ItemBase("groundCamellia", "Camellia Sinensis").setCreativeTab(CreativeTabs.MATERIALS));
		mortarpestle = register(new ItemCraftingTool("mortarpestle", null).setCreativeTab(CreativeTabs.TOOLS));
	}
	
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		
		if (item instanceof ItemModelProvider) 
		{
				((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
}
