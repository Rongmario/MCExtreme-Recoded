package mcextreme.tech;

import mcextreme.tech.block.BlocksTech;
import net.minecraftforge.common.MinecraftForge;

public class EnumsTech
{
	public static int[] enums = {2, 2, 1, 3, 3, 2, 1, 2};
	
    public static void setHarvestLevels()
    {
    	for (int meta = 0; meta < enums.length; ++meta)
    		MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, meta, "pickaxe", enums[meta]);
        
        for (int meta = 0; meta < enums.length; ++meta)
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, meta, "pickaxe", enums[meta]);
    }
}
