/*    */ import java.util.Collection;
/*    */ 
/*    */ public class ExtendedWorldProviderWithLayers extends ExtendedWorldProvider
/*    */ {
/*    */   public int getWorldMinY(rv world)
/*    */   {
/*  7 */     if ((world instanceof WorldWithLayers))
/*  8 */       return world.getWorldMinY();
/*  9 */     return this.next.getWorldMinY(world);
/*    */   }
/*    */ 
/*    */   public int getWorldMaxY(rv world) {
/* 13 */     if ((world instanceof WorldWithLayers))
/* 14 */       return world.getWorldMaxY();
/* 15 */     return this.next.getWorldMaxY(world);
/*    */   }
/*    */ 
/*    */   public acz getWorldProviderAt(rv world, int x, int y, int z) {
/* 19 */     if ((world instanceof WorldWithLayers))
/* 20 */       return ((WorldWithLayers)world).getLayer(y).y;
/* 21 */     return this.next.getWorldProviderAt(world, x, y, z);
/*    */   }
/*    */ 
/*    */   public Collection getEntityList(rv world) {
/* 25 */     return world.g;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ExtendedWorldProviderWithLayers
 * JD-Core Version:    0.6.2
 */