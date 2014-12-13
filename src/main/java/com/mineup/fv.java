/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ public class fv
/*     */ {
/*     */   private boolean skyBlock;
/* 534 */   private static final String[] O = { "options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny" };
/*     */ 
/* 537 */   private static final String[] P = { "options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard" };
/*     */ 
/* 540 */   private static final String[] Q = { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
/*     */ 
/* 543 */   private static final String[] R = { "performance.max", "performance.balanced", "performance.powersaver" };
/*     */   public float a;
/*     */   public float b;
/*     */   public float c;
/*     */   public boolean d;
/*     */   public int e;
/*     */   public boolean f;
/*     */   public boolean g;
/*     */   public boolean h;
/*     */   public int i;
/*     */   public boolean j;
/*     */   public boolean k;
/*     */   public String l;
/*     */   public ys m;
/*     */   public ys n;
/*     */   public ys o;
/*     */   public ys p;
/*     */   public ys q;
/*     */   public ys r;
/*     */   public ys s;
/*     */   public ys t;
/*     */   public ys u;
/*     */   public ys v;
/*     */   public ys w;
/*     */   public ys x;
/*     */   public ys y;
/*     */   public ys[] z;
/*     */   protected Minecraft A;
/*     */   private File S;
/*     */   public int B;
/*     */   public boolean C;
/*     */   public boolean D;
/*     */   public boolean E;
/*     */   public String F;
/*     */   public boolean G;
/*     */   public boolean H;
/*     */   public boolean I;
/*     */   public float J;
/*     */   public float K;
/*     */   public float L;
/*     */   public float M;
/*     */   public int N;
/*     */ 
/*     */   public boolean getSkyBlock()
/*     */   {
/*  18 */     return this.skyBlock;
/*     */   }
/*     */ 
/*     */   public fv(Minecraft minecraft, File file)
/*     */   {
/*  25 */     this.a = 1.0F;
/*  26 */     this.b = 1.0F;
/*  27 */     this.c = 0.5F;
/*  28 */     this.d = false;
/*  29 */     this.e = 0;
/*  30 */     this.f = true;
/*  31 */     this.g = false;
/*  32 */     this.h = false;
/*  33 */     this.i = 1;
/*  34 */     this.j = true;
/*  35 */     this.k = true;
/*  36 */     this.l = "Default";
/*  37 */     this.m = new ys("key.forward", 17);
/*  38 */     this.n = new ys("key.left", 30);
/*  39 */     this.o = new ys("key.back", 31);
/*  40 */     this.p = new ys("key.right", 32);
/*  41 */     this.q = new ys("key.jump", 57);
/*  42 */     this.r = new ys("key.inventory", 18);
/*  43 */     this.s = new ys("key.drop", 16);
/*  44 */     this.t = new ys("key.chat", 20);
/*  45 */     this.u = new ys("key.sneak", 42);
/*  46 */     this.v = new ys("key.attack", -100);
/*  47 */     this.w = new ys("key.use", -99);
/*  48 */     this.x = new ys("key.playerlist", 15);
/*  49 */     this.y = new ys("key.pickItem", -98);
/*  50 */     this.z = new ys[] { this.v, this.w, this.m, this.n, this.o, this.p, this.q, this.u, this.s, this.r, this.t, this.x, this.y };
/*     */ 
/*  54 */     this.B = 2;
/*  55 */     this.C = false;
/*  56 */     this.D = false;
/*  57 */     this.E = false;
/*  58 */     this.F = "";
/*  59 */     this.G = false;
/*  60 */     this.H = false;
/*  61 */     this.I = false;
/*  62 */     this.skyBlock = false;
/*  63 */     this.J = 1.0F;
/*  64 */     this.K = 1.0F;
/*  65 */     this.L = 0.0F;
/*  66 */     this.M = 0.0F;
/*  67 */     this.N = 0;
/*  68 */     this.A = minecraft;
/*  69 */     this.S = new File(file, "options.txt");
/*  70 */     a();
/*     */   }
/*     */ 
/*     */   public fv()
/*     */   {
/*  75 */     this.a = 1.0F;
/*  76 */     this.b = 1.0F;
/*  77 */     this.c = 0.5F;
/*  78 */     this.d = false;
/*  79 */     this.e = 0;
/*  80 */     this.f = true;
/*  81 */     this.g = false;
/*  82 */     this.h = false;
/*  83 */     this.i = 1;
/*  84 */     this.j = true;
/*  85 */     this.k = true;
/*  86 */     this.l = "Default";
/*  87 */     this.m = new ys("key.forward", 17);
/*  88 */     this.n = new ys("key.left", 30);
/*  89 */     this.o = new ys("key.back", 31);
/*  90 */     this.p = new ys("key.right", 32);
/*  91 */     this.q = new ys("key.jump", 57);
/*  92 */     this.r = new ys("key.inventory", 18);
/*  93 */     this.s = new ys("key.drop", 16);
/*  94 */     this.t = new ys("key.chat", 20);
/*  95 */     this.u = new ys("key.sneak", 42);
/*  96 */     this.v = new ys("key.attack", -100);
/*  97 */     this.w = new ys("key.use", -99);
/*  98 */     this.x = new ys("key.playerlist", 15);
/*  99 */     this.y = new ys("key.pickItem", -98);
/* 100 */     this.z = new ys[] { this.v, this.w, this.m, this.n, this.o, this.p, this.q, this.u, this.s, this.r, this.t, this.x, this.y };
/*     */ 
/* 104 */     this.B = 2;
/* 105 */     this.C = false;
/* 106 */     this.D = false;
/* 107 */     this.E = false;
/* 108 */     this.F = "";
/* 109 */     this.G = false;
/* 110 */     this.H = false;
/* 111 */     this.I = false;
/* 112 */     this.J = 1.0F;
/* 113 */     this.K = 1.0F;
/* 114 */     this.L = 0.0F;
/* 115 */     this.M = 0.0F;
/* 116 */     this.N = 0;
/*     */ 
/* 118 */     this.skyBlock = false;
/*     */   }
/*     */ 
/*     */   public String a(int i)
/*     */   {
/* 123 */     wv stringtranslate = wv.a();
/* 124 */     return stringtranslate.a(this.z[i].c);
/*     */   }
/*     */ 
/*     */   public String b(int i)
/*     */   {
/* 129 */     int j = this.z[i].d;
/* 130 */     if (j < 0)
/*     */     {
/* 132 */       return ca.a("key.mouseButton", new Object[] { Integer.valueOf(j + 101) });
/*     */     }
/*     */ 
/* 137 */     return Keyboard.getKeyName(j);
/*     */   }
/*     */ 
/*     */   public void a(int i, int j)
/*     */   {
/* 143 */     this.z[i].d = j;
/* 144 */     b();
/*     */   }
/*     */ 
/*     */   public void a(tq enumoptions, float f)
/*     */   {
/* 149 */     if (enumoptions == tq.a)
/*     */     {
/* 151 */       this.a = f;
/* 152 */       this.A.B.a();
/*     */     }
/* 154 */     if (enumoptions == tq.b)
/*     */     {
/* 156 */       this.b = f;
/* 157 */       this.A.B.a();
/*     */     }
/* 159 */     if (enumoptions == tq.d)
/*     */     {
/* 161 */       this.c = f;
/*     */     }
/* 163 */     if (enumoptions == tq.e)
/*     */     {
/* 165 */       this.L = f;
/*     */     }
/* 167 */     if (enumoptions == tq.f)
/*     */     {
/* 169 */       this.M = f;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(tq enumoptions, int i)
/*     */   {
/* 175 */     if (enumoptions == tq.c)
/*     */     {
/* 177 */       this.d = (!this.d);
/*     */     }
/* 179 */     if (enumoptions == tq.g)
/*     */     {
/* 181 */       this.e = (this.e + i & 0x3);
/*     */     }
/* 183 */     if (enumoptions == tq.o)
/*     */     {
/* 185 */       this.N = (this.N + i & 0x3);
/*     */     }
/* 187 */     if (enumoptions == tq.h)
/*     */     {
/* 189 */       this.f = (!this.f);
/*     */     }
/* 191 */     if (enumoptions == tq.j)
/*     */     {
/* 193 */       this.h = (!this.h);
/* 194 */       this.A.g.a();
/*     */     }
/* 196 */     if (enumoptions == tq.i)
/*     */     {
/* 198 */       this.g = (!this.g);
/* 199 */       this.A.p.b();
/*     */     }
/* 201 */     if (enumoptions == tq.k)
/*     */     {
/* 203 */       this.i = ((this.i + i + 3) % 3);
/*     */     }
/* 205 */     if (enumoptions == tq.l)
/*     */     {
/* 207 */       this.B = (this.B + i & 0x3);
/*     */     }
/* 209 */     if (enumoptions == tq.m)
/*     */     {
/* 211 */       this.j = (!this.j);
/* 212 */       this.A.g.a();
/*     */     }
/* 214 */     if (enumoptions == tq.n)
/*     */     {
/* 216 */       this.k = (!this.k);
/* 217 */       this.A.g.a();
/*     */     }
/* 219 */     b();
/*     */   }
/*     */ 
/*     */   public float a(tq enumoptions)
/*     */   {
/* 224 */     if (enumoptions == tq.e)
/*     */     {
/* 226 */       return this.L;
/*     */     }
/* 228 */     if (enumoptions == tq.f)
/*     */     {
/* 230 */       return this.M;
/*     */     }
/* 232 */     if (enumoptions == tq.a)
/*     */     {
/* 234 */       return this.a;
/*     */     }
/* 236 */     if (enumoptions == tq.b)
/*     */     {
/* 238 */       return this.b;
/*     */     }
/* 240 */     if (enumoptions == tq.d)
/*     */     {
/* 242 */       return this.c;
/*     */     }
/*     */ 
/* 245 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   public boolean b(tq enumoptions)
/*     */   {
/* 251 */     switch (sc.a[enumoptions.ordinal()])
/*     */     {
/*     */     case 1:
/* 254 */       return this.d;
/*     */     case 2:
/* 257 */       return this.f;
/*     */     case 3:
/* 260 */       return this.g;
/*     */     case 4:
/* 263 */       return this.h;
/*     */     case 5:
/* 266 */       return this.k;
/*     */     }
/* 268 */     return false;
/*     */   }
/*     */ 
/*     */   public String c(tq enumoptions)
/*     */   {
/* 273 */     wv stringtranslate = wv.a();
/* 274 */     String s = stringtranslate.a(enumoptions.d()) + ": ";
/* 275 */     if (enumoptions.a())
/*     */     {
/* 277 */       float f = a(enumoptions);
/* 278 */       if (enumoptions == tq.d)
/*     */       {
/* 280 */         if (f == 0.0F)
/*     */         {
/* 282 */           return s + stringtranslate.a("options.sensitivity.min");
/*     */         }
/* 284 */         if (f == 1.0F)
/*     */         {
/* 286 */           return s + stringtranslate.a("options.sensitivity.max");
/*     */         }
/*     */ 
/* 289 */         return s + (int)(f * 200.0F) + "%";
/*     */       }
/*     */ 
/* 292 */       if (enumoptions == tq.e)
/*     */       {
/* 294 */         if (f == 0.0F)
/*     */         {
/* 296 */           return s + stringtranslate.a("options.fov.min");
/*     */         }
/* 298 */         if (f == 1.0F)
/*     */         {
/* 300 */           return s + stringtranslate.a("options.fov.max");
/*     */         }
/*     */ 
/* 303 */         return s + (int)(70.0F + f * 40.0F);
/*     */       }
/*     */ 
/* 306 */       if (enumoptions == tq.f)
/*     */       {
/* 308 */         if (f == 0.0F)
/*     */         {
/* 310 */           return s + stringtranslate.a("options.gamma.min");
/*     */         }
/* 312 */         if (f == 1.0F)
/*     */         {
/* 314 */           return s + stringtranslate.a("options.gamma.max");
/*     */         }
/*     */ 
/* 317 */         return s + "+" + (int)(f * 100.0F) + "%";
/*     */       }
/*     */ 
/* 320 */       if (f == 0.0F)
/*     */       {
/* 322 */         return s + stringtranslate.a("options.off");
/*     */       }
/*     */ 
/* 325 */       return s + (int)(f * 100.0F) + "%";
/*     */     }
/*     */ 
/* 328 */     if (enumoptions.b())
/*     */     {
/* 330 */       boolean flag = b(enumoptions);
/* 331 */       if (flag)
/*     */       {
/* 333 */         return s + stringtranslate.a("options.on");
/*     */       }
/*     */ 
/* 336 */       return s + stringtranslate.a("options.off");
/*     */     }
/*     */ 
/* 339 */     if (enumoptions == tq.g)
/*     */     {
/* 341 */       return s + stringtranslate.a(O[this.e]);
/*     */     }
/* 343 */     if (enumoptions == tq.l)
/*     */     {
/* 345 */       return s + stringtranslate.a(P[this.B]);
/*     */     }
/* 347 */     if (enumoptions == tq.o)
/*     */     {
/* 349 */       return s + stringtranslate.a(Q[this.N]);
/*     */     }
/* 351 */     if (enumoptions == tq.k)
/*     */     {
/* 353 */       return s + ca.a(R[this.i]);
/*     */     }
/* 355 */     if (enumoptions == tq.m)
/*     */     {
/* 357 */       if (this.j)
/*     */       {
/* 359 */         return s + stringtranslate.a("options.graphics.fancy");
/*     */       }
/*     */ 
/* 362 */       return s + stringtranslate.a("options.graphics.fast");
/*     */     }
/*     */ 
/* 366 */     return s;
/*     */   }
/*     */ 
/*     */   public void a()
/*     */   {
/*     */     try
/*     */     {
/* 374 */       if (!this.S.exists())
/*     */       {
/* 376 */         return;
/*     */       }
/* 378 */       BufferedReader bufferedreader = new BufferedReader(new FileReader(this.S));
/* 379 */       for (String s = ""; (s = bufferedreader.readLine()) != null; )
/*     */       {
/*     */         try
/*     */         {
/* 383 */           String[] as = s.split(":");
/* 384 */           if (as[0].equals("music"))
/*     */           {
/* 386 */             this.a = a(as[1]);
/*     */           }
/* 388 */           if (as[0].equals("sound"))
/*     */           {
/* 390 */             this.b = a(as[1]);
/*     */           }
/* 392 */           if (as[0].equals("mouseSensitivity"))
/*     */           {
/* 394 */             this.c = a(as[1]);
/*     */           }
/* 396 */           if (as[0].equals("fov"))
/*     */           {
/* 398 */             this.L = a(as[1]);
/*     */           }
/* 400 */           if (as[0].equals("gamma"))
/*     */           {
/* 402 */             this.M = a(as[1]);
/*     */           }
/* 404 */           if (as[0].equals("invertYMouse"))
/*     */           {
/* 406 */             this.d = as[1].equals("true");
/*     */           }
/* 408 */           if (as[0].equals("viewDistance"))
/*     */           {
/* 410 */             this.e = Integer.parseInt(as[1]);
/*     */           }
/* 412 */           if (as[0].equals("guiScale"))
/*     */           {
/* 414 */             this.N = Integer.parseInt(as[1]);
/*     */           }
/* 416 */           if (as[0].equals("bobView"))
/*     */           {
/* 418 */             this.f = as[1].equals("true");
/*     */           }
/* 420 */           if (as[0].equals("anaglyph3d"))
/*     */           {
/* 422 */             this.g = as[1].equals("true");
/*     */           }
/* 424 */           if (as[0].equals("advancedOpengl"))
/*     */           {
/* 426 */             this.h = as[1].equals("true");
/*     */           }
/* 428 */           if (as[0].equals("fpsLimit"))
/*     */           {
/* 430 */             this.i = Integer.parseInt(as[1]);
/*     */           }
/* 432 */           if (as[0].equals("difficulty"))
/*     */           {
/* 434 */             this.B = Integer.parseInt(as[1]);
/*     */           }
/* 436 */           if (as[0].equals("fancyGraphics"))
/*     */           {
/* 438 */             this.j = as[1].equals("true");
/*     */           }
/* 440 */           if (as[0].equals("skyBlockLayer"))
/*     */           {
/* 442 */             this.skyBlock = as[1].equals("true");
/*     */           }
/* 444 */           if (as[0].equals("ao"))
/*     */           {
/* 446 */             this.k = as[1].equals("true");
/*     */           }
/* 448 */           if (as[0].equals("skin"))
/*     */           {
/* 450 */             this.l = as[1];
/*     */           }
/* 452 */           if ((as[0].equals("lastServer")) && (as.length >= 2))
/*     */           {
/* 454 */             this.F = as[1];
/*     */           }
/* 456 */           int i = 0;
/* 457 */           while (i < this.z.length)
/*     */           {
/* 459 */             if (as[0].equals("key_" + this.z[i].c))
/*     */             {
/* 461 */               this.z[i].d = Integer.parseInt(as[1]);
/*     */             }
/* 463 */             i++;
/*     */           }
/*     */         }
/*     */         catch (Exception exception1)
/*     */         {
/* 468 */           System.out.println("Skipping bad option: " + s);
/*     */         }
/*     */       }
/*     */ 
/* 472 */       ys.b();
/* 473 */       bufferedreader.close();
/*     */     }
/*     */     catch (Exception exception)
/*     */     {
/* 477 */       System.out.println("Failed to load options");
/* 478 */       exception.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   private float a(String s)
/*     */   {
/* 484 */     if (s.equals("true"))
/*     */     {
/* 486 */       return 1.0F;
/*     */     }
/* 488 */     if (s.equals("false"))
/*     */     {
/* 490 */       return 0.0F;
/*     */     }
/*     */ 
/* 493 */     return Float.parseFloat(s);
/*     */   }
/*     */ 
/*     */   public void b()
/*     */   {
/*     */     try
/*     */     {
/* 501 */       PrintWriter printwriter = new PrintWriter(new FileWriter(this.S));
/* 502 */       printwriter.println("music:" + this.a);
/* 503 */       printwriter.println("sound:" + this.b);
/* 504 */       printwriter.println("invertYMouse:" + this.d);
/* 505 */       printwriter.println("mouseSensitivity:" + this.c);
/* 506 */       printwriter.println("fov:" + this.L);
/* 507 */       printwriter.println("gamma:" + this.M);
/* 508 */       printwriter.println("viewDistance:" + this.e);
/* 509 */       printwriter.println("guiScale:" + this.N);
/* 510 */       printwriter.println("bobView:" + this.f);
/* 511 */       printwriter.println("anaglyph3d:" + this.g);
/* 512 */       printwriter.println("advancedOpengl:" + this.h);
/* 513 */       printwriter.println("fpsLimit:" + this.i);
/* 514 */       printwriter.println("difficulty:" + this.B);
/* 515 */       printwriter.println("fancyGraphics:" + this.j);
/* 516 */       printwriter.println("ao:" + this.k);
/* 517 */       printwriter.println("skin:" + this.l);
/* 518 */       printwriter.println("lastServer:" + this.F);
/* 519 */       printwriter.println("skyBlockLayer:" + this.skyBlock);
/* 520 */       for (int i = 0; i < this.z.length; i++)
/*     */       {
/* 522 */         printwriter.println("key_" + this.z[i].c + ":" + this.z[i].d);
/*     */       }
/*     */ 
/* 525 */       printwriter.close();
/*     */     }
/*     */     catch (Exception exception)
/*     */     {
/* 529 */       System.out.println("Failed to save options");
/* 530 */       exception.printStackTrace();
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     fv
 * JD-Core Version:    0.6.2
 */