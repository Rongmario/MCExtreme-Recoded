package mcextreme.tech.item;

import mcextreme.core.MCExtremeCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.ItemFluidContainer;

public class ItemConcreteBucket extends ItemFluidContainer
{

	public ItemConcreteBucket(int par1) 
	{
		super(par1);
		this.setCreativeTab(MCExtremeCore.tabTech);
		this.setContainerItem(Item.bucketEmpty);
	}
}
