package mcextreme.magic.item;

import java.util.List;

import mcextreme.core.MCExtremeCore;
import mcextreme.magic.MCExtremeMagic;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemCrystalsMagic extends Item
{
	//GENERAL3214: Add Uranium, Mercury, Tungsten, & Lead gravity
    public static String[] names = new String[] {"cystalAquamarine"};
    public Icon[] textures;
	public static String[] localizedNames = new String[] {"Aquamarine Crystal"};
    
    public ItemCrystalsMagic(int itemID, String type)
    {
        super(itemID);
        this.setHasSubtypes(true);
        this.setCreativeTab(MCExtremeCore.tabMagic);
    }
    
    public void getSubItems(int itemID, CreativeTabs tab, List tabList)
    {
    	for (int meta = 0; meta < names.length; ++meta)
    	{
	        tabList.add(new ItemStack(itemID, 1, meta));
    	}
    }
    
    public void registerIcons(IconRegister iconRegistry)
    {
    	this.textures = new Icon[names.length];
    	
    	for (int meta = 0; meta < names.length; ++meta)
    	{
    		this.textures[meta] = iconRegistry.registerIcon("mcextreme:magic/" + names[meta]);
    	}
    }
    
    public Icon getIconFromDamage(int meta)
    {
    	return meta < names.length ? textures[meta] : textures[0];
    }
    
    public String getUnlocalizedName(ItemStack stack)
    {
    	 if(stack.getItemDamage() <= 9)
    		 
             return super.getUnlocalizedName() + "." + stack.getItemDamage();
    	 
         return "item.test";
    }
}
