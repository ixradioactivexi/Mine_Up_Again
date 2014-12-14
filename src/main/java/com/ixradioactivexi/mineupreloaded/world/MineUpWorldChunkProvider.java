package world;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

public class MineUpWorldChunkProvider implements IChunkProvider {
	private World world;
	private Random random;

	@Override
	public boolean chunkExists(int p_73149_1_, int p_73149_2_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Chunk provideChunk(int p_73154_1_, int p_73154_2_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chunk func_177459_a(BlockPos p_177459_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void populate(IChunkProvider p_73153_1_, int p_73153_2_,
			int p_73153_3_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean func_177460_a(IChunkProvider p_177460_1_, Chunk p_177460_2_,
			int p_177460_3_, int p_177460_4_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadQueuedChunks() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canSave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String makeString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List func_177458_a(EnumCreatureType p_177458_1_, BlockPos p_177458_2_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockPos func_180513_a(World worldIn, String p_180513_2_,
			BlockPos p_180513_3_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLoadedChunkCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void func_180514_a(Chunk p_180514_1_, int p_180514_2_,
			int p_180514_3_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveExtraData() {
		// TODO Auto-generated method stub
		
	}

}
