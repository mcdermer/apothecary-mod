package com.mcdermer.apothecary.items;

import java.util.List;

import com.mcdermer.apothecary.Main;
import com.mcdermer.apothecary.blocks.CropBase;
import com.mcdermer.apothecary.proxy.ItemModelProvider;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;

public class SeedBase extends ItemSeeds implements ItemModelProvider{
	
	protected String name;
	protected String setInfo;
	
	public SeedBase(String name, CropBase crop, String tooltip) {
		super(crop, Blocks.FARMLAND);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setInfo = "§o" + tooltip;
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(item, 0, this.name);
	}
	
	@SuppressWarnings("unchecked")
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean bool) 
	{
		if (this.setInfo == null) {
			return;
		} else {
			list.add(this.setInfo);
		}
	}
}
