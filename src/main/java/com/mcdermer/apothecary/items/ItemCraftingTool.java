package com.mcdermer.apothecary.items;

import net.minecraft.item.ItemStack;

public class ItemCraftingTool extends ItemBase{
	
	
	public ItemCraftingTool(String name, String tooltip) {
		super(name, tooltip);
		setMaxStackSize(1);
		}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		
		return new ItemStack(stack.getItem(), 1);
	}
}
