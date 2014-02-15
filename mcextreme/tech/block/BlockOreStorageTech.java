package mcextreme.tech.block;

import java.util.List;
import java.util.Random;

import mcextreme.core.MCExtremeCore;
import mcextreme.tech.MCExtremeTech;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockOreStorageTech extends Block
{
	public static String[] names = new String[] { "blockAluminium", "blockCopper", "blockLead", "blockNickel", "blockPlatinum", "blockSilver", "blockTin", "blockZinc", "blockUranium", "blockChromium", "blockMercury", "blockArsenic", "blockAntimony", "blockLithium", "blockStrontium", "blockIridium", "blockTitanium", "blockTungsten" };
    public Icon[] textures;
    
    public BlockOreStorageTech(int blockID, String type, Material blockMaterial)
    {
        super(blockID, blockMaterial);
        this.setCreativeTab(MCExtremeCore.tabTech);
    }
    
    public void getSubBlocks(int blockID, CreativeTabs tab, List tabList)
    {
    	for (int meta = 0; meta < names.length; ++meta)
    	{
	        tabList.add(new ItemStack(blockID, 1, meta));
    	}
    }
    
    public void registerIcons(IconRegister iconRegistry)
    {
    	this.textures = new Icon[names.length];
    	
    	for (int meta = 0; meta < names.length; ++meta)
    	{
    		this.textures[meta] = iconRegistry.registerIcon("mcextreme:tech/" + names[meta]);
    	}
    }
    
    public Icon getIcon(int side, int meta)
    {
        return meta < names.length ? textures[meta] : textures[0];
    }
    
    public int damageDropped (int meta) 
    {
    	return meta;
    }
}
