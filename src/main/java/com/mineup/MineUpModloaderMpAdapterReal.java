/*    */ public class MineUpModloaderMpAdapterReal extends MineUpModloaderMpAdapter
/*    */ {
/*    */   public NetClientHandlerEntity handleNetClientHandlerEntities(int i)
/*    */   {
/*  9 */     return ModLoaderMp.HandleNetClientHandlerEntities(i);
/*    */   }
/*    */ 
/*    */   public void Log(String s)
/*    */   {
/* 14 */     ModLoaderMp.Log(s);
/*    */   }
/*    */ 
/*    */   public void init()
/*    */   {
/* 19 */     ModLoaderMp.Init();
/*    */   }
/*    */ 
/*    */   public void handleGUI(ey packet100openwindow)
/*    */   {
/* 24 */     ModLoaderMp.HandleGUI(packet100openwindow);
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     MineUpModloaderMpAdapterReal
 * JD-Core Version:    0.6.2
 */