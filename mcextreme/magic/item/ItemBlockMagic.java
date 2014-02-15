package mcextreme.magic.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMagic extends ItemBlock
{
    public ItemBlockMagic(int itemID)
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
