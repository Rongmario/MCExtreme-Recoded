package mcextreme.tech;

import java.util.Random;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenTech implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider c, IChunkProvider d)
    {
        int dimID = world.provider.dimensionId;
        
        if      (dimID == 0)   genSurface(world, random, chunkX * 16, chunkZ * 16);
        else if (dimID == -1)  genNether(world, random, chunkX * 16, chunkZ * 16);
        else if (dimID == 1)   genEnd(world, random, chunkX * 16, chunkZ * 16);
        else                   genOther(world, random, chunkX * 16, chunkZ * 16);
    }

    private void genSurface(World world, Random random, int chunkX, int chunkZ)
    {
        /*
        boolean chanceAluminium = new Random().nextInt(4)==0;
        boolean chanceIridium = new Random().nextInt(32)==0;
        
        for (int i = 0; i < Properties.oreVeinsPerChunkAluminium * 4; i++) {
            int randPosX = blockXPos + random.nextInt(16);
            int randPosY = 48 + random.nextInt(Properties.heightLimitOreAluminium - 48);
            int randPosZ = blockZPos + random.nextInt(16);
            if (chanceAluminium == true) {
                (new WorldGenMinable(MC_Extreme.oreAluminium.blockID, Properties.blocksPerVeinAluminium, Block.dirt.blockID))
                .generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
    
    for (int i = 0; i < Properties.oreVeinsPerChunkCopper; i++) {
        int randPosX = blockXPos + random.nextInt(16);
        int randPosY = random.nextInt(Properties.heightLimitOreCopper);
        int randPosZ = blockZPos + random.nextInt(16);
        (new WorldGenMinable(MC_Extreme.oreCopper.blockID, Properties.blocksPerVeinMetal))
        .generate(world, random, randPosX, randPosY, randPosZ);
    }
    
    for (int i = 0; i < Properties.oreVeinsPerChunkLead; i++) {
        int randPosX = blockXPos + random.nextInt(16);
        int randPosY = random.nextInt(Properties.heightLimitOreLead);
        int randPosZ = blockZPos + random.nextInt(16);
        (new WorldGenMinable(MC_Extreme.oreLead.blockID, Properties.blocksPerVeinMetal))
        .generate(world, random, randPosX, randPosY, randPosZ);
    }
    
    for (int i = 0; i < Properties.oreVeinsPerChunkNickel; i++) {
        int randPosX = blockXPos + random.nextInt(16);
        int randPosY = random.nextInt(Properties.heightLimitOreNickel);
        int randPosZ = blockZPos + random.nextInt(16);
        (new WorldGenMinable(MC_Extreme.oreNickel.blockID, Properties.blocksPerVeinMetal))
        .generate(world, random, randPosX, randPosY, randPosZ);
    }   
    
    for (int i = 0; i < Properties.oreVeinsPerChunkPlatinum; i++) {
        int randPosX = blockXPos + random.nextInt(16);
        int randPosY = random.nextInt(Properties.heightLimitOrePlatinum);
        int randPosZ = blockZPos + random.nextInt(16);
        (new WorldGenMinable(MC_Extreme.orePlatinum.blockID, Properties.blocksPerVeinMetal))
        .generate(world, random, randPosX, randPosY, randPosZ);
    }
                        
    for (int i = 0; i < Properties.oreVeinsPerChunkSilver; i++) {
        int randPosX = blockXPos + random.nextInt(16);
        int randPosY = random.nextInt(Properties.heightLimitOreSilver);
        int randPosZ = blockZPos + random.nextInt(16);
        (new WorldGenMinable(MC_Extreme.oreSilver.blockID, Properties.blocksPerVeinMetal))
        .generate(world, random, randPosX, randPosY, randPosZ);
    }
    
    for (int i = 0; i < Properties.oreVeinsPerChunkTin; i++) {
        int randPosX = blockXPos + random.nextInt(16);
        int randPosY = random.nextInt(Properties.heightLimitOreTin);
        int randPosZ = blockZPos + random.nextInt(16);
        (new WorldGenMinable(MC_Extreme.oreTin.blockID, Properties.blocksPerVeinMetal))
        .generate(world, random, randPosX, randPosY, randPosZ);
    }
    
    for (int i = 0; i < Properties.oreVeinsPerChunkZinc; i++) {
        int randPosX = blockXPos + random.nextInt(16);
        int randPosY = random.nextInt(Properties.heightLimitOreZinc);
        int randPosZ = blockZPos + random.nextInt(16);
        (new WorldGenMinable(MC_Extreme.oreZinc.blockID, Properties.blocksPerVeinMetal))
        .generate(world, random, randPosX, randPosY, randPosZ);
    }
         */
    }
    
    private void genNether(World world, Random random, int chunkX, int chunkZ)
    {
        
    }
    
    private void genEnd(World world, Random random, int chunkX, int chunkZ)
    {
        
    }
    
    private void genOther(World world, Random random, int chunkX, int chunkZ)
    {
        
    }
}
