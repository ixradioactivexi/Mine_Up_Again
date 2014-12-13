/*     */ import java.util.Random;
/*     */ 
/*     */ public class xo extends lr
/*     */ {
/*     */   public xo(int i)
/*     */   {
/*  20 */     super(i, 143, wa.k);
/*  21 */     a(true);
/*     */   }
/*     */ 
/*     */   public void h()
/*     */   {
/*  26 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   public int d()
/*     */   {
/*  31 */     return 20;
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/*  36 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b()
/*     */   {
/*  41 */     return false;
/*     */   }
/*     */ 
/*     */   public void a(adg iblockaccess, int i, int j, int k)
/*     */   {
/*  46 */     int l = iblockaccess.e(i, j, k);
/*  47 */     float f = 1.0F;
/*  48 */     float f1 = 1.0F;
/*  49 */     float f2 = 1.0F;
/*  50 */     float f3 = 0.0F;
/*  51 */     float f4 = 0.0F;
/*  52 */     float f5 = 0.0F;
/*  53 */     boolean flag = l > 0;
/*  54 */     if ((l & 0x2) != 0)
/*     */     {
/*  56 */       f3 = Math.max(f3, 0.0625F);
/*  57 */       f = 0.0F;
/*  58 */       f1 = 0.0F;
/*  59 */       f4 = 1.0F;
/*  60 */       f2 = 0.0F;
/*  61 */       f5 = 1.0F;
/*  62 */       flag = true;
/*     */     }
/*  64 */     if ((l & 0x8) != 0)
/*     */     {
/*  66 */       f = Math.min(f, 0.9375F);
/*  67 */       f3 = 1.0F;
/*  68 */       f1 = 0.0F;
/*  69 */       f4 = 1.0F;
/*  70 */       f2 = 0.0F;
/*  71 */       f5 = 1.0F;
/*  72 */       flag = true;
/*     */     }
/*  74 */     if ((l & 0x4) != 0)
/*     */     {
/*  76 */       f5 = Math.max(f5, 0.0625F);
/*  77 */       f2 = 0.0F;
/*  78 */       f = 0.0F;
/*  79 */       f3 = 1.0F;
/*  80 */       f1 = 0.0F;
/*  81 */       f4 = 1.0F;
/*  82 */       flag = true;
/*     */     }
/*  84 */     if ((l & 0x1) != 0)
/*     */     {
/*  86 */       f2 = Math.min(f2, 0.9375F);
/*  87 */       f5 = 1.0F;
/*  88 */       f = 0.0F;
/*  89 */       f3 = 1.0F;
/*  90 */       f1 = 0.0F;
/*  91 */       f4 = 1.0F;
/*  92 */       flag = true;
/*     */     }
/*  94 */     if ((!flag) && (d(iblockaccess.a(i, j + 1, k))))
/*     */     {
/*  96 */       f1 = Math.min(f1, 0.9375F);
/*  97 */       f4 = 1.0F;
/*  98 */       f = 0.0F;
/*  99 */       f3 = 1.0F;
/* 100 */       f2 = 0.0F;
/* 101 */       f5 = 1.0F;
/*     */     }
/* 103 */     a(f, f1, f2, f3, f4, f5);
/*     */   }
/*     */ 
/*     */   public rp c(rv world, int i, int j, int k)
/*     */   {
/* 108 */     return null;
/*     */   }
/*     */ 
/*     */   public boolean d(rv world, int i, int j, int k, int l)
/*     */   {
/* 113 */     switch (l)
/*     */     {
/*     */     default:
/* 116 */       return false;
/*     */     case 1:
/* 119 */       return d(world.a(i, j + 1, k));
/*     */     case 2:
/* 122 */       return d(world.a(i, j, k + 1));
/*     */     case 3:
/* 125 */       return d(world.a(i, j, k - 1));
/*     */     case 5:
/* 128 */       return d(world.a(i - 1, j, k));
/*     */     case 4:
/*     */     }
/* 131 */     return d(world.a(i + 1, j, k));
/*     */   }
/*     */ 
/*     */   private boolean d(int i)
/*     */   {
/* 137 */     if (i == 0)
/*     */     {
/* 139 */       return false;
/*     */     }
/* 141 */     lr block = lr.m[i];
/* 142 */     return (block.b()) && (block.bN.c());
/*     */   }
/*     */ 
/*     */   private boolean h(rv world, int i, int j, int k)
/*     */   {
/* 147 */     int l = world.e(i, j, k);
/* 148 */     int i1 = l;
/* 149 */     if (i1 > 0)
/*     */     {
/* 151 */       for (int j1 = 0; j1 <= 3; j1++)
/*     */       {
/* 153 */         int k1 = 1 << j1;
/* 154 */         if (((l & k1) != 0) && (!d(world.a(i + uq.a[j1], j, k + uq.b[j1]))) && ((world.a(i, j + 1, k) != this.bA) || ((world.e(i, j + 1, k) & k1) == 0)))
/*     */         {
/* 156 */           i1 &= (k1 ^ 0xFFFFFFFF);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 161 */     if ((i1 == 0) && (!d(world.a(i, j + 1, k))))
/*     */     {
/* 163 */       return false;
/*     */     }
/* 165 */     if (i1 != l)
/*     */     {
/* 167 */       world.f(i, j, k, i1);
/*     */     }
/* 169 */     return true;
/*     */   }
/*     */ 
/*     */   public int i()
/*     */   {
/* 174 */     return fc.c();
/*     */   }
/*     */ 
/*     */   public int c(int i)
/*     */   {
/* 179 */     return fc.c();
/*     */   }
/*     */ 
/*     */   public int b(adg iblockaccess, int i, int j, int k)
/*     */   {
/* 184 */     double d = iblockaccess.a().b(i, k);
/* 185 */     double d1 = iblockaccess.a().c(i, k);
/* 186 */     return fc.a(d, d1);
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, int l)
/*     */   {
/* 191 */     if ((!world.I) && (!h(world, i, j, k)))
/*     */     {
/* 193 */       g(world, i, j, k, world.e(i, j, k));
/* 194 */       world.g(i, j, k, 0);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, Random random)
/*     */   {
/* 202 */     if ((!world.I) && (world.w.nextInt(16) == 0))
/*     */     {
/* 206 */       byte byte0 = 4;
/* 207 */       int l = 5;
/* 208 */       boolean flag = false;
/* 209 */       int i1 = i - byte0;
/*     */ 
/* 213 */       while (i1 <= i + byte0)
/*     */       {
/* 218 */         for (int j1 = k - byte0; j1 <= k + byte0; j1++)
/*     */         {
/* 220 */           int l1 = j - 1;
/*     */ 
/* 223 */           while (l1 <= j + 1)
/*     */           {
/* 227 */             if (world.a(i1, l1, j1) == this.bA) { l--; if (l <= 0)
/*     */               {
/* 229 */                 flag = true;
/* 230 */                 break label131;
/*     */               } }
/* 232 */             l1++;
/*     */           }
/*     */         }
/*     */ 
/* 236 */         i1++;
/*     */       }
/* 238 */       label131: i1 = world.e(i, j, k);
/* 239 */       int k1 = world.w.nextInt(6);
/* 240 */       int i2 = uq.d[k1];
/* 241 */       if (k1 == 1)
/*     */       {
/* 243 */         world.getClass();
/* 244 */         if ((j < world.getWorldMaxY() - 1) && (world.i(i, j + 1, k)))
/*     */         {
/* 246 */           if (flag)
/*     */           {
/* 248 */             return;
/*     */           }
/* 250 */           int j2 = world.w.nextInt(16) & i1;
/* 251 */           if (j2 <= 0)
/*     */             return;
/* 253 */           for (int i3 = 0; i3 <= 3; i3++)
/*     */           {
/* 255 */             if (!d(world.a(i + uq.a[i3], j + 1, k + uq.b[i3])))
/*     */             {
/* 257 */               j2 &= (1 << i3 ^ 0xFFFFFFFF);
/*     */             }
/*     */           }
/*     */ 
/* 261 */           if (j2 <= 0)
/*     */             return;
/* 263 */           world.d(i, j + 1, k, this.bA, j2); return;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 269 */       if ((k1 >= 2) && (k1 <= 5) && ((i1 & 1 << i2) == 0))
/*     */       {
/* 271 */         if (flag)
/*     */         {
/* 273 */           return;
/*     */         }
/* 275 */         int k2 = world.a(i + uq.a[i2], j, k + uq.b[i2]);
/* 276 */         if ((k2 == 0) || (lr.m[k2] == null))
/*     */         {
/* 278 */           int j3 = i2 + 1 & 0x3;
/* 279 */           int i4 = i2 + 3 & 0x3;
/* 280 */           if (((i1 & 1 << j3) != 0) && (d(world.a(i + uq.a[i2] + uq.a[j3], j, k + uq.b[i2] + uq.b[j3]))))
/*     */           {
/* 282 */             world.d(i + uq.a[i2], j, k + uq.b[i2], this.bA, 1 << j3);
/*     */           }
/* 284 */           else if (((i1 & 1 << i4) != 0) && (d(world.a(i + uq.a[i2] + uq.a[i4], j, k + uq.b[i2] + uq.b[i4]))))
/*     */           {
/* 286 */             world.d(i + uq.a[i2], j, k + uq.b[i2], this.bA, 1 << i4);
/*     */           }
/* 288 */           else if (((i1 & 1 << j3) != 0) && (world.i(i + uq.a[i2] + uq.a[j3], j, k + uq.b[i2] + uq.b[j3])) && (d(world.a(i + uq.a[j3], j, k + uq.b[j3]))))
/*     */           {
/* 290 */             world.d(i + uq.a[i2] + uq.a[j3], j, k + uq.b[i2] + uq.b[j3], this.bA, 1 << (i2 + 2 & 0x3));
/*     */           }
/* 292 */           else if (((i1 & 1 << i4) != 0) && (world.i(i + uq.a[i2] + uq.a[i4], j, k + uq.b[i2] + uq.b[i4])) && (d(world.a(i + uq.a[i4], j, k + uq.b[i4]))))
/*     */           {
/* 294 */             world.d(i + uq.a[i2] + uq.a[i4], j, k + uq.b[i2] + uq.b[i4], this.bA, 1 << (i2 + 2 & 0x3));
/*     */           }
/* 296 */           else if (d(world.a(i + uq.a[i2], j + 1, k + uq.b[i2])))
/*     */           {
/* 298 */             world.d(i + uq.a[i2], j, k + uq.b[i2], this.bA, 0);
/*     */           }
/*     */         }
/* 301 */         else if ((lr.m[k2].bN.j()) && (lr.m[k2].b()))
/*     */         {
/* 303 */           world.f(i, j, k, i1 | 1 << i2);
/*     */         }
/*     */       }
/* 306 */       else if (j > ExtendedWorldProvider.get().getWorldMinY(world) + 1)
/*     */       {
/* 308 */         int l2 = world.a(i, j - 1, k);
/* 309 */         if (l2 == 0)
/*     */         {
/* 311 */           int k3 = world.w.nextInt(16) & i1;
/* 312 */           if (k3 > 0)
/*     */           {
/* 314 */             world.d(i, j - 1, k, this.bA, k3);
/*     */           }
/*     */         }
/* 317 */         else if (l2 == this.bA)
/*     */         {
/* 319 */           int l3 = world.w.nextInt(16) & i1;
/* 320 */           int j4 = world.e(i, j - 1, k);
/* 321 */           if (j4 != (j4 | l3))
/*     */           {
/* 323 */             world.f(i, j - 1, k, j4 | l3);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void c(rv world, int i, int j, int k, int l)
/*     */   {
/* 332 */     byte byte0 = 0;
/* 333 */     switch (l)
/*     */     {
/*     */     case 2:
/* 336 */       byte0 = 1;
/* 337 */       break;
/*     */     case 3:
/* 340 */       byte0 = 4;
/* 341 */       break;
/*     */     case 4:
/* 344 */       byte0 = 8;
/* 345 */       break;
/*     */     case 5:
/* 348 */       byte0 = 2;
/*     */     }
/*     */ 
/* 351 */     if (byte0 != 0)
/*     */     {
/* 353 */       world.f(i, j, k, byte0);
/*     */     }
/*     */   }
/*     */ 
/*     */   public int a(int i, Random random)
/*     */   {
/* 359 */     return 0;
/*     */   }
/*     */ 
/*     */   public int a(Random random)
/*     */   {
/* 364 */     return 0;
/*     */   }
/*     */ 
/*     */   public void a(rv world, sz entityplayer, int i, int j, int k, int l)
/*     */   {
/* 369 */     if ((!world.I) && (entityplayer.aj() != null) && (entityplayer.aj().c == sv.bf.br))
/*     */     {
/* 371 */       entityplayer.a(fd.C[this.bA], 1);
/* 372 */       a(world, i, j, k, new ul(lr.bv, 1, l));
/*     */     }
/*     */     else {
/* 375 */       super.a(world, entityplayer, i, j, k, l);
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     xo
 * JD-Core Version:    0.6.2
 */