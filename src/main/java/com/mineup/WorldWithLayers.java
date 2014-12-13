/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.TreeSet;
/*      */ 
/*      */ public class WorldWithLayers extends rv
/*      */ {
/*   11 */   int playerViewRange = 10;
/*      */   int minY;
/*      */   int maxY;
/*      */   public rv[] layers;
/*      */   rv primaryWorld;
/*      */   WorldLayersInfo layersInfo;
/*  214 */   vy cached = null;
/*  215 */   int cacheX = 0; int cacheY = 0; int cacheZ = 0;
/*      */ 
/*      */   public void setPlayerViewRange(int viewRange)
/*      */   {
/*   15 */     this.playerViewRange = viewRange;
/*      */   }
/*      */ 
/*      */   public void getChunksNear(Collection<oh> list, double x, double y, double z)
/*      */   {
/*   20 */     int j = et.b(x / 16.0D);
/*   21 */     int l = et.b(z / 16.0D);
/*   22 */     int n1 = getLayer((int)y).worldNum;
/*   23 */     int n2 = n1;
/*   24 */     if (n1 - 1 >= 0)
/*   25 */       n1--;
/*   26 */     if (n2 + 1 < this.layers.length)
/*   27 */       n2++;
/*   28 */     for (int n = n1; n < n2; n++)
/*      */     {
/*   30 */       for (int dx = -this.playerViewRange; dx <= this.playerViewRange; dx++)
/*   31 */         for (int dz = -this.playerViewRange; dz <= this.playerViewRange; dz++)
/*      */         {
/*   33 */           int dist2 = distanceToChunk(dx + j, dz + l, n, x, y - getWorldMinY(), z);
/*   34 */           if (dist2 <= this.playerViewRange)
/*      */           {
/*   36 */             list.add(new oh(dx + j, dz + l, n, dist2));
/*      */           }
/*      */         }
/*      */     }
/*      */   }
/*      */ 
/*      */   public int getVoidFogY()
/*      */   {
/*   45 */     return this.minY - 5;
/*      */   }
/*      */ 
/*      */   public adg createChunkCache(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/*   50 */     return new ChunkCacheLayered(this, i, j, k, l, i1, j1);
/*      */   }
/*      */ 
/*      */   public int getWorldHeight() {
/*   54 */     return this.layers.length * 128;
/*      */   }
/*      */ 
/*      */   public int getWorldMinY()
/*      */   {
/*   59 */     return this.minY;
/*      */   }
/*      */ 
/*      */   public int getWorldMaxY()
/*      */   {
/*   64 */     return this.maxY;
/*      */   }
/*      */ 
/*      */   public int getGravity(int y) {
/*   68 */     return 1;
/*      */   }
/*      */ 
/*      */   public rv getLayer(int y)
/*      */   {
/*   75 */     y -= this.minY;
/*   76 */     y >>= 7;
/*   77 */     if (y < 0)
/*   78 */       y = 0;
/*   79 */     if (y >= this.layers.length)
/*   80 */       y = this.layers.length - 1;
/*   81 */     return this.layers[y];
/*      */   }
/*      */ 
/*      */   public nu a()
/*      */   {
/*   87 */     return this.y.b;
/*      */   }
/*      */ 
/*      */   public WorldLayersInfo getLayersInfo()
/*      */   {
/*   93 */     return this.layersInfo;
/*      */   }
/*      */ 
/*      */   public void saveLayerInfo() {
/*   97 */     List under = this.layersInfo.getUnderworld();
/*   98 */     List over = this.layersInfo.getOverworld();
/*   99 */     int k = 0;
/*  100 */     for (int i = under.size() - 1; i >= 0; i--) {
/*  101 */       ((WorldLayersInfo.ChildWorldInfo)under.get(i)).copyFrom(this.layers[(k++)].C);
/*      */     }
/*  103 */     this.layersInfo.world.copyFrom(this.C);
/*  104 */     for (int i = 0; i < over.size(); i++)
/*  105 */       ((WorldLayersInfo.ChildWorldInfo)over.get(i)).copyFrom(this.layers[(k++)].C);
/*      */   }
/*      */ 
/*      */   public WorldWithLayers(rv world)
/*      */   {
/*  110 */     this(world, world.x().i());
/*      */   }
/*      */ 
/*      */   public rv createChildWorld(rv world, String worldType, rl info)
/*      */   {
/*  115 */     return new rv(world, ExtendedWorldProvider.getProviderForWorldType(worldType), info);
/*      */   }
/*      */ 
/*      */   public WorldWithLayers(rv world, int dimension) {
/*  119 */     super(world, world.y);
/*      */ 
/*  121 */     this.layersInfo = ((ExtendedWorldInfo)world.x()).getLayersInfo();
/*  122 */     int primaryIndex = 0;
/*      */     rv[] wrld;
/*  123 */     if ((dimension == 0) || (this.layersInfo.fasttravel == null))
/*      */     {
/*  125 */       List under = this.layersInfo.getUnderworld();
/*  126 */       List over = this.layersInfo.getOverworld();
/*  127 */       rv[] wrld = new rv[under.size() + 1 + over.size()];
/*  128 */       int k = 0;
/*  129 */       for (int i = under.size() - 1; i >= 0; i--) {
/*  130 */         rl winfo = new rl(this.C);
/*  131 */         WorldLayersInfo.ChildWorldInfo cwi = (WorldLayersInfo.ChildWorldInfo)under.get(i);
/*  132 */         cwi.apply(winfo);
/*  133 */         wrld[(k++)] = createChildWorld(world, cwi.getWorldType(), winfo);
/*      */       }
/*      */ 
/*  136 */       rl winfo = new rl(this.C);
/*  137 */       WorldLayersInfo.ChildWorldInfo cwi = this.layersInfo.getWorld();
/*  138 */       cwi.apply(winfo);
/*  139 */       wrld[(k++)] = createChildWorld(world, cwi.getWorldType(), winfo);
/*      */ 
/*  141 */       for (int i = 0; i < over.size(); i++) {
/*  142 */         rl winfo = new rl(this.C);
/*  143 */         WorldLayersInfo.ChildWorldInfo cwi = (WorldLayersInfo.ChildWorldInfo)over.get(i);
/*  144 */         cwi.apply(winfo);
/*  145 */         wrld[(k++)] = createChildWorld(world, cwi.getWorldType(), winfo);
/*      */       }
/*  147 */       primaryIndex = this.layersInfo.underworld.size();
/*      */     } else {
/*  149 */       this.layersInfo = ((ExtendedWorldInfo)world.x()).getLayersInfo();
/*  150 */       rl winfo = new rl(this.C);
/*  151 */       winfo.setDimension(-1);
/*  152 */       WorldLayersInfo.ChildWorldInfo cwi = this.layersInfo.fasttravel;
/*  153 */       cwi.apply(winfo);
/*  154 */       wrld = new rv[1];
/*  155 */       wrld[0] = createChildWorld(world, cwi.getWorldType(), winfo);
/*      */     }
/*  157 */     changePrimaryWorld(wrld[primaryIndex]);
/*  158 */     this.primaryWorld.C = this.C;
/*  159 */     this.layers = wrld;
/*  160 */     this.minY = (primaryIndex * -128);
/*  161 */     int y = getWorldMinY();
/*  162 */     int i = 0;
/*  163 */     for (rv layer : this.layers) {
/*  164 */       layer.setParent(this, y, i++);
/*  165 */       y += 128;
/*      */     }
/*  167 */     this.maxY = y;
/*      */   }
/*      */ 
/*      */   public void changePrimaryWorld(rv layer) {
/*  171 */     this.primaryWorld = layer;
/*  172 */     this.y = layer.y;
/*  173 */     this.A = layer.A;
/*      */   }
/*      */ 
/*      */   protected bf d() {
/*  177 */     return this.A;
/*      */   }
/*      */ 
/*      */   protected void i()
/*      */   {
/*  182 */     this.layers[0].i();
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer) {
/*  186 */     changePrimaryWorld(getLayer((int)entityplayer.p));
/*  187 */     this.primaryWorld.a(entityplayer);
/*      */   }
/*      */ 
/*      */   public void prepareToSpawnPlayer(sz thePlayer) {
/*  191 */     changePrimaryWorld(getLayer((int)thePlayer.p));
/*  192 */     this.primaryWorld.prepareToSpawnPlayer(thePlayer);
/*      */   }
/*      */ 
/*      */   public void a(boolean flag, ny iprogressupdate) {
/*  196 */     for (rv w : this.layers)
/*  197 */       w.a(flag, iprogressupdate);
/*  198 */     r();
/*  199 */     this.B.a(this.C, this.i);
/*      */   }
/*      */ 
/*      */   public boolean c(int i) {
/*  203 */     if (!this.A.b()) {
/*  204 */       return true;
/*      */     }
/*  206 */     for (rv w : this.layers) {
/*  207 */       boolean flag = w.c(i);
/*  208 */       if (!flag)
/*  209 */         return false;
/*      */     }
/*  211 */     return true;
/*      */   }
/*      */ 
/*      */   public int a(int i, int j, int k)
/*      */   {
/*  217 */     if ((this.cached != null) && ((i ^ this.cacheX) >> 4 == 0) && ((k ^ this.cacheZ) >> 4 == 0) && ((j ^ this.cacheY) >> 7 == 0))
/*      */     {
/*  219 */       return this.cached.a(i & 0xF, j & 0x7F, k & 0xF);
/*      */     }
/*  221 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000)) {
/*  222 */       return 0;
/*      */     }
/*  224 */     if (j < getWorldMinY()) {
/*  225 */       return 0;
/*      */     }
/*  227 */     if (j >= getWorldMaxY()) {
/*  228 */       return 0;
/*      */     }
/*  230 */     rv layer = getLayer(j);
/*  231 */     this.cached = layer.c(i >> 4, k >> 4);
/*  232 */     this.cacheX = i;
/*  233 */     this.cacheY = j;
/*  234 */     this.cacheZ = k;
/*  235 */     return this.cached.a(i & 0xF, j & 0x7F, k & 0xF);
/*      */   }
/*      */ 
/*      */   public boolean d(int i, int j, int k) {
/*  239 */     if (j < getWorldMinY()) {
/*  240 */       return false;
/*      */     }
/*  242 */     if (j >= getWorldMaxY()) {
/*  243 */       return false;
/*      */     }
/*  245 */     return chunkExists(i >> 4, k >> 4, getLayer(j));
/*      */   }
/*      */ 
/*      */   public boolean e(int i, int j, int k, int l) {
/*  249 */     return b(i - l, j - l, k - l, i + l, j + l, k + l);
/*      */   }
/*      */ 
/*      */   public boolean b(int i, int j, int k, int l, int i1, int j1) {
/*  253 */     i >>= 4;
/*  254 */     int n1 = getLayer(j).worldNum;
/*  255 */     k >>= 4;
/*  256 */     l >>= 4;
/*  257 */     int n2 = getLayer(i1).worldNum;
/*  258 */     j1 >>= 4;
/*  259 */     for (int y = n1; y <= n2; y++) {
/*  260 */       for (int k1 = i; k1 <= l; k1++) {
/*  261 */         for (int l1 = k; l1 <= j1; l1++) {
/*  262 */           if (!chunkExists(k1, l1, y)) {
/*  263 */             return false;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*  269 */     return true;
/*      */   }
/*      */ 
/*      */   private boolean chunkExists(int i, int j, int layerNum) {
/*  273 */     if ((layerNum < 0) || (layerNum >= this.layers.length))
/*  274 */       return false;
/*  275 */     return this.layers[layerNum].A.a(i, j);
/*      */   }
/*      */ 
/*      */   private boolean chunkExists(int i, int j, rv layer) {
/*  279 */     if (layer == null)
/*  280 */       return false;
/*  281 */     return layer.A.a(i, j);
/*      */   }
/*      */ 
/*      */   public vy getChunkFromBlockCoords(int i, int j, int k) {
/*  285 */     return getChunkFromChunkCoords(i >> 4, k >> 4, getLayer(j));
/*      */   }
/*      */ 
/*      */   public vy getChunkFromBlockCoords(int i, int j, rv layer) {
/*  289 */     return getChunkFromChunkCoords(i >> 4, j >> 4, layer);
/*      */   }
/*      */ 
/*      */   public vy b(int i, int j) {
/*  293 */     return getChunkFromChunkCoords(i >> 4, j >> 4, getLayer(0));
/*      */   }
/*      */ 
/*      */   public vy getChunkFromChunkCoords(int i, int j, int k) {
/*  297 */     if ((k < 0) || (k >= this.layers.length))
/*  298 */       return null;
/*  299 */     return this.layers[k].A.b(i, j);
/*      */   }
/*      */ 
/*      */   public vy getChunkFromChunkCoords(int i, int j, rv layer) {
/*  303 */     if (layer == null)
/*  304 */       return null;
/*  305 */     return layer.A.b(i, j);
/*      */   }
/*      */ 
/*      */   public vy c(int i, int j) {
/*  309 */     throw new NotImplementedException();
/*      */   }
/*      */ 
/*      */   public boolean b(int i, int j, int k, int l, int i1)
/*      */   {
/*  314 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000)) {
/*  315 */       return false;
/*      */     }
/*  317 */     if (j < getWorldMinY()) {
/*  318 */       return false;
/*      */     }
/*  320 */     if (j >= getWorldMaxY()) {
/*  321 */       return false;
/*      */     }
/*  323 */     rv layer = getLayer(j);
/*  324 */     if (layer == null)
/*  325 */       return false;
/*  326 */     vy chunk = layer.c(i >> 4, k >> 4);
/*  327 */     boolean flag = chunk.a(i & 0xF, j - layer.shiftY, k & 0xF, l, i1);
/*  328 */     p(i, j, k);
/*  329 */     return flag;
/*      */   }
/*      */ 
/*      */   public boolean d(int i, int j, int k, int l) {
/*  333 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000)) {
/*  334 */       return false;
/*      */     }
/*  336 */     if (j < getWorldMinY()) {
/*  337 */       return false;
/*      */     }
/*  339 */     if (j >= getWorldMaxY()) {
/*  340 */       return false;
/*      */     }
/*  342 */     rv layer = getLayer(j);
/*  343 */     vy chunk = getChunkFromChunkCoords(i >> 4, k >> 4, layer);
/*  344 */     boolean flag = chunk.a(i & 0xF, j - layer.shiftY, k & 0xF, l);
/*  345 */     p(i, j, k);
/*  346 */     return flag;
/*      */   }
/*      */ 
/*      */   public wa f(int i, int j, int k) {
/*  350 */     int l = a(i, j, k);
/*  351 */     if (l == 0) {
/*  352 */       return wa.a;
/*      */     }
/*  354 */     return lr.m[l].bN;
/*      */   }
/*      */ 
/*      */   public int e(int i, int j, int k)
/*      */   {
/*  359 */     if ((this.cached != null) && ((i ^ this.cacheX) >> 4 == 0) && ((k ^ this.cacheZ) >> 4 == 0) && ((j ^ this.cacheY) >> 7 == 0))
/*      */     {
/*  361 */       return this.cached.b(i & 0xF, j & 0x7F, k & 0xF);
/*      */     }
/*  363 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000)) {
/*  364 */       return 0;
/*      */     }
/*  366 */     if (j < getWorldMinY()) {
/*  367 */       return 0;
/*      */     }
/*  369 */     if (j >= getWorldMaxY()) {
/*  370 */       return 0;
/*      */     }
/*  372 */     rv layer = getLayer(j);
/*  373 */     this.cached = layer.c(i >> 4, k >> 4);
/*  374 */     this.cacheX = i;
/*  375 */     this.cacheY = j;
/*  376 */     this.cacheZ = k;
/*  377 */     return this.cached.b(i & 0xF, j & 0x7F, k & 0xF);
/*      */   }
/*      */ 
/*      */   public void f(int i, int j, int k, int l) {
/*  381 */     if (c(i, j, k, l)) {
/*  382 */       int i1 = a(i, j, k);
/*  383 */       if (lr.t[(i1 & 0xFF)] != 0)
/*  384 */         h(i, j, k, i1);
/*      */       else
/*  386 */         j(i, j, k, i1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean c(int i, int j, int k, int l)
/*      */   {
/*  392 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000)) {
/*  393 */       return false;
/*      */     }
/*  395 */     if (j < getWorldMinY()) {
/*  396 */       return false;
/*      */     }
/*  398 */     if (j >= getWorldMaxY()) {
/*  399 */       return false;
/*      */     }
/*  401 */     rv layer = getLayer(j);
/*  402 */     vy chunk = layer.c(i >> 4, k >> 4);
/*  403 */     i &= 15;
/*  404 */     k &= 15;
/*  405 */     chunk.b(i, j - layer.shiftY, k, l);
/*  406 */     return true;
/*      */   }
/*      */ 
/*      */   public boolean g(int i, int j, int k, int l) {
/*  410 */     if (d(i, j, k, l)) {
/*  411 */       h(i, j, k, l);
/*  412 */       return true;
/*      */     }
/*  414 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean d(int i, int j, int k, int l, int i1)
/*      */   {
/*  419 */     if (b(i, j, k, l, i1)) {
/*  420 */       h(i, j, k, l);
/*  421 */       return true;
/*      */     }
/*  423 */     return false;
/*      */   }
/*      */ 
/*      */   public void j(int i, int j, int k)
/*      */   {
/*  428 */     for (int l = 0; l < this.z.size(); l++)
/*  429 */       ((yj)this.z.get(l)).a(i, j, k);
/*      */   }
/*      */ 
/*      */   protected void h(int i, int j, int k, int l)
/*      */   {
/*  435 */     j(i, j, k);
/*  436 */     j(i, j, k, l);
/*      */   }
/*      */ 
/*      */   public void i(int i, int j, int k, int l) {
/*  440 */     if (k > l) {
/*  441 */       int i1 = l;
/*  442 */       l = k;
/*  443 */       k = i1;
/*      */     }
/*  445 */     for (int j1 = k; j1 <= l; j1++) {
/*  446 */       c(rf.a, i, j1, j);
/*      */     }
/*      */ 
/*  449 */     c(i, k, j, i, l, j);
/*      */   }
/*      */ 
/*      */   public void k(int i, int j, int k) {
/*  453 */     for (int l = 0; l < this.z.size(); l++)
/*  454 */       ((yj)this.z.get(l)).b(i, j, k, i, j, k);
/*      */   }
/*      */ 
/*      */   public void c(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/*  460 */     for (int k1 = 0; k1 < this.z.size(); k1++)
/*  461 */       ((yj)this.z.get(k1)).b(i, j, k, l, i1, j1);
/*      */   }
/*      */ 
/*      */   public void j(int i, int j, int k, int l)
/*      */   {
/*  467 */     m(i - 1, j, k, l);
/*  468 */     m(i + 1, j, k, l);
/*  469 */     m(i, j - 1, k, l);
/*  470 */     m(i, j + 1, k, l);
/*  471 */     m(i, j, k - 1, l);
/*  472 */     m(i, j, k + 1, l);
/*      */   }
/*      */ 
/*      */   private void m(int i, int j, int k, int l) {
/*  476 */     rv layer = getLayer(j);
/*  477 */     if ((this.t) || (layer.t) || (this.I)) {
/*  478 */       return;
/*      */     }
/*  480 */     lr block = lr.m[a(i, j, k)];
/*  481 */     if (block != null)
/*  482 */       block.a(this, i, j, k, l);
/*      */   }
/*      */ 
/*      */   public boolean l(int i, int j, int k)
/*      */   {
/*  487 */     rv layer = getLayer(j);
/*  488 */     return layer.l(i, j - layer.shiftY, k);
/*      */   }
/*      */ 
/*      */   public int m(int i, int j, int k) {
/*  492 */     if ((this.cached != null) && ((i ^ this.cacheX) >> 4 == 0) && ((k ^ this.cacheZ) >> 4 == 0) && ((j ^ this.cacheY) >> 7 == 0))
/*      */     {
/*  494 */       return this.cached.c(i & 0xF, j & 0x7F, k & 0xF, 0);
/*      */     }
/*  496 */     if (j < getWorldMinY()) {
/*  497 */       return 0;
/*      */     }
/*  499 */     if (j >= getWorldMaxY()) {
/*  500 */       j = getWorldMaxY() - 1;
/*      */     }
/*  502 */     rv layer = getLayer(j);
/*  503 */     this.cached = layer.c(i >> 4, k >> 4);
/*  504 */     this.cacheX = i;
/*  505 */     this.cacheY = j;
/*  506 */     this.cacheZ = k;
/*  507 */     return this.cached.c(i & 0xF, j & 0x7F, k & 0xF, 0);
/*      */   }
/*      */ 
/*      */   public int n(int i, int j, int k) {
/*  511 */     return a(i, j, k, true);
/*      */   }
/*      */ 
/*      */   public int a(int i, int j, int k, boolean flag) {
/*  515 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000)) {
/*  516 */       return 15;
/*      */     }
/*  518 */     if (flag) {
/*  519 */       int l = a(i, j, k);
/*  520 */       if ((l == lr.al.bA) || (l == lr.aB.bA) || (l == lr.aI.bA) || (l == lr.au.bA))
/*      */       {
/*  522 */         int i1 = a(i, j + 1, k, false);
/*  523 */         int j1 = a(i + 1, j, k, false);
/*  524 */         int k1 = a(i - 1, j, k, false);
/*  525 */         int l1 = a(i, j, k + 1, false);
/*  526 */         int i2 = a(i, j, k - 1, false);
/*  527 */         if (j1 > i1) {
/*  528 */           i1 = j1;
/*      */         }
/*  530 */         if (k1 > i1) {
/*  531 */           i1 = k1;
/*      */         }
/*  533 */         if (l1 > i1) {
/*  534 */           i1 = l1;
/*      */         }
/*  536 */         if (i2 > i1) {
/*  537 */           i1 = i2;
/*      */         }
/*  539 */         return i1;
/*      */       }
/*      */     }
/*  542 */     if (j < getWorldMinY()) {
/*  543 */       return 0;
/*      */     }
/*  545 */     if (j >= getWorldMaxY()) {
/*  546 */       j = getWorldMaxY() - 1;
/*      */     }
/*  548 */     rv layer = getLayer(j);
/*  549 */     vy chunk = getChunkFromChunkCoords(i >> 4, k >> 4, layer);
/*  550 */     i &= 15;
/*  551 */     k &= 15;
/*  552 */     return chunk.c(i, j - layer.shiftY, k, layer.k);
/*      */   }
/*      */ 
/*      */   public int d(int i, int j)
/*      */   {
/*  557 */     for (int num = this.layers.length - 1; num >= 0; num--) {
/*  558 */       int y = this.layers[num].d(i, j);
/*  559 */       if (y != 0) {
/*  560 */         return y + this.layers[num].shiftY;
/*      */       }
/*      */     }
/*  563 */     return 0;
/*      */   }
/*      */ 
/*      */   public int a(rf enumskyblock, int i, int j, int k)
/*      */   {
/*  568 */     if (j < getWorldMinY()) {
/*  569 */       j = getWorldMinY();
/*      */     }
/*  571 */     if ((j >= getWorldMaxY()) && (enumskyblock == rf.a)) {
/*  572 */       return 15;
/*      */     }
/*  574 */     if ((j < getWorldMinY()) || (j >= getWorldMaxY()) || (i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  576 */       return enumskyblock.c;
/*      */     }
/*  578 */     int l = i >> 4;
/*  579 */     int i1 = k >> 4;
/*  580 */     rv layer = getLayer(j);
/*  581 */     if (!chunkExists(l, i1, layer)) {
/*  582 */       return 0;
/*      */     }
/*  584 */     int j1 = a(i, j, k);
/*  585 */     if ((j1 == lr.al.bA) || (j1 == lr.aB.bA) || (j1 == lr.aI.bA) || (j1 == lr.au.bA))
/*      */     {
/*  587 */       int k1 = b(enumskyblock, i, j + 1, k);
/*  588 */       int l1 = b(enumskyblock, i + 1, j, k);
/*  589 */       int i2 = b(enumskyblock, i - 1, j, k);
/*  590 */       int j2 = b(enumskyblock, i, j, k + 1);
/*  591 */       int k2 = b(enumskyblock, i, j, k - 1);
/*  592 */       if (l1 > k1) {
/*  593 */         k1 = l1;
/*      */       }
/*  595 */       if (i2 > k1) {
/*  596 */         k1 = i2;
/*      */       }
/*  598 */       if (j2 > k1) {
/*  599 */         k1 = j2;
/*      */       }
/*  601 */       if (k2 > k1) {
/*  602 */         k1 = k2;
/*      */       }
/*  604 */       return k1;
/*      */     }
/*  606 */     vy chunk = getChunkFromChunkCoords(l, i1, layer);
/*  607 */     return chunk.a(enumskyblock, i & 0xF, j - layer.shiftY, k & 0xF);
/*      */   }
/*      */ 
/*      */   public int b(rf enumskyblock, int i, int j, int k)
/*      */   {
/*  612 */     if ((this.cached != null) && ((i ^ this.cacheX) >> 4 == 0) && ((k ^ this.cacheZ) >> 4 == 0) && ((j ^ this.cacheY) >> 7 == 0))
/*      */     {
/*  614 */       return this.cached.a(enumskyblock, i & 0xF, j & 0x7F, k & 0xF);
/*      */     }
/*  616 */     if (j < getWorldMinY()) {
/*  617 */       return 0;
/*      */     }
/*  619 */     if (j >= getWorldMaxY()) {
/*  620 */       j = getWorldMaxY() - 1;
/*      */     }
/*  622 */     if ((j < getWorldMinY()) || (j >= getWorldMaxY()) || (i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000))
/*      */     {
/*  624 */       return enumskyblock.c;
/*      */     }
/*  626 */     rv layer = getLayer(j);
/*  627 */     int l = i >> 4;
/*  628 */     int i1 = k >> 4;
/*  629 */     if (!chunkExists(l, i1, layer)) {
/*  630 */       return 0;
/*      */     }
/*  632 */     this.cached = layer.c(i >> 4, k >> 4);
/*  633 */     this.cacheX = i;
/*  634 */     this.cacheY = j;
/*  635 */     this.cacheZ = k;
/*  636 */     return this.cached.a(enumskyblock, i & 0xF, j & 0x7F, k & 0xF);
/*      */   }
/*      */ 
/*      */   public void a(rf enumskyblock, int i, int j, int k, int l) {
/*  640 */     if ((i < -30000000) || (k < -30000000) || (i >= 30000000) || (k >= 30000000)) {
/*  641 */       return;
/*      */     }
/*  643 */     if (j < getWorldMinY()) {
/*  644 */       return;
/*      */     }
/*  646 */     if (j >= getWorldMaxY()) {
/*  647 */       return;
/*      */     }
/*  649 */     rv layer = getLayer(j);
/*  650 */     if (!chunkExists(i >> 4, k >> 4, layer)) {
/*  651 */       return;
/*      */     }
/*  653 */     vy chunk = getChunkFromChunkCoords(i >> 4, k >> 4, layer);
/*  654 */     chunk.a(enumskyblock, i & 0xF, j - layer.shiftY, k & 0xF, l);
/*  655 */     for (int i1 = 0; i1 < this.z.size(); i1++)
/*  656 */       ((yj)this.z.get(i1)).a(i, j, k);
/*      */   }
/*      */ 
/*      */   public int b(int i, int j, int k, int l)
/*      */   {
/*  662 */     int i1 = a(rf.a, i, j, k);
/*  663 */     int j1 = a(rf.b, i, j, k);
/*  664 */     if (j1 < l) {
/*  665 */       j1 = l;
/*      */     }
/*  667 */     return i1 << 20 | j1 << 4;
/*      */   }
/*      */ 
/*      */   public float a(int i, int j, int k, int l) {
/*  671 */     int i1 = n(i, j, k);
/*  672 */     if (i1 < l) {
/*  673 */       i1 = l;
/*      */     }
/*  675 */     return getLayer(j).y.f[i1];
/*      */   }
/*      */ 
/*      */   public float c(int i, int j, int k) {
/*  679 */     return getLayer(j).y.f[n(i, j, k)];
/*      */   }
/*      */ 
/*      */   public boolean k() {
/*  683 */     return this.primaryWorld.k < 4;
/*      */   }
/*      */ 
/*      */   public ma a(ax vec3d, ax vec3d1) {
/*  687 */     return a(vec3d, vec3d1, false, false);
/*      */   }
/*      */ 
/*      */   public ma a(ax vec3d, ax vec3d1, boolean flag) {
/*  691 */     return a(vec3d, vec3d1, flag, false);
/*      */   }
/*      */ 
/*      */   public ma a(ax vec3d, ax vec3d1, boolean flag, boolean flag1) {
/*  695 */     if ((Double.isNaN(vec3d.a)) || (Double.isNaN(vec3d.b)) || (Double.isNaN(vec3d.c))) {
/*  696 */       return null;
/*      */     }
/*  698 */     if ((Double.isNaN(vec3d1.a)) || (Double.isNaN(vec3d1.b)) || (Double.isNaN(vec3d1.c))) {
/*  699 */       return null;
/*      */     }
/*  701 */     int i = et.b(vec3d1.a);
/*  702 */     int j = et.b(vec3d1.b);
/*  703 */     int k = et.b(vec3d1.c);
/*  704 */     int l = et.b(vec3d.a);
/*  705 */     int i1 = et.b(vec3d.b);
/*  706 */     int j1 = et.b(vec3d.c);
/*  707 */     int k1 = a(l, i1, j1);
/*  708 */     int i2 = e(l, i1, j1);
/*  709 */     lr block = lr.m[k1];
/*  710 */     if (((!flag1) || (block == null) || (block.c(this, l, i1, j1) != null)) && (k1 > 0) && (block.a(i2, flag)))
/*      */     {
/*  712 */       ma movingobjectposition = block.a(this, l, i1, j1, vec3d, vec3d1);
/*  713 */       if (movingobjectposition != null) {
/*  714 */         return movingobjectposition;
/*      */       }
/*      */     }
/*  717 */     for (int l1 = 200; l1-- >= 0; ) {
/*  718 */       if ((Double.isNaN(vec3d.a)) || (Double.isNaN(vec3d.b)) || (Double.isNaN(vec3d.c))) {
/*  719 */         return null;
/*      */       }
/*  721 */       if ((l == i) && (i1 == j) && (j1 == k)) {
/*  722 */         return null;
/*      */       }
/*  724 */       boolean flag2 = true;
/*  725 */       boolean flag3 = true;
/*  726 */       boolean flag4 = true;
/*  727 */       double d = 999.0D;
/*  728 */       double d1 = 999.0D;
/*  729 */       double d2 = 999.0D;
/*  730 */       if (i > l)
/*  731 */         d = l + 1.0D;
/*  732 */       else if (i < l)
/*  733 */         d = l + 0.0D;
/*      */       else {
/*  735 */         flag2 = false;
/*      */       }
/*  737 */       if (j > i1)
/*  738 */         d1 = i1 + 1.0D;
/*  739 */       else if (j < i1)
/*  740 */         d1 = i1 + 0.0D;
/*      */       else {
/*  742 */         flag3 = false;
/*      */       }
/*  744 */       if (k > j1)
/*  745 */         d2 = j1 + 1.0D;
/*  746 */       else if (k < j1)
/*  747 */         d2 = j1 + 0.0D;
/*      */       else {
/*  749 */         flag4 = false;
/*      */       }
/*  751 */       double d3 = 999.0D;
/*  752 */       double d4 = 999.0D;
/*  753 */       double d5 = 999.0D;
/*  754 */       double d6 = vec3d1.a - vec3d.a;
/*  755 */       double d7 = vec3d1.b - vec3d.b;
/*  756 */       double d8 = vec3d1.c - vec3d.c;
/*  757 */       if (flag2) {
/*  758 */         d3 = (d - vec3d.a) / d6;
/*      */       }
/*  760 */       if (flag3) {
/*  761 */         d4 = (d1 - vec3d.b) / d7;
/*      */       }
/*  763 */       if (flag4) {
/*  764 */         d5 = (d2 - vec3d.c) / d8;
/*      */       }
/*  766 */       byte byte0 = 0;
/*  767 */       if ((d3 < d4) && (d3 < d5)) {
/*  768 */         if (i > l)
/*  769 */           byte0 = 4;
/*      */         else {
/*  771 */           byte0 = 5;
/*      */         }
/*  773 */         vec3d.a = d;
/*  774 */         vec3d.b += d7 * d3;
/*  775 */         vec3d.c += d8 * d3;
/*  776 */       } else if (d4 < d5) {
/*  777 */         if (j > i1)
/*  778 */           byte0 = 0;
/*      */         else {
/*  780 */           byte0 = 1;
/*      */         }
/*  782 */         vec3d.a += d6 * d4;
/*  783 */         vec3d.b = d1;
/*  784 */         vec3d.c += d8 * d4;
/*      */       } else {
/*  786 */         if (k > j1)
/*  787 */           byte0 = 2;
/*      */         else {
/*  789 */           byte0 = 3;
/*      */         }
/*  791 */         vec3d.a += d6 * d5;
/*  792 */         vec3d.b += d7 * d5;
/*  793 */         vec3d.c = d2;
/*      */       }
/*  795 */       ax vec3d2 = ax.b(vec3d.a, vec3d.b, vec3d.c);
/*  796 */       l = (int)(vec3d2.a = et.b(vec3d.a));
/*  797 */       if (byte0 == 5) {
/*  798 */         l--;
/*  799 */         vec3d2.a += 1.0D;
/*      */       }
/*  801 */       i1 = (int)(vec3d2.b = et.b(vec3d.b));
/*  802 */       if (byte0 == 1) {
/*  803 */         i1--;
/*  804 */         vec3d2.b += 1.0D;
/*      */       }
/*  806 */       j1 = (int)(vec3d2.c = et.b(vec3d.c));
/*  807 */       if (byte0 == 3) {
/*  808 */         j1--;
/*  809 */         vec3d2.c += 1.0D;
/*      */       }
/*  811 */       int j2 = a(l, i1, j1);
/*  812 */       int k2 = e(l, i1, j1);
/*  813 */       lr block1 = lr.m[j2];
/*  814 */       if (((!flag1) || (block1 == null) || (block1.c(this, l, i1, j1) != null)) && (j2 > 0) && (block1.a(k2, flag)))
/*      */       {
/*  816 */         ma movingobjectposition1 = block1.a(this, l, i1, j1, vec3d, vec3d1);
/*  817 */         if (movingobjectposition1 != null) {
/*  818 */           return movingobjectposition1;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*  823 */     return null;
/*      */   }
/*      */ 
/*      */   public void a(kj entity, String s, float f, float f1) {
/*  827 */     for (int i = 0; i < this.z.size(); i++)
/*  828 */       ((yj)this.z.get(i)).a(s, entity.o, entity.p - entity.H, entity.q, f, f1);
/*      */   }
/*      */ 
/*      */   public void a(double d, double d1, double d2, String s, float f, float f1)
/*      */   {
/*  835 */     for (int i = 0; i < this.z.size(); i++)
/*  836 */       ((yj)this.z.get(i)).a(s, d, d1, d2, f, f1);
/*      */   }
/*      */ 
/*      */   public void a(String s, int i, int j, int k)
/*      */   {
/*  842 */     for (int l = 0; l < this.z.size(); l++)
/*  843 */       ((yj)this.z.get(l)).a(s, i, j, k);
/*      */   }
/*      */ 
/*      */   public void a(String s, double d, double d1, double d2, double d3, double d4, double d5)
/*      */   {
/*  849 */     for (int i = 0; i < this.z.size(); i++)
/*  850 */       ((yj)this.z.get(i)).a(s, d, d1, d2, d3, d4, d5);
/*      */   }
/*      */ 
/*      */   public boolean e(kj entity)
/*      */   {
/*  856 */     this.j.add(entity);
/*  857 */     return true;
/*      */   }
/*      */ 
/*      */   public boolean a(kj entity) {
/*  861 */     int i = et.b(entity.o / 16.0D);
/*  862 */     int j = et.b(entity.q / 16.0D);
/*  863 */     rv layer = getLayer((int)entity.p);
/*  864 */     boolean flag = false;
/*  865 */     if ((entity instanceof sz)) {
/*  866 */       flag = true;
/*      */     }
/*      */ 
/*  869 */     if ((flag) || (chunkExists(i, j, layer))) {
/*  870 */       if ((entity instanceof sz)) {
/*  871 */         sz entityplayer = (sz)entity;
/*  872 */         this.i.add(entityplayer);
/*  873 */         y();
/*      */       }
/*  875 */       if (entity.chunkLayer == null) {
/*  876 */         entity.chunkLayer = layer;
/*      */       }
/*  878 */       if ((entity instanceof wd))
/*  879 */         entity.chunkLayer.g.add(entity);
/*  880 */       if ((entity instanceof qs)) {
/*  881 */         changePrimaryWorld(layer);
/*  882 */         layer.i.add(entity);
/*      */       }
/*  884 */       if (!entity.ag) {
/*  885 */         getChunkFromChunkCoords(i, j, layer).a(entity);
/*      */       }
/*  887 */       this.g.add(entity);
/*  888 */       c(entity);
/*  889 */       return true;
/*      */     }
/*  891 */     return false;
/*      */   }
/*      */ 
/*      */   protected void c(kj entity)
/*      */   {
/*  896 */     for (int i = 0; i < this.z.size(); i++)
/*  897 */       ((yj)this.z.get(i)).a(entity);
/*      */   }
/*      */ 
/*      */   protected void d(kj entity)
/*      */   {
/*  903 */     for (int i = 0; i < this.z.size(); i++)
/*  904 */       ((yj)this.z.get(i)).b(entity);
/*      */   }
/*      */ 
/*      */   public void b(kj entity)
/*      */   {
/*  910 */     if (entity.i != null) {
/*  911 */       entity.i.g(null);
/*      */     }
/*  913 */     if (entity.j != null) {
/*  914 */       entity.g(null);
/*      */     }
/*  916 */     entity.v();
/*  917 */     if ((entity instanceof sz)) {
/*  918 */       this.i.remove((sz)entity);
/*  919 */       entity.chunkLayer.i.remove(entity);
/*  920 */       y();
/*      */     }
/*      */   }
/*      */ 
/*      */   public List a(kj entity, rp axisalignedbb) {
/*  925 */     this.U.clear();
/*  926 */     int i = et.b(axisalignedbb.a);
/*  927 */     int j = et.b(axisalignedbb.d + 1.0D);
/*  928 */     int k = entity.getFloor(axisalignedbb.b);
/*  929 */     int l = entity.getFloor(axisalignedbb.e + 1.0D);
/*  930 */     int i1 = et.b(axisalignedbb.c);
/*  931 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/*      */ 
/*  933 */     rv layer1 = getLayer(k);
/*  934 */     rv layer2 = getLayer(l);
/*  935 */     for (int k1 = i; k1 < j; k1++) {
/*  936 */       for (int l1 = i1; l1 < j1; l1++) {
/*  937 */         if (d(k1, layer1.shiftY + 64, l1))
/*      */         {
/*  940 */           if ((layer2 == layer1) || (d(k1, layer2.shiftY + 64, l1)))
/*      */           {
/*  943 */             if (entity.getGravity() == 1) {
/*  944 */               for (int i2 = k - 1; i2 < l; i2++) {
/*  945 */                 lr block = lr.m[a(k1, i2, l1)];
/*  946 */                 if (block != null)
/*  947 */                   block.a(this, k1, i2, l1, axisalignedbb, this.U);
/*      */               }
/*      */             }
/*      */             else {
/*  951 */               for (int i2 = l; i2 >= k; i2--) {
/*  952 */                 lr block = lr.m[a(k1, i2, l1)];
/*  953 */                 if (block != null) {
/*  954 */                   block.a(this, k1, i2, l1, axisalignedbb, this.U);
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*  963 */     double d = 0.25D;
/*  964 */     List list = b(entity, axisalignedbb.b(d, d, d));
/*  965 */     for (Iterator it = this.g.iterator(); it.hasNext(); ) {
/*  966 */       kj entity2 = (kj)it.next();
/*  967 */       rp axisalignedbb1 = entity2.g_();
/*  968 */       if ((axisalignedbb1 != null) && (axisalignedbb1.a(axisalignedbb))) {
/*  969 */         this.U.add(axisalignedbb1);
/*      */       }
/*  971 */       axisalignedbb1 = entity.a(entity2);
/*  972 */       if ((axisalignedbb1 != null) && (axisalignedbb1.a(axisalignedbb))) {
/*  973 */         this.U.add(axisalignedbb1);
/*      */       }
/*      */     }
/*  976 */     return this.U;
/*      */   }
/*      */ 
/*      */   public int a(float f) {
/*  980 */     if (this.primaryWorld != null)
/*  981 */       return this.primaryWorld.a(f);
/*  982 */     return 0;
/*      */   }
/*      */ 
/*      */   public float b(float f) {
/*  986 */     if (this.primaryWorld != null)
/*  987 */       return this.primaryWorld.b(f);
/*  988 */     return 0.0F;
/*      */   }
/*      */ 
/*      */   public ax a(kj entity, float f) {
/*  992 */     rv layer = getLayer((int)entity.p);
/*  993 */     return layer.a(entity, f);
/*      */   }
/*      */ 
/*      */   public float c(float f) {
/*  997 */     return this.y.a(this.C.f(), f) + (float)(this.J + (this.K - this.J) * f);
/*      */   }
/*      */ 
/*      */   public float d(float f)
/*      */   {
/* 1002 */     float f1 = c(f);
/* 1003 */     return f1 * 3.141593F * 2.0F;
/*      */   }
/*      */ 
/*      */   public ax e(float f) {
/* 1007 */     return this.primaryWorld.e(f);
/*      */   }
/*      */ 
/*      */   public ax f(float f) {
/* 1011 */     return this.primaryWorld.f(f);
/*      */   }
/*      */ 
/*      */   public int e(int i, int j) {
/* 1015 */     return b(i, j).c(i & 0xF, j & 0xF);
/*      */   }
/*      */ 
/*      */   public int f(int i, int j) {
/* 1019 */     vy chunk = b(i, j);
/* 1020 */     int k = 127;
/* 1021 */     i &= 15;
/* 1022 */     j &= 15;
/* 1023 */     while (k > 0) {
/* 1024 */       int l = chunk.a(i, k, j);
/* 1025 */       if ((l == 0) || (!lr.m[l].bN.c()) || (lr.m[l].bN == wa.i))
/*      */       {
/* 1027 */         k--;
/*      */       }
/* 1029 */       else return k + 1;
/*      */     }
/*      */ 
/* 1032 */     return -1;
/*      */   }
/*      */ 
/*      */   public float g(float f) {
/* 1036 */     return this.primaryWorld.g(f);
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, int l, int i1) {
/* 1040 */     super.a(i, j, k, l, i1);
/*      */   }
/*      */ 
/*      */   public void l()
/*      */   {
/* 1045 */     for (int i = 0; i < this.j.size(); i++)
/*      */     {
/* 1047 */       kj entity = (kj)this.j.get(i);
/* 1048 */       entity.w_();
/* 1049 */       if (entity.G)
/*      */       {
/* 1051 */         this.j.remove(i--);
/*      */       }
/*      */     }
/*      */ 
/* 1055 */     this.g.removeAll(this.M);
/* 1056 */     for (int j = 0; j < this.M.size(); j++) {
/* 1057 */       kj entity1 = (kj)this.M.get(j);
/* 1058 */       int i1 = entity1.ah;
/* 1059 */       int k1 = entity1.aj;
/* 1060 */       rv layer = entity1.chunkLayer;
/* 1061 */       if ((layer != null) && ((entity1 instanceof wd))) {
/* 1062 */         layer.g.remove(entity1);
/*      */       }
/* 1064 */       if ((entity1.ag) && (chunkExists(i1, k1, layer))) {
/* 1065 */         getChunkFromChunkCoords(i1, k1, layer).b(entity1);
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1070 */     for (int k = 0; k < this.M.size(); k++) {
/* 1071 */       d((kj)this.M.get(k));
/*      */     }
/*      */ 
/* 1074 */     this.M.clear();
/* 1075 */     List arr = p();
/* 1076 */     for (Iterator it = arr.iterator(); it.hasNext(); ) {
/* 1077 */       kj entity2 = (kj)it.next();
/* 1078 */       if (entity2.j != null) {
/* 1079 */         if ((entity2.j.G) || (entity2.j.i != entity2))
/*      */         {
/* 1082 */           entity2.j.i = null;
/* 1083 */           entity2.j = null;
/*      */         }
/*      */       } else { if (!entity2.G) {
/* 1086 */           f(entity2);
/*      */         }
/* 1088 */         if (entity2.G)
/*      */         {
/* 1091 */           int j1 = entity2.ah;
/* 1092 */           int l1 = entity2.aj;
/* 1093 */           rv layer = entity2.chunkLayer;
/* 1094 */           if ((entity2.ag) && (chunkExists(j1, l1, layer))) {
/* 1095 */             getChunkFromChunkCoords(j1, l1, layer).b(entity2);
/*      */           }
/* 1097 */           this.g.remove(entity2);
/* 1098 */           if (layer != null)
/* 1099 */             layer.g.remove(entity2);
/* 1100 */           d(entity2);
/*      */         } }
/*      */     }
/* 1103 */     for (rv layer : this.layers)
/* 1104 */       layer.updateTileEntities();
/*      */   }
/*      */ 
/*      */   public void a(Collection collection) {
/* 1108 */     throw new NotImplementedException();
/*      */   }
/*      */ 
/*      */   public void addTileEntity(ij te) {
/* 1112 */     throw new NotImplementedException();
/*      */   }
/*      */ 
/*      */   public void f(kj entity) {
/* 1116 */     a(entity, true);
/*      */   }
/*      */ 
/*      */   public void a(kj entity, boolean flag) {
/* 1120 */     int i = et.b(entity.o);
/* 1121 */     int j = et.b(entity.q);
/* 1122 */     int posY = et.b(entity.p);
/* 1123 */     rv layer = getLayer((int)entity.p);
/* 1124 */     byte byte0 = 32;
/* 1125 */     if ((flag) && (!b(i - byte0, posY - 2, j - byte0, i + byte0, posY + 2, j + byte0)) && (!(entity instanceof qs)))
/*      */     {
/* 1127 */       return;
/*      */     }
/* 1129 */     entity.N = entity.o;
/* 1130 */     entity.O = entity.p;
/* 1131 */     entity.P = entity.q;
/* 1132 */     entity.w = entity.u;
/* 1133 */     entity.x = entity.v;
/* 1134 */     if ((flag) && (entity.ag)) {
/* 1135 */       if (entity.j != null)
/* 1136 */         entity.I();
/*      */       else {
/* 1138 */         entity.w_();
/*      */       }
/*      */     }
/* 1141 */     if ((Double.isNaN(entity.o)) || (Double.isInfinite(entity.o))) {
/* 1142 */       entity.o = entity.N;
/*      */     }
/* 1144 */     if ((Double.isNaN(entity.p)) || (Double.isInfinite(entity.p))) {
/* 1145 */       entity.p = entity.O;
/*      */     }
/* 1147 */     if ((Double.isNaN(entity.q)) || (Double.isInfinite(entity.q))) {
/* 1148 */       entity.q = entity.P;
/*      */     }
/* 1150 */     if ((Double.isNaN(entity.v)) || (Double.isInfinite(entity.v))) {
/* 1151 */       entity.v = entity.x;
/*      */     }
/* 1153 */     if ((Double.isNaN(entity.u)) || (Double.isInfinite(entity.u))) {
/* 1154 */       entity.u = entity.w;
/*      */     }
/* 1156 */     layer = getLayer((int)entity.p);
/* 1157 */     int k = et.b(entity.o / 16.0D);
/* 1158 */     int l = et.b((entity.p - layer.shiftY) / 16.0D);
/* 1159 */     int i1 = et.b(entity.q / 16.0D);
/* 1160 */     if ((!entity.ag) || (entity.ah != k) || (entity.ai != l) || (entity.aj != i1) || (entity.chunkLayer != layer))
/*      */     {
/* 1162 */       if ((entity.ag) && (chunkExists(entity.ah, entity.aj, entity.chunkLayer))) {
/* 1163 */         entity.chunkLayer.c(entity.ah, entity.aj).a(entity, entity.ai);
/*      */ 
/* 1165 */         if (layer != entity.chunkLayer) {
/* 1166 */           if ((entity instanceof wd))
/* 1167 */             entity.chunkLayer.g.remove(entity);
/* 1168 */           if ((entity instanceof sz)) {
/* 1169 */             layer.i.remove(entity);
/*      */           }
/*      */         }
/*      */       }
/* 1173 */       if (chunkExists(k, i1, layer)) {
/* 1174 */         if ((entity instanceof qs)) {
/* 1175 */           changePrimaryWorld(layer);
/*      */         }
/* 1177 */         entity.ag = true;
/* 1178 */         getChunkFromChunkCoords(k, i1, layer).a(entity);
/* 1179 */         if (layer != entity.chunkLayer) {
/* 1180 */           entity.chunkLayer = layer;
/* 1181 */           if ((entity instanceof wd))
/* 1182 */             entity.chunkLayer.g.add(entity);
/* 1183 */           if ((entity instanceof sz))
/* 1184 */             layer.i.add(entity);
/*      */         }
/*      */       } else {
/* 1187 */         entity.ag = false;
/*      */       }
/*      */     }
/* 1190 */     if ((flag) && (entity.ag) && (entity.i != null))
/* 1191 */       if ((entity.i.G) || (entity.i.j != entity)) {
/* 1192 */         entity.i.j = null;
/* 1193 */         entity.i = null;
/*      */       } else {
/* 1195 */         f(entity.i);
/*      */       }
/*      */   }
/*      */ 
/*      */   public boolean c(rp axisalignedbb)
/*      */   {
/* 1201 */     MineUpForgeAdapter g = MineUpForgeAdapter.get();
/* 1202 */     int i = et.b(axisalignedbb.a);
/* 1203 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1204 */     int k = et.b(axisalignedbb.b);
/* 1205 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 1206 */     int i1 = et.b(axisalignedbb.c);
/* 1207 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1208 */     if (b(i, k, i1, j, l, j1)) {
/* 1209 */       for (int k1 = i; k1 < j; k1++) {
/* 1210 */         for (int l1 = k; l1 < l; l1++) {
/* 1211 */           for (int i2 = i1; i2 < j1; i2++) {
/* 1212 */             int j2 = a(k1, l1, i2);
/* 1213 */             if ((j2 == lr.as.bA) || (j2 == lr.D.bA) || (j2 == lr.E.bA)) {
/* 1214 */               return true;
/*      */             }
/* 1216 */             if ((j2 > 0) && (g.blockIsBlockBurning(lr.m[j2], this, k1, l1, i2))) {
/* 1217 */               return true;
/*      */             }
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1226 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean a(rp axisalignedbb, wa material, kj entity) {
/* 1230 */     int i = et.b(axisalignedbb.a);
/* 1231 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1232 */     int k = et.b(axisalignedbb.b);
/* 1233 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 1234 */     int i1 = et.b(axisalignedbb.c);
/* 1235 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1236 */     if (!b(i, k, i1, j, l, j1)) {
/* 1237 */       return false;
/*      */     }
/* 1239 */     boolean flag = false;
/* 1240 */     ax vec3d = ax.b(0.0D, 0.0D, 0.0D);
/* 1241 */     for (int k1 = i; k1 < j; k1++) {
/* 1242 */       for (int l1 = k; l1 < l; l1++) {
/* 1243 */         for (int i2 = i1; i2 < j1; i2++) {
/* 1244 */           lr block = lr.m[a(k1, l1, i2)];
/* 1245 */           if ((block != null) && (block.bN == material))
/*      */           {
/* 1248 */             double d1 = l1 + 1 - zp.d(e(k1, l1, i2));
/* 1249 */             if (l >= d1) {
/* 1250 */               flag = true;
/* 1251 */               block.a(this, k1, l1, i2, entity, vec3d);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1259 */     if (vec3d.d() > 0.0D) {
/* 1260 */       vec3d = vec3d.c();
/* 1261 */       double d = 0.014D;
/* 1262 */       entity.r += vec3d.a * d;
/* 1263 */       entity.s += vec3d.b * d;
/* 1264 */       entity.t += vec3d.c * d;
/*      */     }
/* 1266 */     return flag;
/*      */   }
/*      */ 
/*      */   public boolean a(rp axisalignedbb, wa material) {
/* 1270 */     int i = et.b(axisalignedbb.a);
/* 1271 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1272 */     int k = et.b(axisalignedbb.b);
/* 1273 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 1274 */     int i1 = et.b(axisalignedbb.c);
/* 1275 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1276 */     for (int k1 = i; k1 < j; k1++) {
/* 1277 */       for (int l1 = k; l1 < l; l1++) {
/* 1278 */         for (int i2 = i1; i2 < j1; i2++) {
/* 1279 */           lr block = lr.m[a(k1, l1, i2)];
/* 1280 */           if ((block != null) && (block.bN == material)) {
/* 1281 */             return true;
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1289 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean b(rp axisalignedbb, wa material) {
/* 1293 */     int i = et.b(axisalignedbb.a);
/* 1294 */     int j = et.b(axisalignedbb.d + 1.0D);
/* 1295 */     int k = et.b(axisalignedbb.b);
/* 1296 */     int l = et.b(axisalignedbb.e + 1.0D);
/* 1297 */     int i1 = et.b(axisalignedbb.c);
/* 1298 */     int j1 = et.b(axisalignedbb.f + 1.0D);
/* 1299 */     for (int k1 = i; k1 < j; k1++) {
/* 1300 */       for (int l1 = k; l1 < l; l1++) {
/* 1301 */         for (int i2 = i1; i2 < j1; i2++) {
/* 1302 */           lr block = lr.m[a(k1, l1, i2)];
/* 1303 */           if ((block != null) && (block.bN == material))
/*      */           {
/* 1306 */             int j2 = e(k1, l1, i2);
/* 1307 */             double d = l1 + 1;
/* 1308 */             if (j2 < 8) {
/* 1309 */               d = l1 + 1 - j2 / 8.0D;
/*      */             }
/* 1311 */             if (d >= axisalignedbb.b) {
/* 1312 */               return true;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1320 */     return false;
/*      */   }
/*      */ 
/*      */   public zf a(kj entity, double d, double d1, double d2, float f) {
/* 1324 */     return a(entity, d, d1, d2, f, false);
/*      */   }
/*      */ 
/*      */   public zf a(kj entity, double d, double d1, double d2, float f, boolean flag) {
/* 1328 */     zf explosion = new zf(this, entity, d, d1, d2, f);
/* 1329 */     explosion.a = flag;
/* 1330 */     explosion.a();
/* 1331 */     explosion.a(true);
/* 1332 */     return explosion;
/*      */   }
/*      */ 
/*      */   public float a(ax vec3d, rp axisalignedbb) {
/* 1336 */     double d = 1.0D / ((axisalignedbb.d - axisalignedbb.a) * 2.0D + 1.0D);
/* 1337 */     double d1 = 1.0D / ((axisalignedbb.e - axisalignedbb.b) * 2.0D + 1.0D);
/* 1338 */     double d2 = 1.0D / ((axisalignedbb.f - axisalignedbb.c) * 2.0D + 1.0D);
/* 1339 */     int i = 0;
/* 1340 */     int j = 0;
/* 1341 */     for (float f = 0.0F; f <= 1.0F; f = (float)(f + d)) {
/* 1342 */       for (float f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d1)) {
/* 1343 */         for (float f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d2)) {
/* 1344 */           double d3 = axisalignedbb.a + (axisalignedbb.d - axisalignedbb.a) * f;
/* 1345 */           double d4 = axisalignedbb.b + (axisalignedbb.e - axisalignedbb.b) * f1;
/* 1346 */           double d5 = axisalignedbb.c + (axisalignedbb.f - axisalignedbb.c) * f2;
/* 1347 */           if (a(ax.b(d3, d4, d5), vec3d) == null) {
/* 1348 */             i++;
/*      */           }
/* 1350 */           j++;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1357 */     return i / j;
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer, int i, int j, int k, int l) {
/* 1361 */     if (l == 0) {
/* 1362 */       j--;
/*      */     }
/* 1364 */     if (l == 1) {
/* 1365 */       j++;
/*      */     }
/* 1367 */     if (l == 2) {
/* 1368 */       k--;
/*      */     }
/* 1370 */     if (l == 3) {
/* 1371 */       k++;
/*      */     }
/* 1373 */     if (l == 4) {
/* 1374 */       i--;
/*      */     }
/* 1376 */     if (l == 5) {
/* 1377 */       i++;
/*      */     }
/* 1379 */     if (a(i, j, k) == lr.as.bA) {
/* 1380 */       a(entityplayer, 1004, i, j, k, 0);
/* 1381 */       g(i, j, k, 0);
/*      */     }
/*      */   }
/*      */ 
/*      */   public kj a(Class class1) {
/* 1386 */     return null;
/*      */   }
/*      */ 
/*      */   public String m() {
/* 1390 */     return "All: " + this.g.size();
/*      */   }
/*      */ 
/*      */   public String n() {
/* 1394 */     return this.A.c();
/*      */   }
/*      */ 
/*      */   public ij b(int i, int j, int k) {
/* 1398 */     rv layer = getLayer(j);
/* 1399 */     vy chunk = getChunkFromChunkCoords(i >> 4, k >> 4, layer);
/* 1400 */     if (chunk != null) {
/* 1401 */       return chunk.d(i & 0xF, j - layer.shiftY, k & 0xF);
/*      */     }
/* 1403 */     return null;
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, ij tileentity)
/*      */   {
/* 1408 */     rv layer = getLayer(j);
/* 1409 */     layer.a(i, j - layer.shiftY, k, tileentity);
/*      */   }
/*      */ 
/*      */   public void o(int i, int j, int k) {
/* 1413 */     rv layer = getLayer(j);
/* 1414 */     layer.o(i, j + layer.shiftY, k);
/*      */   }
/*      */ 
/*      */   public void a(ij tileentity) {
/* 1418 */     throw new NotImplementedException();
/*      */   }
/*      */ 
/*      */   public void c() {
/* 1422 */     this.J = this.K;
/* 1423 */     this.K += this.L;
/* 1424 */     this.L *= 0.98D;
/* 1425 */     a().b();
/* 1426 */     h();
/* 1427 */     if (A()) {
/* 1428 */       boolean flag = false;
/* 1429 */       if ((this.F) && (this.v >= 1)) {
/* 1430 */         for (rv layer : this.layers) {
/* 1431 */           flag |= qk.a(layer, this.i);
/*      */         }
/*      */       }
/* 1434 */       if (!flag) {
/* 1435 */         long l = this.C.f() + 24000L;
/* 1436 */         this.C.a(l - l % 24000L);
/* 1437 */         z();
/*      */       }
/*      */     }
/* 1440 */     for (rv layer : this.layers) {
/* 1441 */       if (this.C.f() % 400L == 50 * layer.worldNum % 400)
/* 1442 */         layer.spawnContext.peacefulcounter += 289;
/* 1443 */       List list = new ArrayList();
/* 1444 */       for (Iterator i$ = this.W.iterator(); i$.hasNext(); ) { Object pair = i$.next();
/* 1445 */         if (((oh)pair).layerNum == layer.worldNum)
/* 1446 */           list.add((oh)pair); }
/* 1447 */       layer.spawnContext.setPositionsToUpdate(list);
/* 1448 */       qk.performSpawning(layer.spawnContext, this.F);
/*      */     }
/* 1450 */     for (rv layer : this.layers)
/* 1451 */       layer.tickChild();
/* 1452 */     long l1 = this.C.f() + 1L;
/*      */ 
/* 1454 */     if (l1 % 4000L == 0L) {
/* 1455 */       a(false, null);
/*      */     }
/* 1457 */     this.C.a(l1);
/* 1458 */     for (rv layer : this.layers)
/* 1459 */       layer.x().a(l1);
/* 1460 */     a(false);
/* 1461 */     f();
/*      */   }
/*      */ 
/*      */   protected void h() {
/* 1465 */     for (rv layer : this.layers)
/* 1466 */       layer.h();
/*      */   }
/*      */ 
/*      */   protected void f() {
/* 1470 */     if (this.cached != null)
/* 1471 */       keepChunkActual(this.cached);
/* 1472 */     this.W.clear();
/* 1473 */     for (int i = 0; i < this.i.size(); i++) {
/* 1474 */       sz entityplayer = (sz)this.i.get(i);
/* 1475 */       getChunksNearEntity(this.W, entityplayer);
/*      */     }
/* 1477 */     if (this.X > 0) {
/* 1478 */       this.X -= 1;
/*      */     }
/* 1480 */     for (Iterator iterator = this.W.iterator(); iterator.hasNext(); ) {
/* 1481 */       oh chunkcoordintpair = (oh)iterator.next();
/* 1482 */       int k = chunkcoordintpair.a * 16;
/* 1483 */       int i1 = chunkcoordintpair.b * 16;
/* 1484 */       rv layer = this.layers[chunkcoordintpair.layerNum];
/* 1485 */       vy chunk = getChunkFromChunkCoords(chunkcoordintpair.a, chunkcoordintpair.b, layer);
/* 1486 */       chunk.j();
/* 1487 */       keepChunkActual(chunk);
/* 1488 */       if (this.X == 0) {
/* 1489 */         this.l = (this.l * 3 + 1013904223);
/* 1490 */         int k1 = this.l >> 2;
/* 1491 */         int l2 = k1 & 0xF;
/* 1492 */         int l3 = k1 >> 8 & 0xF;
/* 1493 */         int l4_ = k1 >> 16 & 0x7F;
/* 1494 */         int l5 = chunk.a(l2, l4_, l3);
/* 1495 */         int l4 = l4_ + layer.shiftY;
/*      */ 
/* 1497 */         l2 += k;
/* 1498 */         l3 += i1;
/* 1499 */         if ((l5 == 0) && (m(l2, l4, l3) <= this.w.nextInt(8)) && (b(rf.a, l2, l4, l3) <= 0))
/*      */         {
/* 1501 */           sz entityplayer1 = a(l2 + 0.5D, l4 + 0.5D, l3 + 0.5D, 8.0D);
/*      */ 
/* 1503 */           if ((entityplayer1 != null) && (entityplayer1.f(l2 + 0.5D, l4 + 0.5D, l3 + 0.5D) > 4.0D))
/*      */           {
/* 1505 */             a(l2 + 0.5D, l4 + 0.5D, l3 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.w.nextFloat() * 0.2F);
/*      */ 
/* 1507 */             this.X = (this.w.nextInt(12000) + 6000);
/*      */           }
/*      */         }
/*      */       }
/* 1511 */       if (this.w.nextInt(100000) == 0) {
/* 1512 */         this.l = layer.updateBlocksAndGenerateLightings(chunk, k, i1, this.l);
/*      */       }
/* 1514 */       if (this.w.nextInt(16) == 0) {
/* 1515 */         this.l = layer.updateBlocksAndGrowSnow(chunk, k, i1, this.l);
/*      */       }
/*      */ 
/* 1518 */       p(k + this.w.nextInt(16), this.w.nextInt(layer.getWorldHeight()) + layer.shiftY, i1 + this.w.nextInt(16));
/*      */ 
/* 1520 */       int j2 = 0;
/* 1521 */       while (j2 < 80) {
/* 1522 */         this.l = (this.l * 3 + 1013904223);
/* 1523 */         int k3 = this.l >> 2;
/* 1524 */         int k4 = k3 & 0xF;
/* 1525 */         int k5 = k3 >> 8 & 0xF;
/* 1526 */         int j6 = k3 >> 16 & 0x7F;
/* 1527 */         int l6 = chunk.b[(k4 << 11 | k5 << 7 | j6)] & 0xFF;
/* 1528 */         if (lr.n[l6] != 0) {
/* 1529 */           lr.m[l6].a(this, k4 + k, j6 + layer.shiftY, k5 + i1, this.w);
/*      */         }
/* 1531 */         j2++;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void p(int i, int j, int k)
/*      */   {
/* 1538 */     c(rf.a, i, j, k);
/* 1539 */     c(rf.b, i, j, k);
/*      */   }
/*      */ 
/*      */   protected int a(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/* 1544 */     rv layer = getLayer(k);
/* 1545 */     return layer.a(i, j, k - layer.shiftY, l, i1, j1);
/*      */   }
/*      */ 
/*      */   public void c(rf enumskyblock, int i, int j, int k)
/*      */   {
/* 1689 */     if (!e(i, j, k, 17)) {
/* 1690 */       return;
/*      */     }
/* 1692 */     int l = 0;
/* 1693 */     int i1 = 0;
/* 1694 */     int j1 = b(enumskyblock, i, j, k);
/* 1695 */     int l1 = 0;
/* 1696 */     int j2 = j1;
/* 1697 */     int i3 = a(i, j, k);
/* 1698 */     int l3 = lr.q[i3];
/* 1699 */     if (l3 == 0) {
/* 1700 */       l3 = 1;
/*      */     }
/* 1702 */     int k4 = 0;
/* 1703 */     if (enumskyblock == rf.a)
/* 1704 */       k4 = a(j2, i, j, k, i3, l3);
/*      */     else {
/* 1706 */       k4 = d(j2, i, j, k, i3, l3);
/*      */     }
/* 1708 */     l1 = k4;
/* 1709 */     if (l1 > j1) {
/* 1710 */       this.H[(i1++)] = 133152;
/* 1711 */     } else if (l1 < j1) {
/* 1712 */       if (enumskyblock == rf.b);
/* 1714 */       this.H[(i1++)] = (133152 + (j1 << 18));
/*      */ 
/* 1716 */       while (l < i1)
/*      */       {
/* 1719 */         int k2 = this.H[(l++)];
/* 1720 */         int j3 = (k2 & 0x3F) - 32 + i;
/* 1721 */         int i4 = (k2 >> 6 & 0x3F) - 32 + j;
/* 1722 */         int l4 = (k2 >> 12 & 0x3F) - 32 + k;
/* 1723 */         int j5 = k2 >> 18 & 0xF;
/* 1724 */         int l5 = b(enumskyblock, j3, i4, l4);
/* 1725 */         if (l5 == j5) {
/* 1726 */           a(enumskyblock, j3, i4, l4, 0);
/* 1727 */           j5--; if (j5 > 0) {
/* 1728 */             int k6 = j3 - i;
/* 1729 */             int i7 = i4 - j;
/* 1730 */             int k7 = l4 - k;
/* 1731 */             if (k6 < 0) {
/* 1732 */               k6 = -k6;
/*      */             }
/* 1734 */             if (i7 < 0) {
/* 1735 */               i7 = -i7;
/*      */             }
/* 1737 */             if (k7 < 0) {
/* 1738 */               k7 = -k7;
/*      */             }
/* 1740 */             if (k6 + i7 + k7 < 17) {
/* 1741 */               int i8 = 0;
/* 1742 */               while (i8 < 6) {
/* 1743 */                 int j8 = i8 % 2 * 2 - 1;
/* 1744 */                 int k8 = j3 + i8 / 2 % 3 / 2 * j8;
/* 1745 */                 int l8 = i4 + (i8 / 2 + 1) % 3 / 2 * j8;
/* 1746 */                 int i9 = l4 + (i8 / 2 + 2) % 3 / 2 * j8;
/* 1747 */                 int i6 = b(enumskyblock, k8, l8, i9);
/* 1748 */                 if (i6 == j5) {
/* 1749 */                   this.H[(i1++)] = (k8 - i + 32 + (l8 - j + 32 << 6) + (i9 - k + 32 << 12) + (j5 << 18));
/*      */                 }
/*      */ 
/* 1752 */                 i8++;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/* 1758 */       l = 0;
/*      */     }
/*      */ 
/* 1761 */     while (l < i1)
/*      */     {
/* 1764 */       int k1 = this.H[(l++)];
/* 1765 */       int i2 = (k1 & 0x3F) - 32 + i;
/* 1766 */       int l2 = (k1 >> 6 & 0x3F) - 32 + j;
/* 1767 */       int k3 = (k1 >> 12 & 0x3F) - 32 + k;
/* 1768 */       int j4 = b(enumskyblock, i2, l2, k3);
/* 1769 */       int i5 = a(i2, l2, k3);
/* 1770 */       int k5 = lr.q[i5];
/* 1771 */       if (k5 == 0) {
/* 1772 */         k5 = 1;
/*      */       }
/* 1774 */       int j6 = 0;
/* 1775 */       if (enumskyblock == rf.a)
/* 1776 */         j6 = a(j4, i2, l2, k3, i5, k5);
/*      */       else {
/* 1778 */         j6 = d(j4, i2, l2, k3, i5, k5);
/*      */       }
/* 1780 */       if (j6 != j4) {
/* 1781 */         a(enumskyblock, i2, l2, k3, j6);
/* 1782 */         if (j6 > j4) {
/* 1783 */           int l6 = i2 - i;
/* 1784 */           int j7 = l2 - j;
/* 1785 */           int l7 = k3 - k;
/* 1786 */           if (l6 < 0) {
/* 1787 */             l6 = -l6;
/*      */           }
/* 1789 */           if (j7 < 0) {
/* 1790 */             j7 = -j7;
/*      */           }
/* 1792 */           if (l7 < 0) {
/* 1793 */             l7 = -l7;
/*      */           }
/* 1795 */           if ((l6 + j7 + l7 < 17) && (i1 < this.H.length - 6)) {
/* 1796 */             if (b(enumskyblock, i2 - 1, l2, k3) < j6) {
/* 1797 */               this.H[(i1++)] = (i2 - 1 - i + 32 + (l2 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/*      */ 
/* 1800 */             if (b(enumskyblock, i2 + 1, l2, k3) < j6) {
/* 1801 */               this.H[(i1++)] = (i2 + 1 - i + 32 + (l2 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/*      */ 
/* 1804 */             if (b(enumskyblock, i2, l2 - 1, k3) < j6) {
/* 1805 */               this.H[(i1++)] = (i2 - i + 32 + (l2 - 1 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/*      */ 
/* 1808 */             if (b(enumskyblock, i2, l2 + 1, k3) < j6) {
/* 1809 */               this.H[(i1++)] = (i2 - i + 32 + (l2 + 1 - j + 32 << 6) + (k3 - k + 32 << 12));
/*      */             }
/*      */ 
/* 1812 */             if (b(enumskyblock, i2, l2, k3 - 1) < j6) {
/* 1813 */               this.H[(i1++)] = (i2 - i + 32 + (l2 - j + 32 << 6) + (k3 - 1 - k + 32 << 12));
/*      */             }
/*      */ 
/* 1816 */             if (b(enumskyblock, i2, l2, k3 + 1) < j6)
/* 1817 */               this.H[(i1++)] = (i2 - i + 32 + (l2 - j + 32 << 6) + (k3 + 1 - k + 32 << 12));
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean a(boolean flag)
/*      */   {
/* 1827 */     int i = this.N.size();
/* 1828 */     if (i != this.O.size()) {
/* 1829 */       throw new IllegalStateException("TickNextTick list out of synch");
/*      */     }
/* 1831 */     if (i > 1000) {
/* 1832 */       i = 1000;
/*      */     }
/* 1834 */     for (int j = 0; j < i; j++) {
/* 1835 */       jm nextticklistentry = (jm)this.N.first();
/* 1836 */       if ((!flag) && (nextticklistentry.e > this.C.f())) {
/*      */         break;
/*      */       }
/* 1839 */       this.N.remove(nextticklistentry);
/* 1840 */       this.O.remove(nextticklistentry);
/* 1841 */       byte byte0 = 8;
/* 1842 */       if (b(nextticklistentry.a - byte0, nextticklistentry.b - byte0, nextticklistentry.c - byte0, nextticklistentry.a + byte0, nextticklistentry.b + byte0, nextticklistentry.c + byte0))
/*      */       {
/* 1847 */         int k = a(nextticklistentry.a, nextticklistentry.b, nextticklistentry.c);
/* 1848 */         if ((k == nextticklistentry.d) && (k > 0)) {
/* 1849 */           lr.m[k].a(this, nextticklistentry.a, nextticklistentry.b, nextticklistentry.c, this.w);
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/* 1854 */     return this.N.size() != 0;
/*      */   }
/*      */ 
/*      */   public void q(int i, int j, int k) {
/* 1858 */     byte byte0 = 16;
/* 1859 */     Random random = new Random();
/* 1860 */     for (int l = 0; l < 1000; l++) {
/* 1861 */       int i1 = i + this.w.nextInt(byte0) - this.w.nextInt(byte0);
/* 1862 */       int j1 = j + this.w.nextInt(byte0) - this.w.nextInt(byte0);
/* 1863 */       int k1 = k + this.w.nextInt(byte0) - this.w.nextInt(byte0);
/* 1864 */       int l1 = a(i1, j1, k1);
/* 1865 */       if ((this.w.nextInt(8) > j1 - getVoidFogY()) && (l1 == 0)) {
/* 1866 */         a("depthsuspend", i1 + this.w.nextFloat(), j1 + this.w.nextFloat(), k1 + this.w.nextFloat(), 0.0D, 0.0D, 0.0D);
/*      */       }
/*      */ 
/* 1869 */       if (l1 > 0)
/* 1870 */         lr.m[l1].b(this, i1, j1, k1, random);
/*      */     }
/*      */   }
/*      */ 
/*      */   public List b(kj entity, rp axisalignedbb)
/*      */   {
/* 1877 */     this.Y.clear();
/* 1878 */     int i = et.b((axisalignedbb.a - 2.0D) / 16.0D);
/* 1879 */     int j = et.b((axisalignedbb.d + 2.0D) / 16.0D);
/* 1880 */     int k = et.b((axisalignedbb.c - 2.0D) / 16.0D);
/* 1881 */     int l = et.b((axisalignedbb.f + 2.0D) / 16.0D);
/* 1882 */     int n1 = getLayer(et.b(axisalignedbb.b - 2.0D)).worldNum;
/* 1883 */     int n2 = getLayer(et.b(axisalignedbb.e + 2.0D)).worldNum;
/* 1884 */     for (int n = n1; n <= n2; n++) {
/* 1885 */       for (int i1 = i; i1 <= j; i1++) {
/* 1886 */         for (int j1 = k; j1 <= l; j1++) {
/* 1887 */           if (chunkExists(i1, j1, n)) {
/* 1888 */             getChunkFromChunkCoords(i1, j1, n).a(entity, axisalignedbb, this.Y);
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1895 */     return this.Y;
/*      */   }
/*      */ 
/*      */   public List a(Class class1, rp axisalignedbb) {
/* 1899 */     int i = et.b((axisalignedbb.a - 2.0D) / 16.0D);
/* 1900 */     int j = et.b((axisalignedbb.d + 2.0D) / 16.0D);
/* 1901 */     int k = et.b((axisalignedbb.c - 2.0D) / 16.0D);
/* 1902 */     int l = et.b((axisalignedbb.f + 2.0D) / 16.0D);
/* 1903 */     int n1 = getLayer(et.b(axisalignedbb.b - 2.0D)).worldNum;
/* 1904 */     int n2 = getLayer(et.b(axisalignedbb.e + 2.0D)).worldNum;
/* 1905 */     ArrayList arraylist = new ArrayList();
/* 1906 */     for (int n = n1; n <= n2; n++) {
/* 1907 */       for (int i1 = i; i1 <= j; i1++) {
/* 1908 */         for (int j1 = k; j1 <= l; j1++) {
/* 1909 */           if (chunkExists(i1, j1, n)) {
/* 1910 */             getChunkFromChunkCoords(i1, j1, n).a(class1, axisalignedbb, arraylist);
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1917 */     return arraylist;
/*      */   }
/*      */ 
/*      */   public void b(int i, int j, int k, ij tileentity) {
/* 1921 */     if (d(i, j, k)) {
/* 1922 */       getChunkFromBlockCoords(i, j, k).g();
/*      */     }
/* 1924 */     for (int l = 0; l < this.z.size(); l++)
/* 1925 */       ((yj)this.z.get(l)).a(i, j, k, tileentity);
/*      */   }
/*      */ 
/*      */   public void a(List list)
/*      */   {
/* 1931 */     for (int i = 0; i < list.size(); i++) {
/* 1932 */       kj entity = (kj)list.get(i);
/* 1933 */       if ((entity.ag) && (entity.chunkLayer == null))
/* 1934 */         entity.chunkLayer = getLayer((int)entity.p);
/*      */     }
/* 1936 */     this.g.addAll(list);
/* 1937 */     for (int i = 0; i < list.size(); i++)
/* 1938 */       c((kj)list.get(i));
/*      */   }
/*      */ 
/*      */   public void b(List list)
/*      */   {
/* 1943 */     this.M.addAll(list);
/*      */   }
/*      */ 
/*      */   public void q() {
/* 1947 */     for (rv layer : this.layers)
/* 1948 */       layer.q();
/*      */   }
/*      */ 
/*      */   public boolean k(int i, int j, int k, int l) {
/* 1952 */     int i1 = a(i, j, k);
/* 1953 */     if (i1 == 0) {
/* 1954 */       return false;
/*      */     }
/* 1956 */     return lr.m[i1].e(this, i, j, k, l);
/*      */   }
/*      */ 
/*      */   public boolean r(int i, int j, int k)
/*      */   {
/* 1961 */     if (k(i, j - 1, k, 0)) {
/* 1962 */       return true;
/*      */     }
/* 1964 */     if (k(i, j + 1, k, 1)) {
/* 1965 */       return true;
/*      */     }
/* 1967 */     if (k(i, j, k - 1, 2)) {
/* 1968 */       return true;
/*      */     }
/* 1970 */     if (k(i, j, k + 1, 3)) {
/* 1971 */       return true;
/*      */     }
/* 1973 */     if (k(i - 1, j, k, 4)) {
/* 1974 */       return true;
/*      */     }
/* 1976 */     return k(i + 1, j, k, 5);
/*      */   }
/*      */ 
/*      */   public boolean l(int i, int j, int k, int l) {
/* 1980 */     if (h(i, j, k)) {
/* 1981 */       return r(i, j, k);
/*      */     }
/* 1983 */     int i1 = a(i, j, k);
/* 1984 */     if (i1 == 0) {
/* 1985 */       return false;
/*      */     }
/* 1987 */     return lr.m[i1].b(this, i, j, k, l);
/*      */   }
/*      */ 
/*      */   public boolean s(int i, int j, int k)
/*      */   {
/* 1992 */     if (l(i, j - 1, k, 0)) {
/* 1993 */       return true;
/*      */     }
/* 1995 */     if (l(i, j + 1, k, 1)) {
/* 1996 */       return true;
/*      */     }
/* 1998 */     if (l(i, j, k - 1, 2)) {
/* 1999 */       return true;
/*      */     }
/* 2001 */     if (l(i, j, k + 1, 3)) {
/* 2002 */       return true;
/*      */     }
/* 2004 */     if (l(i - 1, j, k, 4)) {
/* 2005 */       return true;
/*      */     }
/* 2007 */     return l(i + 1, j, k, 5);
/*      */   }
/*      */ 
/*      */   public sz a(kj entity, double d) {
/* 2011 */     return a(entity.o, entity.p, entity.q, d);
/*      */   }
/*      */ 
/*      */   public sz a(double d, double d1, double d2, double d3) {
/* 2015 */     double d4 = -1.0D;
/* 2016 */     sz entityplayer = null;
/* 2017 */     for (int i = 0; i < this.i.size(); i++) {
/* 2018 */       sz entityplayer1 = (sz)this.i.get(i);
/* 2019 */       double d5 = entityplayer1.f(d, d1, d2);
/* 2020 */       if (((d3 < 0.0D) || (d5 < d3 * d3)) && ((d4 == -1.0D) || (d5 < d4))) {
/* 2021 */         d4 = d5;
/* 2022 */         entityplayer = entityplayer1;
/*      */       }
/*      */     }
/*      */ 
/* 2026 */     return entityplayer;
/*      */   }
/*      */ 
/*      */   public sz a(String s) {
/* 2030 */     for (int i = 0; i < this.i.size(); i++) {
/* 2031 */       if (s.equals(((sz)this.i.get(i)).aD)) {
/* 2032 */         return (sz)this.i.get(i);
/*      */       }
/*      */     }
/*      */ 
/* 2036 */     return null;
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, int l, int i1, int j1, byte[] abyte0) {
/* 2040 */     int n1 = getLayer(j).worldNum;
/* 2041 */     int n2 = getLayer(j + i1 - 1).worldNum;
/* 2042 */     int pos = 0;
/* 2043 */     for (int n = n1; n <= n2; n++)
/*      */     {
/* 2045 */       int from = j; int to = j + i1;
/* 2046 */       from = Math.max(from - this.layers[n].shiftY, 0);
/* 2047 */       to = Math.min(to - this.layers[n].shiftY, this.layers[n].getWorldHeight());
/* 2048 */       pos = this.layers[n].setChunkDataFrom(i, from, k, l, to - from, j1, abyte0, pos);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void g() {
/*      */   }
/*      */ 
/*      */   public void r() {
/* 2056 */     this.B.b();
/*      */   }
/*      */ 
/*      */   public void a(long l) {
/* 2060 */     this.C.a(l);
/*      */   }
/*      */ 
/*      */   public long s() {
/* 2064 */     return this.C.b();
/*      */   }
/*      */ 
/*      */   public long t() {
/* 2068 */     return this.C.f();
/*      */   }
/*      */ 
/*      */   public ps u() {
/* 2072 */     return new ps(this.C.c(), this.C.d(), this.C.e());
/*      */   }
/*      */ 
/*      */   public void a(ps chunkcoordinates) {
/* 2076 */     this.C.a(chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c);
/*      */   }
/*      */ 
/*      */   public void g(kj entity) {
/* 2080 */     int i = et.b(entity.o / 16.0D);
/* 2081 */     int j = et.b(entity.q / 16.0D);
/* 2082 */     int n1 = getLayer((int)entity.p - 16).worldNum;
/* 2083 */     int n2 = getLayer((int)entity.p + 16).worldNum;
/* 2084 */     byte byte0 = 2;
/* 2085 */     for (int n = n1; n <= n2; n++) {
/* 2086 */       for (int k = i - byte0; k <= i + byte0; k++) {
/* 2087 */         for (int l = j - byte0; l <= j + byte0; l++) {
/* 2088 */           getChunkFromChunkCoords(k, l, n);
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/* 2093 */     entity.chunkLayer = getLayer((int)entity.p);
/* 2094 */     this.g.add(entity);
/*      */   }
/*      */ 
/*      */   public boolean a(sz entityplayer, int i, int j, int k) {
/* 2098 */     return true;
/*      */   }
/*      */ 
/*      */   public void a(kj entity, byte byte0) {
/*      */   }
/*      */ 
/*      */   public void v() {
/* 2105 */     this.g.removeAll(this.M);
/* 2106 */     for (int i = 0; i < this.M.size(); i++) {
/* 2107 */       kj entity = (kj)this.M.get(i);
/* 2108 */       int l = entity.ah;
/* 2109 */       int j1 = entity.aj;
/* 2110 */       rv layer = entity.chunkLayer;
/* 2111 */       if ((entity.ag) && (chunkExists(l, j1, layer))) {
/* 2112 */         getChunkFromChunkCoords(l, j1, layer).b(entity);
/*      */       }
/* 2114 */       if ((entity instanceof wd)) {
/* 2115 */         layer.g.remove(entity);
/*      */       }
/*      */     }
/*      */ 
/* 2119 */     for (int j = 0; j < this.M.size(); j++) {
/* 2120 */       d((kj)this.M.get(j));
/*      */     }
/*      */ 
/* 2123 */     this.M.clear();
/* 2124 */     for (Iterator it = this.g.iterator(); it.hasNext(); ) {
/* 2125 */       kj entity1 = (kj)it.next();
/* 2126 */       if (entity1.j != null) {
/* 2127 */         if ((entity1.j.G) || (entity1.j.i != entity1))
/*      */         {
/* 2130 */           entity1.j.i = null;
/* 2131 */           entity1.j = null;
/*      */         }
/* 2133 */       } else if (entity1.G)
/*      */       {
/* 2136 */         int i1 = entity1.ah;
/* 2137 */         int k1 = entity1.aj;
/* 2138 */         rv layer = entity1.chunkLayer;
/* 2139 */         if ((entity1.ag) && (chunkExists(i1, k1, layer))) {
/* 2140 */           getChunkFromChunkCoords(i1, k1, layer).b(entity1);
/*      */         }
/* 2142 */         it.remove();
/* 2143 */         d(entity1);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public bf w() {
/* 2149 */     return this.A;
/*      */   }
/*      */ 
/*      */   public void e(int i, int j, int k, int l, int i1) {
/* 2153 */     int j1 = a(i, j, k);
/* 2154 */     if (j1 > 0)
/* 2155 */       lr.m[j1].a(this, i, j, k, l, i1);
/*      */   }
/*      */ 
/*      */   public rl x()
/*      */   {
/* 2160 */     return this.C;
/*      */   }
/*      */ 
/*      */   public void y() {
/* 2164 */     this.T = (!this.i.isEmpty());
/* 2165 */     Iterator iterator = this.i.iterator();
/*      */ 
/* 2167 */     while (iterator.hasNext())
/*      */     {
/* 2170 */       sz entityplayer = (sz)iterator.next();
/* 2171 */       if (!entityplayer.an())
/*      */       {
/* 2174 */         this.T = false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void z() {
/* 2180 */     this.T = false;
/* 2181 */     Iterator iterator = this.i.iterator();
/*      */ 
/* 2183 */     while (iterator.hasNext())
/*      */     {
/* 2186 */       sz entityplayer = (sz)iterator.next();
/* 2187 */       if (entityplayer.an()) {
/* 2188 */         entityplayer.a(false, false, true);
/*      */       }
/*      */     }
/* 2191 */     for (rv layer : this.layers)
/* 2192 */       layer.G();
/*      */   }
/*      */ 
/*      */   public boolean A() {
/* 2196 */     if ((this.T) && (!this.I)) {
/* 2197 */       for (Iterator iterator = this.i.iterator(); iterator.hasNext(); ) {
/* 2198 */         sz entityplayer = (sz)iterator.next();
/* 2199 */         if (!entityplayer.ao()) {
/* 2200 */           return false;
/*      */         }
/*      */       }
/*      */ 
/* 2204 */       return true;
/*      */     }
/* 2206 */     return false;
/*      */   }
/*      */ 
/*      */   public float h(float f)
/*      */   {
/* 2211 */     return this.primaryWorld.h(f);
/*      */   }
/*      */ 
/*      */   public float i(float f) {
/* 2215 */     return this.primaryWorld.i(f);
/*      */   }
/*      */ 
/*      */   public void j(float f) {
/* 2219 */     this.primaryWorld.j(f);
/*      */   }
/*      */ 
/*      */   public boolean B() {
/* 2223 */     return this.primaryWorld.B();
/*      */   }
/*      */ 
/*      */   public boolean C() {
/* 2227 */     return this.primaryWorld.C();
/*      */   }
/*      */ 
/*      */   public boolean t(int i, int j, int k) {
/* 2231 */     rv layer = getLayer(j);
/* 2232 */     return layer.t(i, j - layer.shiftY, k);
/*      */   }
/*      */ 
/*      */   public void a(String s, tl mapdatabase) {
/* 2236 */     this.E.a(s, mapdatabase);
/*      */   }
/*      */ 
/*      */   public tl a(Class class1, String s) {
/* 2240 */     return this.E.a(class1, s);
/*      */   }
/*      */ 
/*      */   public int b(String s) {
/* 2244 */     return this.E.a(s);
/*      */   }
/*      */ 
/*      */   public void f(int i, int j, int k, int l, int i1) {
/* 2248 */     a(null, i, j, k, l, i1);
/*      */   }
/*      */ 
/*      */   public void a(sz entityplayer, int i, int j, int k, int l, int i1) {
/* 2252 */     for (int j1 = 0; j1 < this.z.size(); j1++)
/* 2253 */       ((yj)this.z.get(j1)).a(entityplayer, i, j, k, l, i1);
/*      */   }
/*      */ 
/*      */   public int b()
/*      */   {
/* 2259 */     return getWorldHeight();
/*      */   }
/*      */ 
/*      */   public Random u(int i, int j, int k) {
/* 2263 */     long l = i * 341873128712L + j * 132897987541L + x().b() + k;
/* 2264 */     this.w.setSeed(l);
/* 2265 */     return this.w;
/*      */   }
/*      */ 
/*      */   public boolean D() {
/* 2269 */     return false;
/*      */   }
/*      */ 
/*      */   public void a(rf enumskyblock, int i, int j, int k, int l, int i1, int j1) {
/*      */   }
/*      */ 
/*      */   static {
/* 2276 */     ExtendedWorldProvider.addToStack(new ExtendedWorldProviderWithLayers());
/*      */   }
/*      */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     WorldWithLayers
 * JD-Core Version:    0.6.2
 */