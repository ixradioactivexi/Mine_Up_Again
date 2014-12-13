/*    */ import java.util.Comparator;
/*    */ 
/*    */ public class fe
/*    */   implements Comparator
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */ 
/*    */   public fe()
/*    */   {
/*    */   }
/*    */ 
/*    */   public fe(kj entity)
/*    */   {
/* 21 */     setEntity(entity);
/*    */   }
/*    */ 
/*    */   public void setEntity(kj entity)
/*    */   {
/* 26 */     this.a = (-entity.o);
/* 27 */     this.b = (-entity.p);
/* 28 */     this.c = (-entity.q);
/*    */   }
/*    */ 
/*    */   public int a(bv worldrenderer, bv worldrenderer1)
/*    */   {
/* 33 */     double d = worldrenderer.q + this.a;
/* 34 */     double d1 = worldrenderer.r + this.b;
/* 35 */     double d2 = worldrenderer.s + this.c;
/* 36 */     double d3 = worldrenderer1.q + this.a;
/* 37 */     double d4 = worldrenderer1.r + this.b;
/* 38 */     double d5 = worldrenderer1.s + this.c;
/* 39 */     return (int)((d * d + d1 * d1 + d2 * d2 - (d3 * d3 + d4 * d4 + d5 * d5)) * 1024.0D);
/*    */   }
/*    */ 
/*    */   public int compare(Object obj, Object obj1)
/*    */   {
/* 44 */     return a((bv)obj, (bv)obj1);
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     fe
 * JD-Core Version:    0.6.2
 */