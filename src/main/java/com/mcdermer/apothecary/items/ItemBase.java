package com.mcdermer.apothecary.items;

import java.util.List;

import com.mcdermer.apothecary.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item{
	
	protected String name;
	protected String setInfo;
	
	public ItemBase(String name, String tooltip) 
	{
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setInfo = tooltip;
	}
	
	public void registerItemModel() 
	{
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) 
	{
		super.setCreativeTab(tab);
		return this;
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
