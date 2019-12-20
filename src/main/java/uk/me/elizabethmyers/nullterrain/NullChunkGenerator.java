package uk.me.elizabethmyers.nullterrain;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.World;

public class NullChunkGenerator extends ChunkGenerator {

    // set default spawn
    @Override
    public Location getFixedSpawnLocation(World world, Random random) {
        // Sane default --Elizabeth
        return new Location(world, 0, 64, 0);
    }

    // added new method
	@Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid Biome) {
        return createChunkData(world);
    }
}
