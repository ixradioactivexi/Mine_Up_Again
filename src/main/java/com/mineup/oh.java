/*    */ public class oh
/*    */   implements Comparable<oh>
/*    */ {
/*    */   public final int dist;
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int layerNum;
/*    */ 
/*    */   public oh(int i, int j)
/*    */   {
/* 13 */     this.a = i;
/* 14 */     this.b = j;
/* 15 */     this.layerNum = 0;
/* 16 */     this.dist = 0;
/*    */   }
/*    */ 
/*    */   public oh(int i, int j, int k)
/*    */   {
/* 21 */     this.a = i;
/* 22 */     this.b = j;
/* 23 */     this.layerNum = k;
/* 24 */     this.dist = 0;
/*    */   }
/*    */ 
/*    */   public oh(int i, int j, int k, int dist)
/*    */   {
/* 29 */     this.a = i;
/* 30 */     this.b = j;
/* 31 */     this.layerNum = k;
/* 32 */     this.dist = dist;
/*    */   }
/*    */ 
/*    */   public static long a(int i, int j)
/*    */   {
/* 37 */     long l = i;
/* 38 */     long l1 = j;
/* 39 */     return l & 0xFFFFFFFF | (l1 & 0xFFFFFFFF) << 32;
/*    */   }
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 44 */     long l = a(this.a, this.b);
/* 45 */     int i = (int)l;
/* 46 */     int j = (int)(l >> 32);
/*    */ 
/* 48 */     return (i * 237 + j) * 237 + this.layerNum;
/*    */   }
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 53 */     oh chunkcoordintpair = (oh)obj;
/* 54 */     return (chunkcoordintpair.a == this.a) && (chunkcoordintpair.b == this.b) && (chunkcoordintpair.layerNum == this.layerNum);
/*    */   }
/*    */ 
/*    */   public int compareTo(oh arg0)
/*    */   {
/* 64 */     return this.dist - arg0.dist;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     oh
 * JD-Core Version:    0.6.2
 */