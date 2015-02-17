package com.gmail.dakingcartoon.mods.TestMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.gmail.dakingcartoon.mods.TestMod.help.Reference;

public class BlockGarnetBlock extends Block {
	public BlockGarnetBlock()
	{
		super(Material.glass);
		setBlockName("garnetBlock");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		 setStepSound(soundTypeStone);
		  setHardness(2.5F);
		  setResistance(5.0F);
		  setHarvestLevel("pickaxe", 1);
}
}