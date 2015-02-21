package com.gmail.dakingcartoon.TestMod.init;

import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockAmethystBlock;
import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockAmethystOre;
import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockClusteredPearlBlock;
import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockGarnetBlock;
import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockGarnetOre;
import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockIvoryBlock;
import com.gmail.dakingcartoon.mods.TestMod.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks 
{
	public static Block clusteredPearlBlock = new BlockClusteredPearlBlock();
	public static Block garnetBlock = new BlockGarnetBlock();
	public static Block garnetOre = new BlockGarnetOre();
	public static Block amethystBlock = new BlockAmethystBlock();
	public static Block amethystOre = new BlockAmethystOre();
	public static Block ivoryBlock = new BlockIvoryBlock();
	public static void init()
	{
		RegisterHelper.registerBlock(clusteredPearlBlock);
		RegisterHelper.registerBlock(garnetBlock);
		RegisterHelper.registerBlock(garnetOre);
		RegisterHelper.registerBlock(amethystBlock);
		RegisterHelper.registerBlock(amethystOre);
		RegisterHelper.registerBlock(ivoryBlock);
	}
}
