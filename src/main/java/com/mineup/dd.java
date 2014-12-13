/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ public class dd
/*     */   implements acq
/*     */ {
/* 241 */   private static final Logger a = Logger.getLogger("Minecraft");
/*     */   private final File b;
/*     */   private final File c;
/*     */   private final File d;
/* 245 */   private final long e = System.currentTimeMillis();
/*     */ 
/*     */   public dd(File file, String s, boolean flag)
/*     */   {
/*  22 */     this.b = new File(file, s);
/*  23 */     this.b.mkdirs();
/*  24 */     this.c = new File(this.b, "players");
/*  25 */     this.d = new File(this.b, "data");
/*  26 */     this.d.mkdirs();
/*  27 */     if (flag)
/*     */     {
/*  29 */       this.c.mkdirs();
/*     */     }
/*  31 */     d();
/*     */   }
/*     */ 
/*     */   private void d()
/*     */   {
/*     */     try
/*     */     {
/*  38 */       File file = new File(this.b, "session.lock");
/*  39 */       DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file));
/*     */       try
/*     */       {
/*  42 */         dataoutputstream.writeLong(this.e);
/*     */       }
/*     */       finally
/*     */       {
/*  46 */         dataoutputstream.close();
/*     */       }
/*     */     }
/*     */     catch (IOException ioexception)
/*     */     {
/*  51 */       ioexception.printStackTrace();
/*  52 */       throw new RuntimeException("Failed to check session lock, aborting");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected File a()
/*     */   {
/*  58 */     return this.b;
/*     */   }
/*     */ 
/*     */   public void b()
/*     */   {
/*     */     try
/*     */     {
/*  65 */       File file = new File(this.b, "session.lock");
/*  66 */       DataInputStream datainputstream = new DataInputStream(new FileInputStream(file));
/*     */       try
/*     */       {
/*  69 */         if (datainputstream.readLong() != this.e)
/*     */         {
/*  71 */           throw new abl("The save is being accessed from another location, aborting");
/*     */         }
/*     */       }
/*     */       finally
/*     */       {
/*  76 */         datainputstream.close();
/*     */       }
/*     */     }
/*     */     catch (IOException ioexception)
/*     */     {
/*  81 */       throw new abl("Failed to check session lock, aborting");
/*     */     }
/*     */   }
/*     */ 
/*     */   public pl a(acz worldprovider)
/*     */   {
/*  87 */     if ((worldprovider instanceof aci))
/*     */     {
/*  89 */       File file = new File(this.b, "DIM-1");
/*  90 */       file.mkdirs();
/*  91 */       return new lb(file, true);
/*     */     }
/*  93 */     if ((worldprovider instanceof am)) {
/*  94 */       File file = new File(this.b, "DIM-2");
/*  95 */       file.mkdirs();
/*  96 */       return new lb(file, true);
/*     */     }
/*     */ 
/*  99 */     return new lb(this.b, true);
/*     */   }
/*     */ 
/*     */   public WorldLayersInfo loadWorldLayersInfo()
/*     */   {
/* 105 */     File file = new File(this.b, "layers.dat");
/* 106 */     if (file.exists())
/*     */     {
/*     */       try
/*     */       {
/* 110 */         xb nbttagcompound = aj.a(new FileInputStream(file));
/* 111 */         xb nbttagcompound2 = nbttagcompound.k("Data");
/* 112 */         return new WorldLayersInfo(nbttagcompound2);
/*     */       }
/*     */       catch (Exception exception)
/*     */       {
/* 116 */         exception.printStackTrace();
/*     */       }
/*     */     }
/* 119 */     file = new File(this.b, "layers.dat_old");
/* 120 */     if (file.exists())
/*     */     {
/*     */       try
/*     */       {
/* 124 */         xb nbttagcompound1 = aj.a(new FileInputStream(file));
/* 125 */         xb nbttagcompound3 = nbttagcompound1.k("Data");
/* 126 */         return new WorldLayersInfo(nbttagcompound3);
/*     */       }
/*     */       catch (Exception exception1)
/*     */       {
/* 130 */         exception1.printStackTrace();
/*     */       }
/*     */     }
/* 133 */     return null;
/*     */   }
/*     */ 
/*     */   public rl c()
/*     */   {
/* 138 */     File file = new File(this.b, "level.dat");
/* 139 */     rl res = null;
/* 140 */     if (file.exists())
/*     */     {
/*     */       try
/*     */       {
/* 144 */         xb nbttagcompound = aj.a(new FileInputStream(file));
/* 145 */         xb nbttagcompound2 = nbttagcompound.k("Data");
/* 146 */         res = new ExtendedWorldInfo(nbttagcompound2);
/*     */       }
/*     */       catch (Exception exception)
/*     */       {
/* 150 */         exception.printStackTrace();
/*     */       }
/*     */     }
/* 153 */     if (res == null)
/*     */     {
/* 155 */       file = new File(this.b, "level.dat_old");
/* 156 */       if (file.exists())
/*     */       {
/*     */         try
/*     */         {
/* 160 */           xb nbttagcompound1 = aj.a(new FileInputStream(file));
/* 161 */           xb nbttagcompound3 = nbttagcompound1.k("Data");
/* 162 */           res = new ExtendedWorldInfo(nbttagcompound3);
/*     */         }
/*     */         catch (Exception exception1)
/*     */         {
/* 166 */           exception1.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/* 170 */     if (res != null)
/*     */     {
/* 172 */       WorldLayersInfo layers = loadWorldLayersInfo();
/* 173 */       if (layers == null)
/* 174 */         layers = WorldLayersInfo.getDefaultWorldLayersInfo();
/* 175 */       ((ExtendedWorldInfo)res).setLayersInfo(layers);
/*     */     }
/* 177 */     return res;
/*     */   }
/*     */ 
/*     */   public void a(rl worldinfo, List list)
/*     */   {
/* 182 */     saveWorldInfo(worldinfo, true, list);
/*     */   }
/*     */ 
/*     */   public void saveWorldInfo(rl worldinfo, boolean withPlayer, List list) {
/* 186 */     xb nbttagcompound = withPlayer ? worldinfo.a(list) : worldinfo.a();
/*     */ 
/* 188 */     xb nbttagcompound1 = new xb();
/* 189 */     nbttagcompound1.a("Data", nbttagcompound);
/*     */     try {
/* 191 */       File file = new File(this.b, "level.dat_new");
/* 192 */       File file1 = new File(this.b, "level.dat_old");
/* 193 */       File file2 = new File(this.b, "level.dat");
/* 194 */       aj.a(nbttagcompound1, new FileOutputStream(file));
/* 195 */       if (file1.exists()) {
/* 196 */         file1.delete();
/*     */       }
/* 198 */       file2.renameTo(file1);
/* 199 */       if (file2.exists()) {
/* 200 */         file2.delete();
/*     */       }
/* 202 */       file.renameTo(file2);
/* 203 */       if (file.exists()) {
/* 204 */         file.delete();
/*     */       }
/*     */ 
/* 207 */       ExtendedWorldInfo exWorldInfo = (ExtendedWorldInfo)worldinfo;
/* 208 */       nbttagcompound = exWorldInfo.getLayersInfo().getNBTTagCompound();
/* 209 */       nbttagcompound1 = new xb();
/* 210 */       nbttagcompound1.a("Data", nbttagcompound);
/* 211 */       file = new File(this.b, "layers.dat_new");
/* 212 */       file1 = new File(this.b, "layers.dat_old");
/* 213 */       file2 = new File(this.b, "layers.dat");
/* 214 */       aj.a(nbttagcompound1, new FileOutputStream(file));
/* 215 */       if (file1.exists()) {
/* 216 */         file1.delete();
/*     */       }
/* 218 */       file2.renameTo(file1);
/* 219 */       if (file2.exists()) {
/* 220 */         file2.delete();
/*     */       }
/* 222 */       file.renameTo(file2);
/* 223 */       if (file.exists())
/* 224 */         file.delete();
/*     */     }
/*     */     catch (Exception exception) {
/* 227 */       exception.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(rl worldinfo)
/*     */   {
/* 233 */     saveWorldInfo(worldinfo, false, null);
/*     */   }
/*     */ 
/*     */   public File a(String s)
/*     */   {
/* 238 */     return new File(this.d, s + ".dat");
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     dd
 * JD-Core Version:    0.6.2
 */