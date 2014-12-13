/*    */ import forge.ArmorProperties;
/*    */ import forge.ForgeHooks;
/*    */ import forge.ForgeHooksClient;
/*    */ import forge.IOverrideReplace;
/*    */ import forge.ISpecialArmor;
/*    */ 
/*    */ public class MineUpForgeAdapterReal extends MineUpForgeAdapter
/*    */ {
/*    */   public void forgeHooksOnDestroyCurrentItem(sz player, ul stack)
/*    */   {
/*  8 */     ForgeHooks.onDestroyCurrentItem(player, stack);
/*    */   }
/*    */ 
/*    */   public boolean forgeHooksClientOnBlockHighlight(i renderGlobal, sz entityplayer, ma objectMouseOver, int x, ul currentItem, float f)
/*    */   {
/* 13 */     return ForgeHooksClient.onBlockHighlight(renderGlobal, entityplayer, objectMouseOver, x, currentItem, f);
/*    */   }
/*    */ 
/*    */   public void forgeHooksClientBeforeRenderPass(int i) {
/* 17 */     ForgeHooksClient.beforeRenderPass(i);
/*    */   }
/*    */ 
/*    */   public void forgeHooksClientAfterRenderPass(int i) {
/* 21 */     ForgeHooksClient.afterRenderPass(i);
/*    */   }
/*    */ 
/*    */   public boolean forgeHooksClientCanRenderInPass(lr block, int i) {
/* 25 */     return ForgeHooksClient.canRenderInPass(block, i);
/*    */   }
/*    */ 
/*    */   public void forgeHooksClientBeforeBlockRender(lr block, qo renderblocks) {
/* 29 */     ForgeHooksClient.beforeBlockRender(block, renderblocks);
/*    */   }
/*    */ 
/*    */   public void forgeHooksClientAfterBlockRender(lr block, qo renderblocks) {
/* 33 */     ForgeHooksClient.afterBlockRender(block, renderblocks);
/*    */   }
/*    */ 
/*    */   public boolean blockIsBlockBurning(lr block, rv world, int i, int j, int k) {
/* 37 */     return block.isBlockBurning(world, i, j, k);
/*    */   }
/*    */ 
/*    */   public boolean blockIsAirBlock(lr block, rv world, int i, int j, int k) {
/* 41 */     return block.isAirBlock(world, i, j, k);
/*    */   }
/*    */ 
/*    */   public int blockGetLightValue(int i1, rv world, int i, int j, int k) {
/* 45 */     return i1 == 0 ? 0 : lr.m[i1].getLightValue(world, i, j, k);
/*    */   }
/*    */ 
/*    */   public boolean blockIsBlockNormalCube(lr block, rv world, int i, int j, int k) {
/* 49 */     return block.isBlockNormalCube(world, i, j, k);
/*    */   }
/*    */ 
/*    */   public boolean blockIsBlockReplaceable(lr block, rv world, int i, int j, int k) {
/* 53 */     return block.isBlockReplaceable(world, i, j, k);
/*    */   }
/*    */ 
/*    */   public boolean blockIsBlockSolidOnSide(lr block, rv world, int i, int j, int k, int side) {
/* 57 */     return block.isBlockSolidOnSide(world, i, j, k, side);
/*    */   }
/*    */ 
/*    */   public boolean blockIsLadder(lr block) {
/* 61 */     return block.isLadder();
/*    */   }
/*    */ 
/*    */   public float itemStackGetStrVsBlock(sv item, ul ist, lr block, int md) {
/* 65 */     return item.getStrVsBlock(ist, block, md);
/*    */   }
/*    */ 
/*    */   public int handleSpecialArmor(sz player, ul stack, int initialDamage, int i) {
/* 69 */     if (stack == null)
/* 70 */       return 0;
/* 71 */     if (!(stack.a() instanceof ISpecialArmor))
/* 72 */       return 0;
/* 73 */     ISpecialArmor armor = (ISpecialArmor)stack.a();
/*    */ 
/* 75 */     ArmorProperties props = armor.getProperties(player, initialDamage, i);
/* 76 */     i = props.damageRemove << 1;
/* 77 */     if (!props.allowRegularComputation)
/* 78 */       i++;
/* 79 */     return i;
/*    */   }
/*    */ 
/*    */   public int handleBlockOverride(lr block, rv worldObj, int x, int y, int z, int l) {
/* 83 */     if ((block instanceof IOverrideReplace)) {
/* 84 */       IOverrideReplace iovr = (IOverrideReplace)block;
/* 85 */       if (!iovr.canReplaceBlock(worldObj, x, y, z, l)) {
/* 86 */         if (iovr.getReplacedSuccess()) {
/* 87 */           return 1;
/*    */         }
/* 89 */         return 2;
/*    */       }
/*    */     }
/* 91 */     return 0;
/*    */   }
/*    */ 
/*    */   public ij blockContainerGetBlockEntity(zt block, int i) {
/* 95 */     return block.getBlockEntity(i);
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     MineUpForgeAdapterReal
 * JD-Core Version:    0.6.2
 */