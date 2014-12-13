/*     */ import java.util.Random;
/*     */ 
/*     */ public class oc extends ir
/*     */ {
/*     */   public boolean a(rv world, Random random, int i, int j, int k)
/*     */   {
/*  26 */     int l = random.nextInt(3) + 4;
/*  27 */     boolean flag = true;
/*  28 */     if (j >= ExtendedWorldProvider.get().getWorldMinY(world))
/*     */     {
/*  30 */       world.getClass();
/*  31 */       if (j + l + 1 <= ExtendedWorldProvider.get().getWorldMaxY(world));
/*     */     }
/*     */     else
/*     */     {
/*  36 */       return false;
/*     */     }
/*     */ 
/*  40 */     for (int i1 = j; i1 <= j + 1 + l; i1++)
/*     */     {
/*  42 */       byte byte0 = 1;
/*  43 */       if (i1 == j)
/*     */       {
/*  45 */         byte0 = 0;
/*     */       }
/*  47 */       if (i1 >= j + 1 + l - 2)
/*     */       {
/*  49 */         byte0 = 2;
/*     */       }
/*  51 */       for (int i2 = i - byte0; (i2 <= i + byte0) && (flag); i2++)
/*     */       {
/*  53 */         for (int l2 = k - byte0; (l2 <= k + byte0) && (flag); l2++)
/*     */         {
/*  55 */           if (i1 >= 0)
/*     */           {
/*  57 */             world.getClass();
/*  58 */             if (i1 < 128)
/*     */             {
/*  60 */               int j3 = world.a(i2, i1, l2);
/*  61 */               if ((j3 == 0) || (j3 == lr.L.bA))
/*     */                 continue;
/*  63 */               flag = false; continue;
/*     */             }
/*     */ 
/*     */           }
/*     */ 
/*  68 */           flag = false;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  75 */     if (!flag)
/*     */     {
/*  77 */       return false;
/*     */     }
/*  79 */     int j1 = world.a(i, j - 1, k);
/*  80 */     if ((j1 == lr.v.bA) || (j1 == lr.w.bA))
/*     */     {
/*  82 */       world.getClass();
/*  83 */       if (j < 128 - l - 1);
/*     */     }
/*     */     else
/*     */     {
/*  88 */       return false;
/*     */     }
/*  90 */     world.d(i, j - 1, k, lr.w.bA);
/*  91 */     for (int k1 = j - 3 + l; k1 <= j + l; k1++)
/*     */     {
/*  93 */       int j2 = k1 - (j + l);
/*  94 */       int i3 = 1 - j2 / 2;
/*  95 */       for (int k3 = i - i3; k3 <= i + i3; k3++)
/*     */       {
/*  97 */         int l3 = k3 - i;
/*  98 */         for (int i4 = k - i3; i4 <= k + i3; i4++)
/*     */         {
/* 100 */           int j4 = i4 - k;
/* 101 */           if (((Math.abs(l3) != i3) || (Math.abs(j4) != i3) || ((random.nextInt(2) != 0) && (j2 != 0))) && (lr.o[world.a(k3, k1, i4)] == 0))
/*     */           {
/* 103 */             world.d(k3, k1, i4, lr.L.bA);
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 111 */     for (int l1 = 0; l1 < l; l1++)
/*     */     {
/* 113 */       int k2 = world.a(i, j + l1, k);
/* 114 */       if ((k2 == 0) || (k2 == lr.L.bA))
/*     */       {
/* 116 */         world.d(i, j + l1, k, lr.K.bA);
/*     */       }
/*     */     }
/*     */ 
/* 120 */     return true;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     oc
 * JD-Core Version:    0.6.2
 */