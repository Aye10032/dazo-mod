package aye10032.gay.common.creativetab;

import aye10032.gay.common.item.GayItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class CreativeTabsGay extends CreativeTabs
{
    public static CreativeTabsGay tabGay = new CreativeTabsGay();
    
    public CreativeTabsGay()
    {
        super("gay");
    }

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return GayItems.itemDazosAss;
	}
    

}
