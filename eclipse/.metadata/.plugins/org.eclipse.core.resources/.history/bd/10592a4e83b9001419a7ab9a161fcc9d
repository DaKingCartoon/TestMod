package com.gmail.dakingcartoon.TestMod.init;

import com.gmail.dakingcartoon.mods.TestMod.help.RegisterHelper;

import net.minecraft.item.Item;

public class ModArmory {
	static Item.ToolMaterial IVORY = EnumHelper.addToolMaterial("IVORY", 2, 436, 2.5F, 5.0F, 30);
	public static Item ivorySword = new ItemTestModSword(IVORY).setUnlocalizedName("ivorySword");
	public static Item ivoryPick = new ItemTestModPickaxe(IVORY).setUnlocalizedName("ivoryPick");
	public static Item ivoryAxe = new ItemTestModAxe(IVORY).setUnlocalizedName("ivoryAxe");
	public static void init()
	{
	RegisterHelper.registerItem(ivorySword);
	RegisterHelper.registerItem(ivoryPick);
	RegisterHelper.registerItem(ivoryAxe);
}
}
