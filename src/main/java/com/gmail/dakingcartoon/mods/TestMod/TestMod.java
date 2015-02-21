package com.gmail.dakingcartoon.mods.TestMod;

import com.gmail.dakingcartoon.TestMod.init.ModArmory;
import com.gmail.dakingcartoon.TestMod.init.ModBlocks;
import com.gmail.dakingcartoon.TestMod.init.ModItems;
import com.gmail.dakingcartoon.mods.TestMod.crafting.ModRecipes;
import com.gmail.dakingcartoon.mods.TestMod.generation.TestModWorldGeneration;
import com.gmail.dakingcartoon.mods.TestMod.help.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TestMod {
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		ModArmory.init();
		GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
TestModWorldGeneration eventWorldGen = new TestModWorldGeneration();
} 
