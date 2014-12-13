/*    */ import java.util.List;
/*    */ 
/*    */ public class SpawnContext
/*    */ {
/*    */   int peacefulcounter;
/*    */   rv worldObj;
/*    */   int chunksInTick;
/*    */   List<oh> positionsToUpdate;
/*    */ 
/*    */   public int getChunksInTick()
/*    */   {
/* 13 */     return this.chunksInTick;
/*    */   }
/*    */ 
/*    */   public List<oh> getPositionsToUpdate()
/*    */   {
/* 18 */     return this.positionsToUpdate;
/*    */   }
/*    */ 
/*    */   public void setChunksInTick(int chunksInTick) {
/* 22 */     this.chunksInTick = chunksInTick;
/*    */   }
/*    */ 
/*    */   public SpawnContext(rv worldObj, int chunksInTick)
/*    */   {
/* 27 */     this.worldObj = worldObj;
/* 28 */     this.chunksInTick = chunksInTick;
/*    */   }
/*    */ 
/*    */   public void setPositionsToUpdate(List<oh> positionsToUpdate)
/*    */   {
/* 33 */     this.positionsToUpdate = positionsToUpdate;
/*    */   }
/*    */ 
/*    */   public rv getWorldObj() {
/* 37 */     return this.worldObj;
/*    */   }
/*    */ 
/*    */   public int getPeacefulcounter() {
/* 41 */     return this.peacefulcounter;
/*    */   }
/*    */ 
/*    */   public void incPeacefulCounter() {
/* 45 */     this.peacefulcounter += getSquare() / this.chunksInTick;
/*    */   }
/*    */ 
/*    */   public void incPeacefulCounter(int add) {
/* 49 */     this.peacefulcounter += add;
/*    */   }
/*    */ 
/*    */   public int getSquare() {
/* 53 */     if (this.positionsToUpdate != null)
/* 54 */       return Math.max(this.positionsToUpdate.size(), 1);
/* 55 */     return 1;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     SpawnContext
 * JD-Core Version:    0.6.2
 */