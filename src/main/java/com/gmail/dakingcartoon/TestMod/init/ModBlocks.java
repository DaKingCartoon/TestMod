package com.gmail.dakingcartoon.TestMod.init;

import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockClusteredPearlBlock;
import com.gmail.dakingcartoon.mods.TestMod.blocks.BlockGarnetBlock;
import com.gmail.dakingcartoon.mods.TestMod.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks 
{
	public static Block clusteredPearlBlock = new BlockClusteredPearlBlock();
	public static Block garnetBlock = new BlockGarnetBlock();
	
	public static void init()
	{
		RegisterHelper.registerBlock(clusteredPearlBlock);
		RegisterHelper.registerBlock(garnetBlock);
	}
}
