/*    */ import java.util.Random;
/*    */ 
/*    */ public class st extends lr
/*    */ {
/* 85 */   public static boolean a = false;
/*    */ 
/*    */   public st(int i, int j)
/*    */   {
/* 18 */     super(i, j, wa.o);
/*    */   }
/*    */ 
/*    */   public void a(rv world, int i, int j, int k)
/*    */   {
/* 23 */     world.a(i, j, k, this.bA, f());
/*    */   }
/*    */ 
/*    */   public void a(rv world, int i, int j, int k, int l)
/*    */   {
/* 28 */     world.a(i, j, k, this.bA, f());
/*    */   }
/*    */ 
/*    */   public void a(rv world, int i, int j, int k, Random random)
/*    */   {
/* 33 */     i(world, i, j, k);
/*    */   }
/*    */ 
/*    */   private void i(rv world, int i, int j, int k)
/*    */   {
/* 38 */     int l = i;
/* 39 */     int i1 = j;
/* 40 */     int j1 = k;
/* 41 */     if ((h(world, l, i1 - 1, j1)) && (i1 >= ExtendedWorldProvider.get().getWorldMinY(world)))
/*    */     {
/* 43 */       byte byte0 = 32;
/* 44 */       if ((a) || (!world.b(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0)))
/*    */       {
/* 46 */         world.g(i, j, k, 0);
/* 47 */         int minY = ExtendedWorldProvider.get().getWorldMinY(world);
/* 48 */         while ((h(world, i, j - 1, k)) && (j > minY)) j--;
/*    */ 
/* 50 */         if (j > minY)
/* 51 */           world.g(i, j, k, this.bA);
/*    */       }
/*    */       else
/*    */       {
/* 55 */         va entityfallingsand = new va(world, i + 0.5F, j + 0.5F, k + 0.5F, this.bA);
/* 56 */         world.a(entityfallingsand);
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   public int f()
/*    */   {
/* 63 */     return 3;
/*    */   }
/*    */ 
/*    */   public static boolean h(rv world, int i, int j, int k)
/*    */   {
/* 68 */     int l = world.a(i, j, k);
/* 69 */     if (l == 0)
/*    */     {
/* 71 */       return true;
/*    */     }
/* 73 */     if (l == lr.as.bA)
/*    */     {
/* 75 */       return true;
/*    */     }
/* 77 */     wa material = lr.m[l].bN;
/* 78 */     if (material == wa.g)
/*    */     {
/* 80 */       return true;
/*    */     }
/* 82 */     return material == wa.h;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     st
 * JD-Core Version:    0.6.2
 */