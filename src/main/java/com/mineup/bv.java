/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class bv
/*     */ {
/*     */   public boolean inEllipse;
/*     */   public adg chunkCache;
/*     */   public rv a;
/*     */   private int C;
/* 274 */   public static int b = 0;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   public int g;
/*     */   public int h;
/*     */   public int i;
/*     */   public int j;
/*     */   public int k;
/*     */   public int l;
/*     */   public int m;
/*     */   public int n;
/*     */   public boolean o;
/*     */   public boolean[] p;
/*     */   public int q;
/*     */   public int r;
/*     */   public int s;
/*     */   public float t;
/*     */   public boolean u;
/*     */   public rp v;
/*     */   public int w;
/*     */   public boolean x;
/*     */   public boolean y;
/*     */   public int z;
/*     */   public boolean A;
/*     */   private boolean E;
/*     */   public List B;
/*     */   private List F;
/*     */ 
/*     */   public bv(rv world, List list, int i, int j, int k, int l, int i1)
/*     */   {
/*  23 */     this.inEllipse = false;
/*  24 */     this.C = -1;
/*  25 */     this.o = false;
/*  26 */     this.p = new boolean[2];
/*  27 */     this.x = true;
/*  28 */     this.E = false;
/*  29 */     this.B = new ArrayList();
/*  30 */     this.a = world;
/*  31 */     this.F = list;
/*  32 */     this.f = (this.g = this.h = l);
/*  33 */     this.t = (et.c(this.f * this.f + this.g * this.g + this.h * this.h) / 2.0F);
/*  34 */     this.C = i1;
/*  35 */     this.c = -999;
/*  36 */     a(i, j, k);
/*  37 */     this.u = false;
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, int k)
/*     */   {
/*  42 */     if ((i == this.c) && (j == this.d) && (k == this.e))
/*     */     {
/*  44 */       return;
/*     */     }
/*     */ 
/*  47 */     b();
/*  48 */     this.c = i;
/*  49 */     this.d = j;
/*  50 */     this.e = k;
/*  51 */     this.q = (i + this.f / 2);
/*  52 */     this.r = (j + this.g / 2);
/*  53 */     this.s = (k + this.h / 2);
/*  54 */     this.l = (i & 0x3FF);
/*  55 */     this.m = j;
/*  56 */     this.n = (k & 0x3FF);
/*  57 */     this.i = (i - this.l);
/*  58 */     this.j = (j - this.m);
/*  59 */     this.k = (k - this.n);
/*  60 */     float f = 6.0F;
/*  61 */     this.v = rp.a(i - f, j - f, k - f, i + this.f + f, j + this.g + f, k + this.h + f);
/*  62 */     GL11.glNewList(this.C + 2, 4864);
/*  63 */     pj.a(rp.b(this.l - f, this.m - f, this.n - f, this.l + this.f + f, this.m + this.g + f, this.n + this.h + f));
/*  64 */     GL11.glEndList();
/*  65 */     f();
/*     */   }
/*     */ 
/*     */   private void g()
/*     */   {
/*  72 */     GL11.glTranslatef(this.l, this.m, this.n);
/*     */   }
/*     */ 
/*     */   public void a()
/*     */   {
/*  77 */     if (!this.u)
/*     */     {
/*  79 */       return;
/*     */     }
/*  81 */     b += 1;
/*  82 */     int i = this.c;
/*  83 */     int j = this.d;
/*  84 */     int k = this.e;
/*  85 */     int l = this.c + this.f;
/*  86 */     int i1 = this.d + this.g;
/*  87 */     int j1 = this.e + this.h;
/*  88 */     for (int k1 = 0; k1 < 2; k1++)
/*     */     {
/*  90 */       this.p[k1] = true;
/*     */     }
/*     */ 
/*  93 */     vy.a = false;
/*  94 */     HashSet hashset = new HashSet();
/*  95 */     hashset.addAll(this.B);
/*  96 */     this.B.clear();
/*  97 */     int l1 = 1;
/*  98 */     adg chunkcache = this.a.createChunkCache(i - l1, j - l1, k - l1, l + l1 - 1, i1 + l1 - 1, j1 + l1 - 1);
/*  99 */     qo renderblocks = new qo(chunkcache);
/* 100 */     int i2 = 0;
/*     */ 
/* 103 */     while (i2 < 2)
/*     */     {
/* 107 */       boolean flag = false;
/* 108 */       boolean flag1 = false;
/* 109 */       boolean flag2 = false;
/* 110 */       for (int j2 = j; j2 < i1; j2++)
/*     */       {
/* 112 */         for (int k2 = k; k2 < j1; k2++)
/*     */         {
/* 114 */           for (int l2 = i; l2 < l; l2++)
/*     */           {
/* 116 */             int i3 = chunkcache.a(l2, j2, k2);
/* 117 */             if (i3 > 0)
/*     */             {
/* 121 */               if (!flag2)
/*     */               {
/* 123 */                 flag2 = true;
/* 124 */                 GL11.glNewList(this.C + i2, 4864);
/* 125 */                 GL11.glPushMatrix();
/* 126 */                 g();
/* 127 */                 float f = 1.000001F;
/* 128 */                 GL11.glTranslatef(-this.h / 2.0F, -this.g / 2.0F, -this.h / 2.0F);
/* 129 */                 GL11.glScalef(f, f, f);
/* 130 */                 GL11.glTranslatef(this.h / 2.0F, this.g / 2.0F, this.h / 2.0F);
/* 131 */                 MineUpForgeAdapter.get().forgeHooksClientBeforeRenderPass(i2);
/* 132 */                 xe.a.b();
/* 133 */                 xe.a.b(-this.c, -this.d, -this.e);
/*     */               }
/* 135 */               if ((i2 == 0) && (lr.p[i3] != 0))
/*     */               {
/* 137 */                 ij tileentity = chunkcache.b(l2, j2, k2);
/* 138 */                 if (vx.a.a(tileentity))
/*     */                 {
/* 140 */                   this.B.add(tileentity);
/*     */                 }
/*     */               }
/* 143 */               lr block = lr.m[i3];
/* 144 */               int j3 = block.c();
/* 145 */               if ((i2 == 0) && (renderblocks.a(l2, j2, k2, i2)))
/*     */               {
/* 147 */                 flag1 = true;
/*     */               }
/* 149 */               if (j3 > i2)
/* 150 */                 flag = true;
/* 151 */               if (MineUpForgeAdapter.get().forgeHooksClientCanRenderInPass(block, i2))
/*     */               {
/* 154 */                 MineUpForgeAdapter.get().forgeHooksClientBeforeBlockRender(block, renderblocks);
/* 155 */                 flag1 |= renderblocks.b(block, l2, j2, k2);
/* 156 */                 MineUpForgeAdapter.get().forgeHooksClientAfterBlockRender(block, renderblocks);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */ 
/* 163 */       if (flag2)
/*     */       {
/* 165 */         MineUpForgeAdapter.get().forgeHooksClientAfterRenderPass(i2);
/* 166 */         xe.a.a();
/* 167 */         GL11.glPopMatrix();
/* 168 */         GL11.glEndList();
/* 169 */         xe.a.b(0.0D, 0.0D, 0.0D);
/*     */       }
/*     */       else {
/* 172 */         flag1 = false;
/*     */       }
/* 174 */       if (flag1)
/*     */       {
/* 176 */         this.p[i2] = false;
/*     */       }
/* 178 */       if (!flag)
/*     */       {
/*     */         break;
/*     */       }
/* 182 */       i2++;
/*     */     }
/* 184 */     HashSet hashset1 = new HashSet();
/* 185 */     hashset1.addAll(this.B);
/* 186 */     hashset1.removeAll(hashset);
/* 187 */     this.F.addAll(hashset1);
/* 188 */     hashset.removeAll(this.B);
/* 189 */     this.F.removeAll(hashset);
/* 190 */     this.A = vy.a;
/* 191 */     this.E = true;
/*     */   }
/*     */ 
/*     */   public float a(kj entity)
/*     */   {
/* 196 */     float f = (float)(entity.o - this.q);
/* 197 */     float f1 = (float)(entity.p - this.r);
/* 198 */     float f2 = (float)(entity.q - this.s);
/* 199 */     return f * f + f1 * f1 + f2 * f2;
/*     */   }
/*     */ 
/*     */   public void b()
/*     */   {
/* 204 */     for (int i = 0; i < 2; i++)
/*     */     {
/* 206 */       this.p[i] = true;
/*     */     }
/*     */ 
/* 209 */     this.o = false;
/* 210 */     this.E = false;
/*     */   }
/*     */ 
/*     */   public void c()
/*     */   {
/* 215 */     b();
/* 216 */     this.a = null;
/*     */   }
/*     */ 
/*     */   public void keepChunksAlive()
/*     */   {
/* 221 */     for (int i = -1; i <= 1; i++)
/* 222 */       for (int j = -1; j <= 1; j++)
/* 223 */         for (int k = -1; k <= 1; k++)
/*     */         {
/* 225 */           this.a.keepChunkActual(this.a.getChunkFromBlockCoords(this.c + 16 * i, this.d + 16 * j, this.e + 16 * k));
/*     */         }
/*     */   }
/*     */ 
/*     */   public int a(int i)
/*     */   {
/* 231 */     if (!this.o)
/*     */     {
/* 233 */       return -1;
/*     */     }
/* 235 */     if (this.p[i] == 0)
/*     */     {
/* 237 */       keepChunksAlive();
/* 238 */       return this.C + i;
/*     */     }
/*     */ 
/* 241 */     return -1;
/*     */   }
/*     */ 
/*     */   public void a(adu icamera)
/*     */   {
/* 247 */     this.o = icamera.a(this.v);
/*     */   }
/*     */ 
/*     */   public void d()
/*     */   {
/* 252 */     GL11.glCallList(this.C + 2);
/*     */   }
/*     */ 
/*     */   public boolean e()
/*     */   {
/* 257 */     if (!this.E)
/*     */     {
/* 259 */       return false;
/*     */     }
/*     */ 
/* 262 */     return (this.p[0] != 0) && (this.p[1] != 0);
/*     */   }
/*     */ 
/*     */   public void f()
/*     */   {
/* 268 */     if (this.inEllipse)
/* 269 */       this.u = true;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     bv
 * JD-Core Version:    0.6.2
 */