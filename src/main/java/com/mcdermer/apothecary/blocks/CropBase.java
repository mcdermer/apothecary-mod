package com.mcdermer.apothecary.blocks;

import com.mcdermer.apothecary.items.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class CropBase extends BlockCrops{
	
	protected String name;
	protected Item crop;
	protected Item seed;
	
	public CropBase(String name, Item seed, Item crop) {
		setUnlocalizedName(name);
		setRegistryName(name);
		this.name = name;
		this.seed = seed;
		this.crop = crop;
	}
	
	@Override
	protected Item getSeed() {
		return this.seed;
	}

	@Override
	protected Item getCrop() {
		return this.crop;
	}
}
