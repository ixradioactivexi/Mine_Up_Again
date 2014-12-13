/*    */ public enum WorldProviderType
/*    */ {
/*  4 */   UNDERWORLD(-1, ""), WORLD(0, "world"), OVERWORLD(1, "skylands"), FASTTRAVEL(2, "nether");
/*    */ 
/*    */   int dimension;
/*    */   String defValue;
/*    */ 
/*  9 */   private WorldProviderType(int dim, String value) { this.dimension = dim;
/* 10 */     this.defValue = value; }
/*    */ 
/*    */   public int getCode()
/*    */   {
/* 14 */     return this.dimension;
/*    */   }
/*    */ 
/*    */   public String defValue() {
/* 18 */     return this.defValue;
/*    */   }
/*    */ 
/*    */   public static WorldProviderType[] specialWorlds() {
/* 22 */     return new WorldProviderType[] { UNDERWORLD, OVERWORLD };
/*    */   }
/*    */ 
/*    */   public static WorldProviderType byCode(int dim) {
/* 26 */     if (dim == 0)
/* 27 */       return WORLD;
/* 28 */     if (dim < 0)
/* 29 */       return UNDERWORLD;
/* 30 */     if (dim == 2) return FASTTRAVEL;
/* 31 */     return OVERWORLD;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     WorldProviderType
 * JD-Core Version:    0.6.2
 */