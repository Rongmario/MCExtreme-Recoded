package mcextreme.tech.item;

import mcextreme.core.MCExtremeCore;
import net.minecraft.item.Item;

public class ItemWrench extends Item
{

	public ItemWrench(int par1) 
	{
		super(par1);
		setCreativeTab(MCExtremeCore.tabTech);
		setMaxStackSize(1);
	}

}
