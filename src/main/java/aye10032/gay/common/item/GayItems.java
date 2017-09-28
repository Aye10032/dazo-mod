package aye10032.gay.common.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GayItems 
{
	
	public static Item itemDazosAss = new ItemDazosAss().setUnlocalizedName("dazosAss");
	public static Item itemSuperAss = new ItemSuperAss().setUnlocalizedName("superAss");
	
	public static Item itemAssSword = new ItemAssSword().setUnlocalizedName("assSword");
	
	
	public static void init()
	{
		ForgeRegistries.ITEMS.register(itemDazosAss.setRegistryName("dazos_ass"));
		ForgeRegistries.ITEMS.register(itemSuperAss.setRegistryName("super_ass"));
		
		ForgeRegistries.ITEMS.register(itemAssSword.setRegistryName("ass_sword"));
	}
	
	
	@SideOnly(Side.CLIENT)
	public static void clientInit()
	{
		ModelLoader.setCustomModelResourceLocation(itemDazosAss, 0, new ModelResourceLocation(itemDazosAss.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSuperAss, 0, new ModelResourceLocation(itemSuperAss.getRegistryName(), "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(itemAssSword, 0, new ModelResourceLocation(itemAssSword.getRegistryName(), "inventory"));
	}
}
