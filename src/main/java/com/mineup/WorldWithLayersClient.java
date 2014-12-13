/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class WorldWithLayersClient extends WorldWithLayers
/*     */ {
/*     */   private LinkedList blocksToReceive;
/*     */   protected wt sendQueue;
/*     */   private vc entityHashSet;
/*     */   private Set entityList;
/*     */   private Set entitySpawnQueue;
/*     */ 
/*     */   public rv createChildWorld(rv world, String worldType, rl info)
/*     */   {
/*  20 */     acz provider = ExtendedWorldProvider.getProviderForWorldType(worldType);
/*  21 */     if (provider == null)
/*  22 */       provider = new js();
/*  23 */     return new gx(world, provider, info, this.sendQueue, this.v);
/*     */   }
/*     */ 
/*     */   public WorldWithLayersClient(wt netclienthandler, rv world, int dimension, int j)
/*     */   {
/*  29 */     super(world, dimension);
/*  30 */     this.blocksToReceive = new LinkedList();
/*  31 */     this.entityHashSet = new vc();
/*  32 */     this.entityList = new HashSet();
/*  33 */     this.entitySpawnQueue = new HashSet();
/*  34 */     this.sendQueue = netclienthandler;
/*  35 */     this.v = j;
/*  36 */     a(new ps(8, 64, 8));
/*  37 */     for (rv layer : this.layers)
/*  38 */       layer.E = netclienthandler.b;
/*  39 */     this.E = netclienthandler.b;
/*     */   }
/*     */ 
/*     */   public void c()
/*     */   {
/*  44 */     a(t() + 1L);
/*  45 */     for (int i = 0; (i < 10) && (!this.entitySpawnQueue.isEmpty()); i++)
/*     */     {
/*  47 */       kj entity = (kj)this.entitySpawnQueue.iterator().next();
/*  48 */       if (!this.g.contains(entity))
/*     */       {
/*  50 */         a(entity);
/*     */       }
/*     */     }
/*     */ 
/*  54 */     this.sendQueue.b();
/*     */ 
/*  68 */     for (int j = 0; j < this.blocksToReceive.size(); j++)
/*     */     {
/*  70 */       ky worldblockpositiontype = (ky)this.blocksToReceive.get(j);
/*  71 */       if (--worldblockpositiontype.d == 0)
/*     */       {
/*  73 */         super.b(worldblockpositiontype.a, worldblockpositiontype.b, worldblockpositiontype.c, worldblockpositiontype.e, worldblockpositiontype.f);
/*  74 */         super.j(worldblockpositiontype.a, worldblockpositiontype.b, worldblockpositiontype.c);
/*  75 */         this.blocksToReceive.remove(j--);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void invalidateBlockReceiveRegion(int i, int j, int k, int l, int i1, int j1)
/*     */   {
/*  94 */     for (int k1 = 0; k1 < this.blocksToReceive.size(); k1++)
/*     */     {
/*  96 */       ky worldblockpositiontype = (ky)this.blocksToReceive.get(k1);
/*  97 */       if ((worldblockpositiontype.a >= i) && (worldblockpositiontype.b >= j) && (worldblockpositiontype.c >= k) && (worldblockpositiontype.a <= l) && (worldblockpositiontype.b <= i1) && (worldblockpositiontype.c <= j1))
/*     */       {
/*  99 */         this.blocksToReceive.remove(k1--);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected bf d()
/*     */   {
/* 107 */     return null;
/*     */   }
/*     */ 
/*     */   public void e()
/*     */   {
/* 112 */     a(new ps(8, 64, 8));
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
/* 125 */     return false;
/*     */   }
/*     */ 
/*     */   public void doPreChunk(int i, int j, int worldNum, boolean flag)
/*     */   {
/* 130 */     if ((worldNum < 0) || (worldNum >= this.layers.length))
/* 131 */       return;
/* 132 */     if (flag)
/*     */     {
/* 134 */       ((gx)this.layers[worldNum]).O.c(i, j);
/*     */     }
/*     */     else {
/* 137 */       ((gx)this.layers[worldNum]).O.d(i, j);
/*     */     }
/* 139 */     if (!flag)
/*     */     {
/* 141 */       c(i * 16, this.layers[worldNum].shiftY, j * 16, i * 16 + 15, this.layers[worldNum].shiftY + 128, j * 16 + 15);
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean a(kj entity)
/*     */   {
/* 147 */     boolean flag = super.a(entity);
/* 148 */     this.entityList.add(entity);
/* 149 */     if (!flag)
/*     */     {
/* 151 */       this.entitySpawnQueue.add(entity);
/*     */     }
/* 153 */     return flag;
/*     */   }
/*     */ 
/*     */   public void b(kj entity)
/*     */   {
/* 158 */     super.b(entity);
/* 159 */     this.entityList.remove(entity);
/*     */   }
/*     */ 
/*     */   protected void c(kj entity)
/*     */   {
/* 164 */     super.c(entity);
/* 165 */     if (this.entitySpawnQueue.contains(entity))
/*     */     {
/* 167 */       this.entitySpawnQueue.remove(entity);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void d(kj entity)
/*     */   {
/* 173 */     super.d(entity);
/* 174 */     if (this.entityList.contains(entity))
/*     */     {
/* 176 */       this.entitySpawnQueue.add(entity);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void func_712_a(int i, kj entity)
/*     */   {
/* 182 */     kj entity1 = func_709_b(i);
/* 183 */     if (entity1 != null)
/*     */     {
/* 185 */       b(entity1);
/*     */     }
/* 187 */     this.entityList.add(entity);
/* 188 */     entity.f = i;
/* 189 */     if (!a(entity))
/*     */     {
/* 191 */       this.entitySpawnQueue.add(entity);
/*     */     }
/* 193 */     this.entityHashSet.a(i, entity);
/*     */   }
/*     */ 
/*     */   public kj func_709_b(int i)
/*     */   {
/* 198 */     return (kj)this.entityHashSet.a(i);
/*     */   }
/*     */ 
/*     */   public kj removeEntityFromWorld(int i)
/*     */   {
/* 203 */     kj entity = (kj)this.entityHashSet.d(i);
/* 204 */     if (entity != null)
/*     */     {
/* 206 */       this.entityList.remove(entity);
/* 207 */       b(entity);
/*     */     }
/* 209 */     return entity;
/*     */   }
/*     */ 
/*     */   public boolean c(int i, int j, int k, int l)
/*     */   {
/* 214 */     int i1 = a(i, j, k);
/* 215 */     int j1 = e(i, j, k);
/* 216 */     if (super.c(i, j, k, l))
/*     */     {
/* 218 */       synchronized (this.blocksToReceive) {
/* 219 */         this.blocksToReceive.add(new ky(this, i, j, k, i1, j1));
/*     */       }
/* 221 */       return true;
/*     */     }
/*     */ 
/* 224 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b(int i, int j, int k, int l, int i1)
/*     */   {
/* 230 */     int j1 = a(i, j, k);
/* 231 */     int k1 = e(i, j, k);
/* 232 */     if (super.b(i, j, k, l, i1))
/*     */     {
/* 234 */       synchronized (this.blocksToReceive) {
/* 235 */         this.blocksToReceive.add(new ky(this, i, j, k, j1, k1));
/*     */       }
/* 237 */       return true;
/*     */     }
/*     */ 
/* 240 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean d(int i, int j, int k, int l)
/*     */   {
/* 246 */     int i1 = a(i, j, k);
/* 247 */     int j1 = e(i, j, k);
/* 248 */     if (super.d(i, j, k, l))
/*     */     {
/* 250 */       synchronized (this.blocksToReceive) {
/* 251 */         this.blocksToReceive.add(new ky(this, i, j, k, i1, j1));
/*     */       }
/* 253 */       return true;
/*     */     }
/*     */ 
/* 256 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean setBlockAndMetadataAndInvalidate(int i, int j, int k, int l, int i1)
/*     */   {
/* 262 */     invalidateBlockReceiveRegion(i, j, k, i, j, k);
/* 263 */     if (super.b(i, j, k, l, i1))
/*     */     {
/* 265 */       h(i, j, k, l);
/* 266 */       return true;
/*     */     }
/*     */ 
/* 269 */     return false;
/*     */   }
/*     */ 
/*     */   public void g()
/*     */   {
/* 275 */     this.sendQueue.b(new adw("Quitting"));
/*     */   }
/*     */ 
/*     */   protected void h()
/*     */   {
/* 280 */     for (rv layer : this.layers)
/* 281 */       layer.h();
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     WorldWithLayersClient
 * JD-Core Version:    0.6.2
 */