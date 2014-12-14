package world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;

public class MineUpWorldChunkManager extends WorldChunkManager {
	private World world;
	private List biomesToSpawnIn;
	
	public MineUpWorldChunkManager(){
		biomesToSpawnIn = new ArrayList();
		biomesToSpawnIn.add(BiomeGenBase.plains);
	}
	
	public  MineUpWorldChunkManager(World world){
		this();
		this.world = world;
	}
	public List getBiomesToSpawnIn(){
		return biomesToSpawnIn;
	}
	public BiomeGenBase getBiomeGenAt(int x, int z){
		return BiomeGenBase.plains;
	}
	public boolean areBiomesViable(int par1, int par2, int par3, List par4List) {
		return true;
	    }
    public BlockPos findBiomePosition(int i, int j, int k, List list, Random random) {
    	return new BlockPos(0, 7, 0);
    }
    
}
