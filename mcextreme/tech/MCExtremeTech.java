package mcextreme.tech;

import java.io.File;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.CreativeTab;
import mcextreme.tech.block.BlocksTech;
import mcextreme.tech.item.ItemsTech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.liquids.LiquidContainerData;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeTech", name="MC-X Tech", version=MCExtremeTech.version, dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeTech
{
	
	public static final int guiIDCompressor = 0;
	public static final String version = "0.2.4";
	public static final String pluginName = "MCX Tech";
	
    @Instance("MCExtremeTech")
    public static MCExtremeTech instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabTech = new CreativeTab("mcx.tech");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = "MCExtremeCore";
 		
 		MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-tech.cfg")), "TECH");
 		
 		MinecraftForge.EVENT_BUS.register(new TechnicalEventHooks());
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {	
        BlocksTech.initBlocks();
        ItemsTech.initItems();
        CraftingTech.addRecipes();
        CraftingTech.addSmeltingRecipes();
        CraftingTech.registerInOreDict();
        EnumsTech.setHarvestLevels();
        
        ((CreativeTab)MCExtremeCore.tabTech).setIconItemStack(new ItemStack(BlocksTech.blockBreaker, 1, 0));
        
        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(BlocksTech.fluidConcrete.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(ItemsTech.itemConcreteBucket), new ItemStack(Item.bucketEmpty)));
    }
}