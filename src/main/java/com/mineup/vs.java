/*     */ import java.util.Random;
/*     */ 
/*     */ public class vs extends lr
/*     */ {
/*     */   protected vs(int i, wa material)
/*     */   {
/*  19 */     super(i, material);
/*  20 */     this.bz = 97;
/*  21 */     if (material == wa.f)
/*     */     {
/*  23 */       this.bz += 1;
/*     */     }
/*  25 */     float f = 0.5F;
/*  26 */     float f1 = 1.0F;
/*  27 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
/*     */   }
/*     */ 
/*     */   public int a(int i, int j)
/*     */   {
/*  32 */     if ((i == 0) || (i == 1))
/*     */     {
/*  34 */       return this.bz;
/*     */     }
/*  36 */     int k = f(j);
/*  37 */     if ((((k == 0) || (k == 2) ? 1 : 0) ^ (i <= 3 ? 1 : 0)) != 0)
/*     */     {
/*  39 */       return this.bz;
/*     */     }
/*  41 */     int l = k / 2 + (i & 0x1 ^ k);
/*  42 */     l += (j & 0x4) / 4;
/*  43 */     int i1 = this.bz - (j & 0x8) * 2;
/*  44 */     if ((l & 0x1) != 0)
/*     */     {
/*  46 */       i1 = -i1;
/*     */     }
/*  48 */     return i1;
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b()
/*     */   {
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */   public int d()
/*     */   {
/*  63 */     return 7;
/*     */   }
/*     */ 
/*     */   public rp d(rv world, int i, int j, int k)
/*     */   {
/*  68 */     a(world, i, j, k);
/*  69 */     return super.d(world, i, j, k);
/*     */   }
/*     */ 
/*     */   public rp c(rv world, int i, int j, int k)
/*     */   {
/*  74 */     a(world, i, j, k);
/*  75 */     return super.c(world, i, j, k);
/*     */   }
/*     */ 
/*     */   public void a(adg iblockaccess, int i, int j, int k)
/*     */   {
/*  80 */     d(f(iblockaccess.e(i, j, k)));
/*     */   }
/*     */ 
/*     */   public void d(int i)
/*     */   {
/*  85 */     float f = 0.1875F;
/*  86 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/*  87 */     if (i == 0)
/*     */     {
/*  89 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*     */     }
/*  91 */     if (i == 1)
/*     */     {
/*  93 */       a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     }
/*  95 */     if (i == 2)
/*     */     {
/*  97 */       a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*     */     }
/*  99 */     if (i == 3)
/*     */     {
/* 101 */       a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, sz entityplayer)
/*     */   {
/* 107 */     b(world, i, j, k, entityplayer);
/*     */   }
/*     */ 
/*     */   public boolean b(rv world, int i, int j, int k, sz entityplayer)
/*     */   {
/* 112 */     if (this.bN == wa.f)
/*     */     {
/* 114 */       return false;
/*     */     }
/* 116 */     int l = world.e(i, j, k);
/* 117 */     if ((l & 0x8) != 0)
/*     */     {
/* 119 */       if (world.a(i, j - 1, k) == this.bA)
/*     */       {
/* 121 */         b(world, i, j - 1, k, entityplayer);
/*     */       }
/* 123 */       return true;
/*     */     }
/* 125 */     if (world.a(i, j + 1, k) == this.bA)
/*     */     {
/* 127 */       world.f(i, j + 1, k, (l ^ 0x4) + 8);
/*     */     }
/* 129 */     world.f(i, j, k, l ^ 0x4);
/* 130 */     world.c(i, j - 1, k, i, j, k);
/* 131 */     world.a(entityplayer, 1003, i, j, k, 0);
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, boolean flag)
/*     */   {
/* 137 */     int l = world.e(i, j, k);
/* 138 */     if ((l & 0x8) != 0)
/*     */     {
/* 140 */       if (world.a(i, j - 1, k) == this.bA)
/*     */       {
/* 142 */         a(world, i, j - 1, k, flag);
/*     */       }
/* 144 */       return;
/*     */     }
/* 146 */     boolean flag1 = (world.e(i, j, k) & 0x4) > 0;
/* 147 */     if (flag1 == flag)
/*     */     {
/* 149 */       return;
/*     */     }
/* 151 */     if (world.a(i, j + 1, k) == this.bA)
/*     */     {
/* 153 */       world.f(i, j + 1, k, (l ^ 0x4) + 8);
/*     */     }
/* 155 */     world.f(i, j, k, l ^ 0x4);
/* 156 */     world.c(i, j - 1, k, i, j, k);
/* 157 */     world.a(null, 1003, i, j, k, 0);
/*     */   }
/*     */ 
/*     */   public void a(rv world, int i, int j, int k, int l)
/*     */   {
/* 162 */     int i1 = world.e(i, j, k);
/* 163 */     if ((i1 & 0x8) != 0)
/*     */     {
/* 165 */       if (world.a(i, j - 1, k) != this.bA)
/*     */       {
/* 167 */         world.g(i, j, k, 0);
/*     */       }
/* 169 */       if ((l > 0) && (lr.m[l].g()))
/*     */       {
/* 171 */         a(world, i, j - 1, k, l);
/*     */       }
/*     */     }
/*     */     else {
/* 175 */       boolean flag = false;
/* 176 */       if (world.a(i, j + 1, k) != this.bA)
/*     */       {
/* 178 */         world.g(i, j, k, 0);
/* 179 */         flag = true;
/*     */       }
/* 181 */       if (!world.isBlockSolidOnSide(i, j - 1, k, 1))
/*     */       {
/* 183 */         world.g(i, j, k, 0);
/* 184 */         flag = true;
/* 185 */         if (world.a(i, j + 1, k) == this.bA)
/*     */         {
/* 187 */           world.g(i, j + 1, k, 0);
/*     */         }
/*     */       }
/* 190 */       if (flag)
/*     */       {
/* 192 */         if (!world.I)
/*     */         {
/* 194 */           g(world, i, j, k, i1);
/*     */         }
/*     */       }
/* 197 */       else if ((l > 0) && (lr.m[l].g()))
/*     */       {
/* 199 */         boolean flag1 = (world.s(i, j, k)) || (world.s(i, j + 1, k));
/* 200 */         a(world, i, j, k, flag1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public int a(int i, Random random)
/*     */   {
/* 207 */     if ((i & 0x8) != 0)
/*     */     {
/* 209 */       return 0;
/*     */     }
/* 211 */     if (this.bN == wa.f)
/*     */     {
/* 213 */       return sv.aC.br;
/*     */     }
/*     */ 
/* 216 */     return sv.aw.br;
/*     */   }
/*     */ 
/*     */   public ma a(rv world, int i, int j, int k, ax vec3d, ax vec3d1)
/*     */   {
/* 222 */     a(world, i, j, k);
/* 223 */     return super.a(world, i, j, k, vec3d, vec3d1);
/*     */   }
/*     */ 
/*     */   public int f(int i)
/*     */   {
/* 228 */     if ((i & 0x4) == 0)
/*     */     {
/* 230 */       return i - 1 & 0x3;
/*     */     }
/*     */ 
/* 233 */     return i & 0x3;
/*     */   }
/*     */ 
/*     */   public boolean e(rv world, int i, int j, int k)
/*     */   {
/* 239 */     world.getClass();
/* 240 */     if (j >= world.getWorldMaxY() - 1)
/*     */     {
/* 242 */       return false;
/*     */     }
/*     */ 
/* 245 */     return (world.isBlockSolidOnSide(i, j - 1, k, 1)) && (super.e(world, i, j, k)) && (super.e(world, i, j + 1, k));
/*     */   }
/*     */ 
/*     */   public static boolean g(int i)
/*     */   {
/* 251 */     return (i & 0x4) != 0;
/*     */   }
/*     */ 
/*     */   public int e()
/*     */   {
/* 256 */     return 1;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     vs
 * JD-Core Version:    0.6.2
 */