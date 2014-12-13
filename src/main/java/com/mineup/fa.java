/*     */ import java.util.Random;
/*     */ 
/*     */ public class fa
/*     */   implements bf
/*     */ {
/*     */   private Random j;
/*     */   private lh k;
/*     */   private lh l;
/*     */   private lh m;
/*     */   private lh n;
/*     */   private lh o;
/*     */   public lh a;
/*     */   public lh b;
/*     */   public lh c;
/*     */   private rv p;
/*     */   private double[] q;
/*     */   private double[] r;
/*     */   private double[] s;
/*     */   private double[] t;
/*     */   private sh u;
/*     */   private vh[] v;
/*     */   double[] d;
/*     */   double[] e;
/*     */   double[] f;
/*     */   double[] g;
/*     */   double[] h;
/*     */   int[][] i;
/*     */ 
/*     */   public fa(rv world, long l)
/*     */   {
/*  23 */     this.r = new double[256];
/*  24 */     this.s = new double[256];
/*  25 */     this.t = new double[256];
/*  26 */     this.u = new aad();
/*  27 */     this.i = new int[32][32];
/*  28 */     this.p = world;
/*  29 */     this.j = new Random(l);
/*  30 */     this.k = new lh(this.j, 16);
/*  31 */     this.l = new lh(this.j, 16);
/*  32 */     this.m = new lh(this.j, 8);
/*  33 */     this.n = new lh(this.j, 4);
/*  34 */     this.o = new lh(this.j, 4);
/*  35 */     this.a = new lh(this.j, 10);
/*  36 */     this.b = new lh(this.j, 16);
/*  37 */     this.c = new lh(this.j, 8);
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, byte[] abyte0, vh[] abiomegenbase)
/*     */   {
/*  42 */     byte byte0 = 2;
/*  43 */     int k = byte0 + 1;
/*  44 */     this.p.getClass();
/*  45 */     int l = 33;
/*  46 */     int i1 = byte0 + 1;
/*  47 */     this.q = a(this.q, i * byte0, 0, j * byte0, k, l, i1);
/*     */ 
/*  49 */     for (int j1 = 0; j1 < byte0; j1++)
/*     */     {
/*  51 */       int k1 = 0;
/*     */ 
/*  56 */       while (k1 < byte0)
/*     */       {
/*  60 */         int l1 = 0;
/*     */         while (true)
/*     */         {
/*  63 */           this.p.getClass();
/*  64 */           if (l1 >= 32)
/*     */           {
/*     */             break;
/*     */           }
/*  68 */           double d = 0.25D;
/*  69 */           double d1 = this.q[(((j1 + 0) * i1 + (k1 + 0)) * l + (l1 + 0))];
/*  70 */           double d2 = this.q[(((j1 + 0) * i1 + (k1 + 1)) * l + (l1 + 0))];
/*  71 */           double d3 = this.q[(((j1 + 1) * i1 + (k1 + 0)) * l + (l1 + 0))];
/*  72 */           double d4 = this.q[(((j1 + 1) * i1 + (k1 + 1)) * l + (l1 + 0))];
/*  73 */           double d5 = (this.q[(((j1 + 0) * i1 + (k1 + 0)) * l + (l1 + 1))] - d1) * d;
/*  74 */           double d6 = (this.q[(((j1 + 0) * i1 + (k1 + 1)) * l + (l1 + 1))] - d2) * d;
/*  75 */           double d7 = (this.q[(((j1 + 1) * i1 + (k1 + 0)) * l + (l1 + 1))] - d3) * d;
/*  76 */           double d8 = (this.q[(((j1 + 1) * i1 + (k1 + 1)) * l + (l1 + 1))] - d4) * d;
/*  77 */           for (int i2 = 0; i2 < 4; i2++)
/*     */           {
/*  79 */             double d9 = 0.125D;
/*  80 */             double d10 = d1;
/*  81 */             double d11 = d2;
/*  82 */             double d12 = (d3 - d1) * d9;
/*  83 */             double d13 = (d4 - d2) * d9;
/*  84 */             for (int j2 = 0; j2 < 8; j2++)
/*     */             {
/*  86 */               this.p.getClass();
/*  87 */               this.p.getClass();
/*  88 */               int k2 = j2 + j1 * 8 << 11 | 0 + k1 * 8 << 7 | l1 * 4 + i2;
/*  89 */               this.p.getClass();
/*  90 */               int l2 = 128;
/*  91 */               double d14 = 0.125D;
/*  92 */               double d15 = d10;
/*  93 */               double d16 = (d11 - d10) * d14;
/*  94 */               for (int i3 = 0; i3 < 8; i3++)
/*     */               {
/*  96 */                 int j3 = 0;
/*  97 */                 if (d15 > 0.0D)
/*     */                 {
/*  99 */                   j3 = lr.u.bA;
/*     */                 }
/* 101 */                 abyte0[k2] = ((byte)j3);
/* 102 */                 k2 += l2;
/* 103 */                 d15 += d16;
/*     */               }
/*     */ 
/* 106 */               d10 += d12;
/* 107 */               d11 += d13;
/*     */             }
/*     */ 
/* 110 */             d1 += d5;
/* 111 */             d2 += d6;
/* 112 */             d3 += d7;
/* 113 */             d4 += d8;
/*     */           }
/*     */ 
/* 116 */           l1++;
/*     */         }
/*     */ 
/* 119 */         k1++;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void b(int i, int j, byte[] abyte0, vh[] abiomegenbase)
/*     */   {
/* 127 */     double d = 0.03125D;
/* 128 */     this.r = this.n.a(this.r, i * 16, j * 16, 0, 16, 16, 1, d, d, 1.0D);
/* 129 */     this.s = this.n.a(this.s, i * 16, 109, j * 16, 16, 1, 16, d, 1.0D, d);
/* 130 */     this.t = this.o.a(this.t, i * 16, j * 16, 0, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
/* 131 */     for (int k = 0; k < 16; k++)
/*     */     {
/* 133 */       for (int l = 0; l < 16; l++)
/*     */       {
/* 135 */         vh biomegenbase = abiomegenbase[(k + l * 16)];
/* 136 */         int i1 = (int)(this.t[(k + l * 16)] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);
/* 137 */         int j1 = -1;
/* 138 */         byte byte0 = biomegenbase.n;
/* 139 */         byte byte1 = biomegenbase.o;
/* 140 */         this.p.getClass();
/* 141 */         for (int k1 = 127; k1 >= 0; k1--)
/*     */         {
/* 143 */           this.p.getClass();
/* 144 */           int l1 = (l * 16 + k) * 128 + k1;
/* 145 */           byte byte2 = abyte0[l1];
/* 146 */           if (byte2 == 0)
/*     */           {
/* 148 */             j1 = -1;
/*     */           }
/* 151 */           else if (byte2 == lr.u.bA)
/*     */           {
/* 155 */             if (j1 == -1)
/*     */             {
/* 157 */               if (i1 <= 0)
/*     */               {
/* 159 */                 byte0 = 0;
/* 160 */                 byte1 = (byte)lr.u.bA;
/*     */               }
/* 162 */               j1 = i1;
/* 163 */               if (k1 >= 0)
/*     */               {
/* 165 */                 abyte0[l1] = byte0;
/*     */               }
/*     */               else {
/* 168 */                 abyte0[l1] = byte1;
/*     */               }
/*     */ 
/*     */             }
/* 172 */             else if (j1 > 0)
/*     */             {
/* 176 */               j1--;
/* 177 */               abyte0[l1] = byte1;
/* 178 */               if ((j1 == 0) && (byte1 == lr.F.bA))
/*     */               {
/* 180 */                 j1 = this.j.nextInt(4);
/* 181 */                 byte1 = (byte)lr.R.bA;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public vy c(int i, int j)
/*     */   {
/* 193 */     return b(i, j);
/*     */   }
/*     */ 
/*     */   public vy b(int i, int j)
/*     */   {
/* 198 */     this.j.setSeed(i * 341873128712L + j * 132897987541L);
/* 199 */     this.p.getClass();
/* 200 */     byte[] abyte0 = new byte[32768];
/* 201 */     vy chunk = new vy(this.p, abyte0, i, j);
/* 202 */     this.v = this.p.a().a(this.v, i * 16, j * 16, 16, 16);
/* 203 */     a(i, j, abyte0, this.v);
/* 204 */     b(i, j, abyte0, this.v);
/* 205 */     this.u.a(this, this.p, i, j, abyte0);
/* 206 */     chunk.c();
/* 207 */     return chunk;
/*     */   }
/*     */ 
/*     */   private double[] a(double[] ad, int i, int j, int k, int l, int i1, int j1)
/*     */   {
/* 212 */     if (ad == null)
/*     */     {
/* 214 */       ad = new double[l * i1 * j1];
/*     */     }
/* 216 */     double d = 684.41200000000003D;
/* 217 */     double d1 = 684.41200000000003D;
/* 218 */     this.g = this.a.a(this.g, i, k, l, j1, 1.121D, 1.121D, 0.5D);
/* 219 */     this.h = this.b.a(this.h, i, k, l, j1, 200.0D, 200.0D, 0.5D);
/* 220 */     d *= 2.0D;
/* 221 */     this.d = this.m.a(this.d, i, j, k, l, i1, j1, d / 80.0D, d1 / 160.0D, d / 80.0D);
/* 222 */     this.e = this.k.a(this.e, i, j, k, l, i1, j1, d, d1, d);
/* 223 */     this.f = this.l.a(this.f, i, j, k, l, i1, j1, d, d1, d);
/* 224 */     int k1 = 0;
/* 225 */     int l1 = 0;
/* 226 */     for (int i2 = 0; i2 < l; i2++)
/*     */     {
/* 228 */       for (int j2 = 0; j2 < j1; j2++)
/*     */       {
/* 230 */         double d2 = (this.g[l1] + 256.0D) / 512.0D;
/* 231 */         if (d2 > 1.0D)
/*     */         {
/* 233 */           d2 = 1.0D;
/*     */         }
/* 235 */         double d3 = this.h[l1] / 8000.0D;
/* 236 */         if (d3 < 0.0D)
/*     */         {
/* 238 */           d3 = -d3 * 0.3D;
/*     */         }
/* 240 */         d3 = d3 * 3.0D - 2.0D;
/* 241 */         if (d3 > 1.0D)
/*     */         {
/* 243 */           d3 = 1.0D;
/*     */         }
/* 245 */         d3 /= 8.0D;
/* 246 */         d3 = 0.0D;
/* 247 */         if (d2 < 0.0D)
/*     */         {
/* 249 */           d2 = 0.0D;
/*     */         }
/* 251 */         d2 += 0.5D;
/* 252 */         d3 = d3 * i1 / 16.0D;
/* 253 */         l1++;
/* 254 */         double d4 = i1 / 2.0D;
/* 255 */         for (int k2 = 0; k2 < i1; k2++)
/*     */         {
/* 257 */           double d5 = 0.0D;
/* 258 */           double d6 = (k2 - d4) * 8.0D / d2;
/* 259 */           if (d6 < 0.0D)
/*     */           {
/* 261 */             d6 *= -1.0D;
/*     */           }
/* 263 */           double d7 = this.e[k1] / 512.0D;
/* 264 */           double d8 = this.f[k1] / 512.0D;
/* 265 */           double d9 = (this.d[k1] / 10.0D + 1.0D) / 2.0D;
/* 266 */           if (d9 < 0.0D)
/*     */           {
/* 268 */             d5 = d7;
/*     */           }
/* 270 */           else if (d9 > 1.0D)
/*     */           {
/* 272 */             d5 = d8;
/*     */           }
/*     */           else {
/* 275 */             d5 = d7 + (d8 - d7) * d9;
/*     */           }
/* 277 */           d5 -= 8.0D;
/* 278 */           int l2 = 32;
/* 279 */           if (k2 > i1 - l2)
/*     */           {
/* 281 */             double d10 = (k2 - (i1 - l2)) / (l2 - 1.0F);
/* 282 */             d5 = d5 * (1.0D - d10) + -30.0D * d10;
/*     */           }
/* 284 */           l2 = 8;
/* 285 */           if (k2 < l2)
/*     */           {
/* 287 */             double d11 = (l2 - k2) / (l2 - 1.0F);
/* 288 */             d5 = d5 * (1.0D - d11) + -30.0D * d11;
/*     */           }
/* 290 */           ad[k1] = d5;
/* 291 */           k1++;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 298 */     return ad;
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j)
/*     */   {
/* 303 */     return true;
/*     */   }
/*     */ 
/*     */   public void a(bf ichunkprovider, int i, int j)
/*     */   {
/* 308 */     st.a = true;
/* 309 */     int k = i * 16;
/* 310 */     int l = j * 16;
/* 311 */     vh biomegenbase = this.p.a().a(k + 16, l + 16);
/* 312 */     this.j.setSeed(this.p.s());
/* 313 */     long l1 = this.j.nextLong() / 2L * 2L + 1L;
/* 314 */     long l2 = this.j.nextLong() / 2L * 2L + 1L;
/* 315 */     this.j.setSeed(i * l1 + j * l2 ^ this.p.s());
/* 316 */     double d = 0.25D;
/* 317 */     if (this.j.nextInt(4) == 0)
/*     */     {
/* 319 */       int i1 = k + this.j.nextInt(16) + 8;
/* 320 */       this.p.getClass();
/* 321 */       int l4 = this.j.nextInt(128);
/* 322 */       int i8 = l + this.j.nextInt(16) + 8;
/* 323 */       new bu(lr.C.bA).a(this.p, this.j, i1, l4, i8);
/*     */     }
/* 325 */     if (this.j.nextInt(8) == 0)
/*     */     {
/* 327 */       int j1 = k + this.j.nextInt(16) + 8;
/* 328 */       this.p.getClass();
/* 329 */       int i5 = this.j.nextInt(this.j.nextInt(120) + 8);
/* 330 */       int j8 = l + this.j.nextInt(16) + 8;
/* 331 */       if ((i5 < 64) || (this.j.nextInt(10) == 0))
/*     */       {
/* 333 */         new bu(lr.E.bA).a(this.p, this.j, j1, i5, j8);
/*     */       }
/*     */     }
/* 336 */     for (int k1 = 0; k1 < 8; k1++)
/*     */     {
/* 338 */       int j5 = k + this.j.nextInt(16) + 8;
/* 339 */       this.p.getClass();
/* 340 */       int k8 = this.j.nextInt(128);
/* 341 */       int i13 = l + this.j.nextInt(16) + 8;
/* 342 */       new cq().a(this.p, this.j, j5, k8, i13);
/*     */     }
/*     */ 
/* 345 */     for (int i2 = 0; i2 < 10; i2++)
/*     */     {
/* 347 */       int k5 = k + this.j.nextInt(16);
/* 348 */       this.p.getClass();
/* 349 */       int l8 = this.j.nextInt(128);
/* 350 */       int j13 = l + this.j.nextInt(16);
/* 351 */       new ha(32).a(this.p, this.j, k5, l8, j13);
/*     */     }
/*     */ 
/* 354 */     for (int j2 = 0; j2 < 20; j2++)
/*     */     {
/* 356 */       int l5 = k + this.j.nextInt(16);
/* 357 */       this.p.getClass();
/* 358 */       int i9 = this.j.nextInt(128);
/* 359 */       int k13 = l + this.j.nextInt(16);
/* 360 */       new dc(lr.w.bA, 32).a(this.p, this.j, l5, i9, k13);
/*     */     }
/*     */ 
/* 372 */     for (int i3 = 0; i3 < 20; i3++)
/*     */     {
/* 374 */       int j6 = k + this.j.nextInt(16);
/* 375 */       this.p.getClass();
/* 376 */       int k9 = this.j.nextInt(128);
/* 377 */       int i14 = l + this.j.nextInt(16);
/* 378 */       new dc(lr.J.bA, 16).a(this.p, this.j, j6, k9, i14);
/*     */     }
/*     */ 
/* 381 */     for (int j3 = 0; j3 < 20; j3++)
/*     */     {
/* 383 */       int k6 = k + this.j.nextInt(16);
/* 384 */       this.p.getClass();
/* 385 */       int l9 = this.j.nextInt(64);
/* 386 */       int j14 = l + this.j.nextInt(16);
/* 387 */       new dc(lr.I.bA, 8).a(this.p, this.j, k6, l9, j14);
/*     */     }
/*     */ 
/* 390 */     for (int k3 = 0; k3 < 2; k3++)
/*     */     {
/* 392 */       int l6 = k + this.j.nextInt(16);
/* 393 */       this.p.getClass();
/* 394 */       int i10 = this.j.nextInt(32);
/* 395 */       int k14 = l + this.j.nextInt(16);
/* 396 */       new dc(lr.H.bA, 8).a(this.p, this.j, l6, i10, k14);
/*     */     }
/*     */ 
/* 399 */     for (int l3 = 0; l3 < 8; l3++)
/*     */     {
/* 401 */       int i7 = k + this.j.nextInt(16);
/* 402 */       this.p.getClass();
/* 403 */       int j10 = this.j.nextInt(16);
/* 404 */       int l14 = l + this.j.nextInt(16);
/* 405 */       new dc(lr.aO.bA, 7).a(this.p, this.j, i7, j10, l14);
/*     */     }
/*     */ 
/* 408 */     for (int i4 = 0; i4 < 1; i4++)
/*     */     {
/* 410 */       int j7 = k + this.j.nextInt(16);
/* 411 */       this.p.getClass();
/* 412 */       int k10 = this.j.nextInt(16);
/* 413 */       int i15 = l + this.j.nextInt(16);
/* 414 */       new dc(lr.ax.bA, 7).a(this.p, this.j, j7, k10, i15);
/*     */     }
/*     */ 
/* 417 */     for (int j4 = 0; j4 < 1; j4++)
/*     */     {
/* 419 */       int k7 = k + this.j.nextInt(16);
/* 420 */       this.p.getClass();
/* 421 */       this.p.getClass();
/* 422 */       int l10 = this.j.nextInt(16) + this.j.nextInt(16);
/* 423 */       int j15 = l + this.j.nextInt(16);
/* 424 */       new dc(lr.O.bA, 6).a(this.p, this.j, k7, l10, j15);
/*     */     }
/*     */ 
/* 427 */     d = 0.5D;
/* 428 */     int k4 = (int)((this.c.a(k * d, l * d) / 8.0D + this.j.nextDouble() * 4.0D + 4.0D) / 3.0D);
/* 429 */     int l7 = 0;
/* 430 */     if (this.j.nextInt(10) == 0)
/*     */     {
/* 432 */       l7++;
/*     */     }
/* 434 */     if (biomegenbase == vh.f)
/*     */     {
/* 436 */       l7 += k4 + 5;
/*     */     }
/* 438 */     if (biomegenbase == vh.d)
/*     */     {
/* 440 */       l7 -= 20;
/*     */     }
/* 442 */     if (biomegenbase == vh.c)
/*     */     {
/* 444 */       l7 -= 20;
/*     */     }
/* 446 */     for (int i11 = 0; i11 < l7; i11++)
/*     */     {
/* 448 */       int k15 = k + this.j.nextInt(16) + 8;
/* 449 */       int i18 = l + this.j.nextInt(16) + 8;
/* 450 */       ir worldgenerator = biomegenbase.a(this.j);
/* 451 */       worldgenerator.a(1.0D, 1.0D, 1.0D);
/* 452 */       worldgenerator.a(this.p, this.j, k15, this.p.d(k15, i18), i18);
/*     */     }
/*     */ 
/* 455 */     for (int j11 = 0; j11 < 2; j11++)
/*     */     {
/* 457 */       int l15 = k + this.j.nextInt(16) + 8;
/* 458 */       this.p.getClass();
/* 459 */       int j18 = this.j.nextInt(128);
/* 460 */       int k20 = l + this.j.nextInt(16) + 8;
/* 461 */       new pm(lr.ae.bA).a(this.p, this.j, l15, j18, k20);
/*     */     }
/*     */ 
/* 464 */     if (this.j.nextInt(2) == 0)
/*     */     {
/* 466 */       int k11 = k + this.j.nextInt(16) + 8;
/* 467 */       this.p.getClass();
/* 468 */       int i16 = this.j.nextInt(128);
/* 469 */       int k18 = l + this.j.nextInt(16) + 8;
/* 470 */       new pm(lr.af.bA).a(this.p, this.j, k11, i16, k18);
/*     */     }
/* 472 */     if (this.j.nextInt(4) == 0)
/*     */     {
/* 474 */       int l11 = k + this.j.nextInt(16) + 8;
/* 475 */       this.p.getClass();
/* 476 */       int j16 = this.j.nextInt(128);
/* 477 */       int l18 = l + this.j.nextInt(16) + 8;
/* 478 */       new pm(lr.ag.bA).a(this.p, this.j, l11, j16, l18);
/*     */     }
/* 480 */     if (this.j.nextInt(8) == 0)
/*     */     {
/* 482 */       int i12 = k + this.j.nextInt(16) + 8;
/* 483 */       this.p.getClass();
/* 484 */       int k16 = this.j.nextInt(128);
/* 485 */       int i19 = l + this.j.nextInt(16) + 8;
/* 486 */       new pm(lr.ah.bA).a(this.p, this.j, i12, k16, i19);
/*     */     }
/* 488 */     for (int j12 = 0; j12 < 10; j12++)
/*     */     {
/* 490 */       int l16 = k + this.j.nextInt(16) + 8;
/* 491 */       this.p.getClass();
/* 492 */       int j19 = this.j.nextInt(128);
/* 493 */       int l20 = l + this.j.nextInt(16) + 8;
/* 494 */       new ue().a(this.p, this.j, l16, j19, l20);
/*     */     }
/*     */ 
/* 497 */     if (this.j.nextInt(32) == 0)
/*     */     {
/* 499 */       int k12 = k + this.j.nextInt(16) + 8;
/* 500 */       this.p.getClass();
/* 501 */       int i17 = this.j.nextInt(128);
/* 502 */       int k19 = l + this.j.nextInt(16) + 8;
/* 503 */       new acs().a(this.p, this.j, k12, i17, k19);
/*     */     }
/* 505 */     int l12 = 0;
/* 506 */     if (biomegenbase == vh.d)
/*     */     {
/* 508 */       l12 += 10;
/*     */     }
/* 510 */     for (int j17 = 0; j17 < l12; j17++)
/*     */     {
/* 512 */       int l19 = k + this.j.nextInt(16) + 8;
/* 513 */       this.p.getClass();
/* 514 */       int i21 = this.j.nextInt(128);
/* 515 */       int l21 = l + this.j.nextInt(16) + 8;
/* 516 */       new sj().a(this.p, this.j, l19, i21, l21);
/*     */     }
/*     */ 
/* 537 */     st.a = false;
/*     */   }
/*     */ 
/*     */   public boolean a(boolean flag, ny iprogressupdate)
/*     */   {
/* 542 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/* 547 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b()
/*     */   {
/* 552 */     return true;
/*     */   }
/*     */ 
/*     */   public String c()
/*     */   {
/* 557 */     return "RandomLevelSource";
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     fa
 * JD-Core Version:    0.6.2
 */