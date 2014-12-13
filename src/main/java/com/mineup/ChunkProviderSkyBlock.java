/*     */ import java.util.Random;
/*     */ 
/*     */ public class ChunkProviderSkyBlock
/*     */   implements bf
/*     */ {
/*     */   private Random rand;
/*     */   private rv worldObj;
/*     */ 
/*     */   public ChunkProviderSkyBlock(rv world, long l)
/*     */   {
/*  19 */     this.worldObj = world;
/*  20 */     this.rand = new Random(l);
/*     */   }
/*     */ 
/*     */   public vy c(int i, int j) {
/*  24 */     return b(i, j);
/*     */   }
/*     */ 
/*     */   public vy b(int i, int j) {
/*  28 */     this.rand.setSeed(i * 341873128712L + j * 132897987541L);
/*  29 */     this.worldObj.getClass();
/*  30 */     byte[] abyte0 = new byte[16 * this.worldObj.getWorldHeight() * 16];
/*  31 */     vy chunk = new vy(this.worldObj, abyte0, i, j);
/*  32 */     chunk.c();
/*  33 */     return chunk;
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j) {
/*  37 */     return true;
/*     */   }
/*     */ 
/*     */   public void a(bf ichunkprovider, int i, int j) {
/*  41 */     this.rand.setSeed(this.worldObj.s());
/*  42 */     long l1 = this.rand.nextLong() / 2L * 2L + 1L;
/*  43 */     long l2 = this.rand.nextLong() / 2L * 2L + 1L;
/*  44 */     this.rand.setSeed(i * l1 + j * l2 ^ this.worldObj.s());
/*     */ 
/*  46 */     if (this.rand.nextInt(200) == 1)
/*     */     {
/*  48 */       int w = 6 + this.rand.nextInt(5); int d = 6 + this.rand.nextInt(5); int h = 3 + this.rand.nextInt(3);
/*  49 */       int cx = w / 2 - 1 + this.rand.nextInt(3);
/*  50 */       int cz = d / 2 - 1 + this.rand.nextInt(3);
/*     */ 
/*  52 */       boolean tree = false;
/*  53 */       int x = this.rand.nextInt(16) + i * 16;
/*  54 */       int y = this.rand.nextInt(64) + 32;
/*  55 */       int z = this.rand.nextInt(16) + j * 16;
/*  56 */       vh biomegenbase = this.worldObj.a().a(x, z);
/*  57 */       for (int dx = 0; dx < w; dx++)
/*  58 */         for (int dz = 0; dz < d; dz++)
/*     */         {
/*  60 */           if (((dx >= cx ? 1 : 0) ^ (cx + 1 < w - cx ? 1 : 0)) != 0) { if (((dz >= cz ? 1 : 0) ^ (cz + 1 > d - cz ? 1 : 0)) != 0);
/*     */           } else
/*     */           {
/*  63 */             for (int dy = 0; dy > -h; dy--)
/*  64 */               this.worldObj.d(x + dx, y + dy, z + dz, dy == 0 ? lr.v.bA : lr.w.bA);
/*  65 */             if ((!tree) && (this.rand.nextInt(50) == 1))
/*     */             {
/*  67 */               if (biomegenbase.a(this.rand).a(this.worldObj, this.rand, x + dx, y + 1, z + dz)) tree = true;
/*     */             }
/*     */           }
/*     */         }
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean a(boolean flag, ny iprogressupdate)
/*     */   {
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean a() {
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean b() {
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */   public String c() {
/* 113 */     return "SkyBlock";
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ChunkProviderSkyBlock
 * JD-Core Version:    0.6.2
 */