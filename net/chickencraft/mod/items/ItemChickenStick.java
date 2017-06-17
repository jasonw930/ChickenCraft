package net.chickencraft.mod.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.chickencraft.mod.ChickenCraft;
import net.chickencraft.mod._MCreativeTabs;
import net.chickencraft.mod._MItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemChickenStick extends Item{
	
	public ItemChickenStick(){
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(_MCreativeTabs.TabChickenCraft);
		this.setMaxStackSize(1);
		
	}
	
	public void onCreated(ItemStack itemstack, World world, EntityPlayer entityplayer){
		itemstack.addEnchantment(Enchantment.knockback, itemstack.getItemDamage() + 1);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(ChickenCraft.MODID + ":" + "ItemChickenStick");
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list){
		for(int i = 0; i < 5; i++){
			ItemStack itemstack = new ItemStack(_MItems.ItemChickenStick, 1, i);
			itemstack.addEnchantment(Enchantment.knockback, i + 1);
			list.add(itemstack);
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
}
