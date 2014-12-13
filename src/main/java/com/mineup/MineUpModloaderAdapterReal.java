/*    */ import java.util.Map;
/*    */ 
/*    */ public class MineUpModloaderAdapterReal extends MineUpModloaderAdapter
/*    */ {
/*    */   public void populateChunk(bf ichunkprovider, int i, int j, rv world)
/*    */   {
/*  9 */     ModLoader.PopulateChunk(ichunkprovider, i, j, world);
/*    */   }
/*    */ 
/*    */   public void addAllRenderers(Map map)
/*    */   {
/* 14 */     ModLoader.AddAllRenderers(map);
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     MineUpModloaderAdapterReal
 * JD-Core Version:    0.6.2
 */