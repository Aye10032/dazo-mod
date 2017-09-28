package aye10032.gay.client;

import aye10032.gay.client.entity.EntityRenderLoader;
import aye10032.gay.common.CommonProxy;
import aye10032.gay.common.item.GayItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		GayItems.clientInit();
		new EntityRenderLoader();
	}
	
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
	}
	
}
