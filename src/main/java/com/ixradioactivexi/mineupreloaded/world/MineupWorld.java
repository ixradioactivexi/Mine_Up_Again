package world;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;

public class MineupWorld extends WorldType{

	public MineupWorld(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public WorldChunkManager getChunkManager(World world){
		return new MineUpWorldChunkManager(world);
		
	}
}
