package mcextreme.magic.world;

import net.minecraft.util.ChunkCoordinates;

public class PortalPositionMagic extends ChunkCoordinates
{
    public long lastUpdateTime;
    
    final TeleporterMagic teleporterInstance;
    
    public PortalPositionMagic(TeleporterMagic teleporter, int x, int y, int z, long updateTime)
    {
        super(x, y, z);
        teleporterInstance = teleporter;
        lastUpdateTime = updateTime;
    }
}
