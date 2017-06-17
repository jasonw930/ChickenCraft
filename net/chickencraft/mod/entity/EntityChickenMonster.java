package net.chickencraft.mod.entity;

import net.chickencraft.mod._MItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityChickenMonster extends EntityMob{

	public EntityChickenMonster(World world) {
		super(world);
	}

	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.5D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D); 
	}
	
	protected Item getDropItem(){
		return _MItems.ItemChickenEssence;
	}
	
}
