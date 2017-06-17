package net.chickencraft.mod.render;

import net.chickencraft.mod.ChickenCraft;
import net.chickencraft.mod.entity.EntityChickenMonster;
import net.chickencraft.mod.model.ModelChickenMonster;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderChickenMonster extends RenderLiving{

	private static final ResourceLocation texture = new ResourceLocation(ChickenCraft.MODID + ":" + "textures/model/ModelChickenMonster.png");
	
	protected ModelChickenMonster modelEntity;
	
	public RenderChickenMonster(ModelBase par1ModelBase, float par2){
		super(par1ModelBase, par2);
		modelEntity = ((ModelChickenMonster)mainModel);
	}
	
	public void renderChickenMonster(EntityChickenMonster entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderChickenMonster((EntityChickenMonster)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderChickenMonster((EntityChickenMonster)entity, x, y, z, u, v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
}
