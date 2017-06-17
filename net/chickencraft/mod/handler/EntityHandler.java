package net.chickencraft.mod.handler;

import java.util.Random;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.chickencraft.mod.ChickenCraft;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandler {

	public static void registerMonsters(Class entityClass, String name){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 16777215;
		int subColor = random.nextInt() * 16777215;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.addSpawn(entityClass, 50, 2, 3, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.forest);
		EntityRegistry.registerModEntity(entityClass, name, entityID, ChickenCraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, mainColor, subColor));
	}
	
}
