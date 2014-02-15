package mcextreme.vtweaks.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeVTweaks extends ItemPickaxe
{
    public ItemPickaxeVTweaks(int itemID, EnumToolMaterial toolMaterial)
    {
        super(itemID, toolMaterial);
    }
    
    public void addInformation(ItemStack stack, EntityPlayer player, List descriptionList, boolean b) 
    {
        descriptionList.add((stack.getMaxDamage() + 1 - stack.getItemDamage()) + " use" + (stack.getItemDamage() == stack.getMaxDamage() ? "" : "s") + " left");
    }
}
