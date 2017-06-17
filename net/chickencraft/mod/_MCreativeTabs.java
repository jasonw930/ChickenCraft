package net.chickencraft.mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class _MCreativeTabs {

	public static CreativeTabs TabChickenCraft;
	
	public static void mainRegistry(){
		TabChickenCraft = new CreativeTabs("TabChickenCraft"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Items.chicken;
			}
		};
	}
	
}
