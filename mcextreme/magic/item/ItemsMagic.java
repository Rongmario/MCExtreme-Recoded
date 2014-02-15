package mcextreme.magic.item;

import mcextreme.core.config.MCExtremeConfig;
import net.minecraft.item.Item;

public class ItemsMagic
{
    public static Item bucketDarkness;
    public static Item itemCrystal;
    
    public static void initItems()
    {
        itemCrystal = new ItemCrystalsMagic(MCExtremeConfig.itemCrystalID, "CRYSTAL").setUnlocalizedName("magicCrystal");
        bucketDarkness = new Item(MCExtremeConfig.itemDarkBucketID).setUnlocalizedName("darkBucket").setTextureName("mcextreme:magic/darkBucket");
    }
}
