package com.gmail.dakingcartoon.mods.TestMod.generation;

import java.util.Random;

import com.gmail.dakingcartoon.TestMod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class TestModWorldGeneration implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
    		case 0:
    			generateSurface(world, random, chunkX * 16, chunkZ * 16);
    		case -1:
    			generateNether(world, random, chunkX * 16, chunkZ * 16);
    		case 1:
    			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int x, int z)
	{
		addOreSpawn(ModBlocks.garnetOre, world, random, x, z, 16, 16, 2 + random.nextInt(3), 15, 0, 48);
		addOreSpawn(ModBlocks.amethystOre, world, random, x, z, 16, 16, 2 + random.nextInt(3), 15, 0, 48);
		
	}

	private void generateNether(World world, Random random, int x, int z)
	{
	
	}

	private void generateEnd(World world, Random random, int x, int z)
	{
	
	}
	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY)
	{
		for (int i = 0; i < chanceToSpawn; i++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
		}
	}
}
