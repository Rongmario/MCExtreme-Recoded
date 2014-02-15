package mcextreme.tech;

import mcextreme.magic.block.BlocksMagic;
import mcextreme.magic.item.ItemsMagic;
import mcextreme.tech.block.BlocksTech;
import mcextreme.tech.item.ItemsTech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class TechnicalEventHooks 
{
	@ForgeSubscribe
	public void onBucketFill(FillBucketEvent event)
	{

		ItemStack result = fillCustomBucket(event.world, event.target);

		if (result == null)
			return;

		event.result = result;
		event.setResult(Result.ALLOW);
	}

	public ItemStack fillCustomBucket(World world, MovingObjectPosition pos)
	{
		int blockID = world.getBlockId(pos.blockX, pos.blockY, pos.blockZ);

		if ((blockID == BlocksTech.blockLiquidConcrete.blockID || blockID == BlocksTech.blockRebar.blockID) && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0)
		{
			world.setBlock(pos.blockX, pos.blockY, pos.blockZ, 0);
			return new ItemStack(ItemsTech.itemConcreteBucket);
		}
		else
			return null;
	}
}
