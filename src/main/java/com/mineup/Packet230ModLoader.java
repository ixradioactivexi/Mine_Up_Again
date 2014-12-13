/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class Packet230ModLoader extends vl
/*     */ {
/*     */   private static final int MAX_DATA_LENGTH = 65535;
/*     */   public int modId;
/*     */   public int packetType;
/*     */   public int[] dataInt;
/*     */   public float[] dataFloat;
/*     */   public String[] dataString;
/*     */ 
/*     */   public Packet230ModLoader()
/*     */   {
/*  17 */     this.dataInt = new int[0];
/*  18 */     this.dataFloat = new float[0];
/*  19 */     this.dataString = new String[0];
/*     */   }
/*     */ 
/*     */   public void a(DataInputStream datainputstream)
/*     */     throws IOException
/*     */   {
/*  25 */     this.modId = datainputstream.readInt();
/*  26 */     this.packetType = datainputstream.readInt();
/*  27 */     int i = datainputstream.readInt();
/*  28 */     if (i > 65535)
/*     */     {
/*  30 */       throw new IOException(String.format("Integer data size of %d is higher than the max (%d).", new Object[] { Integer.valueOf(i), Integer.valueOf(65535) }));
/*     */     }
/*     */ 
/*  34 */     this.dataInt = new int[i];
/*  35 */     for (int j = 0; j < i; j++)
/*     */     {
/*  37 */       this.dataInt[j] = datainputstream.readInt();
/*     */     }
/*     */ 
/*  40 */     int k = datainputstream.readInt();
/*  41 */     if (k > 65535)
/*     */     {
/*  43 */       throw new IOException(String.format("Float data size of %d is higher than the max (%d).", new Object[] { Integer.valueOf(k), Integer.valueOf(65535) }));
/*     */     }
/*     */ 
/*  47 */     this.dataFloat = new float[k];
/*  48 */     for (int l = 0; l < k; l++)
/*     */     {
/*  50 */       this.dataFloat[l] = datainputstream.readFloat();
/*     */     }
/*     */ 
/*  53 */     int i1 = datainputstream.readInt();
/*  54 */     if (i1 > 65535)
/*     */     {
/*  56 */       throw new IOException(String.format("String data size of %d is higher than the max (%d).", new Object[] { Integer.valueOf(i1), Integer.valueOf(65535) }));
/*     */     }
/*     */ 
/*  60 */     this.dataString = new String[i1];
/*  61 */     for (int j1 = 0; j1 < i1; j1++)
/*     */     {
/*  63 */       int k1 = datainputstream.readInt();
/*  64 */       if (k1 > 65535)
/*     */       {
/*  66 */         throw new IOException(String.format("String length of %d is higher than the max (%d).", new Object[] { Integer.valueOf(k1), Integer.valueOf(65535) }));
/*     */       }
/*     */ 
/*  70 */       byte[] abyte0 = new byte[k1];
/*  71 */       int bytesRead = 0;
/*  72 */       while (bytesRead < k1) {
/*  73 */         bytesRead += datainputstream.read(abyte0, bytesRead, k1 - bytesRead);
/*     */       }
/*  75 */       this.dataString[j1] = new String(abyte0);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(DataOutputStream dataoutputstream)
/*     */     throws IOException
/*     */   {
/*  83 */     if ((this.dataInt != null) && (this.dataInt.length > 65535))
/*     */     {
/*  85 */       throw new IOException(String.format("Integer data size of %d is higher than the max (%d).", new Object[] { Integer.valueOf(this.dataInt.length), Integer.valueOf(65535) }));
/*     */     }
/*     */ 
/*  89 */     if ((this.dataFloat != null) && (this.dataFloat.length > 65535))
/*     */     {
/*  91 */       throw new IOException(String.format("Float data size of %d is higher than the max (%d).", new Object[] { Integer.valueOf(this.dataFloat.length), Integer.valueOf(65535) }));
/*     */     }
/*     */ 
/*  95 */     if ((this.dataString != null) && (this.dataString.length > 65535))
/*     */     {
/*  97 */       throw new IOException(String.format("String data size of %d is higher than the max (%d).", new Object[] { Integer.valueOf(this.dataString.length), Integer.valueOf(65535) }));
/*     */     }
/*     */ 
/* 101 */     dataoutputstream.writeInt(this.modId);
/* 102 */     dataoutputstream.writeInt(this.packetType);
/* 103 */     if (this.dataInt == null)
/*     */     {
/* 105 */       dataoutputstream.writeInt(0);
/*     */     }
/*     */     else {
/* 108 */       dataoutputstream.writeInt(this.dataInt.length);
/* 109 */       for (int i = 0; i < this.dataInt.length; i++)
/*     */       {
/* 111 */         dataoutputstream.writeInt(this.dataInt[i]);
/*     */       }
/*     */     }
/*     */ 
/* 115 */     if (this.dataFloat == null)
/*     */     {
/* 117 */       dataoutputstream.writeInt(0);
/*     */     }
/*     */     else {
/* 120 */       dataoutputstream.writeInt(this.dataFloat.length);
/* 121 */       for (int j = 0; j < this.dataFloat.length; j++)
/*     */       {
/* 123 */         dataoutputstream.writeFloat(this.dataFloat[j]);
/*     */       }
/*     */     }
/*     */ 
/* 127 */     if (this.dataString == null)
/*     */     {
/* 129 */       dataoutputstream.writeInt(0);
/*     */     }
/*     */     else {
/* 132 */       dataoutputstream.writeInt(this.dataString.length);
/* 133 */       for (int k = 0; k < this.dataString.length; k++)
/*     */       {
/* 135 */         if (this.dataString[k].length() > 65535)
/*     */         {
/* 137 */           throw new IOException(String.format("String length of %d is higher than the max (%d).", new Object[] { Integer.valueOf(this.dataString[k].length()), Integer.valueOf(65535) }));
/*     */         }
/*     */ 
/* 141 */         dataoutputstream.writeInt(this.dataString[k].length());
/* 142 */         dataoutputstream.writeBytes(this.dataString[k]);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(kx nethandler)
/*     */   {
/* 150 */     ModLoaderMp.HandleAllPackets(this);
/*     */   }
/*     */ 
/*     */   public int a()
/*     */   {
/* 155 */     int i = 1;
/* 156 */     i++;
/* 157 */     i++; i += (this.dataInt != null ? this.dataInt.length * 32 : 0);
/* 158 */     i++; i += (this.dataFloat != null ? this.dataFloat.length * 32 : 0);
/* 159 */     i++;
/* 160 */     if (this.dataString != null)
/*     */     {
/* 162 */       for (int j = 0; j < this.dataString.length; j++)
/*     */       {
/* 164 */         i++; i += this.dataString[j].length();
/*     */       }
/*     */     }
/*     */ 
/* 168 */     return i;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     Packet230ModLoader
 * JD-Core Version:    0.6.2
 */