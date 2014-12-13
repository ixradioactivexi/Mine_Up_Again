/*     */ import java.util.List;
/*     */ 
/*     */ public class rl
/*     */ {
/*     */   private long a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   private long e;
/*     */   private long f;
/*     */   private long g;
/*     */   private xb h;
/*     */   private int i;
/*     */   private String j;
/*     */   private int k;
/*     */   private boolean l;
/*     */   private int m;
/*     */   private boolean n;
/*     */   private int o;
/*     */   private int p;
/*     */   private boolean q;
/*     */ 
/*     */   public rl(xb nbttagcompound)
/*     */   {
/*  16 */     this.a = nbttagcompound.f("RandomSeed");
/*  17 */     this.p = nbttagcompound.e("GameType");
/*  18 */     if (nbttagcompound.b("MapFeatures"))
/*     */     {
/*  20 */       this.q = nbttagcompound.m("MapFeatures");
/*     */     }
/*     */     else {
/*  23 */       this.q = true;
/*     */     }
/*  25 */     this.b = nbttagcompound.e("SpawnX");
/*  26 */     this.c = nbttagcompound.e("SpawnY");
/*  27 */     this.d = nbttagcompound.e("SpawnZ");
/*  28 */     this.e = nbttagcompound.f("Time");
/*  29 */     this.f = nbttagcompound.f("LastPlayed");
/*  30 */     this.g = nbttagcompound.f("SizeOnDisk");
/*  31 */     this.j = nbttagcompound.i("LevelName");
/*  32 */     this.k = nbttagcompound.e("version");
/*  33 */     this.m = nbttagcompound.e("rainTime");
/*  34 */     this.l = nbttagcompound.m("raining");
/*  35 */     this.o = nbttagcompound.e("thunderTime");
/*  36 */     this.n = nbttagcompound.m("thundering");
/*  37 */     if (nbttagcompound.b("Player"))
/*     */     {
/*  39 */       this.h = nbttagcompound.k("Player");
/*  40 */       this.i = this.h.e("Dimension");
/*     */     }
/*     */   }
/*     */ 
/*     */   public rl(dx worldsettings, String s)
/*     */   {
/*  46 */     this.a = worldsettings.a();
/*  47 */     this.p = worldsettings.b();
/*  48 */     this.q = worldsettings.c();
/*  49 */     this.j = s;
/*     */   }
/*     */ 
/*     */   public rl(rl worldinfo)
/*     */   {
/*  54 */     this.a = worldinfo.a;
/*  55 */     this.p = worldinfo.p;
/*  56 */     this.q = worldinfo.q;
/*  57 */     this.b = worldinfo.b;
/*  58 */     this.c = worldinfo.c;
/*  59 */     this.d = worldinfo.d;
/*  60 */     this.e = worldinfo.e;
/*  61 */     this.f = worldinfo.f;
/*  62 */     this.g = worldinfo.g;
/*  63 */     this.h = worldinfo.h;
/*  64 */     this.i = worldinfo.i;
/*  65 */     this.j = worldinfo.j;
/*  66 */     this.k = worldinfo.k;
/*  67 */     this.m = worldinfo.m;
/*  68 */     this.l = worldinfo.l;
/*  69 */     this.o = worldinfo.o;
/*  70 */     this.n = worldinfo.n;
/*     */   }
/*     */ 
/*     */   public xb a()
/*     */   {
/*  75 */     xb nbttagcompound = new xb();
/*  76 */     a(nbttagcompound, this.h);
/*  77 */     return nbttagcompound;
/*     */   }
/*     */ 
/*     */   public xb a(List list)
/*     */   {
/*  82 */     xb nbttagcompound = new xb();
/*  83 */     sz entityplayer = null;
/*  84 */     xb nbttagcompound1 = null;
/*  85 */     if (list.size() > 0)
/*     */     {
/*  87 */       entityplayer = (sz)list.get(0);
/*     */     }
/*  89 */     if (entityplayer != null)
/*     */     {
/*  91 */       nbttagcompound1 = new xb();
/*  92 */       entityplayer.d(nbttagcompound1);
/*     */     }
/*  94 */     a(nbttagcompound, nbttagcompound1);
/*  95 */     return nbttagcompound;
/*     */   }
/*     */ 
/*     */   private void a(xb nbttagcompound, xb nbttagcompound1)
/*     */   {
/* 100 */     nbttagcompound.a("RandomSeed", this.a);
/* 101 */     nbttagcompound.a("GameType", this.p);
/* 102 */     nbttagcompound.a("MapFeatures", this.q);
/* 103 */     nbttagcompound.a("SpawnX", this.b);
/* 104 */     nbttagcompound.a("SpawnY", this.c);
/* 105 */     nbttagcompound.a("SpawnZ", this.d);
/* 106 */     nbttagcompound.a("Time", this.e);
/* 107 */     nbttagcompound.a("SizeOnDisk", this.g);
/* 108 */     nbttagcompound.a("LastPlayed", System.currentTimeMillis());
/* 109 */     nbttagcompound.a("LevelName", this.j);
/* 110 */     nbttagcompound.a("version", this.k);
/* 111 */     nbttagcompound.a("rainTime", this.m);
/* 112 */     nbttagcompound.a("raining", this.l);
/* 113 */     nbttagcompound.a("thunderTime", this.o);
/* 114 */     nbttagcompound.a("thundering", this.n);
/* 115 */     if (nbttagcompound1 != null)
/*     */     {
/* 117 */       nbttagcompound.a("Player", nbttagcompound1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public long b()
/*     */   {
/* 123 */     return this.a;
/*     */   }
/*     */ 
/*     */   public int c()
/*     */   {
/* 128 */     return this.b;
/*     */   }
/*     */ 
/*     */   public int d()
/*     */   {
/* 133 */     return this.c;
/*     */   }
/*     */ 
/*     */   public int e()
/*     */   {
/* 138 */     return this.d;
/*     */   }
/*     */ 
/*     */   public long f()
/*     */   {
/* 143 */     return this.e;
/*     */   }
/*     */ 
/*     */   public long g()
/*     */   {
/* 148 */     return this.g;
/*     */   }
/*     */ 
/*     */   public xb h()
/*     */   {
/* 153 */     return this.h;
/*     */   }
/*     */ 
/*     */   public int i()
/*     */   {
/* 158 */     return this.i;
/*     */   }
/*     */ 
/*     */   public void setDimension(int x)
/*     */   {
/* 163 */     this.i = x;
/*     */   }
/*     */ 
/*     */   public void a(int i)
/*     */   {
/* 168 */     this.b = i;
/*     */   }
/*     */ 
/*     */   public void b(int i)
/*     */   {
/* 173 */     this.c = i;
/*     */   }
/*     */ 
/*     */   public void c(int i)
/*     */   {
/* 178 */     this.d = i;
/*     */   }
/*     */ 
/*     */   public void a(long l)
/*     */   {
/* 183 */     this.e = l;
/*     */   }
/*     */ 
/*     */   public void b(long l)
/*     */   {
/* 188 */     this.g = l;
/*     */   }
/*     */ 
/*     */   public void a(xb nbttagcompound)
/*     */   {
/* 193 */     this.h = nbttagcompound;
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, int k)
/*     */   {
/* 198 */     this.b = i;
/* 199 */     this.c = j;
/* 200 */     this.d = k;
/*     */   }
/*     */ 
/*     */   public String j()
/*     */   {
/* 205 */     return this.j;
/*     */   }
/*     */ 
/*     */   public void a(String s)
/*     */   {
/* 210 */     this.j = s;
/*     */   }
/*     */ 
/*     */   public int k()
/*     */   {
/* 215 */     return this.k;
/*     */   }
/*     */ 
/*     */   public void d(int i)
/*     */   {
/* 220 */     this.k = i;
/*     */   }
/*     */ 
/*     */   public long l()
/*     */   {
/* 225 */     return this.f;
/*     */   }
/*     */ 
/*     */   public boolean m()
/*     */   {
/* 230 */     return this.n;
/*     */   }
/*     */ 
/*     */   public void a(boolean flag)
/*     */   {
/* 235 */     this.n = flag;
/*     */   }
/*     */ 
/*     */   public int n()
/*     */   {
/* 240 */     return this.o;
/*     */   }
/*     */ 
/*     */   public void e(int i)
/*     */   {
/* 245 */     this.o = i;
/*     */   }
/*     */ 
/*     */   public boolean o()
/*     */   {
/* 250 */     return this.l;
/*     */   }
/*     */ 
/*     */   public void b(boolean flag)
/*     */   {
/* 255 */     this.l = flag;
/*     */   }
/*     */ 
/*     */   public int p()
/*     */   {
/* 260 */     return this.m;
/*     */   }
/*     */ 
/*     */   public void f(int i)
/*     */   {
/* 265 */     this.m = i;
/*     */   }
/*     */ 
/*     */   public int q()
/*     */   {
/* 270 */     return this.p;
/*     */   }
/*     */ 
/*     */   public void setGameType(int gameType)
/*     */   {
/* 275 */     this.p = gameType;
/*     */   }
/*     */ 
/*     */   public boolean r()
/*     */   {
/* 281 */     return this.q;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     rl
 * JD-Core Version:    0.6.2
 */