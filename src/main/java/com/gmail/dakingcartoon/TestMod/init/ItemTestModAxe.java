package com.gmail.dakingcartoon.TestMod.init;

import com.gmail.dakingcartoon.mods.TestMod.help.Reference;
import com.gmail.dakingcartoon.mods.TestMod.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class ItemTestModAxe extends ItemAxe
{
public final ToolMaterial toolMaterial;
	
	public ItemTestModAxe(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(ModTabs.tabTestMod);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
}
}