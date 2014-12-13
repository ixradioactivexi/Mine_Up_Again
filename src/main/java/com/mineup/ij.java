/*     */ import java.io.PrintStream;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class ij
/*     */ {
/* 171 */   private static Map a = new HashMap();
/* 172 */   private static Map b = new HashMap();
/*     */   public rv i;
/*     */   public int j;
/*     */   public int k;
/*     */   public int l;
/*     */   protected boolean m;
/*     */   public int n;
/*     */   public lr o;
/*     */ 
/*     */   public ij()
/*     */   {
/*  21 */     this.n = -1;
/*     */   }
/*     */ 
/*     */   private static void a(Class class1, String s)
/*     */   {
/*  26 */     if (b.containsKey(s))
/*     */     {
/*  28 */       throw new IllegalArgumentException("Duplicate id: " + s);
/*     */     }
/*     */ 
/*  31 */     a.put(s, class1);
/*  32 */     b.put(class1, s);
/*     */   }
/*     */ 
/*     */   public void a(xb nbttagcompound)
/*     */   {
/*  39 */     this.j = nbttagcompound.e("x");
/*  40 */     this.k = nbttagcompound.e("y");
/*  41 */     this.l = nbttagcompound.e("z");
/*     */   }
/*     */ 
/*     */   public void b(xb nbttagcompound)
/*     */   {
/*  46 */     String s = (String)b.get(getClass());
/*  47 */     if (s == null)
/*     */     {
/*  49 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*     */     }
/*     */ 
/*  52 */     nbttagcompound.a("id", s);
/*  53 */     nbttagcompound.a("x", this.j);
/*  54 */     int y = this.k;
/*  55 */     if ((this.i instanceof WorldWithLayers))
/*  56 */       y -= ((WorldWithLayers)this.i).getLayer(this.k).shiftY;
/*  57 */     nbttagcompound.a("y", y);
/*  58 */     nbttagcompound.a("z", this.l);
/*     */   }
/*     */ 
/*     */   public void b_()
/*     */   {
/*     */   }
/*     */ 
/*     */   public boolean canUpdate()
/*     */   {
/*  71 */     return true;
/*     */   }
/*     */ 
/*     */   public static ij c(xb nbttagcompound)
/*     */   {
/*  76 */     ij tileentity = null;
/*     */     try
/*     */     {
/*  79 */       Class class1 = (Class)a.get(nbttagcompound.i("id"));
/*  80 */       if (class1 != null)
/*     */       {
/*  82 */         tileentity = (ij)class1.newInstance();
/*     */       }
/*     */     }
/*     */     catch (Exception exception)
/*     */     {
/*  87 */       exception.printStackTrace();
/*     */     }
/*  89 */     if (tileentity != null)
/*     */     {
/*  91 */       tileentity.a(nbttagcompound);
/*     */     }
/*     */     else {
/*  94 */       System.out.println("Skipping TileEntity with id " + nbttagcompound.i("id"));
/*     */     }
/*  96 */     return tileentity;
/*     */   }
/*     */ 
/*     */   public int i()
/*     */   {
/* 101 */     if (this.n == -1)
/*     */     {
/* 103 */       this.n = this.i.e(this.j, this.k, this.l);
/*     */     }
/* 105 */     return this.n;
/*     */   }
/*     */ 
/*     */   public void l()
/*     */   {
/* 110 */     if (this.i != null)
/*     */     {
/* 112 */       this.n = this.i.e(this.j, this.k, this.l);
/* 113 */       this.i.b(this.j, this.k, this.l, this);
/*     */     }
/*     */   }
/*     */ 
/*     */   public double a(double d, double d1, double d2)
/*     */   {
/* 119 */     double d3 = this.j + 0.5D - d;
/* 120 */     double d4 = this.k + 0.5D - d1;
/* 121 */     double d5 = this.l + 0.5D - d2;
/* 122 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*     */   }
/*     */ 
/*     */   public lr j()
/*     */   {
/* 127 */     if (this.o == null)
/*     */     {
/* 129 */       this.o = lr.m[this.i.a(this.j, this.k, this.l)];
/*     */     }
/* 131 */     return this.o;
/*     */   }
/*     */ 
/*     */   public boolean k()
/*     */   {
/* 136 */     return this.m;
/*     */   }
/*     */ 
/*     */   public void h()
/*     */   {
/* 141 */     this.m = true;
/*     */   }
/*     */ 
/*     */   public void m()
/*     */   {
/* 146 */     this.m = false;
/*     */   }
/*     */ 
/*     */   public void b(int i, int j)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void b()
/*     */   {
/* 155 */     this.o = null;
/* 156 */     this.n = -1;
/*     */   }
/*     */ 
/*     */   static Class _mthclass$(String s)
/*     */   {
/*     */     try
/*     */     {
/* 163 */       return Class.forName(s);
/*     */     }
/*     */     catch (ClassNotFoundException classnotfoundexception)
/*     */     {
/* 167 */       throw new NoClassDefFoundError(classnotfoundexception.getMessage());
/*     */     }
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/* 183 */     a(aaa.class, "Furnace");
/* 184 */     a(fh.class, "Chest");
/* 185 */     a(ck.class, "RecordPlayer");
/* 186 */     a(an.class, "Trap");
/* 187 */     a(od.class, "Sign");
/* 188 */     a(bn.class, "MobSpawner");
/* 189 */     a(la.class, "Music");
/* 190 */     a(lk.class, "Piston");
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ij
 * JD-Core Version:    0.6.2
 */