/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ 
/*    */ public class wp extends dd
/*    */ {
/*    */   public wp(File file, String s, boolean flag)
/*    */   {
/* 17 */     super(file, s, flag);
/*    */   }
/*    */ 
/*    */   public pl a(acz worldprovider) {
/* 21 */     File file = a();
/* 22 */     String s = worldprovider.getName();
/* 23 */     if ((s != null) && (!s.equals(""))) {
/* 24 */       file = new File(file, "DIM-" + s);
/* 25 */       file.mkdirs();
/*    */     }
/* 27 */     return new gd(file);
/*    */   }
/*    */ 
/*    */   public void a(rl worldinfo, List list) {
/* 31 */     worldinfo.d(19132);
/* 32 */     super.a(worldinfo, list);
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     wp
 * JD-Core Version:    0.6.2
 */