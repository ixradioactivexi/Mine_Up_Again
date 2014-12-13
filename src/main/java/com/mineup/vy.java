/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ 
/*     */ public class vy
/*     */ {
/*  17 */   private long age = 0L;
/*     */   public static boolean a;
/*     */   public byte[] b;
/*     */   public int[] c;
/*     */   public boolean[] d;
/*     */   public boolean e;
/*     */   public rv f;
/*     */   public my g;
/*     */   public my h;
/*     */   public my i;
/*     */   public byte[] j;
/*     */   public int k;
/*     */   public final int l;
/*     */   public final int m;
/*     */   public Map n;
/*     */   public List[] o;
/*     */   public boolean p;
/*     */   public boolean q;
/*     */   public boolean r;
/*     */   public boolean s;
/*     */   public long t;
/*     */   boolean u;
/*     */ 
/*     */   public void setChunkAge(long x)
/*     */   {
/*  20 */     this.age = x;
/*     */   }
/*     */ 
/*     */   public long getChunkAge() {
/*  24 */     return this.age;
/*     */   }
/*     */ 
/*     */   public vy(rv world, int i, int j)
/*     */   {
/*  29 */     this.age = world.x().f();
/*  30 */     this.c = new int[256];
/*  31 */     this.d = new boolean[256];
/*  32 */     this.n = new HashMap();
/*  33 */     this.p = false;
/*  34 */     this.q = false;
/*  35 */     this.s = false;
/*  36 */     this.t = 0L;
/*  37 */     this.u = false;
/*  38 */     this.o = new List[8];
/*  39 */     this.f = world;
/*  40 */     this.l = i;
/*  41 */     this.m = j;
/*  42 */     this.j = new byte[256];
/*  43 */     for (int k = 0; k < this.o.length; k++)
/*     */     {
/*  45 */       this.o[k] = new ArrayList();
/*     */     }
/*     */ 
/*  48 */     Arrays.fill(this.c, -999);
/*     */   }
/*     */ 
/*     */   public vy(rv world, byte[] abyte0, int i, int j)
/*     */   {
/*  53 */     this(world, i, j);
/*  54 */     this.b = abyte0;
/*  55 */     this.g = new my(abyte0.length, 7);
/*  56 */     this.h = new my(abyte0.length, 7);
/*  57 */     this.i = new my(abyte0.length, 7);
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j)
/*     */   {
/*  62 */     return (i == this.l) && (j == this.m);
/*     */   }
/*     */ 
/*     */   public int b(int i, int j)
/*     */   {
/*  67 */     return this.j[(j << 4 | i)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public void a()
/*     */   {
/*     */   }
/*     */ 
/*     */   public void b()
/*     */   {
/*  76 */     int i = 127;
/*  77 */     for (int j = 0; j < 16; j++)
/*     */     {
/*  79 */       for (int k = 0; k < 16; k++)
/*     */       {
/*  81 */         int l = 127;
/*  82 */         for (int i1 = j << 11 | k << 7; (l > 0) && (lr.q[(this.b[(i1 + l - 1)] & 0xFF)] == 0); l--);
/*  83 */         this.j[(k << 4 | j)] = ((byte)l);
/*  84 */         if (l < i)
/*     */         {
/*  86 */           i = l;
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  92 */     this.k = i;
/*  93 */     this.q = true;
/*     */   }
/*     */ 
/*     */   public void c()
/*     */   {
/*  98 */     int i = this.f.getWorldHeight() - 1;
/*  99 */     for (int j = 0; j < 16; j++)
/*     */     {
/* 101 */       for (int l = 0; l < 16; l++)
/*     */       {
/* 103 */         int j1 = this.f.getWorldHeight() - 1;
/*     */ 
/* 105 */         for (int k1 = j << 11 | l << 7; (j1 > 0) && (lr.q[(this.b[(k1 + j1 - 1)] & 0xFF)] == 0); j1--);
/* 106 */         this.j[(l << 4 | j)] = ((byte)j1);
/* 107 */         if (j1 < i)
/*     */         {
/* 109 */           i = j1;
/*     */         }
/* 111 */         if (!this.f.y.e)
/*     */         {
/* 115 */           int l1 = 15;
/* 116 */           int i2 = this.f.getWorldHeight() - 1;
/*     */           do
/*     */           {
/* 119 */             l1 -= lr.q[(this.b[(k1 + i2)] & 0xFF)];
/* 120 */             if (l1 > 0)
/*     */             {
/* 122 */               this.h.a(j, i2, l, l1);
/*     */             }
/* 124 */             i2--; } while ((i2 > 0) && (l1 > 0));
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 129 */     this.k = i;
/* 130 */     for (int k = 0; k < 16; k++)
/*     */     {
/* 132 */       for (int i1 = 0; i1 < 16; i1++)
/*     */       {
/* 134 */         d(k, i1);
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 139 */     this.q = true;
/*     */   }
/*     */ 
/*     */   public void d()
/*     */   {
/*     */   }
/*     */ 
/*     */   private void d(int i, int j)
/*     */   {
/* 148 */     this.d[(i + j * 16)] = true;
/*     */   }
/*     */ 
/*     */   private void k()
/*     */   {
/* 153 */     if (this.f.e(this.l * 16 + 8, 64, this.m * 16 + 8, 16))
/*     */     {
/* 155 */       for (int i = 0; i < 16; i++)
/*     */       {
/* 157 */         for (int j = 0; j < 16; j++)
/*     */         {
/* 159 */           if (this.d[(i + j * 16)] != 0)
/*     */           {
/* 163 */             this.d[(i + j * 16)] = false;
/* 164 */             int k = b(i, j);
/* 165 */             int l = this.l * 16 + i;
/* 166 */             int i1 = this.m * 16 + j;
/* 167 */             int j1 = this.f.d(l - 1, i1);
/* 168 */             int k1 = this.f.d(l + 1, i1);
/* 169 */             int l1 = this.f.d(l, i1 - 1);
/* 170 */             int i2 = this.f.d(l, i1 + 1);
/* 171 */             if (k1 < j1)
/*     */             {
/* 173 */               j1 = k1;
/*     */             }
/* 175 */             if (l1 < j1)
/*     */             {
/* 177 */               j1 = l1;
/*     */             }
/* 179 */             if (i2 < j1)
/*     */             {
/* 181 */               j1 = i2;
/*     */             }
/* 183 */             this.u = true;
/* 184 */             f(l, i1, j1);
/* 185 */             this.u = true;
/* 186 */             f(l - 1, i1, k);
/* 187 */             f(l + 1, i1, k);
/* 188 */             f(l, i1 - 1, k);
/* 189 */             f(l, i1 + 1, k);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private void f(int i, int j, int k)
/*     */   {
/* 199 */     int l = this.f.d(i, j);
/* 200 */     if (l > k)
/*     */     {
/* 202 */       d(i, j, k, l + 1);
/*     */     }
/* 204 */     else if (l < k)
/*     */     {
/* 206 */       d(i, j, l, k + 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void d(int i, int j, int k, int l)
/*     */   {
/* 212 */     if (l > k)
/*     */     {
/* 214 */       if (this.f.e(i, 64, j, 16))
/*     */       {
/* 216 */         for (int i1 = k; i1 < l; i1++)
/*     */         {
/* 218 */           this.f.c(rf.a, i, i1, j);
/*     */         }
/*     */ 
/* 221 */         this.q = true;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private void g(int i, int j, int k)
/*     */   {
/* 228 */     int l = this.j[(k << 4 | i)] & 0xFF;
/* 229 */     int i1 = l;
/* 230 */     if (j > l)
/*     */     {
/* 232 */       i1 = j;
/*     */     }
/* 234 */     for (int j1 = i << 11 | k << 7; (i1 > 0) && (lr.q[(this.b[(j1 + i1 - 1)] & 0xFF)] == 0); i1--);
/* 235 */     if (i1 == l)
/*     */     {
/* 237 */       return;
/*     */     }
/* 239 */     this.f.i(i, k, i1, l);
/* 240 */     this.j[(k << 4 | i)] = ((byte)i1);
/* 241 */     if (i1 < this.k)
/*     */     {
/* 243 */       this.k = i1;
/*     */     }
/*     */     else {
/* 246 */       int k1 = 127;
/* 247 */       for (int i2 = 0; i2 < 16; i2++)
/*     */       {
/* 249 */         for (int k2 = 0; k2 < 16; k2++)
/*     */         {
/* 251 */           if ((this.j[(k2 << 4 | i2)] & 0xFF) < k1)
/*     */           {
/* 253 */             k1 = this.j[(k2 << 4 | i2)] & 0xFF;
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 259 */       this.k = k1;
/*     */     }
/* 261 */     int l1 = this.l * 16 + i;
/* 262 */     int j2 = this.m * 16 + k;
/* 263 */     if (i1 < l)
/*     */     {
/* 265 */       for (int l2 = i1; l2 < l; l2++)
/*     */       {
/* 267 */         this.h.a(i, l2, k, 15);
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/* 272 */       for (int i3 = l; i3 < i1; i3++)
/*     */       {
/* 274 */         this.h.a(i, i3, k, 0);
/*     */       }
/*     */     }
/*     */ 
/* 278 */     int j3 = 15;
/* 279 */     int k3 = i1;
/* 280 */     while ((i1 > 0) && (j3 > 0))
/*     */     {
/* 282 */       i1--;
/* 283 */       int l3 = lr.q[a(i, i1, k)];
/* 284 */       if (l3 == 0)
/*     */       {
/* 286 */         l3 = 1;
/*     */       }
/* 288 */       j3 -= l3;
/* 289 */       if (j3 < 0)
/*     */       {
/* 291 */         j3 = 0;
/*     */       }
/* 293 */       this.h.a(i, i1, k, j3);
/*     */     }
/* 295 */     byte byte0 = this.j[(k << 4 | i)];
/* 296 */     int i4 = l;
/* 297 */     int j4 = byte0;
/* 298 */     if (j4 < i4)
/*     */     {
/* 300 */       int k4 = i4;
/* 301 */       i4 = j4;
/* 302 */       j4 = k4;
/*     */     }
/* 304 */     d(l1 - 1, j2, i4, j4);
/* 305 */     d(l1 + 1, j2, i4, j4);
/* 306 */     d(l1, j2 - 1, i4, j4);
/* 307 */     d(l1, j2 + 1, i4, j4);
/* 308 */     d(l1, j2, i4, j4);
/* 309 */     this.q = true;
/*     */   }
/*     */ 
/*     */   public int a(int i, int j, int k)
/*     */   {
/* 314 */     return this.b[(i << 11 | k << 7 | j)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j, int k, int l, int i1)
/*     */   {
/* 319 */     byte byte0 = (byte)l;
/* 320 */     int j1 = k << 4 | i;
/* 321 */     if (j >= this.c[j1] - 1)
/*     */     {
/* 323 */       this.c[j1] = -999;
/*     */     }
/* 325 */     int k1 = this.j[(k << 4 | i)] & 0xFF;
/* 326 */     int l1 = this.b[(i << 11 | k << 7 | j)] & 0xFF;
/* 327 */     if ((l1 == l) && (this.g.a(i, j, k) == i1))
/*     */     {
/* 329 */       return false;
/*     */     }
/* 331 */     int i2 = this.l * 16 + i;
/* 332 */     int j2 = this.m * 16 + k;
/*     */ 
/* 334 */     int x = MineUpForgeAdapter.get().handleBlockOverride(lr.m[l1], this.f.parentWorld != null ? this.f.parentWorld : this.f, i2, j + this.f.shiftY, j2, l);
/* 335 */     if (x != 0) {
/* 336 */       return x == 1;
/*     */     }
/* 338 */     this.b[(i << 11 | k << 7 | j)] = ((byte)(byte0 & 0xFF));
/* 339 */     if (l1 != 0) {
/* 340 */       if (!this.f.I)
/* 341 */         this.f.onBlockRemoval(l1, i2, j, j2);
/* 342 */       e(i, j, k);
/*     */     }
/* 344 */     this.g.a(i, j, k, i1);
/* 345 */     if (!this.f.y.e)
/*     */     {
/* 347 */       if (lr.q[(byte0 & 0xFF)] != 0)
/*     */       {
/* 349 */         if (j >= k1)
/*     */         {
/* 351 */           g(i, j + 1, k);
/*     */         }
/*     */       }
/* 354 */       else if (j == k1 - 1)
/*     */       {
/* 356 */         g(i, j, k);
/*     */       }
/* 358 */       this.f.a(rf.a, i2, j, j2, i2, j, j2);
/*     */     }
/* 360 */     this.f.a(rf.b, i2, j, j2, i2, j, j2);
/* 361 */     d(i, k);
/* 362 */     this.g.a(i, j, k, i1);
/* 363 */     if (l != 0)
/*     */     {
/* 365 */       if (!this.f.I)
/*     */       {
/* 367 */         this.f.onBlockAdded(l, i2, j, j2);
/*     */       }
/* 369 */       if ((lr.m[l] instanceof zt))
/*     */       {
/* 371 */         ij tileentity = d(i, j, k);
/* 372 */         if (tileentity == null)
/*     */         {
/* 374 */           tileentity = MineUpForgeAdapter.get().blockContainerGetBlockEntity((zt)lr.m[l], i1);
/* 375 */           this.f.a(i2, j, j2, tileentity);
/*     */         }
/* 377 */         if (tileentity != null)
/*     */         {
/* 379 */           tileentity.b();
/*     */         }
/*     */       }
/*     */     }
/* 383 */     this.q = true;
/* 384 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean a(int i, int j, int k, int l)
/*     */   {
/* 389 */     byte byte0 = (byte)l;
/* 390 */     int i1 = k << 4 | i;
/* 391 */     if (j >= this.c[i1] - 1)
/*     */     {
/* 393 */       this.c[i1] = -999;
/*     */     }
/* 395 */     int j1 = this.j[i1] & 0xFF;
/* 396 */     int k1 = this.b[(i << 11 | k << 7 | j)] & 0xFF;
/* 397 */     if (k1 == l)
/*     */     {
/* 399 */       return false;
/*     */     }
/* 401 */     int l1 = this.l * 16 + i;
/* 402 */     int i2 = this.m * 16 + k;
/*     */ 
/* 404 */     int x = MineUpForgeAdapter.get().handleBlockOverride(lr.m[k1], this.f.parentWorld != null ? this.f.parentWorld : this.f, l1, j + this.f.shiftY, i2, l);
/* 405 */     if (x != 0) {
/* 406 */       return x == 1;
/*     */     }
/* 408 */     this.b[(i << 11 | k << 7 | j)] = ((byte)(byte0 & 0xFF));
/* 409 */     if (k1 != 0) {
/* 410 */       if (!this.f.I)
/* 411 */         this.f.onBlockRemoval(k1, l1, j, i2);
/* 412 */       e(i, j, k);
/*     */     }
/* 414 */     this.g.a(i, j, k, 0);
/* 415 */     if (lr.q[(byte0 & 0xFF)] != 0)
/*     */     {
/* 417 */       if (j >= j1)
/*     */       {
/* 419 */         g(i, j + 1, k);
/*     */       }
/*     */     }
/* 422 */     else if (j == j1 - 1)
/*     */     {
/* 424 */       g(i, j, k);
/*     */     }
/* 426 */     this.f.a(rf.a, l1, j, i2, l1, j, i2);
/* 427 */     this.f.a(rf.b, l1, j, i2, l1, j, i2);
/* 428 */     d(i, k);
/* 429 */     if (l != 0)
/*     */     {
/* 431 */       if (!this.f.I)
/*     */       {
/* 433 */         this.f.onBlockAdded(l, l1, j, i2);
/*     */       }
/* 435 */       if ((l > 0) && ((lr.m[l] instanceof zt)))
/*     */       {
/* 437 */         ij tileentity = d(i, j, k);
/* 438 */         if (tileentity == null)
/*     */         {
/* 440 */           tileentity = MineUpForgeAdapter.get().blockContainerGetBlockEntity((zt)lr.m[l], 0);
/* 441 */           this.f.a(l1, j, i2, tileentity);
/*     */         }
/* 443 */         if (tileentity != null)
/*     */         {
/* 445 */           tileentity.b();
/*     */         }
/*     */       }
/*     */     }
/* 449 */     this.q = true;
/* 450 */     return true;
/*     */   }
/*     */ 
/*     */   public int b(int i, int j, int k)
/*     */   {
/* 455 */     return this.g.a(i, j, k);
/*     */   }
/*     */ 
/*     */   public void b(int i, int j, int k, int l)
/*     */   {
/* 460 */     this.q = true;
/* 461 */     this.g.a(i, j, k, l);
/* 462 */     int i1 = a(i, j, k);
/* 463 */     if ((i1 > 0) && ((lr.m[i1] instanceof zt)))
/*     */     {
/* 465 */       ij tileentity = d(i, j, k);
/* 466 */       if (tileentity != null)
/*     */       {
/* 468 */         tileentity.b();
/* 469 */         tileentity.n = l;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public int a(rf enumskyblock, int i, int j, int k)
/*     */   {
/* 476 */     if (enumskyblock == rf.a)
/*     */     {
/* 478 */       return this.h.a(i, j, k);
/*     */     }
/* 480 */     if (enumskyblock == rf.b)
/*     */     {
/* 482 */       return this.i.a(i, j, k);
/*     */     }
/*     */ 
/* 485 */     return 0;
/*     */   }
/*     */ 
/*     */   public void a(rf enumskyblock, int i, int j, int k, int l)
/*     */   {
/* 491 */     this.q = true;
/* 492 */     if (enumskyblock == rf.a)
/*     */     {
/* 494 */       this.h.a(i, j, k, l);
/*     */     }
/* 496 */     else if (enumskyblock == rf.b)
/*     */     {
/* 498 */       this.i.a(i, j, k, l);
/*     */     }
/*     */     else;
/*     */   }
/*     */ 
/*     */   public int c(int i, int j, int k, int l)
/*     */   {
/* 507 */     int i1 = this.h.a(i, j, k);
/* 508 */     if (i1 > 0)
/*     */     {
/* 510 */       a = true;
/*     */     }
/* 512 */     i1 -= l;
/* 513 */     int j1 = this.i.a(i, j, k);
/* 514 */     if (j1 > i1)
/*     */     {
/* 516 */       i1 = j1;
/*     */     }
/* 518 */     return i1;
/*     */   }
/*     */ 
/*     */   public void a(kj entity)
/*     */   {
/* 523 */     this.s = true;
/* 524 */     int i = et.b(entity.o / 16.0D);
/* 525 */     int j = et.b(entity.q / 16.0D);
/* 526 */     if ((i != this.l) || (j != this.m))
/*     */     {
/* 528 */       System.out.println("Wrong location! " + entity);
/* 529 */       Thread.dumpStack();
/*     */     }
/* 531 */     int k = et.b(entity.p / 16.0D);
/* 532 */     if ((entity.chunkLayer != null) && (this.f.parentWorld != null))
/*     */     {
/* 534 */       k = (int)(k - this.f.shiftY / 16.0D);
/* 535 */     }if (k < 0)
/*     */     {
/* 537 */       k = 0;
/*     */     }
/* 539 */     if (k >= this.o.length)
/*     */     {
/* 541 */       k = this.o.length - 1;
/*     */     }
/* 543 */     entity.ag = true;
/* 544 */     entity.ah = this.l;
/* 545 */     entity.ai = k;
/* 546 */     entity.aj = this.m;
/* 547 */     this.o[k].add(entity);
/*     */   }
/*     */ 
/*     */   public void b(kj entity)
/*     */   {
/* 552 */     a(entity, entity.ai);
/*     */   }
/*     */ 
/*     */   public void a(kj entity, int i)
/*     */   {
/* 557 */     if (i < 0)
/*     */     {
/* 559 */       i = 0;
/*     */     }
/* 561 */     if (i >= this.o.length)
/*     */     {
/* 563 */       i = this.o.length - 1;
/*     */     }
/* 565 */     this.o[i].remove(entity);
/*     */   }
/*     */ 
/*     */   public boolean c(int i, int j, int k)
/*     */   {
/* 570 */     return j >= (this.j[(k << 4 | i)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public ij d(int i, int j, int k)
/*     */   {
/* 575 */     mw chunkposition = new mw(i, j, k);
/* 576 */     ij tileentity = (ij)this.n.get(chunkposition);
/* 577 */     if ((tileentity != null) && (tileentity.k()))
/*     */     {
/* 579 */       this.n.remove(chunkposition);
/* 580 */       tileentity = null;
/*     */     }
/* 582 */     if (tileentity == null)
/*     */     {
/* 584 */       int l = a(i, j, k);
/* 585 */       if (lr.p[l] == 0)
/*     */       {
/* 587 */         return null;
/*     */       }
/* 589 */       if (tileentity == null)
/*     */       {
/* 591 */         tileentity = MineUpForgeAdapter.get().blockContainerGetBlockEntity((zt)lr.m[l], b(i, j, k));
/* 592 */         this.f.a(this.l * 16 + i, j, this.m * 16 + k, tileentity);
/*     */       }
/* 594 */       tileentity = (ij)this.n.get(chunkposition);
/*     */     }
/* 596 */     return tileentity;
/*     */   }
/*     */ 
/*     */   public void cleanChunkBlockTileEntity(int i, int j, int k)
/*     */   {
/* 602 */     mw chunkposition = new mw(i, j, k);
/* 603 */     if (this.e)
/*     */     {
/* 605 */       ij tileentity = (ij)this.n.get(chunkposition);
/* 606 */       if ((tileentity != null) && (tileentity.k()))
/* 607 */         this.n.remove(chunkposition);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(ij tileentity)
/*     */   {
/* 613 */     int i = tileentity.j - this.l * 16;
/* 614 */     int j = tileentity.k;
/* 615 */     int k = tileentity.l - this.m * 16;
/* 616 */     a(i, j, k, tileentity);
/* 617 */     if (this.e)
/*     */     {
/* 619 */       this.f.addTileEntity(tileentity);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, int k, ij tileentity)
/*     */   {
/* 625 */     mw chunkposition = new mw(i, j, k);
/* 626 */     tileentity.i = (this.f.parentWorld == null ? this.f : this.f.parentWorld);
/* 627 */     tileentity.j = (this.l * 16 + i);
/* 628 */     tileentity.k = (j + this.f.shiftY);
/* 629 */     tileentity.l = (this.m * 16 + k);
/* 630 */     if ((a(i, j, k) == 0) || (!(lr.m[a(i, j, k)] instanceof zt)))
/*     */     {
/* 632 */       System.out.println("Attempted to place a tile entity where there was no entity tile!");
/* 633 */       return;
/*     */     }
/*     */ 
/* 636 */     ij old = (ij)this.n.get(chunkposition);
/* 637 */     if (old != null) old.h();
/* 638 */     tileentity.m();
/* 639 */     this.n.put(chunkposition, tileentity);
/*     */   }
/*     */ 
/*     */   public void e(int i, int j, int k)
/*     */   {
/* 646 */     mw chunkposition = new mw(i, j, k);
/* 647 */     if (this.e)
/*     */     {
/* 649 */       ij tileentity = (ij)this.n.remove(chunkposition);
/* 650 */       if (tileentity != null)
/*     */       {
/* 652 */         tileentity.h();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void e()
/*     */   {
/* 659 */     this.e = true;
/* 660 */     this.f.a(this.n.values());
/* 661 */     for (int i = 0; i < this.o.length; i++)
/*     */     {
/*     */       Iterator i$;
/* 663 */       if (this.f.parentWorld != null)
/*     */       {
/* 665 */         for (i$ = this.o[i].iterator(); i$.hasNext(); ) { Object o = i$.next();
/*     */ 
/* 667 */           kj ent = (kj)o;
/* 668 */           ent.d(ent.o, ent.p + this.f.shiftY, ent.q);
/*     */         }
/*     */       }
/* 671 */       this.f.a(this.o[i]);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void f()
/*     */   {
/* 678 */     this.e = false;
/*     */     ij tileentity;
/* 680 */     for (Iterator iterator = this.n.values().iterator(); iterator.hasNext(); this.f.a(tileentity))
/*     */     {
/* 682 */       tileentity = (ij)iterator.next();
/*     */     }
/*     */ 
/* 685 */     for (int i = 0; i < this.o.length; i++)
/*     */     {
/* 687 */       this.f.b(this.o[i]);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void g()
/*     */   {
/* 694 */     this.q = true;
/*     */   }
/*     */ 
/*     */   public void a(kj entity, rp axisalignedbb, List list)
/*     */   {
/* 699 */     int i = et.b((axisalignedbb.b - 2.0D) / 16.0D);
/* 700 */     int j = et.b((axisalignedbb.e + 2.0D) / 16.0D);
/* 701 */     if (this.f.parentWorld != null)
/*     */     {
/* 703 */       i -= this.f.shiftY / 16;
/* 704 */       j -= this.f.shiftY / 16;
/*     */     }
/* 706 */     if (i < 0)
/*     */     {
/* 708 */       i = 0;
/*     */     }
/* 710 */     if (j >= this.o.length)
/*     */     {
/* 712 */       j = this.o.length - 1;
/*     */     }
/* 714 */     for (int k = i; k <= j; k++)
/*     */     {
/* 716 */       List list1 = this.o[k];
/* 717 */       for (int l = 0; l < list1.size(); l++)
/*     */       {
/* 719 */         kj entity1 = (kj)list1.get(l);
/* 720 */         if ((entity1 != entity) && (entity1.y.a(axisalignedbb)))
/*     */         {
/* 722 */           list.add(entity1);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(Class class1, rp axisalignedbb, List list)
/*     */   {
/* 732 */     int i = et.b((axisalignedbb.b - 2.0D) / 16.0D);
/* 733 */     int j = et.b((axisalignedbb.e + 2.0D) / 16.0D);
/* 734 */     if (this.f.parentWorld != null)
/*     */     {
/* 736 */       i -= this.f.shiftY / 16;
/* 737 */       j -= this.f.shiftY / 16;
/*     */     }
/* 739 */     if (i < 0)
/*     */     {
/* 741 */       i = 0;
/*     */     }
/* 743 */     if (j >= this.o.length)
/*     */     {
/* 745 */       j = this.o.length - 1;
/*     */     }
/* 747 */     for (int k = i; k <= j; k++)
/*     */     {
/* 749 */       List list1 = this.o[k];
/* 750 */       for (int l = 0; l < list1.size(); l++)
/*     */       {
/* 752 */         kj entity = (kj)list1.get(l);
/* 753 */         if ((class1.isAssignableFrom(entity.getClass())) && (entity.y.a(axisalignedbb)))
/*     */         {
/* 755 */           list.add(entity);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean a(boolean flag)
/*     */   {
/* 765 */     if (this.r)
/*     */     {
/* 767 */       return false;
/*     */     }
/* 769 */     if (flag)
/*     */     {
/* 771 */       if ((this.s) && (this.f.t() != this.t))
/*     */       {
/* 773 */         return true;
/*     */       }
/*     */     }
/* 776 */     else if ((this.s) && (this.f.t() >= this.t + 600L))
/*     */     {
/* 778 */       return true;
/*     */     }
/* 780 */     return this.q;
/*     */   }
/*     */ 
/*     */   public int a(byte[] abyte0, int i, int j, int k, int l, int i1, int j1, int k1)
/*     */   {
/* 787 */     Iterator iterator = this.n.values().iterator();
/* 788 */     while (iterator.hasNext()) {
/* 789 */       ij te = (ij)iterator.next();
/* 790 */       te.b();
/* 791 */       te.i();
/* 792 */       te.j();
/*     */     }
/*     */ 
/* 795 */     for (int l1 = i; l1 < l; l1++)
/*     */     {
/* 797 */       for (int l2 = k; l2 < j1; l2++)
/*     */       {
/* 799 */         int l3 = l1 << 11 | l2 << 7 | j;
/* 800 */         int l4 = i1 - j;
/* 801 */         System.arraycopy(abyte0, k1, this.b, l3, l4);
/* 802 */         k1 += l4;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 807 */     b();
/* 808 */     for (int i2 = i; i2 < l; i2++)
/*     */     {
/* 810 */       for (int i3 = k; i3 < j1; i3++)
/*     */       {
/* 812 */         int i4 = (i2 << 11 | i3 << 7 | j) >> 1;
/* 813 */         int i5 = (i1 - j) / 2;
/* 814 */         System.arraycopy(abyte0, k1, this.g.a, i4, i5);
/* 815 */         k1 += i5;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 820 */     for (int j2 = i; j2 < l; j2++)
/*     */     {
/* 822 */       for (int j3 = k; j3 < j1; j3++)
/*     */       {
/* 824 */         int j4 = (j2 << 11 | j3 << 7 | j) >> 1;
/* 825 */         int j5 = (i1 - j) / 2;
/* 826 */         System.arraycopy(abyte0, k1, this.i.a, j4, j5);
/* 827 */         k1 += j5;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 832 */     for (int k2 = i; k2 < l; k2++)
/*     */     {
/* 834 */       for (int k3 = k; k3 < j1; k3++)
/*     */       {
/* 836 */         int k4 = (k2 << 11 | k3 << 7 | j) >> 1;
/* 837 */         int k5 = (i1 - j) / 2;
/* 838 */         System.arraycopy(abyte0, k1, this.h.a, k4, k5);
/* 839 */         k1 += k5;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 844 */     List invalidList = new ArrayList();
/* 845 */     iterator = this.n.values().iterator();
/* 846 */     while (iterator.hasNext()) {
/* 847 */       ij te = (ij)iterator.next();
/* 848 */       if (((te.j & 0xF) >= i) && ((te.j & 0xF) <= l) && (te.k >= j) && (te.k <= i1) && ((te.l & 0xF) >= k) && ((te.l & 0xF) <= j1) && (
/* 852 */         (te.j().bA != this.f.a(te.j, te.k, te.l)) || (te.i() != this.f.e(te.j, te.k, te.l))))
/*     */       {
/* 857 */         invalidList.add(te);
/*     */       }
/*     */     }
/* 860 */     for (ij te2 : invalidList)
/* 861 */       te2.h();
/* 862 */     return k1;
/*     */   }
/*     */ 
/*     */   public Random a(long l)
/*     */   {
/* 867 */     return new Random(this.f.s() + this.l * this.l * 4987142 + this.l * 5947611 + this.m * this.m * 4392871L + this.m * 389711 ^ l);
/*     */   }
/*     */ 
/*     */   public boolean h()
/*     */   {
/* 872 */     return false;
/*     */   }
/*     */ 
/*     */   public void i()
/*     */   {
/* 877 */     abv.a(this.b);
/*     */   }
/*     */ 
/*     */   public void a(bf ichunkprovider, bf ichunkprovider1, int i, int j)
/*     */   {
/* 882 */     if ((!this.p) && (ichunkprovider.a(i + 1, j + 1)) && (ichunkprovider.a(i, j + 1)) && (ichunkprovider.a(i + 1, j)))
/*     */     {
/* 884 */       ichunkprovider.a(ichunkprovider1, i, j);
/*     */     }
/* 886 */     if ((ichunkprovider.a(i - 1, j)) && (!ichunkprovider.b(i - 1, j).p) && (ichunkprovider.a(i - 1, j + 1)) && (ichunkprovider.a(i, j + 1)) && (ichunkprovider.a(i - 1, j + 1)))
/*     */     {
/* 888 */       ichunkprovider.a(ichunkprovider1, i - 1, j);
/*     */     }
/* 890 */     if ((ichunkprovider.a(i, j - 1)) && (!ichunkprovider.b(i, j - 1).p) && (ichunkprovider.a(i + 1, j - 1)) && (ichunkprovider.a(i + 1, j - 1)) && (ichunkprovider.a(i + 1, j)))
/*     */     {
/* 892 */       ichunkprovider.a(ichunkprovider1, i, j - 1);
/*     */     }
/* 894 */     if ((ichunkprovider.a(i - 1, j - 1)) && (!ichunkprovider.b(i - 1, j - 1).p) && (ichunkprovider.a(i, j - 1)) && (ichunkprovider.a(i - 1, j)))
/*     */     {
/* 896 */       ichunkprovider.a(ichunkprovider1, i - 1, j - 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public int c(int i, int j)
/*     */   {
/* 902 */     int k = i | j << 4;
/* 903 */     int l = this.c[k];
/* 904 */     if (l == -999)
/*     */     {
/* 906 */       int i1 = 127;
/* 907 */       for (l = -1; (i1 > 0) && (l == -1); )
/*     */       {
/* 909 */         int j1 = a(i, i1, j);
/* 910 */         wa material = j1 != 0 ? lr.m[j1].bN : wa.a;
/* 911 */         if ((!material.c()) && (!material.d()))
/*     */         {
/* 913 */           i1--;
/*     */         }
/*     */         else {
/* 916 */           l = i1 + 1;
/*     */         }
/*     */       }
/*     */ 
/* 920 */       this.c[k] = l;
/*     */     }
/* 922 */     return l;
/*     */   }
/*     */ 
/*     */   public void j()
/*     */   {
/* 927 */     k();
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     vy
 * JD-Core Version:    0.6.2
 */