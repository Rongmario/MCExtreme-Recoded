package mcextreme.tech.block;

import java.util.Random;

import mcextreme.core.MCExtremeCore;
import mcextreme.magic.block.BlocksMagic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockLiquidConcrete extends BlockFluidClassic
{
	public BlockLiquidConcrete(int par1) 
	{
		super(par1, BlocksTech.fluidConcrete, Material.lava);
		this.setCreativeTab(MCExtremeCore.tabTech);
		BlocksTech.fluidConcrete.setBlockID(par1);
	}
	
	public Icon getIcon(int side, int meta)
	{
	    return Block.lavaMoving.getIcon(side, meta);
	}

	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
	{
	    return 0x808080; // HEX color code as indicated by the 0x infront. This is black
	}
}