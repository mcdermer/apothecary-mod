package com.mcdermer.apothecary.crafting;

import com.mcdermer.apothecary.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.groundCamellia), ModItems.driedCamellia, new ItemStack(ModItems.mortarpestle, 1));
	}

}
