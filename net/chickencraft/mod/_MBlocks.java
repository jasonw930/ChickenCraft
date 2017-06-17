package net.chickencraft.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.chickencraft.mod.blocks.BlockChickeniteOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class _MBlocks {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Block BlockChickeniteOre;
	
	public static void initializeItem(){
		BlockChickeniteOre = new BlockChickeniteOre(Material.rock).setBlockName("BlockChickeniteOre");
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(BlockChickeniteOre, "ChickeniteOre");
	}
	
}
