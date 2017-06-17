package net.chickencraft.mod.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.chickencraft.mod.entity.EntityChickenMonster;
import net.chickencraft.mod.model.ModelChickenMonster;
import net.chickencraft.mod.render.RenderChickenMonster;

public class ClientProxy extends CommonProxy{

	public void registerRenderThings(){
		//Entity
		RenderingRegistry.registerEntityRenderingHandler(EntityChickenMonster.class, new RenderChickenMonster(new ModelChickenMonster(), 0.3F));
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
	
}
