/*     */ public class WorldWithLayersClientNet extends gx
/*     */ {
/*     */   WorldWithLayersClient client;
/*     */ 
/*     */   public WorldWithLayersClientNet(WorldWithLayersClient client)
/*     */   {
/*  21 */     super(client.primaryWorld, client.primaryWorld.y, client.primaryWorld.C, client.sendQueue, client.v);
/*  22 */     this.parentWorld = client;
/*  23 */     this.client = client;
/*  24 */     this.C = client.C;
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, int k, int l, int i1, int j1)
/*     */   {
/*  29 */     this.client.invalidateBlockReceiveRegion(i, j, k, l, i1, j1);
/*     */   }
/*     */ 
/*     */   protected bf d()
/*     */   {
/*  34 */     return null;
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, boolean flag)
/*     */   {
/*  39 */     int worldNum = ((i >> 23) + 1 >> 1) - 1;
/*  40 */     i = i << 8 >> 8;
/*  41 */     this.client.doPreChunk(i, j, worldNum, flag);
/*     */   }
/*     */ 
/*     */   public vy c(int i, int j)
/*     */   {
/*  46 */     int worldNum = ((i >> 23) + 1 >> 1) - 1;
/*  47 */     i = i << 8 >> 8;
/*  48 */     return this.client.getChunkFromChunkCoords(i, j, worldNum);
/*     */   }
/*     */ 
/*     */   public void c(int i, int j, int k, int l, int i1, int j1) {
/*  52 */     this.client.c(i, j, k, l, i1, j1);
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, int k, int l, int i1, int j1, byte[] abyte0)
/*     */   {
/*  57 */     this.client.a(i, j, k, l, i1, j1, abyte0);
/*     */   }
/*     */ 
/*     */   public boolean c(int i, int j, int k, int l, int i1)
/*     */   {
/*  62 */     int worldNum = ((i >> 23) + 1 >> 1) - 1;
/*  63 */     if (worldNum != -1)
/*     */     {
/*  65 */       i = i << 8 >> 8;
/*  66 */       j += this.client.layers[worldNum].shiftY;
/*     */     }
/*  68 */     return this.client.setBlockAndMetadataAndInvalidate(i, j, k, l, i1);
/*     */   }
/*     */ 
/*     */   public boolean e(kj entity)
/*     */   {
/*  73 */     return this.client.e(entity);
/*     */   }
/*     */ 
/*     */   public boolean a(kj entity)
/*     */   {
/*  78 */     return this.client.a(entity);
/*     */   }
/*     */ 
/*     */   public void b(kj entity)
/*     */   {
/*  83 */     this.client.b(entity);
/*     */   }
/*     */ 
/*     */   public void a(int i, kj entity)
/*     */   {
/*  88 */     this.client.func_712_a(i, entity);
/*     */   }
/*     */ 
/*     */   public kj a(int i)
/*     */   {
/*  93 */     return this.client.func_709_b(i);
/*     */   }
/*     */ 
/*     */   public kj b(int i)
/*     */   {
/*  98 */     return this.client.removeEntityFromWorld(i);
/*     */   }
/*     */ 
/*     */   public void a(kj entity, String s, float f, float f1)
/*     */   {
/* 103 */     this.client.a(entity, s, f, f1);
/*     */   }
/*     */ 
/*     */   public boolean c(int i, int j, int k, int l)
/*     */   {
/* 108 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public boolean b(int i, int j, int k, int l, int i1)
/*     */   {
/* 113 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public boolean d(int i, int j, int k, int l)
/*     */   {
/* 118 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public void g()
/*     */   {
/* 123 */     this.client.g();
/*     */   }
/*     */ 
/*     */   protected void h()
/*     */   {
/* 128 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public void j(float f)
/*     */   {
/* 133 */     this.client.j(f);
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     WorldWithLayersClientNet
 * JD-Core Version:    0.6.2
 */