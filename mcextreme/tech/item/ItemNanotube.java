package mcextreme.tech.item;

import java.util.List;

import mcextreme.core.MCExtremeCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNanotube extends Item 
{

	public ItemNanotube(int par1) {
		super(par1);
		this.setCreativeTab(MCExtremeCore.tabTech);
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List descriptionList, boolean b) 
    {
		descriptionList.add("Don't drop me!");
    }
	
	//Kodehawa: There you are.
	
	public int getEntityLifespan(ItemStack itemStack, World world){
		return 0;
	}
}
