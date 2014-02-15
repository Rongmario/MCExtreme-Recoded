package mcextreme.utilties.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBin extends Slot
{
    public String slotType;
    public TileEntityBin infuserTile;  
    
    public SlotBin(TileEntityBin infuserTile, int slotID, int x, int y, String slotType)
    {
        super(infuserTile, slotID, x, y);
        this.slotType = slotType;
        this.infuserTile = infuserTile;
    }
   
    public boolean isItemValid(ItemStack stack)
    {
        return slotType == "INPUT";
    }
}