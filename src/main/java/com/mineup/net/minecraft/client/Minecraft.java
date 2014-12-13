/*      */ package net.minecraft.client;
/*      */ 
/*      */ import WorldLayersInfo;
/*      */ import WorldLayersInfo.ChildWorldInfo;
/*      */ import WorldWithLayers;
/*      */ import aam;
/*      */ import aan;
/*      */ import abd;
/*      */ import abj;
/*      */ import abl;
/*      */ import acd;
/*      */ import acf;
/*      */ import acq;
/*      */ import acz;
/*      */ import add;
/*      */ import ax;
/*      */ import bb;
/*      */ import bf;
/*      */ import bo;
/*      */ import bv;
/*      */ import bz;
/*      */ import cp;
/*      */ import dl;
/*      */ import dq;
/*      */ import dx;
/*      */ import ed;
/*      */ import eo;
/*      */ import er;
/*      */ import et;
/*      */ import fc;
/*      */ import fd;
/*      */ import fl;
/*      */ import fm;
/*      */ import fn;
/*      */ import fr;
/*      */ import fs;
/*      */ import fu;
/*      */ import fv;
/*      */ import fx;
/*      */ import gh;
/*      */ import gs;
/*      */ import gv;
/*      */ import hr;
/*      */ import hw;
/*      */ import i;
/*      */ import in;
/*      */ import iw;
/*      */ import java.awt.BorderLayout;
/*      */ import java.awt.Canvas;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Frame;
/*      */ import java.awt.Graphics;
/*      */ import java.io.File;
/*      */ import java.io.PrintStream;
/*      */ import jo;
/*      */ import ke;
/*      */ import kh;
/*      */ import ln;
/*      */ import lr;
/*      */ import ma;
/*      */ import mk;
/*      */ import mn;
/*      */ import nf;
/*      */ import nw;
/*      */ import oe;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.input.Controllers;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.DisplayMode;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.PixelFormat;
/*      */ import org.lwjgl.util.glu.GLU;
/*      */ import oy;
/*      */ import ph;
/*      */ import ps;
/*      */ import qe;
/*      */ import qg;
/*      */ import qp;
/*      */ import qr;
/*      */ import qs;
/*      */ import rb;
/*      */ import rp;
/*      */ import rv;
/*      */ import rx;
/*      */ import sf;
/*      */ import so;
/*      */ import sq;
/*      */ import sz;
/*      */ import ti;
/*      */ import tp;
/*      */ import tq;
/*      */ import tt;
/*      */ import tv;
/*      */ import ui;
/*      */ import ul;
/*      */ import up;
/*      */ import ur;
/*      */ import wd;
/*      */ import wt;
/*      */ import xe;
/*      */ import xf;
/*      */ import xn;
/*      */ import yb;
/*      */ import yf;
/*      */ import yr;
/*      */ import ys;
/*      */ import yw;
/*      */ import za;
/*      */ 
/*      */ public abstract class Minecraft
/*      */   implements Runnable
/*      */ {
/* 1693 */   public static byte[] b = new byte[10485760];
/*      */   private static Minecraft a;
/*      */   public hw c;
/*      */   private boolean R;
/*      */   private boolean S;
/*      */   public int d;
/*      */   public int e;
/*      */   private qp T;
/*      */   private yr U;
/*      */   public rv f;
/*      */   public i g;
/*      */   public qs h;
/*      */   public wd i;
/*      */   public bz j;
/*      */   public dq k;
/*      */   public String l;
/*      */   public Canvas m;
/*      */   public boolean n;
/*      */   public volatile boolean o;
/*      */   public ur p;
/*      */   public kh q;
/*      */   public qr r;
/*      */   public gv s;
/*      */   public iw t;
/*      */   private bo V;
/*      */   private int W;
/*      */   private int X;
/*      */   private int Y;
/*      */   private int Z;
/*      */   public mn u;
/*      */   public abj v;
/*      */   public boolean w;
/*      */   public rx x;
/*      */   public ma y;
/*      */   public fv z;
/*      */   protected MinecraftApplet A;
/*      */   public oe B;
/*      */   public acf C;
/*      */   public er D;
/*      */   public File E;
/*      */   private hr aa;
/* 1734 */   public static long[] F = new long[512];
/* 1735 */   public static long[] G = new long[512];
/* 1736 */   public static int H = 0;
/* 1737 */   public static long I = 0L;
/*      */   private int ab;
/*      */   public add J;
/*      */   private String ac;
/*      */   private int ad;
/*      */   private mk ae;
/*      */   private bb af;
/* 1744 */   private static File ag = null;
/*      */   public volatile boolean K;
/*      */   public String L;
/*      */   boolean M;
/*      */   long N;
/*      */   public boolean O;
/*      */   public boolean P;
/*      */   long Q;
/*      */   private int ah;
/*      */ 
/*      */   public Minecraft(Component component, Canvas canvas, MinecraftApplet minecraftapplet, int i, int j, boolean flag)
/*      */   {
/*   31 */     this.R = false;
/*   32 */     this.S = false;
/*   33 */     this.U = new yr(20.0F);
/*   34 */     this.k = null;
/*   35 */     this.n = true;
/*   36 */     this.o = false;
/*   37 */     this.r = null;
/*   38 */     this.W = 0;
/*   39 */     this.X = 0;
/*   40 */     this.u = new mn(this);
/*   41 */     this.w = false;
/*   42 */     this.x = new rx(0.0F);
/*   43 */     this.y = null;
/*   44 */     this.B = new oe();
/*   45 */     this.ab = 0;
/*   46 */     this.ae = new mk();
/*   47 */     this.af = new bb();
/*   48 */     this.K = true;
/*   49 */     this.L = "";
/*   50 */     this.M = false;
/*   51 */     this.N = -1L;
/*   52 */     this.O = false;
/*   53 */     this.P = false;
/*   54 */     this.Q = System.currentTimeMillis();
/*   55 */     this.ah = 0;
/*   56 */     fd.a();
/*   57 */     this.Z = j;
/*   58 */     this.R = flag;
/*   59 */     this.A = minecraftapplet;
/*   60 */     new fl(this, "Timer hack thread");
/*   61 */     this.m = canvas;
/*   62 */     this.d = i;
/*   63 */     this.e = j;
/*   64 */     this.R = flag;
/*   65 */     if ((minecraftapplet == null) || ("true".equals(minecraftapplet.getParameter("stand-alone"))))
/*      */     {
/*   67 */       this.n = false;
/*      */     }
/*   69 */     a = this;
/*      */   }
/*      */ 
/*      */   public void b(gs unexpectedthrowable)
/*      */   {
/*   74 */     this.S = true;
/*   75 */     a(unexpectedthrowable);
/*      */   }
/*      */ 
/*      */   public abstract void a(gs paramgs);
/*      */ 
/*      */   public void a(String s, int i)
/*      */   {
/*   82 */     this.ac = s;
/*   83 */     this.ad = i;
/*      */   }
/*      */ 
/*      */   public void a()
/*      */     throws LWJGLException
/*      */   {
/*   89 */     if (this.m != null)
/*      */     {
/*   91 */       Graphics g = this.m.getGraphics();
/*   92 */       if (g != null)
/*      */       {
/*   94 */         g.setColor(Color.BLACK);
/*   95 */         g.fillRect(0, 0, this.d, this.e);
/*   96 */         g.dispose();
/*      */       }
/*   98 */       Display.setParent(this.m);
/*      */     }
/*  100 */     else if (this.R)
/*      */     {
/*  102 */       Display.setFullscreen(true);
/*  103 */       this.d = Display.getDisplayMode().getWidth();
/*  104 */       this.e = Display.getDisplayMode().getHeight();
/*  105 */       if (this.d <= 0)
/*      */       {
/*  107 */         this.d = 1;
/*      */       }
/*  109 */       if (this.e <= 0)
/*      */       {
/*  111 */         this.e = 1;
/*      */       }
/*      */     }
/*      */     else {
/*  115 */       Display.setDisplayMode(new DisplayMode(this.d, this.e));
/*      */     }
/*  117 */     Display.setTitle("Minecraft Minecraft Beta 1.8.1");
/*      */     try
/*      */     {
/*  120 */       PixelFormat pixelformat = new PixelFormat();
/*  121 */       pixelformat = pixelformat.withDepthBits(24);
/*  122 */       Display.create(pixelformat);
/*      */     }
/*      */     catch (LWJGLException lwjglexception)
/*      */     {
/*  126 */       lwjglexception.printStackTrace();
/*      */       try
/*      */       {
/*  129 */         Thread.sleep(1000L);
/*      */       } catch (InterruptedException interruptedexception) {
/*      */       }
/*  132 */       Display.create();
/*      */     }
/*  134 */     this.E = b();
/*  135 */     this.aa = new ed(new File(this.E, "saves"));
/*  136 */     this.z = new fv(this, this.E);
/*  137 */     this.D = new er(this, this.E);
/*  138 */     this.p = new ur(this.D, this.z);
/*  139 */     x();
/*  140 */     this.q = new kh(this.z, "/font/default.png", this.p);
/*  141 */     tt.a(this.p.a("/misc/watercolor.png"));
/*  142 */     tv.a(this.p.a("/misc/grasscolor.png"));
/*  143 */     fc.a(this.p.a("/misc/foliagecolor.png"));
/*  144 */     this.t = new iw(this);
/*  145 */     aam.a.f = new jo(this);
/*  146 */     this.J = new add(this.k, this.E);
/*  147 */     cp.f.a(new fm(this));
/*  148 */     x();
/*  149 */     Keyboard.create();
/*  150 */     Mouse.create();
/*  151 */     this.C = new acf(this.m);
/*      */     try
/*      */     {
/*  154 */       Controllers.create();
/*      */     }
/*      */     catch (Exception exception)
/*      */     {
/*  158 */       exception.printStackTrace();
/*      */     }
/*  160 */     c("Pre startup");
/*  161 */     GL11.glEnable(3553);
/*  162 */     GL11.glShadeModel(7425);
/*  163 */     GL11.glClearDepth(1.0D);
/*  164 */     GL11.glEnable(2929);
/*  165 */     GL11.glDepthFunc(515);
/*  166 */     GL11.glEnable(3008);
/*  167 */     GL11.glAlphaFunc(516, 0.1F);
/*  168 */     GL11.glCullFace(1029);
/*  169 */     GL11.glMatrixMode(5889);
/*  170 */     GL11.glLoadIdentity();
/*  171 */     GL11.glMatrixMode(5888);
/*  172 */     c("Startup");
/*  173 */     this.T = new qp();
/*  174 */     this.B.a(this.z);
/*  175 */     this.p.a(this.af);
/*  176 */     this.p.a(this.ae);
/*  177 */     this.p.a(new tp());
/*  178 */     this.p.a(new ph(this));
/*  179 */     this.p.a(new fu(this));
/*  180 */     this.p.a(new xn());
/*  181 */     this.p.a(new eo());
/*  182 */     this.p.a(new ke(0));
/*  183 */     this.p.a(new ke(1));
/*  184 */     this.g = new i(this, this.p);
/*  185 */     GL11.glViewport(0, 0, this.d, this.e);
/*  186 */     this.j = new bz(this.f, this.p);
/*      */     try
/*      */     {
/*  189 */       this.V = new bo(this.E, this);
/*  190 */       this.V.start();
/*      */     } catch (Exception exception1) {
/*      */     }
/*  193 */     c("Post startup");
/*  194 */     this.v = new abj(this);
/*  195 */     if (this.ac != null)
/*      */     {
/*  197 */       a(new acd(this, this.ac, this.ad));
/*      */     }
/*      */     else {
/*  200 */       a(new sf());
/*      */     }
/*  202 */     this.s = new gv(this);
/*      */   }
/*      */ 
/*      */   private void x()
/*      */     throws LWJGLException
/*      */   {
/*  208 */     za scaledresolution = new za(this.z, this.d, this.e);
/*  209 */     GL11.glClear(16640);
/*  210 */     GL11.glMatrixMode(5889);
/*  211 */     GL11.glLoadIdentity();
/*  212 */     GL11.glOrtho(0.0D, scaledresolution.a, scaledresolution.b, 0.0D, 1000.0D, 3000.0D);
/*  213 */     GL11.glMatrixMode(5888);
/*  214 */     GL11.glLoadIdentity();
/*  215 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*  216 */     GL11.glViewport(0, 0, this.d, this.e);
/*  217 */     GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
/*  218 */     xe tessellator = xe.a;
/*  219 */     GL11.glDisable(2896);
/*  220 */     GL11.glEnable(3553);
/*  221 */     GL11.glDisable(2912);
/*  222 */     GL11.glBindTexture(3553, this.p.b("/title/mojang.png"));
/*  223 */     tessellator.b();
/*  224 */     tessellator.c(16777215);
/*  225 */     tessellator.a(0.0D, this.e, 0.0D, 0.0D, 0.0D);
/*  226 */     tessellator.a(this.d, this.e, 0.0D, 0.0D, 0.0D);
/*  227 */     tessellator.a(this.d, 0.0D, 0.0D, 0.0D, 0.0D);
/*  228 */     tessellator.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*  229 */     tessellator.a();
/*  230 */     char c = 'Ā';
/*  231 */     char c1 = 'Ā';
/*  232 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  233 */     tessellator.c(16777215);
/*  234 */     a((scaledresolution.a() - c) / 2, (scaledresolution.b() - c1) / 2, 0, 0, c, c1);
/*  235 */     GL11.glDisable(2896);
/*  236 */     GL11.glDisable(2912);
/*  237 */     GL11.glEnable(3008);
/*  238 */     GL11.glAlphaFunc(516, 0.1F);
/*  239 */     Display.swapBuffers();
/*      */   }
/*      */ 
/*      */   public void a(int i, int j, int k, int l, int i1, int j1)
/*      */   {
/*  244 */     float f = 0.0039063F;
/*  245 */     float f1 = 0.0039063F;
/*  246 */     xe tessellator = xe.a;
/*  247 */     tessellator.b();
/*  248 */     tessellator.a(i + 0, j + j1, 0.0D, (k + 0) * f, (l + j1) * f1);
/*  249 */     tessellator.a(i + i1, j + j1, 0.0D, (k + i1) * f, (l + j1) * f1);
/*  250 */     tessellator.a(i + i1, j + 0, 0.0D, (k + i1) * f, (l + 0) * f1);
/*  251 */     tessellator.a(i + 0, j + 0, 0.0D, (k + 0) * f, (l + 0) * f1);
/*  252 */     tessellator.a();
/*      */   }
/*      */ 
/*      */   public static File b()
/*      */   {
/*  257 */     if (ag == null)
/*      */     {
/*  259 */       ag = a("minecraft");
/*      */     }
/*  261 */     return ag;
/*      */   }
/*      */ 
/*      */   public static File a(String s)
/*      */   {
/*  266 */     String s1 = System.getProperty("user.home", ".");
/*      */     File file;
/*      */     File file;
/*  268 */     switch (fp.a[y().ordinal()])
/*      */     {
/*      */     case 1:
/*      */     case 2:
/*  272 */       file = new File(s1, '.' + s + '/');
/*  273 */       break;
/*      */     case 3:
/*  276 */       String s2 = System.getenv("APPDATA");
/*  277 */       if (s2 != null)
/*      */       {
/*  279 */         file = new File(s2, "." + s + '/');
/*      */       }
/*      */       else {
/*  282 */         file = new File(s1, '.' + s + '/');
/*      */       }
/*  284 */       break;
/*      */     case 4:
/*  287 */       file = new File(s1, "Library/Application Support/" + s);
/*  288 */       break;
/*      */     default:
/*  291 */       file = new File(s1, s + '/');
/*      */     }
/*      */ 
/*  294 */     if ((!file.exists()) && (!file.mkdirs()))
/*      */     {
/*  296 */       throw new RuntimeException("The working directory could not be created: " + file);
/*      */     }
/*      */ 
/*  299 */     return file;
/*      */   }
/*      */ 
/*      */   private static yb y()
/*      */   {
/*  305 */     String s = System.getProperty("os.name").toLowerCase();
/*  306 */     if (s.contains("win"))
/*      */     {
/*  308 */       return yb.c;
/*      */     }
/*  310 */     if (s.contains("mac"))
/*      */     {
/*  312 */       return yb.d;
/*      */     }
/*  314 */     if (s.contains("solaris"))
/*      */     {
/*  316 */       return yb.b;
/*      */     }
/*  318 */     if (s.contains("sunos"))
/*      */     {
/*  320 */       return yb.b;
/*      */     }
/*  322 */     if (s.contains("linux"))
/*      */     {
/*  324 */       return yb.a;
/*      */     }
/*  326 */     if (s.contains("unix"))
/*      */     {
/*  328 */       return yb.a;
/*      */     }
/*      */ 
/*  331 */     return yb.e;
/*      */   }
/*      */ 
/*      */   public hr c()
/*      */   {
/*  337 */     return this.aa;
/*      */   }
/*      */ 
/*      */   public void a(qr guiscreen)
/*      */   {
/*  342 */     if ((this.r instanceof qe))
/*      */     {
/*  344 */       return;
/*      */     }
/*  346 */     if (this.r != null)
/*      */     {
/*  348 */       this.r.d();
/*      */     }
/*  350 */     if ((guiscreen instanceof sf))
/*      */     {
/*  352 */       this.J.b();
/*      */     }
/*  354 */     this.J.c();
/*  355 */     if ((guiscreen == null) && (this.f == null))
/*      */     {
/*  357 */       guiscreen = new sf();
/*      */     }
/*  359 */     else if ((guiscreen == null) && (this.h.bz <= 0))
/*      */     {
/*  361 */       guiscreen = new qg();
/*      */     }
/*  363 */     if ((guiscreen instanceof sf))
/*      */     {
/*  365 */       this.v.b();
/*      */     }
/*  367 */     this.r = guiscreen;
/*  368 */     if (guiscreen != null)
/*      */     {
/*  370 */       h();
/*  371 */       za scaledresolution = new za(this.z, this.d, this.e);
/*  372 */       int i = scaledresolution.a();
/*  373 */       int j = scaledresolution.b();
/*  374 */       guiscreen.a(this, i, j);
/*  375 */       this.w = false;
/*      */     }
/*      */     else {
/*  378 */       g();
/*      */     }
/*      */   }
/*      */ 
/*      */   private void c(String s)
/*      */   {
/*  384 */     int i = GL11.glGetError();
/*  385 */     if (i != 0)
/*      */     {
/*  387 */       String s1 = GLU.gluErrorString(i);
/*  388 */       System.out.println("########## GL ERROR ##########");
/*  389 */       System.out.println("@ " + s);
/*  390 */       System.out.println(i + ": " + s1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void d()
/*      */   {
/*      */     try
/*      */     {
/*  398 */       this.J.b();
/*  399 */       this.J.c();
/*  400 */       if (this.A != null)
/*      */       {
/*  402 */         this.A.c();
/*      */       }
/*      */       try
/*      */       {
/*  406 */         if (this.V != null)
/*      */         {
/*  408 */           this.V.b();
/*      */         }
/*      */       } catch (Exception exception) {
/*      */       }
/*  412 */       System.out.println("Stopping!");
/*      */       try
/*      */       {
/*  415 */         a(null);
/*      */       }
/*      */       catch (Throwable throwable) {
/*      */       }
/*      */       try {
/*  420 */         dl.a();
/*      */       } catch (Throwable throwable1) {
/*      */       }
/*  423 */       this.B.b();
/*  424 */       Mouse.destroy();
/*  425 */       Keyboard.destroy();
/*      */     }
/*      */     finally
/*      */     {
/*  429 */       Display.destroy();
/*  430 */       if (!this.S)
/*      */       {
/*  432 */         System.exit(0);
/*      */       }
/*      */     }
/*  435 */     System.gc();
/*      */   }
/*      */ 
/*      */   public void run()
/*      */   {
/*  440 */     this.K = true;
/*      */     try
/*      */     {
/*  443 */       a();
/*      */     }
/*      */     catch (Exception exception)
/*      */     {
/*  447 */       exception.printStackTrace();
/*  448 */       b(new gs("Failed to start game", exception));
/*  449 */       return;
/*      */     }
/*      */     try
/*      */     {
/*  453 */       long l = System.currentTimeMillis();
/*  454 */       int i = 0;
/*      */ 
/*  457 */       while (this.K)
/*      */       {
/*      */         try
/*      */         {
/*  463 */           if ((this.A != null) && (!this.A.isActive()))
/*      */           {
/*      */             break;
/*      */           }
/*  467 */           rp.b();
/*  468 */           ax.b();
/*  469 */           if ((this.m == null) && (Display.isCloseRequested()))
/*      */           {
/*  471 */             f();
/*      */           }
/*  473 */           if ((this.o) && (this.f != null))
/*      */           {
/*  475 */             float f = this.U.c;
/*  476 */             this.U.a();
/*  477 */             this.U.c = f;
/*      */           }
/*      */           else {
/*  480 */             this.U.a();
/*      */           }
/*  482 */           long l1 = System.nanoTime();
/*  483 */           for (int j = 0; j < this.U.b; j++)
/*      */           {
/*  485 */             this.W += 1;
/*      */             try
/*      */             {
/*      */             }
/*      */             catch (abl minecraftexception1)
/*      */             {
/*  493 */               this.f = null;
/*      */ 
/*  495 */               a(null);
/*  496 */               a(new yw());
/*      */             }
/*      */           }
/*  499 */           long l2 = System.nanoTime() - l1;
/*  500 */           c("Pre render");
/*  501 */           qo.a = this.z.j;
/*  502 */           this.B.a(this.h, this.U.c);
/*  503 */           GL11.glEnable(3553);
/*  504 */           if (this.f != null)
/*      */           {
/*  506 */             this.f.D();
/*      */           }
/*  508 */           if (!Keyboard.isKeyDown(65))
/*      */           {
/*  510 */             Display.update();
/*      */           }
/*  512 */           if ((this.h != null) && (this.h.H()))
/*      */           {
/*  514 */             this.z.D = false;
/*      */           }
/*  516 */           if (!this.w)
/*      */           {
/*  518 */             if (this.c != null)
/*      */             {
/*  520 */               this.c.a(this.U.c);
/*      */             }
/*  522 */             this.t.b(this.U.c);
/*      */           }
/*  524 */           if ((!Display.isActive()) && (this.R))
/*      */           {
/*  526 */             j();
/*      */           }
/*  528 */           if (this.z.E)
/*      */           {
/*  530 */             a(l2);
/*      */           }
/*      */           else {
/*  533 */             this.N = System.nanoTime();
/*      */           }
/*  535 */           this.u.a();
/*  536 */           Thread.yield();
/*  537 */           if (Keyboard.isKeyDown(65))
/*      */           {
/*  539 */             Display.update();
/*      */           }
/*  541 */           z();
/*  542 */           if ((this.m != null) && (!this.R) && ((this.m.getWidth() != this.d) || (this.m.getHeight() != this.e)))
/*      */           {
/*  544 */             this.d = this.m.getWidth();
/*  545 */             this.e = this.m.getHeight();
/*  546 */             if (this.d <= 0)
/*      */             {
/*  548 */               this.d = 1;
/*      */             }
/*  550 */             if (this.e <= 0)
/*      */             {
/*  552 */               this.e = 1;
/*      */             }
/*  554 */             a(this.d, this.e);
/*      */           }
/*  556 */           c("Post render");
/*  557 */           i++;
/*  558 */           this.o = ((!l()) && (this.r != null) && (this.r.e()));
/*  559 */           while (System.currentTimeMillis() >= l + 1000L)
/*      */           {
/*  561 */             this.L = (i + " fps, " + bv.b + " chunk updates");
/*  562 */             bv.b = 0;
/*  563 */             l += 1000L;
/*  564 */             i = 0;
/*      */           }
/*      */         }
/*      */         catch (abl minecraftexception)
/*      */         {
/*  569 */           this.f = null;
/*  570 */           a(null);
/*  571 */           a(new yw());
/*      */         }
/*      */         catch (OutOfMemoryError outofmemoryerror)
/*      */         {
/*  575 */           e();
/*  576 */           a(new oy());
/*  577 */           System.gc();
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (nw minecrafterror) {
/*      */     }
/*      */     catch (Throwable throwable) {
/*  584 */       e();
/*  585 */       throwable.printStackTrace();
/*  586 */       b(new gs("Unexpected error", throwable));
/*      */     }
/*      */     finally
/*      */     {
/*  590 */       d();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void e()
/*      */   {
/*      */     try
/*      */     {
/*  598 */       b = new byte[0];
/*  599 */       this.g.e();
/*      */     }
/*      */     catch (Throwable throwable) {
/*      */     }
/*      */     try {
/*  604 */       System.gc();
/*  605 */       rp.a();
/*  606 */       ax.a();
/*      */     }
/*      */     catch (Throwable throwable1) {
/*      */     }
/*      */     try {
/*  611 */       System.gc();
/*  612 */       a(null);
/*      */     } catch (Throwable throwable2) {
/*      */     }
/*  615 */     System.gc();
/*      */   }
/*      */ 
/*      */   private void z()
/*      */   {
/*  620 */     if (Keyboard.isKeyDown(60))
/*      */     {
/*  622 */       if (!this.M)
/*      */       {
/*  624 */         this.M = true;
/*  625 */         this.v.a(ti.a(ag, this.d, this.e));
/*      */       }
/*      */     }
/*      */     else
/*  629 */       this.M = false;
/*      */   }
/*      */ 
/*      */   private void a(long l)
/*      */   {
/*  635 */     long l1 = 16666666L;
/*  636 */     if (this.N == -1L)
/*      */     {
/*  638 */       this.N = System.nanoTime();
/*      */     }
/*  640 */     long l2 = System.nanoTime();
/*  641 */     G[(H & F.length - 1)] = l;
/*  642 */     F[(H++ & F.length - 1)] = (l2 - this.N);
/*  643 */     this.N = l2;
/*  644 */     GL11.glClear(256);
/*  645 */     GL11.glMatrixMode(5889);
/*  646 */     GL11.glLoadIdentity();
/*  647 */     GL11.glOrtho(0.0D, this.d, this.e, 0.0D, 1000.0D, 3000.0D);
/*  648 */     GL11.glMatrixMode(5888);
/*  649 */     GL11.glLoadIdentity();
/*  650 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*  651 */     GL11.glLineWidth(1.0F);
/*  652 */     GL11.glDisable(3553);
/*  653 */     xe tessellator = xe.a;
/*  654 */     tessellator.a(7);
/*  655 */     int i = (int)(l1 / 200000L);
/*  656 */     tessellator.c(536870912);
/*  657 */     tessellator.a(0.0D, this.e - i, 0.0D);
/*  658 */     tessellator.a(0.0D, this.e, 0.0D);
/*  659 */     tessellator.a(F.length, this.e, 0.0D);
/*  660 */     tessellator.a(F.length, this.e - i, 0.0D);
/*  661 */     tessellator.c(538968064);
/*  662 */     tessellator.a(0.0D, this.e - i * 2, 0.0D);
/*  663 */     tessellator.a(0.0D, this.e - i, 0.0D);
/*  664 */     tessellator.a(F.length, this.e - i, 0.0D);
/*  665 */     tessellator.a(F.length, this.e - i * 2, 0.0D);
/*  666 */     tessellator.a();
/*  667 */     long l3 = 0L;
/*  668 */     for (int j = 0; j < F.length; j++)
/*      */     {
/*  670 */       l3 += F[j];
/*      */     }
/*      */ 
/*  673 */     int k = (int)(l3 / 200000L / F.length);
/*  674 */     tessellator.a(7);
/*  675 */     tessellator.c(541065216);
/*  676 */     tessellator.a(0.0D, this.e - k, 0.0D);
/*  677 */     tessellator.a(0.0D, this.e, 0.0D);
/*  678 */     tessellator.a(F.length, this.e, 0.0D);
/*  679 */     tessellator.a(F.length, this.e - k, 0.0D);
/*  680 */     tessellator.a();
/*  681 */     tessellator.a(1);
/*  682 */     for (int i1 = 0; i1 < F.length; i1++)
/*      */     {
/*  684 */       int j1 = (i1 - H & F.length - 1) * 255 / F.length;
/*  685 */       int k1 = j1 * j1 / 255;
/*  686 */       k1 = k1 * k1 / 255;
/*  687 */       int i2 = k1 * k1 / 255;
/*  688 */       i2 = i2 * i2 / 255;
/*  689 */       if (F[i1] > l1)
/*      */       {
/*  691 */         tessellator.c(-16777216 + k1 * 65536);
/*      */       }
/*      */       else {
/*  694 */         tessellator.c(-16777216 + k1 * 256);
/*      */       }
/*  696 */       long l4 = F[i1] / 200000L;
/*  697 */       long l5 = G[i1] / 200000L;
/*  698 */       tessellator.a(i1 + 0.5F, (float)(this.e - l4) + 0.5F, 0.0D);
/*  699 */       tessellator.a(i1 + 0.5F, this.e + 0.5F, 0.0D);
/*  700 */       tessellator.c(-16777216 + k1 * 65536 + k1 * 256 + k1 * 1);
/*  701 */       tessellator.a(i1 + 0.5F, (float)(this.e - l4) + 0.5F, 0.0D);
/*  702 */       tessellator.a(i1 + 0.5F, (float)(this.e - (l4 - l5)) + 0.5F, 0.0D);
/*      */     }
/*      */ 
/*  705 */     tessellator.a();
/*  706 */     GL11.glEnable(3553);
/*      */   }
/*      */ 
/*      */   public void f()
/*      */   {
/*  711 */     this.K = false;
/*      */   }
/*      */ 
/*      */   public void g()
/*      */   {
/*  716 */     if (!Display.isActive())
/*      */     {
/*  718 */       return;
/*      */     }
/*  720 */     if (this.O)
/*      */     {
/*  722 */       return;
/*      */     }
/*      */ 
/*  725 */     this.O = true;
/*  726 */     this.C.a();
/*  727 */     a(null);
/*  728 */     this.X = 10000;
/*      */   }
/*      */ 
/*      */   public void h()
/*      */   {
/*  735 */     if (!this.O)
/*      */     {
/*  737 */       return;
/*      */     }
/*      */ 
/*  740 */     ys.a();
/*  741 */     this.O = false;
/*  742 */     this.C.b();
/*      */   }
/*      */ 
/*      */   public void i()
/*      */   {
/*  749 */     if (this.r != null)
/*      */     {
/*  751 */       return;
/*      */     }
/*      */ 
/*  754 */     a(new in());
/*      */   }
/*      */ 
/*      */   private void a(int i, boolean flag)
/*      */   {
/*  761 */     if (!flag)
/*      */     {
/*  763 */       this.X = 0;
/*      */     }
/*  765 */     if ((i == 0) && (this.X > 0))
/*      */     {
/*  767 */       return;
/*      */     }
/*  769 */     if ((flag) && (this.y != null) && (this.y.a == up.a) && (i == 0))
/*      */     {
/*  771 */       int j = this.y.b;
/*  772 */       int k = this.y.c;
/*  773 */       int l = this.y.d;
/*  774 */       this.c.c(j, k, l, this.y.e);
/*  775 */       if (this.h.e(j, k, l))
/*      */       {
/*  777 */         this.j.a(j, k, l, this.y.e);
/*  778 */         this.h.al();
/*      */       }
/*      */     }
/*      */     else {
/*  782 */       this.c.a();
/*      */     }
/*      */   }
/*      */ 
/*      */   private void a(int i)
/*      */   {
/*  788 */     if ((i == 0) && (this.X > 0))
/*      */     {
/*  790 */       return;
/*      */     }
/*  792 */     if (i == 0)
/*      */     {
/*  794 */       this.h.al();
/*      */     }
/*  796 */     if (i == 1)
/*      */     {
/*  798 */       this.ab = 6;
/*      */     }
/*  800 */     boolean flag = true;
/*  801 */     ul itemstack = this.h.as.b();
/*  802 */     if (this.y == null)
/*      */     {
/*  804 */       if ((i == 0) && (this.c.g()))
/*      */       {
/*  806 */         this.X = 10;
/*      */       }
/*      */     }
/*  809 */     else if (this.y.a == up.b)
/*      */     {
/*  811 */       if (i == 0)
/*      */       {
/*  813 */         this.c.b(this.h, this.y.g);
/*      */       }
/*  815 */       if (i == 1)
/*      */       {
/*  817 */         this.c.a(this.h, this.y.g);
/*      */       }
/*      */     }
/*  820 */     else if (this.y.a == up.a)
/*      */     {
/*  822 */       int j = this.y.b;
/*  823 */       int k = this.y.c;
/*  824 */       int l = this.y.d;
/*  825 */       int i1 = this.y.e;
/*  826 */       if (i == 0)
/*      */       {
/*  828 */         this.c.a(j, k, l, this.y.e);
/*      */       }
/*      */       else {
/*  831 */         ul itemstack2 = itemstack;
/*  832 */         int j1 = itemstack2 == null ? 0 : itemstack2.a;
/*  833 */         if (this.c.a(this.h, this.f, itemstack2, j, k, l, i1))
/*      */         {
/*  835 */           flag = false;
/*  836 */           this.h.al();
/*      */         }
/*  838 */         if (itemstack2 == null)
/*      */         {
/*  840 */           return;
/*      */         }
/*  842 */         if (itemstack2.a == 0)
/*      */         {
/*  844 */           this.h.as.a[this.h.as.c] = null;
/*      */         }
/*  846 */         else if ((itemstack2.a != j1) || (this.c.h()))
/*      */         {
/*  848 */           this.t.c.b();
/*      */         }
/*      */       }
/*      */     }
/*  852 */     if ((flag) && (i == 1))
/*      */     {
/*  854 */       ul itemstack1 = this.h.as.b();
/*  855 */       if ((itemstack1 != null) && (this.c.a(this.h, this.f, itemstack1)))
/*      */       {
/*  857 */         this.t.c.c();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void j()
/*      */   {
/*      */     try
/*      */     {
/*  866 */       this.R = (!this.R);
/*  867 */       if (this.R)
/*      */       {
/*  869 */         Display.setDisplayMode(Display.getDesktopDisplayMode());
/*  870 */         this.d = Display.getDisplayMode().getWidth();
/*  871 */         this.e = Display.getDisplayMode().getHeight();
/*  872 */         if (this.d <= 0)
/*      */         {
/*  874 */           this.d = 1;
/*      */         }
/*  876 */         if (this.e <= 0)
/*      */         {
/*  878 */           this.e = 1;
/*      */         }
/*      */       }
/*      */       else {
/*  882 */         if (this.m != null)
/*      */         {
/*  884 */           this.d = this.m.getWidth();
/*  885 */           this.e = this.m.getHeight();
/*      */         }
/*      */         else {
/*  888 */           this.d = this.Y;
/*  889 */           this.e = this.Z;
/*      */         }
/*  891 */         if (this.d <= 0)
/*      */         {
/*  893 */           this.d = 1;
/*      */         }
/*  895 */         if (this.e <= 0)
/*      */         {
/*  897 */           this.e = 1;
/*      */         }
/*      */       }
/*  900 */       if (this.r != null)
/*      */       {
/*  902 */         a(this.d, this.e);
/*      */       }
/*  904 */       Display.setFullscreen(this.R);
/*  905 */       Display.update();
/*      */     }
/*      */     catch (Exception exception)
/*      */     {
/*  909 */       exception.printStackTrace();
/*      */     }
/*      */   }
/*      */ 
/*      */   private void a(int i, int j)
/*      */   {
/*  915 */     if (i <= 0)
/*      */     {
/*  917 */       i = 1;
/*      */     }
/*  919 */     if (j <= 0)
/*      */     {
/*  921 */       j = 1;
/*      */     }
/*  923 */     this.d = i;
/*  924 */     this.e = j;
/*  925 */     if (this.r != null)
/*      */     {
/*  927 */       za scaledresolution = new za(this.z, i, j);
/*  928 */       int k = scaledresolution.a();
/*  929 */       int l = scaledresolution.b();
/*  930 */       this.r.a(this, k, l);
/*      */     }
/*      */   }
/*      */ 
/*      */   private void A()
/*      */   {
/*  936 */     new fr(this).start();
/*      */   }
/*      */ 
/*      */   public void k()
/*      */   {
/*  941 */     if (this.ab > 0)
/*      */     {
/*  943 */       this.ab -= 1;
/*      */     }
/*  945 */     if (this.W == 6000)
/*      */     {
/*  947 */       A();
/*      */     }
/*  949 */     this.J.d();
/*  950 */     this.v.a();
/*  951 */     this.t.a(1.0F);
/*  952 */     if (this.h != null)
/*      */     {
/*  954 */       bf ichunkprovider = this.f.w();
/*  955 */       if ((ichunkprovider instanceof fx))
/*      */       {
/*  957 */         fx chunkproviderloadorgenerate = (fx)ichunkprovider;
/*  958 */         int j = et.d((int)this.h.o) >> 4;
/*  959 */         int i1 = et.d((int)this.h.q) >> 4;
/*  960 */         chunkproviderloadorgenerate.d(j, i1);
/*      */       }
/*      */     }
/*  963 */     if ((!this.o) && (this.f != null))
/*      */     {
/*  965 */       this.c.c();
/*      */     }
/*  967 */     GL11.glBindTexture(3553, this.p.b("/terrain.png"));
/*  968 */     if (!this.o)
/*      */     {
/*  970 */       this.p.a();
/*      */     }
/*  972 */     if ((this.r == null) && (this.h != null))
/*      */     {
/*  974 */       if (this.h.bz <= 0)
/*      */       {
/*  976 */         a(null);
/*      */       }
/*  978 */       else if ((this.h.an()) && (this.f != null) && (this.f.I))
/*      */       {
/*  980 */         a(new sq());
/*      */       }
/*      */     }
/*  983 */     else if ((this.r != null) && ((this.r instanceof sq)) && (!this.h.an()))
/*      */     {
/*  985 */       a(null);
/*      */     }
/*  987 */     if (this.r != null)
/*      */     {
/*  989 */       this.X = 10000;
/*      */     }
/*  991 */     if (this.r != null)
/*      */     {
/*  993 */       this.r.i();
/*  994 */       if (this.r != null)
/*      */       {
/*  996 */         this.r.r.a();
/*  997 */         this.r.p_();
/*      */       }
/*      */     }
/* 1000 */     if ((this.r == null) || (this.r.p))
/*      */     {
/* 1004 */       while (Mouse.next())
/*      */       {
/* 1008 */         ys.a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
/* 1009 */         if (Mouse.getEventButtonState())
/*      */         {
/* 1011 */           ys.a(Mouse.getEventButton() - 100);
/*      */         }
/* 1013 */         long l = System.currentTimeMillis() - this.Q;
/* 1014 */         if (l <= 200L)
/*      */         {
/* 1016 */           int k = Mouse.getEventDWheel();
/* 1017 */           if (k != 0)
/*      */           {
/* 1019 */             this.h.as.b(k);
/* 1020 */             if (this.z.G)
/*      */             {
/* 1022 */               if (k > 0)
/*      */               {
/* 1024 */                 k = 1;
/*      */               }
/* 1026 */               if (k < 0)
/*      */               {
/* 1028 */                 k = -1;
/*      */               }
/* 1030 */               this.z.J += k * 0.25F;
/*      */             }
/*      */           }
/* 1033 */           if (this.r == null)
/*      */           {
/* 1035 */             if ((!this.O) && (Mouse.getEventButtonState()))
/*      */             {
/* 1037 */               g();
/*      */             }
/*      */           }
/* 1040 */           else if (this.r != null)
/*      */           {
/* 1042 */             this.r.f();
/*      */           }
/*      */         }
/*      */       }
/* 1046 */       if (this.X > 0)
/*      */       {
/* 1048 */         this.X -= 1;
/*      */       }
/*      */ 
/* 1052 */       while (Keyboard.next())
/*      */       {
/* 1056 */         ys.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
/* 1057 */         if (Keyboard.getEventKeyState())
/*      */         {
/* 1059 */           ys.a(Keyboard.getEventKey());
/*      */         }
/* 1061 */         if (Keyboard.getEventKeyState())
/*      */         {
/* 1063 */           if (Keyboard.getEventKey() == 87)
/*      */           {
/* 1065 */             j();
/*      */           }
/*      */           else {
/* 1068 */             if (this.r != null)
/*      */             {
/* 1070 */               this.r.j();
/*      */             }
/*      */             else {
/* 1073 */               if (Keyboard.getEventKey() == 1)
/*      */               {
/* 1075 */                 i();
/*      */               }
/* 1077 */               if ((Keyboard.getEventKey() == 31) && (Keyboard.isKeyDown(61)))
/*      */               {
/* 1079 */                 B();
/*      */               }
/* 1081 */               if ((Keyboard.getEventKey() == 33) && (Keyboard.isKeyDown(61)))
/*      */               {
/* 1083 */                 boolean flag = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
/* 1084 */                 this.z.a(tq.g, flag ? -1 : 1);
/*      */               }
/* 1086 */               if (Keyboard.getEventKey() == 59)
/*      */               {
/* 1088 */                 this.z.C = (!this.z.C);
/*      */               }
/* 1090 */               if (Keyboard.getEventKey() == 61)
/*      */               {
/* 1092 */                 this.z.E = (!this.z.E);
/*      */               }
/* 1094 */               if (Keyboard.getEventKey() == 63)
/*      */               {
/* 1096 */                 this.z.D = (!this.z.D);
/*      */               }
/*      */             }
/* 1099 */             int i = 0;
/* 1100 */             while (i < 9)
/*      */             {
/* 1102 */               if (Keyboard.getEventKey() == 2 + i)
/*      */               {
/* 1104 */                 this.h.as.c = i;
/*      */               }
/* 1106 */               i++;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/* 1111 */       while (this.z.r.c()) a(new abd(this.h));
/* 1112 */       while (this.z.s.c()) this.h.ah();
/* 1113 */       while ((l()) && (this.z.t.c())) a(new so());
/* 1114 */       if (this.h.Z())
/*      */       {
/* 1116 */         if (!this.z.w.e)
/*      */         {
/* 1118 */           this.c.c(this.h);
/*      */         }
/*      */       }
/*      */       else {
/* 1122 */         while (this.z.v.c()) a(0);
/* 1123 */         while (this.z.w.c()) a(1);
/* 1124 */         while (this.z.y.c()) C();
/*      */       }
/* 1126 */       if ((this.z.w.e) && (this.ab == 0) && (!this.h.Z()))
/*      */       {
/* 1128 */         a(1);
/*      */       }
/* 1130 */       a(0, (this.r == null) && (this.z.v.e) && (this.O));
/*      */     }
/* 1132 */     if (this.f != null)
/*      */     {
/* 1134 */       if (this.h != null)
/*      */       {
/* 1136 */         this.ah += 1;
/* 1137 */         if (this.ah == 30)
/*      */         {
/* 1139 */           this.ah = 0;
/* 1140 */           this.f.g(this.h);
/*      */         }
/*      */       }
/* 1143 */       this.f.v = this.z.B;
/* 1144 */       if (this.f.I)
/*      */       {
/* 1146 */         this.f.v = 1;
/*      */       }
/* 1148 */       if (!this.o)
/*      */       {
/* 1150 */         this.t.a();
/*      */       }
/* 1152 */       if (!this.o)
/*      */       {
/* 1154 */         this.g.d();
/*      */       }
/* 1156 */       if (!this.o)
/*      */       {
/* 1158 */         if (this.f.s > 0)
/*      */         {
/* 1160 */           this.f.s -= 1;
/*      */         }
/* 1162 */         this.f.l();
/*      */       }
/* 1164 */       if ((!this.o) || (l()))
/*      */       {
/* 1166 */         this.f.a(this.z.B > 0, true);
/* 1167 */         this.f.c();
/*      */       }
/* 1169 */       if ((!this.o) && (this.f != null))
/*      */       {
/* 1171 */         this.f.q(et.b(this.h.o), et.b(this.h.p), et.b(this.h.q));
/*      */       }
/* 1173 */       if (!this.o)
/*      */       {
/* 1175 */         this.j.a();
/*      */       }
/*      */     }
/* 1178 */     this.Q = System.currentTimeMillis();
/*      */   }
/*      */ 
/*      */   private void B()
/*      */   {
/* 1183 */     System.out.println("FORCING RELOAD!");
/* 1184 */     this.B = new oe();
/* 1185 */     this.B.a(this.z);
/* 1186 */     this.V.a();
/*      */   }
/*      */ 
/*      */   public boolean l()
/*      */   {
/* 1191 */     return (this.f != null) && (this.f.I);
/*      */   }
/*      */ 
/*      */   public void a(String s, String s1, dx worldsettings)
/*      */   {
/* 1196 */     a(null);
/* 1197 */     System.gc();
/* 1198 */     if (this.aa.a(s))
/*      */     {
/* 1200 */       b(s, s1);
/*      */     }
/*      */     else {
/* 1203 */       if (this.s != null)
/*      */       {
/* 1205 */         this.s.a("Switching level");
/* 1206 */         this.s.d("");
/*      */       }
/* 1208 */       acq isavehandler = this.aa.a(s, false);
/* 1209 */       rv world = new rv(isavehandler, s1, worldsettings);
/* 1210 */       if (world.x)
/*      */       {
/* 1212 */         this.J.a(fd.g, 1);
/* 1213 */         this.J.a(fd.f, 1);
/* 1214 */         a(world, "Generating level");
/*      */       }
/*      */       else {
/* 1217 */         this.J.a(fd.h, 1);
/* 1218 */         this.J.a(fd.f, 1);
/* 1219 */         a(world, "Loading level");
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void m()
/*      */   {
/* 1226 */     if ((this.f instanceof WorldWithLayers))
/*      */     {
/* 1228 */       WorldLayersInfo info = ((WorldWithLayers)this.f).getLayersInfo();
/* 1229 */       if (info.getFastTravel() == null)
/*      */       {
/* 1231 */         if (((WorldWithLayers)this.f).layers.length == 1)
/* 1232 */           return;
/* 1233 */         rv layer = this.h.chunkLayer;
/* 1234 */         if (layer == null) return;
/* 1235 */         int num = layer.worldNum;
/* 1236 */         if (num != 0)
/* 1237 */           num--;
/* 1238 */         else num = ((WorldWithLayers)this.f).layers.length - 1;
/* 1239 */         new ln().a(((WorldWithLayers)this.f).layers[num], this.h);
/* 1240 */         return;
/*      */       }
/*      */     }
/*      */ 
/* 1244 */     System.out.println("Toggling dimension!!");
/* 1245 */     if (this.h.aE == -1)
/*      */     {
/* 1247 */       this.h.aE = 0;
/*      */     }
/*      */     else {
/* 1250 */       this.h.aE = -1;
/*      */     }
/* 1252 */     this.f.b(this.h);
/* 1253 */     this.h.G = false;
/* 1254 */     double d = this.h.o;
/* 1255 */     double d1 = this.h.q;
/* 1256 */     double dy = (this.h.p - this.f.getWorldMinY()) / this.f.getWorldHeight();
/* 1257 */     double d2 = 8.0D;
/* 1258 */     if (this.h.aE == -1)
/*      */     {
/* 1260 */       d /= d2;
/* 1261 */       d1 /= d2;
/* 1262 */       this.h.c(d, this.h.p, d1, this.h.u, this.h.v);
/* 1263 */       if (this.h.G())
/*      */       {
/* 1265 */         this.f.a(this.h, false);
/*      */       }
/* 1267 */       rv world = null;
/* 1268 */       world = new rv(this.f, acz.a(-1));
/* 1269 */       a(world, "Entering the Nether", this.h);
/*      */     }
/*      */     else {
/* 1272 */       d *= d2;
/* 1273 */       d1 *= d2;
/* 1274 */       this.h.c(d, this.h.p, d1, this.h.u, this.h.v);
/* 1275 */       if (this.h.G())
/*      */       {
/* 1277 */         this.f.a(this.h, false);
/*      */       }
/* 1279 */       rv world1 = null;
/* 1280 */       world1 = new rv(this.f, acz.a(0));
/* 1281 */       a(world1, "Leaving the Nether", this.h);
/*      */     }
/* 1283 */     this.h.k = this.f;
/* 1284 */     if (this.h.G())
/*      */     {
/* 1286 */       dy *= this.f.getWorldHeight();
/* 1287 */       dy += this.f.getWorldMinY();
/* 1288 */       this.h.c(d, dy, d1, this.h.u, this.h.v);
/* 1289 */       this.f.a(this.h, false);
/* 1290 */       new ln().a(this.f, this.h);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(rv world)
/*      */   {
/* 1296 */     a(world, "");
/*      */   }
/*      */ 
/*      */   public void a(rv world, String s)
/*      */   {
/* 1301 */     a(world, s, null);
/*      */   }
/*      */ 
/*      */   public void a(rv world, String s, sz entityplayer)
/*      */   {
/* 1306 */     if ((world != null) && (!world.I))
/*      */     {
/* 1308 */       if (s.equals("Leaving the Nether"))
/*      */       {
/* 1310 */         s = ((WorldWithLayers)this.f).getLayersInfo().getFastTravel().getWorldType();
/* 1311 */         s = s.substring(0, 1).toUpperCase() + s.substring(1);
/* 1312 */         s = "Leaving the " + s;
/*      */       }
/*      */ 
/* 1315 */       if (entityplayer != null)
/* 1316 */         world = new WorldWithLayers(world, entityplayer.aE);
/* 1317 */       else world = new WorldWithLayers(world);
/*      */ 
/* 1319 */       if (s.equals("Entering the Nether"))
/*      */       {
/* 1321 */         s = ((WorldWithLayers)world).getLayersInfo().getFastTravel().getWorldType();
/* 1322 */         s = s.substring(0, 1).toUpperCase() + s.substring(1);
/* 1323 */         s = "Entering the " + s;
/*      */       }
/*      */     }
/*      */ 
/* 1327 */     this.J.b();
/* 1328 */     this.J.c();
/* 1329 */     this.i = null;
/* 1330 */     if (this.s != null)
/*      */     {
/* 1332 */       this.s.a(s);
/* 1333 */       this.s.d("");
/*      */     }
/* 1335 */     this.B.a(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1336 */     if (this.f != null)
/*      */     {
/* 1338 */       this.f.a(this.s);
/*      */     }
/* 1340 */     this.f = world;
/* 1341 */     if (world != null)
/*      */     {
/* 1343 */       if (this.c != null)
/*      */       {
/* 1345 */         this.c.a(world);
/*      */       }
/* 1347 */       if (!l())
/*      */       {
/* 1349 */         if (entityplayer == null)
/*      */         {
/* 1351 */           this.h = ((qs)world.a(qs.class));
/*      */         }
/*      */       }
/* 1354 */       else if (this.h != null)
/*      */       {
/* 1356 */         this.h.u();
/* 1357 */         if (world != null)
/*      */         {
/* 1359 */           world.a(this.h);
/*      */         }
/*      */       }
/* 1362 */       if (!world.I)
/*      */       {
/* 1364 */         d(s);
/*      */       }
/* 1366 */       if (this.h == null)
/*      */       {
/* 1368 */         this.h = ((qs)this.c.b(world));
/* 1369 */         this.h.u();
/* 1370 */         this.c.a(this.h);
/*      */       }
/* 1372 */       this.h.a = new gh(this.z);
/* 1373 */       if (this.g != null)
/*      */       {
/* 1375 */         this.g.a(world);
/*      */       }
/* 1377 */       if (this.j != null)
/*      */       {
/* 1379 */         this.j.a(world);
/*      */       }
/* 1381 */       this.c.b(this.h);
/* 1382 */       if (entityplayer != null)
/*      */       {
/* 1384 */         world.j();
/*      */       }
/* 1386 */       world.prepareToSpawnPlayer(this.h);
/* 1387 */       world.a(this.h);
/* 1388 */       if (world.x)
/*      */       {
/* 1390 */         world.a(this.s);
/*      */       }
/* 1392 */       this.i = this.h;
/*      */     }
/*      */     else {
/* 1395 */       this.h = null;
/*      */     }
/* 1397 */     System.gc();
/* 1398 */     this.Q = 0L;
/*      */   }
/*      */ 
/*      */   private void b(String s, String s1)
/*      */   {
/* 1403 */     this.s.a("Converting World to " + this.aa.a());
/* 1404 */     this.s.d("This may take a while :)");
/* 1405 */     this.aa.a(s, this.s);
/* 1406 */     a(s, s1, new dx(0L, 0, true));
/*      */   }
/*      */ 
/*      */   private void d(String s)
/*      */   {
/* 1411 */     if (this.s != null)
/*      */     {
/* 1413 */       this.s.a(s);
/* 1414 */       this.s.d("Building terrain");
/*      */     }
/* 1416 */     char c = '';
/* 1417 */     if (this.c.e())
/*      */     {
/* 1419 */       c = '@';
/*      */     }
/* 1421 */     int i = 0;
/* 1422 */     int j = c * '\002' / 16 + 1;
/* 1423 */     j *= j;
/* 1424 */     bf ichunkprovider = this.f.w();
/* 1425 */     ps chunkcoordinates = this.f.u();
/* 1426 */     if (this.h != null)
/*      */     {
/* 1428 */       chunkcoordinates.a = ((int)this.h.o);
/* 1429 */       chunkcoordinates.c = ((int)this.h.q);
/*      */     }
/* 1431 */     if ((ichunkprovider instanceof fx))
/*      */     {
/* 1433 */       fx chunkproviderloadorgenerate = (fx)ichunkprovider;
/* 1434 */       chunkproviderloadorgenerate.d(chunkcoordinates.a >> 4, chunkcoordinates.c >> 4);
/*      */     }
/* 1436 */     for (int k = -c; k <= c; k += 16)
/*      */     {
/* 1438 */       for (int l = -c; l <= c; l += 16)
/*      */       {
/* 1440 */         if (this.s != null)
/*      */         {
/* 1442 */           this.s.a(i++ * 100 / j);
/*      */         }
/*      */ 
/* 1444 */         this.f.a(chunkcoordinates.a + k, 64, chunkcoordinates.c + l);
/* 1445 */         while ((!this.c.e()) && 
/* 1449 */           (this.f.D()));
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 1454 */     if (!this.c.e())
/*      */     {
/* 1456 */       if (this.s != null)
/*      */       {
/* 1458 */         this.s.d("Simulating world for a bit");
/*      */       }
/* 1460 */       char c1 = 'ߐ';
/* 1461 */       this.f.q();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void a(String s, File file)
/*      */   {
/* 1467 */     int i = s.indexOf("/");
/* 1468 */     String s1 = s.substring(0, i);
/* 1469 */     s = s.substring(i + 1);
/* 1470 */     if (s1.equalsIgnoreCase("sound"))
/*      */     {
/* 1472 */       this.B.a(s, file);
/*      */     }
/* 1474 */     else if (s1.equalsIgnoreCase("newsound"))
/*      */     {
/* 1476 */       this.B.a(s, file);
/*      */     }
/* 1478 */     else if (s1.equalsIgnoreCase("streaming"))
/*      */     {
/* 1480 */       this.B.b(s, file);
/*      */     }
/* 1482 */     else if (s1.equalsIgnoreCase("music"))
/*      */     {
/* 1484 */       this.B.c(s, file);
/*      */     }
/* 1486 */     else if (s1.equalsIgnoreCase("newmusic"))
/*      */     {
/* 1488 */       this.B.c(s, file);
/*      */     }
/*      */   }
/*      */ 
/*      */   public qp n()
/*      */   {
/* 1494 */     return this.T;
/*      */   }
/*      */ 
/*      */   public String o()
/*      */   {
/* 1499 */     return this.g.b();
/*      */   }
/*      */ 
/*      */   public String p()
/*      */   {
/* 1504 */     return this.g.c();
/*      */   }
/*      */ 
/*      */   public String q()
/*      */   {
/* 1509 */     return this.f.n();
/*      */   }
/*      */ 
/*      */   public String r()
/*      */   {
/* 1514 */     return "P: " + this.j.b() + ". T: " + this.f.m();
/*      */   }
/*      */ 
/*      */   public void a(boolean flag, int i)
/*      */   {
/* 1519 */     if ((!this.f.I) && (!this.f.y.f()))
/*      */     {
/* 1521 */       m();
/*      */     }
/* 1523 */     ps chunkcoordinates = null;
/* 1524 */     ps chunkcoordinates1 = null;
/* 1525 */     boolean flag1 = true;
/* 1526 */     if ((this.h != null) && (!flag))
/*      */     {
/* 1528 */       chunkcoordinates = this.h.aq();
/* 1529 */       if (chunkcoordinates != null)
/*      */       {
/* 1531 */         chunkcoordinates1 = sz.a(this.f, chunkcoordinates);
/* 1532 */         if (chunkcoordinates1 == null)
/*      */         {
/* 1534 */           this.h.b("tile.bed.notValid");
/*      */         }
/*      */       }
/*      */     }
/* 1538 */     if (chunkcoordinates1 == null)
/*      */     {
/* 1540 */       chunkcoordinates1 = this.f.u();
/* 1541 */       flag1 = false;
/*      */     }
/* 1543 */     bf ichunkprovider = this.f.w();
/* 1544 */     if ((ichunkprovider instanceof fx))
/*      */     {
/* 1546 */       fx chunkproviderloadorgenerate = (fx)ichunkprovider;
/* 1547 */       chunkproviderloadorgenerate.d(chunkcoordinates1.a >> 4, chunkcoordinates1.c >> 4);
/*      */     }
/* 1549 */     this.f.e();
/* 1550 */     this.f.v();
/* 1551 */     int j = 0;
/* 1552 */     if (this.h != null)
/*      */     {
/* 1554 */       j = this.h.f;
/* 1555 */       this.f.b(this.h);
/*      */     }
/* 1557 */     this.i = null;
/* 1558 */     this.h = ((qs)this.c.b(this.f));
/* 1559 */     this.h.aE = i;
/* 1560 */     this.i = this.h;
/* 1561 */     this.h.u();
/* 1562 */     if (flag1)
/*      */     {
/* 1564 */       this.h.a(chunkcoordinates);
/* 1565 */       this.h.c(chunkcoordinates1.a + 0.5F, chunkcoordinates1.b + 0.1F, chunkcoordinates1.c + 0.5F, 0.0F, 0.0F);
/*      */     }
/* 1567 */     this.c.a(this.h);
/* 1568 */     this.f.a(this.h);
/* 1569 */     this.h.a = new gh(this.z);
/*      */ 
/* 1571 */     this.f.changeEntityId(this.h, j);
/* 1572 */     this.h.s();
/* 1573 */     this.c.b(this.h);
/* 1574 */     d("Respawning");
/* 1575 */     if ((this.r instanceof qg))
/*      */     {
/* 1577 */       a(null);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static void a(String s, String s1)
/*      */   {
/* 1583 */     a(s, s1, null);
/*      */   }
/*      */ 
/*      */   public static void a(String s, String s1, String s2)
/*      */   {
/* 1588 */     boolean flag = false;
/* 1589 */     String s3 = s;
/* 1590 */     Frame frame = new Frame("Minecraft");
/* 1591 */     Canvas canvas = new Canvas();
/* 1592 */     frame.setLayout(new BorderLayout());
/* 1593 */     frame.add(canvas, "Center");
/* 1594 */     canvas.setPreferredSize(new Dimension(854, 480));
/* 1595 */     frame.pack();
/* 1596 */     frame.setLocationRelativeTo(null);
/* 1597 */     fs minecraftimpl = new fs(frame, canvas, null, 854, 480, flag, frame);
/* 1598 */     Thread thread = new Thread(minecraftimpl, "Minecraft main thread");
/* 1599 */     thread.setPriority(10);
/* 1600 */     minecraftimpl.l = "www.minecraft.net";
/* 1601 */     if ((s3 != null) && (s1 != null))
/*      */     {
/* 1603 */       minecraftimpl.k = new dq(s3, s1);
/*      */     }
/*      */     else {
/* 1606 */       minecraftimpl.k = new dq("Player" + System.currentTimeMillis() % 1000L, "");
/*      */     }
/* 1608 */     if (s2 != null)
/*      */     {
/* 1610 */       String[] as = s2.split(":");
/* 1611 */       minecraftimpl.a(as[0], Integer.parseInt(as[1]));
/*      */     }
/* 1613 */     frame.setVisible(true);
/* 1614 */     frame.addWindowListener(new fn(minecraftimpl, thread));
/* 1615 */     thread.start();
/*      */   }
/*      */ 
/*      */   public wt s()
/*      */   {
/* 1620 */     if ((this.h instanceof aan))
/*      */     {
/* 1622 */       return ((aan)this.h).ci;
/*      */     }
/*      */ 
/* 1625 */     return null;
/*      */   }
/*      */ 
/*      */   public static void main(String[] args)
/*      */   {
/* 1631 */     String s = null;
/* 1632 */     String s1 = null;
/* 1633 */     s = "Player" + System.currentTimeMillis() % 1000L;
/* 1634 */     if (args.length > 0)
/*      */     {
/* 1636 */       s = args[0];
/*      */     }
/* 1638 */     s1 = "-";
/* 1639 */     if (args.length > 1)
/*      */     {
/* 1641 */       s1 = args[1];
/*      */     }
/* 1643 */     a(s, s1);
/*      */   }
/*      */ 
/*      */   public static boolean t()
/*      */   {
/* 1648 */     return (a == null) || (!a.z.C);
/*      */   }
/*      */ 
/*      */   public static boolean u()
/*      */   {
/* 1653 */     return (a != null) && (a.z.j);
/*      */   }
/*      */ 
/*      */   public static boolean v()
/*      */   {
/* 1658 */     return (a != null) && (a.z.k);
/*      */   }
/*      */ 
/*      */   public static boolean w()
/*      */   {
/* 1663 */     return (a != null) && (a.z.E);
/*      */   }
/*      */ 
/*      */   public boolean b(String s)
/*      */   {
/* 1668 */     if (!s.startsWith("/"));
/* 1669 */     return false;
/*      */   }
/*      */ 
/*      */   private void C()
/*      */   {
/* 1674 */     if (this.y != null)
/*      */     {
/* 1676 */       int i = this.f.a(this.y.b, this.y.c, this.y.d);
/* 1677 */       if (i == lr.v.bA)
/*      */       {
/* 1679 */         i = lr.w.bA;
/*      */       }
/* 1681 */       if (i == lr.ak.bA)
/*      */       {
/* 1683 */         i = lr.al.bA;
/*      */       }
/* 1685 */       if (i == lr.A.bA)
/*      */       {
/* 1687 */         i = lr.u.bA;
/*      */       }
/* 1689 */       this.h.as.a(i, this.c instanceof yf);
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     net.minecraft.client.Minecraft
 * JD-Core Version:    0.6.2
 */