package net.chickencraft.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.chickencraft.mod.armor.ArmorChickenArmor;
import net.chickencraft.mod.items.CItem;
import net.chickencraft.mod.items.ItemChickenStick;
import net.chickencraft.mod.items.ToolChickenAxe;
import net.chickencraft.mod.items.ToolChickenHoe;
import net.chickencraft.mod.items.ToolChickenPickaxe;
import net.chickencraft.mod.items.ToolChickenSpade;
import net.chickencraft.mod.items.ToolChickenSword;
import net.chickencraft.mod.items.ToolHardenedChickenAxe;
import net.chickencraft.mod.items.ToolHardenedChickenHoe;
import net.chickencraft.mod.items.ToolHardenedChickenPickaxe;
import net.chickencraft.mod.items.ToolHardenedChickenSpade;
import net.chickencraft.mod.items.ToolHardenedChickenSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class _MItems {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial ToolMaterialChicken = EnumHelper.addToolMaterial("ToolMaterialChicken", 3, 1800, 9.5F, 4.0F, 25);
	public static ArmorMaterial ArmorMaterialChicken = EnumHelper.addArmorMaterial("ArmorMaterialChicken", 38, new int[]{3, 8, 6, 3}, 25);
	public static ToolMaterial ToolMaterialHardened = EnumHelper.addToolMaterial("ToolMaterialHardened", 3, 2000, 12.0F, 5.0F, 28);
	
	public static Item ItemMashedChicken;
	public static Item ItemChickenIngot;
	public static Item ItemChickeniteIngot;
	public static Item ItemChickenEssence;
	public static Item ItemChickenStick;
	
	public static Item ToolChickenSword;
	public static Item ToolChickenPickaxe;
	public static Item ToolChickenAxe;
	public static Item ToolChickenSpade;
	public static Item ToolChickenHoe;

	public static Item ToolHardenedChickenSword;
	public static Item ToolHardenedChickenPickaxe;
	public static Item ToolHardenedChickenAxe;
	public static Item ToolHardenedChickenSpade;
	public static Item ToolHardenedChickenHoe;
	
	public static Item ArmorChickenHelmet;
	public static Item ArmorChickenChest;
	public static Item ArmorChickenLegs;
	public static Item ArmorChickenBoots;
	
	public static int ArmorChickenHelmetID;
	public static int ArmorChickenChestID;
	public static int ArmorChickenLegsID;
	public static int ArmorChickenBootsID;
	
	public static void initializeItem(){
		//Item
		ItemMashedChicken = new CItem().setUnlocalizedName("ItemMashedChicken");
		ItemChickenIngot = new CItem().setUnlocalizedName("ItemChickenIngot");
		ItemChickeniteIngot = new CItem().setUnlocalizedName("ItemChickeniteIngot");
		ItemChickenEssence = new CItem().setUnlocalizedName("ItemChickenEssence");
		ItemChickenStick = new ItemChickenStick().setUnlocalizedName("ItemChickenStick");
		//Tool
		ToolChickenSword = new ToolChickenSword(ToolMaterialChicken).setUnlocalizedName("ToolChickenSword");
		ToolChickenPickaxe = new ToolChickenPickaxe(ToolMaterialChicken).setUnlocalizedName("ToolChickenPickaxe");
		ToolChickenAxe = new ToolChickenAxe(ToolMaterialChicken).setUnlocalizedName("ToolChickenAxe");
		ToolChickenSpade = new ToolChickenSpade(ToolMaterialChicken).setUnlocalizedName("ToolChickenSpade");
		ToolChickenHoe = new ToolChickenHoe(ToolMaterialChicken).setUnlocalizedName("ToolChickenHoe");
		
		ToolHardenedChickenSword = new ToolHardenedChickenSword(ToolMaterialHardened).setUnlocalizedName("ToolHardenedChickenSword");
		ToolHardenedChickenPickaxe = new ToolHardenedChickenPickaxe(ToolMaterialHardened).setUnlocalizedName("ToolHardenedChickenPickaxe");
		ToolHardenedChickenAxe = new ToolHardenedChickenAxe(ToolMaterialChicken).setUnlocalizedName("ToolHardenedChickenAxe");
		ToolHardenedChickenSpade = new ToolHardenedChickenSpade(ToolMaterialHardened).setUnlocalizedName("ToolHardenedChickenSpade");
		ToolHardenedChickenHoe = new ToolHardenedChickenHoe(ToolMaterialHardened).setUnlocalizedName("ToolHardenedChickenHoe");
		
		//Armor
		ArmorChickenHelmet = new ArmorChickenArmor(ArmorMaterialChicken, ArmorChickenHelmetID, 0).setUnlocalizedName("ArmorChickenHelmet");
		ArmorChickenChest = new ArmorChickenArmor(ArmorMaterialChicken, ArmorChickenChestID, 1).setUnlocalizedName("ArmorChickenChest");
		ArmorChickenLegs = new ArmorChickenArmor(ArmorMaterialChicken, ArmorChickenLegsID, 2).setUnlocalizedName("ArmorChickenLegs");
		ArmorChickenBoots = new ArmorChickenArmor(ArmorMaterialChicken, ArmorChickenBootsID, 3).setUnlocalizedName("ArmorChickenBoots");
	}
	
	public static void registerItem(){
		//Item
		GameRegistry.registerItem(ItemMashedChicken, "MashedChicken");
		GameRegistry.registerItem(ItemChickenIngot, "ChickenIngot");
		GameRegistry.registerItem(ItemChickeniteIngot, "ChickeniteIngot");
		GameRegistry.registerItem(ItemChickenEssence, "ChickenEssence");
		GameRegistry.registerItem(ItemChickenStick, "ChickenStick");
		//Tool
		GameRegistry.registerItem(ToolChickenSword, "ChickenSword");
		GameRegistry.registerItem(ToolChickenPickaxe, "ChickenPickaxe");
		GameRegistry.registerItem(ToolChickenAxe, "ChickenAxe");
		GameRegistry.registerItem(ToolChickenSpade, "ChickenSpade");
		GameRegistry.registerItem(ToolChickenHoe, "ChickenHoe");
		
		GameRegistry.registerItem(ToolHardenedChickenSword, "HardenedChickenSword");
		GameRegistry.registerItem(ToolHardenedChickenPickaxe, "HardenedChickenPickaxe");
		GameRegistry.registerItem(ToolHardenedChickenAxe, "HardenedChickenAxe");
		GameRegistry.registerItem(ToolHardenedChickenSpade, "HardenedChickenSpade");
		GameRegistry.registerItem(ToolHardenedChickenHoe, "HardenedChickenHoe");
		//Armor
		GameRegistry.registerItem(ArmorChickenHelmet, "ChickenHelmet");
		GameRegistry.registerItem(ArmorChickenChest, "ChickenChest");
		GameRegistry.registerItem(ArmorChickenLegs, "ChickenLegs");
		GameRegistry.registerItem(ArmorChickenBoots, "ChickenBoots");
	}
	
}
