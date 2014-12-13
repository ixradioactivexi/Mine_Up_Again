/*     */ import java.util.Random;
/*     */ 
/*     */ public class adp
/*     */   implements bf
/*     */ {
/*     */   private Random n;
/*     */   private lh o;
/*     */   private lh p;
/*     */   private lh q;
/*     */   private lh r;
/*     */   public lh a;
/*     */   public lh b;
/*     */   public lh c;
/*     */   private rv s;
/*     */   private final boolean t;
/*     */   private double[] u;
/*     */   private double[] v;
/*     */   private sh w;
/*     */   public sd d;
/*     */   public af e;
/*     */   public adl f;
/*     */   private sh x;
/*     */   private vh[] y;
/*     */   double[] g;
/*     */   double[] h;
/*     */   double[] i;
/*     */   double[] j;
/*     */   double[] k;
/*     */   float[] l;
/*     */   int[][] m;
/*     */ 
/*     */   public adp(rv world, long l, boolean flag)
/*     */   {
/*  22 */     this.v = new double[256];
/*  23 */     this.w = new aad();
/*  24 */     this.d = new sd();
/*  25 */     this.e = new af();
/*  26 */     this.f = new adl();
/*  27 */     this.x = new nj();
/*  28 */     this.m = new int[32][32];
/*  29 */     this.s = world;
/*  30 */     this.t = flag;
/*  31 */     this.n = new Random(l);
/*  32 */     this.o = new lh(this.n, 16);
/*  33 */     this.p = new lh(this.n, 16);
/*  34 */     this.q = new lh(this.n, 8);
/*  35 */     this.r = new lh(this.n, 4);
/*  36 */     this.a = new lh(this.n, 10);
/*  37 */     this.b = new lh(this.n, 16);
/*  38 */     this.c = new lh(this.n, 8);
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, byte[] abyte0)
/*     */   {
/*  43 */     byte byte0 = 4;
/*  44 */     this.s.getClass();
/*  45 */     int k = 16;
/*  46 */     this.s.getClass();
/*  47 */     byte byte1 = 63;
/*  48 */     int l = byte0 + 1;
/*  49 */     this.s.getClass();
/*  50 */     int i1 = 17;
/*  51 */     int j1 = byte0 + 1;
/*  52 */     this.y = this.s.a().b(this.y, i * 4 - 2, j * 4 - 2, l + 5, j1 + 5);
/*  53 */     this.u = a(this.u, i * byte0, 0, j * byte0, l, i1, j1);
/*  54 */     for (int k1 = 0; k1 < byte0; k1++)
/*     */     {
/*  56 */       for (int l1 = 0; l1 < byte0; l1++)
/*     */       {
/*  58 */         for (int i2 = 0; i2 < k; i2++)
/*     */         {
/*  60 */           double d = 0.125D;
/*  61 */           double d1 = this.u[(((k1 + 0) * j1 + (l1 + 0)) * i1 + (i2 + 0))];
/*  62 */           double d2 = this.u[(((k1 + 0) * j1 + (l1 + 1)) * i1 + (i2 + 0))];
/*  63 */           double d3 = this.u[(((k1 + 1) * j1 + (l1 + 0)) * i1 + (i2 + 0))];
/*  64 */           double d4 = this.u[(((k1 + 1) * j1 + (l1 + 1)) * i1 + (i2 + 0))];
/*  65 */           double d5 = (this.u[(((k1 + 0) * j1 + (l1 + 0)) * i1 + (i2 + 1))] - d1) * d;
/*  66 */           double d6 = (this.u[(((k1 + 0) * j1 + (l1 + 1)) * i1 + (i2 + 1))] - d2) * d;
/*  67 */           double d7 = (this.u[(((k1 + 1) * j1 + (l1 + 0)) * i1 + (i2 + 1))] - d3) * d;
/*  68 */           double d8 = (this.u[(((k1 + 1) * j1 + (l1 + 1)) * i1 + (i2 + 1))] - d4) * d;
/*  69 */           for (int j2 = 0; j2 < 8; j2++)
/*     */           {
/*  71 */             double d9 = 0.25D;
/*  72 */             double d10 = d1;
/*  73 */             double d11 = d2;
/*  74 */             double d12 = (d3 - d1) * d9;
/*  75 */             double d13 = (d4 - d2) * d9;
/*  76 */             for (int k2 = 0; k2 < 4; k2++)
/*     */             {
/*  78 */               this.s.getClass();
/*  79 */               this.s.getClass();
/*  80 */               int l2 = k2 + k1 * 4 << 11 | 0 + l1 * 4 << 7 | i2 * 8 + j2;
/*  81 */               this.s.getClass();
/*  82 */               int i3 = 128;
/*  83 */               double d14 = 0.25D;
/*  84 */               double d15 = d10;
/*  85 */               double d16 = (d11 - d10) * d14;
/*  86 */               for (int j3 = 0; j3 < 4; j3++)
/*     */               {
/*  88 */                 int k3 = 0;
/*  89 */                 if (i2 * 8 + j2 < byte1)
/*     */                 {
/*  91 */                   k3 = lr.C.bA;
/*     */                 }
/*  93 */                 if (d15 > 0.0D)
/*     */                 {
/*  95 */                   k3 = lr.u.bA;
/*     */                 }
/*  97 */                 abyte0[l2] = ((byte)k3);
/*  98 */                 l2 += i3;
/*  99 */                 d15 += d16;
/*     */               }
/*     */ 
/* 102 */               d10 += d12;
/* 103 */               d11 += d13;
/*     */             }
/*     */ 
/* 106 */             d1 += d5;
/* 107 */             d2 += d6;
/* 108 */             d3 += d7;
/* 109 */             d4 += d8;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, byte[] abyte0, vh[] abiomegenbase)
/*     */   {
/* 122 */     this.s.getClass();
/* 123 */     byte byte0 = 63;
/* 124 */     double d = 0.03125D;
/* 125 */     this.v = this.r.a(this.v, i * 16, j * 16, 0, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
/* 126 */     for (int k = 0; k < 16; k++)
/*     */     {
/* 128 */       for (int l = 0; l < 16; l++)
/*     */       {
/* 130 */         vh biomegenbase = abiomegenbase[(l + k * 16)];
/* 131 */         int i1 = (int)(this.v[(k + l * 16)] / 3.0D + 3.0D + this.n.nextDouble() * 0.25D);
/* 132 */         int j1 = -1;
/* 133 */         byte byte1 = biomegenbase.n;
/* 134 */         byte byte2 = biomegenbase.o;
/* 135 */         this.s.getClass();
/* 136 */         for (int k1 = 127; k1 >= 0; k1--)
/*     */         {
/* 138 */           this.s.getClass();
/* 139 */           int l1 = (l * 16 + k) * 128 + k1;
/* 140 */           if (k1 <= 0 + this.n.nextInt(5))
/*     */           {
/* 143 */             abyte0[l1] = ((byte)lr.aq.bA);
/*     */           }
/*     */           else {
/* 146 */             byte byte3 = abyte0[l1];
/* 147 */             if (byte3 == 0)
/*     */             {
/* 149 */               j1 = -1;
/*     */             }
/* 152 */             else if (byte3 == lr.u.bA)
/*     */             {
/* 156 */               if (j1 == -1)
/*     */               {
/* 158 */                 if (i1 <= 0)
/*     */                 {
/* 160 */                   byte1 = 0;
/* 161 */                   byte2 = (byte)lr.u.bA;
/*     */                 }
/* 163 */                 else if ((k1 >= byte0 - 4) && (k1 <= byte0 + 1))
/*     */                 {
/* 165 */                   byte1 = biomegenbase.n;
/* 166 */                   byte2 = biomegenbase.o;
/*     */                 }
/* 168 */                 if ((k1 < byte0) && (byte1 == 0))
/*     */                 {
/* 170 */                   byte1 = (byte)lr.C.bA;
/*     */                 }
/* 172 */                 j1 = i1;
/* 173 */                 if (k1 >= byte0 - 1)
/*     */                 {
/* 175 */                   abyte0[l1] = byte1;
/*     */                 }
/*     */                 else {
/* 178 */                   abyte0[l1] = byte2;
/*     */                 }
/*     */ 
/*     */               }
/* 182 */               else if (j1 > 0)
/*     */               {
/* 186 */                 j1--;
/* 187 */                 abyte0[l1] = byte2;
/* 188 */                 if ((j1 == 0) && (byte2 == lr.F.bA))
/*     */                 {
/* 190 */                   j1 = this.n.nextInt(4);
/* 191 */                   byte2 = (byte)lr.R.bA;
/*     */                 }
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
/* 203 */     return b(i, j);
/*     */   }
/*     */ 
/*     */   public vy b(int i, int j)
/*     */   {
/* 208 */     this.n.setSeed(i * 341873128712L + j * 132897987541L);
/* 209 */     this.s.getClass();
/* 210 */     byte[] abyte0 = new byte[16 * this.s.getWorldHeight() * 16];
/* 211 */     vy chunk = new vy(this.s, abyte0, i, j);
/* 212 */     a(i, j, abyte0);
/* 213 */     this.y = this.s.a().a(this.y, i * 16, j * 16, 16, 16);
/* 214 */     a(i, j, abyte0, this.y);
/* 215 */     this.w.a(this, this.s, i, j, abyte0);
/* 216 */     if (this.t)
/*     */     {
/* 218 */       this.d.a(this, this.s, i, j, abyte0);
/* 219 */       this.f.a(this, this.s, i, j, abyte0);
/* 220 */       this.e.a(this, this.s, i, j, abyte0);
/*     */     }
/* 222 */     this.x.a(this, this.s, i, j, abyte0);
/* 223 */     chunk.c();
/* 224 */     return chunk;
/*     */   }
/*     */ 
/*     */   private double[] a(double[] ad, int i, int j, int k, int l, int i1, int j1)
/*     */   {
/* 229 */     if (ad == null)
/*     */     {
/* 231 */       ad = new double[l * i1 * j1];
/*     */     }
/* 233 */     if (this.l == null)
/*     */     {
/* 235 */       this.l = new float[25];
/* 236 */       for (int k1 = -2; k1 <= 2; k1++)
/*     */       {
/* 238 */         for (int l1 = -2; l1 <= 2; l1++)
/*     */         {
/* 240 */           float f = 10.0F / et.c(k1 * k1 + l1 * l1 + 0.2F);
/* 241 */           this.l[(k1 + 2 + (l1 + 2) * 5)] = f;
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 247 */     double d = 684.41200000000003D;
/* 248 */     double d1 = 684.41200000000003D;
/* 249 */     this.j = this.a.a(this.j, i, k, l, j1, 1.121D, 1.121D, 0.5D);
/* 250 */     this.k = this.b.a(this.k, i, k, l, j1, 200.0D, 200.0D, 0.5D);
/* 251 */     this.g = this.q.a(this.g, i, j, k, l, i1, j1, d / 80.0D, d1 / 160.0D, d / 80.0D);
/* 252 */     this.h = this.o.a(this.h, i, j, k, l, i1, j1, d, d1, d);
/* 253 */     this.i = this.p.a(this.i, i, j, k, l, i1, j1, d, d1, d);
/* 254 */     i = k = 0;
/* 255 */     int i2 = 0;
/* 256 */     int j2 = 0;
/* 257 */     for (int k2 = 0; k2 < l; k2++)
/*     */     {
/* 259 */       for (int l2 = 0; l2 < j1; l2++)
/*     */       {
/* 261 */         float f1 = 0.0F;
/* 262 */         float f2 = 0.0F;
/* 263 */         float f3 = 0.0F;
/* 264 */         byte byte0 = 2;
/* 265 */         vh biomegenbase = this.y[(k2 + 2 + (l2 + 2) * (l + 5))];
/* 266 */         for (int i3 = -byte0; i3 <= byte0; i3++)
/*     */         {
/* 268 */           for (int j3 = -byte0; j3 <= byte0; j3++)
/*     */           {
/* 270 */             vh biomegenbase1 = this.y[(k2 + i3 + 2 + (l2 + j3 + 2) * (l + 5))];
/* 271 */             float f4 = this.l[(i3 + 2 + (j3 + 2) * 5)] / (biomegenbase1.q + 2.0F);
/* 272 */             if (biomegenbase1.q > biomegenbase.q)
/*     */             {
/* 274 */               f4 /= 2.0F;
/*     */             }
/* 276 */             f1 += biomegenbase1.r * f4;
/* 277 */             f2 += biomegenbase1.q * f4;
/* 278 */             f3 += f4;
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 283 */         f1 /= f3;
/* 284 */         f2 /= f3;
/* 285 */         f1 = f1 * 0.9F + 0.1F;
/* 286 */         f2 = (f2 * 4.0F - 1.0F) / 8.0F;
/* 287 */         double d2 = this.k[j2] / 8000.0D;
/* 288 */         if (d2 < 0.0D)
/*     */         {
/* 290 */           d2 = -d2 * 0.3D;
/*     */         }
/* 292 */         d2 = d2 * 3.0D - 2.0D;
/* 293 */         if (d2 < 0.0D)
/*     */         {
/* 295 */           d2 /= 2.0D;
/* 296 */           if (d2 < -1.0D)
/*     */           {
/* 298 */             d2 = -1.0D;
/*     */           }
/* 300 */           d2 /= 1.4D;
/* 301 */           d2 /= 2.0D;
/*     */         }
/*     */         else {
/* 304 */           if (d2 > 1.0D)
/*     */           {
/* 306 */             d2 = 1.0D;
/*     */           }
/* 308 */           d2 /= 8.0D;
/*     */         }
/* 310 */         j2++;
/* 311 */         for (int k3 = 0; k3 < i1; k3++)
/*     */         {
/* 313 */           double d3 = f2;
/* 314 */           double d4 = f1;
/* 315 */           d3 += d2 * 0.2D;
/* 316 */           d3 = d3 * i1 / 16.0D;
/* 317 */           double d5 = i1 / 2.0D + d3 * 4.0D;
/* 318 */           double d6 = 0.0D;
/* 319 */           this.s.getClass();
/* 320 */           double d7 = (k3 - d5) * 12.0D * 128.0D / 128.0D / d4;
/* 321 */           if (d7 < 0.0D)
/*     */           {
/* 323 */             d7 *= 4.0D;
/*     */           }
/* 325 */           double d8 = this.h[i2] / 512.0D;
/* 326 */           double d9 = this.i[i2] / 512.0D;
/* 327 */           double d10 = (this.g[i2] / 10.0D + 1.0D) / 2.0D;
/* 328 */           if (d10 < 0.0D)
/*     */           {
/* 330 */             d6 = d8;
/*     */           }
/* 332 */           else if (d10 > 1.0D)
/*     */           {
/* 334 */             d6 = d9;
/*     */           }
/*     */           else {
/* 337 */             d6 = d8 + (d9 - d8) * d10;
/*     */           }
/* 339 */           d6 -= d7;
/* 340 */           if (k3 > i1 - 4)
/*     */           {
/* 342 */             double d11 = (k3 - (i1 - 4)) / 3.0F;
/* 343 */             d6 = d6 * (1.0D - d11) + -10.0D * d11;
/*     */           }
/* 345 */           ad[i2] = d6;
/* 346 */           i2++;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 353 */     return ad;
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j)
/*     */   {
/* 358 */     return true;
/*     */   }
/*     */ 
/*     */   public void a(bf ichunkprovider, int i, int j)
/*     */   {
/* 363 */     st.a = true;
/* 364 */     int k = i * 16;
/* 365 */     int l = j * 16;
/* 366 */     vh biomegenbase = this.s.a().a(k + 16, l + 16);
/* 367 */     this.n.setSeed(this.s.s());
/* 368 */     long l1 = this.n.nextLong() / 2L * 2L + 1L;
/* 369 */     long l2 = this.n.nextLong() / 2L * 2L + 1L;
/* 370 */     this.n.setSeed(i * l1 + j * l2 ^ this.s.s());
/* 371 */     boolean flag = false;
/* 372 */     if (this.t)
/*     */     {
/* 374 */       this.d.a(this.s, this.n, i, j);
/* 375 */       this.f.a(this.s, this.n, i, j);
/* 376 */       flag = this.e.a(this.s, this.n, i, j);
/*     */     }
/* 378 */     if ((!flag) && (this.n.nextInt(4) == 0))
/*     */     {
/* 380 */       int i1 = k + this.n.nextInt(16) + 8;
/* 381 */       this.s.getClass();
/* 382 */       int i2 = this.n.nextInt(128);
/* 383 */       int i3 = l + this.n.nextInt(16) + 8;
/* 384 */       new bu(lr.C.bA).a(this.s, this.n, i1, i2, i3);
/*     */     }
/* 386 */     if ((!flag) && (this.n.nextInt(8) == 0))
/*     */     {
/* 388 */       int j1 = k + this.n.nextInt(16) + 8;
/* 389 */       this.s.getClass();
/* 390 */       int j2 = this.n.nextInt(this.n.nextInt(120) + 8);
/* 391 */       int j3 = l + this.n.nextInt(16) + 8;
/* 392 */       this.s.getClass();
/* 393 */       if ((j2 < 63) || (this.n.nextInt(10) == 0))
/*     */       {
/* 395 */         new bu(lr.E.bA).a(this.s, this.n, j1, j2, j3);
/*     */       }
/*     */     }
/* 398 */     for (int k1 = 0; k1 < 8; k1++) { int k2 = k + this.n.nextInt(16) + 8;
/* 401 */       this.s.getClass();
/* 402 */       int k3 = this.n.nextInt(128);
/* 403 */       int l3 = l + this.n.nextInt(16) + 8;
/* 404 */       if (new cq().a(this.s, this.n, k2, k3, l3)); }
/* 407 */     biomegenbase.a(this.s, this.n, k, l);
/* 408 */     qk.a(this.s, biomegenbase, k + 8, l + 8, 16, 16, this.n);
/* 409 */     st.a = false;
/*     */   }
/*     */ 
/*     */   public boolean a(boolean flag, ny iprogressupdate)
/*     */   {
/* 414 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/* 419 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b()
/*     */   {
/* 424 */     return true;
/*     */   }
/*     */ 
/*     */   public String c()
/*     */   {
/* 429 */     return "RandomLevelSource";
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     adp
 * JD-Core Version:    0.6.2
 */