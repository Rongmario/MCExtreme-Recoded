package mcextreme.tech.item;

import java.util.List;

import mcextreme.core.MCExtremeCore;
import mcextreme.tech.MCExtremeTech;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemIngotsTech extends Item
{
	//GENERAL3214: Add Titanium, Tungsten, & Lead gravity
    public static String[] names = new String[] {"ingotAluminium", "ingotCopper", "ingotLead", "ingotNickel", "ingotPlatinum", "ingotSilver", "ingotTin", "ingotZinc", "ingotUranium", "ingotChromium", "ingotMercury", "ingotArsenic", "ingotAntimony", "ingotLithium", "ingotStrontium", "ingotIridium", "ingotTitanium", "ingotTungsten", "ingotDarkIron"};
    public Icon[] textures;
	public static String[] localizedNames = new String[] {"Aluminium Ingot", "Copper Ingot", "Lead Ingot", "Nickel Ingot", "Platinum Ingot", "Silver Ingot", "Tin Ingot", "Zinc Ingot", "Uranium Ingot", "Chromium Ingot", "Mercury Ingot", "Arsenic Ingot", "Antimony Ingot", "Lithium Ingot", "Strontium Ingot", "Iridium Ingot", "Titanium Ingot", "Tungsten Ingot", "Dark Iron"};
    
    public ItemIngotsTech(int itemID, String type)
    {
        super(itemID);
        this.setHasSubtypes(true);
        this.setCreativeTab(MCExtremeCore.tabTech);
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
    		this.textures[meta] = iconRegistry.registerIcon("mcextreme:tech/ingots/" + names[meta]);
    	}
    }
    
    public Icon getIconFromDamage(int meta)
    {
    	return meta < names.length ? textures[meta] : textures[0];
    }
    
    public String getUnlocalizedName(ItemStack stack)
    {
    	 if(stack.getItemDamage() <= names.length)
    		 
             return super.getUnlocalizedName() + "." + stack.getItemDamage();
    	 
         return "item.test";
    }

    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
    {
    	for (int meta = 0; meta < names.length; ++meta)
    	{
	    	if (par1ItemStack.getItemDamage() == meta)
	    	{
	    		//\u00a7 http://www.minecraftwiki.net/wiki/Classic_server_protocol#Color_Codes
	    		String[] periodic = new String[] {"13 Al", "29 Cu", "82 Pb", "28 Ni", "78 Pt", "47 Ag", "50 Sn", "30 Zn", "92 U", "24 Cr", "80 Hg", "33 As", "51 Sb", "3 Li", "38 Sr", "77 Ir", "22 Ti", "74 W", "Data missing"};
	    		
	    		par3List.add(periodic[meta]);
	    	}
	    	
	    	else
	    	{
	    		
	    	}
    	}
    }
}
