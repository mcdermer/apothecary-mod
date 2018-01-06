package com.mcdermer.apothecary.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase leafCamellia;
	public static ItemBase driedCamellia;
	public static ItemBase groundCamellia;
	public static ItemBase mortarpestle;

	public static void init() 
	{
		leafCamellia = register(new ItemBase("leafCamellia", "§oCamellia Sinensis").setCreativeTab(CreativeTabs.MATERIALS));
		driedCamellia = register(new ItemBase("driedCamellia", "§oCamellia Sinensis").setCreativeTab(CreativeTabs.MATERIALS));
		groundCamellia = register(new ItemBase("groundCamellia", "§oCamellia Sinensis").setCreativeTab(CreativeTabs.MATERIALS));
		mortarpestle = register(new ItemCraftingTool("mortarpestle", null).setCreativeTab(CreativeTabs.TOOLS));
	}
	
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		
		if (item instanceof ItemBase) 
		{
				((ItemBase)item).registerItemModel();
		} else if (item instanceof ItemCraftingTool) 
		{
			((ItemCraftingTool)item).registerItemModel();
		}
		
		return item;
	}
}
