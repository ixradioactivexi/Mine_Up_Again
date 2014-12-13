/*      */ import java.awt.image.BufferedImage;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import net.minecraft.client.Minecraft;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.ContextCapabilities;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GL13;
/*      */ import org.lwjgl.opengl.GLContext;
/*      */ import org.lwjgl.util.glu.GLU;
/*      */ 
/*      */ public class iw
/*      */ {
/* 1368 */   public static boolean a = false;
/*      */   public static int b;
/*      */   private Minecraft r;
/*      */   private float s;
/*      */   public jo c;
/*      */   private int t;
/*      */   private kj u;
/*      */   private bl v;
/*      */   private bl w;
/*      */   private bl x;
/*      */   private bl y;
/*      */   private bl z;
/*      */   private bl A;
/*      */   private float B;
/*      */   private float C;
/*      */   private float D;
/*      */   private float E;
/*      */   private float F;
/*      */   private float G;
/*      */   private float H;
/*      */   private float I;
/*      */   private float J;
/*      */   private float K;
/*      */   public int d;
/*      */   private int[] L;
/*      */   private float M;
/*      */   private float N;
/*      */   private float O;
/*      */   private boolean P;
/*      */   private double Q;
/*      */   private double R;
/*      */   private double S;
/*      */   private long T;
/*      */   private long U;
/*      */   private boolean V;
/*      */   float e;
/*      */   float f;
/*      */   float g;
/*      */   float h;
/*      */   private Random W;
/*      */   private int X;
/*      */   float[] i;
/*      */   float[] j;
/*      */   volatile int k;
/*      */   volatile int l;
/*      */   FloatBuffer m;
/*      */   float n;
/*      */   float o;
/*      */   float p;
/*      */   private float Y;
/*      */   private float Z;
/*      */   public int q;
/*      */ 
/*      */   public iw(Minecraft minecraft)
/*      */   {
/*   36 */     this.s = 0.0F;
/*   37 */     this.u = null;
/*   38 */     this.v = new bl();
/*   39 */     this.w = new bl();
/*   40 */     this.x = new bl();
/*   41 */     this.y = new bl();
/*   42 */     this.z = new bl();
/*   43 */     this.A = new bl();
/*   44 */     this.B = 4.0F;
/*   45 */     this.C = 4.0F;
/*   46 */     this.D = 0.0F;
/*   47 */     this.E = 0.0F;
/*   48 */     this.F = 0.0F;
/*   49 */     this.G = 0.0F;
/*   50 */     this.H = 0.0F;
/*   51 */     this.I = 0.0F;
/*   52 */     this.J = 0.0F;
/*   53 */     this.K = 0.0F;
/*   54 */     this.P = false;
/*   55 */     this.Q = 1.0D;
/*   56 */     this.R = 0.0D;
/*   57 */     this.S = 0.0D;
/*   58 */     this.T = System.currentTimeMillis();
/*   59 */     this.U = 0L;
/*   60 */     this.V = false;
/*   61 */     this.e = 0.0F;
/*   62 */     this.f = 0.0F;
/*   63 */     this.g = 0.0F;
/*   64 */     this.h = 0.0F;
/*   65 */     this.W = new Random();
/*   66 */     this.X = 0;
/*   67 */     this.k = 0;
/*   68 */     this.l = 0;
/*   69 */     this.m = dl.e(16);
/*   70 */     this.r = minecraft;
/*   71 */     this.c = new jo(minecraft);
/*   72 */     this.d = minecraft.p.a(new BufferedImage(16, 16, 1));
/*   73 */     this.L = new int[256];
/*      */   }
/*      */ 
/*      */   public void a()
/*      */   {
/*   78 */     c();
/*   79 */     d();
/*   80 */     this.Y = this.Z;
/*   81 */     this.C = this.B;
/*   82 */     this.E = this.D;
/*   83 */     this.G = this.F;
/*   84 */     this.I = this.H;
/*   85 */     this.K = this.J;
/*   86 */     if (this.r.i == null)
/*      */     {
/*   88 */       this.r.i = this.r.h;
/*      */     }
/*   90 */     float f = this.r.f.c(et.b(this.r.i.o), et.b(this.r.i.p), et.b(this.r.i.q));
/*   91 */     float f1 = (3 - this.r.z.e) / 3.0F;
/*   92 */     float f2 = f * (1.0F - f1) + f1;
/*   93 */     this.Z += (f2 - this.Z) * 0.1F;
/*   94 */     this.t += 1;
/*   95 */     this.c.a();
/*   96 */     f();
/*      */   }
/*      */ 
/*      */   public void a(float f)
/*      */   {
/*  101 */     if (this.r.i == null)
/*      */     {
/*  103 */       return;
/*      */     }
/*  105 */     if (this.r.f == null)
/*      */     {
/*  107 */       return;
/*      */     }
/*  109 */     double d = this.r.c.b();
/*  110 */     this.r.y = this.r.i.a(d, f);
/*  111 */     double d1 = d;
/*  112 */     ax vec3d = this.r.i.g(f);
/*  113 */     if (this.r.y != null)
/*      */     {
/*  115 */       d1 = this.r.y.f.d(vec3d);
/*      */     }
/*  117 */     if (this.r.c.i())
/*      */     {
/*  119 */       d1 = d = 32.0D;
/*      */     }
/*      */     else {
/*  122 */       if (d1 > 3.0D)
/*      */       {
/*  124 */         d1 = 3.0D;
/*      */       }
/*  126 */       d = d1;
/*      */     }
/*  128 */     ax vec3d1 = this.r.i.h(f);
/*  129 */     ax vec3d2 = vec3d.c(vec3d1.a * d, vec3d1.b * d, vec3d1.c * d);
/*  130 */     this.u = null;
/*  131 */     float f1 = 1.0F;
/*  132 */     List list = this.r.f.b(this.r.i, this.r.i.y.a(vec3d1.a * d, vec3d1.b * d, vec3d1.c * d).b(f1, f1, f1));
/*  133 */     double d2 = 0.0D;
/*  134 */     for (int i = 0; i < list.size(); i++)
/*      */     {
/*  136 */       kj entity = (kj)list.get(i);
/*  137 */       if (entity.d_())
/*      */       {
/*  141 */         float f2 = entity.i_();
/*  142 */         rp axisalignedbb = entity.y.b(f2, f2, f2);
/*  143 */         ma movingobjectposition = axisalignedbb.a(vec3d, vec3d2);
/*  144 */         if (axisalignedbb.a(vec3d))
/*      */         {
/*  146 */           if ((0.0D < d2) || (d2 == 0.0D))
/*      */           {
/*  148 */             this.u = entity;
/*  149 */             d2 = 0.0D;
/*      */           }
/*      */ 
/*      */         }
/*  153 */         else if (movingobjectposition != null)
/*      */         {
/*  157 */           double d3 = vec3d.d(movingobjectposition.f);
/*  158 */           if ((d3 < d2) || (d2 == 0.0D))
/*      */           {
/*  160 */             this.u = entity;
/*  161 */             d2 = d3;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*  165 */     if (this.u != null)
/*      */     {
/*  167 */       this.r.y = new ma(this.u);
/*      */     }
/*      */   }
/*      */ 
/*      */   private void c()
/*      */   {
/*  173 */     qs entityplayersp = (qs)this.r.i;
/*  174 */     this.O = entityplayersp.u_();
/*  175 */     this.N = this.M;
/*  176 */     this.M += (this.O - this.M) * 0.5F;
/*      */   }
/*      */ 
/*      */   private float a(float f, boolean flag)
/*      */   {
/*  181 */     if (this.q > 0)
/*      */     {
/*  183 */       return 90.0F;
/*      */     }
/*  185 */     sz entityplayer = (sz)this.r.i;
/*  186 */     float f1 = 70.0F;
/*  187 */     if (flag)
/*      */     {
/*  189 */       f1 += this.r.z.L * 40.0F;
/*  190 */       f1 *= (this.N + (this.M - this.N) * f);
/*      */     }
/*  192 */     if (entityplayer.bz <= 0)
/*      */     {
/*  194 */       float f2 = entityplayer.bE + f;
/*  195 */       f1 /= ((1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F);
/*      */     }
/*  197 */     if (entityplayer.a(wa.g))
/*      */     {
/*  199 */       f1 = f1 * 60.0F / 70.0F;
/*      */     }
/*  201 */     return f1 + this.I + (this.H - this.I) * f;
/*      */   }
/*      */ 
/*      */   private void d(float f)
/*      */   {
/*  206 */     wd entityliving = this.r.i;
/*  207 */     float f1 = entityliving.bB - f;
/*  208 */     if (entityliving.bz <= 0)
/*      */     {
/*  210 */       float f2 = entityliving.bE + f;
/*  211 */       GL11.glRotatef(40.0F - 8000.0F / (f2 + 200.0F), 0.0F, 0.0F, 1.0F);
/*      */     }
/*  213 */     if (f1 < 0.0F)
/*      */     {
/*  215 */       return;
/*      */     }
/*      */ 
/*  218 */     f1 /= entityliving.bC;
/*  219 */     f1 = et.a(f1 * f1 * f1 * f1 * 3.141593F);
/*  220 */     float f3 = entityliving.bD;
/*  221 */     GL11.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
/*  222 */     GL11.glRotatef(-f1 * 14.0F, 0.0F, 0.0F, 1.0F);
/*  223 */     GL11.glRotatef(f3, 0.0F, 1.0F, 0.0F);
/*      */   }
/*      */ 
/*      */   private void e(float f)
/*      */   {
/*  230 */     if (!(this.r.i instanceof sz))
/*      */     {
/*  232 */       return;
/*      */     }
/*      */ 
/*  235 */     sz entityplayer = (sz)this.r.i;
/*  236 */     float f1 = entityplayer.L - entityplayer.K;
/*  237 */     float f2 = -(entityplayer.L + f1 * f);
/*  238 */     float f3 = entityplayer.az + (entityplayer.aA - entityplayer.az) * f;
/*  239 */     float f4 = entityplayer.bG + (entityplayer.bH - entityplayer.bG) * f;
/*  240 */     GL11.glTranslatef(et.a(f2 * 3.141593F) * f3 * 0.5F, -Math.abs(et.b(f2 * 3.141593F) * f3), 0.0F);
/*  241 */     GL11.glRotatef(et.a(f2 * 3.141593F) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
/*  242 */     GL11.glRotatef(Math.abs(et.b(f2 * 3.141593F - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
/*  243 */     GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
/*      */   }
/*      */ 
/*      */   private void f(float f)
/*      */   {
/*  250 */     wd entityliving = this.r.i;
/*  251 */     int grav = entityliving.getGravity();
/*  252 */     float f1 = entityliving.H - 1.62F;
/*  253 */     double d = entityliving.l + (entityliving.o - entityliving.l) * f;
/*  254 */     double dy = entityliving.m + (entityliving.p - entityliving.m) * f - f1 * grav;
/*  255 */     double d2 = entityliving.n + (entityliving.q - entityliving.n) * f;
/*  256 */     float roll = 0.0F;
/*  257 */     if (grav != 1)
/*      */     {
/*  259 */       roll = 180.0F;
/*      */     }
/*  261 */     if (this.J < roll)
/*      */     {
/*  263 */       this.J = ((float)(this.J + f * 20.0D));
/*  264 */       if (this.J > roll)
/*  265 */         this.J = roll;
/*      */     }
/*  267 */     if (this.J > roll)
/*      */     {
/*  269 */       this.J = ((float)(this.J + f * 20.0D));
/*  270 */       if (this.J - 360.0D > roll)
/*  271 */         this.J = roll;
/*      */     }
/*  273 */     GL11.glRotatef(this.J, 0.0F, 0.0F, 1.0F);
/*  274 */     if (entityliving.an())
/*      */     {
/*  276 */       f1 = (float)(f1 + 1.0D);
/*  277 */       GL11.glTranslatef(0.0F, 0.3F * grav, 0.0F);
/*  278 */       if (!this.r.z.I)
/*      */       {
/*  280 */         int i = this.r.f.a(et.b(entityliving.o), et.b(entityliving.p), et.b(entityliving.q));
/*  281 */         if (i == lr.T.bA)
/*      */         {
/*  283 */           int j = this.r.f.e(et.b(entityliving.o), et.b(entityliving.p), et.b(entityliving.q));
/*  284 */           int k = j & 0x3;
/*  285 */           GL11.glRotatef(k * 90, 0.0F, 1.0F, 0.0F);
/*      */         }
/*  287 */         float angleYaw = entityliving.w + (entityliving.u - entityliving.w) * f;
/*  288 */         GL11.glRotatef(angleYaw * grav + 180.0F, 0.0F, -1.0F, 0.0F);
/*  289 */         float anglePitch = entityliving.x + (entityliving.v - entityliving.x) * f;
/*  290 */         GL11.glRotatef(anglePitch * grav, -1.0F, 0.0F, 0.0F);
/*      */       }
/*      */     }
/*  293 */     else if (this.r.z.D)
/*      */     {
/*  295 */       double d3 = this.C + (this.B - this.C) * f;
/*  296 */       if (this.r.z.I)
/*      */       {
/*  298 */         float f2 = this.E + (this.D - this.E) * f;
/*  299 */         float f4 = this.G + (this.F - this.G) * f;
/*  300 */         GL11.glTranslatef(0.0F, 0.0F, (float)-d3);
/*  301 */         GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
/*  302 */         GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*      */       }
/*      */       else {
/*  305 */         float f3 = entityliving.u;
/*  306 */         float f5 = entityliving.v;
/*  307 */         double d4 = -et.a(f3 / 180.0F * 3.141593F) * et.b(f5 / 180.0F * 3.141593F) * d3;
/*  308 */         double d5 = et.b(f3 / 180.0F * 3.141593F) * et.b(f5 / 180.0F * 3.141593F) * d3;
/*  309 */         double d6 = -et.a(f5 / 180.0F * 3.141593F) * d3;
/*  310 */         for (int l = 0; l < 8; l++)
/*      */         {
/*  312 */           float f6 = (l & 0x1) * 2 - 1;
/*  313 */           float f7 = (l >> 1 & 0x1) * 2 - 1;
/*  314 */           float f8 = (l >> 2 & 0x1) * 2 - 1;
/*  315 */           f6 *= 0.1F;
/*  316 */           f7 *= 0.1F;
/*  317 */           f8 *= 0.1F;
/*  318 */           ma movingobjectposition = this.r.f.a(ax.b(d + f6, dy + f7, d2 + f8), ax.b(d - d4 + f6 + f8, dy - d6 + f7, d2 - d5 + f8));
/*  319 */           if (movingobjectposition != null)
/*      */           {
/*  323 */             double d7 = movingobjectposition.f.d(ax.b(d, dy, d2));
/*  324 */             if (d7 < d3)
/*      */             {
/*  326 */               d3 = d7;
/*      */             }
/*      */           }
/*      */         }
/*  330 */         GL11.glRotatef(entityliving.v - f5, 1.0F, 0.0F, 0.0F);
/*  331 */         GL11.glRotatef(entityliving.u - f3, 0.0F, 1.0F, 0.0F);
/*  332 */         GL11.glTranslatef(0.0F, 0.0F, (float)-d3);
/*  333 */         GL11.glRotatef(f3 - entityliving.u, 0.0F, 1.0F, 0.0F);
/*  334 */         GL11.glRotatef(f5 - entityliving.v, 1.0F, 0.0F, 0.0F);
/*      */       }
/*      */     }
/*      */     else {
/*  338 */       GL11.glTranslatef(0.0F, 0.0F, -0.1F);
/*      */     }
/*  340 */     if (!this.r.z.I)
/*      */     {
/*  342 */       GL11.glRotatef(entityliving.x + (entityliving.v - entityliving.x) * f, 1.0F, 0.0F, 0.0F);
/*  343 */       GL11.glRotatef(entityliving.w + (entityliving.u - entityliving.w) * f + 180.0F, 0.0F, 1.0F, 0.0F);
/*      */     }
/*  345 */     GL11.glTranslatef(0.0F, f1, 0.0F);
/*  346 */     d = entityliving.l + (entityliving.o - entityliving.l) * f;
/*  347 */     dy = entityliving.m + (entityliving.p - entityliving.m) * f - f1 * grav;
/*  348 */     d2 = entityliving.n + (entityliving.q - entityliving.n) * f;
/*  349 */     this.P = this.r.g.a(d, dy, d2, f);
/*      */   }
/*      */ 
/*      */   private void a(float f, int i)
/*      */   {
/*  354 */     this.s = (256 >> this.r.z.e);
/*  355 */     GL11.glMatrixMode(5889);
/*  356 */     GL11.glLoadIdentity();
/*  357 */     float f1 = 0.07F;
/*  358 */     if (this.r.z.g)
/*      */     {
/*  360 */       GL11.glTranslatef(-(i * 2 - 1) * f1, 0.0F, 0.0F);
/*      */     }
/*  362 */     if (this.Q != 1.0D)
/*      */     {
/*  364 */       GL11.glTranslatef((float)this.R, (float)-this.S, 0.0F);
/*  365 */       GL11.glScaled(this.Q, this.Q, 1.0D);
/*  366 */       GLU.gluPerspective(a(f, true), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
/*      */     }
/*      */     else {
/*  369 */       GLU.gluPerspective(a(f, true), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
/*      */     }
/*  371 */     if (this.r.c.e())
/*      */     {
/*  373 */       float f2 = 0.6666667F;
/*  374 */       GL11.glScalef(1.0F, f2, 1.0F);
/*      */     }
/*  376 */     GL11.glMatrixMode(5888);
/*  377 */     GL11.glLoadIdentity();
/*  378 */     if (this.r.z.g)
/*      */     {
/*  380 */       GL11.glTranslatef((i * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*      */     }
/*  382 */     d(f);
/*  383 */     if (this.r.z.f)
/*      */     {
/*  385 */       e(f);
/*      */     }
/*  387 */     float f3 = this.r.h.aV + (this.r.h.aU - this.r.h.aV) * f;
/*  388 */     if (f3 > 0.0F)
/*      */     {
/*  390 */       int j = 20;
/*  391 */       if (this.r.h.a(ud.k))
/*      */       {
/*  393 */         j = 7;
/*      */       }
/*  395 */       float f4 = 5.0F / (f3 * f3 + 5.0F) - f3 * 0.04F;
/*  396 */       f4 *= f4;
/*  397 */       GL11.glRotatef((this.t + f) * j, 0.0F, 1.0F, 1.0F);
/*  398 */       GL11.glScalef(1.0F / f4, 1.0F, 1.0F);
/*  399 */       GL11.glRotatef(-(this.t + f) * j, 0.0F, 1.0F, 1.0F);
/*      */     }
/*  401 */     f(f);
/*  402 */     if (this.q > 0)
/*      */     {
/*  404 */       int k = this.q - 1;
/*  405 */       if (k == 1)
/*      */       {
/*  407 */         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/*      */       }
/*  409 */       if (k == 2)
/*      */       {
/*  411 */         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*      */       }
/*  413 */       if (k == 3)
/*      */       {
/*  415 */         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/*      */       }
/*  417 */       if (k == 4)
/*      */       {
/*  419 */         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*      */       }
/*  421 */       if (k == 5)
/*      */       {
/*  423 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   private void b(float f, int i)
/*      */   {
/*  430 */     if (this.q > 0)
/*      */     {
/*  432 */       return;
/*      */     }
/*  434 */     GL11.glMatrixMode(5889);
/*  435 */     GL11.glLoadIdentity();
/*  436 */     float f1 = 0.07F;
/*  437 */     if (this.r.z.g)
/*      */     {
/*  439 */       GL11.glTranslatef(-(i * 2 - 1) * f1, 0.0F, 0.0F);
/*      */     }
/*  441 */     if (this.Q != 1.0D)
/*      */     {
/*  443 */       GL11.glTranslatef((float)this.R, (float)-this.S, 0.0F);
/*  444 */       GL11.glScaled(this.Q, this.Q, 1.0D);
/*  445 */       GLU.gluPerspective(a(f, false), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
/*      */     }
/*      */     else {
/*  448 */       GLU.gluPerspective(a(f, false), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
/*      */     }
/*  450 */     if (this.r.c.e())
/*      */     {
/*  452 */       float f2 = 0.6666667F;
/*  453 */       GL11.glScalef(1.0F, f2, 1.0F);
/*      */     }
/*  455 */     GL11.glMatrixMode(5888);
/*  456 */     GL11.glLoadIdentity();
/*  457 */     if (this.r.z.g)
/*      */     {
/*  459 */       GL11.glTranslatef((i * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*      */     }
/*  461 */     GL11.glPushMatrix();
/*  462 */     d(f);
/*  463 */     if (this.r.z.f)
/*      */     {
/*  465 */       e(f);
/*      */     }
/*  467 */     if ((!this.r.z.D) && (!this.r.i.an()) && (!this.r.z.C) && (!this.r.c.e()))
/*      */     {
/*  469 */       b(f);
/*  470 */       this.c.a(f);
/*  471 */       a(f);
/*      */     }
/*  473 */     GL11.glPopMatrix();
/*  474 */     if ((!this.r.z.D) && (!this.r.i.an()))
/*      */     {
/*  476 */       this.c.b(f);
/*  477 */       d(f);
/*      */     }
/*  479 */     if (this.r.z.f)
/*      */     {
/*  481 */       e(f);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(double d)
/*      */   {
/*  487 */     GL13.glClientActiveTexture(33985);
/*  488 */     GL13.glActiveTexture(33985);
/*  489 */     GL11.glDisable(3553);
/*  490 */     GL13.glClientActiveTexture(33984);
/*  491 */     GL13.glActiveTexture(33984);
/*      */   }
/*      */ 
/*      */   public void b(double d)
/*      */   {
/*  496 */     GL13.glClientActiveTexture(33985);
/*  497 */     GL13.glActiveTexture(33985);
/*  498 */     GL11.glMatrixMode(5890);
/*  499 */     GL11.glLoadIdentity();
/*  500 */     float f = 0.0039063F;
/*  501 */     GL11.glScalef(f, f, f);
/*  502 */     GL11.glTranslatef(8.0F, 8.0F, 8.0F);
/*  503 */     GL11.glMatrixMode(5888);
/*  504 */     this.r.p.b(this.d);
/*  505 */     GL11.glTexParameteri(3553, 10241, 9729);
/*  506 */     GL11.glTexParameteri(3553, 10240, 9729);
/*  507 */     GL11.glTexParameteri(3553, 10241, 9729);
/*  508 */     GL11.glTexParameteri(3553, 10240, 9729);
/*  509 */     GL11.glTexParameteri(3553, 10242, 10496);
/*  510 */     GL11.glTexParameteri(3553, 10243, 10496);
/*  511 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  512 */     GL11.glEnable(3553);
/*  513 */     GL13.glClientActiveTexture(33984);
/*  514 */     GL13.glActiveTexture(33984);
/*      */   }
/*      */ 
/*      */   private void d()
/*      */   {
/*  519 */     this.f = ((float)(this.f + (Math.random() - Math.random()) * Math.random() * Math.random()));
/*  520 */     this.h = ((float)(this.h + (Math.random() - Math.random()) * Math.random() * Math.random()));
/*  521 */     this.f = ((float)(this.f * 0.9D));
/*  522 */     this.h = ((float)(this.h * 0.9D));
/*  523 */     this.e += (this.f - this.e) * 1.0F;
/*  524 */     this.g += (this.h - this.g) * 1.0F;
/*  525 */     this.V = true;
/*      */   }
/*      */ 
/*      */   private void e()
/*      */   {
/*  530 */     rv world = this.r.f;
/*  531 */     if (world == null)
/*      */     {
/*  533 */       return;
/*      */     }
/*  535 */     for (int i = 0; i < 256; i++)
/*      */     {
/*  537 */       float f = world.b(1.0F) * 0.95F + 0.05F;
/*  538 */       float f1 = world.y.f[(i / 16)] * f;
/*  539 */       float f2 = world.y.f[(i % 16)] * (this.e * 0.1F + 1.5F);
/*  540 */       if (world.s > 0)
/*      */       {
/*  542 */         f1 = world.y.f[(i / 16)];
/*      */       }
/*  544 */       float f3 = f1 * (world.b(1.0F) * 0.65F + 0.35F);
/*  545 */       float f4 = f1 * (world.b(1.0F) * 0.65F + 0.35F);
/*  546 */       float f5 = f1;
/*  547 */       float f6 = f2;
/*  548 */       float f7 = f2 * ((f2 * 0.6F + 0.4F) * 0.6F + 0.4F);
/*  549 */       float f8 = f2 * (f2 * f2 * 0.6F + 0.4F);
/*  550 */       float f9 = f3 + f6;
/*  551 */       float f10 = f4 + f7;
/*  552 */       float f11 = f5 + f8;
/*  553 */       f9 = f9 * 0.96F + 0.03F;
/*  554 */       f10 = f10 * 0.96F + 0.03F;
/*  555 */       f11 = f11 * 0.96F + 0.03F;
/*  556 */       float f12 = this.r.z.M;
/*  557 */       if (f9 > 1.0F)
/*      */       {
/*  559 */         f9 = 1.0F;
/*      */       }
/*  561 */       if (f10 > 1.0F)
/*      */       {
/*  563 */         f10 = 1.0F;
/*      */       }
/*  565 */       if (f11 > 1.0F)
/*      */       {
/*  567 */         f11 = 1.0F;
/*      */       }
/*  569 */       float f13 = 1.0F - f9;
/*  570 */       float f14 = 1.0F - f10;
/*  571 */       float f15 = 1.0F - f11;
/*  572 */       f13 = 1.0F - f13 * f13 * f13 * f13;
/*  573 */       f14 = 1.0F - f14 * f14 * f14 * f14;
/*  574 */       f15 = 1.0F - f15 * f15 * f15 * f15;
/*  575 */       f9 = f9 * (1.0F - f12) + f13 * f12;
/*  576 */       f10 = f10 * (1.0F - f12) + f14 * f12;
/*  577 */       f11 = f11 * (1.0F - f12) + f15 * f12;
/*  578 */       f9 = f9 * 0.96F + 0.03F;
/*  579 */       f10 = f10 * 0.96F + 0.03F;
/*  580 */       f11 = f11 * 0.96F + 0.03F;
/*  581 */       if (f9 > 1.0F)
/*      */       {
/*  583 */         f9 = 1.0F;
/*      */       }
/*  585 */       if (f10 > 1.0F)
/*      */       {
/*  587 */         f10 = 1.0F;
/*      */       }
/*  589 */       if (f11 > 1.0F)
/*      */       {
/*  591 */         f11 = 1.0F;
/*      */       }
/*  593 */       if (f9 < 0.0F)
/*      */       {
/*  595 */         f9 = 0.0F;
/*      */       }
/*  597 */       if (f10 < 0.0F)
/*      */       {
/*  599 */         f10 = 0.0F;
/*      */       }
/*  601 */       if (f11 < 0.0F)
/*      */       {
/*  603 */         f11 = 0.0F;
/*      */       }
/*  605 */       char c = 'ÿ';
/*  606 */       int j = (int)(f9 * 255.0F);
/*  607 */       int k = (int)(f10 * 255.0F);
/*  608 */       int l = (int)(f11 * 255.0F);
/*  609 */       this.L[i] = (c << '\030' | j << 16 | k << 8 | l);
/*      */     }
/*      */ 
/*  612 */     this.r.p.a(this.L, 16, 16, this.d);
/*      */   }
/*      */ 
/*      */   public void b(float f)
/*      */   {
/*  617 */     if (this.V)
/*      */     {
/*  619 */       e();
/*      */     }
/*  621 */     if (!Display.isActive())
/*      */     {
/*  623 */       if (System.currentTimeMillis() - this.T > 500L)
/*      */       {
/*  625 */         this.r.i();
/*      */       }
/*      */     }
/*      */     else {
/*  629 */       this.T = System.currentTimeMillis();
/*      */     }
/*  631 */     if (this.r.O)
/*      */     {
/*  633 */       this.r.C.c();
/*  634 */       float f1 = this.r.z.c * 0.6F + 0.2F;
/*  635 */       float f2 = f1 * f1 * f1 * 8.0F;
/*  636 */       float f3 = this.r.C.a * f2;
/*  637 */       float f4 = this.r.C.b * f2;
/*  638 */       int l = 1;
/*  639 */       if (this.r.z.d)
/*      */       {
/*  641 */         l = -1;
/*      */       }
/*  643 */       if (this.r.z.H)
/*      */       {
/*  645 */         f3 = this.v.a(f3, 0.05F * f2);
/*  646 */         f4 = this.w.a(f4, 0.05F * f2);
/*      */       }
/*  648 */       this.r.h.c(f3, f4 * l);
/*      */     }
/*  650 */     if (this.r.w)
/*      */     {
/*  652 */       return;
/*      */     }
/*  654 */     a = this.r.z.g;
/*  655 */     za scaledresolution = new za(this.r.z, this.r.d, this.r.e);
/*  656 */     int i = scaledresolution.a();
/*  657 */     int j = scaledresolution.b();
/*  658 */     int k = Mouse.getX() * i / this.r.d;
/*  659 */     int i1 = j - Mouse.getY() * j / this.r.e - 1;
/*  660 */     char c = 'È';
/*  661 */     if (this.r.z.i == 1)
/*      */     {
/*  663 */       c = 'x';
/*      */     }
/*  665 */     if (this.r.z.i == 2)
/*      */     {
/*  667 */       c = '(';
/*      */     }
/*  669 */     if (this.r.f != null)
/*      */     {
/*  671 */       if (this.r.z.i == 0)
/*      */       {
/*  673 */         a(f, 0L);
/*      */       }
/*      */       else {
/*  676 */         a(f, this.U + 1000000000 / c);
/*      */       }
/*  678 */       if (this.r.z.i == 2)
/*      */       {
/*  680 */         long l1 = (this.U + 1000000000 / c - System.nanoTime()) / 1000000L;
/*  681 */         if ((l1 > 0L) && (l1 < 500L))
/*      */         {
/*      */           try
/*      */           {
/*  685 */             Thread.sleep(l1);
/*      */           }
/*      */           catch (InterruptedException interruptedexception)
/*      */           {
/*  689 */             interruptedexception.printStackTrace();
/*      */           }
/*      */         }
/*      */       }
/*  693 */       this.U = System.nanoTime();
/*  694 */       if ((!this.r.z.C) || (this.r.r != null))
/*      */       {
/*  696 */         this.r.v.a(f, this.r.r != null, k, i1);
/*      */       }
/*      */     }
/*      */     else {
/*  700 */       GL11.glViewport(0, 0, this.r.d, this.r.e);
/*  701 */       GL11.glMatrixMode(5889);
/*  702 */       GL11.glLoadIdentity();
/*  703 */       GL11.glMatrixMode(5888);
/*  704 */       GL11.glLoadIdentity();
/*  705 */       b();
/*  706 */       if (this.r.z.i == 2)
/*      */       {
/*  708 */         long l2 = (this.U + 1000000000 / c - System.nanoTime()) / 1000000L;
/*  709 */         if (l2 < 0L)
/*      */         {
/*  711 */           l2 += 10L;
/*      */         }
/*  713 */         if ((l2 > 0L) && (l2 < 500L))
/*      */         {
/*      */           try
/*      */           {
/*  717 */             Thread.sleep(l2);
/*      */           }
/*      */           catch (InterruptedException interruptedexception1)
/*      */           {
/*  721 */             interruptedexception1.printStackTrace();
/*      */           }
/*      */         }
/*      */       }
/*  725 */       this.U = System.nanoTime();
/*      */     }
/*  727 */     if (this.r.r != null)
/*      */     {
/*  729 */       GL11.glClear(256);
/*  730 */       this.r.r.a(k, i1, f);
/*  731 */       if ((this.r.r != null) && (this.r.r.r != null))
/*      */       {
/*  733 */         this.r.r.r.a(f);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(float f, long l)
/*      */   {
/*  740 */     GL11.glEnable(2884);
/*  741 */     GL11.glEnable(2929);
/*  742 */     if (this.r.i == null)
/*      */     {
/*  744 */       this.r.i = this.r.h;
/*      */     }
/*  746 */     a(f);
/*  747 */     wd entityliving = this.r.i;
/*  748 */     i renderglobal = this.r.g;
/*  749 */     bz effectrenderer = this.r.j;
/*  750 */     double d = entityliving.N + (entityliving.o - entityliving.N) * f;
/*  751 */     double d1 = entityliving.O + (entityliving.p - entityliving.O) * f;
/*  752 */     double d2 = entityliving.P + (entityliving.q - entityliving.P) * f;
/*  753 */     bf ichunkprovider = this.r.f.w();
/*  754 */     if ((ichunkprovider instanceof fx))
/*      */     {
/*  756 */       fx chunkproviderloadorgenerate = (fx)ichunkprovider;
/*  757 */       int j = et.d((int)d) >> 4;
/*  758 */       int k = et.d((int)d2) >> 4;
/*  759 */       chunkproviderloadorgenerate.d(j, k);
/*      */     }
/*  761 */     for (int i = 0; i < 2; i++)
/*      */     {
/*  763 */       if (this.r.z.g)
/*      */       {
/*  765 */         b = i;
/*  766 */         if (b == 0)
/*      */         {
/*  768 */           GL11.glColorMask(false, true, true, false);
/*      */         }
/*      */         else {
/*  771 */           GL11.glColorMask(true, false, false, false);
/*      */         }
/*      */       }
/*  774 */       GL11.glViewport(0, 0, this.r.d, this.r.e);
/*  775 */       g(f);
/*  776 */       GL11.glClear(16640);
/*  777 */       GL11.glEnable(2884);
/*  778 */       a(f, i);
/*  779 */       o.a();
/*  780 */       if (this.r.z.e < 2)
/*      */       {
/*  782 */         a(-1, f);
/*  783 */         renderglobal.a(f);
/*      */       }
/*  785 */       GL11.glEnable(2912);
/*  786 */       a(1, f);
/*  787 */       if (this.r.z.k)
/*      */       {
/*  789 */         GL11.glShadeModel(7425);
/*      */       }
/*  791 */       km frustrum = new km();
/*  792 */       frustrum.a(d, d1, d2);
/*  793 */       this.r.g.a(frustrum, f);
/*      */ 
/*  795 */       if (i == 0)
/*      */       {
/*      */         long l1;
/*      */         do {
/*  799 */           if ((this.r.g.a(entityliving, false)) || (l == 0L))
/*      */           {
/*      */             break;
/*      */           }
/*  803 */           l1 = l - System.nanoTime();
/*  804 */         }while ((l1 >= 0L) && (l1 <= 1000000000L));
/*      */       }
/*  806 */       a(0, f);
/*  807 */       GL11.glEnable(2912);
/*  808 */       GL11.glBindTexture(3553, this.r.p.b("/terrain.png"));
/*  809 */       ow.a();
/*  810 */       renderglobal.a(entityliving, 0, f);
/*  811 */       GL11.glShadeModel(7424);
/*  812 */       if (this.q == 0)
/*      */       {
/*  814 */         ow.b();
/*  815 */         renderglobal.a(entityliving.g(f), frustrum, f);
/*  816 */         b(f);
/*  817 */         effectrenderer.b(entityliving, f);
/*  818 */         ow.a();
/*  819 */         a(0, f);
/*  820 */         effectrenderer.a(entityliving, f);
/*  821 */         a(f);
/*  822 */         if ((this.r.y != null) && (entityliving.a(wa.g)) && ((entityliving instanceof sz)))
/*      */         {
/*  824 */           sz entityplayer = (sz)entityliving;
/*  825 */           GL11.glDisable(3008);
/*  826 */           if (!MineUpForgeAdapter.get().forgeHooksClientOnBlockHighlight(renderglobal, entityplayer, this.r.y, 0, entityplayer.as.b(), f))
/*      */           {
/*  828 */             renderglobal.a(entityplayer, this.r.y, 0, entityplayer.as.b(), f);
/*      */ 
/*  830 */             renderglobal.b(entityplayer, this.r.y, 0, entityplayer.as.b(), f);
/*      */           }
/*      */ 
/*  833 */           GL11.glEnable(3008);
/*      */         }
/*      */       }
/*  836 */       GL11.glDisable(3042);
/*  837 */       GL11.glEnable(2884);
/*  838 */       GL11.glBlendFunc(770, 771);
/*  839 */       GL11.glDepthMask(true);
/*  840 */       a(0, f);
/*  841 */       GL11.glEnable(3042);
/*  842 */       GL11.glDisable(2884);
/*  843 */       GL11.glBindTexture(3553, this.r.p.b("/terrain.png"));
/*  844 */       if (this.r.z.j)
/*      */       {
/*  846 */         if (this.r.z.k)
/*      */         {
/*  848 */           GL11.glShadeModel(7425);
/*      */         }
/*  850 */         GL11.glColorMask(false, false, false, false);
/*  851 */         int i1 = renderglobal.a(entityliving, 1, f);
/*  852 */         if (this.r.z.g)
/*      */         {
/*  854 */           if (b == 0)
/*      */           {
/*  856 */             GL11.glColorMask(false, true, true, true);
/*      */           }
/*      */           else {
/*  859 */             GL11.glColorMask(true, false, false, true);
/*      */           }
/*      */         }
/*      */         else {
/*  863 */           GL11.glColorMask(true, true, true, true);
/*      */         }
/*  865 */         if (i1 > 0)
/*      */         {
/*  867 */           renderglobal.a(1, f);
/*      */         }
/*  869 */         GL11.glShadeModel(7424);
/*      */       }
/*      */       else {
/*  872 */         renderglobal.a(entityliving, 1, f);
/*      */       }
/*  874 */       GL11.glDepthMask(true);
/*  875 */       GL11.glEnable(2884);
/*  876 */       GL11.glDisable(3042);
/*  877 */       if ((this.Q == 1.0D) && ((entityliving instanceof sz)) && (this.r.y != null) && (!entityliving.a(wa.g)))
/*      */       {
/*  879 */         sz entityplayer1 = (sz)entityliving;
/*  880 */         GL11.glDisable(3008);
/*  881 */         if (!MineUpForgeAdapter.get().forgeHooksClientOnBlockHighlight(renderglobal, entityplayer1, this.r.y, 0, entityplayer1.as.b(), f))
/*      */         {
/*  883 */           renderglobal.a(entityplayer1, this.r.y, 0, entityplayer1.as.b(), f);
/*      */ 
/*  885 */           renderglobal.b(entityplayer1, this.r.y, 0, entityplayer1.as.b(), f);
/*      */         }
/*      */ 
/*  888 */         GL11.glEnable(3008);
/*      */       }
/*  890 */       c(f);
/*  891 */       GL11.glDisable(2912);
/*  892 */       if (this.u == null);
/*  893 */       GL11.glPushMatrix();
/*  894 */       a(0, f);
/*  895 */       GL11.glEnable(2912);
/*  896 */       renderglobal.b(f);
/*  897 */       GL11.glDisable(2912);
/*  898 */       a(1, f);
/*  899 */       GL11.glPopMatrix();
/*  900 */       if (this.Q == 1.0D)
/*      */       {
/*  902 */         GL11.glClear(256);
/*  903 */         b(f, i);
/*      */       }
/*  905 */       if (!this.r.z.g)
/*      */       {
/*  907 */         return;
/*      */       }
/*      */     }
/*      */ 
/*  911 */     GL11.glColorMask(true, true, true, false);
/*      */   }
/*      */ 
/*      */   private void f()
/*      */   {
/*  916 */     float f = this.r.f.i(1.0F);
/*  917 */     if (!this.r.z.j)
/*      */     {
/*  919 */       f /= 2.0F;
/*      */     }
/*  921 */     if (f == 0.0F)
/*      */     {
/*  923 */       return;
/*      */     }
/*  925 */     this.W.setSeed(this.t * 312987231L);
/*  926 */     wd entityliving = this.r.i;
/*  927 */     rv world = this.r.f;
/*  928 */     int i = et.b(entityliving.o);
/*  929 */     int j = et.b(entityliving.p);
/*  930 */     int k = et.b(entityliving.q);
/*  931 */     byte byte0 = 10;
/*  932 */     double d = 0.0D;
/*  933 */     double d1 = 0.0D;
/*  934 */     double d2 = 0.0D;
/*  935 */     int l = 0;
/*  936 */     for (int i1 = 0; i1 < (int)(100.0F * f * f); i1++)
/*      */     {
/*  938 */       int j1 = i + this.W.nextInt(byte0) - this.W.nextInt(byte0);
/*  939 */       int k1 = k + this.W.nextInt(byte0) - this.W.nextInt(byte0);
/*  940 */       int l1 = world.e(j1, k1);
/*  941 */       int i2 = world.a(j1, l1 - 1, k1);
/*  942 */       if ((l1 <= j + byte0) && (l1 >= j - byte0) && (world.a().a(j1, k1).c()))
/*      */       {
/*  946 */         float f1 = this.W.nextFloat();
/*  947 */         float f2 = this.W.nextFloat();
/*  948 */         if (i2 > 0)
/*      */         {
/*  952 */           if (lr.m[i2].bN == wa.h)
/*      */           {
/*  954 */             this.r.j.a(new adf(world, j1 + f1, l1 + 0.1F - lr.m[i2].bG, k1 + f2, 0.0D, 0.0D, 0.0D));
/*      */           }
/*      */           else {
/*  957 */             if (this.W.nextInt(++l) == 0)
/*      */             {
/*  959 */               d = j1 + f1;
/*  960 */               d1 = l1 + 0.1F - lr.m[i2].bG;
/*  961 */               d2 = k1 + f2;
/*      */             }
/*  963 */             this.r.j.a(new nl(world, j1 + f1, l1 + 0.1F - lr.m[i2].bG, k1 + f2));
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*  966 */     if ((l > 0) && (this.W.nextInt(3) < this.X++))
/*      */     {
/*  968 */       this.X = 0;
/*  969 */       if ((d1 > entityliving.p + 1.0D) && (world.e(et.b(entityliving.o), et.b(entityliving.q)) > et.b(entityliving.p)))
/*      */       {
/*  971 */         this.r.f.a(d, d1, d2, "ambient.weather.rain", 0.1F, 0.5F);
/*      */       }
/*      */       else
/*  974 */         this.r.f.a(d, d1, d2, "ambient.weather.rain", 0.2F, 1.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void c(float f)
/*      */   {
/*  981 */     float f1 = this.r.f.i(f);
/*  982 */     if (f1 <= 0.0F)
/*      */     {
/*  984 */       return;
/*      */     }
/*  986 */     b(f);
/*  987 */     if (this.i == null)
/*      */     {
/*  989 */       this.i = new float[1024];
/*  990 */       this.j = new float[1024];
/*  991 */       for (int i = 0; i < 32; i++)
/*      */       {
/*  993 */         for (int j = 0; j < 32; j++)
/*      */         {
/*  995 */           float f2 = j - 16;
/*  996 */           float f3 = i - 16;
/*  997 */           float f4 = et.c(f2 * f2 + f3 * f3);
/*  998 */           this.i[(i << 5 | j)] = (-f3 / f4);
/*  999 */           this.j[(i << 5 | j)] = (f2 / f4);
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1005 */     wd entityliving = this.r.i;
/* 1006 */     rv world = this.r.f;
/* 1007 */     int k = et.b(entityliving.o);
/* 1008 */     int l = et.b(entityliving.p);
/* 1009 */     int i1 = et.b(entityliving.q);
/* 1010 */     xe tessellator = xe.a;
/* 1011 */     GL11.glDisable(2884);
/* 1012 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 1013 */     GL11.glEnable(3042);
/* 1014 */     GL11.glBlendFunc(770, 771);
/* 1015 */     GL11.glAlphaFunc(516, 0.01F);
/* 1016 */     GL11.glBindTexture(3553, this.r.p.b("/environment/snow.png"));
/* 1017 */     double d = entityliving.N + (entityliving.o - entityliving.N) * f;
/* 1018 */     double d1 = entityliving.O + (entityliving.p - entityliving.O) * f;
/* 1019 */     double d2 = entityliving.P + (entityliving.q - entityliving.P) * f;
/* 1020 */     int j1 = et.b(d1);
/* 1021 */     int k1 = 5;
/* 1022 */     if (this.r.z.j)
/*      */     {
/* 1024 */       k1 = 10;
/*      */     }
/* 1026 */     vh[] abiomegenbase = world.a().a(k - k1, i1 - k1, k1 * 2 + 1, k1 * 2 + 1);
/* 1027 */     int l1 = 0;
/* 1028 */     byte byte0 = -1;
/* 1029 */     float f5 = this.t + f;
/* 1030 */     if (this.r.z.j)
/*      */     {
/* 1032 */       k1 = 10;
/*      */     }
/* 1034 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1035 */     l1 = 0;
/* 1036 */     for (int i2 = k - k1; i2 <= k + k1; i2++)
/*      */     {
/* 1038 */       for (int j2 = i1 - k1; j2 <= i1 + k1; j2++)
/*      */       {
/* 1040 */         int k2 = (j2 - i1 + 16) * 32 + (i2 - k + 16);
/* 1041 */         float f6 = this.i[k2] * 0.5F;
/* 1042 */         float f7 = this.j[k2] * 0.5F;
/* 1043 */         vh biomegenbase = abiomegenbase[(l1++)];
/* 1044 */         if ((biomegenbase.c()) || (biomegenbase.b()))
/*      */         {
/* 1048 */           int l2 = world.e(i2, j2);
/* 1049 */           int i3 = l - k1;
/* 1050 */           int j3 = l + k1;
/* 1051 */           if (i3 < l2)
/*      */           {
/* 1053 */             i3 = l2;
/*      */           }
/* 1055 */           if (j3 < l2)
/*      */           {
/* 1057 */             j3 = l2;
/*      */           }
/* 1059 */           float f8 = 1.0F;
/* 1060 */           int k3 = l2;
/* 1061 */           if (k3 < j1)
/*      */           {
/* 1063 */             k3 = j1;
/*      */           }
/* 1065 */           if (i3 != j3)
/*      */           {
/* 1069 */             this.W.setSeed(i2 * i2 * 3121 + i2 * 45238971 ^ j2 * j2 * 418711 + j2 * 13761);
/* 1070 */             if (biomegenbase.c())
/*      */             {
/* 1072 */               if (byte0 != 0)
/*      */               {
/* 1074 */                 if (byte0 >= 0)
/*      */                 {
/* 1076 */                   tessellator.a();
/*      */                 }
/* 1078 */                 byte0 = 0;
/* 1079 */                 GL11.glBindTexture(3553, this.r.p.b("/environment/rain.png"));
/* 1080 */                 tessellator.b();
/*      */               }
/* 1082 */               float f9 = ((this.t + i2 * i2 * 3121 + i2 * 45238971 + j2 * j2 * 418711 + j2 * 13761 & 0x1F) + f) / 32.0F * (3.0F + this.W.nextFloat());
/* 1083 */               double d3 = i2 + 0.5F - entityliving.o;
/* 1084 */               double d4 = j2 + 0.5F - entityliving.q;
/* 1085 */               float f13 = et.a(d3 * d3 + d4 * d4) / k1;
/* 1086 */               float f14 = 1.0F;
/* 1087 */               tessellator.b(world.b(i2, k3, j2, 0));
/* 1088 */               tessellator.a(f14, f14, f14, ((1.0F - f13 * f13) * 0.5F + 0.5F) * f1);
/* 1089 */               tessellator.b(-d * 1.0D, -d1 * 1.0D, -d2 * 1.0D);
/* 1090 */               tessellator.a(i2 - f6 + 0.5D, i3, j2 - f7 + 0.5D, 0.0F * f8, i3 * f8 / 4.0F + f9 * f8);
/* 1091 */               tessellator.a(i2 + f6 + 0.5D, i3, j2 + f7 + 0.5D, 1.0F * f8, i3 * f8 / 4.0F + f9 * f8);
/* 1092 */               tessellator.a(i2 + f6 + 0.5D, j3, j2 + f7 + 0.5D, 1.0F * f8, j3 * f8 / 4.0F + f9 * f8);
/* 1093 */               tessellator.a(i2 - f6 + 0.5D, j3, j2 - f7 + 0.5D, 0.0F * f8, j3 * f8 / 4.0F + f9 * f8);
/* 1094 */               tessellator.b(0.0D, 0.0D, 0.0D);
/*      */             }
/*      */             else {
/* 1097 */               if (byte0 != 1)
/*      */               {
/* 1099 */                 if (byte0 >= 0)
/*      */                 {
/* 1101 */                   tessellator.a();
/*      */                 }
/* 1103 */                 byte0 = 1;
/* 1104 */                 GL11.glBindTexture(3553, this.r.p.b("/environment/snow.png"));
/* 1105 */                 tessellator.b();
/*      */               }
/* 1107 */               float f10 = ((this.t & 0x1FF) + f) / 512.0F;
/* 1108 */               float f11 = this.W.nextFloat() + f5 * 0.01F * (float)this.W.nextGaussian();
/* 1109 */               float f12 = this.W.nextFloat() + f5 * (float)this.W.nextGaussian() * 0.001F;
/* 1110 */               double d5 = i2 + 0.5F - entityliving.o;
/* 1111 */               double d6 = j2 + 0.5F - entityliving.q;
/* 1112 */               float f15 = et.a(d5 * d5 + d6 * d6) / k1;
/* 1113 */               float f16 = 1.0F;
/* 1114 */               tessellator.b((world.b(i2, k3, j2, 0) * 3 + 15728880) / 4);
/* 1115 */               tessellator.a(f16, f16, f16, ((1.0F - f15 * f15) * 0.3F + 0.5F) * f1);
/* 1116 */               tessellator.b(-d * 1.0D, -d1 * 1.0D, -d2 * 1.0D);
/* 1117 */               tessellator.a(i2 - f6 + 0.5D, i3, j2 - f7 + 0.5D, 0.0F * f8 + f11, i3 * f8 / 4.0F + f10 * f8 + f12);
/* 1118 */               tessellator.a(i2 + f6 + 0.5D, i3, j2 + f7 + 0.5D, 1.0F * f8 + f11, i3 * f8 / 4.0F + f10 * f8 + f12);
/* 1119 */               tessellator.a(i2 + f6 + 0.5D, j3, j2 + f7 + 0.5D, 1.0F * f8 + f11, j3 * f8 / 4.0F + f10 * f8 + f12);
/* 1120 */               tessellator.a(i2 - f6 + 0.5D, j3, j2 - f7 + 0.5D, 0.0F * f8 + f11, j3 * f8 / 4.0F + f10 * f8 + f12);
/* 1121 */               tessellator.b(0.0D, 0.0D, 0.0D);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1126 */     if (byte0 >= 0)
/*      */     {
/* 1128 */       tessellator.a();
/*      */     }
/* 1130 */     GL11.glEnable(2884);
/* 1131 */     GL11.glDisable(3042);
/* 1132 */     GL11.glAlphaFunc(516, 0.1F);
/* 1133 */     a(f);
/*      */   }
/*      */ 
/*      */   public void b()
/*      */   {
/* 1138 */     za scaledresolution = new za(this.r.z, this.r.d, this.r.e);
/* 1139 */     GL11.glClear(256);
/* 1140 */     GL11.glMatrixMode(5889);
/* 1141 */     GL11.glLoadIdentity();
/* 1142 */     GL11.glOrtho(0.0D, scaledresolution.a, scaledresolution.b, 0.0D, 1000.0D, 3000.0D);
/* 1143 */     GL11.glMatrixMode(5888);
/* 1144 */     GL11.glLoadIdentity();
/* 1145 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*      */   }
/*      */ 
/*      */   private void g(float f)
/*      */   {
/* 1150 */     rv world = this.r.f;
/* 1151 */     wd entityliving = this.r.i;
/* 1152 */     float f1 = 1.0F / (4 - this.r.z.e);
/* 1153 */     f1 = 1.0F - (float)Math.pow(f1, 0.25D);
/* 1154 */     ax vec3d = world.a(this.r.i, f);
/* 1155 */     float f2 = (float)vec3d.a;
/* 1156 */     float f3 = (float)vec3d.b;
/* 1157 */     float f4 = (float)vec3d.c;
/* 1158 */     ax vec3d1 = world.f(f);
/* 1159 */     this.n = ((float)vec3d1.a);
/* 1160 */     this.o = ((float)vec3d1.b);
/* 1161 */     this.p = ((float)vec3d1.c);
/* 1162 */     if (this.r.z.e < 2)
/*      */     {
/* 1164 */       ax vec3d2 = et.a(world.d(f)) <= 0.0F ? ax.b(0.0D, 0.0D, -1.0D) : ax.b(0.0D, 0.0D, 1.0D);
/* 1165 */       float f6 = (float)entityliving.h(f).b(vec3d2);
/* 1166 */       if (f6 < 0.0F)
/*      */       {
/* 1168 */         f6 = 0.0F;
/*      */       }
/* 1170 */       if (f6 > 0.0F)
/*      */       {
/* 1172 */         float[] af = world.y.a(world.c(f), f);
/* 1173 */         if (af != null)
/*      */         {
/* 1175 */           f6 *= af[3];
/* 1176 */           this.n = (this.n * (1.0F - f6) + af[0] * f6);
/* 1177 */           this.o = (this.o * (1.0F - f6) + af[1] * f6);
/* 1178 */           this.p = (this.p * (1.0F - f6) + af[2] * f6);
/*      */         }
/*      */       }
/*      */     }
/* 1182 */     this.n += (f2 - this.n) * f1;
/* 1183 */     this.o += (f3 - this.o) * f1;
/* 1184 */     this.p += (f4 - this.p) * f1;
/* 1185 */     float f5 = world.i(f);
/* 1186 */     if (f5 > 0.0F)
/*      */     {
/* 1188 */       float f7 = 1.0F - f5 * 0.5F;
/* 1189 */       float f9 = 1.0F - f5 * 0.4F;
/* 1190 */       this.n *= f7;
/* 1191 */       this.o *= f7;
/* 1192 */       this.p *= f9;
/*      */     }
/* 1194 */     float f8 = world.h(f);
/* 1195 */     if (f8 > 0.0F)
/*      */     {
/* 1197 */       float f10 = 1.0F - f8 * 0.5F;
/* 1198 */       this.n *= f10;
/* 1199 */       this.o *= f10;
/* 1200 */       this.p *= f10;
/*      */     }
/* 1202 */     if (this.P)
/*      */     {
/* 1204 */       ax vec3d3 = world.e(f);
/* 1205 */       this.n = ((float)vec3d3.a);
/* 1206 */       this.o = ((float)vec3d3.b);
/* 1207 */       this.p = ((float)vec3d3.c);
/*      */     }
/* 1209 */     else if (entityliving.a(wa.g))
/*      */     {
/* 1211 */       this.n = 0.02F;
/* 1212 */       this.o = 0.02F;
/* 1213 */       this.p = 0.2F;
/*      */     }
/* 1215 */     else if (entityliving.a(wa.h))
/*      */     {
/* 1217 */       this.n = 0.6F;
/* 1218 */       this.o = 0.1F;
/* 1219 */       this.p = 0.0F;
/*      */     }
/* 1221 */     float f11 = this.Y + (this.Z - this.Y) * f;
/* 1222 */     this.n *= f11;
/* 1223 */     this.o *= f11;
/* 1224 */     this.p *= f11;
/* 1225 */     double d = (entityliving.O + (entityliving.p - entityliving.O) * f - world.getWorldMinY()) / 32.0D;
/* 1226 */     if (d < 1.0D)
/*      */     {
/* 1228 */       if (d < 0.0D)
/*      */       {
/* 1230 */         d = 0.0D;
/*      */       }
/* 1232 */       d *= d;
/* 1233 */       this.n = ((float)(this.n * d));
/* 1234 */       this.o = ((float)(this.o * d));
/* 1235 */       this.p = ((float)(this.p * d));
/*      */     }
/* 1237 */     if (this.r.z.g)
/*      */     {
/* 1239 */       float f12 = (this.n * 30.0F + this.o * 59.0F + this.p * 11.0F) / 100.0F;
/* 1240 */       float f13 = (this.n * 30.0F + this.o * 70.0F) / 100.0F;
/* 1241 */       float f14 = (this.n * 30.0F + this.p * 70.0F) / 100.0F;
/* 1242 */       this.n = f12;
/* 1243 */       this.o = f13;
/* 1244 */       this.p = f14;
/*      */     }
/* 1246 */     GL11.glClearColor(this.n, this.o, this.p, 0.0F);
/*      */   }
/*      */ 
/*      */   private void a(int i, float f)
/*      */   {
/* 1251 */     wd entityliving = this.r.i;
/* 1252 */     if (i == 999)
/*      */     {
/* 1254 */       GL11.glFog(2918, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 1255 */       GL11.glFogi(2917, 9729);
/* 1256 */       GL11.glFogf(2915, 0.0F);
/* 1257 */       GL11.glFogf(2916, 8.0F);
/* 1258 */       if (GLContext.getCapabilities().GL_NV_fog_distance)
/*      */       {
/* 1260 */         GL11.glFogi(34138, 34139);
/*      */       }
/* 1262 */       GL11.glFogf(2915, 0.0F);
/* 1263 */       return;
/*      */     }
/* 1265 */     GL11.glFog(2918, a(this.n, this.o, this.p, 1.0F));
/* 1266 */     GL11.glNormal3f(0.0F, -1.0F, 0.0F);
/* 1267 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1268 */     if (this.P)
/*      */     {
/* 1270 */       GL11.glFogi(2917, 2048);
/* 1271 */       GL11.glFogf(2914, 0.1F);
/* 1272 */       float f1 = 1.0F;
/* 1273 */       float f5 = 1.0F;
/* 1274 */       float f8 = 1.0F;
/* 1275 */       if (this.r.z.g)
/*      */       {
/* 1277 */         float f11 = (f1 * 30.0F + f5 * 59.0F + f8 * 11.0F) / 100.0F;
/* 1278 */         float f15 = (f1 * 30.0F + f5 * 70.0F) / 100.0F;
/* 1279 */         float f18 = (f1 * 30.0F + f8 * 70.0F) / 100.0F;
/* 1280 */         f1 = f11;
/* 1281 */         f5 = f15;
/* 1282 */         f8 = f18;
/*      */       }
/*      */     }
/* 1285 */     else if (entityliving.a(wa.g))
/*      */     {
/* 1287 */       GL11.glFogi(2917, 2048);
/* 1288 */       GL11.glFogf(2914, 0.1F);
/* 1289 */       float f2 = 0.4F;
/* 1290 */       float f6 = 0.4F;
/* 1291 */       float f9 = 0.9F;
/* 1292 */       if (this.r.z.g)
/*      */       {
/* 1294 */         float f12 = (f2 * 30.0F + f6 * 59.0F + f9 * 11.0F) / 100.0F;
/* 1295 */         float f16 = (f2 * 30.0F + f6 * 70.0F) / 100.0F;
/* 1296 */         float f19 = (f2 * 30.0F + f9 * 70.0F) / 100.0F;
/* 1297 */         f2 = f12;
/* 1298 */         f6 = f16;
/* 1299 */         f9 = f19;
/*      */       }
/*      */     }
/* 1302 */     else if (entityliving.a(wa.h))
/*      */     {
/* 1304 */       GL11.glFogi(2917, 2048);
/* 1305 */       GL11.glFogf(2914, 2.0F);
/* 1306 */       float f3 = 0.4F;
/* 1307 */       float f7 = 0.3F;
/* 1308 */       float f10 = 0.3F;
/* 1309 */       if (this.r.z.g)
/*      */       {
/* 1311 */         float f13 = (f3 * 30.0F + f7 * 59.0F + f10 * 11.0F) / 100.0F;
/* 1312 */         float f17 = (f3 * 30.0F + f7 * 70.0F) / 100.0F;
/* 1313 */         float f20 = (f3 * 30.0F + f10 * 70.0F) / 100.0F;
/* 1314 */         f3 = f13;
/* 1315 */         f7 = f17;
/* 1316 */         f10 = f20;
/*      */       }
/*      */     }
/*      */     else {
/* 1320 */       float f4 = this.s;
/* 1321 */       double d = ((entityliving.a(f) & 0xF00000) >> 20) / 16.0D + (entityliving.O + (entityliving.p - entityliving.O) * f + 4.0D - this.r.f.getVoidFogY()) / 32.0D;
/* 1322 */       if (d < 1.0D)
/*      */       {
/* 1324 */         if (d < 0.0D)
/*      */         {
/* 1326 */           d = 0.0D;
/*      */         }
/* 1328 */         d *= d;
/* 1329 */         float f14 = 100.0F * (float)d;
/* 1330 */         if (f14 < 5.0F)
/*      */         {
/* 1332 */           f14 = 5.0F;
/*      */         }
/* 1334 */         if (f4 > f14)
/*      */         {
/* 1336 */           f4 = f14;
/*      */         }
/*      */       }
/* 1339 */       GL11.glFogi(2917, 9729);
/* 1340 */       GL11.glFogf(2915, f4 * 0.25F);
/* 1341 */       GL11.glFogf(2916, f4);
/* 1342 */       if (i < 0)
/*      */       {
/* 1344 */         GL11.glFogf(2915, 0.0F);
/* 1345 */         GL11.glFogf(2916, f4 * 0.8F);
/*      */       }
/* 1347 */       if (GLContext.getCapabilities().GL_NV_fog_distance)
/*      */       {
/* 1349 */         GL11.glFogi(34138, 34139);
/*      */       }
/* 1351 */       if (this.r.f.y.c)
/*      */       {
/* 1353 */         GL11.glFogf(2915, 0.0F);
/*      */       }
/*      */     }
/* 1356 */     GL11.glEnable(2903);
/* 1357 */     GL11.glColorMaterial(1028, 4608);
/*      */   }
/*      */ 
/*      */   private FloatBuffer a(float f, float f1, float f2, float f3)
/*      */   {
/* 1362 */     this.m.clear();
/* 1363 */     this.m.put(f).put(f1).put(f2).put(f3);
/* 1364 */     this.m.flip();
/* 1365 */     return this.m;
/*      */   }
/*      */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     iw
 * JD-Core Version:    0.6.2
 */