/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ve extends vl
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */ 
/*    */   public void a(DataInputStream datainputstream)
/*    */     throws IOException
/*    */   {
/* 22 */     this.a = datainputstream.readInt();
/* 23 */     this.e = datainputstream.readByte();
/* 24 */     this.b = datainputstream.readInt();
/* 25 */     this.c = datainputstream.readByte();
/* 26 */     this.d = datainputstream.readInt();
/* 27 */     while (this.b < -8388608)
/*    */     {
/* 29 */       this.b += 16777216;
/* 30 */       this.c -= 128;
/*    */     }
/* 32 */     while (this.b >= 8388608)
/*    */     {
/* 34 */       this.b -= 16777216;
/* 35 */       this.c += 128;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void a(DataOutputStream dataoutputstream)
/*    */     throws IOException
/*    */   {
/* 42 */     this.b += (this.c >> 7 << 24);
/* 43 */     this.c &= 127;
/* 44 */     dataoutputstream.writeInt(this.a);
/* 45 */     dataoutputstream.writeByte(this.e);
/* 46 */     dataoutputstream.writeInt(this.b);
/* 47 */     dataoutputstream.writeByte(this.c);
/* 48 */     dataoutputstream.writeInt(this.d);
/*    */   }
/*    */ 
/*    */   public void a(kx nethandler)
/*    */   {
/* 53 */     nethandler.a(this);
/*    */   }
/*    */ 
/*    */   public int a()
/*    */   {
/* 58 */     return 14;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ve
 * JD-Core Version:    0.6.2
 */