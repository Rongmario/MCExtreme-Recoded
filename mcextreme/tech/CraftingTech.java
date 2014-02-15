package mcextreme.tech;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import mcextreme.tech.block.BlockOreStorageTech;
import mcextreme.tech.block.BlockOreTech;
import mcextreme.tech.block.BlocksTech;
import mcextreme.tech.item.ItemsTech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingTech
{
    public static void addRecipes()
    {
        for (int meta = 0; meta < BlockOreStorageTech.names.length; ++meta)
        {
        	CraftingManager.getInstance().addRecipe(new ItemStack(BlocksTech.blockStorage.blockID, 1, meta), new Object[] {"###", "###", "###", '#', new ItemStack(ItemsTech.itemIngot.itemID, 1, meta)});
        	CraftingManager.getInstance().addShapelessRecipe(new ItemStack(ItemsTech.itemIngot.itemID, 9, meta), new Object[] {new ItemStack(BlocksTech.blockStorage.blockID, 1, meta)});
        }
    }
    
    public static void addSmeltingRecipes()
    {
    	for (int meta = 0; meta < BlockOreTech.names.length; ++meta)
    	{
    		FurnaceRecipes.smelting().addSmelting(BlocksTech.blockOre.blockID, meta, new ItemStack(ItemsTech.itemIngot, 1, meta), 0.1F);
    	}
    }
    
    public static void registerInOreDict()
    {
    	for (int meta = 0; meta < BlockOreTech.names.length; ++meta)
    	{
	        OreDictionary.registerOre(BlockOreTech.names[meta], new ItemStack(BlocksTech.blockOre, 1, meta));
    	}
        
    }
}
