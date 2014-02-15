package mcextreme.vtweaks.blocks;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.MCExtremeUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlocksVTweaks
{
    public static Block blockLeaves, blockCharcoal;
    
    public static void initBlocks()
    {
        Block.blocksList[18] = null;
        
        blockLeaves = new BlockNonSolidLeaves(18).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("leaves").setTextureName("leaves");
        blockCharcoal = new Block(MCExtremeConfig.blockCharcoalID, Material.rock).setUnlocalizedName("blockCharcoal").setTextureName("mcextreme:vtweaks/blockCharcoal").setCreativeTab(CreativeTabs.tabBlock).setCreativeTab(MCExtremeCore.tabVanillaTweaks);
        
        MCExtremeUtils.registerDefaultBlock(blockCharcoal);
    }
}
