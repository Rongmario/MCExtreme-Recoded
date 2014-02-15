package mcextreme.magic.block;

import mcextreme.core.MCExtremeCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockLiquidBlood extends BlockFluidClassic
{
	public BlockLiquidBlood(int par1) 
	{
		super(par1, BlocksMagic.fluidDarkness, Material.lava);
		this.setCreativeTab(MCExtremeCore.tabMagic);
		BlocksMagic.fluidDarkness.setBlockID(par1);
	}
	
	public Icon getIcon(int side, int meta)
	{
	    return Block.lavaMoving.getIcon(side, meta);
	}

	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
	{
	    return 0x000000; // HEX color code as indicated by the 0x infront. This is a greenish color.
	}
}
