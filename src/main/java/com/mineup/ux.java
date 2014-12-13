/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ 
/*     */ public class ux extends lr
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */ 
/*     */   public ux(int i, int j, boolean flag)
/*     */   {
/*  20 */     super(i, j, wa.C);
/*  21 */     this.a = flag;
/*  22 */     a(h);
/*  23 */     c(0.5F);
/*     */   }
/*     */ 
/*     */   public int s()
/*     */   {
/*  28 */     return !this.a ? 107 : 106;
/*     */   }
/*     */ 
/*     */   public int a(int i, int j)
/*     */   {
/*  33 */     int k = d(j);
/*  34 */     if (k > 5)
/*     */     {
/*  36 */       return this.bz;
/*     */     }
/*  38 */     if (i == k)
/*     */     {
/*  40 */       if ((f(j)) || (this.bF > 0.0D) || (this.bG > 0.0D) || (this.bH > 0.0D) || (this.bI < 1.0D) || (this.bJ < 1.0D) || (this.bK < 1.0D))
/*     */       {
/*  42 */         return 110;
/*     */       }
/*     */ 
/*  45 */       return this.bz;
/*     */     }
/*     */ 
/*  48 */     return i != mz.a[k] ? 108 : 109;
/*     */   }
/*     */ 
/*     */   public int d()
/*     */   {
/*  53 */     return 16;
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b(rv world, int i, int j, int k, sz entityplayer)
/*     */   {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, wd entityliving)
/*     */   {
/*  68 */     int l = c(world, i, j, k, (sz)entityliving);
/*  69 */     world.f(i, j, k, l);
/*  70 */     if (!world.I)
/*     */     {
/*  72 */       h(world, i, j, k);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, int l)
/*     */   {
/*  78 */     if ((!world.I) && (!this.b))
/*     */     {
/*  80 */       h(world, i, j, k);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k)
/*     */   {
/*  86 */     if ((!world.I) && (world.b(i, j, k) == null))
/*     */     {
/*  88 */       h(world, i, j, k);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void h(rv world, int i, int j, int k)
/*     */   {
/*  94 */     int l = world.e(i, j, k);
/*  95 */     int i1 = d(l);
/*  96 */     boolean flag = f(world, i, j, k, i1);
/*  97 */     if (l == 7)
/*     */     {
/*  99 */       return;
/*     */     }
/* 101 */     if ((flag) && (!f(l)))
/*     */     {
/* 103 */       if (h(world, i, j, k, i1))
/*     */       {
/* 105 */         world.c(i, j, k, i1 | 0x8);
/* 106 */         world.e(i, j, k, 0, i1);
/*     */       }
/*     */     }
/* 109 */     else if ((!flag) && (f(l)))
/*     */     {
/* 111 */       world.c(i, j, k, i1);
/* 112 */       world.e(i, j, k, 1, i1);
/*     */     }
/*     */   }
/*     */ 
/*     */   private boolean f(rv world, int i, int j, int k, int l)
/*     */   {
/* 118 */     if ((l != 0) && (world.l(i, j - 1, k, 0)))
/*     */     {
/* 120 */       return true;
/*     */     }
/* 122 */     if ((l != 1) && (world.l(i, j + 1, k, 1)))
/*     */     {
/* 124 */       return true;
/*     */     }
/* 126 */     if ((l != 2) && (world.l(i, j, k - 1, 2)))
/*     */     {
/* 128 */       return true;
/*     */     }
/* 130 */     if ((l != 3) && (world.l(i, j, k + 1, 3)))
/*     */     {
/* 132 */       return true;
/*     */     }
/* 134 */     if ((l != 5) && (world.l(i + 1, j, k, 5)))
/*     */     {
/* 136 */       return true;
/*     */     }
/* 138 */     if ((l != 4) && (world.l(i - 1, j, k, 4)))
/*     */     {
/* 140 */       return true;
/*     */     }
/* 142 */     if (world.l(i, j, k, 0))
/*     */     {
/* 144 */       return true;
/*     */     }
/* 146 */     if (world.l(i, j + 2, k, 1))
/*     */     {
/* 148 */       return true;
/*     */     }
/* 150 */     if (world.l(i, j + 1, k - 1, 2))
/*     */     {
/* 152 */       return true;
/*     */     }
/* 154 */     if (world.l(i, j + 1, k + 1, 3))
/*     */     {
/* 156 */       return true;
/*     */     }
/* 158 */     if (world.l(i - 1, j + 1, k, 4))
/*     */     {
/* 160 */       return true;
/*     */     }
/* 162 */     return world.l(i + 1, j + 1, k, 5);
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, int l, int i1)
/*     */   {
/* 167 */     this.b = true;
/* 168 */     int j1 = i1;
/* 169 */     if (l == 0)
/*     */     {
/* 171 */       if (i(world, i, j, k, j1))
/*     */       {
/* 173 */         world.f(i, j, k, j1 | 0x8);
/* 174 */         world.a(i + 0.5D, j + 0.5D, k + 0.5D, "tile.piston.out", 0.5F, world.w.nextFloat() * 0.25F + 0.6F);
/*     */       }
/*     */     }
/* 177 */     else if (l == 1)
/*     */     {
/* 179 */       ij tileentity = world.b(i + mz.b[j1], j + mz.c[j1], k + mz.d[j1]);
/* 180 */       if ((tileentity != null) && ((tileentity instanceof lk)))
/*     */       {
/* 182 */         ((lk)tileentity).g();
/*     */       }
/* 184 */       world.b(i, j, k, lr.ad.bA, j1);
/* 185 */       world.a(i, j, k, lq.a(this.bA, j1, j1, false, true));
/* 186 */       if (this.a)
/*     */       {
/* 188 */         int k1 = i + mz.b[j1] * 2;
/* 189 */         int l1 = j + mz.c[j1] * 2;
/* 190 */         int i2 = k + mz.d[j1] * 2;
/* 191 */         int j2 = world.a(k1, l1, i2);
/* 192 */         int k2 = world.e(k1, l1, i2);
/* 193 */         boolean flag = false;
/* 194 */         if (j2 == lr.ad.bA)
/*     */         {
/* 196 */           ij tileentity1 = world.b(k1, l1, i2);
/* 197 */           if ((tileentity1 != null) && ((tileentity1 instanceof lk)))
/*     */           {
/* 199 */             lk tileentitypiston = (lk)tileentity1;
/* 200 */             if ((tileentitypiston.e() == j1) && (tileentitypiston.d()))
/*     */             {
/* 202 */               tileentitypiston.g();
/* 203 */               j2 = tileentitypiston.a();
/* 204 */               k2 = tileentitypiston.i();
/* 205 */               flag = true;
/*     */             }
/*     */           }
/*     */         }
/* 209 */         if ((!flag) && (j2 > 0) && (a(j2, world, k1, l1, i2, false)) && ((lr.m[j2].e() == 0) || (j2 == lr.aa.bA) || (j2 == lr.W.bA)))
/*     */         {
/* 211 */           this.b = false;
/* 212 */           world.g(k1, l1, i2, 0);
/* 213 */           this.b = true;
/* 214 */           i += mz.b[j1];
/* 215 */           j += mz.c[j1];
/* 216 */           k += mz.d[j1];
/* 217 */           world.b(i, j, k, lr.ad.bA, k2);
/* 218 */           world.a(i, j, k, lq.a(j2, k2, j1, false, false));
/*     */         }
/* 220 */         else if (!flag)
/*     */         {
/* 222 */           this.b = false;
/* 223 */           world.g(i + mz.b[j1], j + mz.c[j1], k + mz.d[j1], 0);
/* 224 */           this.b = true;
/*     */         }
/*     */       }
/*     */       else {
/* 228 */         this.b = false;
/* 229 */         world.g(i + mz.b[j1], j + mz.c[j1], k + mz.d[j1], 0);
/* 230 */         this.b = true;
/*     */       }
/* 232 */       world.a(i + 0.5D, j + 0.5D, k + 0.5D, "tile.piston.in", 0.5F, world.w.nextFloat() * 0.15F + 0.6F);
/*     */     }
/* 234 */     this.b = false;
/*     */   }
/*     */ 
/*     */   public void a(adg iblockaccess, int i, int j, int k)
/*     */   {
/* 239 */     int l = iblockaccess.e(i, j, k);
/* 240 */     if (f(l))
/*     */     {
/* 242 */       switch (d(l))
/*     */       {
/*     */       case 0:
/* 245 */         a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 246 */         break;
/*     */       case 1:
/* 249 */         a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/* 250 */         break;
/*     */       case 2:
/* 253 */         a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
/* 254 */         break;
/*     */       case 3:
/* 257 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
/* 258 */         break;
/*     */       case 4:
/* 261 */         a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 262 */         break;
/*     */       case 5:
/* 265 */         a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/* 270 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void h()
/*     */   {
/* 276 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, rp axisalignedbb, ArrayList arraylist)
/*     */   {
/* 281 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 282 */     super.a(world, i, j, k, axisalignedbb, arraylist);
/*     */   }
/*     */ 
/*     */   public boolean b()
/*     */   {
/* 287 */     return false;
/*     */   }
/*     */ 
/*     */   public static int d(int i)
/*     */   {
/* 292 */     return i & 0x7;
/*     */   }
/*     */ 
/*     */   public static boolean f(int i)
/*     */   {
/* 297 */     return (i & 0x8) != 0;
/*     */   }
/*     */ 
/*     */   private static int c(rv world, int i, int j, int k, sz entityplayer)
/*     */   {
/* 302 */     if ((et.e((float)entityplayer.o - i) < 2.0F) && (et.e((float)entityplayer.q - k) < 2.0F))
/*     */     {
/* 304 */       double d = entityplayer.p + 1.82D - entityplayer.H;
/* 305 */       if (d - j > 2.0D)
/*     */       {
/* 307 */         return 1;
/*     */       }
/* 309 */       if (j - d > 0.0D)
/*     */       {
/* 311 */         return 0;
/*     */       }
/*     */     }
/* 314 */     int l = et.b(entityplayer.u * 4.0F / 360.0F + 0.5D) & 0x3;
/* 315 */     if (l == 0)
/*     */     {
/* 317 */       return 2;
/*     */     }
/* 319 */     if (l == 1)
/*     */     {
/* 321 */       return 5;
/*     */     }
/* 323 */     if (l == 2)
/*     */     {
/* 325 */       return 3;
/*     */     }
/* 327 */     return l != 3 ? 0 : 4;
/*     */   }
/*     */ 
/*     */   private static boolean a(int i, rv world, int j, int k, int l, boolean flag)
/*     */   {
/* 332 */     if (i == lr.aq.bA)
/*     */     {
/* 334 */       return false;
/*     */     }
/* 336 */     if ((i == lr.aa.bA) || (i == lr.W.bA))
/*     */     {
/* 338 */       if (f(world.e(j, k, l)))
/*     */       {
/* 340 */         return false;
/*     */       }
/*     */     }
/*     */     else {
/* 344 */       if (lr.m[i].n() == -1.0F)
/*     */       {
/* 346 */         return false;
/*     */       }
/* 348 */       if (lr.m[i].e() == 2)
/*     */       {
/* 350 */         return false;
/*     */       }
/* 352 */       if ((!flag) && (lr.m[i].e() == 1))
/*     */       {
/* 354 */         return false;
/*     */       }
/*     */     }
/* 357 */     ij tileentity = world.b(j, k, l);
/* 358 */     return tileentity == null;
/*     */   }
/*     */ 
/*     */   private static boolean h(rv world, int i, int j, int k, int l)
/*     */   {
/* 363 */     int i1 = i + mz.b[l];
/* 364 */     int j1 = j + mz.c[l];
/* 365 */     int k1 = k + mz.d[l];
/* 366 */     int l1 = 0;
/*     */ 
/* 372 */     while (l1 < 13)
/*     */     {
/* 376 */       if (j1 > ExtendedWorldProvider.get().getWorldMinY(world))
/*     */       {
/* 378 */         world.getClass();
/* 379 */         if (j1 < ExtendedWorldProvider.get().getWorldMaxY(world) - 1);
/*     */       }
/*     */       else
/*     */       {
/* 384 */         return false;
/*     */       }
/* 386 */       int i2 = world.a(i1, j1, k1);
/* 387 */       if (i2 == 0)
/*     */       {
/*     */         break;
/*     */       }
/* 391 */       if (!a(i2, world, i1, j1, k1, true))
/*     */       {
/* 393 */         return false;
/*     */       }
/* 395 */       if (lr.m[i2].e() == 1)
/*     */       {
/*     */         break;
/*     */       }
/* 399 */       if (l1 == 12)
/*     */       {
/* 401 */         return false;
/*     */       }
/* 403 */       i1 += mz.b[l];
/* 404 */       j1 += mz.c[l];
/* 405 */       k1 += mz.d[l];
/* 406 */       l1++;
/*     */     }
/* 408 */     return true;
/*     */   }
/*     */ 
/*     */   private boolean i(rv world, int i, int j, int k, int l)
/*     */   {
/* 413 */     int i1 = i + mz.b[l];
/* 414 */     int j1 = j + mz.c[l];
/* 415 */     int k1 = k + mz.d[l];
/* 416 */     int l1 = 0;
/*     */ 
/* 422 */     while (l1 < 13)
/*     */     {
/* 426 */       if (j1 > ExtendedWorldProvider.get().getWorldMinY(world))
/*     */       {
/* 428 */         world.getClass();
/* 429 */         if (j1 < ExtendedWorldProvider.get().getWorldMaxY(world) - 1);
/*     */       }
/*     */       else
/*     */       {
/* 434 */         return false;
/*     */       }
/* 436 */       int j2 = world.a(i1, j1, k1);
/* 437 */       if (j2 == 0)
/*     */       {
/*     */         break;
/*     */       }
/* 441 */       if (!a(j2, world, i1, j1, k1, true))
/*     */       {
/* 443 */         return false;
/*     */       }
/* 445 */       if (lr.m[j2].e() == 1)
/*     */       {
/* 447 */         lr.m[j2].g(world, i1, j1, k1, world.e(i1, j1, k1));
/* 448 */         world.g(i1, j1, k1, 0);
/* 449 */         break;
/*     */       }
/* 451 */       if (l1 == 12)
/*     */       {
/* 453 */         return false;
/*     */       }
/* 455 */       i1 += mz.b[l];
/* 456 */       j1 += mz.c[l];
/* 457 */       k1 += mz.d[l];
/* 458 */       l1++;
/*     */     }
/*     */     int l2;
/* 461 */     for (; (i1 != i) || (j1 != j) || (k1 != k); k1 = l2)
/*     */     {
/* 463 */       int i2 = i1 - mz.b[l];
/* 464 */       int k2 = j1 - mz.c[l];
/* 465 */       l2 = k1 - mz.d[l];
/* 466 */       int i3 = world.a(i2, k2, l2);
/* 467 */       int j3 = world.e(i2, k2, l2);
/* 468 */       if ((i3 == this.bA) && (i2 == i) && (k2 == j) && (l2 == k))
/*     */       {
/* 470 */         world.b(i1, j1, k1, lr.ad.bA, l | (this.a ? 8 : 0));
/* 471 */         world.a(i1, j1, k1, lq.a(lr.ab.bA, l | (this.a ? 8 : 0), l, true, false));
/*     */       }
/*     */       else {
/* 474 */         world.b(i1, j1, k1, lr.ad.bA, j3);
/* 475 */         world.a(i1, j1, k1, lq.a(i3, j3, l, true, false));
/*     */       }
/* 477 */       i1 = i2;
/* 478 */       j1 = k2;
/*     */     }
/*     */ 
/* 481 */     return true;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ux
 * JD-Core Version:    0.6.2
 */