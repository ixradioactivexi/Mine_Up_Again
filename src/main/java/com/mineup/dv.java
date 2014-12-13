/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class dv extends vl
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public ul e;
/*    */ 
/*    */   public dv()
/*    */   {
/*    */   }
/*    */ 
/*    */   public dv(int i, int j, int k, int l, ul itemstack)
/*    */   {
/* 21 */     this.a = i;
/* 22 */     this.b = j;
/* 23 */     this.c = k;
/* 24 */     this.d = l;
/* 25 */     this.e = itemstack;
/*    */   }
/*    */ 
/*    */   public void a(DataInputStream datainputstream)
/*    */     throws IOException
/*    */   {
/* 31 */     this.a = datainputstream.readInt();
/* 32 */     this.b = datainputstream.read();
/* 33 */     this.c = datainputstream.readInt();
/* 34 */     this.d = datainputstream.read();
/* 35 */     short word0 = datainputstream.readShort();
/* 36 */     if (word0 >= 0)
/*    */     {
/* 38 */       byte byte0 = datainputstream.readByte();
/* 39 */       short word1 = datainputstream.readShort();
/* 40 */       this.e = new ul(word0, byte0, word1);
/*    */     }
/*    */     else {
/* 43 */       this.e = null;
/*    */     }
/*    */ 
/* 46 */     while (this.a < -8388608)
/*    */     {
/* 48 */       this.a += 16777216;
/* 49 */       this.b -= 128;
/*    */     }
/* 51 */     while (this.a >= 8388608)
/*    */     {
/* 53 */       this.a -= 16777216;
/* 54 */       this.b += 128;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void a(DataOutputStream dataoutputstream)
/*    */     throws IOException
/*    */   {
/* 61 */     this.a += (this.b >> 7 << 24);
/* 62 */     this.b &= 127;
/* 63 */     dataoutputstream.writeInt(this.a);
/* 64 */     dataoutputstream.write(this.b);
/* 65 */     dataoutputstream.writeInt(this.c);
/* 66 */     dataoutputstream.write(this.d);
/* 67 */     if (this.e == null)
/*    */     {
/* 69 */       dataoutputstream.writeShort(-1);
/*    */     }
/*    */     else {
/* 72 */       dataoutputstream.writeShort(this.e.c);
/* 73 */       dataoutputstream.writeByte(this.e.a);
/* 74 */       dataoutputstream.writeShort(this.e.i());
/*    */     }
/*    */   }
/*    */ 
/*    */   public void a(kx nethandler)
/*    */   {
/* 80 */     nethandler.a(this);
/*    */   }
/*    */ 
/*    */   public int a()
/*    */   {
/* 85 */     return 15;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     dv
 * JD-Core Version:    0.6.2
 */