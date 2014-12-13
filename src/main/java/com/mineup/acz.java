/*     */ public abstract class acz
/*     */ {
/*     */   private String name;
/*     */   public rv a;
/*     */   public nu b;
/*     */   public boolean c;
/*     */   public boolean d;
/*     */   public boolean e;
/*     */   public float[] f;
/*     */   public int g;
/*     */   private float[] h;
/*     */ 
/*     */   public String getName()
/*     */   {
/*  19 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name)
/*     */   {
/*  24 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public acz()
/*     */   {
/*  29 */     this.c = false;
/*  30 */     this.d = false;
/*  31 */     this.e = false;
/*  32 */     this.f = new float[16];
/*  33 */     this.g = 0;
/*  34 */     this.h = new float[4];
/*     */   }
/*     */ 
/*     */   public final void a(rv world)
/*     */   {
/*  39 */     this.a = world;
/*  40 */     a();
/*  41 */     e();
/*     */   }
/*     */ 
/*     */   protected void e()
/*     */   {
/*  46 */     float f = 0.0F;
/*  47 */     for (int i = 0; i <= 15; i++)
/*     */     {
/*  49 */       float f1 = 1.0F - i / 15.0F;
/*  50 */       this.f[i] = ((1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void a()
/*     */   {
/*  57 */     this.b = new nu(this.a);
/*     */   }
/*     */ 
/*     */   public bf b()
/*     */   {
/*  62 */     return new adp(this.a, this.a.s(), this.a.x().r());
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j)
/*     */   {
/*  67 */     int k = this.a.a(i, j);
/*  68 */     return k == lr.v.bA;
/*     */   }
/*     */ 
/*     */   public float a(long l, float f)
/*     */   {
/*  73 */     int i = (int)(l % 24000L);
/*  74 */     float f1 = (i + f) / 24000.0F - 0.25F;
/*  75 */     if (f1 < 0.0F)
/*     */     {
/*  77 */       f1 += 1.0F;
/*     */     }
/*  79 */     if (f1 > 1.0F)
/*     */     {
/*  81 */       f1 -= 1.0F;
/*     */     }
/*  83 */     float f2 = f1;
/*  84 */     f1 = 1.0F - (float)((Math.cos(f1 * 3.141592653589793D) + 1.0D) / 2.0D);
/*  85 */     f1 = f2 + (f1 - f2) / 3.0F;
/*  86 */     return f1;
/*     */   }
/*     */ 
/*     */   public float[] a(float f, float f1)
/*     */   {
/*  91 */     float f2 = 0.4F;
/*  92 */     float f3 = et.b(f * 3.141593F * 2.0F) - 0.0F;
/*  93 */     float f4 = -0.0F;
/*  94 */     if ((f3 >= f4 - f2) && (f3 <= f4 + f2))
/*     */     {
/*  96 */       float f5 = (f3 - f4) / f2 * 0.5F + 0.5F;
/*  97 */       float f6 = 1.0F - (1.0F - et.a(f5 * 3.141593F)) * 0.99F;
/*  98 */       f6 *= f6;
/*  99 */       this.h[0] = (f5 * 0.3F + 0.7F);
/* 100 */       this.h[1] = (f5 * f5 * 0.7F + 0.2F);
/* 101 */       this.h[2] = (f5 * f5 * 0.0F + 0.2F);
/* 102 */       this.h[3] = f6;
/* 103 */       return this.h;
/*     */     }
/*     */ 
/* 106 */     return null;
/*     */   }
/*     */ 
/*     */   public ax b(float f, float f1)
/*     */   {
/* 112 */     float f2 = et.b(f * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 113 */     if (f2 < 0.0F)
/*     */     {
/* 115 */       f2 = 0.0F;
/*     */     }
/* 117 */     if (f2 > 1.0F)
/*     */     {
/* 119 */       f2 = 1.0F;
/*     */     }
/* 121 */     float f3 = 0.7529412F;
/* 122 */     float f4 = 0.8470588F;
/* 123 */     float f5 = 1.0F;
/* 124 */     f3 *= (f2 * 0.94F + 0.06F);
/* 125 */     f4 *= (f2 * 0.94F + 0.06F);
/* 126 */     f5 *= (f2 * 0.91F + 0.09F);
/* 127 */     return ax.b(f3, f4, f5);
/*     */   }
/*     */ 
/*     */   public boolean f()
/*     */   {
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */   public static acz a(int i)
/*     */   {
/* 137 */     if (i == -1)
/*     */     {
/* 139 */       return new aci();
/*     */     }
/* 141 */     if (i == 0)
/*     */     {
/* 143 */       return new js();
/*     */     }
/* 145 */     if (i == 1)
/*     */     {
/* 147 */       return new am();
/*     */     }
/*     */ 
/* 150 */     return null;
/*     */   }
/*     */ 
/*     */   public float d()
/*     */   {
/* 156 */     this.a.getClass();
/* 157 */     return 128.0F;
/*     */   }
/*     */ 
/*     */   public boolean c()
/*     */   {
/* 162 */     return true;
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     acz
 * JD-Core Version:    0.6.2
 */