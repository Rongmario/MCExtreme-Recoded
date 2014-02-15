package mcextreme.tech.item;

import java.util.List;

import mcextreme.core.MCExtremeCore;
import mcextreme.tech.block.BlocksTech;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

public class ItemScrewdriver extends Item
{
    public boolean debug;
    
    public ItemScrewdriver(int itemID, boolean debugMode)
    {
        super(itemID);
        setMaxStackSize(1);
        if (debugMode) setMaxDamage(249);
        setTextureName("mcextreme:tech/tools/screwdriver");
        setCreativeTab(MCExtremeCore.tabTech);
        
        debug = debugMode;
    }
    
    public void addInformation(ItemStack stack, EntityPlayer player, List descriptionList, boolean b) 
    {
        if (!debug) descriptionList.add((250 - stack.getItemDamage()) + " use" + (stack.getItemDamage() == 249 ? "" : "s") + " left");
    }
    
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if (world.getBlockId(x, y, z) == 0) return false;
        
        if (debug) return scan(world, x, y, z, side, player, stack);
        else if (world.getBlockId(x, y, z) == BlocksTech.blockBreaker.blockID || world.getBlockId(x, y, z) == BlocksTech.blockPlacer.blockID)
        {
            int meta = world.getBlockMetadata(x, y, z);
            world.setBlockMetadataWithNotify(x, y, z, (meta % 6 == 5 ? meta - 5 : meta + 1), 3);
        }
        
        return false;
    }

    private boolean scan(World world, int x, int y, int z, int side, EntityPlayer player, ItemStack stack)
    {
        player.sendChatToPlayer(ChatMessageComponent.createFromText("BlockID: " + world.getBlockId(x, y, z) + " | Meta: " + world.getBlockMetadata(x, y, z)));
        return true;
    }
    
    public EnumRarity getRarity(ItemStack stack)
    {
        return debug ? EnumRarity.epic : EnumRarity.common;
    }
}
