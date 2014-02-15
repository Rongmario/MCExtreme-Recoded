package mcextreme.aesthetics;

import java.io.File;

import mcextreme.aesthetics.blocks.BlocksAesthetics;
import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.CreativeTab;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeAesthetics", name="MC-X Aesthetics", version=MCExtremeAesthetics.version, dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeAesthetics
{	
	
	public static final String version = "0.2.4";
	public static final String pluginName = "MCX Aesthetics";
	
    @Instance("MCExtremeAesthetics")
    public static MCExtremeAesthetics instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabAesthetics = new CreativeTab("mcx.aesthetics");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = "MCExtremeCore";
 		
 		MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-aesthetics.cfg")), "AESTHETICS");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	BlocksAesthetics.initBlocks();
    }
}
