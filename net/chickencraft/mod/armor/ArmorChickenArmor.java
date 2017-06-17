package net.chickencraft.mod.armor;

import java.util.List;

import net.chickencraft.mod.ChickenCraft;
import net.chickencraft.mod._MCreativeTabs;
import net.chickencraft.mod._MItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorChickenArmor extends ItemArmor{

	public ArmorChickenArmor(ArmorMaterial material, int id, int slot) {
		
		super(material, id, slot);
		this.setCreativeTab(_MCreativeTabs.TabChickenCraft);
		this.hasSubtypes = true;
		
		if(slot == 0) {
			this.setTextureName(ChickenCraft.MODID + ":ArmorChickenHelmet");
		}else if (slot == 1) {
			this.setTextureName(ChickenCraft.MODID + ":ArmorChickenChest");
		}else if (slot == 2) {
			this.setTextureName(ChickenCraft.MODID + ":ArmorChickenLegs");
		}else if (slot == 3) {
			this.setTextureName(ChickenCraft.MODID + ":ArmorChickenBoots");
		}
		
	}
	
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == _MItems.ArmorChickenHelmet || itemstack.getItem() == _MItems.ArmorChickenChest || itemstack.getItem() == _MItems.ArmorChickenBoots){
				return ChickenCraft.MODID + ":" + "textures/models/armor/chicken_layer_1.png";
		}else if (itemstack.getItem() == _MItems.ArmorChickenLegs) {  
			return ChickenCraft.MODID + ":textures/models/armor/chicken_layer_2.png";
		}else{
			return null;
		}
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		ItemStack itemstack = new ItemStack(item, 1);
		itemstack.addEnchantment(Enchantment.protection, 4);
		itemstack.addEnchantment(Enchantment.thorns, 2);
		itemstack.addEnchantment(Enchantment.unbreaking, 4);
		
		list.add(itemstack);
	}

}
