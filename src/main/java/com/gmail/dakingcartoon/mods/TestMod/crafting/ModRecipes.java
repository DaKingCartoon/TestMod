package com.gmail.dakingcartoon.mods.TestMod.crafting;

import net.minecraft.item.ItemStack;

import com.gmail.dakingcartoon.TestMod.init.ModBlocks;
import com.gmail.dakingcartoon.TestMod.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		//shaped recipes: GameRegistry.addShapedRecipe(new ItemStack(ModBlocks/Items._), new Object[] {"---", "---", "---", '-', ModBlocks/Items._, '-', ModBlocks/Items._});
		//when global stacking:																		  {"-", "-", '-', Mod......., '-', Mod.......}
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.clusteredPearlBlock), new Object[] {"AAA", "AAA", "AAA", 'A', ModItems.pearl});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.garnetBlock), new Object[] {"AAA", "AAA", "AAA", 'A', ModItems.garnet});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amethystBlock), new Object[] {"AAA", "AAA", "AAA", 'A', ModItems.amethyst});
		
		//smelting recipes: GameRegistry.addSmelting(ModBlocks/Items._, new ItemStack(ModBlocks/Items._), 0.8F);
		
		GameRegistry.addSmelting(ModBlocks.garnetOre, new ItemStack(ModItems.garnet), 0.8F);
		GameRegistry.addSmelting(ModBlocks.amethystOre, new ItemStack(ModItems.amethyst), 0.8F);
		
		//shapeless recipes: GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearl), new Object[] {new ItemStack(ModBlocks._), ModBlocks/Items._});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearl), new Object[] {new ItemStack(ModBlocks.clusteredPearlBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.garnet), new Object[] {new ItemStack(ModBlocks.garnetBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amethyst), new Object[] {new ItemStack(ModBlocks.amethystBlock)});
	}
	
	
}
