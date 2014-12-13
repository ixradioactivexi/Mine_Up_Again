/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class lc extends vl
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */ 
/*    */   public lc()
/*    */   {
/* 17 */     this.l = true;
/*    */   }
/*    */ 
/*    */   public void a(DataInputStream datainputstream)
/*    */     throws IOException
/*    */   {
/* 23 */     this.a = datainputstream.readInt();
/* 24 */     this.b = datainputstream.read();
/* 25 */     this.c = datainputstream.readInt();
/* 26 */     this.d = datainputstream.read();
/* 27 */     this.e = datainputstream.read();
/* 28 */     while (this.a < -8388608)
/*    */     {
/* 30 */       this.a += 16777216;
/* 31 */       this.b -= 128;
/*    */     }
/* 33 */     while (this.a >= 8388608)
/*    */     {
/* 35 */       this.a -= 16777216;
/* 36 */       this.b += 128;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void a(DataOutputStream dataoutputstream)
/*    */     throws IOException
/*    */   {
/* 43 */     this.a += (this.b >> 7 << 24);
/* 44 */     this.b &= 127;
/* 45 */     dataoutputstream.writeInt(this.a);
/* 46 */     dataoutputstream.write(this.b);
/* 47 */     dataoutputstream.writeInt(this.c);
/* 48 */     dataoutputstream.write(this.d);
/* 49 */     dataoutputstream.write(this.e);
/*    */   }
/*    */ 
/*    */   public void a(kx nethandler)
/*    */   {
/* 54 */     nethandler.a(this);
/*    */   }
/*    */ 
/*    */   public int a()
/*    */   {
/* 59 */     return 11;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     lc
 * JD-Core Version:    0.6.2
 */