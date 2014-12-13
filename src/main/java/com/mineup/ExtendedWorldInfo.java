/*    */ public class ExtendedWorldInfo extends rl
/*    */ {
/*    */   private WorldLayersInfo layersInfo;
/*    */ 
/*    */   public ExtendedWorldInfo(xb nbttagcompound)
/*    */   {
/*  7 */     super(nbttagcompound);
/*    */   }
/*    */ 
/*    */   public ExtendedWorldInfo(rl worldinfo) {
/* 11 */     super(worldinfo);
/*    */   }
/*    */ 
/*    */   public ExtendedWorldInfo(dx worldsettings, String s) {
/* 15 */     super(worldsettings, s);
/* 16 */     this.layersInfo = new WorldLayersInfo();
/* 17 */     this.layersInfo.copyFrom(worldsettings.getWorldLayers());
/*    */   }
/*    */ 
/*    */   public WorldLayersInfo getLayersInfo() {
/* 21 */     return this.layersInfo;
/*    */   }
/*    */ 
/*    */   public void setLayersInfo(WorldLayersInfo layersInfo) {
/* 25 */     this.layersInfo = layersInfo;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ExtendedWorldInfo
 * JD-Core Version:    0.6.2
 */