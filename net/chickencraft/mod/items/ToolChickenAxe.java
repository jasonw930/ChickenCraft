package net.chickencraft.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.chickencraft.mod.ChickenCraft;
import net.chickencraft.mod._MCreativeTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolChickenAxe extends ItemAxe{

	public ToolChickenAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(_MCreativeTabs.TabChickenCraft);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(ChickenCraft.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
