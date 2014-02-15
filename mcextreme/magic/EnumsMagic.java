package mcextreme.magic;

import mcextreme.magic.block.BlocksMagic;
import net.minecraftforge.common.MinecraftForge;

public class EnumsMagic
{
    public static void setHarvestLevels()
    {
        MinecraftForge.setBlockHarvestLevel(BlocksMagic.blockOre, 0, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(BlocksMagic.blockSolidEvil, 0, "pickaxe", 2);
    }
}
