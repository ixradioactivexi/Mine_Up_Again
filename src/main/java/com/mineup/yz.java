/*     */ import java.util.Random;
/*     */ 
/*     */ public class yz
/*     */   implements bf
/*     */ {
/*     */   private Random h;
/*     */   private lh i;
/*     */   private lh j;
/*     */   private lh k;
/*     */   private lh l;
/*     */   private lh m;
/*     */   public lh a;
/*     */   public lh b;
/*     */   private rv n;
/*     */   private double[] o;
/*     */   private double[] p;
/*     */   private double[] q;
/*     */   private double[] r;
/*     */   private sh s;
/*     */   double[] c;
/*     */   double[] d;
/*     */   double[] e;
/*     */   double[] f;
/*     */   double[] g;
/*     */ 
/*     */   public yz(rv world, long l)
/*     */   {
/*  21 */     this.p = new double[256];
/*  22 */     this.q = new double[256];
/*  23 */     this.r = new double[256];
/*  24 */     this.s = new yg();
/*  25 */     this.n = world;
/*  26 */     this.h = new Random(l);
/*  27 */     this.i = new lh(this.h, 16);
/*  28 */     this.j = new lh(this.h, 16);
/*  29 */     this.k = new lh(this.h, 8);
/*  30 */     this.l = new lh(this.h, 4);
/*  31 */     this.m = new lh(this.h, 4);
/*  32 */     this.a = new lh(this.h, 10);
/*  33 */     this.b = new lh(this.h, 16);
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, byte[] abyte0)
/*     */   {
/*  38 */     byte byte0 = 4;
/*  39 */     byte byte1 = 32;
/*  40 */     int k = byte0 + 1;
/*  41 */     this.n.getClass();
/*  42 */     int l = 17;
/*  43 */     int i1 = byte0 + 1;
/*  44 */     this.o = a(this.o, i * byte0, 0, j * byte0, k, l, i1);
/*     */ 
/*  46 */     for (int j1 = 0; j1 < byte0; j1++)
/*     */     {
/*  48 */       int k1 = 0;
/*     */ 
/*  53 */       while (k1 < byte0)
/*     */       {
/*  57 */         int l1 = 0;
/*     */         while (true)
/*     */         {
/*  60 */           this.n.getClass();
/*  61 */           if (l1 >= 16)
/*     */           {
/*     */             break;
/*     */           }
/*  65 */           double d = 0.125D;
/*  66 */           double d1 = this.o[(((j1 + 0) * i1 + (k1 + 0)) * l + (l1 + 0))];
/*  67 */           double d2 = this.o[(((j1 + 0) * i1 + (k1 + 1)) * l + (l1 + 0))];
/*  68 */           double d3 = this.o[(((j1 + 1) * i1 + (k1 + 0)) * l + (l1 + 0))];
/*  69 */           double d4 = this.o[(((j1 + 1) * i1 + (k1 + 1)) * l + (l1 + 0))];
/*  70 */           double d5 = (this.o[(((j1 + 0) * i1 + (k1 + 0)) * l + (l1 + 1))] - d1) * d;
/*  71 */           double d6 = (this.o[(((j1 + 0) * i1 + (k1 + 1)) * l + (l1 + 1))] - d2) * d;
/*  72 */           double d7 = (this.o[(((j1 + 1) * i1 + (k1 + 0)) * l + (l1 + 1))] - d3) * d;
/*  73 */           double d8 = (this.o[(((j1 + 1) * i1 + (k1 + 1)) * l + (l1 + 1))] - d4) * d;
/*  74 */           for (int i2 = 0; i2 < 8; i2++)
/*     */           {
/*  76 */             double d9 = 0.25D;
/*  77 */             double d10 = d1;
/*  78 */             double d11 = d2;
/*  79 */             double d12 = (d3 - d1) * d9;
/*  80 */             double d13 = (d4 - d2) * d9;
/*  81 */             for (int j2 = 0; j2 < 4; j2++)
/*     */             {
/*  83 */               this.n.getClass();
/*  84 */               this.n.getClass();
/*  85 */               int k2 = j2 + j1 * 4 << 11 | 0 + k1 * 4 << 7 | l1 * 8 + i2;
/*  86 */               this.n.getClass();
/*  87 */               int l2 = 128;
/*  88 */               double d14 = 0.25D;
/*  89 */               double d15 = d10;
/*  90 */               double d16 = (d11 - d10) * d14;
/*  91 */               for (int i3 = 0; i3 < 4; i3++)
/*     */               {
/*  93 */                 int j3 = 0;
/*  94 */                 if (l1 * 8 + i2 < byte1)
/*     */                 {
/*  96 */                   j3 = lr.E.bA;
/*     */                 }
/*  98 */                 if (d15 > 0.0D)
/*     */                 {
/* 100 */                   j3 = lr.bc.bA;
/*     */                 }
/* 102 */                 abyte0[k2] = ((byte)j3);
/* 103 */                 k2 += l2;
/* 104 */                 d15 += d16;
/*     */               }
/*     */ 
/* 107 */               d10 += d12;
/* 108 */               d11 += d13;
/*     */             }
/*     */ 
/* 111 */             d1 += d5;
/* 112 */             d2 += d6;
/* 113 */             d3 += d7;
/* 114 */             d4 += d8;
/*     */           }
/*     */ 
/* 117 */           l1++;
/*     */         }
/*     */ 
/* 120 */         k1++;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void b(int i, int j, byte[] abyte0)
/*     */   {
/* 128 */     this.n.getClass();
/* 129 */     int k = 64;
/* 130 */     double d = 0.03125D;
/* 131 */     this.p = this.l.a(this.p, i * 16, j * 16, 0, 16, 16, 1, d, d, 1.0D);
/* 132 */     this.q = this.l.a(this.q, i * 16, 109, j * 16, 16, 1, 16, d, 1.0D, d);
/* 133 */     this.r = this.m.a(this.r, i * 16, j * 16, 0, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
/* 134 */     for (int l = 0; l < 16; l++)
/*     */     {
/* 136 */       for (int i1 = 0; i1 < 16; i1++)
/*     */       {
/* 138 */         boolean flag = this.p[(l + i1 * 16)] + this.h.nextDouble() * 0.2D > 0.0D;
/* 139 */         boolean flag1 = this.q[(l + i1 * 16)] + this.h.nextDouble() * 0.2D > 0.0D;
/* 140 */         int j1 = (int)(this.r[(l + i1 * 16)] / 3.0D + 3.0D + this.h.nextDouble() * 0.25D);
/* 141 */         int k1 = -1;
/* 142 */         byte byte0 = (byte)lr.bc.bA;
/* 143 */         byte byte1 = (byte)lr.bc.bA;
/* 144 */         this.n.getClass();
/* 145 */         for (int l1 = 127; l1 >= 0; l1--)
/*     */         {
/* 147 */           this.n.getClass();
/* 148 */           int i2 = (i1 * 16 + l) * 128 + l1;
/* 149 */           this.n.getClass();
/* 150 */           if (l1 >= 127 - this.h.nextInt(5))
/*     */           {
/* 153 */             abyte0[i2] = ((byte)lr.aq.bA);
/*     */           }
/* 156 */           else if (l1 <= 0 + this.h.nextInt(5))
/*     */           {
/* 159 */             abyte0[i2] = ((byte)lr.aq.bA);
/*     */           }
/*     */           else {
/* 162 */             byte byte2 = abyte0[i2];
/* 163 */             if (byte2 == 0)
/*     */             {
/* 165 */               k1 = -1;
/*     */             }
/* 168 */             else if (byte2 == lr.bc.bA)
/*     */             {
/* 172 */               if (k1 == -1)
/*     */               {
/* 174 */                 if (j1 <= 0)
/*     */                 {
/* 176 */                   byte0 = 0;
/* 177 */                   byte1 = (byte)lr.bc.bA;
/*     */                 }
/* 179 */                 else if ((l1 >= k - 4) && (l1 <= k + 1))
/*     */                 {
/* 181 */                   byte0 = (byte)lr.bc.bA;
/* 182 */                   byte1 = (byte)lr.bc.bA;
/* 183 */                   if (flag1)
/*     */                   {
/* 185 */                     byte0 = (byte)lr.G.bA;
/*     */                   }
/* 187 */                   if (flag1)
/*     */                   {
/* 189 */                     byte1 = (byte)lr.bc.bA;
/*     */                   }
/* 191 */                   if (flag)
/*     */                   {
/* 193 */                     byte0 = (byte)lr.bd.bA;
/*     */                   }
/* 195 */                   if (flag)
/*     */                   {
/* 197 */                     byte1 = (byte)lr.bd.bA;
/*     */                   }
/*     */                 }
/* 200 */                 if ((l1 < k) && (byte0 == 0))
/*     */                 {
/* 202 */                   byte0 = (byte)lr.E.bA;
/*     */                 }
/* 204 */                 k1 = j1;
/* 205 */                 if (l1 >= k - 1)
/*     */                 {
/* 207 */                   abyte0[i2] = byte0;
/*     */                 }
/*     */                 else {
/* 210 */                   abyte0[i2] = byte1;
/*     */                 }
/*     */ 
/*     */               }
/* 214 */               else if (k1 > 0)
/*     */               {
/* 216 */                 k1--;
/* 217 */                 abyte0[i2] = byte1;
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
/* 229 */     return b(i, j);
/*     */   }
/*     */ 
/*     */   public vy b(int i, int j)
/*     */   {
/* 234 */     this.h.setSeed(i * 341873128712L + j * 132897987541L);
/* 235 */     this.n.getClass();
/* 236 */     byte[] abyte0 = new byte[32768];
/* 237 */     a(i, j, abyte0);
/* 238 */     b(i, j, abyte0);
/* 239 */     this.s.a(this, this.n, i, j, abyte0);
/* 240 */     vy chunk = new vy(this.n, abyte0, i, j);
/* 241 */     return chunk;
/*     */   }
/*     */ 
/*     */   private double[] a(double[] ad, int i, int j, int k, int l, int i1, int j1)
/*     */   {
/* 246 */     if (ad == null)
/*     */     {
/* 248 */       ad = new double[l * i1 * j1];
/*     */     }
/* 250 */     double d = 684.41200000000003D;
/* 251 */     double d1 = 2053.2359999999999D;
/* 252 */     this.f = this.a.a(this.f, i, j, k, l, 1, j1, 1.0D, 0.0D, 1.0D);
/* 253 */     this.g = this.b.a(this.g, i, j, k, l, 1, j1, 100.0D, 0.0D, 100.0D);
/* 254 */     this.c = this.k.a(this.c, i, j, k, l, i1, j1, d / 80.0D, d1 / 60.0D, d / 80.0D);
/* 255 */     this.d = this.i.a(this.d, i, j, k, l, i1, j1, d, d1, d);
/* 256 */     this.e = this.j.a(this.e, i, j, k, l, i1, j1, d, d1, d);
/* 257 */     int k1 = 0;
/* 258 */     int l1 = 0;
/* 259 */     double[] ad1 = new double[i1];
/* 260 */     for (int i2 = 0; i2 < i1; i2++)
/*     */     {
/* 262 */       ad1[i2] = (Math.cos(i2 * 3.141592653589793D * 6.0D / i1) * 2.0D);
/* 263 */       double d2 = i2;
/* 264 */       if (i2 > i1 / 2)
/*     */       {
/* 266 */         d2 = i1 - 1 - i2;
/*     */       }
/* 268 */       if (d2 < 4.0D)
/*     */       {
/* 270 */         d2 = 4.0D - d2;
/* 271 */         ad1[i2] -= d2 * d2 * d2 * 10.0D;
/*     */       }
/*     */     }
/*     */ 
/* 275 */     for (int j2 = 0; j2 < l; j2++)
/*     */     {
/* 277 */       for (int k2 = 0; k2 < j1; k2++)
/*     */       {
/* 279 */         double d3 = (this.f[l1] + 256.0D) / 512.0D;
/* 280 */         if (d3 > 1.0D)
/*     */         {
/* 282 */           d3 = 1.0D;
/*     */         }
/* 284 */         double d4 = 0.0D;
/* 285 */         double d5 = this.g[l1] / 8000.0D;
/* 286 */         if (d5 < 0.0D)
/*     */         {
/* 288 */           d5 = -d5;
/*     */         }
/* 290 */         d5 = d5 * 3.0D - 3.0D;
/* 291 */         if (d5 < 0.0D)
/*     */         {
/* 293 */           d5 /= 2.0D;
/* 294 */           if (d5 < -1.0D)
/*     */           {
/* 296 */             d5 = -1.0D;
/*     */           }
/* 298 */           d5 /= 1.4D;
/* 299 */           d5 /= 2.0D;
/* 300 */           d3 = 0.0D;
/*     */         }
/*     */         else {
/* 303 */           if (d5 > 1.0D)
/*     */           {
/* 305 */             d5 = 1.0D;
/*     */           }
/* 307 */           d5 /= 6.0D;
/*     */         }
/* 309 */         d3 += 0.5D;
/* 310 */         d5 = d5 * i1 / 16.0D;
/* 311 */         l1++;
/* 312 */         for (int l2 = 0; l2 < i1; l2++)
/*     */         {
/* 314 */           double d6 = 0.0D;
/* 315 */           double d7 = ad1[l2];
/* 316 */           double d8 = this.d[k1] / 512.0D;
/* 317 */           double d9 = this.e[k1] / 512.0D;
/* 318 */           double d10 = (this.c[k1] / 10.0D + 1.0D) / 2.0D;
/* 319 */           if (d10 < 0.0D)
/*     */           {
/* 321 */             d6 = d8;
/*     */           }
/* 323 */           else if (d10 > 1.0D)
/*     */           {
/* 325 */             d6 = d9;
/*     */           }
/*     */           else {
/* 328 */             d6 = d8 + (d9 - d8) * d10;
/*     */           }
/* 330 */           d6 -= d7;
/* 331 */           if (l2 > i1 - 4)
/*     */           {
/* 333 */             double d11 = (l2 - (i1 - 4)) / 3.0F;
/* 334 */             d6 = d6 * (1.0D - d11) + -10.0D * d11;
/*     */           }
/* 336 */           if (l2 < d4)
/*     */           {
/* 338 */             double d12 = (d4 - l2) / 4.0D;
/* 339 */             if (d12 < 0.0D)
/*     */             {
/* 341 */               d12 = 0.0D;
/*     */             }
/* 343 */             if (d12 > 1.0D)
/*     */             {
/* 345 */               d12 = 1.0D;
/*     */             }
/* 347 */             d6 = d6 * (1.0D - d12) + -10.0D * d12;
/*     */           }
/* 349 */           ad[k1] = d6;
/* 350 */           k1++;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 357 */     return ad;
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j)
/*     */   {
/* 362 */     return true;
/*     */   }
/*     */ 
/*     */   public void a(bf ichunkprovider, int i, int j)
/*     */   {
/* 367 */     st.a = true;
/* 368 */     int k = i * 16;
/* 369 */     int l = j * 16;
/* 370 */     for (int i1 = 0; i1 < 8; i1++)
/*     */     {
/* 372 */       int k1 = k + this.h.nextInt(16) + 8;
/* 373 */       this.n.getClass();
/* 374 */       int i3 = this.h.nextInt(120) + 4;
/* 375 */       int k4 = l + this.h.nextInt(16) + 8;
/* 376 */       new iz(lr.D.bA).a(this.n, this.h, k1, i3, k4);
/*     */     }
/*     */ 
/* 379 */     int j1 = this.h.nextInt(this.h.nextInt(10) + 1) + 1;
/* 380 */     for (int l1 = 0; l1 < j1; l1++)
/*     */     {
/* 382 */       int j3 = k + this.h.nextInt(16) + 8;
/* 383 */       this.n.getClass();
/* 384 */       int l4 = this.h.nextInt(120) + 4;
/* 385 */       int i6 = l + this.h.nextInt(16) + 8;
/* 386 */       new nt().a(this.n, this.h, j3, l4, i6);
/*     */     }
/*     */ 
/* 389 */     j1 = this.h.nextInt(this.h.nextInt(10) + 1);
/* 390 */     for (int i2 = 0; i2 < j1; i2++)
/*     */     {
/* 392 */       int k3 = k + this.h.nextInt(16) + 8;
/* 393 */       this.n.getClass();
/* 394 */       int i5 = this.h.nextInt(120) + 4;
/* 395 */       int j6 = l + this.h.nextInt(16) + 8;
/* 396 */       new dm().a(this.n, this.h, k3, i5, j6);
/*     */     }
/*     */ 
/* 399 */     for (int j2 = 0; j2 < 10; j2++)
/*     */     {
/* 401 */       int l3 = k + this.h.nextInt(16) + 8;
/* 402 */       this.n.getClass();
/* 403 */       int j5 = this.h.nextInt(128);
/* 404 */       int k6 = l + this.h.nextInt(16) + 8;
/* 405 */       new kf().a(this.n, this.h, l3, j5, k6);
/*     */     }
/*     */ 
/* 408 */     if (this.h.nextInt(1) == 0)
/*     */     {
/* 410 */       int k2 = k + this.h.nextInt(16) + 8;
/* 411 */       this.n.getClass();
/* 412 */       int i4 = this.h.nextInt(128);
/* 413 */       int k5 = l + this.h.nextInt(16) + 8;
/* 414 */       new pm(lr.ag.bA).a(this.n, this.h, k2, i4, k5);
/*     */     }
/* 416 */     if (this.h.nextInt(1) == 0)
/*     */     {
/* 418 */       int l2 = k + this.h.nextInt(16) + 8;
/* 419 */       this.n.getClass();
/* 420 */       int j4 = this.h.nextInt(128);
/* 421 */       int l5 = l + this.h.nextInt(16) + 8;
/* 422 */       new pm(lr.ah.bA).a(this.n, this.h, l2, j4, l5);
/*     */     }
/* 424 */     st.a = false;
/*     */   }
/*     */ 
/*     */   public boolean a(boolean flag, ny iprogressupdate)
/*     */   {
/* 429 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/* 434 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b()
/*     */   {
/* 439 */     return true;
/*     */   }
/*     */ 
/*     */   public String c()
/*     */   {
/* 444 */     return "HellRandomLevelSource";
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     yz
 * JD-Core Version:    0.6.2
 */