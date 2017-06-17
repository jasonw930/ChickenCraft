package net.chickencraft.mod;

import net.chickencraft.mod.entity.EntityChickenMonster;
import net.chickencraft.mod.handler.EntityHandler;

public class _MEntities {

	public static void mainRegistry(){
		EntityHandler.registerMonsters(EntityChickenMonster.class, "ChickenMonster");
	}
	
}
