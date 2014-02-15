package mcextreme.magic.block;

import java.util.List;
import java.util.Random;

import mcextreme.core.MCExtremeCore;
import mcextreme.magic.MCExtremeMagic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMagicPortal extends Block//Container
{
    public BlockMagicPortal(int blockID)
    {
        super(blockID, Material.portal);
        this.setCreativeTab(MCExtremeCore.tabMagic);
    }
    
    /*
    public TileEntity createNewTileEntity(World par1World) {
        return new TileEntity_MagicPortal();
    }

    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        float height = 0.0625F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, height, 1.0F);
    }
    
    public boolean tryToCreatePortal (World world, int xPos, int yPos, int zPos) {
        if (world.getBlockId(xPos - 1, yPos, zPos) == Block.whiteStone.blockID && world.getBlockId(xPos + 1, yPos, zPos) == Block.whiteStone.blockID) {
            world.setBlock(xPos, yPos, zPos, Block.portal.blockID, 0, 2);
            return true;
        }
        else return false;
    }

    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
        byte b0 = 0;
        byte b1 = 1;

        if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID) {
            b0 = 1;
            b1 = 0;
        }

        int i1;

        for (i1 = par3; par1World.getBlockId(par2, i1 - 1, par4) == this.blockID; --i1) {
            ;
        }

        if (par1World.getBlockId(par2, i1 - 1, par4) != Block.whiteStone.blockID) {
            par1World.setBlockToAir(par2, par3, par4);
        }
        else {
            int j1;

            for (j1 = 1; j1 < 4 && par1World.getBlockId(par2, i1 + j1, par4) == this.blockID; ++j1) {
                ;
            }

            if (j1 == 3 && par1World.getBlockId(par2, i1 + j1, par4) == Block.whiteStone.blockID) {
                boolean flag = par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID;
                boolean flag1 = par1World.getBlockId(par2, par3, par4 - 1) == this.blockID || par1World.getBlockId(par2, par3, par4 + 1) == this.blockID;

                if (flag && flag1) {
                    par1World.setBlockToAir(par2, par3, par4);
                }
                else {
                    if ((par1World.getBlockId(par2 + b0, par3, par4 + b1) != Block.whiteStone.blockID || par1World.getBlockId(par2 - b0, par3, par4 - b1) != this.blockID) && (par1World.getBlockId(par2 - b0, par3, par4 - b1) != Block.whiteStone.blockID || par1World.getBlockId(par2 + b0, par3, par4 + b1) != this.blockID)) {
                        par1World.setBlockToAir(par2, par3, par4);
                    }
                }
            }
            else {
                par1World.setBlockToAir(par2, par3, par4);
            }
        }
    }

    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return par5 != 0 ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {}

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public int quantityDropped(Random par1Random) {
        return 0;
    }

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
        if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null && !par1World.isRemote) {
            par5Entity.travelToDimension(1);
        }
    }

    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        double d0 = (double)((float)par2 + par5Random.nextFloat());
        double d1 = (double)((float)par3 + 0.8F);
        double d2 = (double)((float)par4 + par5Random.nextFloat());
        double d3 = 0.0D;
        double d4 = 0.0D;
        double d5 = 0.0D;
        par1World.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);
    }

    public int getRenderType() {
        return -1;
    }

    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
        if (par1World.provider.dimensionId != 0) {
            par1World.setBlockToAir(par2, par3, par4);
        }
    }

    public int idPicked(World par1World, int par2, int par3, int par4) {
        return 0;
    }
     */
    
    public void registerIcons(IconRegister iconRegistry) 
	{
		this.blockIcon = iconRegistry.registerIcon("mcextreme:magic/" + this.getUnlocalizedName().substring(5));
	}
    
}
