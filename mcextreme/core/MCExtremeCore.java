package mcextreme.core;

import java.util.Arrays;

import mcextreme.core.utils.MCExtremeUtils;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="MCExtremeCore", name="Minecraft to the Extreme", version = MCExtremeCore.version)
public class MCExtremeCore
{
	@Instance("MCExtremeCore")
	public static MCExtremeCore instance;
	
	public static CreativeTabs tabAesthetics, tabMagic, tabTech, tabVanillaTweaks, tabUtilities; 
    
    public static final String version = "0.3.0", mcversion = "1.7.2";
    
    @EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
    	ModMetadata modMeta = event.getModMetadata();
    	modMeta.authorList = Arrays.asList(new String[] { "domi1819", "warlordjones", "Rongmario", "Frothin(g)y", "Kodehawa", "general3214", "HoopAWolf", "NukeDuck" });
 		modMeta.autogenerated = false;
 		modMeta.credits = "The MCX Modding Team";
 		modMeta.description = "Changes a lot of things in Minecraft to make it more interesting!";
 		modMeta.url = "https://github.com/EnderExtreme/MCExtreme";
 		modMeta.logoFile = "/assets/mcextreme/textures/gui/logo.png";
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event)
    {
    	MCExtremeUtils.printModInfo();
    }
}