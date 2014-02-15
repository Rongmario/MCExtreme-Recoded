package mcextreme.magic;

import mcextreme.magic.block.BlockOreMagic;
import mcextreme.magic.block.BlocksMagic;
import mcextreme.magic.item.ItemsMagic;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingMagic
{
    public static void addRecipes()
    {
        
    }
    
    public static void addSmeltingRecipes()
    {
    	for (int meta = 0; meta < BlockOreMagic.names.length; ++meta)
    	{
    		FurnaceRecipes.smelting().addSmelting(BlocksMagic.blockOre.blockID, meta, new ItemStack(ItemsMagic.itemCrystal, 1, meta), 0.1F);
    	}
    }
    
    public static void registerInOreDict()
    {
    	for (int meta = 0; meta < BlockOreMagic.names.length; ++meta)
    	{
	        OreDictionary.registerOre(BlockOreMagic.names[meta], new ItemStack(BlocksMagic.blockOre, 1, meta));
    	}
    }
}
