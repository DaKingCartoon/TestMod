package com.gmail.dakingcartoon.TestMod.init;

import net.minecraft.item.Item;

import com.gmail.dakingcartoon.TestMod.items.TestModItem;
import com.gmail.dakingcartoon.mods.TestMod.help.RegisterHelper;

public class ModItems 
{
	public static Item pearl = new TestModItem().setUnlocalizedName("pearl");
	public static Item garnet = new TestModItem().setUnlocalizedName("garnet");
	
	public static void init()
		{
			RegisterHelper.registerItem(pearl);
			RegisterHelper.registerItem(garnet);
		}
}
