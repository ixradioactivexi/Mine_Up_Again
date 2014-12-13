/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class gx extends rv
/*     */ {
/*     */   private LinkedList M;
/*     */   private wt N;
/*     */   protected ls O;
/*     */   private vc P;
/*     */   private Set Q;
/*     */   private Set R;
/*     */ 
/*     */   public gx(rv world, acz provider, rl info, wt netclienthandler, int difficultySetting)
/*     */   {
/*  19 */     super(world, provider, info);
/*  20 */     this.M = new LinkedList();
/*  21 */     this.P = new vc();
/*  22 */     this.Q = new HashSet();
/*  23 */     this.R = new HashSet();
/*  24 */     this.N = netclienthandler;
/*  25 */     this.v = difficultySetting;
/*  26 */     a(new ps(8, 64, 8));
/*  27 */     if (netclienthandler != null)
/*  28 */       this.E = netclienthandler.b;
/*     */   }
/*     */ 
/*     */   public gx(wt netclienthandler, dx worldsettings, int i, int j)
/*     */   {
/*  33 */     super(new acv(), "MpServer", acz.a(i), worldsettings);
/*  34 */     this.M = new LinkedList();
/*  35 */     this.P = new vc();
/*  36 */     this.Q = new HashSet();
/*  37 */     this.R = new HashSet();
/*  38 */     this.N = netclienthandler;
/*  39 */     this.v = j;
/*  40 */     a(new ps(8, 64, 8));
/*  41 */     this.E = netclienthandler.b;
/*     */   }
/*     */ 
/*     */   public void c()
/*     */   {
/*  46 */     a(t() + 1L);
/*  47 */     for (int i = 0; (i < 10) && (!this.R.isEmpty()); i++)
/*     */     {
/*  49 */       kj entity = (kj)this.R.iterator().next();
/*  50 */       if (!this.Q.contains(entity))
/*     */       {
/*  52 */         a(entity);
/*     */       }
/*     */     }
/*     */ 
/*  56 */     this.N.b();
/*  57 */     for (int j = 0; j < this.M.size(); j++)
/*     */     {
/*  59 */       ky worldblockpositiontype = (ky)this.M.get(j);
/*  60 */       if (--worldblockpositiontype.d == 0)
/*     */       {
/*  62 */         super.b(worldblockpositiontype.a, worldblockpositiontype.b, worldblockpositiontype.c, worldblockpositiontype.e, worldblockpositiontype.f);
/*  63 */         super.j(worldblockpositiontype.a, worldblockpositiontype.b, worldblockpositiontype.c);
/*  64 */         this.M.remove(j--);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, int k, int l, int i1, int j1)
/*     */   {
/*  72 */     for (int k1 = 0; k1 < this.M.size(); k1++)
/*     */     {
/*  74 */       ky worldblockpositiontype = (ky)this.M.get(k1);
/*  75 */       if ((worldblockpositiontype.a >= i) && (worldblockpositiontype.b >= j) && (worldblockpositiontype.c >= k) && (worldblockpositiontype.a <= l) && (worldblockpositiontype.b <= i1) && (worldblockpositiontype.c <= j1))
/*     */       {
/*  77 */         this.M.remove(k1--);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected bf d()
/*     */   {
/*  85 */     this.O = new ls(this);
/*  86 */     return this.O;
/*     */   }
/*     */ 
/*     */   public void e()
/*     */   {
/*  91 */     a(new ps(8, 64, 8));
/*     */   }
/*     */ 
/*     */   protected void f()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, int k, int l, int i1)
/*     */   {
/*     */   }
/*     */ 
/*     */   public boolean a(boolean flag)
/*     */   {
/* 104 */     return false;
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, boolean flag)
/*     */   {
/* 109 */     if (this.parentWorld != null)
/* 110 */       throw new WorldLayerException();
/* 111 */     if (flag)
/*     */     {
/* 113 */       this.O.c(i, j);
/*     */     }
/*     */     else {
/* 116 */       this.O.d(i, j);
/*     */     }
/* 118 */     if (!flag)
/*     */     {
/* 120 */       c(i * 16, 0, j * 16, i * 16 + 15, 128, j * 16 + 15);
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean a(kj entity)
/*     */   {
/* 126 */     if (this.parentWorld != null)
/*     */     {
/* 128 */       return this.parentWorld.a(entity);
/*     */     }
/* 130 */     boolean flag = super.a(entity);
/* 131 */     this.Q.add(entity);
/* 132 */     if (!flag)
/*     */     {
/* 134 */       this.R.add(entity);
/*     */     }
/* 136 */     return flag;
/*     */   }
/*     */ 
/*     */   public void b(kj entity)
/*     */   {
/* 141 */     if (this.parentWorld != null)
/* 142 */       throw new WorldLayerException();
/* 143 */     super.b(entity);
/* 144 */     this.Q.remove(entity);
/*     */   }
/*     */ 
/*     */   protected void c(kj entity)
/*     */   {
/* 149 */     super.c(entity);
/* 150 */     if (this.R.contains(entity))
/*     */     {
/* 152 */       this.R.remove(entity);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void d(kj entity)
/*     */   {
/* 158 */     super.d(entity);
/* 159 */     if (this.Q.contains(entity))
/*     */     {
/* 161 */       this.R.add(entity);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(int i, kj entity)
/*     */   {
/* 167 */     if (this.parentWorld != null)
/* 168 */       throw new WorldLayerException();
/* 169 */     kj entity1 = a(i);
/* 170 */     if (entity1 != null)
/*     */     {
/* 172 */       b(entity1);
/*     */     }
/* 174 */     this.Q.add(entity);
/* 175 */     entity.f = i;
/* 176 */     if (!a(entity))
/*     */     {
/* 178 */       this.R.add(entity);
/*     */     }
/* 180 */     this.P.a(i, entity);
/*     */   }
/*     */ 
/*     */   public kj a(int i)
/*     */   {
/* 185 */     if (this.parentWorld != null)
/* 186 */       throw new WorldLayerException();
/* 187 */     return (kj)this.P.a(i);
/*     */   }
/*     */ 
/*     */   public kj b(int i)
/*     */   {
/* 192 */     if (this.parentWorld != null)
/* 193 */       throw new WorldLayerException();
/* 194 */     kj entity = (kj)this.P.d(i);
/* 195 */     if (entity != null)
/*     */     {
/* 197 */       this.Q.remove(entity);
/* 198 */       b(entity);
/*     */     }
/* 200 */     return entity;
/*     */   }
/*     */ 
/*     */   public boolean c(int i, int j, int k, int l)
/*     */   {
/* 205 */     if (this.parentWorld != null)
/* 206 */       return this.parentWorld.c(i, j + this.shiftY, k, l);
/* 207 */     int i1 = a(i, j, k);
/* 208 */     int j1 = e(i, j, k);
/* 209 */     if (super.c(i, j, k, l))
/*     */     {
/* 211 */       this.M.add(new ky(this, i, j, k, i1, j1));
/* 212 */       return true;
/*     */     }
/*     */ 
/* 215 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b(int i, int j, int k, int l, int i1)
/*     */   {
/* 221 */     if (this.parentWorld != null)
/* 222 */       return this.parentWorld.b(i, j + this.shiftY, k, l, i1);
/* 223 */     int j1 = a(i, j, k);
/* 224 */     int k1 = e(i, j, k);
/* 225 */     if (super.b(i, j, k, l, i1))
/*     */     {
/* 227 */       this.M.add(new ky(this, i, j, k, j1, k1));
/* 228 */       return true;
/*     */     }
/*     */ 
/* 231 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean d(int i, int j, int k, int l)
/*     */   {
/* 237 */     if (this.parentWorld != null)
/* 238 */       return this.parentWorld.d(i, j + this.shiftY, k, l);
/* 239 */     int i1 = a(i, j, k);
/* 240 */     int j1 = e(i, j, k);
/* 241 */     if (super.d(i, j, k, l))
/*     */     {
/* 243 */       this.M.add(new ky(this, i, j, k, i1, j1));
/* 244 */       return true;
/*     */     }
/*     */ 
/* 247 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean c(int i, int j, int k, int l, int i1)
/*     */   {
/* 253 */     if (this.parentWorld != null)
/* 254 */       throw new WorldLayerException();
/* 255 */     a(i, j, k, i, j, k);
/* 256 */     if (super.b(i, j, k, l, i1))
/*     */     {
/* 258 */       h(i, j, k, l);
/* 259 */       return true;
/*     */     }
/*     */ 
/* 262 */     return false;
/*     */   }
/*     */ 
/*     */   public void g()
/*     */   {
/* 268 */     this.N.b(new adw("Quitting"));
/*     */   }
/*     */ 
/*     */   protected void h()
/*     */   {
/* 273 */     if (this.y.e)
/*     */     {
/* 275 */       return;
/*     */     }
/* 277 */     if (this.r > 0)
/*     */     {
/* 279 */       this.r -= 1;
/*     */     }
/* 281 */     this.n = this.o;
/* 282 */     if (this.C.o())
/*     */     {
/* 284 */       this.o = ((float)(this.o + 0.01D));
/*     */     }
/*     */     else {
/* 287 */       this.o = ((float)(this.o - 0.01D));
/*     */     }
/* 289 */     if (this.o < 0.0F)
/*     */     {
/* 291 */       this.o = 0.0F;
/*     */     }
/* 293 */     if (this.o > 1.0F)
/*     */     {
/* 295 */       this.o = 1.0F;
/*     */     }
/* 297 */     this.p = this.q;
/* 298 */     if (this.C.m())
/*     */     {
/* 300 */       this.q = ((float)(this.q + 0.01D));
/*     */     }
/*     */     else {
/* 303 */       this.q = ((float)(this.q - 0.01D));
/*     */     }
/* 305 */     if (this.q < 0.0F)
/*     */     {
/* 307 */       this.q = 0.0F;
/*     */     }
/* 309 */     if (this.q > 1.0F)
/*     */     {
/* 311 */       this.q = 1.0F;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     gx
 * JD-Core Version:    0.6.2
 */