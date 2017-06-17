package net.chickencraft.mod.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.chickencraft.mod._MBlocks;
import net.chickencraft.mod._MItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {

	public static void mainRegistry(){
		simpleCrafting();
		complexCrafting();
	}
	
	public static void simpleCrafting(){
		
		//Crafting
		GameRegistry.addRecipe(new ItemStack(_MItems.ItemMashedChicken), new Object[]{" X ","XYX"," X ", 'X', Items.chicken, 'Y', Items.egg});
		
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolChickenSword), new Object[]{" X "," X "," Y ", 'X', _MItems.ItemChickenIngot, 'Y', Items.bone});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolChickenPickaxe), new Object[]{"XXX"," Y "," Y ", 'X', _MItems.ItemChickenIngot, 'Y', Items.bone});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolChickenAxe), new Object[]{"XX ","XY "," Y ", 'X', _MItems.ItemChickenIngot, 'Y', Items.bone});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolChickenAxe), new Object[]{" XX"," YX"," Y ", 'X', _MItems.ItemChickenIngot, 'Y', Items.bone});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolChickenSpade), new Object[]{" X "," Y "," Y ", 'X', _MItems.ItemChickenIngot, 'Y', Items.bone});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolChickenHoe), new Object[]{"XX "," Y "," Y ", 'X', _MItems.ItemChickenIngot, 'Y', Items.bone});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolChickenHoe), new Object[]{" XX"," Y "," Y ", 'X', _MItems.ItemChickenIngot, 'Y', Items.bone});
		
		//Smelting
		GameRegistry.addSmelting(new ItemStack(_MItems.ItemMashedChicken), new ItemStack(_MItems.ItemChickenIngot), 0.5F);
		GameRegistry.addSmelting(new ItemStack(_MBlocks.BlockChickeniteOre), new ItemStack(_MItems.ItemChickeniteIngot), 0.5F);
		
	}
	
	public static void complexCrafting(){
		
		//Armor
		ItemStack stackChickenHelmet = new ItemStack(_MItems.ArmorChickenHelmet, 1);
		stackChickenHelmet.addEnchantment(Enchantment.protection, 4);
		stackChickenHelmet.addEnchantment(Enchantment.thorns, 2);
		stackChickenHelmet.addEnchantment(Enchantment.unbreaking, 4);
		GameRegistry.addRecipe(stackChickenHelmet, new Object[]{"XXX","X X","   ", 'X', _MItems.ItemChickenIngot});

		ItemStack stackChickenChest = new ItemStack(_MItems.ArmorChickenChest, 1);
		stackChickenChest.addEnchantment(Enchantment.protection, 4);
		stackChickenChest.addEnchantment(Enchantment.thorns, 2);
		stackChickenChest.addEnchantment(Enchantment.unbreaking, 4);
		GameRegistry.addRecipe(stackChickenChest, new Object[]{"X X","XXX","XXX", 'X', _MItems.ItemChickenIngot});

		ItemStack stackChickenLegs = new ItemStack(_MItems.ArmorChickenLegs, 1);
		stackChickenLegs.addEnchantment(Enchantment.protection, 4);
		stackChickenLegs.addEnchantment(Enchantment.thorns, 2);
		stackChickenLegs.addEnchantment(Enchantment.unbreaking, 4);
		GameRegistry.addRecipe(stackChickenLegs, new Object[]{"XXX","X X","X X", 'X', _MItems.ItemChickenIngot});

		ItemStack stackChickenBoots = new ItemStack(_MItems.ArmorChickenBoots, 1);
		stackChickenBoots.addEnchantment(Enchantment.protection, 4);
		stackChickenBoots.addEnchantment(Enchantment.thorns, 2);
		stackChickenBoots.addEnchantment(Enchantment.unbreaking, 4);
		GameRegistry.addRecipe(stackChickenBoots, new Object[]{"   ","X X","X X", 'X', _MItems.ItemChickenIngot});
		
		//Stick
		ItemStack stackChickenStick0 = new ItemStack(_MItems.ItemChickenStick, 1, 0);
		stackChickenStick0.addEnchantment(Enchantment.knockback, 1);
		GameRegistry.addRecipe(stackChickenStick0, new Object[]{"XX ","XX ","XX ", 'X', _MItems.ItemChickeniteIngot});
		
		ItemStack stackChickenStick1 = new ItemStack(_MItems.ItemChickenStick, 1, 1);
		stackChickenStick1.addEnchantment(Enchantment.knockback, 2);
		GameRegistry.addRecipe(stackChickenStick1, new Object[]{"XXX","XYX","XXX", 'X', _MItems.ItemChickeniteIngot, 'Y', stackChickenStick0});

		ItemStack stackChickenStick2 = new ItemStack(_MItems.ItemChickenStick, 1, 2);
		stackChickenStick2.addEnchantment(Enchantment.knockback, 3);
		GameRegistry.addRecipe(stackChickenStick2, new Object[]{"XXX","XYX","XXX", 'X', _MItems.ItemChickeniteIngot, 'Y', stackChickenStick1});

		ItemStack stackChickenStick3 = new ItemStack(_MItems.ItemChickenStick, 1, 3);
		stackChickenStick3.addEnchantment(Enchantment.knockback, 4);
		GameRegistry.addRecipe(stackChickenStick3, new Object[]{"XXX","XYX","XXX", 'X', _MItems.ItemChickeniteIngot, 'Y', stackChickenStick2});

		ItemStack stackChickenStick4 = new ItemStack(_MItems.ItemChickenStick, 1, 4);
		stackChickenStick4.addEnchantment(Enchantment.knockback, 5);
		GameRegistry.addRecipe(stackChickenStick4, new Object[]{"XXX","XYX","XXX", 'X', _MItems.ItemChickeniteIngot, 'Y', stackChickenStick3});
	}
	
}