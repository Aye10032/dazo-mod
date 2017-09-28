package aye10032.gay.common.entity;

import aye10032.gay.Gay;
import aye10032.gay.client.entity.EntityRenderFactory;
import aye10032.gay.client.entity.render.RenderStrangeAss;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class EntityLoader 
{
	
	private static int nextID = 0;
	
	
	public EntityLoader()
	{
		registerEntity(EntityStrangeAss.class, "StrangeAss", 80, 3, true);
		registerEntityEgg(EntityStrangeAss.class, 0xffff66, 0x660000);
		registerEntitySpawn(EntityStrangeAss.class, 100, 4, 6, EnumCreatureType.CREATURE, Biome.getBiome(129));
	}
	
	
	private static void registerEntity(Class<? extends Entity> entityClass, String name, int trackingRange,int updateFrequency, boolean sendsVelocityUpdates)
	{
		EntityRegistry.registerModEntity(entityClass, name, nextID++, Gay.instance, trackingRange, updateFrequency,sendsVelocityUpdates);
	}
	
	
	private static void registerEntityEgg(Class<? extends Entity> entityClass, int eggPrimary, int eggSecondary)
	{
		EntityRegistry.registerEgg(entityClass, eggPrimary, eggSecondary);
	}
	
	
	@SideOnly(Side.CLIENT)
	private static <T extends Entity> void registerEntityRender(Class<T> entityClass, Class<? extends Render<T>> render)
	{
		RenderingRegistry.registerEntityRenderingHandler(entityClass, new EntityRenderFactory<T>(render));
	}


	@SideOnly(Side.CLIENT)
	public static void registerRenders() 
	{
		registerEntityRender(EntityStrangeAss.class, RenderStrangeAss.class);
	}
	
	
	 private static void registerEntitySpawn(Class<? extends Entity> entityClass, int spawnWeight, int min,
	            int max, EnumCreatureType typeOfCreature, Biome biomes)
	 {
		 if (EntityLiving.class.isAssignableFrom(entityClass))
		 {
			 Class<? extends EntityLiving> entityLivingClass = entityClass.asSubclass(EntityLiving.class);
	            EntityRegistry.addSpawn(entityLivingClass, spawnWeight, min, max, typeOfCreature, biomes);
		 }
	 }
}
