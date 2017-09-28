package aye10032.gay;

import aye10032.gay.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Gay.MODID, name=Gay.NAME, version=Gay.VERSION)
public class Gay 
{

	public static final String MODID = "gay";
	public static final String NAME = "Gay";
	public static final String VERSION = "1.0";
	
	@SidedProxy(clientSide = "aye10032.gay.client.ClientProxy", serverSide = "aye10032.gay.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	@Instance(MODID)
	public static Gay instance;
	
	
	private Logger logger;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		proxy.preInit(event);
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	
	public Logger getLogger()
	{
		return logger;
	}
	
}
