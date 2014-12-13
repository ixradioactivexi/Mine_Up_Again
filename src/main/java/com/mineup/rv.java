/*      */ import java.io.PrintStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.TreeSet;
/*      */ 
/*      */ public class rv
/*      */   implements adg
/*      */ {
/*   46 */   private ArrayList<jm> tickEntryPool = new ArrayList();
/*      */   protected rv parentWorld;
/*      */   protected int shiftY;
/*      */   public int worldNum;
/*  123 */   protected SpawnContext spawnContext = new SpawnContext(this, 3);
/*      */   protected TreeSet N;
/*      */   protected Set O;
/* 3494 */   public final int a = 7;
/* 3495 */   public final int b = 11;
/* 3496 */   public final int c = 128;
/* 3497 */   public final int d = 127;
/* 3498 */   public final int e = 63;
/*      */   public boolean f;
/*      */   public List g;
/*      */   protected List M;
/*      */   public List h;
/*      */   private List P;
/*      */   private List Q;
/*      */   public List i;
/*      */   public List j;
/*      */   private long R;
/*      */   public int k;
/*      */   protected int l;
/* 3510 */   protected final int m = 1013904223;
/*      */   protected float n;
/*      */   protected float o;
/*      */   protected float p;
/*      */   protected float q;
/*      */   protected int r;
/*      */   public int s;
/*      */   public boolean t;
/*      */   private long S;
/*      */   public int u;
/*      */   public int v;
/*      */   public Random w;
/*      */   public boolean x;
/*      */   public acz y;
/*      */   protected List z;
/*      */   protected bf A;
/*      */   protected final acq B;
/*      */   protected rl C;
/*      */   public boolean D;
/*      */   protected boolean T;
/*      */   public td E;
/*      */   protected ArrayList U;
/*      */   protected boolean V;
/*      */   protected boolean F;
/*      */   protected boolean G;
/*      */   protected Set W;
/*      */   protected int X;
/*      */   int[] H;
/*      */   protected List Y;
/*      */   public boolean I;
/*      */   public double J;
/*      */   public double K;
/*      */   public double L;
/*      */ 
/*      */   public void getChunksNear(Collection<oh> list, double x, double y, double z)
/*      */   {
/*   29 */     int j = et.b(x / 16.0D);
/*   30 */     int l = et.b(z / 16.0D);
/*   31 */     byte byte0 = 9;
/*   32 */     for (int j1 = -byte0; j1 <= byte0; j1++)
/*      */     {
/*   34 */       for (int k2 = -byte0; k2 <= byte0; k2++)
/*      */       {
/*   36 */         list.add(new oh(j1 + j, k2 + l));
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void getChunksNearEntity(Collection<oh> list, kj entity)
/*      */   {
/*   43 */     getChunksNear(list, entity.o, entity.p, entity.q);
/*      */   }
/*      */ 
/*      */   private jm getEntryFromPool(int i, int j, int k, int l)
/*      */   {
/*   50 */     if (this.tickEntryPool.size() > 0)
/*      */     {
/*   52 */       jm entry = (jm)this.tickEntryPool.get(this.tickEntryPool.size() - 1);
/*   53 */       entry.setParameters(i, j, k, l);
/*   54 */       return entry;
/*      */     }
/*   56 */     return new jm(i, j, k, l);
/*      */   }
/*      */ 
/*      */   private void returnToPool(jm nextticklistentry) {
/*   60 */     this.tickEntryPool.add(nextticklistentry);
/*      */   }
/*      */ 
/*      */   public static int distanceToChunk(int chunkX, int chunkZ, int chunkY, double posX, double posY, double posZ)
/*      */   {
/*   65 */     posX /= 16.0D;
/*   66 */     posY /= 128.0D;
/*   67 */     posZ /= 16.0D;
/*   68 */     double dx = 0.0D;
/*   69 */     if (posX < chunkX)
/*   70 */       dx = chunkX - posX;
/*   71 */     else if (posX > chunkX + 1)
/*   72 */       dx = posX - chunkX - 1.0D;
/*   73 */     double dz = 0.0D;
/*   74 */     if (posZ < chunkZ)
/*   75 */       dz = chunkZ - posZ;
/*   76 */     else if (posZ > chunkZ + 1)
/*   77 */       dz = posZ - chunkZ - 1.0D;
/*   78 */     double dy = 0.0D;
/*   79 */     if (posY < chunkY)
/*   80 */       dy = chunkY - posY;
/*   81 */     else if (posY > chunkY + 1)
/*   82 */       dy = posY - chunkY - 1.0D;
/*   83 */     return (int)Math.sqrt(dx * dx + dy * dy * 64.0D * 9.0D + dz * dz);
/*      */   }
/*      */ 
/*      */   public int getVoidFogY() {
/*   87 */     return 0;
/*      */   }
/*      */ 
/*      */   public adg createChunkCache(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/*   92 */     return new cv(this, i, j, k, l, i1, j1);
/*      */   }
/*      */ 
/*      */   protected void setParent(rv parentWorld, int shiftY, int worldNum)
/*      */   {
/*   99 */     this.parentWorld = parentWorld;
/*  100 */     this.shiftY = shiftY;
/*  101 */     this.worldNum = worldNum;
/*  102 */     this.y.a(this);
/*      */   }
/*      */ 
/*      */   public int getWorldMinY()
/*      */   {
/*  107 */     return 0;
/*      */   }
/*      */ 
/*      */   public int getWorldMaxY() {
/*  111 */     return getWorldHeight();
/*      */   }
/*      */ 
/*      */   public int getWorldHeight() {
/*  115 */     return 128;
/*      */   }
/*      */ 
/*      */   public int getGravity(int y)
/*      */   {
/*  120 */     return 1;
/*      */   }
/*      */ 
/*      */   public nu a()
/*      */   {
/*  129 */     return this.y.b;
/*      */   }
/*      */ 
/*      */   public rv(acq isavehandler, String s, acz worldprovider, dx worldsettings)
/*      */   {
/*  134 */     this.f = false;
/*  135 */     this.g = new EntitiesCollection();
/*  136 */     this.M = new ArrayList();
/*  137 */     this.N = new TreeSet();
/*  138 */     this.O = new HashSet();
/*  139 */     this.h = new ArrayList();
/*  140 */     this.P = new ArrayList();
/*  141 */     this.Q = new ArrayList();
/*  142 */     this.i = new ArrayList();
/*  143 */     this.j = new ArrayList();
/*  144 */     this.R = 16777215L;
/*  145 */     this.k = 0;
/*  146 */     this.l = new Random().nextInt();
/*  147 */     this.r = 0;
/*  148 */     this.s = 0;
/*  149 */     this.t = false;
/*  150 */     this.S = System.currentTimeMillis();
/*  151 */     this.u = 40;
/*  152 */     this.w = new Random();
/*  153 */     this.x = false;
/*  154 */     this.z = new ArrayList();
/*  155 */     this.U = new ArrayList();
/*  156 */     this.F = true;
/*  157 */     this.G = true;
/*  158 */     this.W = new HashSet();
/*  159 */     this.X = this.w.nextInt(12000);
/*  160 */     this.H = new int[32768];
/*  161 */     this.Y = new ArrayList();
/*  162 */     this.I = false;
/*  163 */     this.B = isavehandler;
/*  164 */     if (worldsettings.getWorldLayers() != null)
/*  165 */       this.C = new ExtendedWorldInfo(worldsettings, s);
/*  166 */     else this.C = new rl(worldsettings, s);
/*  167 */     this.y = worldprovider;
/*  168 */     this.E = new td(isavehandler);
/*  169 */     worldprovider.a(this);
/*  170 */     this.A = d();
/*  171 */     o();
/*  172 */     F();
/*      */   }
/*      */ 
/*      */   public rv(rv world, int dimension)
/*      */   {
/*  177 */     this(world, ExtendedWorldProvider.getProviderForWorldType("world"));
/*  178 */     this.C.setDimension(dimension);
/*      */   }
/*      */ 
/*      */   public rv(rv world, acz worldprovider, rl info)
/*      */   {
/*  183 */     this.f = false;
/*  184 */     this.g = new EntitiesCollection();
/*  185 */     this.M = new ArrayList();
/*  186 */     this.N = new TreeSet();
/*  187 */     this.O = new HashSet();
/*  188 */     this.h = new ArrayList();
/*  189 */     this.P = new ArrayList();
/*  190 */     this.Q = new ArrayList();
/*  191 */     this.i = new ArrayList();
/*  192 */     this.j = new ArrayList();
/*  193 */     this.R = 16777215L;
/*  194 */     this.k = 0;
/*  195 */     this.l = new Random().nextInt();
/*  196 */     this.r = 0;
/*  197 */     this.s = 0;
/*  198 */     this.t = false;
/*  199 */     this.S = System.currentTimeMillis();
/*  200 */     this.u = 40;
/*  201 */     this.w = new Random();
/*  202 */     this.x = false;
/*  203 */     this.z = new ArrayList();
/*  204 */     this.U = new ArrayList();
/*  205 */     this.F = true;
/*  206 */     this.G = true;
/*  207 */     this.W = new HashSet();
/*  208 */     this.X = this.w.nextInt(12000);
/*  209 */     this.H = new int[32768];
/*  210 */     this.Y = new ArrayList();
/*  211 */     this.I = false;
/*  212 */     this.S = world.S;
/*  213 */     this.B = world.B;
/*  214 */     this.C = info;
/*  215 */     this.E = new td(this.B);
/*  216 */     this.y = worldprovider;
/*  217 */     worldprovider.a(this);
/*  218 */     this.A = d();
/*  219 */     o();
/*  220 */     F();
/*      */   }
/*      */ 
/*      */   public rv(rv world, acz worldprovider)
/*      */   {
/*  225 */     this(world, worldprovider, world.x());
/*      */   }
/*      */ 
/*      */   public rv(acq isavehandler, String s, dx worldsettings)
/*      */   {
/*  230 */     this(isavehandler, s, worldsettings, (acz)null);
/*      */   }
/*      */ 
/*      */   public rv(acq isavehandler, String s, dx worldsettings, acz worldprovider)
/*      */   {
/*  235 */     this.f = false;
/*  236 */     this.g = new EntitiesCollection();
/*  237 */     this.M = new ArrayList();
/*  238 */     this.N = new TreeSet();
/*  239 */     this.O = new HashSet();
/*  240 */     this.h = new ArrayList();
/*  241 */     this.P = new ArrayList();
/*  242 */     this.Q = new ArrayList();
/*  243 */     this.i = new ArrayList();
/*  244 */     this.j = new ArrayList();
/*  245 */     this.R = 16777215L;
/*  246 */     this.k = 0;
/*  247 */     this.l = new Random().nextInt();
/*  248 */     this.r = 0;
/*  249 */     this.s = 0;
/*  250 */     this.t = false;
/*  251 */     this.S = System.currentTimeMillis();
/*  252 */     this.u = 40;
/*  253 */     this.w = new Random();
/*  254 */     this.x = false;
/*  255 */     this.z = new ArrayList();
/*  256 */     this.U = new ArrayList();
/*  257 */     this.F = true;
/*  258 */     this.G = true;
/*  259 */     this.W = new HashSet();
/*  260 */     this.X = this.w.nextInt(12000);
/*  261 */     this.H = new int[32768];
/*  262 */     this.Y = new ArrayList();
/*  263 */     this.I = false;
/*  264 */     this.B = isavehandler;
/*  265 */     this.E = new td(isavehandler);
/*  266 */     this.C = isavehandler.c();
/*  267 */     this.x = (this.C == null);
/*  268 */     if (worldprovider != null)
/*      */     {
/*  270 */       this.y = worldprovider;
/*      */     }
/*  272 */     else if ((this.C != null) && (this.C.i() == -1))
/*      */     {
/*  274 */       this.y = acz.a(-1);
/*      */     }
/*      */     else {
/*  277 */       this.y = acz.a(0);
/*      */     }
/*  279 */     boolean flag = false;
/*  280 */     if (this.C == null)
/*      */     {
/*  282 */       if (worldsettings.getWorldLayers() != null)
/*  283 */         this.C = new ExtendedWorldInfo(worldsettings, s);
/*      */       else
/*  285 */         this.C = new rl(worldsettings, s);
/*  286 */       flag = true;
/*      */     }
/*      */     else {
/*  289 */       this.C.a(s);
/*      */     }
/*  291 */     this.y.a(this);
/*  292 */     this.A = d();
/*  293 */     if (flag)
/*      */     {
/*  295 */       i();
/*      */     }
/*  297 */     o();
/*  298 */     F();
/*      */   }
/*      */ 
/*      */   protected bf d()
/*      */   {
/*  303 */     pl ichunkloader = this.B.a(this.y);
/*  304 */     return new ic(this, ichunkloader, this.y.b());
/*      */   }
/*      */ 
/*      */   protected void i()
/*      */   {
/*  309 */     this.D = true;
/*  310 */     nu worldchunkmanager = a();
/*  311 */     List list = worldchunkmanager.a();
/*  312 */     Random random = new Random(s());
/*  313 */     mw chunkposition = worldchunkmanager.a(0, 0, 256, list, random);
/*  314 */     int i = 0;
/*  315 */     byte byte0 = 64;
/*  316 */     int j = 0;
/*  317 */     if (chunkposition != null)
/*      */     {
/*  319 */       i = chunkposition.a;
/*  320 */       j = chunkposition.c;
/*      */     }
/*      */     else {
/*  323 */       System.out.println("Unable to find spawn biome");
/*      */     }
/*  325 */     int k = 0;
/*      */     do
/*      */     {
/*  328 */       if (this.y.a(i, j))
/*      */       {
/*      */         break;
/*      */       }
/*  332 */       i += random.nextInt(64) - random.nextInt(64);
/*  333 */       j += random.nextInt(64) - random.nextInt(64);
/*  334 */       k++; } while (k != 1000);
/*  335 */     this.C.a(i, byte0, j);
/*  336 */     this.D = false;
/*      */   }
/*      */ 
/*      */   public void e()
/*      */   {
/*  341 */     if (this.C.d() <= 0)
/*      */     {
/*  343 */       this.C.b(64);
/*      */     }
/*  345 */     int i = this.C.c();
/*  346 */     int j = this.C.e();
/*  347 */     int k = 0;
/*      */     do
/*      */     {
/*  350 */       if (a(i, j) != 0)
/*      */       {
/*      */         break;
/*      */       }
/*  354 */       i += this.w.nextInt(8) - this.w.nextInt(8);
/*  355 */       j += this.w.nextInt(8) - this.w.nextInt(8);
/*  356 */       k++; } while (k != 10000);
/*  357 */     this.C.a(i);
/*  358 */     this.C.c(j);
/*      */   }
/*      */ 
/*      */   public int a(int i, int j)
/*      */   {
/*  364 */     for (int k = 63; !i(i, k + 1, j); k++);
/*  365 */     return a(i, k, j);
/*      */   }
/*      */ 
/*      */   public void j()
/*      */   {
/*      */   }
/*      */ 
/*      */   public void prepareToSpawnPlayer(sz thePlayer)
/*      */   {
/*  374 */     if ((this.A instanceof fx))
/*      */     {
/*  376 */       fx chunkproviderloadorgenerate = (fx)this.A;
/*  377 */       int i = et.d((int)thePlayer.o) >> 4;
/*  378 */       int j = et.d((int)thePlayer.q) >> 4;
/*  379 */       chunkproviderloadorgenerate.d(i, j);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer)
/*      */   {
/*      */     try
/*      */     {
/*  387 */       xb nbttagcompound = this.C.h();
/*  388 */       if (nbttagcompound != null)
/*      */       {
/*  390 */         entityplayer.e(nbttagcompound);
/*  391 */         this.C.a(null);
/*      */       }
/*  393 */       if ((this.A instanceof fx))
/*      */       {
/*  395 */         fx chunkproviderloadorgenerate = (fx)this.A;
/*  396 */         int i = et.d((int)entityplayer.o) >> 4;
/*  397 */         int j = et.d((int)entityplayer.q) >> 4;
/*  398 */         chunkproviderloadorgenerate.d(i, j);
/*      */       }
/*  400 */       a(entityplayer);
/*      */     }
/*      */     catch (Exception exception)
/*      */     {
/*  404 */       exception.printStackTrace();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(boolean flag, ny iprogressupdate)
/*      */   {
/*  410 */     if (!this.A.b())
/*      */     {
/*  412 */       return;
/*      */     }
/*  414 */     if (iprogressupdate != null)
/*      */     {
/*  416 */       iprogressupdate.b("Saving level");
/*      */     }
/*  418 */     E();
/*  419 */     if (iprogressupdate != null)
/*      */     {
/*  421 */       iprogressupdate.d("Saving chunks");
/*      */     }
/*  423 */     this.A.a(flag, iprogressupdate);
/*      */   }
/*      */ 
/*      */   private void E()
/*      */   {
/*  428 */     r();
/*  429 */     if (this.parentWorld == null)
/*  430 */       this.B.a(this.C, this.i);
/*  431 */     this.E.a();
/*      */   }
/*      */ 
/*      */   public boolean c(int i)
/*      */   {
/*  436 */     if (!this.A.b())
/*      */     {
/*  438 */       return true;
/*      */     }
/*  440 */     if (i == 0)
/*      */     {
/*  442 */       E();
/*      */     }
/*  444 */     return this.A.a(false, null);
/*      */   }
/*      */ 
/*      */   public int a(int i, int j, int k)
/*      */   {
/*  449 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  451 */       return 0;
/*      */     }
/*  453 */     if (j < 0)
/*      */     {
/*  455 */       return 0;
/*      */     }
/*  457 */     if (j >= getWorldHeight())
/*      */     {
/*  459 */       return 0;
/*      */     }
/*      */ 
/*  462 */     return c(i >> 4, k >> 4).a(i & 0xF, j, k & 0xF);
/*      */   }
/*      */ 
/*      */   public boolean i(int i, int j, int k)
/*      */   {
/*  468 */     int iBlockID = a(i, j, k);
/*  469 */     if (iBlockID == 0)
/*  470 */       return true;
/*  471 */     return MineUpForgeAdapter.get().blockIsAirBlock(lr.m[iBlockID], this, i, j, k);
/*      */   }
/*      */ 
/*      */   public boolean d(int i, int j, int k)
/*      */   {
/*  476 */     if ((j < 0) || (j >= getWorldHeight()))
/*      */     {
/*  478 */       return false;
/*      */     }
/*      */ 
/*  481 */     return g(i >> 4, k >> 4);
/*      */   }
/*      */ 
/*      */   public boolean e(int i, int j, int k, int l)
/*      */   {
/*  487 */     return b(i - l, j - l, k - l, i + l, j + l, k + l);
/*      */   }
/*      */ 
/*      */   public boolean b(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/*  492 */     if ((i1 < 0) || (j >= getWorldHeight()))
/*      */     {
/*  494 */       return false;
/*      */     }
/*  496 */     i >>= 4;
/*  497 */     j >>= 4;
/*  498 */     k >>= 4;
/*  499 */     l >>= 4;
/*  500 */     i1 >>= 4;
/*  501 */     j1 >>= 4;
/*  502 */     for (int k1 = i; k1 <= l; k1++)
/*      */     {
/*  504 */       for (int l1 = k; l1 <= j1; l1++)
/*      */       {
/*  506 */         if (!g(k1, l1))
/*      */         {
/*  508 */           return false;
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  514 */     return true;
/*      */   }
/*      */ 
/*      */   private boolean g(int i, int j)
/*      */   {
/*  519 */     return this.A.a(i, j);
/*      */   }
/*      */ 
/*      */   public vy b(int i, int j)
/*      */   {
/*  524 */     return c(i >> 4, j >> 4);
/*      */   }
/*      */ 
/*      */   public vy getChunkFromBlockCoords(int i, int j, int k)
/*      */   {
/*  529 */     return c(i >> 4, k >> 4);
/*      */   }
/*      */ 
/*      */   public vy c(int i, int j)
/*      */   {
/*  534 */     return this.A.b(i, j);
/*      */   }
/*      */ 
/*      */   public boolean b(int i, int j, int k, int l, int i1)
/*      */   {
/*  539 */     if (this.parentWorld != null)
/*      */     {
/*  541 */       return this.parentWorld.b(i, j + this.shiftY, k, l, i1);
/*      */     }
/*  543 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  545 */       return false;
/*      */     }
/*  547 */     if (j < 0)
/*      */     {
/*  549 */       return false;
/*      */     }
/*  551 */     if (j >= getWorldHeight())
/*      */     {
/*  553 */       return false;
/*      */     }
/*      */ 
/*  556 */     vy chunk = c(i >> 4, k >> 4);
/*  557 */     boolean flag = chunk.a(i & 0xF, j, k & 0xF, l, i1);
/*  558 */     p(i, j, k);
/*  559 */     return flag;
/*      */   }
/*      */ 
/*      */   public boolean d(int i, int j, int k, int l)
/*      */   {
/*  565 */     if (this.parentWorld != null)
/*      */     {
/*  567 */       return this.parentWorld.d(i, j + this.shiftY, k, l);
/*      */     }
/*  569 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  571 */       return false;
/*      */     }
/*  573 */     if (j < 0)
/*      */     {
/*  575 */       return false;
/*      */     }
/*  577 */     if (j >= getWorldHeight())
/*      */     {
/*  579 */       return false;
/*      */     }
/*      */ 
/*  582 */     vy chunk = c(i >> 4, k >> 4);
/*  583 */     boolean flag = chunk.a(i & 0xF, j, k & 0xF, l);
/*  584 */     p(i, j, k);
/*  585 */     return flag;
/*      */   }
/*      */ 
/*      */   public wa f(int i, int j, int k)
/*      */   {
/*  591 */     int l = a(i, j, k);
/*  592 */     if (l == 0)
/*      */     {
/*  594 */       return wa.a;
/*      */     }
/*      */ 
/*  597 */     return lr.m[l].bN;
/*      */   }
/*      */ 
/*      */   public int e(int i, int j, int k)
/*      */   {
/*  603 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  605 */       return 0;
/*      */     }
/*  607 */     if (j < 0)
/*      */     {
/*  609 */       return 0;
/*      */     }
/*  611 */     if (j >= getWorldHeight())
/*      */     {
/*  613 */       return 0;
/*      */     }
/*      */ 
/*  616 */     vy chunk = c(i >> 4, k >> 4);
/*  617 */     i &= 15;
/*  618 */     k &= 15;
/*  619 */     return chunk.b(i, j, k);
/*      */   }
/*      */ 
/*      */   public void f(int i, int j, int k, int l)
/*      */   {
/*  625 */     if (this.parentWorld != null)
/*      */     {
/*  627 */       this.parentWorld.f(i, j + this.shiftY, k, l);
/*  628 */       return;
/*      */     }
/*  630 */     if (c(i, j, k, l))
/*      */     {
/*  632 */       int i1 = a(i, j, k);
/*  633 */       if (lr.t[(i1 & 0xFF)] != 0)
/*      */       {
/*  635 */         h(i, j, k, i1);
/*      */       }
/*      */       else
/*  638 */         j(i, j, k, i1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean c(int i, int j, int k, int l)
/*      */   {
/*  645 */     if (this.parentWorld != null)
/*  646 */       return this.parentWorld.c(i, j + this.shiftY, k, l);
/*  647 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  649 */       return false;
/*      */     }
/*  651 */     if (j < 0)
/*      */     {
/*  653 */       return false;
/*      */     }
/*  655 */     if (j >= getWorldHeight())
/*      */     {
/*  657 */       return false;
/*      */     }
/*      */ 
/*  660 */     vy chunk = c(i >> 4, k >> 4);
/*  661 */     i &= 15;
/*  662 */     k &= 15;
/*  663 */     chunk.b(i, j, k, l);
/*  664 */     return true;
/*      */   }
/*      */ 
/*      */   public boolean g(int i, int j, int k, int l)
/*      */   {
/*  670 */     if (this.parentWorld != null)
/*      */     {
/*  672 */       return this.parentWorld.g(i, j + this.shiftY, k, l);
/*      */     }
/*  674 */     if (d(i, j, k, l))
/*      */     {
/*  676 */       h(i, j, k, l);
/*  677 */       return true;
/*      */     }
/*      */ 
/*  680 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean d(int i, int j, int k, int l, int i1)
/*      */   {
/*  686 */     if (this.parentWorld != null)
/*  687 */       return this.parentWorld.b(i, j + this.shiftY, k, l, i1);
/*  688 */     if (b(i, j, k, l, i1))
/*      */     {
/*  690 */       h(i, j, k, l);
/*  691 */       return true;
/*      */     }
/*      */ 
/*  694 */     return false;
/*      */   }
/*      */ 
/*      */   public void j(int i, int j, int k)
/*      */   {
/*  700 */     if (this.parentWorld != null)
/*      */     {
/*  702 */       this.parentWorld.j(i, j, k);
/*  703 */       return;
/*      */     }
/*  705 */     for (int l = 0; l < this.z.size(); l++)
/*      */     {
/*  707 */       ((yj)this.z.get(l)).a(i, j, k);
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void h(int i, int j, int k, int l)
/*      */   {
/*  714 */     j(i, j, k);
/*  715 */     j(i, j, k, l);
/*      */   }
/*      */ 
/*      */   public void i(int i, int j, int k, int l)
/*      */   {
/*  720 */     if (this.parentWorld != null)
/*      */     {
/*  722 */       this.parentWorld.i(i, j, k + this.shiftY, l + this.shiftY);
/*  723 */       return;
/*      */     }
/*  725 */     if (k > l)
/*      */     {
/*  727 */       int i1 = l;
/*  728 */       l = k;
/*  729 */       k = i1;
/*      */     }
/*  731 */     for (int j1 = k; j1 <= l; j1++)
/*      */     {
/*  733 */       c(rf.a, i, j1, j);
/*      */     }
/*      */ 
/*  736 */     c(i, k, j, i, l, j);
/*      */   }
/*      */ 
/*      */   public void k(int i, int j, int k)
/*      */   {
/*  741 */     if (this.parentWorld != null)
/*      */     {
/*  745 */       throw new WorldLayerException();
/*      */     }
/*  747 */     for (int l = 0; l < this.z.size(); l++)
/*      */     {
/*  749 */       ((yj)this.z.get(l)).b(i, j, k, i, j, k);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void c(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/*  756 */     if (this.parentWorld != null)
/*      */     {
/*  758 */       this.parentWorld.c(i, j + this.shiftY, k, l, i1 + this.shiftY, j1);
/*  759 */       return;
/*      */     }
/*  761 */     for (int k1 = 0; k1 < this.z.size(); k1++)
/*      */     {
/*  763 */       ((yj)this.z.get(k1)).b(i, j, k, l, i1, j1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onBlockAdded(int id, int i, int j, int k)
/*      */   {
/*  770 */     if (this.parentWorld != null)
/*  771 */       this.parentWorld.onBlockAdded(id, i, j + this.shiftY, k);
/*  772 */     else lr.m[id].a(this, i, j, k);
/*      */   }
/*      */ 
/*      */   public void onBlockRemoval(int id, int i, int j, int k)
/*      */   {
/*  777 */     if (this.parentWorld != null)
/*  778 */       this.parentWorld.onBlockRemoval(id, i, j + this.shiftY, k);
/*  779 */     else lr.m[id].b_(this, i, j, k);
/*      */   }
/*      */ 
/*      */   public void j(int i, int j, int k, int l)
/*      */   {
/*  784 */     if (this.parentWorld != null)
/*      */     {
/*  786 */       this.parentWorld.j(i, j + this.shiftY, k, l);
/*  787 */       return;
/*      */     }
/*  789 */     m(i - 1, j, k, l);
/*  790 */     m(i + 1, j, k, l);
/*  791 */     m(i, j - 1, k, l);
/*  792 */     m(i, j + 1, k, l);
/*  793 */     m(i, j, k - 1, l);
/*  794 */     m(i, j, k + 1, l);
/*      */   }
/*      */ 
/*      */   private void m(int i, int j, int k, int l)
/*      */   {
/*  799 */     if (this.parentWorld != null)
/*  800 */       throw new WorldLayerException();
/*  801 */     if ((this.t) || (this.I))
/*      */     {
/*  803 */       return;
/*      */     }
/*  805 */     lr block = lr.m[a(i, j, k)];
/*  806 */     if (block != null)
/*      */     {
/*  808 */       block.a(this, i, j, k, l);
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean l(int i, int j, int k)
/*      */   {
/*  814 */     return c(i >> 4, k >> 4).c(i & 0xF, j, k & 0xF);
/*      */   }
/*      */ 
/*      */   public int m(int i, int j, int k)
/*      */   {
/*  819 */     if (j < 0)
/*      */     {
/*  821 */       return 0;
/*      */     }
/*  823 */     if (j >= getWorldHeight())
/*      */     {
/*  825 */       j = getWorldHeight() - 1;
/*      */     }
/*  827 */     return c(i >> 4, k >> 4).c(i & 0xF, j, k & 0xF, 0);
/*      */   }
/*      */ 
/*      */   public int n(int i, int j, int k)
/*      */   {
/*  832 */     return a(i, j, k, true);
/*      */   }
/*      */ 
/*      */   public int a(int i, int j, int k, boolean flag)
/*      */   {
/*  837 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  839 */       return 15;
/*      */     }
/*  841 */     if (flag)
/*      */     {
/*  843 */       int l = a(i, j, k);
/*  844 */       if ((l == lr.al.bA) || (l == lr.aB.bA) || (l == lr.aI.bA) || (l == lr.au.bA))
/*      */       {
/*  846 */         int i1 = a(i, j + 1, k, false);
/*  847 */         int j1 = a(i + 1, j, k, false);
/*  848 */         int k1 = a(i - 1, j, k, false);
/*  849 */         int l1 = a(i, j, k + 1, false);
/*  850 */         int i2 = a(i, j, k - 1, false);
/*  851 */         if (j1 > i1)
/*      */         {
/*  853 */           i1 = j1;
/*      */         }
/*  855 */         if (k1 > i1)
/*      */         {
/*  857 */           i1 = k1;
/*      */         }
/*  859 */         if (l1 > i1)
/*      */         {
/*  861 */           i1 = l1;
/*      */         }
/*  863 */         if (i2 > i1)
/*      */         {
/*  865 */           i1 = i2;
/*      */         }
/*  867 */         return i1;
/*      */       }
/*      */     }
/*  870 */     if (j < 0)
/*      */     {
/*  872 */       return 0;
/*      */     }
/*  874 */     if (j >= getWorldHeight())
/*      */     {
/*  876 */       j = getWorldHeight() - 1;
/*      */     }
/*  878 */     vy chunk = c(i >> 4, k >> 4);
/*  879 */     i &= 15;
/*  880 */     k &= 15;
/*  881 */     return chunk.c(i, j, k, this.k);
/*      */   }
/*      */ 
/*      */   public int d(int i, int j)
/*      */   {
/*  886 */     if ((i < -30000000) || (j < -30000000) || (i >= 30000000) || (j >= 30000000))
/*      */     {
/*  888 */       return 0;
/*      */     }
/*  890 */     if (!g(i >> 4, j >> 4))
/*      */     {
/*  892 */       return 0;
/*      */     }
/*      */ 
/*  895 */     vy chunk = c(i >> 4, j >> 4);
/*  896 */     return chunk.b(i & 0xF, j & 0xF);
/*      */   }
/*      */ 
/*      */   public int a(rf enumskyblock, int i, int j, int k)
/*      */   {
/*  902 */     if (j < 0)
/*      */     {
/*  904 */       j = 0;
/*      */     }
/*  906 */     if ((j >= getWorldHeight()) && (enumskyblock == rf.a))
/*      */     {
/*  908 */       return 15;
/*      */     }
/*  910 */     if ((j < 0) || (j >= getWorldHeight()) || (i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  912 */       return enumskyblock.c;
/*      */     }
/*  914 */     int l = i >> 4;
/*  915 */     int i1 = k >> 4;
/*  916 */     if (!g(l, i1))
/*      */     {
/*  918 */       return 0;
/*      */     }
/*  920 */     int j1 = a(i, j, k);
/*  921 */     if ((j1 == lr.al.bA) || (j1 == lr.aB.bA) || (j1 == lr.aI.bA) || (j1 == lr.au.bA))
/*      */     {
/*  923 */       int k1 = b(enumskyblock, i, j + 1, k);
/*  924 */       int l1 = b(enumskyblock, i + 1, j, k);
/*  925 */       int i2 = b(enumskyblock, i - 1, j, k);
/*  926 */       int j2 = b(enumskyblock, i, j, k + 1);
/*  927 */       int k2 = b(enumskyblock, i, j, k - 1);
/*  928 */       if (l1 > k1)
/*      */       {
/*  930 */         k1 = l1;
/*      */       }
/*  932 */       if (i2 > k1)
/*      */       {
/*  934 */         k1 = i2;
/*      */       }
/*  936 */       if (j2 > k1)
/*      */       {
/*  938 */         k1 = j2;
/*      */       }
/*  940 */       if (k2 > k1)
/*      */       {
/*  942 */         k1 = k2;
/*      */       }
/*  944 */       return k1;
/*      */     }
/*      */ 
/*  947 */     vy chunk = c(l, i1);
/*  948 */     return chunk.a(enumskyblock, i & 0xF, j, k & 0xF);
/*      */   }
/*      */ 
/*      */   public int b(rf enumskyblock, int i, int j, int k)
/*      */   {
/*  954 */     if (j < 0)
/*      */     {
/*  956 */       j = 0;
/*      */     }
/*  958 */     if (j >= getWorldHeight())
/*      */     {
/*  960 */       j = getWorldHeight() - 1;
/*      */     }
/*  962 */     if ((j < 0) || (j >= getWorldHeight()) || (i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  964 */       return enumskyblock.c;
/*      */     }
/*  966 */     int l = i >> 4;
/*  967 */     int i1 = k >> 4;
/*  968 */     if (!g(l, i1))
/*      */     {
/*  970 */       return 0;
/*      */     }
/*      */ 
/*  973 */     vy chunk = c(l, i1);
/*  974 */     return chunk.a(enumskyblock, i & 0xF, j, k & 0xF);
/*      */   }
/*      */ 
/*      */   public void a(rf enumskyblock, int i, int j, int k, int l)
/*      */   {
/*  980 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  982 */       return;
/*      */     }
/*  984 */     if (j < 0)
/*      */     {
/*  986 */       return;
/*      */     }
/*  988 */     if (j >= getWorldHeight())
/*      */     {
/*  990 */       return;
/*      */     }
/*  992 */     if (!g(i >> 4, k >> 4))
/*      */     {
/*  994 */       return;
/*      */     }
/*  996 */     vy chunk = c(i >> 4, k >> 4);
/*  997 */     chunk.a(enumskyblock, i & 0xF, j, k & 0xF, l);
/*  998 */     for (int i1 = 0; i1 < this.z.size(); i1++)
/*      */     {
/* 1000 */       ((yj)this.z.get(i1)).a(i, j, k);
/*      */     }
/*      */   }
/*      */ 
/*      */   public int b(int i, int j, int k, int l)
/*      */   {
/* 1007 */     int i1 = a(rf.a, i, j, k);
/* 1008 */     int j1 = a(rf.b, i, j, k);
/* 1009 */     if (j1 < l)
/*      */     {
/* 1011 */       j1 = l;
/*      */     }
/* 1013 */     return i1 << 20 | j1 << 4;
/*      */   }
/*      */ 
/*      */   public float a(int i, int j, int k, int l)
/*      */   {
/* 1018 */     int i1 = n(i, j, k);
/* 1019 */     if (i1 < l)
/*      */     {
/* 1021 */       i1 = l;
/*      */     }
/* 1023 */     return this.y.f[i1];
/*      */   }
/*      */ 
/*      */   public float c(int i, int j, int k)
/*      */   {
/* 1028 */     return this.y.f[n(i, j, k)];
/*      */   }
/*      */ 
/*      */   public boolean k()
/*      */   {
/* 1033 */     return this.k < 4;
/*      */   }
/*      */ 
/*      */   public ma a(ax vec3d, ax vec3d1)
/*      */   {
/* 1038 */     return a(vec3d, vec3d1, false, false);
/*      */   }
/*      */ 
/*      */   public ma a(ax vec3d, ax vec3d1, boolean flag)
/*      */   {
/* 1043 */     return a(vec3d, vec3d1, flag, false);
/*      */   }
/*      */ 
/*      */   public ma a(ax vec3d, ax vec3d1, boolean flag, boolean flag1)
/*      */   {
/* 1048 */     if ((Double.isNaN(vec3d.a)) || (Double.isNaN(vec3d.b)) || (Double.isNaN(vec3d.c)))
/*      */     {
/* 1050 */       return null;
/*      */     }
/* 1052 */     if ((Double.isNaN(vec3d1.a)) || (Double.isNaN(vec3d1.b)) || (Double.isNaN(vec3d1.c)))
/*      */     {
/* 1054 */       return null;
/*      */     }
/* 1056 */     int i = et.b(vec3d1.a);
/* 1057 */     int j = et.b(vec3d1.b);
/* 1058 */     int k = et.b(vec3d1.c);
/* 1059 */     int l = et.b(vec3d.a);
/* 1060 */     int i1 = et.b(vec3d.b);
/* 1061 */     int j1 = et.b(vec3d.c);
/* 1062 */     int k1 = a(l, i1, j1);
/* 1063 */     int i2 = e(l, i1, j1);
/* 1064 */     lr block = lr.m[k1];
/* 1065 */     if (((!flag1) || (block == null) || (block.c(this, l, i1, j1) != null)) && (k1 > 0) && (block.a(i2, flag)))
/*      */     {
/* 1067 */       ma movingobjectposition = block.a(this, l, i1, j1, vec3d, vec3d1);
/* 1068 */       if (movingobjectposition != null)
/*      */       {
/* 1070 */         return movingobjectposition;
/*      */       }
/*      */     }
/* 1073 */     for (int l1 = 200; l1-- >= 0; )
/*      */     {
/* 1075 */       if ((Double.isNaN(vec3d.a)) || (Double.isNaN(vec3d.b)) || (Double.isNaN(vec3d.c)))
/*      */       {
/* 1077 */         return null;
/*      */       }
/* 1079 */       if ((l == i) && (i1 == j) && (j1 == k))
/*      */       {
/* 1081 */         return null;
/*      */       }
/* 1083 */       boolean flag2 = true;
/* 1084 */       boolean flag3 = true;
/* 1085 */       boolean flag4 = true;
/* 1086 */       double d = 999.0D;
/* 1087 */       double d1 = 999.0D;
/* 1088 */       double d2 = 999.0D;
/* 1089 */       if (i > l)
/*      */       {
/* 1091 */         d = l + 1.0D;
/*      */       }
/* 1093 */       else if (i < l)
/*      */       {
/* 1095 */         d = l + 0.0D;
/*      */       }
/*      */       else {
/* 1098 */         flag2 = false;
/*      */       }
/* 1100 */       if (j > i1)
/*      */       {
/* 1102 */         d1 = i1 + 1.0D;
/*      */       }
/* 1104 */       else if (j < i1)
/*      */       {
/* 1106 */         d1 = i1 + 0.0D;
/*      */       }
/*      */       else {
/* 1109 */         flag3 = false;
/*      */       }
/* 1111 */       if (k > j1)
/*      */       {
/* 1113 */         d2 = j1 + 1.0D;
/*      */       }
/* 1115 */       else if (k < j1)
/*      */       {
/* 1117 */         d2 = j1 + 0.0D;
/*      */       }
/*      */       else {
/* 1120 */         flag4 = false;
/*      */       }
/* 1122 */       double d3 = 999.0D;
/* 1123 */       double d4 = 999.0D;
/* 1124 */       double d5 = 999.0D;
/* 1125 */       double d6 = vec3d1.a - vec3d.a;
/* 1126 */       double d7 = vec3d1.b - vec3d.b;
/* 1127 */       double d8 = vec3d1.c - vec3d.c;
/* 1128 */       if (flag2)
/*      */       {
/* 1130 */         d3 = (d - vec3d.a) / d6;
/*      */       }
/* 1132 */       if (flag3)
/*      */       {
/* 1134 */         d4 = (d1 - vec3d.b) / d7;
/*      */       }
/* 1136 */       if (flag4)
/*      */       {
/* 1138 */         d5 = (d2 - vec3d.c) / d8;
/*      */       }
/* 1140 */       byte byte0 = 0;
/* 1141 */       if ((d3 < d4) && (d3 < d5))
/*      */       {
/* 1143 */         if (i > l)
/*      */         {
/* 1145 */           byte0 = 4;
/*      */         }
/*      */         else {
/* 1148 */           byte0 = 5;
/*      */         }
/* 1150 */         vec3d.a = d;
/* 1151 */         vec3d.b += d7 * d3;
/* 1152 */         vec3d.c += d8 * d3;
/*      */       }
/* 1154 */       else if (d4 < d5)
/*      */       {
/* 1156 */         if (j > i1)
/*      */         {
/* 1158 */           byte0 = 0;
/*      */         }
/*      */         else {
/* 1161 */           byte0 = 1;
/*      */         }
/* 1163 */         vec3d.a += d6 * d4;
/* 1164 */         vec3d.b = d1;
/* 1165 */         vec3d.c += d8 * d4;
/*      */       }
/*      */       else {
/* 1168 */         if (k > j1)
/*      */         {
/* 1170 */           byte0 = 2;
/*      */         }
/*      */         else {
/* 1173 */           byte0 = 3;
/*      */         }
/* 1175 */         vec3d.a += d6 * d5;
/* 1176 */         vec3d.b += d7 * d5;
/* 1177 */         vec3d.c = d2;
/*      */       }
/* 1179 */       ax vec3d2 = ax.b(vec3d.a, vec3d.b, vec3d.c);
/* 1180 */       l = (int)(vec3d2.a = et.b(vec3d.a));
/* 1181 */       if (byte0 == 5)
/*      */       {
/* 1183 */         l--;
/* 1184 */         vec3d2.a += 1.0D;
/*      */       }
/* 1186 */       i1 = (int)(vec3d2.b = et.b(vec3d.b));
/* 1187 */       if (byte0 == 1)
/*      */       {
/* 1189 */         i1--;
/* 1190 */         vec3d2.b += 1.0D;
/*      */       }
/* 1192 */       j1 = (int)(vec3d2.c = et.b(vec3d.c));
/* 1193 */       if (byte0 == 3)
/*      */       {
/* 1195 */         j1--;
/* 1196 */         vec3d2.c += 1.0D;
/*      */       }
/* 1198 */       int j2 = a(l, i1, j1);
/* 1199 */       int k2 = e(l, i1, j1);
/* 1200 */       lr block1 = lr.m[j2];
/* 1201 */       if (((!flag1) || (block1 == null) || (block1.c(this, l, i1, j1) != null)) && (j2 > 0) && (block1.a(k2, flag)))
/*      */       {
/* 1203 */         ma movingobjectposition1 = block1.a(this, l, i1, j1, vec3d, vec3d1);
/* 1204 */         if (movingobjectposition1 != null)
/*      */         {
/* 1206 */           return movingobjectposition1;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/* 1211 */     return null;
/*      */   }
/*      */ 
/*      */   public void a(kj entity, String s, float f, float f1)
/*      */   {
/* 1216 */     for (int i = 0; i < this.z.size(); i++)
/*      */     {
/* 1218 */       ((yj)this.z.get(i)).a(s, entity.o, entity.p - entity.H, entity.q, f, f1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(double d, double d1, double d2, String s, float f, float f1)
/*      */   {
/* 1226 */     for (int i = 0; i < this.z.size(); i++)
/*      */     {
/* 1228 */       ((yj)this.z.get(i)).a(s, d, d1, d2, f, f1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(String s, int i, int j, int k)
/*      */   {
/* 1235 */     for (int l = 0; l < this.z.size(); l++)
/*      */     {
/* 1237 */       ((yj)this.z.get(l)).a(s, i, j, k);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(String s, double d, double d1, double d2, double d3, double d4, double d5)
/*      */   {
/* 1245 */     for (int i = 0; i < this.z.size(); i++)
/*      */     {
/* 1247 */       ((yj)this.z.get(i)).a(s, d, d1, d2, d3, d4, d5);
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean e(kj entity)
/*      */   {
/* 1254 */     if (this.parentWorld != null) {
/* 1255 */       return this.parentWorld.e(entity);
/*      */     }
/* 1257 */     this.j.add(entity);
/* 1258 */     return true;
/*      */   }
/*      */ 
/*      */   public Collection getWeatherEffects() {
/* 1262 */     return this.j;
/*      */   }
/*      */ 
/*      */   public boolean a(kj entity)
/*      */   {
/* 1268 */     if (this.parentWorld != null)
/*      */     {
/* 1270 */       if (entity.F() != null)
/*      */       {
/* 1272 */         entity.k = this.parentWorld;
/*      */       }
/* 1274 */       return this.parentWorld.a(entity);
/*      */     }
/* 1276 */     int i = et.b(entity.o / 16.0D);
/* 1277 */     int j = et.b(entity.q / 16.0D);
/* 1278 */     boolean flag = false;
/* 1279 */     if ((entity instanceof sz))
/*      */     {
/* 1281 */       flag = true;
/*      */     }
/* 1283 */     if ((flag) || (g(i, j)))
/*      */     {
/* 1285 */       if ((entity instanceof sz))
/*      */       {
/* 1287 */         sz entityplayer = (sz)entity;
/* 1288 */         this.i.add(entityplayer);
/* 1289 */         y();
/*      */       }
/* 1291 */       c(i, j).a(entity);
/* 1292 */       this.g.add(entity);
/* 1293 */       c(entity);
/* 1294 */       return true;
/*      */     }
/*      */ 
/* 1297 */     return false;
/*      */   }
/*      */ 
/*      */   protected void c(kj entity)
/*      */   {
/* 1303 */     for (int i = 0; i < this.z.size(); i++)
/*      */     {
/* 1305 */       ((yj)this.z.get(i)).a(entity);
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void d(kj entity)
/*      */   {
/* 1312 */     for (int i = 0; i < this.z.size(); i++)
/*      */     {
/* 1314 */       ((yj)this.z.get(i)).b(entity);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void b(kj entity)
/*      */   {
/* 1321 */     if (entity.i != null)
/*      */     {
/* 1323 */       entity.i.g(null);
/*      */     }
/* 1325 */     if (entity.j != null)
/*      */     {
/* 1327 */       entity.g(null);
/*      */     }
/* 1329 */     entity.v();
/* 1330 */     if ((entity instanceof sz))
/*      */     {
/* 1332 */       this.i.remove((sz)entity);
/* 1333 */       y();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(yj iworldaccess)
/*      */   {
/* 1339 */     this.z.add(iworldaccess);
/*      */   }
/*      */ 
/*      */   public void b(yj iworldaccess)
/*      */   {
/* 1344 */     this.z.remove(iworldaccess);
/*      */   }
/*      */ 
/*      */   public List a(kj entity, rp axisalignedbb)
/*      */   {
/* 1349 */     this.U.clear();
/* 1350 */     int i = et.b(axisalignedbb.a);
/* 1351 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1352 */     int k = entity.getFloor(axisalignedbb.b);
/* 1353 */     int l = entity.getFloor(axisalignedbb.e + 1.0D);
/* 1354 */     int i1 = et.b(axisalignedbb.c);
/* 1355 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1356 */     for (int k1 = i; k1 < j; k1++)
/*      */     {
/* 1358 */       for (int l1 = i1; l1 < j1; l1++)
/*      */       {
/* 1360 */         if (d(k1, 64, l1))
/*      */         {
/* 1364 */           if (entity.getGravity() == 1)
/*      */           {
/* 1366 */             for (int i2 = k - 1; i2 < l; i2++)
/*      */             {
/* 1368 */               lr block = lr.m[a(k1, i2, l1)];
/* 1369 */               if (block != null)
/*      */               {
/* 1371 */                 block.a(this, k1, i2, l1, axisalignedbb, this.U);
/*      */               }
/*      */             }
/*      */           }
/*      */           else {
/* 1376 */             for (int i2 = l; i2 >= k; i2--)
/*      */             {
/* 1378 */               lr block = lr.m[a(k1, i2, l1)];
/* 1379 */               if (block != null)
/*      */               {
/* 1381 */                 block.a(this, k1, i2, l1, axisalignedbb, this.U);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1390 */     double d = 0.25D;
/* 1391 */     List list = b(entity, axisalignedbb.b(d, d, d));
/* 1392 */     for (int j2 = 0; j2 < list.size(); j2++)
/*      */     {
/* 1394 */       rp axisalignedbb1 = ((kj)list.get(j2)).g_();
/* 1395 */       if ((axisalignedbb1 != null) && (axisalignedbb1.a(axisalignedbb)))
/*      */       {
/* 1397 */         this.U.add(axisalignedbb1);
/*      */       }
/* 1399 */       axisalignedbb1 = entity.a((kj)list.get(j2));
/* 1400 */       if ((axisalignedbb1 != null) && (axisalignedbb1.a(axisalignedbb)))
/*      */       {
/* 1402 */         this.U.add(axisalignedbb1);
/*      */       }
/*      */     }
/*      */ 
/* 1406 */     return this.U;
/*      */   }
/*      */ 
/*      */   public int a(float f)
/*      */   {
/* 1411 */     float f1 = c(f);
/* 1412 */     float f2 = 1.0F - (et.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F);
/* 1413 */     if (f2 < 0.0F)
/*      */     {
/* 1415 */       f2 = 0.0F;
/*      */     }
/* 1417 */     if (f2 > 1.0F)
/*      */     {
/* 1419 */       f2 = 1.0F;
/*      */     }
/* 1421 */     f2 = 1.0F - f2;
/* 1422 */     f2 = (float)(f2 * (1.0D - i(f) * 5.0F / 16.0D));
/* 1423 */     f2 = (float)(f2 * (1.0D - h(f) * 5.0F / 16.0D));
/* 1424 */     f2 = 1.0F - f2;
/* 1425 */     return (int)(f2 * 11.0F);
/*      */   }
/*      */ 
/*      */   public float b(float f)
/*      */   {
/* 1430 */     float f1 = c(f);
/* 1431 */     float f2 = 1.0F - (et.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.2F);
/* 1432 */     if (f2 < 0.0F)
/*      */     {
/* 1434 */       f2 = 0.0F;
/*      */     }
/* 1436 */     if (f2 > 1.0F)
/*      */     {
/* 1438 */       f2 = 1.0F;
/*      */     }
/* 1440 */     f2 = 1.0F - f2;
/* 1441 */     f2 = (float)(f2 * (1.0D - i(f) * 5.0F / 16.0D));
/* 1442 */     f2 = (float)(f2 * (1.0D - h(f) * 5.0F / 16.0D));
/* 1443 */     return f2 * 0.8F + 0.2F;
/*      */   }
/*      */ 
/*      */   public ax a(kj entity, float f)
/*      */   {
/* 1448 */     float f1 = c(f);
/* 1449 */     float f2 = et.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 1450 */     if (f2 < 0.0F)
/*      */     {
/* 1452 */       f2 = 0.0F;
/*      */     }
/* 1454 */     if (f2 > 1.0F)
/*      */     {
/* 1456 */       f2 = 1.0F;
/*      */     }
/* 1458 */     int i = et.b(entity.o);
/* 1459 */     int j = et.b(entity.q);
/* 1460 */     float f3 = a().b(i, j);
/* 1461 */     int k = a().a(i, j).a(f3);
/* 1462 */     float f4 = (k >> 16 & 0xFF) / 255.0F;
/* 1463 */     float f5 = (k >> 8 & 0xFF) / 255.0F;
/* 1464 */     float f6 = (k & 0xFF) / 255.0F;
/* 1465 */     f4 *= f2;
/* 1466 */     f5 *= f2;
/* 1467 */     f6 *= f2;
/* 1468 */     float f7 = i(f);
/* 1469 */     if (f7 > 0.0F)
/*      */     {
/* 1471 */       float f8 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.6F;
/* 1472 */       float f10 = 1.0F - f7 * 0.75F;
/* 1473 */       f4 = f4 * f10 + f8 * (1.0F - f10);
/* 1474 */       f5 = f5 * f10 + f8 * (1.0F - f10);
/* 1475 */       f6 = f6 * f10 + f8 * (1.0F - f10);
/*      */     }
/* 1477 */     float f9 = h(f);
/* 1478 */     if (f9 > 0.0F)
/*      */     {
/* 1480 */       float f11 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.2F;
/* 1481 */       float f13 = 1.0F - f9 * 0.75F;
/* 1482 */       f4 = f4 * f13 + f11 * (1.0F - f13);
/* 1483 */       f5 = f5 * f13 + f11 * (1.0F - f13);
/* 1484 */       f6 = f6 * f13 + f11 * (1.0F - f13);
/*      */     }
/* 1486 */     if (this.s > 0)
/*      */     {
/* 1488 */       float f12 = this.s - f;
/* 1489 */       if (f12 > 1.0F)
/*      */       {
/* 1491 */         f12 = 1.0F;
/*      */       }
/* 1493 */       f12 *= 0.45F;
/* 1494 */       f4 = f4 * (1.0F - f12) + 0.8F * f12;
/* 1495 */       f5 = f5 * (1.0F - f12) + 0.8F * f12;
/* 1496 */       f6 = f6 * (1.0F - f12) + 1.0F * f12;
/*      */     }
/* 1498 */     return ax.b(f4, f5, f6);
/*      */   }
/*      */ 
/*      */   public float c(float f)
/*      */   {
/* 1503 */     return this.y.a(this.C.f(), f) + (float)(this.J + (this.K - this.J) * f);
/*      */   }
/*      */ 
/*      */   public float d(float f)
/*      */   {
/* 1508 */     float f1 = c(f);
/* 1509 */     return f1 * 3.141593F * 2.0F;
/*      */   }
/*      */ 
/*      */   public ax e(float f)
/*      */   {
/* 1514 */     float f1 = c(f);
/* 1515 */     float f2 = et.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 1516 */     if (f2 < 0.0F)
/*      */     {
/* 1518 */       f2 = 0.0F;
/*      */     }
/* 1520 */     if (f2 > 1.0F)
/*      */     {
/* 1522 */       f2 = 1.0F;
/*      */     }
/* 1524 */     float f3 = (float)(this.R >> 16 & 0xFF) / 255.0F;
/* 1525 */     float f4 = (float)(this.R >> 8 & 0xFF) / 255.0F;
/* 1526 */     float f5 = (float)(this.R & 0xFF) / 255.0F;
/* 1527 */     float f6 = i(f);
/* 1528 */     if (f6 > 0.0F)
/*      */     {
/* 1530 */       float f7 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
/* 1531 */       float f9 = 1.0F - f6 * 0.95F;
/* 1532 */       f3 = f3 * f9 + f7 * (1.0F - f9);
/* 1533 */       f4 = f4 * f9 + f7 * (1.0F - f9);
/* 1534 */       f5 = f5 * f9 + f7 * (1.0F - f9);
/*      */     }
/* 1536 */     f3 *= (f2 * 0.9F + 0.1F);
/* 1537 */     f4 *= (f2 * 0.9F + 0.1F);
/* 1538 */     f5 *= (f2 * 0.85F + 0.15F);
/* 1539 */     float f8 = h(f);
/* 1540 */     if (f8 > 0.0F)
/*      */     {
/* 1542 */       float f10 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
/* 1543 */       float f11 = 1.0F - f8 * 0.95F;
/* 1544 */       f3 = f3 * f11 + f10 * (1.0F - f11);
/* 1545 */       f4 = f4 * f11 + f10 * (1.0F - f11);
/* 1546 */       f5 = f5 * f11 + f10 * (1.0F - f11);
/*      */     }
/* 1548 */     return ax.b(f3, f4, f5);
/*      */   }
/*      */ 
/*      */   public ax f(float f)
/*      */   {
/* 1553 */     float f1 = c(f);
/* 1554 */     return this.y.b(f1, f);
/*      */   }
/*      */ 
/*      */   public int e(int i, int j)
/*      */   {
/* 1559 */     return b(i, j).c(i & 0xF, j & 0xF);
/*      */   }
/*      */ 
/*      */   public int f(int i, int j)
/*      */   {
/* 1564 */     vy chunk = b(i, j);
/* 1565 */     int k = 127;
/* 1566 */     i &= 15;
/* 1567 */     j &= 15;
/* 1568 */     while (k > 0)
/*      */     {
/* 1570 */       int l = chunk.a(i, k, j);
/* 1571 */       if ((l == 0) || (!lr.m[l].bN.c()) || (lr.m[l].bN == wa.i))
/*      */       {
/* 1573 */         k--;
/*      */       }
/*      */       else {
/* 1576 */         return k + 1;
/*      */       }
/*      */     }
/* 1579 */     return -1;
/*      */   }
/*      */ 
/*      */   public float g(float f)
/*      */   {
/* 1584 */     if ((this.y instanceof am))
/* 1585 */       return 1.0F;
/* 1586 */     float f1 = c(f);
/* 1587 */     float f2 = 1.0F - (et.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.75F);
/* 1588 */     if (f2 < 0.0F)
/*      */     {
/* 1590 */       f2 = 0.0F;
/*      */     }
/* 1592 */     if (f2 > 1.0F)
/*      */     {
/* 1594 */       f2 = 1.0F;
/*      */     }
/* 1596 */     return f2 * f2 * 0.5F;
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, int l, int i1)
/*      */   {
/* 1601 */     if (this.parentWorld != null)
/*      */     {
/* 1603 */       this.parentWorld.a(i, j + this.shiftY, k, l, i1);
/* 1604 */       return;
/*      */     }
/* 1606 */     jm nextticklistentry = getEntryFromPool(i, j, k, l);
/* 1607 */     byte byte0 = 8;
/* 1608 */     if (this.f)
/*      */     {
/* 1610 */       if (b(nextticklistentry.a - byte0, nextticklistentry.b - byte0, nextticklistentry.c - byte0, nextticklistentry.a + byte0, nextticklistentry.b + byte0, nextticklistentry.c + byte0))
/*      */       {
/* 1612 */         int j1 = a(nextticklistentry.a, nextticklistentry.b, nextticklistentry.c);
/* 1613 */         if ((j1 == nextticklistentry.d) && (j1 > 0))
/*      */         {
/* 1615 */           lr.m[j1].a(this, nextticklistentry.a, nextticklistentry.b, nextticklistentry.c, this.w);
/*      */         }
/*      */       }
/* 1618 */       return;
/*      */     }
/* 1620 */     if (b(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0))
/*      */     {
/* 1622 */       if (l > 0)
/*      */       {
/* 1624 */         nextticklistentry.a(i1 + this.C.f());
/*      */       }
/* 1626 */       if (!this.O.contains(nextticklistentry))
/*      */       {
/* 1628 */         this.O.add(nextticklistentry);
/* 1629 */         this.N.add(nextticklistentry);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void updateTileEntities()
/*      */   {
/* 1636 */     this.V = true;
/* 1637 */     Iterator iterator = this.h.iterator();
/*      */ 
/* 1640 */     while (iterator.hasNext())
/*      */     {
/* 1644 */       ij tileentity = (ij)iterator.next();
/* 1645 */       if ((!tileentity.k()) && (tileentity.i != null))
/*      */       {
/* 1647 */         tileentity.b_();
/*      */       }
/* 1649 */       if (tileentity.k())
/*      */       {
/* 1651 */         iterator.remove();
/* 1652 */         if (g(tileentity.j >> 4, tileentity.l >> 4))
/*      */         {
/* 1654 */           vy chunk = c(tileentity.j >> 4, tileentity.l >> 4);
/* 1655 */           if (chunk != null)
/*      */           {
/* 1657 */             chunk.cleanChunkBlockTileEntity(tileentity.j & 0xF, tileentity.k - this.shiftY, tileentity.l & 0xF);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1662 */     this.V = false;
/* 1663 */     if (!this.Q.isEmpty())
/*      */     {
/* 1665 */       this.h.removeAll(this.Q);
/* 1666 */       this.Q.clear();
/*      */     }
/* 1668 */     if (!this.P.isEmpty())
/*      */     {
/* 1670 */       Iterator iterator1 = this.P.iterator();
/*      */ 
/* 1673 */       while (iterator1.hasNext())
/*      */       {
/* 1677 */         ij tileentity1 = (ij)iterator1.next();
/* 1678 */         if (!tileentity1.k())
/*      */         {
/* 1680 */           if (!this.h.contains(tileentity1))
/*      */           {
/* 1682 */             this.h.add(tileentity1);
/*      */           }
/* 1684 */           if (g(tileentity1.j >> 4, tileentity1.l >> 4))
/*      */           {
/* 1686 */             vy chunk1 = c(tileentity1.j >> 4, tileentity1.l >> 4);
/* 1687 */             if (chunk1 != null)
/*      */             {
/* 1689 */               chunk1.a(tileentity1.j & 0xF, tileentity1.k - this.shiftY, tileentity1.l & 0xF, tileentity1);
/*      */             }
/*      */           }
/* 1692 */           j(tileentity1.j, tileentity1.k, tileentity1.l);
/*      */         }
/*      */       }
/* 1695 */       this.P.clear();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void l()
/*      */   {
/* 1701 */     if (this.parentWorld != null)
/* 1702 */       throw new WorldLayerException();
/* 1703 */     for (int i = 0; i < this.j.size(); i++)
/*      */     {
/* 1705 */       kj entity = (kj)this.j.get(i);
/* 1706 */       entity.w_();
/* 1707 */       if (entity.G)
/*      */       {
/* 1709 */         this.j.remove(i--);
/*      */       }
/*      */     }
/* 1712 */     this.g.removeAll(this.M);
/* 1713 */     for (int j = 0; j < this.M.size(); j++)
/*      */     {
/* 1715 */       kj entity1 = (kj)this.M.get(j);
/* 1716 */       int i1 = entity1.ah;
/* 1717 */       int k1 = entity1.aj;
/* 1718 */       if ((entity1.ag) && (g(i1, k1)))
/*      */       {
/* 1720 */         c(i1, k1).b(entity1);
/*      */       }
/*      */     }
/*      */ 
/* 1724 */     for (int k = 0; k < this.M.size(); k++)
/*      */     {
/* 1726 */       d((kj)this.M.get(k));
/*      */     }
/*      */ 
/* 1729 */     this.M.clear();
/* 1730 */     for (Iterator it = this.g.iterator(); it.hasNext(); )
/*      */     {
/* 1732 */       kj entity2 = (kj)it.next();
/* 1733 */       if (entity2.j != null)
/*      */       {
/* 1735 */         if ((entity2.j.G) || (entity2.j.i != entity2))
/*      */         {
/* 1739 */           entity2.j.i = null;
/* 1740 */           entity2.j = null;
/*      */         }
/*      */       } else { if (!entity2.G)
/*      */         {
/* 1744 */           f(entity2);
/*      */         }
/* 1746 */         if (entity2.G)
/*      */         {
/* 1750 */           int j1 = entity2.ah;
/* 1751 */           int l1 = entity2.aj;
/* 1752 */           if ((entity2.ag) && (g(j1, l1)))
/*      */           {
/* 1754 */             c(j1, l1).b(entity2);
/*      */           }
/* 1756 */           it.remove();
/* 1757 */           d(entity2);
/*      */         } }
/*      */     }
/* 1760 */     updateTileEntities();
/*      */   }
/*      */ 
/*      */   public void a(Collection collection)
/*      */   {
/* 1765 */     List dest = this.V ? this.P : this.h;
/*      */ 
/* 1767 */     for (Iterator i$ = collection.iterator(); i$.hasNext(); ) { Object ob = i$.next();
/* 1768 */       ij te = (ij)ob;
/* 1769 */       if (te.canUpdate()) dest.add(te);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void addTileEntity(ij te)
/*      */   {
/* 1775 */     List dest = this.V ? this.P : this.h;
/*      */ 
/* 1777 */     if (te.canUpdate()) dest.add(te);
/*      */   }
/*      */ 
/*      */   public void f(kj entity)
/*      */   {
/* 1782 */     a(entity, true);
/*      */   }
/*      */ 
/*      */   public void a(kj entity, boolean flag)
/*      */   {
/* 1787 */     int i = et.b(entity.o);
/* 1788 */     int j = et.b(entity.q);
/* 1789 */     byte byte0 = 32;
/* 1790 */     if ((flag) && (!b(i - byte0, 0, j - byte0, i + byte0, 128, j + byte0)))
/*      */     {
/* 1792 */       return;
/*      */     }
/* 1794 */     entity.N = entity.o;
/* 1795 */     entity.O = entity.p;
/* 1796 */     entity.P = entity.q;
/* 1797 */     entity.w = entity.u;
/* 1798 */     entity.x = entity.v;
/* 1799 */     if ((flag) && (entity.ag))
/*      */     {
/* 1801 */       if (entity.j != null)
/*      */       {
/* 1803 */         entity.I();
/*      */       }
/*      */       else {
/* 1806 */         entity.w_();
/*      */       }
/*      */     }
/* 1809 */     if ((Double.isNaN(entity.o)) || (Double.isInfinite(entity.o)))
/*      */     {
/* 1811 */       entity.o = entity.N;
/*      */     }
/* 1813 */     if ((Double.isNaN(entity.p)) || (Double.isInfinite(entity.p)))
/*      */     {
/* 1815 */       entity.p = entity.O;
/*      */     }
/* 1817 */     if ((Double.isNaN(entity.q)) || (Double.isInfinite(entity.q)))
/*      */     {
/* 1819 */       entity.q = entity.P;
/*      */     }
/* 1821 */     if ((Double.isNaN(entity.v)) || (Double.isInfinite(entity.v)))
/*      */     {
/* 1823 */       entity.v = entity.x;
/*      */     }
/* 1825 */     if ((Double.isNaN(entity.u)) || (Double.isInfinite(entity.u)))
/*      */     {
/* 1827 */       entity.u = entity.w;
/*      */     }
/* 1829 */     int k = et.b(entity.o / 16.0D);
/* 1830 */     int l = et.b(entity.p / 16.0D);
/* 1831 */     int i1 = et.b(entity.q / 16.0D);
/* 1832 */     if ((!entity.ag) || (entity.ah != k) || (entity.ai != l) || (entity.aj != i1))
/*      */     {
/* 1834 */       if ((entity.ag) && (g(entity.ah, entity.aj)))
/*      */       {
/* 1836 */         c(entity.ah, entity.aj).a(entity, entity.ai);
/*      */       }
/* 1838 */       if (g(k, i1))
/*      */       {
/* 1840 */         entity.ag = true;
/* 1841 */         c(k, i1).a(entity);
/*      */       }
/*      */       else {
/* 1844 */         entity.ag = false;
/*      */       }
/*      */     }
/* 1847 */     if ((flag) && (entity.ag) && (entity.i != null))
/*      */     {
/* 1849 */       if ((entity.i.G) || (entity.i.j != entity))
/*      */       {
/* 1851 */         entity.i.j = null;
/* 1852 */         entity.i = null;
/*      */       }
/*      */       else {
/* 1855 */         f(entity.i);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean a(rp axisalignedbb)
/*      */   {
/* 1862 */     List list = b(null, axisalignedbb);
/* 1863 */     for (int i = 0; i < list.size(); i++)
/*      */     {
/* 1865 */       kj entity = (kj)list.get(i);
/* 1866 */       if ((!entity.G) && (entity.h))
/*      */       {
/* 1868 */         return false;
/*      */       }
/*      */     }
/*      */ 
/* 1872 */     return true;
/*      */   }
/*      */ 
/*      */   public boolean getIsAnyLiquid(kj entity, rp axisalignedbb)
/*      */   {
/* 1877 */     int i = et.b(axisalignedbb.a);
/* 1878 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1879 */     int k = entity.getFloor(axisalignedbb.b);
/* 1880 */     int l = entity.getFloor(axisalignedbb.e + 1.0D);
/* 1881 */     int i1 = et.b(axisalignedbb.c);
/* 1882 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1883 */     if (axisalignedbb.a < 0.0D)
/*      */     {
/* 1885 */       i--;
/*      */     }
/* 1887 */     if (axisalignedbb.c < 0.0D)
/*      */     {
/* 1889 */       i1--;
/*      */     }
/* 1891 */     for (int k1 = i; k1 < j; k1++)
/*      */     {
/* 1893 */       for (int l1 = k; l1 < l; l1++)
/*      */       {
/* 1895 */         for (int i2 = i1; i2 < j1; i2++)
/*      */         {
/* 1897 */           lr block = lr.m[a(k1, l1, i2)];
/* 1898 */           if ((block != null) && (block.bN.d()))
/*      */           {
/* 1900 */             return true;
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1908 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean b(rp axisalignedbb)
/*      */   {
/* 1913 */     int i = et.b(axisalignedbb.a);
/* 1914 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1915 */     int k = et.b(axisalignedbb.b);
/* 1916 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 1917 */     int i1 = et.b(axisalignedbb.c);
/* 1918 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1919 */     if (axisalignedbb.a < 0.0D)
/*      */     {
/* 1921 */       i--;
/*      */     }
/* 1923 */     if (axisalignedbb.b < 0.0D)
/*      */     {
/* 1925 */       k--;
/*      */     }
/* 1927 */     if (axisalignedbb.c < 0.0D)
/*      */     {
/* 1929 */       i1--;
/*      */     }
/* 1931 */     for (int k1 = i; k1 < j; k1++)
/*      */     {
/* 1933 */       for (int l1 = k; l1 < l; l1++)
/*      */       {
/* 1935 */         for (int i2 = i1; i2 < j1; i2++)
/*      */         {
/* 1937 */           lr block = lr.m[a(k1, l1, i2)];
/* 1938 */           if ((block != null) && (block.bN.d()))
/*      */           {
/* 1940 */             return true;
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1948 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean c(rp axisalignedbb)
/*      */   {
/* 1953 */     MineUpForgeAdapter g = MineUpForgeAdapter.get();
/* 1954 */     int i = et.b(axisalignedbb.a);
/* 1955 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1956 */     int k = et.b(axisalignedbb.b);
/* 1957 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 1958 */     int i1 = et.b(axisalignedbb.c);
/* 1959 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1960 */     if (b(i, k, i1, j, l, j1))
/*      */     {
/* 1962 */       for (int k1 = i; k1 < j; k1++)
/*      */       {
/* 1964 */         for (int l1 = k; l1 < l; l1++)
/*      */         {
/* 1966 */           for (int i2 = i1; i2 < j1; i2++)
/*      */           {
/* 1968 */             int j2 = a(k1, l1, i2);
/* 1969 */             if ((j2 == lr.as.bA) || (j2 == lr.D.bA) || (j2 == lr.E.bA))
/*      */             {
/* 1971 */               return true;
/*      */             }
/* 1973 */             if ((j2 > 0) && (g.blockIsBlockBurning(lr.m[j2], this, k1, l1, i2))) {
/* 1974 */               return true;
/*      */             }
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1983 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean a(rp axisalignedbb, wa material, kj entity)
/*      */   {
/* 1988 */     int i = et.b(axisalignedbb.a);
/* 1989 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1990 */     int k = et.b(axisalignedbb.b);
/* 1991 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 1992 */     int i1 = et.b(axisalignedbb.c);
/* 1993 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1994 */     if (!b(i, k, i1, j, l, j1))
/*      */     {
/* 1996 */       return false;
/*      */     }
/* 1998 */     boolean flag = false;
/* 1999 */     ax vec3d = ax.b(0.0D, 0.0D, 0.0D);
/* 2000 */     for (int k1 = i; k1 < j; k1++)
/*      */     {
/* 2002 */       for (int l1 = k; l1 < l; l1++)
/*      */       {
/* 2004 */         for (int i2 = i1; i2 < j1; i2++)
/*      */         {
/* 2006 */           lr block = lr.m[a(k1, l1, i2)];
/* 2007 */           if ((block != null) && (block.bN == material))
/*      */           {
/* 2011 */             double d1 = l1 + 1 - zp.d(e(k1, l1, i2));
/* 2012 */             if (l >= d1)
/*      */             {
/* 2014 */               flag = true;
/* 2015 */               block.a(this, k1, l1, i2, entity, vec3d);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2023 */     if (vec3d.d() > 0.0D)
/*      */     {
/* 2025 */       vec3d = vec3d.c();
/* 2026 */       double d = 0.014D;
/* 2027 */       entity.r += vec3d.a * d;
/* 2028 */       entity.s += vec3d.b * d;
/* 2029 */       entity.t += vec3d.c * d;
/*      */     }
/* 2031 */     return flag;
/*      */   }
/*      */ 
/*      */   public boolean a(rp axisalignedbb, wa material)
/*      */   {
/* 2036 */     int i = et.b(axisalignedbb.a);
/* 2037 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 2038 */     int k = et.b(axisalignedbb.b);
/* 2039 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 2040 */     int i1 = et.b(axisalignedbb.c);
/* 2041 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 2042 */     for (int k1 = i; k1 < j; k1++)
/*      */     {
/* 2044 */       for (int l1 = k; l1 < l; l1++)
/*      */       {
/* 2046 */         for (int i2 = i1; i2 < j1; i2++)
/*      */         {
/* 2048 */           lr block = lr.m[a(k1, l1, i2)];
/* 2049 */           if ((block != null) && (block.bN == material))
/*      */           {
/* 2051 */             return true;
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2059 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean b(rp axisalignedbb, wa material)
/*      */   {
/* 2064 */     int i = et.b(axisalignedbb.a);
/* 2065 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 2066 */     int k = et.b(axisalignedbb.b);
/* 2067 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 2068 */     int i1 = et.b(axisalignedbb.c);
/* 2069 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 2070 */     for (int k1 = i; k1 < j; k1++)
/*      */     {
/* 2072 */       for (int l1 = k; l1 < l; l1++)
/*      */       {
/* 2074 */         for (int i2 = i1; i2 < j1; i2++)
/*      */         {
/* 2076 */           lr block = lr.m[a(k1, l1, i2)];
/* 2077 */           if ((block != null) && (block.bN == material))
/*      */           {
/* 2081 */             int j2 = e(k1, l1, i2);
/* 2082 */             double d = l1 + 1;
/* 2083 */             if (j2 < 8)
/*      */             {
/* 2085 */               d = l1 + 1 - j2 / 8.0D;
/*      */             }
/* 2087 */             if (d >= axisalignedbb.b)
/*      */             {
/* 2089 */               return true;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2097 */     return false;
/*      */   }
/*      */ 
/*      */   public zf a(kj entity, double d, double d1, double d2, float f)
/*      */   {
/* 2103 */     return a(entity, d, d1, d2, f, false);
/*      */   }
/*      */ 
/*      */   public zf a(kj entity, double d, double d1, double d2, float f, boolean flag)
/*      */   {
/* 2109 */     zf explosion = new zf(this, entity, d, d1, d2, f);
/* 2110 */     explosion.a = flag;
/* 2111 */     explosion.a();
/* 2112 */     explosion.a(true);
/* 2113 */     return explosion;
/*      */   }
/*      */ 
/*      */   public float a(ax vec3d, rp axisalignedbb)
/*      */   {
/* 2118 */     double d = 1.0D / ((axisalignedbb.d - axisalignedbb.a) * 2.0D + 1.0D);
/* 2119 */     double d1 = 1.0D / ((axisalignedbb.e - axisalignedbb.b) * 2.0D + 1.0D);
/* 2120 */     double d2 = 1.0D / ((axisalignedbb.f - axisalignedbb.c) * 2.0D + 1.0D);
/* 2121 */     int i = 0;
/* 2122 */     int j = 0;
/* 2123 */     for (float f = 0.0F; f <= 1.0F; f = (float)(f + d))
/*      */     {
/* 2125 */       for (float f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d1))
/*      */       {
/* 2127 */         for (float f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d2))
/*      */         {
/* 2129 */           double d3 = axisalignedbb.a + (axisalignedbb.d - axisalignedbb.a) * f;
/* 2130 */           double d4 = axisalignedbb.b + (axisalignedbb.e - axisalignedbb.b) * f1;
/* 2131 */           double d5 = axisalignedbb.c + (axisalignedbb.f - axisalignedbb.c) * f2;
/* 2132 */           if (a(ax.b(d3, d4, d5), vec3d) == null)
/*      */           {
/* 2134 */             i++;
/*      */           }
/* 2136 */           j++;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2143 */     return i / j;
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer, int i, int j, int k, int l)
/*      */   {
/* 2148 */     if (l == 0)
/*      */     {
/* 2150 */       j--;
/*      */     }
/* 2152 */     if (l == 1)
/*      */     {
/* 2154 */       j++;
/*      */     }
/* 2156 */     if (l == 2)
/*      */     {
/* 2158 */       k--;
/*      */     }
/* 2160 */     if (l == 3)
/*      */     {
/* 2162 */       k++;
/*      */     }
/* 2164 */     if (l == 4)
/*      */     {
/* 2166 */       i--;
/*      */     }
/* 2168 */     if (l == 5)
/*      */     {
/* 2170 */       i++;
/*      */     }
/* 2172 */     if (a(i, j, k) == lr.as.bA)
/*      */     {
/* 2174 */       a(entityplayer, 1004, i, j, k, 0);
/* 2175 */       g(i, j, k, 0);
/*      */     }
/*      */   }
/*      */ 
/*      */   public kj a(Class class1)
/*      */   {
/* 2181 */     return null;
/*      */   }
/*      */ 
/*      */   public String m()
/*      */   {
/* 2186 */     return "All: " + this.g.size();
/*      */   }
/*      */ 
/*      */   public String n()
/*      */   {
/* 2191 */     return this.A.c();
/*      */   }
/*      */ 
/*      */   public ij b(int i, int j, int k)
/*      */   {
/* 2196 */     vy chunk = c(i >> 4, k >> 4);
/* 2197 */     if (chunk != null)
/*      */     {
/* 2199 */       return chunk.d(i & 0xF, j, k & 0xF);
/*      */     }
/*      */ 
/* 2202 */     return null;
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, ij tileentity)
/*      */   {
/* 2207 */     if ((tileentity == null) || (tileentity.k()))
/* 2208 */       return;
/* 2209 */     List dest = this.V ? this.P : this.h;
/* 2210 */     if (tileentity.canUpdate())
/* 2211 */       dest.add(tileentity);
/* 2212 */     vy chunk = c(i >> 4, k >> 4);
/* 2213 */     if (chunk != null)
/* 2214 */       chunk.a(i & 0xF, j, k & 0xF, tileentity);
/*      */   }
/*      */ 
/*      */   public void o(int i, int j, int k)
/*      */   {
/* 2220 */     vy chunk = c(i >> 4, k >> 4);
/* 2221 */     if (chunk != null)
/* 2222 */       chunk.e(i & 0xF, j, k & 0xF);
/*      */   }
/*      */ 
/*      */   public void a(ij tileentity)
/*      */   {
/* 2228 */     this.Q.add(tileentity);
/*      */   }
/*      */ 
/*      */   public boolean g(int i, int j, int k)
/*      */   {
/* 2233 */     lr block = lr.m[a(i, j, k)];
/* 2234 */     if (block == null)
/*      */     {
/* 2236 */       return false;
/*      */     }
/*      */ 
/* 2239 */     return block.a();
/*      */   }
/*      */ 
/*      */   public boolean h(int i, int j, int k)
/*      */   {
/* 2244 */     lr block = lr.m[a(i, j, k)];
/*      */ 
/* 2246 */     if (block == null)
/* 2247 */       return false;
/* 2248 */     return MineUpForgeAdapter.get().blockIsBlockNormalCube(block, this, i, j, k);
/*      */   }
/*      */ 
/*      */   public boolean isBlockSolidOnSide(int i, int j, int k, int side)
/*      */   {
/* 2256 */     lr block = lr.m[a(i, j, k)];
/* 2257 */     if (block == null)
/* 2258 */       return false;
/* 2259 */     return MineUpForgeAdapter.get().blockIsBlockSolidOnSide(block, this, i, j, k, side);
/*      */   }
/*      */ 
/*      */   public void a(ny iprogressupdate)
/*      */   {
/* 2264 */     a(true, iprogressupdate);
/*      */   }
/*      */ 
/*      */   public void o()
/*      */   {
/* 2269 */     int i = a(1.0F);
/* 2270 */     if (i != this.k)
/*      */     {
/* 2272 */       this.k = i;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(boolean flag, boolean flag1)
/*      */   {
/* 2278 */     this.F = flag;
/* 2279 */     this.G = flag1;
/*      */   }
/*      */ 
/*      */   public void c()
/*      */   {
/* 2284 */     this.J = this.K;
/* 2285 */     this.K += this.L;
/* 2286 */     this.L *= 0.98D;
/* 2287 */     a().b();
/* 2288 */     h();
/* 2289 */     if (A())
/*      */     {
/* 2291 */       boolean flag = false;
/* 2292 */       if ((this.F) && (this.v >= 1))
/*      */       {
/* 2294 */         flag = qk.a(this, this.i);
/*      */       }
/* 2296 */       if (!flag)
/*      */       {
/* 2298 */         long l = this.C.f() + 24000L;
/* 2299 */         this.C.a(l - l % 24000L);
/* 2300 */         z();
/*      */       }
/*      */     }
/* 2303 */     if ((this.G) && (this.C.f() % 400L == 0L))
/* 2304 */       this.spawnContext.incPeacefulCounter();
/* 2305 */     List list = new ArrayList();
/* 2306 */     list.addAll(this.W);
/* 2307 */     this.spawnContext.setPositionsToUpdate(list);
/* 2308 */     qk.performSpawning(this.spawnContext, this.F);
/* 2309 */     tickChild();
/* 2310 */     long l1 = this.C.f() + 1L;
/* 2311 */     if (l1 % this.u == 0L)
/*      */     {
/* 2313 */       a(false, null);
/*      */     }
/* 2315 */     this.C.a(l1);
/* 2316 */     a(false);
/* 2317 */     f();
/*      */   }
/*      */ 
/*      */   public void tickChild()
/*      */   {
/* 2322 */     ((ic)this.A).setLivingChunkAge(x().f() - 400L);
/* 2323 */     this.A.a();
/*      */ 
/* 2325 */     int i = a(1.0F);
/* 2326 */     if (i != this.k)
/*      */     {
/* 2328 */       this.k = i;
/*      */     }
/*      */   }
/*      */ 
/*      */   private void F()
/*      */   {
/* 2334 */     if (this.C.o())
/*      */     {
/* 2336 */       this.o = 1.0F;
/* 2337 */       if (this.C.m())
/*      */       {
/* 2339 */         this.q = 1.0F;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void h()
/*      */   {
/* 2346 */     if (this.y.e)
/*      */     {
/* 2348 */       return;
/*      */     }
/* 2350 */     if (this.r > 0)
/*      */     {
/* 2352 */       this.r -= 1;
/*      */     }
/* 2354 */     int i = this.C.n();
/* 2355 */     if (i <= 0)
/*      */     {
/* 2357 */       if (this.C.m())
/*      */       {
/* 2359 */         this.C.e(this.w.nextInt(12000) + 3600);
/*      */       }
/*      */       else
/* 2362 */         this.C.e(this.w.nextInt(168000) + 12000);
/*      */     }
/*      */     else
/*      */     {
/* 2366 */       i--;
/* 2367 */       this.C.e(i);
/* 2368 */       if (i <= 0)
/*      */       {
/* 2370 */         this.C.a(!this.C.m());
/*      */       }
/*      */     }
/* 2373 */     int j = this.C.p();
/* 2374 */     if (j <= 0)
/*      */     {
/* 2376 */       if (this.C.o())
/*      */       {
/* 2378 */         this.C.f(this.w.nextInt(12000) + 12000);
/*      */       }
/*      */       else
/* 2381 */         this.C.f(this.w.nextInt(168000) + 12000);
/*      */     }
/*      */     else
/*      */     {
/* 2385 */       j--;
/* 2386 */       this.C.f(j);
/* 2387 */       if (j <= 0)
/*      */       {
/* 2389 */         this.C.b(!this.C.o());
/*      */       }
/*      */     }
/* 2392 */     this.n = this.o;
/* 2393 */     if (this.C.o())
/*      */     {
/* 2395 */       this.o = ((float)(this.o + 0.01D));
/*      */     }
/*      */     else {
/* 2398 */       this.o = ((float)(this.o - 0.01D));
/*      */     }
/* 2400 */     if (this.o < 0.0F)
/*      */     {
/* 2402 */       this.o = 0.0F;
/*      */     }
/* 2404 */     if (this.o > 1.0F)
/*      */     {
/* 2406 */       this.o = 1.0F;
/*      */     }
/* 2408 */     this.p = this.q;
/* 2409 */     if (this.C.m())
/*      */     {
/* 2411 */       this.q = ((float)(this.q + 0.01D));
/*      */     }
/*      */     else {
/* 2414 */       this.q = ((float)(this.q - 0.01D));
/*      */     }
/* 2416 */     if (this.q < 0.0F)
/*      */     {
/* 2418 */       this.q = 0.0F;
/*      */     }
/* 2420 */     if (this.q > 1.0F)
/*      */     {
/* 2422 */       this.q = 1.0F;
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void G()
/*      */   {
/* 2428 */     this.C.f(0);
/* 2429 */     this.C.b(false);
/* 2430 */     this.C.e(0);
/* 2431 */     this.C.a(false);
/*      */   }
/*      */ 
/*      */   public void keepChunkActual(vy chunk)
/*      */   {
/* 2436 */     chunk.setChunkAge(x().f());
/*      */   }
/*      */ 
/*      */   protected int updateBlocksAndGrowSnow(vy chunk, int k, int i1, int updateLCG)
/*      */   {
/* 2441 */     updateLCG = updateLCG * 3 + 1013904223;
/* 2442 */     int i2 = updateLCG >> 2;
/* 2443 */     int j3 = i2 & 0xF;
/* 2444 */     int j4 = i2 >> 8 & 0xF;
/* 2445 */     int j5 = e(j3 + k, j4 + i1);
/* 2446 */     if ((a().a(j3 + k, j4 + i1).b()) && (j5 >= 0) && (j5 < 128) && (chunk.a(rf.b, j3, j5, j4) < 10))
/*      */     {
/* 2448 */       int i6 = chunk.a(j3, j5 - 1, j4);
/* 2449 */       int k6 = chunk.a(j3, j5, j4);
/* 2450 */       if ((C()) && (k6 == 0) && (lr.aT.e(this, j3 + k, j5, j4 + i1)) && (i6 != 0) && (i6 != lr.aU.bA) && (lr.m[i6].bN.c()))
/*      */       {
/* 2452 */         g(j3 + k, j5, j4 + i1, lr.aT.bA);
/*      */       }
/* 2454 */       if ((i6 == lr.C.bA) && (chunk.b(j3, j5 - 1, j4) == 0)) {
/* 2455 */         boolean flag = true;
/* 2456 */         if ((flag) && (f(j3 + k - 1, j5 - 1, j4 + i1) != wa.g)) {
/* 2457 */           flag = false;
/*      */         }
/* 2459 */         if ((flag) && (f(j3 + k + 1, j5 - 1, j4 + i1) != wa.g)) {
/* 2460 */           flag = false;
/*      */         }
/* 2462 */         if ((flag) && (f(j3 + k, j5 - 1, j4 + i1 - 1) != wa.g)) {
/* 2463 */           flag = false;
/*      */         }
/* 2465 */         if ((flag) && (f(j3 + k, j5 - 1, j4 + i1 + 1) != wa.g)) {
/* 2466 */           flag = false;
/*      */         }
/* 2468 */         if (!flag) {
/* 2469 */           g(j3 + k, j5 - 1, j4 + i1, lr.aU.bA);
/*      */         }
/*      */       }
/*      */     }
/* 2473 */     return updateLCG;
/*      */   }
/*      */ 
/*      */   protected int updateBlocksAndGenerateLightings(vy chunk, int k, int i1, int updateLCG) {
/* 2477 */     if ((C()) && (B())) {
/* 2478 */       updateLCG = updateLCG * 3 + 1013904223;
/* 2479 */       int l1 = updateLCG >> 2;
/* 2480 */       int i3 = k + (l1 & 0xF);
/* 2481 */       int i4 = i1 + (l1 >> 8 & 0xF);
/* 2482 */       int i5 = e(i3, i4);
/* 2483 */       if (t(i3, i5, i4)) {
/* 2484 */         e(new c(this, i3, i5, i4));
/* 2485 */         this.r = 2;
/*      */       }
/*      */     }
/* 2488 */     return updateLCG;
/*      */   }
/*      */ 
/*      */   protected void f()
/*      */   {
/* 2493 */     this.W.clear();
/* 2494 */     for (int i = 0; i < this.i.size(); i++)
/*      */     {
/* 2496 */       getChunksNearEntity(this.W, (kj)this.i.get(i));
/*      */     }
/*      */ 
/* 2499 */     if (this.X > 0)
/*      */     {
/* 2501 */       this.X -= 1;
/*      */     }
/* 2503 */     for (Iterator iterator = this.W.iterator(); iterator.hasNext(); )
/*      */     {
/* 2505 */       oh chunkcoordintpair = (oh)iterator.next();
/* 2506 */       int k = chunkcoordintpair.a * 16;
/* 2507 */       int i1 = chunkcoordintpair.b * 16;
/* 2508 */       vy chunk = c(chunkcoordintpair.a, chunkcoordintpair.b);
/* 2509 */       chunk.j();
/* 2510 */       keepChunkActual(chunk);
/* 2511 */       if (this.X == 0)
/*      */       {
/* 2513 */         this.l = (this.l * 3 + 1013904223);
/* 2514 */         int k1 = this.l >> 2;
/* 2515 */         int l2 = k1 & 0xF;
/* 2516 */         int l3 = k1 >> 8 & 0xF;
/* 2517 */         int l4 = k1 >> 16 & 0x7F;
/* 2518 */         int l5 = chunk.a(l2, l4, l3);
/* 2519 */         l2 += k;
/* 2520 */         l3 += i1;
/* 2521 */         if ((l5 == 0) && (m(l2, l4, l3) <= this.w.nextInt(8)) && (b(rf.a, l2, l4, l3) <= 0))
/*      */         {
/* 2523 */           sz entityplayer1 = a(l2 + 0.5D, l4 + 0.5D, l3 + 0.5D, 8.0D);
/* 2524 */           if ((entityplayer1 != null) && (entityplayer1.f(l2 + 0.5D, l4 + 0.5D, l3 + 0.5D) > 4.0D))
/*      */           {
/* 2526 */             a(l2 + 0.5D, l4 + 0.5D, l3 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.w.nextFloat() * 0.2F);
/* 2527 */             this.X = (this.w.nextInt(12000) + 6000);
/*      */           }
/*      */         }
/*      */       }
/* 2531 */       if (this.w.nextInt(100000) == 0)
/* 2532 */         this.l = updateBlocksAndGenerateLightings(chunk, k, i1, this.l);
/* 2533 */       if (this.w.nextInt(16) == 0)
/* 2534 */         this.l = updateBlocksAndGrowSnow(chunk, k, i1, this.l);
/* 2535 */       p(k + this.w.nextInt(16), this.w.nextInt(getWorldHeight()), i1 + this.w.nextInt(16));
/* 2536 */       int j2 = 0;
/* 2537 */       while (j2 < 80)
/*      */       {
/* 2539 */         this.l = (this.l * 3 + 1013904223);
/* 2540 */         int k3 = this.l >> 2;
/* 2541 */         int k4 = k3 & 0xF;
/* 2542 */         int k5 = k3 >> 8 & 0xF;
/* 2543 */         int j6 = k3 >> 16 & 0x7F;
/* 2544 */         int l6 = chunk.b[(k4 << 11 | k5 << 7 | j6)] & 0xFF;
/* 2545 */         if (lr.n[l6] != 0)
/*      */         {
/* 2547 */           lr.m[l6].a(this, k4 + k, j6, k5 + i1, this.w);
/*      */         }
/* 2549 */         j2++;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void p(int i, int j, int k)
/*      */   {
/* 2557 */     if (this.parentWorld != null)
/*      */     {
/* 2559 */       return;
/*      */     }
/* 2561 */     c(rf.a, i, j, k);
/* 2562 */     c(rf.b, i, j, k);
/*      */   }
/*      */ 
/*      */   protected int a(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/* 2567 */     int k1 = 0;
/* 2568 */     if (l(j, k, l))
/*      */     {
/* 2570 */       k1 = 15;
/*      */     }
/*      */     else {
/* 2573 */       if (j1 == 0)
/*      */       {
/* 2575 */         j1 = 1;
/*      */       }
/* 2577 */       for (int l1 = 0; l1 < 6; l1++)
/*      */       {
/* 2579 */         int i2 = l1 % 2 * 2 - 1;
/* 2580 */         int j2 = j + l1 / 2 % 3 / 2 * i2;
/* 2581 */         int k2 = k + (l1 / 2 + 1) % 3 / 2 * i2;
/* 2582 */         int l2 = l + (l1 / 2 + 2) % 3 / 2 * i2;
/* 2583 */         int i3 = 0;
/* 2584 */         if (i2 != 0)
/*      */         {
/* 2586 */           if ((k < 128) && (k2 >= 128))
/* 2587 */             i3 = rf.a.c;
/* 2588 */           else if ((k >= 128) && (k2 < 128))
/* 2589 */             i3 = rf.b.c;
/*      */           else
/* 2591 */             i3 = b(rf.a, j2, k2, l2);
/*      */         }
/* 2593 */         else i3 = b(rf.a, j2, k2, l2);
/* 2594 */         i3 -= j1;
/* 2595 */         if (i3 > k1)
/*      */         {
/* 2597 */           k1 = i3;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/* 2602 */     return k1;
/*      */   }
/*      */ 
/*      */   protected int d(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/* 2607 */     int k1 = MineUpForgeAdapter.get().blockGetLightValue(i1, this, j, k, l);
/* 2608 */     int l1 = b(rf.b, j - 1, k, l) - j1;
/* 2609 */     int i2 = b(rf.b, j + 1, k, l) - j1;
/* 2610 */     int j2 = b(rf.b, j, k - 1, l) - j1;
/* 2611 */     int k2 = b(rf.b, j, k + 1, l) - j1;
/* 2612 */     int l2 = b(rf.b, j, k, l - 1) - j1;
/* 2613 */     int i3 = b(rf.b, j, k, l + 1) - j1;
/* 2614 */     if (l1 > k1)
/*      */     {
/* 2616 */       k1 = l1;
/*      */     }
/* 2618 */     if (i2 > k1)
/*      */     {
/* 2620 */       k1 = i2;
/*      */     }
/* 2622 */     if (j2 > k1)
/*      */     {
/* 2624 */       k1 = j2;
/*      */     }
/* 2626 */     if (k2 > k1)
/*      */     {
/* 2628 */       k1 = k2;
/*      */     }
/* 2630 */     if (l2 > k1)
/*      */     {
/* 2632 */       k1 = l2;
/*      */     }
/* 2634 */     if (i3 > k1)
/*      */     {
/* 2636 */       k1 = i3;
/*      */     }
/* 2638 */     return k1;
/*      */   }
/*      */ 
/*      */   public void c(rf enumskyblock, int i, int j, int k)
/*      */   {
/* 2643 */     if (!e(i, j, k, 17))
/*      */     {
/* 2645 */       return;
/*      */     }
/* 2647 */     if (this.parentWorld != null)
/*      */     {
/* 2649 */       this.parentWorld.c(enumskyblock, i, j + this.shiftY, k);
/* 2650 */       return;
/*      */     }
/* 2652 */     int l = 0;
/* 2653 */     int i1 = 0;
/* 2654 */     int j1 = b(enumskyblock, i, j, k);
/* 2655 */     int l1 = 0;
/* 2656 */     int j2 = j1;
/* 2657 */     int i3 = a(i, j, k);
/* 2658 */     int l3 = lr.q[i3];
/* 2659 */     if (l3 == 0)
/*      */     {
/* 2661 */       l3 = 1;
/*      */     }
/* 2663 */     int k4 = 0;
/* 2664 */     if (enumskyblock == rf.a)
/*      */     {
/* 2666 */       k4 = a(j2, i, j, k, i3, l3);
/*      */     }
/*      */     else {
/* 2669 */       k4 = d(j2, i, j, k, i3, l3);
/*      */     }
/* 2671 */     l1 = k4;
/* 2672 */     if (l1 > j1)
/*      */     {
/* 2674 */       this.H[(i1++)] = 133152;
/*      */     }
/* 2676 */     else if (l1 < j1)
/*      */     {
/* 2678 */       if (enumskyblock == rf.b);
/* 2679 */       this.H[(i1++)] = (133152 + (j1 << 18));
/*      */ 
/* 2682 */       while (l < i1)
/*      */       {
/* 2686 */         int k2 = this.H[(l++)];
/* 2687 */         int j3 = (k2 & 0x3F) - 32 + i;
/* 2688 */         int i4 = (k2 >> 6 & 0x3F) - 32 + j;
/* 2689 */         int l4 = (k2 >> 12 & 0x3F) - 32 + k;
/* 2690 */         int j5 = k2 >> 18 & 0xF;
/* 2691 */         int l5 = b(enumskyblock, j3, i4, l4);
/* 2692 */         if (l5 == j5)
/*      */         {
/* 2694 */           a(enumskyblock, j3, i4, l4, 0);
/* 2695 */           j5--; if (j5 > 0)
/*      */           {
/* 2697 */             int k6 = j3 - i;
/* 2698 */             int i7 = i4 - j;
/* 2699 */             int k7 = l4 - k;
/* 2700 */             if (k6 < 0)
/*      */             {
/* 2702 */               k6 = -k6;
/*      */             }
/* 2704 */             if (i7 < 0)
/*      */             {
/* 2706 */               i7 = -i7;
/*      */             }
/* 2708 */             if (k7 < 0)
/*      */             {
/* 2710 */               k7 = -k7;
/*      */             }
/* 2712 */             if (k6 + i7 + k7 < 17)
/*      */             {
/* 2714 */               int i8 = 0;
/* 2715 */               while (i8 < 6)
/*      */               {
/* 2717 */                 int j8 = i8 % 2 * 2 - 1;
/* 2718 */                 int k8 = j3 + i8 / 2 % 3 / 2 * j8;
/* 2719 */                 int l8 = i4 + (i8 / 2 + 1) % 3 / 2 * j8;
/* 2720 */                 int i9 = l4 + (i8 / 2 + 2) % 3 / 2 * j8;
/* 2721 */                 int i6 = b(enumskyblock, k8, l8, i9);
/* 2722 */                 if (i6 == j5)
/*      */                 {
/* 2724 */                   this.H[(i1++)] = (k8 - i + 32 + (l8 - j + 32 << 6) + (i9 - k + 32 << 12) + (j5 << 18));
/*      */                 }
/* 2726 */                 i8++;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/* 2732 */       l = 0;
/*      */     }
/*      */ 
/* 2736 */     while (l < i1)
/*      */     {
/* 2740 */       int k1 = this.H[(l++)];
/* 2741 */       int i2 = (k1 & 0x3F) - 32 + i;
/* 2742 */       int l2 = (k1 >> 6 & 0x3F) - 32 + j;
/* 2743 */       int k3 = (k1 >> 12 & 0x3F) - 32 + k;
/* 2744 */       int j4 = b(enumskyblock, i2, l2, k3);
/* 2745 */       int i5 = a(i2, l2, k3);
/* 2746 */       int k5 = lr.q[i5];
/* 2747 */       if (k5 == 0)
/*      */       {
/* 2749 */         k5 = 1;
/*      */       }
/* 2751 */       int j6 = 0;
/* 2752 */       if (enumskyblock == rf.a)
/*      */       {
/* 2754 */         j6 = a(j4, i2, l2, k3, i5, k5);
/*      */       }
/*      */       else {
/* 2757 */         j6 = d(j4, i2, l2, k3, i5, k5);
/*      */       }
/* 2759 */       if (j6 != j4)
/*      */       {
/* 2761 */         a(enumskyblock, i2, l2, k3, j6);
/* 2762 */         if (j6 > j4)
/*      */         {
/* 2764 */           int l6 = i2 - i;
/* 2765 */           int j7 = l2 - j;
/* 2766 */           int l7 = k3 - k;
/* 2767 */           if (l6 < 0)
/*      */           {
/* 2769 */             l6 = -l6;
/*      */           }
/* 2771 */           if (j7 < 0)
/*      */           {
/* 2773 */             j7 = -j7;
/*      */           }
/* 2775 */           if (l7 < 0)
/*      */           {
/* 2777 */             l7 = -l7;
/*      */           }
/* 2779 */           if ((l6 + j7 + l7 < 17) && (i1 < this.H.length - 6))
/*      */           {
/* 2781 */             if (b(enumskyblock, i2 - 1, l2, k3) < j6)
/*      */             {
/* 2783 */               this.H[(i1++)] = (i2 - 1 - i + 32 + (l2 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/* 2785 */             if (b(enumskyblock, i2 + 1, l2, k3) < j6)
/*      */             {
/* 2787 */               this.H[(i1++)] = (i2 + 1 - i + 32 + (l2 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/* 2789 */             if (b(enumskyblock, i2, l2 - 1, k3) < j6)
/*      */             {
/* 2791 */               this.H[(i1++)] = (i2 - i + 32 + (l2 - 1 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/* 2793 */             if (b(enumskyblock, i2, l2 + 1, k3) < j6)
/*      */             {
/* 2795 */               this.H[(i1++)] = (i2 - i + 32 + (l2 + 1 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/* 2797 */             if (b(enumskyblock, i2, l2, k3 - 1) < j6)
/*      */             {
/* 2799 */               this.H[(i1++)] = (i2 - i + 32 + (l2 - j + 32 << 6) + (k3 - 1 - k + 32 << 12));
/*      */             }
/* 2801 */             if (b(enumskyblock, i2, l2, k3 + 1) < j6)
/*      */             {
/* 2803 */               this.H[(i1++)] = (i2 - i + 32 + (l2 - j + 32 << 6) + (k3 + 1 - k + 32 << 12));
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean a(boolean flag)
/*      */   {
/* 2813 */     int i = this.N.size();
/* 2814 */     if (i != this.O.size())
/*      */     {
/* 2816 */       throw new IllegalStateException("TickNextTick list out of synch");
/*      */     }
/* 2818 */     if (i > 1000)
/*      */     {
/* 2820 */       i = 1000;
/*      */     }
/* 2822 */     for (int j = 0; j < i; j++)
/*      */     {
/* 2824 */       jm nextticklistentry = (jm)this.N.first();
/* 2825 */       if ((!flag) && (nextticklistentry.e > this.C.f()))
/*      */       {
/*      */         break;
/*      */       }
/* 2829 */       this.N.remove(nextticklistentry);
/* 2830 */       this.O.remove(nextticklistentry);
/* 2831 */       returnToPool(nextticklistentry);
/* 2832 */       byte byte0 = 8;
/* 2833 */       if (b(nextticklistentry.a - byte0, nextticklistentry.b - byte0, nextticklistentry.c - byte0, nextticklistentry.a + byte0, nextticklistentry.b + byte0, nextticklistentry.c + byte0))
/*      */       {
/* 2837 */         int k = a(nextticklistentry.a, nextticklistentry.b, nextticklistentry.c);
/* 2838 */         if ((k == nextticklistentry.d) && (k > 0))
/*      */         {
/* 2840 */           lr.m[k].a(this, nextticklistentry.a, nextticklistentry.b, nextticklistentry.c, this.w);
/*      */         }
/*      */       }
/*      */     }
/* 2844 */     return this.N.size() != 0;
/*      */   }
/*      */ 
/*      */   public void q(int i, int j, int k)
/*      */   {
/* 2849 */     byte byte0 = 16;
/* 2850 */     Random random = new Random();
/* 2851 */     for (int l = 0; l < 1000; l++)
/*      */     {
/* 2853 */       int i1 = i + this.w.nextInt(byte0) - this.w.nextInt(byte0);
/* 2854 */       int j1 = j + this.w.nextInt(byte0) - this.w.nextInt(byte0);
/* 2855 */       int k1 = k + this.w.nextInt(byte0) - this.w.nextInt(byte0);
/* 2856 */       int l1 = a(i1, j1, k1);
/* 2857 */       if ((this.w.nextInt(8) > j1) && (l1 == 0))
/*      */       {
/* 2859 */         a("depthsuspend", i1 + this.w.nextFloat(), j1 + this.w.nextFloat(), k1 + this.w.nextFloat(), 0.0D, 0.0D, 0.0D);
/*      */       }
/* 2861 */       if (l1 > 0)
/*      */       {
/* 2863 */         lr.m[l1].b(this, i1, j1, k1, random);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public List b(kj entity, rp axisalignedbb)
/*      */   {
/* 2871 */     this.Y.clear();
/* 2872 */     int i = et.b((axisalignedbb.a - 2.0D) / 16.0D);
/* 2873 */     int j = et.b((axisalignedbb.d + 2.0D) / 16.0D);
/* 2874 */     int k = et.b((axisalignedbb.c - 2.0D) / 16.0D);
/* 2875 */     int l = et.b((axisalignedbb.f + 2.0D) / 16.0D);
/* 2876 */     for (int i1 = i; i1 <= j; i1++)
/*      */     {
/* 2878 */       for (int j1 = k; j1 <= l; j1++)
/*      */       {
/* 2880 */         if (g(i1, j1))
/*      */         {
/* 2882 */           c(i1, j1).a(entity, axisalignedbb, this.Y);
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2888 */     return this.Y;
/*      */   }
/*      */ 
/*      */   public List a(Class class1, rp axisalignedbb)
/*      */   {
/* 2893 */     int i = et.b((axisalignedbb.a - 2.0D) / 16.0D);
/* 2894 */     int j = et.b((axisalignedbb.d + 2.0D) / 16.0D);
/* 2895 */     int k = et.b((axisalignedbb.c - 2.0D) / 16.0D);
/* 2896 */     int l = et.b((axisalignedbb.f + 2.0D) / 16.0D);
/* 2897 */     ArrayList arraylist = new ArrayList();
/* 2898 */     for (int i1 = i; i1 <= j; i1++)
/*      */     {
/* 2900 */       for (int j1 = k; j1 <= l; j1++)
/*      */       {
/* 2902 */         if (g(i1, j1))
/*      */         {
/* 2904 */           c(i1, j1).a(class1, axisalignedbb, arraylist);
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2910 */     return arraylist;
/*      */   }
/*      */ 
/*      */   public List p()
/*      */   {
/* 2915 */     ArrayList arr = new ArrayList();
/* 2916 */     arr.addAll(this.g);
/* 2917 */     return arr;
/*      */   }
/*      */ 
/*      */   public void b(int i, int j, int k, ij tileentity)
/*      */   {
/* 2922 */     if (d(i, j, k))
/*      */     {
/* 2924 */       b(i, k).g();
/*      */     }
/* 2926 */     for (int l = 0; l < this.z.size(); l++)
/*      */     {
/* 2928 */       ((yj)this.z.get(l)).a(i, j, k, tileentity);
/*      */     }
/*      */   }
/*      */ 
/*      */   public int b(Class class1)
/*      */   {
/* 2935 */     return ((EntitiesCollection)this.g).getCountByClass(class1);
/*      */   }
/*      */ 
/*      */   public void a(List list)
/*      */   {
/* 2942 */     if (this.parentWorld != null)
/*      */     {
/* 2944 */       for (int i = 0; i < list.size(); i++) {
/* 2945 */         kj entity = (kj)list.get(i);
/* 2946 */         entity.chunkLayer = this;
/* 2947 */         entity.k = this.parentWorld;
/*      */       }
/* 2949 */       this.parentWorld.a(list);
/* 2950 */       return;
/*      */     }
/* 2952 */     this.g.addAll(list);
/* 2953 */     for (int i = 0; i < list.size(); i++)
/*      */     {
/* 2955 */       c((kj)list.get(i));
/*      */     }
/*      */   }
/*      */ 
/*      */   public void b(List list)
/*      */   {
/* 2962 */     if (this.parentWorld != null)
/* 2963 */       this.parentWorld.b(list);
/*      */     else
/* 2965 */       this.M.addAll(list);
/*      */   }
/*      */ 
/*      */   public void q()
/*      */   {
/* 2970 */     while (this.A.a());
/*      */   }
/*      */ 
/*      */   public boolean a(int i, int j, int k, int l, boolean flag, int i1)
/*      */   {
/* 2975 */     int j1 = a(j, k, l);
/* 2976 */     lr block = lr.m[j1];
/* 2977 */     lr block1 = lr.m[i];
/* 2978 */     rp axisalignedbb = block1.c(this, j, k, l);
/* 2979 */     if (flag)
/*      */     {
/* 2981 */       axisalignedbb = null;
/*      */     }
/* 2983 */     if ((axisalignedbb != null) && (!a(axisalignedbb)))
/*      */     {
/* 2985 */       return false;
/*      */     }
/* 2987 */     if ((block == lr.B) || (block == lr.C) || (block == lr.D) || (block == lr.E) || (block == lr.as) || (block == lr.aT) || (block == lr.bv))
/*      */     {
/* 2989 */       block = null;
/*      */     }
/* 2991 */     if ((block != null) && (MineUpForgeAdapter.get().blockIsBlockReplaceable(block, this, j, k, l)))
/* 2992 */       block = null;
/* 2993 */     return (i > 0) && (block == null) && (block1.d(this, j, k, l, i1));
/*      */   }
/*      */ 
/*      */   public qu a(kj entity, kj entity1, float f)
/*      */   {
/* 2998 */     int i = et.b(entity.o);
/* 2999 */     int j = et.b(entity.p);
/* 3000 */     int k = et.b(entity.q);
/* 3001 */     int l = (int)(f + 16.0F);
/* 3002 */     int i1 = i - l;
/* 3003 */     int j1 = j - l;
/* 3004 */     int k1 = k - l;
/* 3005 */     int l1 = i + l;
/* 3006 */     int i2 = j + l;
/* 3007 */     int j2 = k + l;
/* 3008 */     adg chunkcache = createChunkCache(i1, j1, k1, l1, i2, j2);
/* 3009 */     return new si(chunkcache).a(entity, entity1, f);
/*      */   }
/*      */ 
/*      */   public qu a(kj entity, int i, int j, int k, float f)
/*      */   {
/* 3014 */     int l = et.b(entity.o);
/* 3015 */     int i1 = et.b(entity.p);
/* 3016 */     int j1 = et.b(entity.q);
/* 3017 */     int k1 = (int)(f + 8.0F);
/* 3018 */     int l1 = l - k1;
/* 3019 */     int i2 = i1 - k1;
/* 3020 */     int j2 = j1 - k1;
/* 3021 */     int k2 = l + k1;
/* 3022 */     int l2 = i1 + k1;
/* 3023 */     int i3 = j1 + k1;
/* 3024 */     adg chunkcache = createChunkCache(l1, i2, j2, k2, l2, i3);
/* 3025 */     return new si(chunkcache).a(entity, i, j, k, f);
/*      */   }
/*      */ 
/*      */   public boolean k(int i, int j, int k, int l)
/*      */   {
/* 3030 */     int i1 = a(i, j, k);
/* 3031 */     if (i1 == 0)
/*      */     {
/* 3033 */       return false;
/*      */     }
/*      */ 
/* 3036 */     return lr.m[i1].e(this, i, j, k, l);
/*      */   }
/*      */ 
/*      */   public boolean r(int i, int j, int k)
/*      */   {
/* 3042 */     if (k(i, j - 1, k, 0))
/*      */     {
/* 3044 */       return true;
/*      */     }
/* 3046 */     if (k(i, j + 1, k, 1))
/*      */     {
/* 3048 */       return true;
/*      */     }
/* 3050 */     if (k(i, j, k - 1, 2))
/*      */     {
/* 3052 */       return true;
/*      */     }
/* 3054 */     if (k(i, j, k + 1, 3))
/*      */     {
/* 3056 */       return true;
/*      */     }
/* 3058 */     if (k(i - 1, j, k, 4))
/*      */     {
/* 3060 */       return true;
/*      */     }
/* 3062 */     return k(i + 1, j, k, 5);
/*      */   }
/*      */ 
/*      */   public boolean l(int i, int j, int k, int l)
/*      */   {
/* 3067 */     if (h(i, j, k))
/*      */     {
/* 3069 */       return r(i, j, k);
/*      */     }
/* 3071 */     int i1 = a(i, j, k);
/* 3072 */     if (i1 == 0)
/*      */     {
/* 3074 */       return false;
/*      */     }
/*      */ 
/* 3077 */     return lr.m[i1].b(this, i, j, k, l);
/*      */   }
/*      */ 
/*      */   public boolean s(int i, int j, int k)
/*      */   {
/* 3083 */     if (l(i, j - 1, k, 0))
/*      */     {
/* 3085 */       return true;
/*      */     }
/* 3087 */     if (l(i, j + 1, k, 1))
/*      */     {
/* 3089 */       return true;
/*      */     }
/* 3091 */     if (l(i, j, k - 1, 2))
/*      */     {
/* 3093 */       return true;
/*      */     }
/* 3095 */     if (l(i, j, k + 1, 3))
/*      */     {
/* 3097 */       return true;
/*      */     }
/* 3099 */     if (l(i - 1, j, k, 4))
/*      */     {
/* 3101 */       return true;
/*      */     }
/* 3103 */     return l(i + 1, j, k, 5);
/*      */   }
/*      */ 
/*      */   public sz a(kj entity, double d)
/*      */   {
/* 3108 */     return a(entity.o, entity.p, entity.q, d);
/*      */   }
/*      */ 
/*      */   public sz a(double d, double d1, double d2, double d3)
/*      */   {
/* 3113 */     double d4 = -1.0D;
/* 3114 */     sz entityplayer = null;
/* 3115 */     for (int i = 0; i < this.i.size(); i++)
/*      */     {
/* 3117 */       sz entityplayer1 = (sz)this.i.get(i);
/* 3118 */       double d5 = entityplayer1.f(d, d1, d2);
/* 3119 */       if (((d3 < 0.0D) || (d5 < d3 * d3)) && ((d4 == -1.0D) || (d5 < d4)))
/*      */       {
/* 3121 */         d4 = d5;
/* 3122 */         entityplayer = entityplayer1;
/*      */       }
/*      */     }
/*      */ 
/* 3126 */     return entityplayer;
/*      */   }
/*      */ 
/*      */   public sz a(String s)
/*      */   {
/* 3131 */     for (int i = 0; i < this.i.size(); i++)
/*      */     {
/* 3133 */       if (s.equals(((sz)this.i.get(i)).aD))
/*      */       {
/* 3135 */         return (sz)this.i.get(i);
/*      */       }
/*      */     }
/*      */ 
/* 3139 */     return null;
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, int l, int i1, int j1, byte[] abyte0) {
/* 3143 */     setChunkDataFrom(i, j, k, l, i1, j1, abyte0, 0);
/*      */   }
/*      */ 
/*      */   protected int setChunkDataFrom(int i, int j, int k, int l, int i1, int j1, byte[] abyte0, int position)
/*      */   {
/* 3148 */     int k1 = i >> 4;
/* 3149 */     int l1 = k >> 4;
/* 3150 */     int i2 = i + l - 1 >> 4;
/* 3151 */     int j2 = k + j1 - 1 >> 4;
/* 3152 */     int k2 = position;
/* 3153 */     int l2 = j;
/* 3154 */     int i3 = j + i1;
/* 3155 */     if (l2 < 0)
/*      */     {
/* 3157 */       l2 = 0;
/*      */     }
/* 3159 */     if (i3 > getWorldHeight())
/*      */     {
/* 3161 */       i3 = getWorldHeight();
/*      */     }
/* 3163 */     for (int j3 = k1; j3 <= i2; j3++)
/*      */     {
/* 3165 */       int k3 = i - j3 * 16;
/* 3166 */       int l3 = i + l - j3 * 16;
/* 3167 */       if (k3 < 0)
/*      */       {
/* 3169 */         k3 = 0;
/*      */       }
/* 3171 */       if (l3 > 16)
/*      */       {
/* 3173 */         l3 = 16;
/*      */       }
/* 3175 */       for (int i4 = l1; i4 <= j2; i4++)
/*      */       {
/* 3177 */         int j4 = k - i4 * 16;
/* 3178 */         int k4 = k + j1 - i4 * 16;
/* 3179 */         if (j4 < 0)
/*      */         {
/* 3181 */           j4 = 0;
/*      */         }
/* 3183 */         if (k4 > 16)
/*      */         {
/* 3185 */           k4 = 16;
/*      */         }
/* 3187 */         k2 = c(j3, i4).a(abyte0, k3, l2, j4, l3, i3, k4, k2);
/* 3188 */         c(j3 * 16 + k3, l2, i4 * 16 + j4, j3 * 16 + l3, i3, i4 * 16 + k4);
/*      */       }
/*      */     }
/* 3191 */     return k2;
/*      */   }
/*      */ 
/*      */   public void g()
/*      */   {
/*      */   }
/*      */ 
/*      */   public void r()
/*      */   {
/* 3200 */     this.B.b();
/*      */   }
/*      */ 
/*      */   public void a(long l)
/*      */   {
/* 3205 */     this.C.a(l);
/*      */   }
/*      */ 
/*      */   public long s()
/*      */   {
/* 3210 */     return this.C.b();
/*      */   }
/*      */ 
/*      */   public long t()
/*      */   {
/* 3215 */     return this.C.f();
/*      */   }
/*      */ 
/*      */   public ps u()
/*      */   {
/* 3220 */     return new ps(this.C.c(), this.C.d(), this.C.e());
/*      */   }
/*      */ 
/*      */   public void a(ps chunkcoordinates)
/*      */   {
/* 3225 */     this.C.a(chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c);
/*      */   }
/*      */ 
/*      */   public void g(kj entity)
/*      */   {
/* 3230 */     int i = et.b(entity.o / 16.0D);
/* 3231 */     int j = et.b(entity.q / 16.0D);
/* 3232 */     byte byte0 = 2;
/* 3233 */     for (int k = i - byte0; k <= i + byte0; k++)
/*      */     {
/* 3235 */       for (int l = j - byte0; l <= j + byte0; l++)
/*      */       {
/* 3237 */         c(k, l);
/*      */       }
/*      */     }
/*      */ 
/* 3241 */     this.g.add(entity);
/*      */   }
/*      */ 
/*      */   public boolean a(sz entityplayer, int i, int j, int k)
/*      */   {
/* 3246 */     return true;
/*      */   }
/*      */ 
/*      */   public void a(kj entity, byte byte0)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void v()
/*      */   {
/* 3255 */     if (this.parentWorld != null)
/* 3256 */       throw new WorldLayerException();
/* 3257 */     this.g.removeAll(this.M);
/* 3258 */     for (int i = 0; i < this.M.size(); i++)
/*      */     {
/* 3260 */       kj entity = (kj)this.M.get(i);
/* 3261 */       int l = entity.ah;
/* 3262 */       int j1 = entity.aj;
/* 3263 */       if ((entity.ag) && (g(l, j1)))
/*      */       {
/* 3265 */         c(l, j1).b(entity);
/*      */       }
/*      */     }
/*      */ 
/* 3269 */     for (int j = 0; j < this.M.size(); j++)
/*      */     {
/* 3271 */       d((kj)this.M.get(j));
/*      */     }
/*      */ 
/* 3274 */     this.M.clear();
/* 3275 */     for (Iterator it = this.g.iterator(); it.hasNext(); ) {
/* 3276 */       kj entity1 = (kj)it.next();
/* 3277 */       if (entity1.j != null)
/*      */       {
/* 3279 */         if ((entity1.j.G) || (entity1.j.i != entity1))
/*      */         {
/* 3283 */           entity1.j.i = null;
/* 3284 */           entity1.j = null;
/*      */         }
/* 3286 */       } else if (entity1.G)
/*      */       {
/* 3290 */         int i1 = entity1.ah;
/* 3291 */         int k1 = entity1.aj;
/* 3292 */         if ((entity1.ag) && (g(i1, k1)))
/*      */         {
/* 3294 */           c(i1, k1).b(entity1);
/*      */         }
/* 3296 */         it.remove();
/* 3297 */         d(entity1);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public bf w()
/*      */   {
/* 3304 */     return this.A;
/*      */   }
/*      */ 
/*      */   public void e(int i, int j, int k, int l, int i1)
/*      */   {
/* 3309 */     int j1 = a(i, j, k);
/* 3310 */     if (j1 > 0)
/*      */     {
/* 3312 */       lr.m[j1].a(this, i, j, k, l, i1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public rl x()
/*      */   {
/* 3318 */     return this.C;
/*      */   }
/*      */ 
/*      */   public void y()
/*      */   {
/* 3323 */     this.T = (!this.i.isEmpty());
/* 3324 */     Iterator iterator = this.i.iterator();
/*      */ 
/* 3327 */     while (iterator.hasNext())
/*      */     {
/* 3331 */       sz entityplayer = (sz)iterator.next();
/* 3332 */       if (!entityplayer.an())
/*      */       {
/* 3336 */         this.T = false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void z()
/*      */   {
/* 3343 */     this.T = false;
/* 3344 */     Iterator iterator = this.i.iterator();
/*      */ 
/* 3347 */     while (iterator.hasNext())
/*      */     {
/* 3351 */       sz entityplayer = (sz)iterator.next();
/* 3352 */       if (entityplayer.an())
/*      */       {
/* 3354 */         entityplayer.a(false, false, true);
/*      */       }
/*      */     }
/* 3357 */     G();
/*      */   }
/*      */ 
/*      */   public boolean A()
/*      */   {
/* 3362 */     if ((this.T) && (!this.I))
/*      */     {
/* 3364 */       for (Iterator iterator = this.i.iterator(); iterator.hasNext(); )
/*      */       {
/* 3366 */         sz entityplayer = (sz)iterator.next();
/* 3367 */         if (!entityplayer.ao())
/*      */         {
/* 3369 */           return false;
/*      */         }
/*      */       }
/*      */ 
/* 3373 */       return true;
/*      */     }
/*      */ 
/* 3376 */     return false;
/*      */   }
/*      */ 
/*      */   public float h(float f)
/*      */   {
/* 3382 */     return (this.p + (this.q - this.p) * f) * i(f);
/*      */   }
/*      */ 
/*      */   public float i(float f)
/*      */   {
/* 3387 */     return this.n + (this.o - this.n) * f;
/*      */   }
/*      */ 
/*      */   public void j(float f)
/*      */   {
/* 3392 */     this.n = f;
/* 3393 */     this.o = f;
/*      */   }
/*      */ 
/*      */   public boolean B()
/*      */   {
/* 3398 */     return h(1.0F) > 0.9D;
/*      */   }
/*      */ 
/*      */   public boolean C()
/*      */   {
/* 3403 */     return i(1.0F) > 0.2D;
/*      */   }
/*      */ 
/*      */   public boolean t(int i, int j, int k)
/*      */   {
/* 3408 */     if (!C())
/*      */     {
/* 3410 */       return false;
/*      */     }
/* 3412 */     if (!l(i, j, k))
/*      */     {
/* 3414 */       return false;
/*      */     }
/* 3416 */     if (e(i, k) > j)
/*      */     {
/* 3418 */       return false;
/*      */     }
/* 3420 */     vh biomegenbase = a().a(i, k);
/* 3421 */     if (biomegenbase.b())
/*      */     {
/* 3423 */       return false;
/*      */     }
/*      */ 
/* 3426 */     return biomegenbase.c();
/*      */   }
/*      */ 
/*      */   public void a(String s, tl mapdatabase)
/*      */   {
/* 3432 */     this.E.a(s, mapdatabase);
/*      */   }
/*      */ 
/*      */   public tl a(Class class1, String s)
/*      */   {
/* 3437 */     return this.E.a(class1, s);
/*      */   }
/*      */ 
/*      */   public int b(String s)
/*      */   {
/* 3442 */     return this.E.a(s);
/*      */   }
/*      */ 
/*      */   public void f(int i, int j, int k, int l, int i1)
/*      */   {
/* 3447 */     a(null, i, j, k, l, i1);
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer, int i, int j, int k, int l, int i1)
/*      */   {
/* 3452 */     for (int j1 = 0; j1 < this.z.size(); j1++)
/*      */     {
/* 3454 */       ((yj)this.z.get(j1)).a(entityplayer, i, j, k, l, i1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public int b()
/*      */   {
/* 3461 */     return getWorldHeight();
/*      */   }
/*      */ 
/*      */   public Random u(int i, int j, int k)
/*      */   {
/* 3466 */     long l = i * 341873128712L + j * 132897987541L + x().b() + k;
/* 3467 */     this.w.setSeed(l);
/* 3468 */     return this.w;
/*      */   }
/*      */ 
/*      */   public boolean D()
/*      */   {
/* 3473 */     return false;
/*      */   }
/*      */ 
/*      */   public void a(rf enumskyblock, int i, int j, int k, int l, int i1, int j1)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void changeEntityId(kj entity, int newId)
/*      */   {
/* 3482 */     if (entity.f == newId)
/*      */     {
/* 3484 */       return;
/*      */     }
/* 3486 */     this.g.remove(entity);
/* 3487 */     entity.f = newId;
/* 3488 */     this.g.add(entity);
/*      */   }
/*      */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     rv
 * JD-Core Version:    0.6.2
 */