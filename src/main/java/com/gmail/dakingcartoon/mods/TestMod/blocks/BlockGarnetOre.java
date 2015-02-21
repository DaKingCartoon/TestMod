package com.gmail.dakingcartoon.mods.TestMod.blocks;

import java.util.Random;

import com.gmail.dakingcartoon.mods.TestMod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.gmail.dakingcartoon.TestMod.init.ModItems;
public class BlockGarnetOre extends Block{
	public BlockGarnetOre()
	{
		super(Material.glass);
		setBlockName("garnetOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		 setStepSound(soundTypeStone);
		  setHardness(5.5F);
		  setResistance(10.0F);
		  setHarvestLevel("pickaxe", 4);
		  
	}
	@Override
	 public Item getItemDropped(int metadata, Random random, int fortune)
	 {
	 return ModItems.garnet;
	 }

	
	 	
}