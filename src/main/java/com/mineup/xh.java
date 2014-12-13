/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class xh extends vl
/*    */ {
/*    */   public int a;
/*    */   public String b;
/*    */   public long c;
/*    */   public int d;
/*    */   public byte e;
/*    */   public byte f;
/*    */   public byte g;
/*    */   public byte h;
/*    */   public WorldLayersInfo layersInfo;
/*    */ 
/*    */   public xh()
/*    */   {
/*    */   }
/*    */ 
/*    */   public xh(String s, int i)
/*    */   {
/* 23 */     this.b = s;
/* 24 */     this.a = i;
/*    */   }
/*    */ 
/*    */   public void a(DataInputStream datainputstream)
/*    */     throws IOException
/*    */   {
/* 30 */     this.a = datainputstream.readInt();
/* 31 */     this.b = a(datainputstream, 16);
/* 32 */     this.c = datainputstream.readLong();
/* 33 */     this.d = datainputstream.readInt();
/* 34 */     this.e = datainputstream.readByte();
/* 35 */     this.f = datainputstream.readByte();
/* 36 */     this.g = datainputstream.readByte();
/* 37 */     this.h = datainputstream.readByte();
/* 38 */     if ((this.a & 0x1000000) != 0) {
/* 39 */       this.layersInfo = new WorldLayersInfo();
/* 40 */       this.a &= -16777217;
/*    */ 
/* 42 */       int underCount = datainputstream.readInt();
/* 43 */       int overCount = datainputstream.readInt();
/* 44 */       int travelCount = datainputstream.readInt();
/* 45 */       for (int i = 0; i < underCount; i++)
/* 46 */         this.layersInfo.addWorld(WorldProviderType.UNDERWORLD, a(datainputstream, 32));
/* 47 */       this.layersInfo.addWorld(WorldProviderType.WORLD, a(datainputstream, 32));
/* 48 */       for (int i = 0; i < overCount; i++)
/* 49 */         this.layersInfo.addWorld(WorldProviderType.OVERWORLD, a(datainputstream, 32));
/* 50 */       for (int i = 0; i < travelCount; i++)
/* 51 */         this.layersInfo.addWorld(WorldProviderType.FASTTRAVEL, a(datainputstream, 32));
/* 52 */       this.layersInfo.setRandomSeed(this.c);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void a(DataOutputStream dataoutputstream)
/*    */     throws IOException
/*    */   {
/* 59 */     dataoutputstream.writeInt(this.a);
/* 60 */     a(this.b, dataoutputstream);
/* 61 */     dataoutputstream.writeLong(this.c);
/* 62 */     dataoutputstream.writeInt(this.d);
/* 63 */     dataoutputstream.writeByte(this.e);
/* 64 */     dataoutputstream.writeByte(this.f);
/* 65 */     dataoutputstream.writeByte(this.g);
/* 66 */     dataoutputstream.writeByte(this.h);
/*    */   }
/*    */ 
/*    */   public void a(kx nethandler)
/*    */   {
/* 71 */     nethandler.a(this);
/*    */   }
/*    */ 
/*    */   public int a()
/*    */   {
/* 76 */     return 4 + this.b.length() + 4 + 7 + 4;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     xh
 * JD-Core Version:    0.6.2
 */