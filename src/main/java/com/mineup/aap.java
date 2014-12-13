/*     */ import java.util.Random;
/*     */ 
/*     */ public class aap extends ms
/*     */ {
/*     */   protected aap(int i, int j)
/*     */   {
/*  18 */     super(i, j);
/*  19 */     float f = 0.2F;
/*  20 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*  21 */     a(true);
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, Random random)
/*     */   {
/*  26 */     if (random.nextInt(100) == 0)
/*     */     {
/*  28 */       byte byte0 = 4;
/*  29 */       int l = 5;
/*  30 */       for (int i1 = i - byte0; i1 <= i + byte0; i1++)
/*     */       {
/*  32 */         for (int k1 = k - byte0; k1 <= k + byte0; k1++)
/*     */         {
/*  34 */           for (int i2 = j - 1; i2 <= j + 1; i2++)
/*     */           {
/*  36 */             if (world.a(i1, i2, k1) == this.bA) { l--; if (l <= 0)
/*     */               {
/*  38 */                 return;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*  46 */       int j1 = i + random.nextInt(3) - 1;
/*  47 */       int l1 = j + random.nextInt(2) - random.nextInt(2);
/*  48 */       int j2 = k + random.nextInt(3) - 1;
/*  49 */       for (int k2 = 0; k2 < 4; k2++)
/*     */       {
/*  51 */         if ((world.i(j1, l1, j2)) && (g(world, j1, l1, j2)))
/*     */         {
/*  53 */           i = j1;
/*  54 */           j = l1;
/*  55 */           k = j2;
/*     */         }
/*  57 */         j1 = i + random.nextInt(3) - 1;
/*  58 */         l1 = j + random.nextInt(2) - random.nextInt(2);
/*  59 */         j2 = k + random.nextInt(3) - 1;
/*     */       }
/*     */ 
/*  62 */       if ((world.i(j1, l1, j2)) && (g(world, j1, l1, j2)))
/*     */       {
/*  64 */         world.g(j1, l1, j2, this.bA);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected boolean b_(int i)
/*     */   {
/*  71 */     return lr.o[i];
/*     */   }
/*     */ 
/*     */   public boolean g(rv world, int i, int j, int k)
/*     */   {
/*  78 */     if (j >= ExtendedWorldProvider.get().getWorldMinY(world))
/*     */     {
/*  80 */       world.getClass();
/*  81 */       if (j < ExtendedWorldProvider.get().getWorldMaxY(world));
/*     */     }
/*     */     else
/*     */     {
/*  86 */       return false;
/*     */     }
/*  88 */     return (world.m(i, j, k) < 13) && (b_(world.a(i, j - 1, k)));
/*     */   }
/*     */ 
/*     */   public boolean c(rv world, int i, int j, int k, Random random)
/*     */   {
/*  93 */     int l = world.a(i, j - 1, k);
/*  94 */     if ((l != lr.w.bA) && (l != lr.v.bA))
/*     */     {
/*  96 */       return false;
/*     */     }
/*  98 */     int i1 = world.e(i, j, k);
/*  99 */     world.d(i, j, k, 0);
/* 100 */     mu worldgenbigmushroom = null;
/* 101 */     if (this.bA == lr.ag.bA)
/*     */     {
/* 103 */       worldgenbigmushroom = new mu(0);
/*     */     }
/* 105 */     else if (this.bA == lr.ah.bA)
/*     */     {
/* 107 */       worldgenbigmushroom = new mu(1);
/*     */     }
/* 109 */     if ((worldgenbigmushroom == null) || (!worldgenbigmushroom.a(world, random, i, j, k)))
/*     */     {
/* 111 */       world.b(i, j, k, this.bA, i1);
/* 112 */       return false;
/*     */     }
/*     */ 
/* 115 */     return true;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     aap
 * JD-Core Version:    0.6.2
 */