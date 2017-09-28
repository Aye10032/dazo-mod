package aye10032.gay.common;

import aye10032.gay.common.crafting.CraftingLoader;
import aye10032.gay.common.entity.EntityLoader;
import aye10032.gay.common.item.GayItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	
	public void preInit(FMLPreInitializationEvent event)
	{
		GayItems.init();
		new EntityLoader();
	}
	
	
	public void init(FMLInitializationEvent event)
	{
		new CraftingLoader();
	}
	
}
