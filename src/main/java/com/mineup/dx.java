/*    */ public final class dx
/*    */ {
/*    */   private WorldLayersInfo worldLayers;
/*    */   private final long a;
/*    */   private final int b;
/*    */   private final boolean c;
/*    */ 
/*    */   public dx(long l, int i, boolean flag)
/*    */   {
/* 10 */     this(l, i, flag, null);
/*    */   }
/*    */ 
/*    */   public dx(long l, int i, boolean flag, WorldLayersInfo info) {
/* 14 */     this.worldLayers = info;
/* 15 */     if (info == null) {
/* 16 */       this.worldLayers = new WorldLayersInfo();
/* 17 */       this.worldLayers.world.setRandomSeed(l);
/*    */     }
/* 19 */     this.worldLayers.world.setRandomSeed(l);
/*    */ 
/* 21 */     this.a = l;
/* 22 */     this.b = i;
/* 23 */     this.c = flag;
/*    */   }
/*    */ 
/*    */   public long a() {
/* 27 */     return this.a;
/*    */   }
/*    */ 
/*    */   public int b() {
/* 31 */     return this.b;
/*    */   }
/*    */ 
/*    */   public boolean c() {
/* 35 */     return this.c;
/*    */   }
/*    */ 
/*    */   public WorldLayersInfo getWorldLayers() {
/* 39 */     return this.worldLayers;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     dx
 * JD-Core Version:    0.6.2
 */