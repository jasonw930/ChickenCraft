package net.chickencraft.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.chickencraft.mod.handler.CraftingManager;
import net.chickencraft.mod.proxy.CommonProxy;

@Mod(modid = ChickenCraft.MODID, version = ChickenCraft.VERSION)
public class ChickenCraft {

	public static final String MODID = "chickencraft";
	public static final String VERSION = "alpha 0.1";
	
	@Instance(MODID)
	public static ChickenCraft instance;
	
	@SidedProxy(clientSide = "net.chickencraft.mod.proxy.ClientProxy", serverSide = "net.chickencraft.mod.proxy.CommonProxy")
	public static CommonProxy _MProxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		_MProxy.registerRenderThings();
		_MCreativeTabs.mainRegistry();
		_MBlocks.mainRegistry();
		_MItems.mainRegistry();
		_MWorld.mainRegistry();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		_MEntities.mainRegistry();
		CraftingManager.mainRegistry();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
}
