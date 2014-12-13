/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ 
/*      */ public abstract class kj
/*      */ {
/*      */   public rv chunkLayer;
/*   30 */   int grav = 1;
/*      */ 
/* 1414 */   private static int a = 0;
/*      */   public int f;
/*      */   public double g;
/*      */   public boolean h;
/*      */   public kj i;
/*      */   public kj j;
/*      */   public rv k;
/*      */   public double l;
/*      */   public double m;
/*      */   public double n;
/*      */   public double o;
/*      */   public double p;
/*      */   public double q;
/*      */   public double r;
/*      */   public double s;
/*      */   public double t;
/*      */   public float u;
/*      */   public float v;
/*      */   public float w;
/*      */   public float x;
/* 1434 */   public final rp y = rp.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*      */   public boolean z;
/*      */   public boolean A;
/*      */   public boolean B;
/*      */   public boolean C;
/*      */   public boolean D;
/*      */   protected boolean E;
/*      */   public boolean F;
/*      */   public boolean G;
/*      */   public float H;
/*      */   public float I;
/*      */   public float J;
/*      */   public float K;
/*      */   public float L;
/*      */   protected float M;
/*      */   private int b;
/*      */   public double N;
/*      */   public double O;
/*      */   public double P;
/*      */   public float Q;
/*      */   public float R;
/*      */   public boolean S;
/*      */   public float T;
/*      */   protected Random U;
/*      */   public int V;
/*      */   public int W;
/*      */   public int X;
/*      */   protected int Y;
/*      */   protected boolean Z;
/*      */   public int aa;
/*      */   public int ab;
/*      */   private boolean c;
/*      */   public String ac;
/*      */   public String ad;
/*      */   protected boolean ae;
/*      */   protected abc af;
/*      */   private double d;
/*      */   private double e;
/*      */   public boolean ag;
/*      */   public int ah;
/*      */   public int ai;
/*      */   public int aj;
/*      */   public int ak;
/*      */   public int al;
/*      */   public int am;
/*      */   public boolean an;
/*      */   public boolean ao;
/*      */ 
/*      */   public double getYOriented(int side)
/*      */   {
/*   25 */     if (side == 1)
/*   26 */       return this.y.b;
/*   27 */     return this.y.e;
/*      */   }
/*      */ 
/*      */   public int getGravity()
/*      */   {
/*   33 */     return this.grav;
/*      */   }
/*      */ 
/*      */   public void setGravity(int x)
/*      */   {
/*   38 */     if (x != this.grav)
/*      */     {
/*   40 */       this.grav = x;
/*   41 */       d(this.o, this.y.e + this.y.b - this.p, this.q);
/*   42 */       if (this.i != null)
/*      */       {
/*   44 */         this.i.setGravity(this.grav);
/*      */       }
/*   46 */       if (this.j != null)
/*      */       {
/*   48 */         this.j.setGravity(this.grav);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void toggleGravity()
/*      */   {
/*   55 */     setGravity(-this.grav);
/*      */   }
/*      */ 
/*      */   public int getFloor(double y) {
/*   59 */     int z = (int)y;
/*   60 */     while (z > y)
/*   61 */       z--;
/*   62 */     if ((this.grav == -1) && (z == y))
/*   63 */       z--;
/*   64 */     return z;
/*      */   }
/*      */ 
/*      */   public kj(rv world)
/*      */   {
/*   71 */     this.f = (a++);
/*   72 */     this.g = 1.0D;
/*   73 */     this.h = false;
/*   74 */     this.z = false;
/*   75 */     this.C = false;
/*   76 */     this.D = false;
/*   77 */     this.F = true;
/*   78 */     this.G = false;
/*   79 */     this.H = 0.0F;
/*   80 */     this.I = 0.6F;
/*   81 */     this.J = 1.8F;
/*   82 */     this.K = 0.0F;
/*   83 */     this.L = 0.0F;
/*   84 */     this.M = 0.0F;
/*   85 */     this.b = 1;
/*   86 */     this.Q = 0.0F;
/*   87 */     this.R = 0.0F;
/*   88 */     this.S = false;
/*   89 */     this.T = 0.0F;
/*   90 */     this.U = new Random();
/*   91 */     this.V = 0;
/*   92 */     this.W = 1;
/*   93 */     this.X = 0;
/*   94 */     this.Y = 300;
/*   95 */     this.Z = false;
/*   96 */     this.aa = 0;
/*   97 */     this.ab = 300;
/*   98 */     this.c = true;
/*   99 */     this.ae = false;
/*  100 */     this.af = new abc();
/*  101 */     this.ag = false;
/*  102 */     this.k = world;
/*  103 */     if ((world != null) && (world.parentWorld != null))
/*  104 */       this.k = world.parentWorld;
/*  105 */     d(0.0D, 0.0D, 0.0D);
/*  106 */     this.af.a(0, Byte.valueOf((byte)0));
/*  107 */     b();
/*      */   }
/*      */ 
/*      */   protected abstract void b();
/*      */ 
/*      */   public abc t()
/*      */   {
/*  114 */     return this.af;
/*      */   }
/*      */ 
/*      */   public boolean equals(Object obj)
/*      */   {
/*  119 */     if ((obj instanceof kj))
/*      */     {
/*  121 */       return ((kj)obj).f == this.f;
/*      */     }
/*      */ 
/*  124 */     return false;
/*      */   }
/*      */ 
/*      */   public int hashCode()
/*      */   {
/*  130 */     return this.f;
/*      */   }
/*      */ 
/*      */   protected void u()
/*      */   {
/*  135 */     if (this.k == null)
/*      */     {
/*  137 */       return;
/*      */     }
/*      */ 
/*  141 */     while (this.p > 0.0D)
/*      */     {
/*  145 */       d(this.o, this.p, this.q);
/*  146 */       if (this.k.a(this, this.y).size() == 0)
/*      */       {
/*      */         break;
/*      */       }
/*  150 */       this.p += 1.0D;
/*      */     }
/*  152 */     this.r = (this.s = this.t = 0.0D);
/*  153 */     this.v = 0.0F;
/*      */   }
/*      */ 
/*      */   public void v()
/*      */   {
/*  158 */     this.G = true;
/*      */   }
/*      */ 
/*      */   protected void a(float f, float f1)
/*      */   {
/*  163 */     this.I = f;
/*  164 */     this.J = f1;
/*      */   }
/*      */ 
/*      */   protected void b(float f, float f1)
/*      */   {
/*  169 */     this.u = (f % 360.0F);
/*  170 */     this.v = (f1 % 360.0F);
/*      */   }
/*      */ 
/*      */   public void d(double d, double d1, double d2)
/*      */   {
/*  176 */     this.o = d;
/*  177 */     this.p = d1;
/*  178 */     this.q = d2;
/*  179 */     float f = this.I / 2.0F;
/*  180 */     float f1 = this.J;
/*  181 */     double d1_offset1 = -this.H + this.Q;
/*  182 */     double d1_offset2 = -this.H + this.Q + f1;
/*  183 */     if (getGravity() < 0)
/*      */     {
/*  185 */       double temp = -d1_offset1;
/*  186 */       d1_offset1 = -d1_offset2;
/*  187 */       d1_offset2 = temp;
/*      */     }
/*  189 */     this.y.c(d - f, d1 + d1_offset1, d2 - f, d + f, d1 + d1_offset2, d2 + f);
/*      */   }
/*      */ 
/*      */   public void c(float f, float f1)
/*      */   {
/*  195 */     float f2 = this.v;
/*  196 */     float f3 = this.u;
/*  197 */     this.u = ((float)(this.u + f * 0.15D * this.grav));
/*  198 */     this.v = ((float)(this.v - f1 * 0.15D * this.grav));
/*  199 */     if (this.v < -90.0F)
/*      */     {
/*  201 */       this.v = -90.0F;
/*      */     }
/*  203 */     if (this.v > 90.0F)
/*      */     {
/*  205 */       this.v = 90.0F;
/*      */     }
/*  207 */     this.x += this.v - f2;
/*  208 */     this.w += this.u - f3;
/*      */   }
/*      */ 
/*      */   public void w_()
/*      */   {
/*  213 */     w();
/*      */   }
/*      */ 
/*      */   public void w()
/*      */   {
/*  218 */     if ((this.j != null) && (this.j.G))
/*      */     {
/*  220 */       this.j = null;
/*      */     }
/*  222 */     this.V += 1;
/*  223 */     this.K = this.L;
/*  224 */     this.l = this.o;
/*  225 */     this.m = this.p;
/*  226 */     this.n = this.q;
/*  227 */     this.x = this.v;
/*  228 */     this.w = this.u;
/*  229 */     if (Q())
/*      */     {
/*  231 */       int i = et.b(this.o);
/*      */ 
/*  233 */       int j = getFloor(this.p + getGravity() * (-0.2000000029802322D - this.H));
/*  234 */       int k = et.b(this.q);
/*  235 */       int j1 = this.k.a(i, j, k);
/*  236 */       if (j1 > 0)
/*      */       {
/*  239 */         this.k.a("tilecrack_" + j1, this.o + (this.U.nextFloat() - 0.5D) * this.I, getYOriented(getGravity()) + getGravity() * 0.1D, this.q + (this.U.nextFloat() - 0.5D) * this.I, -this.r * 4.0D, getGravity() * 1.5D, -this.t * 4.0D);
/*      */       }
/*      */     }
/*  242 */     if (g())
/*      */     {
/*  244 */       if ((!this.Z) && (!this.c))
/*      */       {
/*  246 */         float f = et.a(this.r * this.r * 0.2000000029802322D + this.s * this.s + this.t * this.t * 0.2000000029802322D) * 0.2F;
/*  247 */         if (f > 1.0F)
/*      */         {
/*  249 */           f = 1.0F;
/*      */         }
/*  251 */         this.k.a(this, "random.splash", f, 1.0F + (this.U.nextFloat() - this.U.nextFloat()) * 0.4F);
/*  252 */         float f1 = getFloor(getYOriented(this.grav));
/*  253 */         for (int l = 0; l < 1.0F + this.I * 20.0F; l++)
/*      */         {
/*  255 */           float f2 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
/*  256 */           float f4 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
/*  257 */           this.k.a("bubble", this.o + f2, f1 + 1.0F * this.grav, this.q + f4, this.r, this.s - this.U.nextFloat() * 0.2F * this.grav, this.t);
/*      */         }
/*      */ 
/*  260 */         for (int i1 = 0; i1 < 1.0F + this.I * 20.0F; i1++)
/*      */         {
/*  262 */           float f3 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
/*  263 */           float f5 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
/*  264 */           this.k.a("splash", this.o + f3, f1 + this.grav * 1.0F, this.q + f5, this.r, this.s, this.t);
/*      */         }
/*      */       }
/*      */ 
/*  268 */       this.M = 0.0F;
/*  269 */       this.Z = true;
/*  270 */       this.X = 0;
/*      */     }
/*      */     else {
/*  273 */       this.Z = false;
/*      */     }
/*  275 */     if (this.k.I)
/*      */     {
/*  277 */       this.X = 0;
/*      */     }
/*  279 */     else if (this.X > 0)
/*      */     {
/*  281 */       if (this.ae)
/*      */       {
/*  283 */         this.X -= 4;
/*  284 */         if (this.X < 0)
/*      */         {
/*  286 */           this.X = 0;
/*      */         }
/*      */       }
/*      */       else {
/*  290 */         if (this.X % 20 == 0)
/*      */         {
/*  292 */           a(je.b, 1);
/*      */         }
/*  294 */         this.X -= 1;
/*      */       }
/*      */     }
/*  297 */     if (C())
/*      */     {
/*  299 */       x();
/*      */     }
/*  301 */     if ((this.p < this.k.getWorldMinY() - 64.0D) || (this.p > this.k.getWorldMaxY() + 64.0D))
/*      */     {
/*  303 */       y();
/*      */     }
/*  305 */     if (!this.k.I)
/*      */     {
/*  307 */       a(0, this.X > 0);
/*  308 */       a(2, this.j != null);
/*      */     }
/*  310 */     this.c = false;
/*      */   }
/*      */ 
/*      */   protected void x()
/*      */   {
/*  315 */     if (!this.ae)
/*      */     {
/*  317 */       a(je.c, 4);
/*  318 */       this.X = 600;
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void y()
/*      */   {
/*  324 */     v();
/*      */   }
/*      */ 
/*      */   public boolean e(double d, double d1, double d2)
/*      */   {
/*  329 */     rp axisalignedbb = this.y.c(d, d1, d2);
/*  330 */     List list = this.k.a(this, axisalignedbb);
/*  331 */     if (list.size() > 0)
/*      */     {
/*  333 */       return false;
/*      */     }
/*  335 */     return !this.k.getIsAnyLiquid(this, axisalignedbb);
/*      */   }
/*      */ 
/*      */   public void b(double dx, double dy, double dz)
/*      */   {
/*  342 */     double EPS = 0.0D;
/*  343 */     int grav = getGravity();
/*  344 */     if (this.S)
/*      */     {
/*  346 */       this.y.d(dx, dy, dz);
/*  347 */       this.o = ((this.y.a + this.y.d) / 2.0D);
/*  348 */       double posYoffset = this.H - this.Q;
/*      */ 
/*  350 */       this.p = (getYOriented(grav) + grav * posYoffset);
/*  351 */       this.q = ((this.y.c + this.y.f) / 2.0D);
/*  352 */       return;
/*      */     }
/*  354 */     this.Q *= 0.4F;
/*  355 */     double d3 = this.o;
/*  356 */     double d4 = this.q;
/*  357 */     if (this.E)
/*      */     {
/*  359 */       this.E = false;
/*  360 */       dx *= 0.25D;
/*  361 */       dy *= 0.0500000007450581D;
/*  362 */       dz *= 0.25D;
/*  363 */       this.r = 0.0D;
/*  364 */       this.s = 0.0D;
/*  365 */       this.t = 0.0D;
/*      */     }
/*  367 */     double prev_dx = dx;
/*  368 */     double prev_dy = dy;
/*  369 */     double prev_dz = dz;
/*  370 */     rp axisalignedbb = this.y.d();
/*  371 */     boolean flag = (this.z) && (P());
/*  372 */     if (flag)
/*      */     {
/*  374 */       double d8 = 0.05D;
/*  375 */       for (; (dx != 0.0D) && (this.k.a(this, this.y.c(dx, -1.0D * grav, 0.0D)).size() == 0); prev_dx = dx)
/*      */       {
/*  377 */         if ((dx < d8) && (dx >= -d8))
/*      */         {
/*  379 */           dx = 0.0D;
/*      */         }
/*  382 */         else if (dx > 0.0D)
/*      */         {
/*  384 */           dx -= d8;
/*      */         }
/*      */         else {
/*  387 */           dx += d8;
/*      */         }
/*      */       }
/*      */ 
/*  391 */       for (; (dz != 0.0D) && (this.k.a(this, this.y.c(0.0D, -1.0D * grav, dz)).size() == 0); prev_dz = dz)
/*      */       {
/*  393 */         if ((dz < d8) && (dz >= -d8))
/*      */         {
/*  395 */           dz = 0.0D;
/*      */         }
/*  398 */         else if (dz > 0.0D)
/*      */         {
/*  400 */           dz -= d8;
/*      */         }
/*      */         else {
/*  403 */           dz += d8;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*  408 */     List list = this.k.a(this, this.y.a(dx, dy, dz));
/*  409 */     for (int i = 0; i < list.size(); i++)
/*      */     {
/*  411 */       dy = ((rp)list.get(i)).b(this.y, dy);
/*      */     }
/*      */ 
/*  414 */     this.y.d(0.0D, dy, 0.0D);
/*  415 */     if ((!this.F) && (prev_dy != dy))
/*      */     {
/*  417 */       dx = dy = dz = 0.0D;
/*      */     }
/*  419 */     boolean flag1 = (this.z) || ((prev_dy != dy) && (prev_dy * grav < 0.0D));
/*  420 */     for (int j = 0; j < list.size(); j++)
/*      */     {
/*  422 */       dx = ((rp)list.get(j)).a(this.y, dx);
/*      */     }
/*      */ 
/*  425 */     this.y.d(dx, 0.0D, 0.0D);
/*  426 */     if ((!this.F) && (prev_dx != dx))
/*      */     {
/*  428 */       dx = dy = dz = 0.0D;
/*      */     }
/*  430 */     for (int k = 0; k < list.size(); k++)
/*      */     {
/*  432 */       dz = ((rp)list.get(k)).c(this.y, dz);
/*      */     }
/*      */ 
/*  435 */     this.y.d(0.0D, 0.0D, dz);
/*  436 */     if ((!this.F) && (prev_dz != dz))
/*      */     {
/*  438 */       dx = dy = dz = 0.0D;
/*      */     }
/*  440 */     if ((this.R > 0.0F) && (flag1) && ((flag) || (this.Q < 0.05F)) && ((prev_dx != dx) || (prev_dz != dz)))
/*      */     {
/*  442 */       double d9 = dx;
/*  443 */       double temp_dy = dy;
/*  444 */       double d13 = dz;
/*  445 */       dx = prev_dx;
/*  446 */       dy = this.R * grav;
/*  447 */       dz = prev_dz;
/*  448 */       rp axisalignedbb1 = this.y.d();
/*  449 */       this.y.b(axisalignedbb);
/*  450 */       List list1 = this.k.a(this, this.y.a(dx, dy, dz));
/*  451 */       for (int j2 = 0; j2 < list1.size(); j2++)
/*      */       {
/*  453 */         dy = ((rp)list1.get(j2)).b(this.y, dy);
/*      */       }
/*      */ 
/*  456 */       this.y.d(0.0D, dy, 0.0D);
/*  457 */       if ((!this.F) && (prev_dy != dy))
/*      */       {
/*  459 */         dx = dy = dz = 0.0D;
/*      */       }
/*  461 */       for (int k2 = 0; k2 < list1.size(); k2++)
/*      */       {
/*  463 */         dx = ((rp)list1.get(k2)).a(this.y, dx);
/*      */       }
/*      */ 
/*  466 */       this.y.d(dx, 0.0D, 0.0D);
/*  467 */       if ((!this.F) && (prev_dx != dx))
/*      */       {
/*  469 */         dx = dy = dz = 0.0D;
/*      */       }
/*  471 */       for (int l2 = 0; l2 < list1.size(); l2++)
/*      */       {
/*  473 */         dz = ((rp)list1.get(l2)).c(this.y, dz);
/*      */       }
/*      */ 
/*  476 */       this.y.d(0.0D, 0.0D, dz);
/*  477 */       if ((!this.F) && (prev_dz != dz))
/*      */       {
/*  479 */         dx = dy = dz = 0.0D;
/*      */       }
/*  481 */       if ((!this.F) && (prev_dy != dy))
/*      */       {
/*  483 */         dx = dy = dz = 0.0D;
/*      */       }
/*      */       else {
/*  486 */         dy = -this.R * grav;
/*  487 */         for (int i3 = 0; i3 < list1.size(); i3++)
/*      */         {
/*  489 */           dy = ((rp)list1.get(i3)).b(this.y, dy);
/*      */         }
/*      */ 
/*  492 */         this.y.d(0.0D, dy, 0.0D);
/*      */       }
/*  494 */       if (d9 * d9 + d13 * d13 >= dx * dx + dz * dz)
/*      */       {
/*  496 */         dx = d9;
/*  497 */         dy = temp_dy;
/*  498 */         dz = d13;
/*  499 */         this.y.b(axisalignedbb1);
/*      */       }
/*      */       else {
/*  502 */         double mY = getYOriented(1);
/*  503 */         double mmY = grav == 1 ? Math.floor(mY) : Math.ceil(mY);
/*  504 */         double d14 = Math.abs(mY - mmY);
/*  505 */         if (d14 > 0.0D)
/*      */         {
/*  507 */           this.Q = ((float)(this.Q + (d14 + 0.01D)));
/*      */         }
/*      */       }
/*      */     }
/*  511 */     this.o = ((this.y.a + this.y.d) / 2.0D);
/*  512 */     this.p = (getYOriented(grav) + grav * (this.H - this.Q));
/*  513 */     this.q = ((this.y.c + this.y.f) / 2.0D);
/*  514 */     this.A = ((prev_dx != dx) || (prev_dz != dz));
/*  515 */     this.B = (prev_dy != dy);
/*  516 */     this.z = ((prev_dy != dy) && (prev_dy * grav < -0.0D));
/*  517 */     this.C = ((this.A) || (this.B));
/*  518 */     a(dy * grav, this.z);
/*  519 */     if (prev_dx != dx)
/*      */     {
/*  521 */       this.r = 0.0D;
/*      */     }
/*  523 */     if (prev_dy != dy)
/*      */     {
/*  525 */       this.s = 0.0D;
/*      */     }
/*  527 */     if (prev_dz != dz)
/*      */     {
/*  529 */       this.t = 0.0D;
/*      */     }
/*  531 */     double d10 = this.o - d3;
/*  532 */     double d12 = this.q - d4;
/*  533 */     if ((f()) && (!flag) && (this.j == null))
/*      */     {
/*  535 */       this.L = ((float)(this.L + et.a(d10 * d10 + d12 * d12) * 0.6D));
/*  536 */       int l = et.b(this.o);
/*  537 */       int j1 = getFloor(this.p + (-0.2000000029802322D - this.H) * grav);
/*  538 */       int l1 = et.b(this.q);
/*  539 */       int j3 = this.k.a(l, j1, l1);
/*  540 */       if (this.k.a(l, j1 - grav, l1) == lr.ba.bA)
/*      */       {
/*  542 */         j3 = this.k.a(l, j1 - grav, l1);
/*      */       }
/*  544 */       if ((this.L > this.b) && (j3 > 0))
/*      */       {
/*  546 */         this.b = ((int)this.L + 1);
/*  547 */         qm stepsound = lr.m[j3].bL;
/*  548 */         if (this.k.a(l, j1 + grav, l1) == lr.aT.bA)
/*      */         {
/*  550 */           stepsound = lr.aT.bL;
/*  551 */           this.k.a(this, stepsound.d(), stepsound.b() * 0.15F, stepsound.c());
/*      */         }
/*  553 */         else if (!lr.m[j3].bN.d())
/*      */         {
/*  555 */           this.k.a(this, stepsound.d(), stepsound.b() * 0.15F, stepsound.c());
/*      */         }
/*  557 */         lr.m[j3].b(this.k, l, j1, l1, this);
/*      */       }
/*      */     }
/*  560 */     int i1 = et.b(this.y.a + 0.001D);
/*  561 */     int k1 = et.b(this.y.b + 0.001D);
/*  562 */     int i2 = et.b(this.y.c + 0.001D);
/*  563 */     int k3 = et.b(this.y.d - 0.001D);
/*  564 */     int l3 = et.b(this.y.e - 0.001D);
/*  565 */     int i4 = et.b(this.y.f - 0.001D);
/*  566 */     if (this.k.b(i1, k1, i2, k3, l3, i4))
/*      */     {
/*  568 */       for (int j4 = i1; j4 <= k3; j4++)
/*      */       {
/*  570 */         if (grav == 1) {
/*  571 */           for (int k4 = k1; k4 <= l3; k4++)
/*      */           {
/*  573 */             for (int l4 = i2; l4 <= i4; l4++)
/*      */             {
/*  575 */               int i5 = this.k.a(j4, k4, l4);
/*  576 */               if (i5 > 0)
/*      */               {
/*  578 */                 lr.m[i5].a(this.k, j4, k4, l4, this);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */         else {
/*  584 */           for (int k4 = l3; k4 >= k1; k4--)
/*      */           {
/*  586 */             for (int l4 = i2; l4 <= i4; l4++)
/*      */             {
/*  588 */               int i5 = this.k.a(j4, k4, l4);
/*  589 */               if (i5 > 0)
/*      */               {
/*  591 */                 lr.m[i5].a(this.k, j4, k4, l4, this);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  600 */     boolean flag2 = z();
/*  601 */     if (this.k.c(this.y.e(0.001D, 0.001D, 0.001D)))
/*      */     {
/*  603 */       a(1);
/*  604 */       if (!flag2)
/*      */       {
/*  606 */         this.X += 1;
/*  607 */         if (this.X == 0)
/*      */         {
/*  609 */           this.X = 300;
/*      */         }
/*      */       }
/*      */     }
/*  613 */     else if (this.X <= 0)
/*      */     {
/*  615 */       this.X = (-this.W);
/*      */     }
/*  617 */     if ((flag2) && (this.X > 0))
/*      */     {
/*  619 */       this.k.a(this, "random.fizz", 0.7F, 1.6F + (this.U.nextFloat() - this.U.nextFloat()) * 0.4F);
/*  620 */       this.X = (-this.W);
/*      */     }
/*      */   }
/*      */ 
/*      */   protected boolean f()
/*      */   {
/*  626 */     return true;
/*      */   }
/*      */ 
/*      */   protected void a(double d, boolean flag)
/*      */   {
/*  631 */     if (flag)
/*      */     {
/*  633 */       if (this.M > 0.0F)
/*      */       {
/*  635 */         c(this.M);
/*  636 */         this.M = 0.0F;
/*      */       }
/*      */     }
/*  639 */     else if (d < 0.0D)
/*      */     {
/*  641 */       this.M = ((float)(this.M - d));
/*      */     }
/*      */   }
/*      */ 
/*      */   public rp g_()
/*      */   {
/*  647 */     return null;
/*      */   }
/*      */ 
/*      */   protected void a(int i)
/*      */   {
/*  652 */     if (!this.ae)
/*      */     {
/*  654 */       a(je.a, i);
/*      */     }
/*      */   }
/*      */ 
/*      */   protected void c(float f)
/*      */   {
/*  660 */     if (this.i != null)
/*      */     {
/*  662 */       this.i.c(f);
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean z()
/*      */   {
/*  668 */     return (this.Z) || (this.k.t(et.b(this.o), getFloor(this.p), et.b(this.q)));
/*      */   }
/*      */ 
/*      */   public boolean A()
/*      */   {
/*  673 */     return this.Z;
/*      */   }
/*      */ 
/*      */   public boolean g()
/*      */   {
/*  678 */     return this.k.a(this.y.b(0.0D, -0.4000000059604645D, 0.0D).e(0.001D, 0.001D, 0.001D), wa.g, this);
/*      */   }
/*      */ 
/*      */   public boolean a(wa material)
/*      */   {
/*  683 */     int grav = getGravity();
/*  684 */     double d = this.p + B() * grav;
/*  685 */     int i = et.b(this.o);
/*  686 */     int j = getFloor(d);
/*  687 */     int k = et.b(this.q);
/*  688 */     int l = this.k.a(i, j, k);
/*  689 */     if ((l != 0) && (lr.m[l].bN == material))
/*      */     {
/*  691 */       float f = zp.d(this.k.e(i, j, k)) - 0.111111F;
/*  692 */       if (grav < 0) j++;
/*  693 */       float f1 = j + (1.0F - f) * grav;
/*  694 */       return grav * d < grav * f1;
/*      */     }
/*      */ 
/*  697 */     return false;
/*      */   }
/*      */ 
/*      */   public float B()
/*      */   {
/*  703 */     return 0.0F;
/*      */   }
/*      */ 
/*      */   public boolean C()
/*      */   {
/*  708 */     return this.k.a(this.y.b(-0.1000000014901161D, -0.4000000059604645D, -0.1000000014901161D), wa.h);
/*      */   }
/*      */ 
/*      */   public void a(float f, float f1, float f2)
/*      */   {
/*  713 */     float f3 = et.c(f * f + f1 * f1);
/*  714 */     if (f3 < 0.01F)
/*      */     {
/*  716 */       return;
/*      */     }
/*  718 */     if (f3 < 1.0F)
/*      */     {
/*  720 */       f3 = 1.0F;
/*      */     }
/*  722 */     f3 = f2 / f3;
/*  723 */     f *= f3;
/*  724 */     f1 *= f3;
/*  725 */     float f4 = et.a(this.u * 3.141593F / 180.0F);
/*  726 */     float f5 = et.b(this.u * 3.141593F / 180.0F);
/*  727 */     this.r += f * f5 - f1 * f4;
/*  728 */     this.t += f1 * f5 + f * f4;
/*      */   }
/*      */ 
/*      */   public int a(float f)
/*      */   {
/*  733 */     int i = et.b(this.o);
/*  734 */     int j = et.b(this.q);
/*  735 */     this.k.getClass();
/*  736 */     if (this.k.d(i, 64 + (this.chunkLayer == null ? 0 : this.chunkLayer.shiftY), j))
/*      */     {
/*  738 */       double d = (this.y.e - this.y.b) * 0.66D;
/*  739 */       int k = getFloor(this.p + this.grav * (-this.H + d));
/*  740 */       return this.k.b(i, k, j, 0);
/*      */     }
/*      */ 
/*  743 */     return 0;
/*      */   }
/*      */ 
/*      */   public float b(float f)
/*      */   {
/*  749 */     int i = et.b(this.o);
/*  750 */     int j = et.b(this.q);
/*  751 */     this.k.getClass();
/*  752 */     if (this.k.d(i, 64 + (this.chunkLayer == null ? 0 : this.chunkLayer.shiftY), j))
/*      */     {
/*  754 */       double d = (this.y.e - this.y.b) * 0.66D;
/*  755 */       int k = getFloor(this.p + this.grav * (-this.H + d));
/*  756 */       return this.k.c(i, k, j);
/*      */     }
/*      */ 
/*  759 */     return 0.0F;
/*      */   }
/*      */ 
/*      */   public void a(rv world)
/*      */   {
/*  765 */     this.k = world;
/*      */   }
/*      */ 
/*      */   public void b(double d, double d1, double d2, float f, float f1)
/*      */   {
/*  771 */     this.l = (this.o = d);
/*  772 */     this.m = (this.p = d1);
/*  773 */     this.n = (this.q = d2);
/*  774 */     this.w = (this.u = f);
/*  775 */     this.x = (this.v = f1);
/*  776 */     this.Q = 0.0F;
/*  777 */     double d3 = this.w - f;
/*  778 */     if (d3 < -180.0D)
/*      */     {
/*  780 */       this.w += 360.0F;
/*      */     }
/*  782 */     if (d3 >= 180.0D)
/*      */     {
/*  784 */       this.w -= 360.0F;
/*      */     }
/*  786 */     d(this.o, this.p, this.q);
/*  787 */     b(f, f1);
/*      */   }
/*      */ 
/*      */   public void c(double d, double d1, double d2, float f, float f1)
/*      */   {
/*  793 */     this.N = (this.l = this.o = d);
/*  794 */     this.O = (this.m = this.p = d1 + getGravity() * this.H);
/*  795 */     this.P = (this.n = this.q = d2);
/*  796 */     this.u = f;
/*  797 */     this.v = f1;
/*  798 */     d(this.o, this.p, this.q);
/*      */   }
/*      */ 
/*      */   public float d(kj entity)
/*      */   {
/*  803 */     float f = (float)(this.o - entity.o);
/*  804 */     float f1 = (float)(this.p - entity.p);
/*  805 */     float f2 = (float)(this.q - entity.q);
/*  806 */     return et.c(f * f + f1 * f1 + f2 * f2);
/*      */   }
/*      */ 
/*      */   public double f(double d, double d1, double d2)
/*      */   {
/*  811 */     double d3 = this.o - d;
/*  812 */     double d4 = this.p - d1;
/*  813 */     double d5 = this.q - d2;
/*  814 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*      */   }
/*      */ 
/*      */   public double g(double d, double d1, double d2)
/*      */   {
/*  819 */     double d3 = this.o - d;
/*  820 */     double d4 = this.p - d1;
/*  821 */     double d5 = this.q - d2;
/*  822 */     return et.a(d3 * d3 + d4 * d4 + d5 * d5);
/*      */   }
/*      */ 
/*      */   public double e(kj entity)
/*      */   {
/*  827 */     double d = this.o - entity.o;
/*  828 */     double d1 = this.p - entity.p;
/*  829 */     double d2 = this.q - entity.q;
/*  830 */     return d * d + d1 * d1 + d2 * d2;
/*      */   }
/*      */ 
/*      */   public void a_(sz entityplayer)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void f(kj entity)
/*      */   {
/*  839 */     if ((entity.i == this) || (entity.j == this))
/*      */     {
/*  841 */       return;
/*      */     }
/*  843 */     double d = entity.o - this.o;
/*  844 */     double d1 = entity.q - this.q;
/*  845 */     double d2 = et.a(d, d1);
/*  846 */     if (d2 >= 0.009999999776482582D)
/*      */     {
/*  848 */       d2 = et.a(d2);
/*  849 */       d /= d2;
/*  850 */       d1 /= d2;
/*  851 */       double d3 = 1.0D / d2;
/*  852 */       if (d3 > 1.0D)
/*      */       {
/*  854 */         d3 = 1.0D;
/*      */       }
/*  856 */       d *= d3;
/*  857 */       d1 *= d3;
/*  858 */       d *= 0.0500000007450581D;
/*  859 */       d1 *= 0.0500000007450581D;
/*  860 */       d *= (1.0F - this.T);
/*  861 */       d1 *= (1.0F - this.T);
/*  862 */       c(-d, 0.0D, -d1);
/*  863 */       entity.c(d, 0.0D, d1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void c(double d, double d1, double d2)
/*      */   {
/*  869 */     this.r += d;
/*  870 */     this.s += d1;
/*  871 */     this.t += d2;
/*  872 */     this.ao = true;
/*      */   }
/*      */ 
/*      */   protected void D()
/*      */   {
/*  877 */     this.D = true;
/*      */   }
/*      */ 
/*      */   public boolean a(je damagesource, int i)
/*      */   {
/*  882 */     D();
/*  883 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean d_()
/*      */   {
/*  888 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean e_()
/*      */   {
/*  893 */     return false;
/*      */   }
/*      */ 
/*      */   public void a(kj entity, int i)
/*      */   {
/*      */   }
/*      */ 
/*      */   public boolean a(ax vec3d)
/*      */   {
/*  902 */     double d = this.o - vec3d.a;
/*  903 */     double d1 = this.p - vec3d.b;
/*  904 */     double d2 = this.q - vec3d.c;
/*  905 */     double d3 = d * d + d1 * d1 + d2 * d2;
/*  906 */     return a(d3);
/*      */   }
/*      */ 
/*      */   public boolean a(double d)
/*      */   {
/*  911 */     double d1 = this.y.c();
/*  912 */     d1 *= 64.0D * this.g;
/*  913 */     return d < d1 * d1;
/*      */   }
/*      */ 
/*      */   public String E()
/*      */   {
/*  918 */     return null;
/*      */   }
/*      */ 
/*      */   public boolean c(xb nbttagcompound)
/*      */   {
/*  923 */     String s = F();
/*  924 */     if ((this.G) || (s == null))
/*      */     {
/*  926 */       return false;
/*      */     }
/*      */ 
/*  929 */     nbttagcompound.a("id", s);
/*  930 */     d(nbttagcompound);
/*  931 */     return true;
/*      */   }
/*      */ 
/*      */   public void d(xb nbttagcompound)
/*      */   {
/*  937 */     double posY = this.p;
/*  938 */     if ((F() != null) && (this.chunkLayer != null)) {
/*  939 */       posY -= this.chunkLayer.shiftY;
/*      */     }
/*  941 */     nbttagcompound.a("Pos", a(new double[] { this.o, posY + this.grav * this.Q, this.q }));
/*      */ 
/*  944 */     nbttagcompound.a("Motion", a(new double[] { this.r, this.s, this.t }));
/*      */ 
/*  947 */     nbttagcompound.a("Rotation", a(new float[] { this.u, this.v }));
/*      */ 
/*  951 */     nbttagcompound.a("FallDistance", this.M);
/*  952 */     nbttagcompound.a("Fire", (short)this.X);
/*  953 */     nbttagcompound.a("Air", (short)this.ab);
/*  954 */     nbttagcompound.a("OnGround", this.z);
/*  955 */     nbttagcompound.a("Antigrav", this.grav == -1);
/*  956 */     b(nbttagcompound);
/*      */   }
/*      */ 
/*      */   public void e(xb nbttagcompound)
/*      */   {
/*  961 */     kk nbttaglist = nbttagcompound.l("Pos");
/*  962 */     kk nbttaglist1 = nbttagcompound.l("Motion");
/*  963 */     kk nbttaglist2 = nbttagcompound.l("Rotation");
/*  964 */     this.r = ((aae)nbttaglist1.a(0)).a;
/*  965 */     this.s = ((aae)nbttaglist1.a(1)).a;
/*  966 */     this.t = ((aae)nbttaglist1.a(2)).a;
/*  967 */     if (Math.abs(this.r) > 10.0D)
/*      */     {
/*  969 */       this.r = 0.0D;
/*      */     }
/*  971 */     if (Math.abs(this.s) > 10.0D)
/*      */     {
/*  973 */       this.s = 0.0D;
/*      */     }
/*  975 */     if (Math.abs(this.t) > 10.0D)
/*      */     {
/*  977 */       this.t = 0.0D;
/*      */     }
/*  979 */     this.l = (this.N = this.o = ((aae)nbttaglist.a(0)).a);
/*  980 */     this.m = (this.O = this.p = ((aae)nbttaglist.a(1)).a);
/*  981 */     this.n = (this.P = this.q = ((aae)nbttaglist.a(2)).a);
/*  982 */     this.w = (this.u = ((k)nbttaglist2.a(0)).a);
/*  983 */     this.x = (this.v = ((k)nbttaglist2.a(1)).a);
/*  984 */     this.M = nbttagcompound.g("FallDistance");
/*  985 */     this.X = nbttagcompound.d("Fire");
/*  986 */     this.ab = nbttagcompound.d("Air");
/*  987 */     this.z = nbttagcompound.m("OnGround");
/*  988 */     if (nbttagcompound.m("Antigrav"))
/*  989 */       this.grav = -1;
/*  990 */     else this.grav = 1;
/*  991 */     d(this.o, this.p, this.q);
/*  992 */     b(this.u, this.v);
/*  993 */     a(nbttagcompound);
/*      */   }
/*      */ 
/*      */   protected final String F()
/*      */   {
/*  998 */     return um.b(this);
/*      */   }
/*      */ 
/*      */   protected abstract void a(xb paramxb);
/*      */ 
/*      */   protected abstract void b(xb paramxb);
/*      */ 
/*      */   protected kk a(double[] ad)
/*      */   {
/* 1007 */     kk nbttaglist = new kk();
/* 1008 */     double[] ad1 = ad;
/* 1009 */     int i = ad1.length;
/* 1010 */     for (int j = 0; j < i; j++)
/*      */     {
/* 1012 */       double d = ad1[j];
/* 1013 */       nbttaglist.a(new aae(d));
/*      */     }
/*      */ 
/* 1016 */     return nbttaglist;
/*      */   }
/*      */ 
/*      */   protected kk a(float[] af)
/*      */   {
/* 1021 */     kk nbttaglist = new kk();
/* 1022 */     float[] af1 = af;
/* 1023 */     int i = af1.length;
/* 1024 */     for (int j = 0; j < i; j++)
/*      */     {
/* 1026 */       float f = af1[j];
/* 1027 */       nbttaglist.a(new k(f));
/*      */     }
/*      */ 
/* 1030 */     return nbttaglist;
/*      */   }
/*      */ 
/*      */   public float e()
/*      */   {
/* 1035 */     return this.J / 2.0F;
/*      */   }
/*      */ 
/*      */   public ee b(int i, int j)
/*      */   {
/* 1040 */     return a(i, j, 0.0F);
/*      */   }
/*      */ 
/*      */   public ee a(int i, int j, float f)
/*      */   {
/* 1045 */     return a(new ul(i, j, 0), f);
/*      */   }
/*      */ 
/*      */   public ee a(ul itemstack, float f)
/*      */   {
/* 1050 */     ee entityitem = new ee(this.k, this.o, this.p + f, this.q, itemstack);
/* 1051 */     entityitem.c = 10;
/* 1052 */     this.k.a(entityitem);
/* 1053 */     return entityitem;
/*      */   }
/*      */ 
/*      */   public boolean G()
/*      */   {
/* 1058 */     return !this.G;
/*      */   }
/*      */ 
/*      */   public boolean H()
/*      */   {
/* 1063 */     for (int i = 0; i < 8; i++)
/*      */     {
/* 1065 */       float f = ((i >> 0) % 2 - 0.5F) * this.I * 0.9F;
/* 1066 */       float f1 = ((i >> 1) % 2 - 0.5F) * 0.1F;
/* 1067 */       float f2 = ((i >> 2) % 2 - 0.5F) * this.I * 0.9F;
/* 1068 */       int j = et.b(this.o + f);
/* 1069 */       int k = getFloor(this.p + getGravity() * (B() + f1));
/* 1070 */       int l = et.b(this.q + f2);
/* 1071 */       if (this.k.h(j, k, l))
/*      */       {
/* 1073 */         return true;
/*      */       }
/*      */     }
/*      */ 
/* 1077 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean b(sz entityplayer)
/*      */   {
/* 1082 */     return false;
/*      */   }
/*      */ 
/*      */   public rp a(kj entity)
/*      */   {
/* 1087 */     return null;
/*      */   }
/*      */ 
/*      */   public void I()
/*      */   {
/* 1092 */     if (this.j.G)
/*      */     {
/* 1094 */       this.j = null;
/* 1095 */       return;
/*      */     }
/* 1097 */     this.r = 0.0D;
/* 1098 */     this.s = 0.0D;
/* 1099 */     this.t = 0.0D;
/* 1100 */     w_();
/* 1101 */     if (this.j == null)
/*      */     {
/* 1103 */       return;
/*      */     }
/* 1105 */     this.j.h_();
/* 1106 */     this.e += this.j.u - this.j.w;
/* 1107 */     this.d += this.j.v - this.j.x;
/* 1108 */     while (this.e >= 180.0D) this.e -= 360.0D;
/* 1109 */     while (this.e < -180.0D) this.e += 360.0D;
/* 1110 */     while (this.d >= 180.0D) this.d -= 360.0D;
/* 1111 */     while (this.d < -180.0D) this.d += 360.0D;
/* 1112 */     double d = this.e * 0.5D;
/* 1113 */     double d1 = this.d * 0.5D;
/* 1114 */     float f = 10.0F;
/* 1115 */     if (d > f)
/*      */     {
/* 1117 */       d = f;
/*      */     }
/* 1119 */     if (d < -f)
/*      */     {
/* 1121 */       d = -f;
/*      */     }
/* 1123 */     if (d1 > f)
/*      */     {
/* 1125 */       d1 = f;
/*      */     }
/* 1127 */     if (d1 < -f)
/*      */     {
/* 1129 */       d1 = -f;
/*      */     }
/* 1131 */     this.e -= d;
/* 1132 */     this.d -= d1;
/* 1133 */     this.u = ((float)(this.u + d));
/* 1134 */     this.v = ((float)(this.v + d1));
/*      */   }
/*      */ 
/*      */   public void h_()
/*      */   {
/* 1139 */     this.i.d(this.o, this.p + this.grav * (h() + this.i.J()), this.q);
/*      */   }
/*      */ 
/*      */   public double J()
/*      */   {
/* 1144 */     return this.H;
/*      */   }
/*      */ 
/*      */   public double h()
/*      */   {
/* 1149 */     return this.J * 0.75D;
/*      */   }
/*      */ 
/*      */   public void g(kj entity)
/*      */   {
/* 1154 */     this.grav = entity.getGravity();
/* 1155 */     this.d = 0.0D;
/* 1156 */     this.e = 0.0D;
/* 1157 */     if (entity == null)
/*      */     {
/* 1159 */       if (this.j != null)
/*      */       {
/* 1161 */         c(this.j.o, this.j.getYOriented(this.grav) + this.j.J * this.grav, this.j.q, this.u, this.v);
/* 1162 */         this.j.i = null;
/*      */       }
/* 1164 */       this.j = null;
/* 1165 */       return;
/*      */     }
/* 1167 */     if (this.j == entity)
/*      */     {
/* 1169 */       this.j.i = null;
/* 1170 */       this.j = null;
/* 1171 */       c(entity.o, entity.getYOriented(this.grav) + entity.J * this.grav, entity.q, this.u, this.v);
/* 1172 */       return;
/*      */     }
/* 1174 */     if (this.j != null)
/*      */     {
/* 1176 */       this.j.i = null;
/*      */     }
/* 1178 */     if (entity.i != null)
/*      */     {
/* 1180 */       entity.i.j = null;
/*      */     }
/* 1182 */     this.j = entity;
/* 1183 */     entity.i = this;
/*      */   }
/*      */ 
/*      */   public void a(double d, double d1, double d2, float f, float f1, int i)
/*      */   {
/* 1189 */     int grav = getGravity();
/* 1190 */     d(d, d1, d2);
/* 1191 */     b(f, f1);
/* 1192 */     List list = this.k.a(this, this.y.e(0.03125D, 0.0D, 0.03125D));
/* 1193 */     if (list.size() > 0)
/*      */     {
/* 1195 */       double d3 = 0.0D;
/* 1196 */       for (int j = 0; j < list.size(); j++)
/*      */       {
/* 1198 */         rp axisalignedbb = (rp)list.get(j);
/* 1199 */         if ((axisalignedbb.e > d3) && (grav == 1))
/*      */         {
/* 1201 */           d3 = axisalignedbb.e;
/*      */         }
/* 1203 */         if ((axisalignedbb.b < d3) && (grav == -1))
/*      */         {
/* 1205 */           d3 = axisalignedbb.b;
/*      */         }
/*      */       }
/*      */ 
/* 1209 */       d1 += d3 - getYOriented(grav);
/* 1210 */       d(d, d1, d2);
/*      */     }
/*      */   }
/*      */ 
/*      */   public float i_()
/*      */   {
/* 1216 */     return 0.1F;
/*      */   }
/*      */ 
/*      */   public ax K()
/*      */   {
/* 1221 */     return null;
/*      */   }
/*      */ 
/*      */   public void L()
/*      */   {
/*      */   }
/*      */ 
/*      */   public void a(double d, double d1, double d2)
/*      */   {
/* 1230 */     this.r = d;
/* 1231 */     this.s = d1;
/* 1232 */     this.t = d2;
/*      */   }
/*      */ 
/*      */   public void a(byte byte0)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void k()
/*      */   {
/*      */   }
/*      */ 
/*      */   public void M()
/*      */   {
/*      */   }
/*      */ 
/*      */   public void b(int i, int j, int k)
/*      */   {
/*      */   }
/*      */ 
/*      */   public boolean N()
/*      */   {
/* 1253 */     return (this.X > 0) || (d(0));
/*      */   }
/*      */ 
/*      */   public boolean O()
/*      */   {
/* 1258 */     return (this.j != null) || (d(2));
/*      */   }
/*      */ 
/*      */   public boolean P()
/*      */   {
/* 1263 */     return d(1);
/*      */   }
/*      */ 
/*      */   public boolean Q()
/*      */   {
/* 1268 */     return d(3);
/*      */   }
/*      */ 
/*      */   public void c(boolean flag)
/*      */   {
/* 1273 */     a(3, flag);
/*      */   }
/*      */ 
/*      */   public boolean R()
/*      */   {
/* 1278 */     return d(4);
/*      */   }
/*      */ 
/*      */   public void d(boolean flag)
/*      */   {
/* 1283 */     a(4, flag);
/*      */   }
/*      */ 
/*      */   protected boolean d(int i)
/*      */   {
/* 1288 */     return (this.af.a(0) & 1 << i) != 0;
/*      */   }
/*      */ 
/*      */   protected void a(int i, boolean flag)
/*      */   {
/* 1293 */     byte byte0 = this.af.a(0);
/* 1294 */     if (flag)
/*      */     {
/* 1296 */       this.af.b(0, Byte.valueOf((byte)(byte0 | 1 << i)));
/*      */     }
/*      */     else
/* 1299 */       this.af.b(0, Byte.valueOf((byte)(byte0 & (1 << i ^ 0xFFFFFFFF))));
/*      */   }
/*      */ 
/*      */   public void a(c entitylightningbolt)
/*      */   {
/* 1305 */     a(5);
/* 1306 */     this.X += 1;
/* 1307 */     if (this.X == 0)
/*      */     {
/* 1309 */       this.X = 300;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(wd entityliving)
/*      */   {
/*      */   }
/*      */ 
/*      */   protected boolean h(double d, double d1, double d2)
/*      */   {
/* 1319 */     int i = et.b(d);
/* 1320 */     int j = getFloor(d1);
/* 1321 */     int k = et.b(d2);
/* 1322 */     double d3 = d - i;
/* 1323 */     double d4 = d1 - j;
/* 1324 */     double d5 = d2 - k;
/* 1325 */     if (this.k.h(i, j, k))
/*      */     {
/* 1327 */       boolean flag = !this.k.h(i - 1, j, k);
/* 1328 */       boolean flag1 = !this.k.h(i + 1, j, k);
/* 1329 */       boolean flag2 = !this.k.h(i, j - 1, k);
/* 1330 */       boolean flag3 = !this.k.h(i, j + 1, k);
/* 1331 */       boolean flag4 = !this.k.h(i, j, k - 1);
/* 1332 */       boolean flag5 = !this.k.h(i, j, k + 1);
/* 1333 */       byte byte0 = -1;
/* 1334 */       double d6 = 9999.0D;
/* 1335 */       if ((flag) && (d3 < d6))
/*      */       {
/* 1337 */         d6 = d3;
/* 1338 */         byte0 = 0;
/*      */       }
/* 1340 */       if ((flag1) && (1.0D - d3 < d6))
/*      */       {
/* 1342 */         d6 = 1.0D - d3;
/* 1343 */         byte0 = 1;
/*      */       }
/* 1345 */       if (this.grav == 1)
/*      */       {
/* 1347 */         if ((flag2) && (d4 < d6))
/*      */         {
/* 1349 */           d6 = d4;
/* 1350 */           byte0 = 2;
/*      */         }
/* 1352 */         if ((flag3) && (1.0D - d4 < d6))
/*      */         {
/* 1354 */           d6 = 1.0D - d4;
/* 1355 */           byte0 = 3;
/*      */         }
/*      */       }
/*      */       else {
/* 1359 */         if ((flag3) && (1.0D - d4 < d6))
/*      */         {
/* 1361 */           d6 = 1.0D - d4;
/* 1362 */           byte0 = 3;
/*      */         }
/* 1364 */         if ((flag2) && (d4 < d6))
/*      */         {
/* 1366 */           d6 = d4;
/* 1367 */           byte0 = 2;
/*      */         }
/*      */       }
/* 1370 */       if ((flag4) && (d5 < d6))
/*      */       {
/* 1372 */         d6 = d5;
/* 1373 */         byte0 = 4;
/*      */       }
/* 1375 */       if ((flag5) && (1.0D - d5 < d6))
/*      */       {
/* 1377 */         double d7 = 1.0D - d5;
/* 1378 */         byte0 = 5;
/*      */       }
/* 1380 */       float f = this.U.nextFloat() * 0.2F + 0.1F;
/* 1381 */       if (byte0 == 0)
/*      */       {
/* 1383 */         this.r = (-f);
/*      */       }
/* 1385 */       if (byte0 == 1)
/*      */       {
/* 1387 */         this.r = f;
/*      */       }
/* 1389 */       if (byte0 == 2)
/*      */       {
/* 1391 */         this.s = (-f);
/*      */       }
/* 1393 */       if (byte0 == 3)
/*      */       {
/* 1395 */         this.s = f;
/*      */       }
/* 1397 */       if (byte0 == 4)
/*      */       {
/* 1399 */         this.t = (-f);
/*      */       }
/* 1401 */       if (byte0 == 5)
/*      */       {
/* 1403 */         this.t = f;
/*      */       }
/*      */     }
/* 1406 */     return false;
/*      */   }
/*      */ 
/*      */   public void o()
/*      */   {
/* 1411 */     this.E = true;
/*      */   }
/*      */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     kj
 * JD-Core Version:    0.6.2
 */