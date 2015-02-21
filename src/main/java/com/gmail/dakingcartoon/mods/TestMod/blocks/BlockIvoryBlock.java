package com.gmail.dakingcartoon.mods.TestMod.blocks;

import com.gmail.dakingcartoon.mods.TestMod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockIvoryBlock extends Block{
	public BlockIvoryBlock()
	{
		super(Material.glass);
		setBlockName("ivoryBlock");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		 setStepSound(soundTypeStone);
		  setHardness(2.5F);
		  setResistance(5.0F);
		  setHarvestLevel("pickaxe", 1);
}
}
