package net.chickencraft.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelChickenMonster extends ModelBase{

	//fields
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rleg;
	ModelRenderer lleg;
	ModelRenderer rarm;
	ModelRenderer larm;
	
	public ModelChickenMonster(){
		textureWidth = 64;
		textureHeight = 64;
		
		//head
		head = new ModelRenderer(this, 0, 0);
	    head.addBox(-4F, -4F, -4F, 8, 8, 8);
	    head.setRotationPoint(0F, -4F, 0F);
	    head.setTextureSize(64, 32);
	    head.mirror = true;
	    setRotation(head, 0F, 0F, 0F);
	    
	    //body
	  	body = new ModelRenderer(this, 17, 0);
	  	body.addBox(-4F, 0F, -2F, 8, 12, 4);
	  	body.setRotationPoint(0F, 0F, 0F);	
	  	body.setTextureSize(64, 32);
	  	body.mirror = true;
	    setRotation(body, 0F, 0F, 0F);
	    
	    //rleg
	    rleg = new ModelRenderer(this, 0, 18);
	    rleg.addBox(-2F, 0F, -2F, 4, 12, 4);
	    rleg.setRotationPoint(-2F, 12F, 0F);	
	    rleg.setTextureSize(64, 32);
	    rleg.mirror = true;
	    setRotation(rleg, 0F, 0F, 0F);
	    
	    //lleg
	    lleg = new ModelRenderer(this, 17, 18);
	    lleg.addBox(-2F, 0F, -2F, 4, 12, 4);
	    lleg.setRotationPoint(2F, 12F, 0F);	
	    lleg.setTextureSize(64, 32);
	    lleg.mirror = true;
	    setRotation(lleg, 0F, 0F, 0F);
	    
	    //rarm
	    rarm = new ModelRenderer(this, 0, 36);
	    rarm.addBox(-2F, -2F, -10F, 4, 4, 12);
	    rarm.setRotationPoint(-6F, 2F, 0F);	
	    rarm.setTextureSize(64, 32);
	    rarm.mirror = true;
	    setRotation(rarm, 0F, 0F, 0F);
	    
	    //larm
	    larm = new ModelRenderer(this, 32, 36);
	    larm.addBox(-2F, -2F, -10F, 4, 4, 12);
	    larm.setRotationPoint(6F, 2F, 0F);	
	    larm.setTextureSize(64, 32);
	    larm.mirror = true;
	    setRotation(larm, 0F, 0F, 0F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    head.render(f5);
	    body.render(f5);
	    lleg.render(f5);
	    rleg.render(f5);
	    rarm.render(f5);
	    larm.render(f5);
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity){
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    
	    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
	    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
	    
	    this.rarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	    this.larm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	    this.rarm.rotateAngleZ = 0.0F;
	    this.larm.rotateAngleZ = 0.0F;
	    this.rleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	    this.lleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	    this.rleg.rotateAngleY = 0.0F;
	    this.lleg.rotateAngleY = 0.0F;
	}
	
}
