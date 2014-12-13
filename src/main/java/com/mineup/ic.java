/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class ic
/*     */   implements bf
/*     */ {
/*     */   private long age;
/*     */   private Set a;
/*     */   private vy b;
/*     */   private bf c;
/*     */   private pl d;
/*     */   private dg e;
/*     */   private List f;
/*     */   private rv g;
/*     */   private int h;
/*     */ 
/*     */   public void setLivingChunkAge(long age)
/*     */   {
/*  21 */     this.age = age;
/*     */   }
/*     */ 
/*     */   public ic(rv world, pl ichunkloader, bf ichunkprovider)
/*     */   {
/*  26 */     this.a = new HashSet();
/*  27 */     this.e = new dg();
/*  28 */     this.f = new ArrayList();
/*  29 */     this.b = new vv(world, new byte[32768], 0, 0);
/*  30 */     this.g = world;
/*  31 */     this.d = ichunkloader;
/*  32 */     this.c = ichunkprovider;
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j)
/*     */   {
/*  37 */     return this.e.b(oh.a(i, j));
/*     */   }
/*     */ 
/*     */   public void d(int i, int j)
/*     */   {
/*  42 */     ps chunkcoordinates = this.g.u();
/*  43 */     int k = i * 16 + 8 - chunkcoordinates.a;
/*  44 */     int l = j * 16 + 8 - chunkcoordinates.c;
/*  45 */     char c = '';
/*  46 */     if ((k < -c) || (k > c) || (l < -c) || (l > c))
/*     */     {
/*  48 */       this.a.add(Long.valueOf(oh.a(i, j)));
/*     */     }
/*     */   }
/*     */ 
/*     */   public vy c(int i, int j)
/*     */   {
/*  54 */     long l = oh.a(i, j);
/*  55 */     this.a.remove(Long.valueOf(l));
/*  56 */     vy chunk = (vy)this.e.a(l);
/*  57 */     if (chunk == null)
/*     */     {
/*  59 */       int k = 1875004;
/*  60 */       if ((i < -k) || (j < -k) || (i >= k) || (j >= k))
/*     */       {
/*  62 */         return this.b;
/*     */       }
/*  64 */       chunk = e(i, j);
/*  65 */       if (chunk == null)
/*     */       {
/*  67 */         if (this.c == null)
/*     */         {
/*  69 */           chunk = this.b;
/*     */         }
/*     */         else {
/*  72 */           chunk = this.c.b(i, j);
/*     */         }
/*     */       }
/*  75 */       this.e.a(l, chunk);
/*  76 */       this.f.add(chunk);
/*  77 */       if (chunk != null)
/*     */       {
/*  79 */         chunk.d();
/*  80 */         chunk.e();
/*     */       }
/*  82 */       chunk.a(this, this, i, j);
/*     */     }
/*  84 */     return chunk;
/*     */   }
/*     */ 
/*     */   public vy b(int i, int j)
/*     */   {
/*  89 */     vy chunk = (vy)this.e.a(oh.a(i, j));
/*  90 */     return chunk != null ? chunk : c(i, j);
/*     */   }
/*     */ 
/*     */   private vy e(int i, int j)
/*     */   {
/*  95 */     if (this.d == null)
/*     */     {
/*  97 */       return null;
/*     */     }
/*     */     try
/*     */     {
/* 101 */       vy chunk = this.d.a(this.g, i, j);
/* 102 */       if (chunk != null)
/*     */       {
/* 104 */         chunk.t = this.g.t();
/*     */       }
/* 106 */       return chunk;
/*     */     }
/*     */     catch (Exception exception)
/*     */     {
/* 110 */       exception.printStackTrace();
/*     */     }
/* 112 */     return null;
/*     */   }
/*     */ 
/*     */   private void a(vy chunk)
/*     */   {
/* 117 */     if (this.d != null)
/*     */     {
/*     */       try
/*     */       {
/* 121 */         this.d.b(this.g, chunk);
/*     */       }
/*     */       catch (Exception exception)
/*     */       {
/* 125 */         exception.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private void b(vy chunk)
/*     */   {
/* 132 */     if (this.d != null)
/*     */     {
/*     */       try
/*     */       {
/* 136 */         chunk.t = this.g.t();
/* 137 */         this.d.a(this.g, chunk);
/*     */       }
/*     */       catch (IOException ioexception)
/*     */       {
/* 141 */         ioexception.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(bf ichunkprovider, int i, int j)
/*     */   {
/* 148 */     vy chunk = b(i, j);
/* 149 */     if (!chunk.p)
/*     */     {
/* 151 */       chunk.p = true;
/* 152 */       if (this.c != null)
/*     */       {
/* 154 */         this.c.a(ichunkprovider, i, j);
/* 155 */         MineUpModloaderAdapter.get().populateChunk(this.c, i, j, this.g);
/* 156 */         chunk.g();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean a(boolean flag, ny iprogressupdate)
/*     */   {
/* 163 */     int i = 0;
/* 164 */     for (int j = 0; j < this.f.size(); j++)
/*     */     {
/* 166 */       vy chunk = (vy)this.f.get(j);
/* 167 */       if ((flag) && (!chunk.r))
/*     */       {
/* 169 */         a(chunk);
/*     */       }
/* 171 */       if (chunk.a(flag))
/*     */       {
/* 173 */         b(chunk);
/* 174 */         chunk.q = false;
/* 175 */         i++; if ((i == 24) && (!flag))
/*     */         {
/* 177 */           return false;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 182 */     if (flag)
/*     */     {
/* 184 */       if (this.d == null)
/*     */       {
/* 186 */         return true;
/*     */       }
/* 188 */       this.d.b();
/*     */     }
/* 190 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/* 195 */     for (int i = 0; i < 10; i++)
/*     */     {
/* 197 */       if (!this.a.isEmpty())
/*     */       {
/* 199 */         Long long1 = (Long)this.a.iterator().next();
/* 200 */         vy chunk1 = (vy)this.e.a(long1.longValue());
/* 201 */         chunk1.f();
/* 202 */         b(chunk1);
/* 203 */         a(chunk1);
/* 204 */         this.a.remove(long1);
/* 205 */         this.e.d(long1.longValue());
/* 206 */         this.f.remove(chunk1);
/*     */       }
/*     */     }
/*     */ 
/* 210 */     for (int j = 0; j < 10; j++)
/*     */     {
/* 212 */       if (this.h >= this.f.size())
/*     */       {
/* 214 */         this.h = 0;
/* 215 */         break;
/*     */       }
/* 217 */       vy chunk = (vy)this.f.get(this.h++);
/* 218 */       if (chunk.getChunkAge() < this.age)
/*     */       {
/* 220 */         d(chunk.l, chunk.m);
/*     */       }
/*     */     }
/*     */ 
/* 224 */     if (this.d != null)
/*     */     {
/* 226 */       this.d.a();
/*     */     }
/* 228 */     return this.c.a();
/*     */   }
/*     */ 
/*     */   public boolean b()
/*     */   {
/* 233 */     return true;
/*     */   }
/*     */ 
/*     */   public String c()
/*     */   {
/* 238 */     return "ServerChunkCache: " + this.e.a() + " Drop: " + this.a.size();
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ic
 * JD-Core Version:    0.6.2
 */