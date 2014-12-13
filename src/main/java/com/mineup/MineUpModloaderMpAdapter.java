/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class MineUpModloaderMpAdapter
/*    */ {
/*    */   static MineUpModloaderMpAdapter instance;
/*    */ 
/*    */   public static MineUpModloaderMpAdapter get()
/*    */   {
/* 10 */     if (instance == null) {
/* 11 */       instance = new MineUpModloaderMpAdapter();
/*    */       try {
/* 13 */         if (Class.forName("ModLoaderMp") != null) {
/* 14 */           instance = new MineUpModloaderMpAdapterReal();
/* 15 */           System.out.println("Mine Up mod has found ModLoaderMp");
/*    */         }
/*    */       } catch (ClassNotFoundException ignored) {
/* 18 */         System.out.println("Mine Up mod has not found ModloaderMp");
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
/*    */   public void init()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void handleGUI(ey packet100openwindow)
/*    */   {
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     MineUpModloaderMpAdapter
 * JD-Core Version:    0.6.2
 */