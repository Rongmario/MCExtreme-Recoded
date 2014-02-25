package mcextreme.core.utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs
{
	private ItemStack myIcon;
	
	public CreativeTab(String identifier)
	{
		super(identifier);
	}
	
	public ItemStack getIconItemStack()
	{
		return myIcon;
	}
	
	public CreativeTab setIconItemStack(ItemStack stack)
	{
		myIcon = stack;
		return this;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() 
	{
		return myIcon.getItem();
	}
}
