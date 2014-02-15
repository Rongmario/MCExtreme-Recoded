package mcextreme.vtweaks;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import mcextreme.vtweaks.blocks.BlocksVTweaks;
import mcextreme.vtweaks.item.ItemsVTweaks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class CraftingVTweaks
{
	public static void removeItemRecipes(Item[] item)
	{
        Collection<Item> removeSet = new HashSet();
        Collections.addAll(removeSet, item);
        Iterator<IRecipe> iterator1 = CraftingManager.getInstance().getRecipeList().iterator();

        while (iterator1.hasNext())
        {
        	IRecipe recipe = iterator1.next();
        	if (recipe == null) 
        		continue;
        	
        	ItemStack output = recipe.getRecipeOutput();
        	if (output != null && output.getItem() != null && removeSet.contains(output.getItem())) 
        		iterator1.remove();
        }
    }
	
	public static void removeBlockRecipes(Block block)
	{
		Iterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().iterator();

		while (iterator.hasNext())
		{
		        IRecipe recipe = iterator.next();
		        if (recipe == null)
		                continue;
		        ItemStack output = recipe.getRecipeOutput();
		        if (output != null && output.itemID == block.blockID)
		                iterator.remove();
		}
    }
	
    public static void addRecipes()
    {
        CraftingVTweaks.removeItemRecipes(new Item[] {Item.helmetChain, Item.plateChain, Item.legsChain, Item.bootsChain, Item.helmetIron, Item.plateIron, Item.legsIron, Item.bootsIron});
        CraftingVTweaks.removeBlockRecipes(Block.bookShelf);
        
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.helmetChain), new Object[] {"###", "# #", '#', ItemsVTweaks.itemLink});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.plateChain), new Object[] {"# #", "###", "###", '#', ItemsVTweaks.itemLink});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.legsChain), new Object[] {"###", "# #", "# #", '#', ItemsVTweaks.itemLink});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.bootsChain), new Object[] {"# #", "# #", '#', ItemsVTweaks.itemLink});
        
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.helmetIron), new Object[] {"I#I", "#X#", "   ", 'I', ItemsVTweaks.itemPlate, '#', Item.leather, 'X', Item.helmetChain});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.plateIron), new Object[] {"I#I", "#X#", "I#I", 'I', ItemsVTweaks.itemPlate, '#', Item.leather, 'X', Item.plateChain});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.legsIron), new Object[] {"I#I", "#X#", "I#I", 'I', ItemsVTweaks.itemPlate, '#', Item.leather, 'X', Item.legsChain});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.bootsIron), new Object[] {"   ", "#X#", "I#I", 'I', ItemsVTweaks.itemPlate, '#', Item.leather, 'X', Item.bootsChain});
        
        CraftingManager.getInstance().addRecipe(new ItemStack(Block.bookShelf), new Object[] {"###", "XXX", "###", '#', Block.planks, 'X', Item.enchantedBook});
        
        CraftingManager.getInstance().addRecipe(new ItemStack(ItemsVTweaks.itemLink), new Object[] {"#", '#', Item.ingotIron});
        CraftingManager.getInstance().addRecipe(new ItemStack(BlocksVTweaks.blockCharcoal), new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(Item.coal.itemID, 1, 1) });
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Item.coal, 9, 1), new ItemStack(BlocksVTweaks.blockCharcoal));
        CraftingManager.getInstance().addShapelessRecipe(new ItemStack(ItemsVTweaks.itemPlate),new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron));
    }
}
