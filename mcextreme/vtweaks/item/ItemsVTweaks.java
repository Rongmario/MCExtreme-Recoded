package mcextreme.vtweaks.item;

import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.MCExtremeCore;
import mcextreme.vtweaks.MCExtremeVTweaks;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class ItemsVTweaks 
{
	public static Item itemLink, itemPlate;
	public static Item pickaxeWood, pickaxeStone, pickaxeIron, pickaxeGold, pickaxeDiamond;
	
	public static int[] overwriteItems = new int[] { 257, 270, 274, 278, 285 };
    
    public static void initItems()
    {
        eraseItems();
        
        pickaxeWood = new ItemPickaxeVTweaks(14, EnumToolMaterial.WOOD).setUnlocalizedName("pickaxeWood").setTextureName("wood_pickaxe");
        pickaxeStone = new ItemPickaxeVTweaks(18, EnumToolMaterial.STONE).setUnlocalizedName("pickaxeStone").setTextureName("stone_pickaxe");
        pickaxeIron = new ItemPickaxeVTweaks(1, EnumToolMaterial.IRON).setUnlocalizedName("pickaxeIron").setTextureName("iron_pickaxe");
        pickaxeGold = new ItemPickaxeVTweaks(29, EnumToolMaterial.GOLD).setUnlocalizedName("pickaxeGold").setTextureName("gold_pickaxe");
        pickaxeDiamond = new ItemPickaxeVTweaks(22, EnumToolMaterial.EMERALD /* Is this a fucking bug? */).setUnlocalizedName("pickaxeDiamond").setTextureName("diamond_pickaxe");
        
        itemLink = new Item(MCExtremeConfig.itemLinkID).setCreativeTab(MCExtremeCore.tabVanillaTweaks).setUnlocalizedName("linkIron").setTextureName("mcextreme:vtweaks/linkIron");
        itemPlate = new Item(MCExtremeConfig.itemPlateID).setCreativeTab(MCExtremeCore.tabVanillaTweaks).setUnlocalizedName("plateIron").setTextureName("mcextreme:vtweaks/plateIron");
    }

    private static void eraseItems()
    {
        for (int i = 0; i < overwriteItems.length; i++)
        {
            Item.itemsList[overwriteItems[i]] = null;
        }
    }
}
