/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class fi extends vl
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */ 
/*    */   public fi()
/*    */   {
/*    */   }
/*    */ 
/*    */   public fi(int i, int j, int k, int l, int i1)
/*    */   {
/* 21 */     this.e = i;
/* 22 */     this.a = j;
/* 23 */     this.b = k;
/* 24 */     this.c = l;
/* 25 */     this.d = i1;
/*    */   }
/*    */ 
/*    */   public void a(DataInputStream datainputstream)
/*    */     throws IOException
/*    */   {
/* 31 */     this.e = datainputstream.read();
/* 32 */     this.a = datainputstream.readInt();
/* 33 */     this.b = datainputstream.read();
/* 34 */     this.c = datainputstream.readInt();
/* 35 */     this.d = datainputstream.read();
/*    */ 
/* 37 */     while (this.a < -8388608)
/*    */     {
/* 39 */       this.a += 16777216;
/* 40 */       this.b -= 128;
/*    */     }
/* 42 */     while (this.a >= 8388608)
/*    */     {
/* 44 */       this.a -= 16777216;
/* 45 */       this.b += 128;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void a(DataOutputStream dataoutputstream)
/*    */     throws IOException
/*    */   {
/* 52 */     this.a += (this.b >> 7 << 24);
/* 53 */     this.b &= 127;
/* 54 */     dataoutputstream.write(this.e);
/* 55 */     dataoutputstream.writeInt(this.a);
/* 56 */     dataoutputstream.write(this.b);
/* 57 */     dataoutputstream.writeInt(this.c);
/* 58 */     dataoutputstream.write(this.d);
/*    */   }
/*    */ 
/*    */   public void a(kx nethandler)
/*    */   {
/* 63 */     nethandler.a(this);
/*    */   }
/*    */ 
/*    */   public int a()
/*    */   {
/* 68 */     return 11;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     fi
 * JD-Core Version:    0.6.2
 */