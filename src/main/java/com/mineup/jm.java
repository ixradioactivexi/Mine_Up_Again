/*    */ public class jm
/*    */   implements Comparable
/*    */ {
/* 70 */   private static long f = 0L;
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public long e;
/*    */   private long g;
/*    */ 
/*    */   public jm(int i, int j, int k, int l)
/*    */   {
/* 13 */     setParameters(i, j, k, l);
/*    */   }
/*    */ 
/*    */   public void setParameters(int i, int j, int k, int l)
/*    */   {
/* 18 */     this.g = (f++);
/* 19 */     this.a = i;
/* 20 */     this.b = j;
/* 21 */     this.c = k;
/* 22 */     this.d = l;
/*    */   }
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 27 */     if ((obj instanceof jm))
/*    */     {
/* 29 */       jm nextticklistentry = (jm)obj;
/* 30 */       return (this.a == nextticklistentry.a) && (this.b == nextticklistentry.b) && (this.c == nextticklistentry.c) && (this.d == nextticklistentry.d);
/*    */     }
/*    */ 
/* 33 */     return false;
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 39 */     return (this.a * 1024 * 1024 + this.c * 1024 + this.b) * 256 + this.d;
/*    */   }
/*    */ 
/*    */   public jm a(long l)
/*    */   {
/* 44 */     this.e = l;
/* 45 */     return this;
/*    */   }
/*    */ 
/*    */   public int a(jm nextticklistentry)
/*    */   {
/* 50 */     if (this.e < nextticklistentry.e)
/*    */     {
/* 52 */       return -1;
/*    */     }
/* 54 */     if (this.e > nextticklistentry.e)
/*    */     {
/* 56 */       return 1;
/*    */     }
/* 58 */     if (this.g < nextticklistentry.g)
/*    */     {
/* 60 */       return -1;
/*    */     }
/* 62 */     return this.g <= nextticklistentry.g ? 0 : 1;
/*    */   }
/*    */ 
/*    */   public int compareTo(Object obj)
/*    */   {
/* 67 */     return a((jm)obj);
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     jm
 * JD-Core Version:    0.6.2
 */