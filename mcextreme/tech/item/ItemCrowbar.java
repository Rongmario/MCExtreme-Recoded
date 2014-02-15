package mcextreme.tech.item;

import mcextreme.core.MCExtremeCore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ItemCrowbar extends Item 
{

	public ItemCrowbar(int par1) {
		super(par1);
		setCreativeTab(MCExtremeCore.tabTech);
		setMaxStackSize(1);
		
	}

}
