package mcextreme.magic.block;

import net.minecraft.block.Block;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.entity.*;

public class BlockBarrierRune extends Block
{


/** The mob type that can trigger this pressure plate. */
private EnumMobType triggerMobType;

	
	public BlockBarrierRune(int par1, Material par2Material) 
	{
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, boolean par5Entity)
    {
        if(par5Entity = EnumMobType.players != null)
        {
           
        }
        else
        {
        
        }
    }
}
