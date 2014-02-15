package mcextreme.tech.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityCompressor extends TileEntity 
{

	private String localizedName;
	
	public void setGuiDisplayName(String displayName) 
	{
		this.localizedName = displayName;
	}

}
