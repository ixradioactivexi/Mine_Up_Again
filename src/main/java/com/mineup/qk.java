/*     */ import java.lang.reflect.Constructor;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ public final class qk
/*     */ {
/* 343 */   private static Set b = new HashSet();
/*     */ 
/* 348 */   protected static final Class[] a = { bh.class, abq.class, se.class };
/*     */ 
/*     */   protected static mw a(rv world, int i, int j)
/*     */   {
/*  27 */     int k = i + world.w.nextInt(16);
/*  28 */     world.getClass();
/*  29 */     int l = world.w.nextInt(128);
/*  30 */     int i1 = j + world.w.nextInt(16);
/*  31 */     return new mw(k, l, i1);
/*     */   }
/*     */ 
/*     */   public static final int performSpawning(SpawnContext context, boolean var1) {
/*  35 */     rv var0 = context.getWorldObj();
/*  36 */     rv parent = var0;
/*  37 */     if (var0.parentWorld != null)
/*  38 */       parent = var0.parentWorld;
/*  39 */     if ((!var1) && (context.getPeacefulcounter() == 0)) {
/*  40 */       return 0;
/*     */     }
/*  42 */     b.clear();
/*     */ 
/*  46 */     List chunks = context.getPositionsToUpdate();
/*  47 */     if ((chunks != null) && (chunks.size() > 0))
/*  48 */       for (int i = 0; i < context.chunksInTick; i++)
/*  49 */         b.add(chunks.get(var0.w.nextInt(chunks.size())));
/*  50 */     int var3 = 0;
/*  51 */     ps var33 = var0.u();
/*  52 */     vw[] var34 = vw.values();
/*  53 */     int var6 = var34.length;
/*     */ 
/*  55 */     for (int var35 = 0; var35 < var6; var35++) {
/*  56 */       vw var36 = var34[var35];
/*  57 */       if (((!var36.d()) || (context.getPeacefulcounter() > 0)) && ((var36.d()) || (var1)) && (var0.b(var36.a()) <= var36.b() * context.getSquare() / 256)) {
/*  58 */         if (var36.d()) context.peacefulcounter -= 1;
/*  59 */         Iterator var37 = b.iterator();
/*     */ 
/*  61 */         label738: label744: while (var37.hasNext()) {
/*  62 */           oh var10 = (oh)var37.next();
/*  63 */           vh var11 = var0.a().a(var10);
/*  64 */           List var12 = var11.a(var36);
/*  65 */           if ((var12 != null) && (!var12.isEmpty())) {
/*  66 */             as var13 = (as)lx.a(var0.w, var12);
/*  67 */             mw var14 = a(var0, var10.a * 16, var10.b * 16);
/*  68 */             int var15 = var14.a;
/*  69 */             int var16 = var14.b;
/*  70 */             int var17 = var14.c;
/*  71 */             if ((!var0.h(var15, var16, var17)) && (var0.f(var15, var16, var17) == var36.c())) {
/*  72 */               int var18 = 0;
/*     */ 
/*  74 */               for (int var19 = 0; ; var19++) { if (var19 >= 3) break label744;
/*  75 */                 int var20 = var15;
/*  76 */                 int var21 = var16;
/*  77 */                 int var22 = var17;
/*  78 */                 byte var23 = 6;
/*     */ 
/*  80 */                 for (int var24 = 0; ; var24++) { if (var24 >= 4) break label738;
/*  81 */                   var20 += var0.w.nextInt(var23) - var0.w.nextInt(var23);
/*  82 */                   var21 += var0.w.nextInt(1) - var0.w.nextInt(1);
/*  83 */                   var22 += var0.w.nextInt(var23) - var0.w.nextInt(var23);
/*  84 */                   if (a(var36, var0, var20, var21, var22)) {
/*  85 */                     float var25 = var20 + 0.5F;
/*  86 */                     float var26 = var21;
/*  87 */                     if (var0.parentWorld != null)
/*  88 */                       var26 += var0.shiftY;
/*  89 */                     float var27 = var22 + 0.5F;
/*  90 */                     if (parent.a(var25, var26, var27, 24.0D) == null) {
/*  91 */                       float var28 = var25 - var33.a;
/*  92 */                       float var29 = var26 - var33.b;
/*  93 */                       float var30 = var27 - var33.c;
/*  94 */                       float var31 = var28 * var28 + var29 * var29 + var30 * var30;
/*  95 */                       if (var31 >= 576.0F) {
/*     */                         wd var38;
/*     */                         try {
/*  98 */                           var38 = (wd)var13.a.getConstructor(new Class[] { rv.class }).newInstance(new Object[] { parent });
/*     */                         } catch (Exception var32) {
/* 100 */                           var32.printStackTrace();
/* 101 */                           return var3;
/*     */                         }
/*     */ 
/* 104 */                         var38.c(var25, var26, var27, var0.w.nextFloat() * 360.0F, 0.0F);
/* 105 */                         if (var38.c()) {
/* 106 */                           var18++;
/* 107 */                           parent.a(var38);
/* 108 */                           a(var38, parent, var25, var26, var27);
/* 109 */                           if (var18 >= var38.S())
/*     */                           {
/*     */                             break;
/*     */                           }
/*     */                         }
/* 114 */                         var3 += var18;
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 126 */     return var3;
/*     */   }
/*     */ 
/*     */   private static boolean a(vw enumcreaturetype, rv world, int i, int j, int k)
/*     */   {
/* 132 */     if (enumcreaturetype.c() == wa.g)
/*     */     {
/* 134 */       return (world.f(i, j, k).d()) && (!world.h(i, j + 1, k));
/*     */     }
/*     */ 
/* 137 */     return (world.h(i, j - 1, k)) && (!world.h(i, j, k)) && (!world.f(i, j, k).d()) && (!world.h(i, j + 1, k));
/*     */   }
/*     */ 
/*     */   private static void a(wd entityliving, rv world, float f, float f1, float f2)
/*     */   {
/* 143 */     if (((entityliving instanceof bh)) && (world.w.nextInt(100) == 0))
/*     */     {
/* 145 */       se entityskeleton = new se(world);
/* 146 */       entityskeleton.c(f, f1, f2, entityliving.u, 0.0F);
/* 147 */       world.a(entityskeleton);
/* 148 */       entityskeleton.g(entityliving);
/*     */     }
/* 150 */     else if ((entityliving instanceof bx))
/*     */     {
/* 152 */       ((bx)entityliving).b(bx.a(world.w));
/*     */     }
/*     */   }
/*     */ 
/*     */   public static boolean a(rv world, List list)
/*     */   {
/* 161 */     boolean flag = false;
/* 162 */     si pathfinder = new si(world);
/* 163 */     Iterator iterator = list.iterator();
/*     */ 
/* 170 */     while (iterator.hasNext())
/*     */     {
/* 174 */       sz entityplayer = (sz)iterator.next();
/* 175 */       Class[] aclass = a;
/* 176 */       if ((aclass != null) && (aclass.length != 0)) {
/* 177 */         boolean flag1 = false;
/* 178 */         int i = 0;
/*     */ 
/* 190 */         while ((i < 20) && (!flag1))
/*     */         {
/* 194 */           int j = et.b(entityplayer.o) + world.w.nextInt(32) - world.w.nextInt(32);
/* 195 */           int k = et.b(entityplayer.q) + world.w.nextInt(32) - world.w.nextInt(32);
/* 196 */           int l = et.b(entityplayer.p) + world.w.nextInt(16) - world.w.nextInt(16);
/* 197 */           if (l < 1)
/*     */           {
/* 199 */             l = 1;
/*     */           }
/*     */           else {
/* 202 */             world.getClass();
/* 203 */             if (l > 128)
/*     */             {
/* 205 */               world.getClass();
/* 206 */               l = 128;
/*     */             }
/*     */           }
/* 209 */           int i1 = world.w.nextInt(aclass.length);
/* 210 */           for (int j1 = l; (j1 > 2) && (!world.h(j, j1 - 1, k)); j1--);
/* 213 */           while ((!a(vw.a, world, j, j1, k)) && (j1 < l + 16))
/*     */           {
/* 217 */             world.getClass();
/* 218 */             if (j1 >= 128)
/*     */             {
/*     */               break;
/*     */             }
/* 222 */             j1++;
/*     */           }
/* 224 */           if (j1 < l + 16)
/*     */           {
/* 226 */             world.getClass();
/* 227 */             if (j1 < 128);
/*     */           }
/*     */           else
/*     */           {
/* 232 */             j1 = l;
/* 233 */             break label673;
/* 235 */           }float f = j + 0.5F;
/* 236 */           float f1 = j1;
/* 237 */           float f2 = k + 0.5F;
/*     */           wd entityliving;
/*     */           try { entityliving = (wd)aclass[i1].getConstructor(new Class[] { rv.class }).newInstance(new Object[] { world }); }
/*     */           catch (Exception exception)
/*     */           {
/* 249 */             exception.printStackTrace();
/* 250 */             return flag;
/*     */           }
/* 252 */           entityliving.c(f, f1, f2, world.w.nextFloat() * 360.0F, 0.0F);
/* 253 */           if (entityliving.c())
/*     */           {
/* 255 */             qu pathentity = pathfinder.a(entityliving, entityplayer, 32.0F);
/* 256 */             if ((pathentity != null) && (pathentity.a > 1))
/*     */             {
/* 258 */               d pathpoint = pathentity.c();
/* 259 */               if ((Math.abs(pathpoint.a - entityplayer.o) < 1.5D) && (Math.abs(pathpoint.c - entityplayer.q) < 1.5D) && (Math.abs(pathpoint.b - entityplayer.p) < 1.5D))
/*     */               {
/* 261 */                 ps chunkcoordinates = ly.f(world, et.b(entityplayer.o), et.b(entityplayer.p), et.b(entityplayer.q), 1);
/* 262 */                 if (chunkcoordinates == null)
/*     */                 {
/* 264 */                   chunkcoordinates = new ps(j, j1 + 1, k);
/*     */                 }
/* 266 */                 entityliving.c(chunkcoordinates.a + 0.5F, chunkcoordinates.b, chunkcoordinates.c + 0.5F, 0.0F, 0.0F);
/* 267 */                 world.a(entityliving);
/* 268 */                 a(entityliving, world, chunkcoordinates.a + 0.5F, chunkcoordinates.b, chunkcoordinates.c + 0.5F);
/* 269 */                 entityplayer.a(true, false, false);
/* 270 */                 entityliving.aw();
/* 271 */                 flag = true;
/* 272 */                 flag1 = true;
/*     */               }
/*     */             }
/*     */           }
/*     */ 
/* 277 */           label673: i++;
/*     */         }
/*     */       }
/*     */     }
/* 281 */     return flag;
/*     */   }
/*     */ 
/*     */   public static void a(rv world, vh biomegenbase, int i, int j, int k, int l, Random random)
/*     */   {
/* 286 */     List list = biomegenbase.a(vw.b);
/* 287 */     if (list.isEmpty())
/*     */     {
/* 289 */       return;
/*     */     }
/* 291 */     while (random.nextFloat() < biomegenbase.d())
/*     */     {
/* 293 */       as spawnlistentry = (as)lx.a(world.w, list);
/* 294 */       int i1 = spawnlistentry.b + random.nextInt(1 + spawnlistentry.c - spawnlistentry.b);
/* 295 */       int j1 = i + random.nextInt(k);
/* 296 */       int k1 = j + random.nextInt(l);
/* 297 */       int l1 = j1;
/* 298 */       int i2 = k1;
/* 299 */       int j2 = 0;
/* 300 */       while (j2 < i1)
/*     */       {
/* 302 */         boolean flag = false;
/* 303 */         for (int k2 = 0; (!flag) && (k2 < 4); k2++)
/*     */         {
/* 305 */           int l2 = world.f(j1, k1);
/* 306 */           if (a(vw.b, world, j1, l2, k1)) {
/* 308 */             float f = j1 + 0.5F;
/* 309 */             float f1 = l2;
/* 310 */             float f2 = k1 + 0.5F;
/*     */             wd entityliving;
/*     */             try { entityliving = (wd)spawnlistentry.a.getConstructor(new Class[] { rv.class }).newInstance(new Object[] { world }); }
/*     */             catch (Exception exception)
/*     */             {
/* 322 */               exception.printStackTrace();
/* 323 */               continue;
/*     */             }
/* 325 */             entityliving.c(f, f1, f2, random.nextFloat() * 360.0F, 0.0F);
/* 326 */             world.a(entityliving);
/* 327 */             a(entityliving, world, f, f1, f2);
/* 328 */             flag = true;
/*     */           }
/* 330 */           j1 += random.nextInt(5) - random.nextInt(5);
/* 331 */           for (k1 += random.nextInt(5) - random.nextInt(5); (j1 < i) || (j1 >= i + k) || (k1 < j) || (k1 >= j + k); k1 = i2 + random.nextInt(5) - random.nextInt(5))
/*     */           {
/* 333 */             j1 = l1 + random.nextInt(5) - random.nextInt(5);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 338 */         j2++;
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     qk
 * JD-Core Version:    0.6.2
 */