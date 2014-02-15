package mcextreme.magic.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.MCExtremeUtils;
import mcextreme.core.MCExtremeCore;
import mcextreme.magic.MCExtremeMagic;
import mcextreme.magic.item.ItemBlockMagic;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlocksMagic
{
    public static Block blockMagicPortal;
    public static Block blockOre, blockStorage;
    public static Block blockSolidEvil;
    public static Block blockWorldsEnd;
    public static Block blockLiquidDark;
    public static Block blockLiquidBlood;
    public static Block blockLiquidFireBlood;
    public static Block blockLiquidEndBlood;
    public static Block blockBarrierRune;
    
    public static Material materialDark;
    
    public static Fluid fluidDarkness;
    
    public static void initBlocks()
    {
    	fluidDarkness = new FluidDark().setBlockID(MCExtremeConfig.blockLiquidDarkID);
    	
        blockMagicPortal = new BlockMagicPortal(MCExtremeConfig.blockMagicPortalID).setHardness(-1.0F).setResistance(6000000.0F).setLightValue(1.0F).setUnlocalizedName("portalMagic");
        //Corrupt Stuff
        blockSolidEvil = new BlockSolidEvil(MCExtremeConfig.blockSolidEvilID, Material.rock).setHardness(50.0F).setResistance(2000.0F).setUnlocalizedName("solidEvil").setCreativeTab(MCExtremeCore.tabMagic);
        blockWorldsEnd = new BlockWorldsEnd(MCExtremeConfig.blockWorldsEndID, Material.rock).setHardness(-1.0F).setResistance(6000000.0F).setUnlocalizedName("worldEnd").setCreativeTab(MCExtremeCore.tabMagic);
        blockLiquidDark = new BlockLiquidDark(MCExtremeConfig.blockLiquidDarkID).setUnlocalizedName("liquidDarkness");
        //Runes
        blockBarrierRune = new BlockBarrierRune(MCExtremeConfig.blockBarrierRuneID, Material.circuits).setUnlocalizedName("barrierRune");
        
        blockOre = new BlockOreMagic(MCExtremeConfig.blockMagicOreID, "ORE", Material.rock).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockMagicOre");
        blockStorage = new BlockOreStorageMagic(MCExtremeConfig.blockMagicStorageID, "STORAGE", Material.iron).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockMagicStorage");
        
        Item.itemsList[MCExtremeConfig.blockMagicOreID] = new ItemBlockMagic(MCExtremeConfig.blockMagicOreID).setUnlocalizedName("blockMagicOre"); 
        Item.itemsList[MCExtremeConfig.blockMagicStorageID] = new ItemBlockMagic(MCExtremeConfig.blockMagicStorageID).setUnlocalizedName("blockMagicStorage");

        MCExtremeUtils.registerDefaultBlocks(blockSolidEvil, blockWorldsEnd, blockLiquidDark, blockBarrierRune);
    }
}
