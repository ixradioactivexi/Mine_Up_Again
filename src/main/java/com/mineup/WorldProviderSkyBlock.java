/*    */ public class WorldProviderSkyBlock extends acz
/*    */ {
/*    */   public bf b()
/*    */   {
/* 21 */     return new ChunkProviderSkyBlock(this.a, this.a.s());
/*    */   }
/*    */ 
/*    */   public boolean a(int i, int j)
/*    */   {
/* 26 */     int k = this.a.a(i, j);
/* 27 */     if (k == lr.A.bA)
/*    */     {
/* 29 */       return false;
/*    */     }
/* 31 */     if (k == 0)
/*    */     {
/* 33 */       return false;
/*    */     }
/* 35 */     return lr.o[k];
/*    */   }
/*    */ 
/*    */   public boolean f()
/*    */   {
/* 40 */     return false;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     WorldProviderSkyBlock
 * JD-Core Version:    0.6.2
 */