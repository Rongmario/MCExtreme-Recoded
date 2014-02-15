package mcextreme.tech.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTech extends ItemBlock
{
    public ItemBlockTech(int itemID)
    {
        super(itemID-256);
        setHasSubtypes(true);
    }
    
    public int getMetadata(int meta)
    {
        return meta;
    }
    
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName() + "." + stack.getItemDamage();
    }
}
