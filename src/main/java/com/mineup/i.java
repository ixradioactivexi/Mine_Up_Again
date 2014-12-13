/*      */ import java.nio.IntBuffer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.List;
/*      */ import java.util.PriorityQueue;
/*      */ import java.util.Random;
/*      */ import net.minecraft.client.Minecraft;
/*      */ import org.lwjgl.opengl.ARBOcclusionQuery;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ 
/*      */ public class i
/*      */   implements yj
/*      */ {
/*      */   private int renderDistanceInBlocks;
/*      */   public List a;
/*      */   public rv i;
/*      */   public ur j;
/*      */   private fe entitySorter;
/*      */   private PriorityQueue<bv> k;
/*      */   private bv[] l;
/*      */   private bv[] m;
/*      */   private int n;
/*      */   private int o;
/*      */   private int p;
/*      */   private int q;
/*      */   public Minecraft r;
/*      */   public qo s;
/*      */   private IntBuffer t;
/*      */   private boolean u;
/*      */   private int v;
/*      */   private int w;
/*      */   private int x;
/*      */   private int y;
/*      */   private int z;
/*      */   private int A;
/*      */   private int B;
/*      */   private int C;
/*      */   private int D;
/*      */   private int E;
/*      */   private int F;
/*      */   private int G;
/*      */   private int H;
/*      */   private int I;
/*      */   private int J;
/*      */   int[] b;
/*      */   IntBuffer c;
/*      */   private int K;
/*      */   private int L;
/*      */   private int M;
/*      */   private int N;
/*      */   private int O;
/*      */   private int P;
/*      */   private List Q;
/* 1754 */   private kw[] R = { new kw(), new kw(), new kw(), new kw() };
/*      */   double d;
/*      */   double e;
/*      */   double f;
/*      */   public float g;
/*      */   int h;
/*      */ 
/*      */   public i(Minecraft minecraft, ur renderengine)
/*      */   {
/*   38 */     this.a = new ArrayList();
/*   39 */     this.entitySorter = new fe();
/*   40 */     this.k = new PriorityQueue(10000, this.entitySorter);
/*   41 */     this.u = false;
/*   42 */     this.v = 0;
/*   43 */     this.F = -1;
/*   44 */     this.G = 2;
/*   45 */     this.b = new int[50000];
/*   46 */     this.c = dl.d(64);
/*   47 */     this.Q = new ArrayList();
/*   48 */     this.d = -9999.0D;
/*   49 */     this.e = -9999.0D;
/*   50 */     this.f = -9999.0D;
/*   51 */     this.h = 0;
/*   52 */     this.r = minecraft;
/*   53 */     this.j = renderengine;
/*   54 */     byte byte0 = 64;
/*   55 */     this.q = dl.a(byte0 * byte0 * byte0 * 3);
/*   56 */     this.u = minecraft.n().a();
/*   57 */     if (this.u)
/*      */     {
/*   59 */       this.c.clear();
/*   60 */       this.t = dl.d(byte0 * byte0 * byte0);
/*   61 */       this.t.clear();
/*   62 */       this.t.position(0);
/*   63 */       this.t.limit(byte0 * byte0 * byte0);
/*   64 */       ARBOcclusionQuery.glGenQueriesARB(this.t);
/*      */     }
/*   66 */     this.w = dl.a(3);
/*   67 */     GL11.glPushMatrix();
/*   68 */     GL11.glNewList(this.w, 4864);
/*   69 */     f();
/*   70 */     GL11.glEndList();
/*   71 */     GL11.glPopMatrix();
/*   72 */     xe tessellator = xe.a;
/*   73 */     this.x = (this.w + 1);
/*   74 */     GL11.glNewList(this.x, 4864);
/*   75 */     byte byte1 = 64;
/*   76 */     int i = 256 / byte1 + 2;
/*   77 */     float f = 16.0F;
/*   78 */     for (int j = -byte1 * i; j <= byte1 * i; j += byte1)
/*      */     {
/*   80 */       for (int l = -byte1 * i; l <= byte1 * i; l += byte1)
/*      */       {
/*   82 */         tessellator.b();
/*   83 */         tessellator.a(j + 0, f, l + 0);
/*   84 */         tessellator.a(j + byte1, f, l + 0);
/*   85 */         tessellator.a(j + byte1, f, l + byte1);
/*   86 */         tessellator.a(j + 0, f, l + byte1);
/*   87 */         tessellator.a();
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*   92 */     GL11.glEndList();
/*   93 */     this.y = (this.w + 2);
/*   94 */     GL11.glNewList(this.y, 4864);
/*   95 */     f = -16.0F;
/*   96 */     tessellator.b();
/*   97 */     for (int k = -byte1 * i; k <= byte1 * i; k += byte1)
/*      */     {
/*   99 */       for (int i1 = -byte1 * i; i1 <= byte1 * i; i1 += byte1)
/*      */       {
/*  101 */         tessellator.a(k + byte1, f, i1 + 0);
/*  102 */         tessellator.a(k + 0, f, i1 + 0);
/*  103 */         tessellator.a(k + 0, f, i1 + byte1);
/*  104 */         tessellator.a(k + byte1, f, i1 + byte1);
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  109 */     tessellator.a();
/*  110 */     GL11.glEndList();
/*      */   }
/*      */ 
/*      */   private void f()
/*      */   {
/*  115 */     Random random = new Random(10842L);
/*  116 */     xe tessellator = xe.a;
/*  117 */     tessellator.b();
/*  118 */     for (int i = 0; i < 1500; i++)
/*      */     {
/*  120 */       double d = random.nextFloat() * 2.0F - 1.0F;
/*  121 */       double d1 = random.nextFloat() * 2.0F - 1.0F;
/*  122 */       double d2 = random.nextFloat() * 2.0F - 1.0F;
/*  123 */       double d3 = 0.25F + random.nextFloat() * 0.25F;
/*  124 */       double d4 = d * d + d1 * d1 + d2 * d2;
/*  125 */       if ((d4 < 1.0D) && (d4 > 0.01D))
/*      */       {
/*  129 */         d4 = 1.0D / Math.sqrt(d4);
/*  130 */         d *= d4;
/*  131 */         d1 *= d4;
/*  132 */         d2 *= d4;
/*  133 */         double d5 = d * 100.0D;
/*  134 */         double d6 = d1 * 100.0D;
/*  135 */         double d7 = d2 * 100.0D;
/*  136 */         double d8 = Math.atan2(d, d2);
/*  137 */         double d9 = Math.sin(d8);
/*  138 */         double d10 = Math.cos(d8);
/*  139 */         double d11 = Math.atan2(Math.sqrt(d * d + d2 * d2), d1);
/*  140 */         double d12 = Math.sin(d11);
/*  141 */         double d13 = Math.cos(d11);
/*  142 */         double d14 = random.nextDouble() * 3.141592653589793D * 2.0D;
/*  143 */         double d15 = Math.sin(d14);
/*  144 */         double d16 = Math.cos(d14);
/*  145 */         for (int j = 0; j < 4; j++)
/*      */         {
/*  147 */           double d17 = 0.0D;
/*  148 */           double d18 = ((j & 0x2) - 1) * d3;
/*  149 */           double d19 = ((j + 1 & 0x2) - 1) * d3;
/*  150 */           double d20 = d17;
/*  151 */           double d21 = d18 * d16 - d19 * d15;
/*  152 */           double d22 = d19 * d16 + d18 * d15;
/*  153 */           double d23 = d22;
/*  154 */           double d24 = d21 * d12 + d20 * d13;
/*  155 */           double d25 = d20 * d12 - d21 * d13;
/*  156 */           double d26 = d25 * d9 - d23 * d10;
/*  157 */           double d27 = d24;
/*  158 */           double d28 = d23 * d9 + d25 * d10;
/*  159 */           tessellator.a(d5 + d26, d6 + d27, d7 + d28);
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*  164 */     tessellator.a();
/*      */   }
/*      */ 
/*      */   public void a(rv world)
/*      */   {
/*  169 */     if (this.i != null)
/*      */     {
/*  171 */       this.i.b(this);
/*      */     }
/*  173 */     this.d = -9999.0D;
/*  174 */     this.e = -9999.0D;
/*  175 */     this.f = -9999.0D;
/*  176 */     aam.a.a(world);
/*  177 */     this.i = world;
/*  178 */     this.s = new qo(world);
/*  179 */     if (world != null)
/*      */     {
/*  181 */       world.a(this);
/*  182 */       a();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a()
/*      */   {
/*  188 */     if (this.i == null)
/*      */     {
/*  190 */       return;
/*      */     }
/*  192 */     lr.L.b(this.r.z.j);
/*  193 */     this.F = this.r.z.e;
/*  194 */     if (this.m != null)
/*      */     {
/*  196 */       for (int i = 0; i < this.m.length; i++)
/*      */       {
/*  198 */         this.m[i].c();
/*      */       }
/*      */     }
/*      */ 
/*  202 */     int j = 64 << 3 - this.F;
/*  203 */     if (j > 400)
/*      */     {
/*  205 */       j = 400;
/*      */     }
/*  207 */     this.renderDistanceInBlocks = j;
/*  208 */     this.n = (j / 16 + 1);
/*  209 */     this.i.getClass();
/*  210 */     this.o = Math.min(this.i.getWorldHeight() / 8, (3 << 3 - this.F) + 2);
/*  211 */     this.p = (j / 16 + 1);
/*  212 */     this.m = new bv[this.n * this.o * this.p];
/*  213 */     this.l = new bv[this.n * this.o * this.p];
/*  214 */     int k = 0;
/*  215 */     int l = 0;
/*  216 */     this.z = 0;
/*  217 */     this.A = 0;
/*  218 */     this.B = 0;
/*  219 */     this.C = this.n;
/*  220 */     this.D = this.o;
/*  221 */     this.E = this.p;
/*  222 */     this.k.clear();
/*  223 */     if (this.i != null)
/*      */     {
/*  225 */       wd entityliving = this.r.i;
/*  226 */       if (entityliving != null)
/*      */       {
/*  228 */         this.entitySorter.setEntity(entityliving);
/*      */       }
/*      */     }
/*  231 */     this.k.clear();
/*  232 */     this.a.clear();
/*  233 */     for (int j1 = 0; j1 < this.n; j1++)
/*      */     {
/*  235 */       for (int k1 = 0; k1 < this.o; k1++)
/*      */       {
/*  237 */         for (int l1 = 0; l1 < this.p; l1++)
/*      */         {
/*  239 */           this.m[((l1 * this.o + k1) * this.n + j1)] = new bv(this.i, this.a, j1 * 16, k1 * 16, l1 * 16, 16, this.q + k);
/*  240 */           if (this.u)
/*      */           {
/*  242 */             this.m[((l1 * this.o + k1) * this.n + j1)].z = this.t.get(l);
/*      */           }
/*  244 */           this.m[((l1 * this.o + k1) * this.n + j1)].y = false;
/*  245 */           this.m[((l1 * this.o + k1) * this.n + j1)].x = true;
/*  246 */           this.m[((l1 * this.o + k1) * this.n + j1)].o = true;
/*  247 */           this.m[((l1 * this.o + k1) * this.n + j1)].w = (l++);
/*  248 */           this.m[((l1 * this.o + k1) * this.n + j1)].f();
/*  249 */           this.l[((l1 * this.o + k1) * this.n + j1)] = this.m[((l1 * this.o + k1) * this.n + j1)];
/*  250 */           k += 3;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  257 */     if (this.i != null)
/*      */     {
/*  259 */       wd entityliving = this.r.i;
/*  260 */       if (entityliving != null)
/*      */       {
/*  262 */         markRenderersForNewPosition(et.b(entityliving.o), entityliving.getFloor(entityliving.p), et.b(entityliving.q), this.renderDistanceInBlocks);
/*      */ 
/*  264 */         Arrays.sort(this.l, this.entitySorter);
/*      */       }
/*      */     }
/*  267 */     this.G = 2;
/*      */   }
/*      */ 
/*      */   public void a(ax vec3d, adu icamera, float f)
/*      */   {
/*  272 */     if (this.G > 0)
/*      */     {
/*  274 */       this.G -= 1;
/*  275 */       return;
/*      */     }
/*  277 */     vx.a.a(this.i, this.j, this.r.q, this.r.i, f);
/*  278 */     aam.a.a(this.i, this.j, this.r.q, this.r.i, this.r.z, f);
/*  279 */     this.H = 0;
/*  280 */     this.I = 0;
/*  281 */     this.J = 0;
/*  282 */     wd entityliving = this.r.i;
/*  283 */     aam.b = entityliving.N + (entityliving.o - entityliving.N) * f;
/*  284 */     aam.c = entityliving.O + (entityliving.p - entityliving.O) * f;
/*  285 */     aam.d = entityliving.P + (entityliving.q - entityliving.P) * f;
/*  286 */     vx.b = entityliving.N + (entityliving.o - entityliving.N) * f;
/*  287 */     vx.c = entityliving.O + (entityliving.p - entityliving.O) * f;
/*  288 */     vx.d = entityliving.P + (entityliving.q - entityliving.P) * f;
/*  289 */     this.r.t.b(f);
/*  290 */     List list = this.i.p();
/*  291 */     this.H = list.size();
/*  292 */     for (int i = 0; i < this.i.j.size(); i++)
/*      */     {
/*  294 */       kj entity = (kj)this.i.j.get(i);
/*  295 */       this.I += 1;
/*  296 */       if (entity.a(vec3d))
/*      */       {
/*  298 */         aam.a.a(entity, f);
/*      */       }
/*      */     }
/*      */ 
/*  302 */     for (int j = 0; j < list.size(); j++)
/*      */     {
/*  304 */       kj entity1 = (kj)list.get(j);
/*  305 */       if ((entity1.a(vec3d)) && ((entity1.an) || (icamera.a(entity1.y))) && ((entity1 != this.r.i) || (this.r.z.D) || (this.r.i.an())))
/*      */       {
/*  309 */         int l = entity1.getFloor(entity1.p);
/*  310 */         if (l < this.i.getWorldMinY())
/*      */         {
/*  312 */           l = this.i.getWorldMinY();
/*      */         }
/*  314 */         this.i.getClass();
/*  315 */         if (l >= this.i.getWorldMaxY())
/*      */         {
/*  317 */           this.i.getClass();
/*  318 */           l = this.i.getWorldMaxY() - 1;
/*      */         }
/*  320 */         if (this.i.d(et.b(entity1.o), l, et.b(entity1.q)))
/*      */         {
/*  322 */           this.I += 1;
/*  323 */           aam.a.a(entity1, f);
/*      */         }
/*      */       }
/*      */     }
/*  327 */     ow.b();
/*  328 */     for (int k = 0; k < this.a.size(); k++)
/*      */     {
/*  330 */       vx.a.a((ij)this.a.get(k), f);
/*      */     }
/*      */ 
/*  333 */     this.r.t.a(f);
/*      */   }
/*      */ 
/*      */   public String b()
/*      */   {
/*  338 */     return "C: " + this.N + "/" + this.K + ". F: " + this.L + ", O: " + this.M + ", E: " + this.O;
/*      */   }
/*      */ 
/*      */   public String c()
/*      */   {
/*  343 */     return "E: " + this.I + "/" + this.H + ". B: " + this.J + ", I: " + (this.H - this.J - this.I);
/*      */   }
/*      */ 
/*      */   public static double distanceToChunk(int chunkX, int chunkY, int chunkZ, double posX, double posY, double posZ)
/*      */   {
/*  348 */     posX /= 16.0D;
/*  349 */     posY /= 16.0D;
/*  350 */     posZ /= 16.0D;
/*  351 */     double dx = 0.0D;
/*  352 */     if (posX < chunkX)
/*  353 */       dx = chunkX - posX;
/*  354 */     else if (posX > chunkX + 1)
/*  355 */       dx = posX - chunkX - 1.0D;
/*  356 */     double dz = 0.0D;
/*  357 */     if (posZ < chunkZ)
/*  358 */       dz = chunkZ - posZ;
/*  359 */     else if (posZ > chunkZ + 1)
/*  360 */       dz = posZ - chunkZ - 1.0D;
/*  361 */     double dy = 0.0D;
/*  362 */     if (posY < chunkY)
/*  363 */       dy = chunkY - posY;
/*  364 */     else if (posY > chunkY + 1)
/*  365 */       dy = posY - chunkY - 1.0D;
/*  366 */     return Math.sqrt(dx * dx + dy * dy * 9.0D + dz * dz);
/*      */   }
/*      */ 
/*      */   private void markRenderersForNewPosition(double posX, double posY, double posZ, double distance)
/*      */   {
/*  371 */     if (this.i != null)
/*      */     {
/*  373 */       wd entityliving = this.r.i;
/*  374 */       if (entityliving != null)
/*      */       {
/*  376 */         this.entitySorter.setEntity(entityliving);
/*      */       }
/*      */     }
/*  379 */     int i = (int)posX;
/*  380 */     int j = (int)posY;
/*  381 */     int k = (int)posZ;
/*  382 */     i -= 8;
/*  383 */     j -= 8;
/*  384 */     k -= 8;
/*  385 */     this.z = 2147483647;
/*  386 */     this.A = 2147483647;
/*  387 */     this.B = 2147483647;
/*  388 */     this.C = -2147483648;
/*  389 */     this.D = -2147483648;
/*  390 */     this.E = -2147483648;
/*  391 */     this.k.clear();
/*  392 */     int l = this.n * 16;
/*  393 */     int i1 = l / 2;
/*  394 */     int ySize = this.o * 16;
/*  395 */     for (int j1 = 0; j1 < this.n; j1++)
/*      */     {
/*  397 */       int k1 = j1 * 16;
/*  398 */       int l1 = k1 + i1 - i;
/*  399 */       if (l1 < 0)
/*      */       {
/*  401 */         l1 -= l - 1;
/*      */       }
/*  403 */       l1 /= l;
/*  404 */       k1 -= l1 * l;
/*  405 */       if (k1 < this.z)
/*      */       {
/*  407 */         this.z = k1;
/*      */       }
/*  409 */       if (k1 > this.C)
/*      */       {
/*  411 */         this.C = k1;
/*      */       }
/*  413 */       for (int i2 = 0; i2 < this.p; i2++)
/*      */       {
/*  415 */         int j2 = i2 * 16;
/*  416 */         int k2 = j2 + i1 - k;
/*  417 */         if (k2 < 0)
/*      */         {
/*  419 */           k2 -= l - 1;
/*      */         }
/*  421 */         k2 /= l;
/*  422 */         j2 -= k2 * l;
/*  423 */         if (j2 < this.B)
/*      */         {
/*  425 */           this.B = j2;
/*      */         }
/*  427 */         if (j2 > this.E)
/*      */         {
/*  429 */           this.E = j2;
/*      */         }
/*  431 */         for (int l2 = 0; l2 < this.o; l2++)
/*      */         {
/*  433 */           int i3 = l2 * 16;
/*      */ 
/*  435 */           int z1 = i3 + ySize / 2 - j;
/*  436 */           if (z1 < 0)
/*      */           {
/*  438 */             z1 -= ySize - 1;
/*      */           }
/*  440 */           z1 /= ySize;
/*  441 */           i3 -= z1 * ySize;
/*      */ 
/*  443 */           if (i3 < this.A)
/*      */           {
/*  445 */             this.A = i3;
/*      */           }
/*  447 */           if (i3 > this.D)
/*      */           {
/*  449 */             this.D = i3;
/*      */           }
/*  451 */           bv worldrenderer = this.m[((i2 * this.o + l2) * this.n + j1)];
/*  452 */           boolean flag = worldrenderer.u;
/*  453 */           worldrenderer.a(k1, i3, j2);
/*  454 */           if ((i3 >= this.r.f.getWorldMinY()) && (i3 < this.r.f.getWorldMaxY()) && (distanceToChunk(k1 >> 4, i3 >> 4, j2 >> 4, posX, posY, posZ) * 16.0D > distance))
/*      */           {
/*  456 */             worldrenderer.b();
/*  457 */             worldrenderer.u = false;
/*  458 */             worldrenderer.inEllipse = false;
/*      */           }
/*  461 */           else if (!worldrenderer.inEllipse) {
/*  462 */             worldrenderer.inEllipse = true;
/*  463 */             if (!worldrenderer.u) {
/*  464 */               worldrenderer.f();
/*      */             }
/*      */           }
/*      */ 
/*  468 */           if (worldrenderer.u)
/*      */           {
/*  470 */             this.k.add(worldrenderer);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public int a(wd entityliving, int i, double d)
/*      */   {
/*  479 */     for (int j = 0; j < 10; j++)
/*      */     {
/*  481 */       this.P = ((this.P + 1) % this.m.length);
/*  482 */       bv worldrenderer = this.m[this.P];
/*  483 */       if ((worldrenderer.u) && (!this.k.contains(worldrenderer)))
/*      */       {
/*  485 */         this.k.add(worldrenderer);
/*      */       }
/*      */     }
/*      */ 
/*  489 */     if (this.r.z.e != this.F)
/*      */     {
/*  491 */       a();
/*      */     }
/*  493 */     if (i == 0)
/*      */     {
/*  495 */       this.K = 0;
/*  496 */       this.L = 0;
/*  497 */       this.M = 0;
/*  498 */       this.N = 0;
/*  499 */       this.O = 0;
/*      */     }
/*  501 */     double d1 = entityliving.N + (entityliving.o - entityliving.N) * d;
/*  502 */     double d2 = entityliving.O + (entityliving.p - entityliving.O) * d;
/*  503 */     double d3 = entityliving.P + (entityliving.q - entityliving.P) * d;
/*  504 */     double d4 = entityliving.o - this.d;
/*  505 */     double d5 = entityliving.p - this.e;
/*  506 */     double d6 = entityliving.q - this.f;
/*  507 */     if (d4 * d4 + d5 * d5 + d6 * d6 > 16.0D)
/*      */     {
/*  509 */       this.d = entityliving.o;
/*  510 */       this.e = entityliving.p;
/*  511 */       this.f = entityliving.q;
/*  512 */       markRenderersForNewPosition(et.b(entityliving.o), et.b(entityliving.p), et.b(entityliving.q), this.renderDistanceInBlocks);
/*  513 */       Arrays.sort(this.l, new fe(entityliving));
/*      */     }
/*  515 */     ow.a();
/*  516 */     int k = 0;
/*  517 */     if ((this.u) && (this.r.z.h) && (!this.r.z.g) && (i == 0))
/*      */     {
/*  519 */       int l = 0;
/*  520 */       int i1 = 16;
/*  521 */       a(l, i1);
/*  522 */       for (int j1 = l; j1 < i1; j1++)
/*      */       {
/*  524 */         this.l[j1].x = true;
/*      */       }
/*      */ 
/*  527 */       k += a(l, i1, i, d);
/*      */       do
/*      */       {
/*  530 */         int byte0 = i1;
/*  531 */         i1 *= 2;
/*  532 */         if (i1 > this.l.length)
/*      */         {
/*  534 */           i1 = this.l.length;
/*      */         }
/*  536 */         GL11.glDisable(3553);
/*  537 */         GL11.glDisable(2896);
/*  538 */         GL11.glDisable(3008);
/*  539 */         GL11.glDisable(2912);
/*  540 */         GL11.glColorMask(false, false, false, false);
/*  541 */         GL11.glDepthMask(false);
/*  542 */         a(byte0, i1);
/*  543 */         GL11.glPushMatrix();
/*  544 */         float f = 0.0F;
/*  545 */         float f1 = 0.0F;
/*  546 */         float f2 = 0.0F;
/*  547 */         for (int k1 = byte0; k1 < i1; k1++)
/*      */         {
/*  549 */           if (this.l[k1].e())
/*      */           {
/*  551 */             this.l[k1].o = false;
/*      */           }
/*      */           else {
/*  554 */             if (!this.l[k1].o)
/*      */             {
/*  556 */               this.l[k1].x = true;
/*      */             }
/*  558 */             if ((this.l[k1].o) && (!this.l[k1].y))
/*      */             {
/*  562 */               float f3 = et.c(this.l[k1].a(entityliving));
/*  563 */               int l1 = (int)(1.0F + f3 / 128.0F);
/*  564 */               if (this.v % l1 == k1 % l1)
/*      */               {
/*  568 */                 bv worldrenderer1 = this.l[k1];
/*  569 */                 float f4 = (float)(worldrenderer1.i - d1);
/*  570 */                 float f5 = (float)(worldrenderer1.j - d2);
/*  571 */                 float f6 = (float)(worldrenderer1.k - d3);
/*  572 */                 float f7 = f4 - f;
/*  573 */                 float f8 = f5 - f1;
/*  574 */                 float f9 = f6 - f2;
/*  575 */                 if ((f7 != 0.0F) || (f8 != 0.0F) || (f9 != 0.0F))
/*      */                 {
/*  577 */                   GL11.glTranslatef(f7, f8, f9);
/*  578 */                   f += f7;
/*  579 */                   f1 += f8;
/*  580 */                   f2 += f9;
/*      */                 }
/*  582 */                 ARBOcclusionQuery.glBeginQueryARB(35092, this.l[k1].z);
/*  583 */                 this.l[k1].d();
/*  584 */                 ARBOcclusionQuery.glEndQueryARB(35092);
/*  585 */                 this.l[k1].y = true;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*  588 */         GL11.glPopMatrix();
/*  589 */         if (this.r.z.g)
/*      */         {
/*  591 */           if (iw.b == 0)
/*      */           {
/*  593 */             GL11.glColorMask(false, true, true, true);
/*      */           }
/*      */           else {
/*  596 */             GL11.glColorMask(true, false, false, true);
/*      */           }
/*      */         }
/*      */         else {
/*  600 */           GL11.glColorMask(true, true, true, true);
/*      */         }
/*  602 */         GL11.glDepthMask(true);
/*  603 */         GL11.glEnable(3553);
/*  604 */         GL11.glEnable(3008);
/*  605 */         GL11.glEnable(2912);
/*  606 */         k += a(byte0, i1, i, d);
/*  607 */       }while (i1 < this.l.length);
/*      */     }
/*      */     else {
/*  610 */       k += a(0, this.l.length, i, d);
/*      */     }
/*  612 */     return k;
/*      */   }
/*      */ 
/*      */   private void a(int i, int j)
/*      */   {
/*  617 */     for (int k = i; k < j; k++)
/*      */     {
/*  619 */       if (this.l[k].y)
/*      */       {
/*  623 */         this.c.clear();
/*  624 */         ARBOcclusionQuery.glGetQueryObjectuARB(this.l[k].z, 34919, this.c);
/*  625 */         if (this.c.get(0) != 0)
/*      */         {
/*  627 */           this.l[k].y = false;
/*  628 */           this.c.clear();
/*  629 */           ARBOcclusionQuery.glGetQueryObjectuARB(this.l[k].z, 34918, this.c);
/*  630 */           this.l[k].x = (this.c.get(0) != 0);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   private int a(int i, int j, int k, double d)
/*      */   {
/*  638 */     this.Q.clear();
/*  639 */     int l = 0;
/*  640 */     for (int i1 = i; i1 < j; i1++)
/*      */     {
/*  642 */       if (k == 0)
/*      */       {
/*  644 */         this.K += 1;
/*  645 */         if (this.l[i1].p[k] != 0)
/*      */         {
/*  647 */           this.O += 1;
/*      */         }
/*  649 */         else if (!this.l[i1].o)
/*      */         {
/*  651 */           this.L += 1;
/*      */         }
/*  653 */         else if ((this.u) && (!this.l[i1].x))
/*      */         {
/*  655 */           this.M += 1;
/*      */         }
/*      */         else {
/*  658 */           this.N += 1;
/*      */         }
/*      */       }
/*  661 */       if ((this.l[i1].p[k] == 0) && (this.l[i1].o) && ((!this.u) || (this.l[i1].x)))
/*      */       {
/*  665 */         int j1 = this.l[i1].a(k);
/*  666 */         if (j1 >= 0)
/*      */         {
/*  668 */           this.Q.add(this.l[i1]);
/*  669 */           l++;
/*      */         }
/*      */       }
/*      */     }
/*  673 */     wd entityliving = this.r.i;
/*  674 */     double d1 = entityliving.N + (entityliving.o - entityliving.N) * d;
/*  675 */     double d2 = entityliving.O + (entityliving.p - entityliving.O) * d;
/*  676 */     double d3 = entityliving.P + (entityliving.q - entityliving.P) * d;
/*  677 */     int k1 = 0;
/*  678 */     for (int l1 = 0; l1 < this.R.length; l1++)
/*      */     {
/*  680 */       this.R[l1].b();
/*      */     }
/*      */ 
/*  683 */     for (int i2 = 0; i2 < this.Q.size(); i2++)
/*      */     {
/*  685 */       bv worldrenderer = (bv)this.Q.get(i2);
/*  686 */       int j2 = -1;
/*  687 */       for (int k2 = 0; k2 < k1; k2++)
/*      */       {
/*  689 */         if (this.R[k2].a(worldrenderer.i, worldrenderer.j, worldrenderer.k))
/*      */         {
/*  691 */           j2 = k2;
/*      */         }
/*      */       }
/*      */ 
/*  695 */       if (j2 < 0)
/*      */       {
/*  697 */         j2 = k1++;
/*  698 */         this.R[j2].a(worldrenderer.i, worldrenderer.j, worldrenderer.k, d1, d2, d3);
/*      */       }
/*  700 */       this.R[j2].a(worldrenderer.a(k));
/*      */     }
/*      */ 
/*  703 */     a(k, d);
/*  704 */     return l;
/*      */   }
/*      */ 
/*      */   public void a(int i, double d)
/*      */   {
/*  709 */     this.r.t.b(d);
/*  710 */     for (int j = 0; j < this.R.length; j++)
/*      */     {
/*  712 */       this.R[j].a();
/*      */     }
/*      */ 
/*  715 */     this.r.t.a(d);
/*      */   }
/*      */ 
/*      */   public void d()
/*      */   {
/*  720 */     this.v += 1;
/*      */   }
/*      */ 
/*      */   public void a(float f)
/*      */   {
/*  725 */     if (this.r.f.y.c)
/*      */     {
/*  727 */       return;
/*      */     }
/*  729 */     GL11.glDisable(3553);
/*  730 */     ax vec3d = this.i.a(this.r.i, f);
/*  731 */     float f1 = (float)vec3d.a;
/*  732 */     float f2 = (float)vec3d.b;
/*  733 */     float f3 = (float)vec3d.c;
/*  734 */     if (this.r.z.g)
/*      */     {
/*  736 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/*  737 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/*  738 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*  739 */       f1 = f4;
/*  740 */       f2 = f5;
/*  741 */       f3 = f6;
/*      */     }
/*  743 */     GL11.glColor3f(f1, f2, f3);
/*  744 */     xe tessellator = xe.a;
/*  745 */     GL11.glDepthMask(false);
/*  746 */     GL11.glEnable(2912);
/*  747 */     GL11.glColor3f(f1, f2, f3);
/*  748 */     GL11.glCallList(this.x);
/*  749 */     GL11.glDisable(2912);
/*  750 */     GL11.glDisable(3008);
/*  751 */     GL11.glEnable(3042);
/*  752 */     GL11.glBlendFunc(770, 771);
/*  753 */     ow.a();
/*  754 */     float[] af = this.i.y.a(this.i.c(f), f);
/*  755 */     if (af != null)
/*      */     {
/*  757 */       GL11.glDisable(3553);
/*  758 */       GL11.glShadeModel(7425);
/*  759 */       GL11.glPushMatrix();
/*  760 */       GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*  761 */       GL11.glRotatef(et.a(this.i.d(f)) >= 0.0F ? 0.0F : 180.0F, 0.0F, 0.0F, 1.0F);
/*  762 */       float f7 = af[0];
/*  763 */       float f9 = af[1];
/*  764 */       float f12 = af[2];
/*  765 */       if (this.r.z.g)
/*      */       {
/*  767 */         float f15 = (f7 * 30.0F + f9 * 59.0F + f12 * 11.0F) / 100.0F;
/*  768 */         float f18 = (f7 * 30.0F + f9 * 70.0F) / 100.0F;
/*  769 */         float f21 = (f7 * 30.0F + f12 * 70.0F) / 100.0F;
/*  770 */         f7 = f15;
/*  771 */         f9 = f18;
/*  772 */         f12 = f21;
/*      */       }
/*  774 */       tessellator.a(6);
/*  775 */       tessellator.a(f7, f9, f12, af[3]);
/*  776 */       tessellator.a(0.0D, 100.0D, 0.0D);
/*  777 */       int i = 16;
/*  778 */       tessellator.a(af[0], af[1], af[2], 0.0F);
/*  779 */       for (int j = 0; j <= i; j++)
/*      */       {
/*  781 */         float f22 = j * 3.141593F * 2.0F / i;
/*  782 */         float f23 = et.a(f22);
/*  783 */         float f24 = et.b(f22);
/*  784 */         tessellator.a(f23 * 120.0F, f24 * 120.0F, -f24 * 40.0F * af[3]);
/*      */       }
/*      */ 
/*  787 */       tessellator.a();
/*  788 */       GL11.glPopMatrix();
/*  789 */       GL11.glShadeModel(7424);
/*      */     }
/*  791 */     GL11.glEnable(3553);
/*  792 */     GL11.glBlendFunc(770, 1);
/*  793 */     GL11.glPushMatrix();
/*  794 */     float d = 1.0F - this.i.i(f);
/*  795 */     float f8 = 0.0F;
/*  796 */     float f10 = 0.0F;
/*  797 */     float f13 = 0.0F;
/*  798 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, d);
/*  799 */     GL11.glTranslatef(f8, f10, f13);
/*  800 */     GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
/*  801 */     GL11.glRotatef(this.i.c(f) * 360.0F, 1.0F, 0.0F, 0.0F);
/*  802 */     float f16 = 30.0F;
/*  803 */     GL11.glBindTexture(3553, this.j.b("/terrain/sun.png"));
/*  804 */     tessellator.b();
/*  805 */     tessellator.a(-f16, 100.0D, -f16, 0.0D, 0.0D);
/*  806 */     tessellator.a(f16, 100.0D, -f16, 1.0D, 0.0D);
/*  807 */     tessellator.a(f16, 100.0D, f16, 1.0D, 1.0D);
/*  808 */     tessellator.a(-f16, 100.0D, f16, 0.0D, 1.0D);
/*  809 */     tessellator.a();
/*  810 */     f16 = 20.0F;
/*  811 */     GL11.glBindTexture(3553, this.j.b("/terrain/moon.png"));
/*  812 */     tessellator.b();
/*  813 */     tessellator.a(-f16, -100.0D, f16, 1.0D, 1.0D);
/*  814 */     tessellator.a(f16, -100.0D, f16, 0.0D, 1.0D);
/*  815 */     tessellator.a(f16, -100.0D, -f16, 0.0D, 0.0D);
/*  816 */     tessellator.a(-f16, -100.0D, -f16, 1.0D, 0.0D);
/*  817 */     tessellator.a();
/*  818 */     GL11.glDisable(3553);
/*  819 */     float f19 = this.i.g(f) * d;
/*  820 */     if (f19 > 0.0F)
/*      */     {
/*  822 */       GL11.glColor4f(f19, f19, f19, f19);
/*  823 */       GL11.glCallList(this.w);
/*      */     }
/*  825 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  826 */     GL11.glDisable(3042);
/*  827 */     GL11.glEnable(3008);
/*  828 */     GL11.glEnable(2912);
/*  829 */     GL11.glPopMatrix();
/*  830 */     GL11.glDisable(3553);
/*  831 */     GL11.glColor3f(0.0F, 0.0F, 0.0F);
/*  832 */     d = (float)(this.r.h.g(f).b - 64.0D);
/*  833 */     if (d < 0.0D)
/*      */     {
/*  835 */       GL11.glPushMatrix();
/*  836 */       GL11.glTranslatef(0.0F, 12.0F, 0.0F);
/*  837 */       GL11.glCallList(this.y);
/*  838 */       GL11.glPopMatrix();
/*  839 */       float f11 = 1.0F;
/*  840 */       float f14 = -(float)(d + 64.0D);
/*  841 */       float f17 = -f11;
/*  842 */       float f20 = f14;
/*  843 */       tessellator.b();
/*  844 */       tessellator.a(0, 255);
/*  845 */       tessellator.a(-f11, f20, f11);
/*  846 */       tessellator.a(f11, f20, f11);
/*  847 */       tessellator.a(f11, f17, f11);
/*  848 */       tessellator.a(-f11, f17, f11);
/*  849 */       tessellator.a(-f11, f17, -f11);
/*  850 */       tessellator.a(f11, f17, -f11);
/*  851 */       tessellator.a(f11, f20, -f11);
/*  852 */       tessellator.a(-f11, f20, -f11);
/*  853 */       tessellator.a(f11, f17, -f11);
/*  854 */       tessellator.a(f11, f17, f11);
/*  855 */       tessellator.a(f11, f20, f11);
/*  856 */       tessellator.a(f11, f20, -f11);
/*  857 */       tessellator.a(-f11, f20, -f11);
/*  858 */       tessellator.a(-f11, f20, f11);
/*  859 */       tessellator.a(-f11, f17, f11);
/*  860 */       tessellator.a(-f11, f17, -f11);
/*  861 */       tessellator.a(-f11, f17, -f11);
/*  862 */       tessellator.a(-f11, f17, f11);
/*  863 */       tessellator.a(f11, f17, f11);
/*  864 */       tessellator.a(f11, f17, -f11);
/*  865 */       tessellator.a();
/*      */     }
/*  867 */     if (this.i.y.c())
/*      */     {
/*  869 */       GL11.glColor3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
/*      */     }
/*      */     else {
/*  872 */       GL11.glColor3f(f1, f2, f3);
/*      */     }
/*  874 */     GL11.glPushMatrix();
/*  875 */     GL11.glTranslatef(0.0F, -(float)(d - 16.0D), 0.0F);
/*  876 */     GL11.glCallList(this.y);
/*  877 */     GL11.glPopMatrix();
/*  878 */     GL11.glEnable(3553);
/*  879 */     GL11.glDepthMask(true);
/*      */   }
/*      */ 
/*      */   public void b(float f)
/*      */   {
/*  884 */     if (this.r.f.y.c)
/*      */     {
/*  886 */       return;
/*      */     }
/*  888 */     if (this.r.z.j)
/*      */     {
/*  890 */       c(f);
/*  891 */       return;
/*      */     }
/*  893 */     GL11.glDisable(2884);
/*  894 */     float f1 = (float)(this.r.i.O + (this.r.i.p - this.r.i.O) * f);
/*  895 */     byte byte0 = 32;
/*  896 */     int i = 256 / byte0;
/*  897 */     xe tessellator = xe.a;
/*  898 */     GL11.glBindTexture(3553, this.j.b("/environment/clouds.png"));
/*  899 */     GL11.glEnable(3042);
/*  900 */     GL11.glBlendFunc(770, 771);
/*  901 */     ax vec3d = this.i.e(f);
/*  902 */     float f2 = (float)vec3d.a;
/*  903 */     float f3 = (float)vec3d.b;
/*  904 */     float f4 = (float)vec3d.c;
/*  905 */     if (this.r.z.g)
/*      */     {
/*  907 */       float f5 = (f2 * 30.0F + f3 * 59.0F + f4 * 11.0F) / 100.0F;
/*  908 */       float f7 = (f2 * 30.0F + f3 * 70.0F) / 100.0F;
/*  909 */       float f8 = (f2 * 30.0F + f4 * 70.0F) / 100.0F;
/*  910 */       f2 = f5;
/*  911 */       f3 = f7;
/*  912 */       f4 = f8;
/*      */     }
/*  914 */     float f6 = 0.0004882813F;
/*  915 */     double d = this.v + f + (this.i.J + (this.i.K - this.i.J) * f) * 24000.0D;
/*  916 */     double d1 = this.r.i.l + (this.r.i.o - this.r.i.l) * f + d * 0.02999999932944775D;
/*  917 */     double d2 = this.r.i.n + (this.r.i.q - this.r.i.n) * f;
/*  918 */     int j = et.b(d1 / 2048.0D);
/*  919 */     int k = et.b(d2 / 2048.0D);
/*  920 */     d1 -= j * 2048;
/*  921 */     d2 -= k * 2048;
/*  922 */     float f9 = this.i.y.d() - f1 + 0.33F;
/*  923 */     float f10 = (float)(d1 * f6);
/*  924 */     float f11 = (float)(d2 * f6);
/*  925 */     tessellator.b();
/*  926 */     tessellator.a(f2, f3, f4, 0.8F);
/*  927 */     for (int l = -byte0 * i; l < byte0 * i; l += byte0)
/*      */     {
/*  929 */       for (int i1 = -byte0 * i; i1 < byte0 * i; i1 += byte0)
/*      */       {
/*  931 */         tessellator.a(l + 0, f9, i1 + byte0, (l + 0) * f6 + f10, (i1 + byte0) * f6 + f11);
/*  932 */         tessellator.a(l + byte0, f9, i1 + byte0, (l + byte0) * f6 + f10, (i1 + byte0) * f6 + f11);
/*  933 */         tessellator.a(l + byte0, f9, i1 + 0, (l + byte0) * f6 + f10, (i1 + 0) * f6 + f11);
/*  934 */         tessellator.a(l + 0, f9, i1 + 0, (l + 0) * f6 + f10, (i1 + 0) * f6 + f11);
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  939 */     tessellator.a();
/*  940 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  941 */     GL11.glDisable(3042);
/*  942 */     GL11.glEnable(2884);
/*      */   }
/*      */ 
/*      */   public boolean a(double d, double d1, double d2, float f)
/*      */   {
/*  947 */     return false;
/*      */   }
/*      */ 
/*      */   public void c(float f)
/*      */   {
/*  952 */     GL11.glDisable(2884);
/*  953 */     float f1 = (float)(this.r.i.O + (this.r.i.p - this.r.i.O) * f);
/*  954 */     xe tessellator = xe.a;
/*  955 */     float f2 = 12.0F;
/*  956 */     float f3 = 4.0F;
/*  957 */     double d = this.v + f + (this.i.J + (this.i.K - this.i.J) * f) * 24000.0D;
/*  958 */     double d1 = (this.r.i.l + (this.r.i.o - this.r.i.l) * f + d * 0.02999999932944775D) / f2;
/*  959 */     double d2 = (this.r.i.n + (this.r.i.q - this.r.i.n) * f) / f2 + 0.3300000131130219D;
/*  960 */     float f4 = this.i.y.d() - f1 + 0.33F;
/*  961 */     int i = et.b(d1 / 2048.0D);
/*  962 */     int j = et.b(d2 / 2048.0D);
/*  963 */     d1 -= i * 2048;
/*  964 */     d2 -= j * 2048;
/*  965 */     GL11.glBindTexture(3553, this.j.b("/environment/clouds.png"));
/*  966 */     GL11.glEnable(3042);
/*  967 */     GL11.glBlendFunc(770, 771);
/*  968 */     ax vec3d = this.i.e(f);
/*  969 */     float f5 = (float)vec3d.a;
/*  970 */     float f6 = (float)vec3d.b;
/*  971 */     float f7 = (float)vec3d.c;
/*  972 */     if (this.r.z.g)
/*      */     {
/*  974 */       float f8 = (f5 * 30.0F + f6 * 59.0F + f7 * 11.0F) / 100.0F;
/*  975 */       float f10 = (f5 * 30.0F + f6 * 70.0F) / 100.0F;
/*  976 */       float f12 = (f5 * 30.0F + f7 * 70.0F) / 100.0F;
/*  977 */       f5 = f8;
/*  978 */       f6 = f10;
/*  979 */       f7 = f12;
/*      */     }
/*  981 */     float f9 = (float)(d1 * 0.0D);
/*  982 */     float f11 = (float)(d2 * 0.0D);
/*  983 */     float f13 = 0.0039063F;
/*  984 */     f9 = et.b(d1) * f13;
/*  985 */     f11 = et.b(d2) * f13;
/*  986 */     float f14 = (float)(d1 - et.b(d1));
/*  987 */     float f15 = (float)(d2 - et.b(d2));
/*  988 */     int k = 8;
/*  989 */     byte byte0 = 4;
/*  990 */     float f16 = 0.000976563F;
/*  991 */     GL11.glScalef(f2, 1.0F, f2);
/*  992 */     for (int l = 0; l < 2; l++)
/*      */     {
/*  994 */       if (l == 0)
/*      */       {
/*  996 */         GL11.glColorMask(false, false, false, false);
/*      */       }
/*  998 */       else if (this.r.z.g)
/*      */       {
/* 1000 */         if (iw.b == 0)
/*      */         {
/* 1002 */           GL11.glColorMask(false, true, true, true);
/*      */         }
/*      */         else {
/* 1005 */           GL11.glColorMask(true, false, false, true);
/*      */         }
/*      */       }
/*      */       else {
/* 1009 */         GL11.glColorMask(true, true, true, true);
/*      */       }
/* 1011 */       for (int i1 = -byte0 + 1; i1 <= byte0; i1++)
/*      */       {
/* 1013 */         for (int j1 = -byte0 + 1; j1 <= byte0; j1++)
/*      */         {
/* 1015 */           tessellator.b();
/* 1016 */           float f17 = i1 * k;
/* 1017 */           float f18 = j1 * k;
/* 1018 */           float f19 = f17 - f14;
/* 1019 */           float f20 = f18 - f15;
/* 1020 */           if (f4 > -f3 - 1.0F)
/*      */           {
/* 1022 */             tessellator.a(f5 * 0.7F, f6 * 0.7F, f7 * 0.7F, 0.8F);
/* 1023 */             tessellator.b(0.0F, -1.0F, 0.0F);
/* 1024 */             tessellator.a(f19 + 0.0F, f4 + 0.0F, f20 + k, (f17 + 0.0F) * f13 + f9, (f18 + k) * f13 + f11);
/* 1025 */             tessellator.a(f19 + k, f4 + 0.0F, f20 + k, (f17 + k) * f13 + f9, (f18 + k) * f13 + f11);
/* 1026 */             tessellator.a(f19 + k, f4 + 0.0F, f20 + 0.0F, (f17 + k) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/* 1027 */             tessellator.a(f19 + 0.0F, f4 + 0.0F, f20 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/*      */           }
/* 1029 */           if (f4 <= f3 + 1.0F)
/*      */           {
/* 1031 */             tessellator.a(f5, f6, f7, 0.8F);
/* 1032 */             tessellator.b(0.0F, 1.0F, 0.0F);
/* 1033 */             tessellator.a(f19 + 0.0F, f4 + f3 - f16, f20 + k, (f17 + 0.0F) * f13 + f9, (f18 + k) * f13 + f11);
/* 1034 */             tessellator.a(f19 + k, f4 + f3 - f16, f20 + k, (f17 + k) * f13 + f9, (f18 + k) * f13 + f11);
/* 1035 */             tessellator.a(f19 + k, f4 + f3 - f16, f20 + 0.0F, (f17 + k) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/* 1036 */             tessellator.a(f19 + 0.0F, f4 + f3 - f16, f20 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/*      */           }
/* 1038 */           tessellator.a(f5 * 0.9F, f6 * 0.9F, f7 * 0.9F, 0.8F);
/* 1039 */           if (i1 > -1)
/*      */           {
/* 1041 */             tessellator.b(-1.0F, 0.0F, 0.0F);
/* 1042 */             for (int k1 = 0; k1 < k; k1++)
/*      */             {
/* 1044 */               tessellator.a(f19 + k1 + 0.0F, f4 + 0.0F, f20 + k, (f17 + k1 + 0.5F) * f13 + f9, (f18 + k) * f13 + f11);
/* 1045 */               tessellator.a(f19 + k1 + 0.0F, f4 + f3, f20 + k, (f17 + k1 + 0.5F) * f13 + f9, (f18 + k) * f13 + f11);
/* 1046 */               tessellator.a(f19 + k1 + 0.0F, f4 + f3, f20 + 0.0F, (f17 + k1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/* 1047 */               tessellator.a(f19 + k1 + 0.0F, f4 + 0.0F, f20 + 0.0F, (f17 + k1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/*      */             }
/*      */           }
/*      */ 
/* 1051 */           if (i1 <= 1)
/*      */           {
/* 1053 */             tessellator.b(1.0F, 0.0F, 0.0F);
/* 1054 */             for (int l1 = 0; l1 < k; l1++)
/*      */             {
/* 1056 */               tessellator.a(f19 + l1 + 1.0F - f16, f4 + 0.0F, f20 + k, (f17 + l1 + 0.5F) * f13 + f9, (f18 + k) * f13 + f11);
/* 1057 */               tessellator.a(f19 + l1 + 1.0F - f16, f4 + f3, f20 + k, (f17 + l1 + 0.5F) * f13 + f9, (f18 + k) * f13 + f11);
/* 1058 */               tessellator.a(f19 + l1 + 1.0F - f16, f4 + f3, f20 + 0.0F, (f17 + l1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/* 1059 */               tessellator.a(f19 + l1 + 1.0F - f16, f4 + 0.0F, f20 + 0.0F, (f17 + l1 + 0.5F) * f13 + f9, (f18 + 0.0F) * f13 + f11);
/*      */             }
/*      */           }
/*      */ 
/* 1063 */           tessellator.a(f5 * 0.8F, f6 * 0.8F, f7 * 0.8F, 0.8F);
/* 1064 */           if (j1 > -1)
/*      */           {
/* 1066 */             tessellator.b(0.0F, 0.0F, -1.0F);
/* 1067 */             for (int i2 = 0; i2 < k; i2++)
/*      */             {
/* 1069 */               tessellator.a(f19 + 0.0F, f4 + f3, f20 + i2 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + i2 + 0.5F) * f13 + f11);
/* 1070 */               tessellator.a(f19 + k, f4 + f3, f20 + i2 + 0.0F, (f17 + k) * f13 + f9, (f18 + i2 + 0.5F) * f13 + f11);
/* 1071 */               tessellator.a(f19 + k, f4 + 0.0F, f20 + i2 + 0.0F, (f17 + k) * f13 + f9, (f18 + i2 + 0.5F) * f13 + f11);
/* 1072 */               tessellator.a(f19 + 0.0F, f4 + 0.0F, f20 + i2 + 0.0F, (f17 + 0.0F) * f13 + f9, (f18 + i2 + 0.5F) * f13 + f11);
/*      */             }
/*      */           }
/*      */ 
/* 1076 */           if (j1 <= 1)
/*      */           {
/* 1078 */             tessellator.b(0.0F, 0.0F, 1.0F);
/* 1079 */             for (int j2 = 0; j2 < k; j2++)
/*      */             {
/* 1081 */               tessellator.a(f19 + 0.0F, f4 + f3, f20 + j2 + 1.0F - f16, (f17 + 0.0F) * f13 + f9, (f18 + j2 + 0.5F) * f13 + f11);
/* 1082 */               tessellator.a(f19 + k, f4 + f3, f20 + j2 + 1.0F - f16, (f17 + k) * f13 + f9, (f18 + j2 + 0.5F) * f13 + f11);
/* 1083 */               tessellator.a(f19 + k, f4 + 0.0F, f20 + j2 + 1.0F - f16, (f17 + k) * f13 + f9, (f18 + j2 + 0.5F) * f13 + f11);
/* 1084 */               tessellator.a(f19 + 0.0F, f4 + 0.0F, f20 + j2 + 1.0F - f16, (f17 + 0.0F) * f13 + f9, (f18 + j2 + 0.5F) * f13 + f11);
/*      */             }
/*      */           }
/*      */ 
/* 1088 */           tessellator.a();
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1095 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1096 */     GL11.glDisable(3042);
/* 1097 */     GL11.glEnable(2884);
/*      */   }
/*      */ 
/*      */   public boolean a(wd entityliving, boolean flag)
/*      */   {
/* 1139 */     byte byte0 = 2;
/* 1140 */     int cnt = 0;
/* 1141 */     while ((cnt < byte0) && (this.k.size() > 0))
/*      */     {
/* 1143 */       bv renderer = (bv)this.k.poll();
/* 1144 */       if (renderer.u)
/*      */       {
/* 1148 */         renderer.a();
/* 1149 */         renderer.u = false;
/* 1150 */         cnt++;
/*      */       }
/*      */     }
/* 1152 */     return cnt == 0;
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer, ma movingobjectposition, int i, ul itemstack, float f)
/*      */   {
/* 1264 */     xe tessellator = xe.a;
/* 1265 */     GL11.glEnable(3042);
/* 1266 */     GL11.glEnable(3008);
/* 1267 */     GL11.glBlendFunc(770, 1);
/* 1268 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, (et.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
/* 1269 */     if (i == 0)
/*      */     {
/* 1271 */       if (this.g > 0.0F)
/*      */       {
/* 1273 */         GL11.glBlendFunc(774, 768);
/* 1274 */         int j = this.j.b("/terrain.png");
/* 1275 */         GL11.glBindTexture(3553, j);
/* 1276 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
/* 1277 */         GL11.glPushMatrix();
/* 1278 */         int k = this.i.a(movingobjectposition.b, movingobjectposition.c, movingobjectposition.d);
/* 1279 */         lr block = k <= 0 ? null : lr.m[k];
/* 1280 */         GL11.glDisable(3008);
/* 1281 */         GL11.glPolygonOffset(-3.0F, -3.0F);
/* 1282 */         GL11.glEnable(32823);
/* 1283 */         double d = entityplayer.N + (entityplayer.o - entityplayer.N) * f;
/* 1284 */         double d1 = entityplayer.O + (entityplayer.p - entityplayer.O) * f;
/* 1285 */         double d2 = entityplayer.P + (entityplayer.q - entityplayer.P) * f;
/* 1286 */         if (block == null)
/*      */         {
/* 1288 */           block = lr.u;
/*      */         }
/* 1290 */         GL11.glEnable(3008);
/* 1291 */         tessellator.b();
/* 1292 */         tessellator.b(-d, -d1, -d2);
/* 1293 */         tessellator.c();
/* 1294 */         this.s.a(block, movingobjectposition.b, movingobjectposition.c, movingobjectposition.d, 240 + (int)(this.g * 10.0F));
/* 1295 */         tessellator.a();
/* 1296 */         tessellator.b(0.0D, 0.0D, 0.0D);
/* 1297 */         GL11.glDisable(3008);
/* 1298 */         GL11.glPolygonOffset(0.0F, 0.0F);
/* 1299 */         GL11.glDisable(32823);
/* 1300 */         GL11.glEnable(3008);
/* 1301 */         GL11.glDepthMask(true);
/* 1302 */         GL11.glPopMatrix();
/*      */       }
/*      */     }
/* 1305 */     else if (itemstack != null)
/*      */     {
/* 1307 */       GL11.glBlendFunc(770, 771);
/* 1308 */       float f1 = et.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
/* 1309 */       GL11.glColor4f(f1, f1, f1, et.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
/* 1310 */       int l = this.j.b("/terrain.png");
/* 1311 */       GL11.glBindTexture(3553, l);
/* 1312 */       int i1 = movingobjectposition.b;
/* 1313 */       int j1 = movingobjectposition.c;
/* 1314 */       int k1 = movingobjectposition.d;
/* 1315 */       if (movingobjectposition.e == 0)
/*      */       {
/* 1317 */         j1--;
/*      */       }
/* 1319 */       if (movingobjectposition.e == 1)
/*      */       {
/* 1321 */         j1++;
/*      */       }
/* 1323 */       if (movingobjectposition.e == 2)
/*      */       {
/* 1325 */         k1--;
/*      */       }
/* 1327 */       if (movingobjectposition.e == 3)
/*      */       {
/* 1329 */         k1++;
/*      */       }
/* 1331 */       if (movingobjectposition.e == 4)
/*      */       {
/* 1333 */         i1--;
/*      */       }
/* 1335 */       if (movingobjectposition.e == 5)
/*      */       {
/* 1337 */         i1++;
/*      */       }
/*      */     }
/* 1340 */     GL11.glDisable(3042);
/* 1341 */     GL11.glDisable(3008);
/*      */   }
/*      */ 
/*      */   public void b(sz entityplayer, ma movingobjectposition, int i, ul itemstack, float f)
/*      */   {
/* 1346 */     if ((i == 0) && (movingobjectposition.a == up.a))
/*      */     {
/* 1348 */       GL11.glEnable(3042);
/* 1349 */       GL11.glBlendFunc(770, 771);
/* 1350 */       GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
/* 1351 */       GL11.glLineWidth(2.0F);
/* 1352 */       GL11.glDisable(3553);
/* 1353 */       GL11.glDepthMask(false);
/* 1354 */       float f1 = 0.002F;
/* 1355 */       int j = this.i.a(movingobjectposition.b, movingobjectposition.c, movingobjectposition.d);
/* 1356 */       if (j > 0)
/*      */       {
/* 1358 */         lr.m[j].a(this.i, movingobjectposition.b, movingobjectposition.c, movingobjectposition.d);
/* 1359 */         double d = entityplayer.N + (entityplayer.o - entityplayer.N) * f;
/* 1360 */         double d1 = entityplayer.O + (entityplayer.p - entityplayer.O) * f;
/* 1361 */         double d2 = entityplayer.P + (entityplayer.q - entityplayer.P) * f;
/* 1362 */         a(lr.m[j].d(this.i, movingobjectposition.b, movingobjectposition.c, movingobjectposition.d).b(f1, f1, f1).c(-d, -d1, -d2));
/*      */       }
/* 1364 */       GL11.glDepthMask(true);
/* 1365 */       GL11.glEnable(3553);
/* 1366 */       GL11.glDisable(3042);
/*      */     }
/*      */   }
/*      */ 
/*      */   private void a(rp axisalignedbb)
/*      */   {
/* 1372 */     xe tessellator = xe.a;
/* 1373 */     tessellator.a(3);
/* 1374 */     tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.c);
/* 1375 */     tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.c);
/* 1376 */     tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.f);
/* 1377 */     tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.f);
/* 1378 */     tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.c);
/* 1379 */     tessellator.a();
/* 1380 */     tessellator.a(3);
/* 1381 */     tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.c);
/* 1382 */     tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.c);
/* 1383 */     tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.f);
/* 1384 */     tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.f);
/* 1385 */     tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.c);
/* 1386 */     tessellator.a();
/* 1387 */     tessellator.a(1);
/* 1388 */     tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.c);
/* 1389 */     tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.c);
/* 1390 */     tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.c);
/* 1391 */     tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.c);
/* 1392 */     tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.f);
/* 1393 */     tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.f);
/* 1394 */     tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.f);
/* 1395 */     tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.f);
/* 1396 */     tessellator.a();
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/* 1401 */     int k1 = et.a(i, 16);
/* 1402 */     int l1 = et.a(j, 16);
/* 1403 */     int i2 = et.a(k, 16);
/* 1404 */     int j2 = et.a(l, 16);
/* 1405 */     int k2 = et.a(i1, 16);
/* 1406 */     int l2 = et.a(j1, 16);
/* 1407 */     for (int i3 = k1; i3 <= j2; i3++)
/*      */     {
/* 1409 */       int j3 = i3 % this.n;
/* 1410 */       if (j3 < 0)
/*      */       {
/* 1412 */         j3 += this.n;
/*      */       }
/* 1414 */       for (int k3 = l1; k3 <= k2; k3++)
/*      */       {
/* 1416 */         int l3 = k3 % this.o;
/* 1417 */         if (l3 < 0)
/*      */         {
/* 1419 */           l3 += this.o;
/*      */         }
/* 1421 */         for (int i4 = i2; i4 <= l2; i4++)
/*      */         {
/* 1423 */           int j4 = i4 % this.p;
/* 1424 */           if (j4 < 0)
/*      */           {
/* 1426 */             j4 += this.p;
/*      */           }
/* 1428 */           int k4 = (j4 * this.o + l3) * this.n + j3;
/* 1429 */           bv worldrenderer = this.m[k4];
/* 1430 */           if (!worldrenderer.u)
/*      */           {
/* 1432 */             worldrenderer.f();
/* 1433 */             if (worldrenderer.u)
/* 1434 */               this.k.add(worldrenderer);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k)
/*      */   {
/* 1446 */     a(i - 1, j - 1, k - 1, i + 1, j + 1, k + 1);
/*      */   }
/*      */ 
/*      */   public void b(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/* 1451 */     a(i - 1, j - 1, k - 1, l + 1, i1 + 1, j1 + 1);
/*      */   }
/*      */ 
/*      */   public void a(adu icamera, float f)
/*      */   {
/* 1456 */     for (int i = 0; i < this.m.length; i++)
/*      */     {
/* 1458 */       if ((!this.m[i].e()) && ((!this.m[i].o) || ((i + this.h & 0xF) == 0)))
/*      */       {
/* 1460 */         this.m[i].a(icamera);
/*      */       }
/*      */     }
/*      */ 
/* 1464 */     this.h += 1;
/*      */   }
/*      */ 
/*      */   public void a(String s, int i, int j, int k)
/*      */   {
/* 1469 */     if (s != null)
/*      */     {
/* 1471 */       this.r.v.b("C418 - " + s);
/*      */     }
/* 1473 */     this.r.B.a(s, i, j, k, 1.0F, 1.0F);
/*      */   }
/*      */ 
/*      */   public void a(String s, double d, double d1, double d2, float f, float f1)
/*      */   {
/* 1479 */     float f2 = 16.0F;
/* 1480 */     if (f > 1.0F)
/*      */     {
/* 1482 */       f2 *= f;
/*      */     }
/* 1484 */     if (this.r.i.f(d, d1, d2) < f2 * f2)
/*      */     {
/* 1486 */       this.r.B.b(s, (float)d, (float)d1, (float)d2, f, f1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(String s, double d, double d1, double d2, double d3, double d4, double d5)
/*      */   {
/* 1493 */     if ((this.r == null) || (this.r.i == null) || (this.r.j == null))
/*      */     {
/* 1495 */       return;
/*      */     }
/* 1497 */     double d6 = this.r.i.o - d;
/* 1498 */     double d7 = this.r.i.p - d1;
/* 1499 */     double d8 = this.r.i.q - d2;
/* 1500 */     double d9 = 16.0D;
/* 1501 */     if (s.equals("hugeexplosion"))
/*      */     {
/* 1503 */       this.r.j.a(new acw(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1505 */     if (s.equals("largeexplode"))
/*      */     {
/* 1507 */       this.r.j.a(new gk(this.j, this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1509 */     if (d6 * d6 + d7 * d7 + d8 * d8 > d9 * d9)
/*      */     {
/* 1511 */       return;
/*      */     }
/* 1513 */     if (s.equals("bubble"))
/*      */     {
/* 1515 */       this.r.j.a(new ql(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1517 */     else if (s.equals("suspended"))
/*      */     {
/* 1519 */       this.r.j.a(new il(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1521 */     else if (s.equals("depthsuspend"))
/*      */     {
/* 1523 */       this.r.j.a(new sl(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1525 */     else if (s.equals("townaura"))
/*      */     {
/* 1527 */       this.r.j.a(new sl(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1529 */     else if (s.equals("crit"))
/*      */     {
/* 1531 */       this.r.j.a(new oi(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1533 */     else if (s.equals("smoke"))
/*      */     {
/* 1535 */       this.r.j.a(new adf(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1537 */     else if (s.equals("note"))
/*      */     {
/* 1539 */       this.r.j.a(new v(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1541 */     else if (s.equals("portal"))
/*      */     {
/* 1543 */       this.r.j.a(new xr(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1545 */     else if (s.equals("explode"))
/*      */     {
/* 1547 */       this.r.j.a(new ta(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1549 */     else if (s.equals("flame"))
/*      */     {
/* 1551 */       this.r.j.a(new jk(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1553 */     else if (s.equals("lava"))
/*      */     {
/* 1555 */       this.r.j.a(new da(this.i, d, d1, d2));
/*      */     }
/* 1557 */     else if (s.equals("footstep"))
/*      */     {
/* 1559 */       this.r.j.a(new su(this.j, this.i, d, d1, d2));
/*      */     }
/* 1561 */     else if (s.equals("splash"))
/*      */     {
/* 1563 */       this.r.j.a(new ks(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1565 */     else if (s.equals("largesmoke"))
/*      */     {
/* 1567 */       this.r.j.a(new adf(this.i, d, d1, d2, d3, d4, d5, 2.5F));
/*      */     }
/* 1569 */     else if (s.equals("cloud"))
/*      */     {
/* 1571 */       this.r.j.a(new abn(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1573 */     else if (s.equals("reddust"))
/*      */     {
/* 1575 */       this.r.j.a(new ub(this.i, d, d1, d2, (float)d3, (float)d4, (float)d5));
/*      */     }
/* 1577 */     else if (s.equals("snowballpoof"))
/*      */     {
/* 1579 */       this.r.j.a(new ip(this.i, d, d1, d2, sv.aE));
/*      */     }
/* 1581 */     else if (s.equals("snowshovel"))
/*      */     {
/* 1583 */       this.r.j.a(new hd(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1585 */     else if (s.equals("slime"))
/*      */     {
/* 1587 */       this.r.j.a(new ip(this.i, d, d1, d2, sv.aN));
/*      */     }
/* 1589 */     else if (s.equals("heart"))
/*      */     {
/* 1591 */       this.r.j.a(new vg(this.i, d, d1, d2, d3, d4, d5));
/*      */     }
/* 1593 */     else if (s.startsWith("iconcrack_"))
/*      */     {
/* 1595 */       int i = Integer.parseInt(s.substring(s.indexOf("_") + 1));
/* 1596 */       this.r.j.a(new ip(this.i, d, d1, d2, d3, d4, d5, sv.f[i]));
/*      */     }
/* 1598 */     else if (s.startsWith("tilecrack_"))
/*      */     {
/* 1600 */       int j = Integer.parseInt(s.substring(s.indexOf("_") + 1));
/* 1601 */       this.r.j.a(new jd(this.i, d, d1, d2, d3, d4, d5, lr.m[j], 0, 0));
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(kj entity)
/*      */   {
/* 1607 */     entity.M();
/* 1608 */     if (entity.ac != null)
/*      */     {
/* 1610 */       this.j.a(entity.ac, new jw());
/*      */     }
/* 1612 */     if (entity.ad != null)
/*      */     {
/* 1614 */       this.j.a(entity.ad, new jw());
/*      */     }
/*      */   }
/*      */ 
/*      */   public void b(kj entity)
/*      */   {
/* 1620 */     if (entity.ac != null)
/*      */     {
/* 1622 */       this.j.c(entity.ac);
/*      */     }
/* 1624 */     if (entity.ad != null)
/*      */     {
/* 1626 */       this.j.c(entity.ad);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, ij tileentity)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void e()
/*      */   {
/* 1636 */     dl.b(this.q);
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer, int i, int j, int k, int l, int i1)
/*      */   {
/* 1641 */     Random random = this.i.w;
/* 1642 */     switch (i)
/*      */     {
/*      */     default:
/* 1645 */       break;
/*      */     case 1001:
/* 1648 */       this.i.a(j, k, l, "random.click", 1.0F, 1.2F);
/* 1649 */       break;
/*      */     case 1000:
/* 1652 */       this.i.a(j, k, l, "random.click", 1.0F, 1.0F);
/* 1653 */       break;
/*      */     case 1002:
/* 1656 */       this.i.a(j, k, l, "random.bow", 1.0F, 1.2F);
/* 1657 */       break;
/*      */     case 2000:
/* 1660 */       int j1 = i1 % 3 - 1;
/* 1661 */       int k1 = i1 / 3 % 3 - 1;
/* 1662 */       double d = j + j1 * 0.6D + 0.5D;
/* 1663 */       double d1 = k + 0.5D;
/* 1664 */       double d2 = l + k1 * 0.6D + 0.5D;
/* 1665 */       for (int l1 = 0; l1 < 10; l1++)
/*      */       {
/* 1667 */         double d3 = random.nextDouble() * 0.2D + 0.01D;
/* 1668 */         double d4 = d + j1 * 0.01D + (random.nextDouble() - 0.5D) * k1 * 0.5D;
/* 1669 */         double d5 = d1 + (random.nextDouble() - 0.5D) * 0.5D;
/* 1670 */         double d6 = d2 + k1 * 0.01D + (random.nextDouble() - 0.5D) * j1 * 0.5D;
/* 1671 */         double d7 = j1 * d3 + random.nextGaussian() * 0.01D;
/* 1672 */         double d8 = -0.03D + random.nextGaussian() * 0.01D;
/* 1673 */         double d9 = k1 * d3 + random.nextGaussian() * 0.01D;
/* 1674 */         a("smoke", d4, d5, d6, d7, d8, d9);
/*      */       }
/*      */ 
/* 1677 */       break;
/*      */     case 2001:
/* 1680 */       int i2 = i1 & 0xFF;
/* 1681 */       if (i2 > 0)
/*      */       {
/* 1683 */         lr block = lr.m[i2];
/* 1684 */         this.r.B.b(block.bL.a(), j + 0.5F, k + 0.5F, l + 0.5F, (block.bL.b() + 1.0F) / 2.0F, block.bL.c() * 0.8F);
/*      */       }
/* 1686 */       this.r.j.a(j, k, l, i1 & 0xFF, i1 >> 8 & 0xFF);
/* 1687 */       break;
/*      */     case 1003:
/* 1690 */       if (Math.random() < 0.5D)
/*      */       {
/* 1692 */         this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "random.door_open", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
/*      */       }
/*      */       else {
/* 1695 */         this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "random.door_close", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
/*      */       }
/* 1697 */       break;
/*      */     case 1004:
/* 1700 */       this.i.a(j + 0.5F, k + 0.5F, l + 0.5F, "random.fizz", 0.5F, 2.6F + (random.nextFloat() - random.nextFloat()) * 0.8F);
/* 1701 */       break;
/*      */     case 1005:
/* 1704 */       if ((sv.f[i1] instanceof aau))
/*      */       {
/* 1706 */         this.i.a(((aau)sv.f[i1]).a, j, k, l);
/*      */       }
/*      */       else
/* 1709 */         this.i.a(null, j, k, l);
/*      */       break;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     i
 * JD-Core Version:    0.6.2
 */