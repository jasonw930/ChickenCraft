package net.chickencraft.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.chickencraft.mod.ChickenCraft;
import net.chickencraft.mod._MCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockChickeniteOre extends Block{

	public BlockChickeniteOre(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setHarvestLevel("ItemPickaxe", 1);
		this.setCreativeTab(_MCreativeTabs.TabChickenCraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(ChickenCraft.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
