package com.gmail.dakingcartoon.mods.TestMod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.gmail.dakingcartoon.TestMod.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TestModTab extends CreativeTabs 
{
String name;
	
	public TestModTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if (this.name == "tabTestMod") 
		{
			return ModItems.pearl;
			
	
		}
		
		return null;
	}
}
