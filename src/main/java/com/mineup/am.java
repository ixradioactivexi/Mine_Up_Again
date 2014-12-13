/*    */ public class am extends acz
/*    */ {
/*    */   public void a()
/*    */   {
/* 22 */     this.b = new eb(vh.k, 0.5F, 0.0F);
/* 23 */     this.g = 1;
/*    */   }
/*    */ 
/*    */   public bf b()
/*    */   {
/* 28 */     return new fa(this.a, this.a.s());
/*    */   }
/*    */ 
/*    */   public float a(long l, float f)
/*    */   {
/* 33 */     return super.a(l, f);
/*    */   }
/*    */ 
/*    */   public float[] a(float f, float f1)
/*    */   {
/* 39 */     return null;
/*    */   }
/*    */ 
/*    */   protected void e()
/*    */   {
/* 44 */     float f = 0.0F;
/* 45 */     for (int i = 0; i <= 15; i++)
/*    */     {
/* 47 */       float f1 = (1.0F - i / 15.0F) / 2.0F;
/* 48 */       this.f[i] = ((1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f);
/*    */     }
/*    */   }
/*    */ 
/*    */   public ax b(float f, float f1)
/*    */   {
/* 54 */     int i = 8421536;
/* 55 */     float f2 = et.b(f * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 56 */     if (f2 < 0.0F)
/*    */     {
/* 58 */       f2 = 0.0F;
/*    */     }
/* 60 */     if (f2 > 1.0F)
/*    */     {
/* 62 */       f2 = 1.0F;
/*    */     }
/* 64 */     float f3 = (i >> 16 & 0xFF) / 255.0F;
/* 65 */     float f4 = (i >> 8 & 0xFF) / 255.0F;
/* 66 */     float f5 = (i & 0xFF) / 255.0F;
/* 67 */     f3 *= (f2 * 0.94F + 0.06F);
/* 68 */     f4 *= (f2 * 0.94F + 0.06F);
/* 69 */     f5 *= (f2 * 0.91F + 0.09F);
/* 70 */     return ax.b(f3, f4, f5);
/*    */   }
/*    */ 
/*    */   public boolean c()
/*    */   {
/* 75 */     return false;
/*    */   }
/*    */ 
/*    */   public boolean a(int i, int j)
/*    */   {
/* 80 */     int k = this.a.a(i, j);
/* 81 */     if (k == 0)
/*    */     {
/* 83 */       return false;
/*    */     }
/*    */ 
/* 86 */     return lr.m[k].bN.c();
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     am
 * JD-Core Version:    0.6.2
 */