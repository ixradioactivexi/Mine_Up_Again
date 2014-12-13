/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class de extends vl
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
/* 23 */     this.c = datainputstream.readInt();
/* 24 */     this.d = datainputstream.readByte();
/* 25 */     this.e = datainputstream.readInt();
/* 26 */     this.b = datainputstream.readInt();
/* 27 */     while (this.c < -8388608)
/*    */     {
/* 29 */       this.c += 16777216;
/* 30 */       this.d -= 128;
/*    */     }
/* 32 */     while (this.d >= 8388608)
/*    */     {
/* 34 */       this.c -= 16777216;
/* 35 */       this.d += 128;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void a(DataOutputStream dataoutputstream) throws IOException
/*    */   {
/* 41 */     this.c += (this.d >> 7 << 24);
/* 42 */     this.d &= 127;
/* 43 */     dataoutputstream.writeInt(this.a);
/* 44 */     dataoutputstream.writeInt(this.c);
/* 45 */     dataoutputstream.writeByte(this.d);
/* 46 */     dataoutputstream.writeInt(this.e);
/* 47 */     dataoutputstream.writeInt(this.b);
/*    */   }
/*    */ 
/*    */   public void a(kx nethandler)
/*    */   {
/* 52 */     nethandler.a(this);
/*    */   }
/*    */ 
/*    */   public int a()
/*    */   {
/* 57 */     return 20;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     de
 * JD-Core Version:    0.6.2
 */