/*    */ import java.util.List;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ public class GuiButtonList extends vj
/*    */ {
/*    */   List<String> list;
/*    */   String value;
/*    */ 
/*    */   private int getNum(String s)
/*    */   {
/* 21 */     int x = this.list.indexOf(s);
/* 22 */     if (x == -1)
/* 23 */       x = 0;
/* 24 */     return x;
/*    */   }
/*    */ 
/*    */   public String getValue() {
/* 28 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void switchToNext() {
/* 32 */     int k = getNum(this.value);
/* 33 */     k = (k + 1) % this.list.size();
/* 34 */     this.value = ((String)this.list.get(k));
/* 35 */     changeDisplayName();
/*    */   }
/*    */ 
/*    */   private void changeDisplayName() {
/* 39 */     this.f = this.value;
/*    */   }
/*    */ 
/*    */   public GuiButtonList(int i, int j, int k, String s, List<String> list) {
/* 43 */     this(i, j, k, 200, 20, s, list);
/*    */   }
/*    */ 
/*    */   public GuiButtonList(int i, int j, int k, int l, int i1, String s, List<String> list) {
/* 47 */     super(i, j, k, l, i1, s);
/* 48 */     this.list = list;
/* 49 */     this.value = s;
/* 50 */     changeDisplayName();
/*    */   }
/*    */ 
/*    */   protected int a(boolean flag) {
/* 54 */     byte byte0 = 1;
/* 55 */     if (!this.h)
/* 56 */       byte0 = 0;
/* 57 */     else if (flag) {
/* 58 */       byte0 = 2;
/*    */     }
/* 60 */     return byte0;
/*    */   }
/*    */ 
/*    */   public void a(Minecraft minecraft, int i, int j) {
/* 64 */     if (!this.i) {
/* 65 */       return;
/*    */     }
/* 67 */     kh fontrenderer = minecraft.q;
/* 68 */     GL11.glBindTexture(3553, minecraft.p.b("/gui/gui.png"));
/* 69 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 70 */     boolean flag = (i >= this.c) && (j >= this.d) && (i < this.c + this.a) && (j < this.d + this.b);
/* 71 */     int k = a(flag);
/* 72 */     b(this.c, this.d, 0, 46 + k * 20, this.a / 2, this.b);
/* 73 */     b(this.c + this.a / 2, this.d, 200 - this.a / 2, 46 + k * 20, this.a / 2, this.b);
/* 74 */     b(minecraft, i, j);
/* 75 */     if (!this.h) {
/* 76 */       a(fontrenderer, this.f, this.c + this.a / 2, this.d + (this.b - 8) / 2, -6250336);
/*    */     }
/* 78 */     else if (flag) {
/* 79 */       a(fontrenderer, this.f, this.c + this.a / 2, this.d + (this.b - 8) / 2, 16777120);
/*    */     }
/*    */     else
/* 82 */       a(fontrenderer, this.f, this.c + this.a / 2, this.d + (this.b - 8) / 2, 14737632);
/*    */   }
/*    */ 
/*    */   protected void b(Minecraft minecraft, int i, int j)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void a(int i, int j)
/*    */   {
/*    */   }
/*    */ 
/*    */   public boolean c(Minecraft minecraft, int i, int j) {
/* 94 */     return (this.h) && (this.i) && (i >= this.c) && (j >= this.d) && (i < this.c + this.a) && (j < this.d + this.b);
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     GuiButtonList
 * JD-Core Version:    0.6.2
 */