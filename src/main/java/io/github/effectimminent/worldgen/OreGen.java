package io.github.effectimminent.worldgen;

import java.util.Random;

import com.google.common.base.Predicate;
import io.github.effectimminent.OmamBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import javax.annotation.Nullable;

public class OreGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
                         IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case -1:
                this.runGenerator(amethystGenerator, world, random, chunkX, chunkZ, 68.0F, 10, 117);
                break;

            case 0:
                this.runGenerator(rubyGenerator, world, random, chunkX, chunkZ, 0.01F, 0, 255);
                this.runGenerator(topazGenerator, world, random, chunkX, chunkZ, 8.4F, 0, 255);
                this.runGenerator(zirconGenerator, world, random, chunkX, chunkZ, 0.5F, 0, 255);
                this.runGenerator(sapphireGenerator, world, random, chunkX, chunkZ, 0.1F, 0, 255);
                this.runGenerator(copperGenerator, world, random, chunkX, chunkZ, 40.0F, 0, 255);
                break;

            case 1:
                break;
        }
    }

    public WorldGenerator copperGenerator;
    public WorldGenerator rubyGenerator;
    public WorldGenerator topazGenerator;
    public WorldGenerator zirconGenerator;
    public WorldGenerator sapphireGenerator;
    public WorldGenerator amethystGenerator;


    public OreGen() {
         copperGenerator  = new WorldGenMinable(OmamBlocks.copper_ore.getDefaultState(), 10);
         rubyGenerator    = new WorldGenMinable(OmamBlocks.ruby_ore.getDefaultState(), 10);
         topazGenerator   = new WorldGenMinable(OmamBlocks.topaz_ore.getDefaultState(), 10);
         zirconGenerator  = new WorldGenMinable(OmamBlocks.zircon_ore.getDefaultState(), 10);
         sapphireGenerator= new WorldGenMinable(OmamBlocks.sapphire_ore.getDefaultState(), 10);
        amethystGenerator = new WorldGenMinable(OmamBlocks.amethyst_ore.getDefaultState(), 10, new Predicate<IBlockState>() {
            @Override
            public boolean apply(@Nullable IBlockState block) {
                return block == Blocks.netherrack;
            }
        });


    }

    public void runGenerator(WorldGenerator generator, World world,Random rand, int chunk_X, int chunk_Z, double d, int minHeight, int maxHeight) {
        if (generator ==amethystGenerator){
            System.out.println("Generator called");
        }
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < d; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));

        }
    }
}
