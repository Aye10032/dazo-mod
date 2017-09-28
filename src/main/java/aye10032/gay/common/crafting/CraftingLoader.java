package aye10032.gay.common.crafting;

import aye10032.gay.common.item.GayItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader 
{
	
	public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {
    	GameRegistry.addRecipe(new ItemStack(GayItems.itemSuperAss), new Object[]
    	        {
    	                "###", "#*#", "###", '*', Items.STICK, '#', GayItems.itemDazosAss
    	        });
    	GameRegistry.addRecipe(new ItemStack(GayItems.itemAssSword), new Object[]
    	        {
    	                "#", "#", "*", '*', Items.STICK, '#', GayItems.itemSuperAss
    	        });
    }

    private static void registerSmelting()
    {

    }

    private static void registerFuel()
    {

    }
	
}
