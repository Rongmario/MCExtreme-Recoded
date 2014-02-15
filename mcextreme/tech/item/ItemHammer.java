package mcextreme.tech.item;

import mcextreme.core.MCExtremeCore;
import net.minecraft.item.Item;

public class ItemHammer extends Item
{

	public ItemHammer(int par1) 
	{
		super(par1);
		setCreativeTab(MCExtremeCore.tabTech);
		setMaxStackSize(1);
	}

}
