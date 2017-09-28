package aye10032.gay.common.item;

import aye10032.gay.common.creativetab.CreativeTabsGay;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemAssSword extends ItemSword
{
	
	public ItemAssSword()
	{
		super(EnumHelper.addToolMaterial("ASS", 1, 1999, 15.0F, 15.0F, 10));
		this.setCreativeTab(CreativeTabsGay.tabGay);
	}
	
}
