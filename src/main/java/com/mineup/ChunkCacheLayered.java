/*     */ public class ChunkCacheLayered
/*     */   implements adg
/*     */ {
/*     */   cv[] chunks;
/*     */   WorldWithLayers world;
/*     */   rv mainLayer;
/*     */ 
/*     */   public ChunkCacheLayered(WorldWithLayers world, int i, int j, int k, int l, int i1, int j1)
/*     */   {
/*   9 */     world.getClass();
/*  10 */     this.world = world;
/*  11 */     this.chunks = new cv[world.layers.length];
/*     */ 
/*  13 */     int n1 = world.getLayer(j).worldNum;
/*  14 */     int n2 = world.getLayer(i1).worldNum;
/*     */ 
/*  16 */     if (world.getLayer(n1).shiftY + world.getLayer(n1).getWorldHeight() - j >= j - world.getLayer(n2).shiftY)
/*  17 */       this.mainLayer = world.getLayer(n1);
/*  18 */     else this.mainLayer = world.getLayer(n2);
/*     */ 
/*  20 */     for (int n = n1; n <= n2; n++)
/*  21 */       this.chunks[n] = new cv(world.layers[n], i, 0, k, l, 128, j1);
/*     */   }
/*     */ 
/*     */   public int a(int i, int j, int k)
/*     */   {
/*  26 */     rv layer = this.world.getLayer(j);
/*  27 */     if (this.chunks[layer.worldNum] == null)
/*  28 */       return 0;
/*  29 */     return this.chunks[layer.worldNum].a(i, j - layer.shiftY, k);
/*     */   }
/*     */ 
/*     */   public ij b(int i, int j, int k) {
/*  33 */     rv layer = this.world.getLayer(j);
/*  34 */     if (this.chunks[layer.worldNum] == null)
/*  35 */       return null;
/*  36 */     return this.chunks[layer.worldNum].b(i, j - layer.shiftY, k);
/*     */   }
/*     */ 
/*     */   public float a(int i, int j, int k, int l) {
/*  40 */     rv layer = this.world.getLayer(j);
/*  41 */     if (this.chunks[layer.worldNum] == null)
/*  42 */       return l;
/*  43 */     return this.chunks[layer.worldNum].a(i, j - layer.shiftY, k, l);
/*     */   }
/*     */ 
/*     */   public int b(int i, int j, int k, int l) {
/*  47 */     rv layer = this.world.getLayer(j);
/*  48 */     if (this.chunks[layer.worldNum] == null)
/*  49 */       return l;
/*  50 */     return this.chunks[layer.worldNum].b(i, j - layer.shiftY, k, l);
/*     */   }
/*     */ 
/*     */   public float c(int i, int j, int k) {
/*  54 */     rv layer = this.world.getLayer(j);
/*  55 */     return this.chunks[layer.worldNum].c(i, j - layer.shiftY, k);
/*     */   }
/*     */ 
/*     */   public int getLightValue(int i, int j, int k) {
/*  59 */     return getLightValueExt(i, j, k, true);
/*     */   }
/*     */ 
/*     */   public int getLightValueExt(int i, int j, int k, boolean flag) {
/*  63 */     rv layer = this.world.getLayer(j);
/*  64 */     return this.chunks[layer.worldNum].a(i, j - layer.shiftY, k, flag);
/*     */   }
/*     */ 
/*     */   public int e(int i, int j, int k) {
/*  68 */     rv layer = this.world.getLayer(j);
/*  69 */     return this.chunks[layer.worldNum].e(i, j - layer.shiftY, k);
/*     */   }
/*     */ 
/*     */   public wa f(int i, int j, int k) {
/*  73 */     int l = a(i, j, k);
/*  74 */     if (l == 0) {
/*  75 */       return wa.a;
/*     */     }
/*  77 */     return lr.m[l].bN;
/*     */   }
/*     */ 
/*     */   public nu a()
/*     */   {
/*  82 */     return this.mainLayer.a();
/*     */   }
/*     */ 
/*     */   public boolean g(int i, int j, int k) {
/*  86 */     lr block = lr.m[a(i, j, k)];
/*  87 */     if (block == null) {
/*  88 */       return false;
/*     */     }
/*  90 */     return block.a();
/*     */   }
/*     */ 
/*     */   public boolean h(int i, int j, int k)
/*     */   {
/*  95 */     lr block = lr.m[a(i, j, k)];
/*  96 */     if (block == null) {
/*  97 */       return false;
/*     */     }
/*  99 */     return (block.bN.c()) && (block.b());
/*     */   }
/*     */ 
/*     */   public boolean i(int i, int j, int k)
/*     */   {
/* 104 */     lr block = lr.m[a(i, j, k)];
/* 105 */     return block == null;
/*     */   }
/*     */ 
/*     */   public int getSkyBlockTypeBrightness(rf enumskyblock, int i, int j, int k) {
/* 109 */     rv layer = this.world.getLayer(j);
/* 110 */     return this.chunks[layer.worldNum].a(enumskyblock, i, j - layer.shiftY, k);
/*     */   }
/*     */ 
/*     */   public int getSpecialBlockBrightness(rf enumskyblock, int i, int j, int k) {
/* 114 */     rv layer = this.world.getLayer(j);
/* 115 */     return this.chunks[layer.worldNum].b(enumskyblock, i, j - layer.shiftY, k);
/*     */   }
/*     */ 
/*     */   public int b() {
/* 119 */     return this.world.getWorldHeight();
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ChunkCacheLayered
 * JD-Core Version:    0.6.2
 */