/*     */ import java.io.PrintStream;
/*     */ 
/*     */ public class MineUpForgeAdapter
/*     */ {
/*     */   static MineUpForgeAdapter instance;
/*   6 */   static int modloaderMP = 0;
/*     */ 
/*     */   public static boolean detectModloader() {
/*   9 */     if (modloaderMP == 0)
/*     */       try
/*     */       {
/*  12 */         if (Class.forName("ModLoaderMP") != null)
/*  13 */           modloaderMP = 1;
/*     */         else
/*  15 */           modloaderMP = 2;
/*     */       } catch (ClassNotFoundException ignored) {
/*  17 */         modloaderMP = 2;
/*     */       }
/*  19 */     return modloaderMP == 1;
/*     */   }
/*     */ 
/*     */   public static MineUpForgeAdapter get() {
/*  23 */     if (instance == null) {
/*  24 */       instance = new MineUpForgeAdapter();
/*     */       try {
/*  26 */         if (Class.forName("forge.ForgeHooks") != null) {
/*  27 */           instance = new MineUpForgeAdapterReal();
/*  28 */           System.out.println("Mine Up mod has found The Forge");
/*     */         }
/*     */       } catch (ClassNotFoundException ignored) {
/*  31 */         System.out.println("Mine Up mod has not found The Forge");
/*     */       }
/*     */     }
/*  34 */     return instance;
/*     */   }
/*     */ 
/*     */   public void forgeHooksOnDestroyCurrentItem(sz player, ul stack)
/*     */   {
/*     */   }
/*     */ 
/*     */   public boolean forgeHooksClientOnBlockHighlight(i renderGlobal, sz entityplayer, ma objectMouseOver, int x, ul currentItem, float f) {
/*  42 */     return false;
/*     */   }
/*     */ 
/*     */   public void forgeHooksClientBeforeRenderPass(int i) {
/*     */   }
/*     */ 
/*     */   public void forgeHooksClientAfterRenderPass(int i) {
/*     */   }
/*     */ 
/*     */   public boolean forgeHooksClientCanRenderInPass(lr block, int i) {
/*  52 */     return true;
/*     */   }
/*     */ 
/*     */   public void forgeHooksClientBeforeBlockRender(lr block, qo renderblocks) {
/*     */   }
/*     */ 
/*     */   public void forgeHooksClientAfterBlockRender(lr block, qo renderblocks) {
/*     */   }
/*     */ 
/*     */   public boolean blockIsBlockBurning(lr block, rv world, int i, int j, int k) {
/*  62 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean blockIsAirBlock(lr block, rv world, int i, int j, int k) {
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */   public int blockGetLightValue(int i1, rv world, int i, int j, int k) {
/*  70 */     return lr.s[i1];
/*     */   }
/*     */ 
/*     */   public boolean blockIsBlockNormalCube(lr block, rv world, int i, int j, int k) {
/*  74 */     return (block.bN.j()) && (block.b());
/*     */   }
/*     */ 
/*     */   public boolean blockIsBlockReplaceable(lr block, rv world, int i, int j, int k) {
/*  78 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean blockIsBlockSolidOnSide(lr block, rv world, int i, int j, int k, int side) {
/*  82 */     return (block.bN.j()) && (block.b());
/*     */   }
/*     */ 
/*     */   public boolean blockIsLadder(lr block) {
/*  86 */     return block == lr.aG;
/*     */   }
/*     */ 
/*     */   public float itemStackGetStrVsBlock(sv item, ul ist, lr block, int md) {
/*  90 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   public int handleSpecialArmor(sz player, ul stack, int initialDamage, int i) {
/*  94 */     return 0;
/*     */   }
/*     */ 
/*     */   public int handleBlockOverride(lr block, rv worldObj, int x, int y, int z, int l) {
/*  98 */     return 0;
/*     */   }
/*     */ 
/*     */   public ij blockContainerGetBlockEntity(zt block, int i) {
/* 102 */     return block.m_();
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     MineUpForgeAdapter
 * JD-Core Version:    0.6.2
 */