/*     */ import java.util.Random;
/*     */ 
/*     */ public class ln
/*     */ {
/*     */   private Random a;
/*     */ 
/*     */   public ln()
/*     */   {
/*  18 */     this.a = new Random();
/*     */   }
/*     */ 
/*     */   public void a(rv world, kj entity)
/*     */   {
/*  23 */     if (b(world, entity))
/*     */     {
/*  25 */       return;
/*     */     }
/*     */ 
/*  28 */     c(world, entity);
/*  29 */     b(world, entity);
/*     */   }
/*     */ 
/*     */   public boolean b(rv world, kj entity)
/*     */   {
/*  36 */     char c = '';
/*  37 */     double d = -1.0D;
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int l = et.b(entity.o);
/*  42 */     int i1 = et.b(entity.q);
/*  43 */     for (int j1 = l - c; j1 <= l + c; j1++)
/*     */     {
/*  45 */       double d1 = j1 + 0.5D - entity.o;
/*  46 */       for (int j2 = i1 - c; j2 <= i1 + c; j2++)
/*     */       {
/*  48 */         double d3 = j2 + 0.5D - entity.q;
/*  49 */         world.getClass();
/*  50 */         for (int k2 = world.getWorldMaxY() - 1; k2 >= world.getWorldMinY(); k2--)
/*     */         {
/*  52 */           if (world.a(j1, k2, j2) == lr.bf.bA)
/*     */           {
/*  56 */             while (world.a(j1, k2 - 1, j2) == lr.bf.bA) k2--;
/*  57 */             double d5 = k2 + 0.5D - entity.p;
/*  58 */             if ((world.parentWorld != null) && (entity.chunkLayer != null))
/*  59 */               d5 += entity.chunkLayer.shiftY;
/*  60 */             double d7 = d1 * d1 + d5 * d5 + d3 * d3;
/*  61 */             if ((d < 0.0D) || (d7 < d))
/*     */             {
/*  63 */               d = d7;
/*  64 */               i = j1;
/*  65 */               j = k2;
/*  66 */               k = j2;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  74 */     if (d >= 0.0D)
/*     */     {
/*  76 */       int k1 = i;
/*  77 */       int l1 = j;
/*  78 */       int i2 = k;
/*  79 */       double d2 = k1 + 0.5D;
/*  80 */       double d4 = l1 + 0.5D;
/*  81 */       double d6 = i2 + 0.5D;
/*  82 */       if (world.a(k1 - 1, l1, i2) == lr.bf.bA)
/*     */       {
/*  84 */         d2 -= 0.5D;
/*     */       }
/*  86 */       if (world.a(k1 + 1, l1, i2) == lr.bf.bA)
/*     */       {
/*  88 */         d2 += 0.5D;
/*     */       }
/*  90 */       if (world.a(k1, l1, i2 - 1) == lr.bf.bA)
/*     */       {
/*  92 */         d6 -= 0.5D;
/*     */       }
/*  94 */       if (world.a(k1, l1, i2 + 1) == lr.bf.bA)
/*     */       {
/*  96 */         d6 += 0.5D;
/*     */       }
/*  98 */       if (world.parentWorld != null)
/*  99 */         d4 += world.shiftY;
/* 100 */       entity.c(d2, d4, d6, entity.u, 0.0F);
/* 101 */       entity.r = (entity.s = entity.t = 0.0D);
/* 102 */       return true;
/*     */     }
/*     */ 
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean c(rv world, kj entity)
/*     */   {
/* 111 */     byte byte0 = 16;
/* 112 */     double d = -1.0D;
/* 113 */     int i = et.b(entity.o);
/* 114 */     int j = et.b(entity.p - entity.chunkLayer.shiftY);
/* 115 */     int k = et.b(entity.q);
/* 116 */     int l = i;
/* 117 */     int i1 = j;
/* 118 */     int j1 = k;
/* 119 */     int k1 = 0;
/* 120 */     int l1 = this.a.nextInt(4);
/* 121 */     for (int i2 = i - byte0; i2 <= i + byte0; i2++)
/*     */     {
/* 123 */       double d1 = i2 + 0.5D - entity.o;
/* 124 */       for (int j3 = k - byte0; j3 <= k + byte0; j3++)
/*     */       {
/* 126 */         double d3 = j3 + 0.5D - entity.q;
/* 127 */         world.getClass();
/* 128 */         label440: for (int k4 = world.getWorldMaxY() - 1; k4 >= world.getWorldMinY(); k4--)
/*     */         {
/* 130 */           if (world.i(i2, k4, j3))
/*     */           {
/* 134 */             while ((k4 > 0) && (world.i(i2, k4 - 1, j3))) k4--;
/*     */ 
/* 136 */             for (int k5 = l1; k5 < l1 + 4; k5++)
/*     */             {
/* 138 */               int l6 = k5 % 2;
/* 139 */               int i8 = 1 - l6;
/* 140 */               if (k5 % 4 >= 2)
/*     */               {
/* 142 */                 l6 = -l6;
/* 143 */                 i8 = -i8;
/*     */               }
/* 145 */               for (int j9 = 0; j9 < 3; j9++)
/*     */               {
/* 147 */                 for (int k10 = 0; k10 < 4; k10++)
/*     */                 {
/* 149 */                   for (int l11 = -1; l11 < 4; l11++)
/*     */                   {
/* 151 */                     int j12 = i2 + (k10 - 1) * l6 + j9 * i8;
/* 152 */                     int l12 = k4 + l11;
/* 153 */                     int j13 = j3 + (k10 - 1) * i8 - j9 * l6;
/* 154 */                     if (((l11 < 0) && (!world.f(j12, l12, j13).a())) || ((l11 >= 0) && (!world.i(j12, l12, j13))))
/*     */                     {
/*     */                       break label440;
/*     */                     }
/*     */                   }
/*     */ 
/*     */                 }
/*     */ 
/*     */               }
/*     */ 
/* 164 */               double d5 = k4 + 0.5D - entity.p;
/* 165 */               double d7 = d1 * d1 + d5 * d5 + d3 * d3;
/* 166 */               if ((d < 0.0D) || (d7 < d))
/*     */               {
/* 168 */                 d = d7;
/* 169 */                 l = i2;
/* 170 */                 i1 = k4;
/* 171 */                 j1 = j3;
/* 172 */                 k1 = k5 % 4;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 182 */     if (d < 0.0D)
/*     */     {
/* 184 */       for (int j2 = i - byte0; j2 <= i + byte0; j2++)
/*     */       {
/* 186 */         double d2 = j2 + 0.5D - entity.o;
/* 187 */         for (int k3 = k - byte0; k3 <= k + byte0; k3++)
/*     */         {
/* 189 */           double d4 = k3 + 0.5D - entity.q;
/* 190 */           world.getClass();
/* 191 */           label783: for (int l4 = 127; l4 >= 0; l4--)
/*     */           {
/* 193 */             if (world.i(j2, l4, k3))
/*     */             {
/* 197 */               while ((l4 > 0) && (world.i(j2, l4 - 1, k3))) l4--;
/*     */ 
/* 199 */               for (int l5 = l1; l5 < l1 + 2; l5++)
/*     */               {
/* 201 */                 int i7 = l5 % 2;
/* 202 */                 int j8 = 1 - i7;
/* 203 */                 for (int k9 = 0; k9 < 4; k9++)
/*     */                 {
/* 205 */                   for (int l10 = -1; l10 < 4; l10++)
/*     */                   {
/* 207 */                     int i12 = j2 + (k9 - 1) * i7;
/* 208 */                     int k12 = l4 + l10;
/* 209 */                     int i13 = k3 + (k9 - 1) * j8;
/* 210 */                     if (((l10 < 0) && (!world.f(i12, k12, i13).a())) || ((l10 >= 0) && (!world.i(i12, k12, i13))))
/*     */                     {
/*     */                       break label783;
/*     */                     }
/*     */                   }
/*     */ 
/*     */                 }
/*     */ 
/* 218 */                 double d6 = l4 + 0.5D - entity.p;
/* 219 */                 double d8 = d2 * d2 + d6 * d6 + d4 * d4;
/* 220 */                 if ((d < 0.0D) || (d8 < d))
/*     */                 {
/* 222 */                   d = d8;
/* 223 */                   l = j2;
/* 224 */                   i1 = l4;
/* 225 */                   j1 = k3;
/* 226 */                   k1 = l5 % 2;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 237 */     int k2 = k1;
/* 238 */     int l2 = l;
/* 239 */     int i3 = i1;
/* 240 */     int l3 = j1;
/* 241 */     int i4 = k2 % 2;
/* 242 */     int j4 = 1 - i4;
/* 243 */     if (k2 % 4 >= 2)
/*     */     {
/* 245 */       i4 = -i4;
/* 246 */       j4 = -j4;
/*     */     }
/* 248 */     if (d < 0.0D)
/*     */     {
/* 250 */       if (i1 < 70)
/*     */       {
/* 252 */         i1 = 70;
/*     */       }
/* 254 */       world.getClass();
/* 255 */       if (i1 > 118)
/*     */       {
/* 257 */         world.getClass();
/* 258 */         i1 = 118;
/*     */       }
/* 260 */       i3 = i1;
/* 261 */       for (int i5 = -1; i5 <= 1; i5++)
/*     */       {
/* 263 */         for (int i6 = 1; i6 < 3; i6++)
/*     */         {
/* 265 */           for (int j7 = -1; j7 < 3; j7++)
/*     */           {
/* 267 */             int k8 = l2 + (i6 - 1) * i4 + i5 * j4;
/* 268 */             int l9 = i3 + j7;
/* 269 */             int i11 = l3 + (i6 - 1) * j4 - i5 * i4;
/* 270 */             boolean flag = j7 < 0;
/* 271 */             world.g(k8, l9, i11, flag ? lr.aq.bA : 0);
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 279 */     for (int j5 = 0; j5 < 4; j5++)
/*     */     {
/* 281 */       world.t = true;
/* 282 */       for (int j6 = 0; j6 < 4; j6++)
/*     */       {
/* 284 */         for (int k7 = -1; k7 < 4; k7++)
/*     */         {
/* 286 */           int l8 = l2 + (j6 - 1) * i4;
/* 287 */           int i10 = i3 + k7;
/* 288 */           int j11 = l3 + (j6 - 1) * j4;
/* 289 */           boolean flag1 = (j6 == 0) || (j6 == 3) || (k7 == -1) || (k7 == 3);
/* 290 */           world.g(l8, i10, j11, flag1 ? lr.aq.bA : lr.bf.bA);
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 295 */       world.t = false;
/* 296 */       for (int k6 = 0; k6 < 4; k6++)
/*     */       {
/* 298 */         for (int l7 = -1; l7 < 4; l7++)
/*     */         {
/* 300 */           int i9 = l2 + (k6 - 1) * i4;
/* 301 */           int j10 = i3 + l7;
/* 302 */           int k11 = l3 + (k6 - 1) * j4;
/* 303 */           world.j(i9, j10, k11, world.a(i9, j10, k11));
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 310 */     return true;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ln
 * JD-Core Version:    0.6.2
 */