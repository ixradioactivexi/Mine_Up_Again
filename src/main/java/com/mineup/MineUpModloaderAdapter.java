/*    */ import java.io.PrintStream;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class MineUpModloaderAdapter
/*    */ {
/*    */   static MineUpModloaderAdapter instance;
/*    */ 
/*    */   public static MineUpModloaderAdapter get()
/*    */   {
/* 10 */     if (instance == null) {
/* 11 */       instance = new MineUpModloaderAdapter();
/*    */       try {
/* 13 */         if (Class.forName("ModLoaderMp") != null) {
/* 14 */           instance = new MineUpModloaderAdapterReal();
/* 15 */           System.out.println("Mine Up mod has found ModLoader");
/*    */         }
/*    */       } catch (ClassNotFoundException ignored) {
/* 18 */         System.out.println("Mine Up mod has not found Modloader");
/*    */       }
/*    */     }
/* 21 */     return instance;
/*    */   }
/*    */ 
/*    */   public NetClientHandlerEntity handleNetClientHandlerEntities(int i) {
/* 25 */     return null;
/*    */   }
/*    */ 
/*    */   public void Log(String s) {
/* 29 */     System.out.println(s);
/*    */   }
/*    */ 
/*    */   public void populateChunk(bf ichunkprovider, int i, int j, rv world)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void init()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void handleGUI(ey packet100openwindow)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void addAllRenderers(Map map)
/*    */   {
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     MineUpModloaderAdapter
 * JD-Core Version:    0.6.2
 */