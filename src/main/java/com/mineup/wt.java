/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintStream;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.Field;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Socket;
/*     */ import java.net.URL;
/*     */ import java.net.UnknownHostException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ 
/*     */ public class wt extends kx
/*     */ {
/*     */   private rv protoWorld;
/*     */   private boolean f;
/*     */   private iq g;
/*     */   public String a;
/*     */   private Minecraft h;
/*     */   private gx i;
/*     */   private boolean j;
/*     */   public td b;
/*     */   private Map k;
/*     */   public List c;
/*     */   public int d;
/*     */   Random e;
/*     */ 
/*     */   public wt(Minecraft minecraft, String s, int i)
/*     */     throws UnknownHostException, IOException
/*     */   {
/*  51 */     this.f = false;
/*  52 */     this.j = false;
/*  53 */     this.b = new td(null);
/*  54 */     this.k = new HashMap();
/*  55 */     this.c = new ArrayList();
/*  56 */     this.d = 20;
/*  57 */     this.e = new Random();
/*  58 */     this.h = minecraft;
/*  59 */     Socket socket = new Socket(InetAddress.getByName(s), i);
/*  60 */     this.g = new iq(socket, "Client", this);
/*     */   }
/*     */ 
/*     */   public void b()
/*     */   {
/*  65 */     if (!this.f)
/*     */     {
/*  67 */       this.g.b();
/*     */     }
/*  69 */     this.g.a();
/*     */   }
/*     */ 
/*     */   public void a(xh packet1login)
/*     */   {
/*  76 */     this.h.c = new np(this.h, this);
/*  77 */     this.h.J.a(fd.i, 1);
/*     */ 
/*  79 */     if (packet1login.layersInfo == null)
/*     */     {
/*  81 */       this.i = new gx(this, new dx(packet1login.c, packet1login.d, false), packet1login.e, packet1login.f);
/*  82 */       this.i.I = true;
/*  83 */       this.h.a(this.i);
/*  84 */       this.protoWorld = null;
/*     */     }
/*     */     else {
/*  87 */       this.protoWorld = new rv(new acv(), "MpServer", acz.a(packet1login.e), new dx(packet1login.c, packet1login.d, false, packet1login.layersInfo));
/*     */ 
/*  90 */       WorldWithLayersClient client1 = new WorldWithLayersClient(this, this.protoWorld, packet1login.e, packet1login.f);
/*  91 */       client1.I = true;
/*  92 */       for (rv layer : client1.layers)
/*  93 */         layer.I = true;
/*  94 */       this.i = new WorldWithLayersClientNet(client1);
/*  95 */       this.i.I = true;
/*  96 */       this.h.a(client1);
/*     */     }
/*  98 */     this.h.h.aE = packet1login.e;
/*  99 */     this.h.a(new dp(this));
/* 100 */     this.h.f.changeEntityId(this.h.h, packet1login.a);
/* 101 */     this.d = packet1login.h;
/* 102 */     ((np)this.h.c).a(packet1login.d == 1);
/*     */   }
/*     */ 
/*     */   public void a(hh packet21pickupspawn)
/*     */   {
/* 107 */     double d = packet21pickupspawn.b / 32.0D;
/* 108 */     double d1 = packet21pickupspawn.c / 32.0D;
/* 109 */     double d2 = packet21pickupspawn.d / 32.0D;
/* 110 */     ee entityitem = new ee(this.i, d, d1, d2, new ul(packet21pickupspawn.h, packet21pickupspawn.i, packet21pickupspawn.j));
/* 111 */     entityitem.r = (packet21pickupspawn.e / 128.0D);
/* 112 */     entityitem.s = (packet21pickupspawn.f / 128.0D);
/* 113 */     entityitem.t = (packet21pickupspawn.g / 128.0D);
/* 114 */     entityitem.ak = packet21pickupspawn.b;
/* 115 */     entityitem.al = packet21pickupspawn.c;
/* 116 */     entityitem.am = packet21pickupspawn.d;
/* 117 */     this.i.a(packet21pickupspawn.a, entityitem);
/*     */   }
/*     */ 
/*     */   public void a(kl packet23vehiclespawn)
/*     */   {
/* 122 */     double d = packet23vehiclespawn.b / 32.0D;
/* 123 */     double d1 = packet23vehiclespawn.c / 32.0D;
/* 124 */     double d2 = packet23vehiclespawn.d / 32.0D;
/* 125 */     kj obj = null;
/* 126 */     if (packet23vehiclespawn.h == 10)
/*     */     {
/* 128 */       obj = new ads(this.i, d, d1, d2, 0);
/*     */     }
/* 130 */     if (packet23vehiclespawn.h == 11)
/*     */     {
/* 132 */       obj = new ads(this.i, d, d1, d2, 1);
/*     */     }
/* 134 */     if (packet23vehiclespawn.h == 12)
/*     */     {
/* 136 */       obj = new ads(this.i, d, d1, d2, 2);
/*     */     }
/* 138 */     if (packet23vehiclespawn.h == 90)
/*     */     {
/* 140 */       obj = new wg(this.i, d, d1, d2);
/*     */     }
/* 142 */     if (packet23vehiclespawn.h == 60)
/*     */     {
/* 144 */       obj = new ki(this.i, d, d1, d2);
/*     */     }
/* 146 */     if (packet23vehiclespawn.h == 61)
/*     */     {
/* 148 */       obj = new pz(this.i, d, d1, d2);
/*     */     }
/* 150 */     if (packet23vehiclespawn.h == 63)
/*     */     {
/* 152 */       obj = new ba(this.i, d, d1, d2, packet23vehiclespawn.e / 8000.0D, packet23vehiclespawn.f / 8000.0D, packet23vehiclespawn.g / 8000.0D);
/* 153 */       packet23vehiclespawn.i = 0;
/*     */     }
/* 155 */     if (packet23vehiclespawn.h == 62)
/*     */     {
/* 157 */       obj = new mm(this.i, d, d1, d2);
/*     */     }
/* 159 */     if (packet23vehiclespawn.h == 1)
/*     */     {
/* 161 */       obj = new di(this.i, d, d1, d2);
/*     */     }
/* 163 */     if (packet23vehiclespawn.h == 50)
/*     */     {
/* 165 */       obj = new ze(this.i, d, d1, d2);
/*     */     }
/* 167 */     if (packet23vehiclespawn.h == 70)
/*     */     {
/* 169 */       obj = new va(this.i, d, d1, d2, lr.F.bA);
/*     */     }
/* 171 */     if (packet23vehiclespawn.h == 71)
/*     */     {
/* 173 */       obj = new va(this.i, d, d1, d2, lr.G.bA);
/*     */     }
/* 175 */     NetClientHandlerEntity netclienthandlerentity = MineUpModloaderMpAdapter.get().handleNetClientHandlerEntities(packet23vehiclespawn.h);
/* 176 */     if (netclienthandlerentity != null)
/*     */     {
/*     */       try
/*     */       {
/* 180 */         obj = (kj)netclienthandlerentity.entityClass.getConstructor(new Class[] { rv.class, Double.TYPE, Double.TYPE, Double.TYPE }).newInstance(new Object[] { this.i, Double.valueOf(d), Double.valueOf(d1), Double.valueOf(d2) });
/*     */ 
/* 185 */         if (netclienthandlerentity.entityHasOwner)
/*     */         {
/* 187 */           Field field = netclienthandlerentity.entityClass.getField("owner");
/* 188 */           if (kj.class.isAssignableFrom(field.getType()))
/*     */           {
/* 190 */             kj entity1 = a(packet23vehiclespawn.i);
/* 191 */             if (entity1 == null)
/*     */             {
/* 193 */               MineUpModloaderMpAdapter.get().Log("Received spawn packet for entity with owner, but owner was not found.");
/*     */             }
/* 195 */             else if (field.getType().isAssignableFrom(entity1.getClass()))
/*     */             {
/* 197 */               field.set(obj, entity1);
/*     */             }
/*     */             else {
/* 200 */               throw new Exception(String.format("Tried to assign an entity of type %s to entity owner, which is of type %s.", new Object[] { entity1.getClass(), field.getType() }));
/*     */             }
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/* 206 */             throw new Exception(String.format("Entity's owner field must be of type Entity, but it is of type %s.", new Object[] { field.getType() }));
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */       catch (Exception exception)
/*     */       {
/* 218 */         return;
/*     */       }
/*     */     }
/* 221 */     if (obj != null)
/*     */     {
/* 223 */       obj.ak = packet23vehiclespawn.b;
/* 224 */       obj.al = packet23vehiclespawn.c;
/* 225 */       obj.am = packet23vehiclespawn.d;
/* 226 */       obj.u = 0.0F;
/* 227 */       obj.v = 0.0F;
/* 228 */       obj.f = packet23vehiclespawn.a;
/* 229 */       this.i.a(packet23vehiclespawn.a, obj);
/* 230 */       if (packet23vehiclespawn.i > 0)
/*     */       {
/* 232 */         if (packet23vehiclespawn.h == 60)
/*     */         {
/* 234 */           kj entity = a(packet23vehiclespawn.i);
/* 235 */           if ((entity instanceof wd))
/*     */           {
/* 237 */             ((ki)obj).c = ((wd)entity);
/*     */           }
/*     */         }
/* 240 */         obj.a(packet23vehiclespawn.e / 8000.0D, packet23vehiclespawn.f / 8000.0D, packet23vehiclespawn.g / 8000.0D);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(is packet26entityexporb)
/*     */   {
/* 247 */     bg entityxporb = new bg(this.i, packet26entityexporb.b, packet26entityexporb.c, packet26entityexporb.d, packet26entityexporb.e);
/* 248 */     entityxporb.ak = packet26entityexporb.b;
/* 249 */     entityxporb.al = packet26entityexporb.c;
/* 250 */     entityxporb.am = packet26entityexporb.d;
/* 251 */     entityxporb.u = 0.0F;
/* 252 */     entityxporb.v = 0.0F;
/* 253 */     entityxporb.f = packet26entityexporb.a;
/* 254 */     this.i.a(packet26entityexporb.a, entityxporb);
/*     */   }
/*     */ 
/*     */   public void a(rs packet71weather)
/*     */   {
/* 259 */     double d = packet71weather.b / 32.0D;
/* 260 */     double d1 = packet71weather.c / 32.0D;
/* 261 */     double d2 = packet71weather.d / 32.0D;
/* 262 */     c entitylightningbolt = null;
/* 263 */     if (packet71weather.e == 1)
/*     */     {
/* 265 */       entitylightningbolt = new c(this.i, d, d1, d2);
/*     */     }
/* 267 */     if (entitylightningbolt != null)
/*     */     {
/* 269 */       entitylightningbolt.ak = packet71weather.b;
/* 270 */       entitylightningbolt.al = packet71weather.c;
/* 271 */       entitylightningbolt.am = packet71weather.d;
/* 272 */       entitylightningbolt.u = 0.0F;
/* 273 */       entitylightningbolt.v = 0.0F;
/* 274 */       entitylightningbolt.f = packet71weather.a;
/* 275 */       this.i.e(entitylightningbolt);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(ml packet25entitypainting)
/*     */   {
/* 281 */     jl entitypainting = new jl(this.i, packet25entitypainting.b, packet25entitypainting.c, packet25entitypainting.d, packet25entitypainting.e, packet25entitypainting.f);
/* 282 */     this.i.a(packet25entitypainting.a, entitypainting);
/*     */   }
/*     */ 
/*     */   public void a(sr packet28entityvelocity)
/*     */   {
/* 287 */     kj entity = a(packet28entityvelocity.a);
/* 288 */     if (entity == null)
/*     */     {
/* 290 */       return;
/*     */     }
/*     */ 
/* 293 */     entity.a(packet28entityvelocity.b / 8000.0D, packet28entityvelocity.c / 8000.0D, packet28entityvelocity.d / 8000.0D);
/*     */   }
/*     */ 
/*     */   public void a(lt packet40entitymetadata)
/*     */   {
/* 300 */     kj entity = a(packet40entitymetadata.a);
/* 301 */     if ((entity != null) && (packet40entitymetadata.b() != null))
/*     */     {
/* 303 */       entity.t().a(packet40entitymetadata.b());
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(gt packet20namedentityspawn)
/*     */   {
/* 309 */     double d = packet20namedentityspawn.c / 32.0D;
/* 310 */     double d1 = packet20namedentityspawn.d / 32.0D;
/* 311 */     double d2 = packet20namedentityspawn.e / 32.0D;
/* 312 */     float f = packet20namedentityspawn.f * 360 / 256.0F;
/* 313 */     float f1 = packet20namedentityspawn.g * 360 / 256.0F;
/* 314 */     nx entityotherplayermp = new nx(this.h.f, packet20namedentityspawn.b);
/* 315 */     entityotherplayermp.l = (entityotherplayermp.N = entityotherplayermp.ak = packet20namedentityspawn.c);
/* 316 */     entityotherplayermp.m = (entityotherplayermp.O = entityotherplayermp.al = packet20namedentityspawn.d);
/* 317 */     entityotherplayermp.n = (entityotherplayermp.P = entityotherplayermp.am = packet20namedentityspawn.e);
/* 318 */     int i = packet20namedentityspawn.h;
/* 319 */     if (i == 0)
/*     */     {
/* 321 */       entityotherplayermp.as.a[entityotherplayermp.as.c] = null;
/*     */     }
/*     */     else {
/* 324 */       entityotherplayermp.as.a[entityotherplayermp.as.c] = new ul(i, 1, 0);
/*     */     }
/* 326 */     entityotherplayermp.b(d, d1, d2, f, f1);
/* 327 */     this.i.a(packet20namedentityspawn.a, entityotherplayermp);
/*     */   }
/*     */ 
/*     */   public void a(jr packet34entityteleport)
/*     */   {
/* 332 */     kj entity = a(packet34entityteleport.a);
/* 333 */     if (entity == null)
/*     */     {
/* 335 */       return;
/*     */     }
/*     */ 
/* 338 */     entity.ak = packet34entityteleport.b;
/* 339 */     entity.al = packet34entityteleport.c;
/* 340 */     entity.am = packet34entityteleport.d;
/* 341 */     double d = entity.ak / 32.0D;
/* 342 */     double d1 = entity.al / 32.0D + 0.015625D;
/* 343 */     double d2 = entity.am / 32.0D;
/* 344 */     float f = packet34entityteleport.e * 360 / 256.0F;
/* 345 */     float f1 = packet34entityteleport.f * 360 / 256.0F;
/* 346 */     entity.a(d, d1, d2, f, f1, 3);
/*     */   }
/*     */ 
/*     */   public void a(abe packet30entity)
/*     */   {
/* 353 */     kj entity = a(packet30entity.a);
/* 354 */     if (entity == null)
/*     */     {
/* 356 */       return;
/*     */     }
/*     */ 
/* 359 */     entity.ak += packet30entity.b;
/* 360 */     entity.al += packet30entity.c;
/* 361 */     entity.am += packet30entity.d;
/* 362 */     double d = entity.ak / 32.0D;
/* 363 */     double d1 = entity.al / 32.0D;
/* 364 */     double d2 = entity.am / 32.0D;
/* 365 */     float f = packet30entity.g ? packet30entity.e * 360 / 256.0F : entity.u;
/* 366 */     float f1 = packet30entity.g ? packet30entity.f * 360 / 256.0F : entity.v;
/* 367 */     entity.a(d, d1, d2, f, f1, 3);
/*     */   }
/*     */ 
/*     */   public void a(zu packet29destroyentity)
/*     */   {
/* 374 */     this.i.b(packet29destroyentity.a);
/*     */   }
/*     */ 
/*     */   public void a(ep packet10flying)
/*     */   {
/* 379 */     qs entityplayersp = this.h.h;
/* 380 */     double d = entityplayersp.o;
/* 381 */     double d1 = entityplayersp.p;
/* 382 */     double d2 = entityplayersp.q;
/* 383 */     float f = entityplayersp.u;
/* 384 */     float f1 = entityplayersp.v;
/* 385 */     if (packet10flying.h)
/*     */     {
/* 387 */       d = packet10flying.a;
/* 388 */       d1 = packet10flying.b;
/* 389 */       d2 = packet10flying.c;
/*     */     }
/* 391 */     if (packet10flying.i)
/*     */     {
/* 393 */       f = packet10flying.e;
/* 394 */       f1 = packet10flying.f;
/*     */     }
/* 396 */     entityplayersp.Q = 0.0F;
/* 397 */     entityplayersp.r = (entityplayersp.s = entityplayersp.t = 0.0D);
/* 398 */     entityplayersp.b(d, d1, d2, f, f1);
/* 399 */     packet10flying.a = entityplayersp.o;
/* 400 */     packet10flying.b = entityplayersp.y.b;
/* 401 */     packet10flying.c = entityplayersp.q;
/* 402 */     packet10flying.d = entityplayersp.p;
/* 403 */     this.g.a(packet10flying);
/* 404 */     if (!this.j)
/*     */     {
/* 406 */       this.h.h.l = this.h.h.o;
/* 407 */       this.h.h.m = this.h.h.p;
/* 408 */       this.h.h.n = this.h.h.q;
/* 409 */       this.j = true;
/* 410 */       this.h.a(null);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(zx packet50prechunk)
/*     */   {
/* 416 */     this.i.a(packet50prechunk.a, packet50prechunk.b, packet50prechunk.c);
/*     */   }
/*     */ 
/*     */   public void a(acu packet52multiblockchange)
/*     */   {
/* 421 */     vy chunk = this.i.c(packet52multiblockchange.a, packet52multiblockchange.b);
/* 422 */     int i = chunk.l * 16;
/* 423 */     int j = chunk.m * 16;
/* 424 */     for (int k = 0; k < packet52multiblockchange.f; k++)
/*     */     {
/* 426 */       short word0 = packet52multiblockchange.c[k];
/* 427 */       int l = packet52multiblockchange.d[k] & 0xFF;
/* 428 */       byte byte0 = packet52multiblockchange.e[k];
/* 429 */       int i1 = word0 >> 12 & 0xF;
/* 430 */       int j1 = word0 >> 8 & 0xF;
/* 431 */       int k1 = word0 & 0xFF;
/* 432 */       chunk.a(i1, k1, j1, l, byte0);
/* 433 */       this.i.a(i1 + i, k1 + chunk.f.shiftY, j1 + j, i1 + i, k1 + chunk.f.shiftY, j1 + j);
/* 434 */       this.i.c(i1 + i, k1 + chunk.f.shiftY, j1 + j, i1 + i, k1 + chunk.f.shiftY, j1 + j);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(rk packet51mapchunk)
/*     */   {
/* 441 */     this.i.a(packet51mapchunk.a, packet51mapchunk.b, packet51mapchunk.c, packet51mapchunk.a + packet51mapchunk.d - 1, packet51mapchunk.b + packet51mapchunk.e - 1, packet51mapchunk.c + packet51mapchunk.f - 1);
/* 442 */     this.i.a(packet51mapchunk.a, packet51mapchunk.b, packet51mapchunk.c, packet51mapchunk.d, packet51mapchunk.e, packet51mapchunk.f, packet51mapchunk.g);
/*     */   }
/*     */ 
/*     */   public void a(lc packet53blockchange)
/*     */   {
/* 447 */     this.i.c(packet53blockchange.a, packet53blockchange.b, packet53blockchange.c, packet53blockchange.d, packet53blockchange.e);
/*     */   }
/*     */ 
/*     */   public void a(adw packet255kickdisconnect)
/*     */   {
/* 452 */     this.g.a("disconnect.kicked", new Object[0]);
/* 453 */     this.f = true;
/* 454 */     this.h.a(null);
/* 455 */     this.h.a(new cw("disconnect.disconnected", "disconnect.genericReason", new Object[] { packet255kickdisconnect.a }));
/*     */   }
/*     */ 
/*     */   public void a(String s, Object[] aobj)
/*     */   {
/* 462 */     if (this.f)
/*     */     {
/* 464 */       return;
/*     */     }
/*     */ 
/* 467 */     this.f = true;
/* 468 */     this.h.a(null);
/* 469 */     this.h.a(new cw("disconnect.lost", s, aobj));
/*     */   }
/*     */ 
/*     */   public void b(vl packet)
/*     */   {
/* 476 */     if (this.f)
/*     */     {
/* 478 */       return;
/*     */     }
/*     */ 
/* 481 */     this.g.a(packet);
/* 482 */     this.g.c();
/*     */   }
/*     */ 
/*     */   public void c(vl packet)
/*     */   {
/* 489 */     if (this.f)
/*     */     {
/* 491 */       return;
/*     */     }
/*     */ 
/* 494 */     this.g.a(packet);
/*     */   }
/*     */ 
/*     */   public void a(qv packet22collect)
/*     */   {
/* 501 */     kj entity = a(packet22collect.a);
/* 502 */     Object obj = (wd)a(packet22collect.b);
/* 503 */     if (obj == null)
/*     */     {
/* 505 */       obj = this.h.h;
/*     */     }
/* 507 */     if (entity != null)
/*     */     {
/* 509 */       this.i.a(entity, "random.pop", 0.2F, ((this.e.nextFloat() - this.e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 510 */       this.h.j.a(new rn(this.h.f, entity, (kj)obj, -0.5F));
/* 511 */       this.i.b(packet22collect.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(yc packet3chat)
/*     */   {
/* 517 */     this.h.v.a(packet3chat.a);
/*     */   }
/*     */ 
/*     */   public void a(hs packet18animation)
/*     */   {
/* 522 */     kj entity = a(packet18animation.a);
/* 523 */     if (entity == null)
/*     */     {
/* 525 */       return;
/*     */     }
/* 527 */     if (packet18animation.b == 1)
/*     */     {
/* 529 */       sz entityplayer = (sz)entity;
/* 530 */       entityplayer.al();
/*     */     }
/* 532 */     else if (packet18animation.b == 2)
/*     */     {
/* 534 */       entity.k();
/*     */     }
/* 536 */     else if (packet18animation.b == 3)
/*     */     {
/* 538 */       sz entityplayer1 = (sz)entity;
/* 539 */       entityplayer1.a(false, false, false);
/*     */     }
/* 541 */     else if (packet18animation.b == 4)
/*     */     {
/* 543 */       sz entityplayer2 = (sz)entity;
/* 544 */       entityplayer2.s();
/*     */     }
/* 546 */     else if (packet18animation.b == 5)
/*     */     {
/* 548 */       if (!(entity instanceof nx));
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(ve packet17sleep)
/*     */   {
/* 554 */     kj entity = a(packet17sleep.a);
/* 555 */     if (entity == null)
/*     */     {
/* 557 */       return;
/*     */     }
/* 559 */     if (packet17sleep.e == 0)
/*     */     {
/* 561 */       sz entityplayer = (sz)entity;
/* 562 */       entityplayer.d(packet17sleep.b, packet17sleep.c, packet17sleep.d);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(gy packet2handshake)
/*     */   {
/* 568 */     if (packet2handshake.a.equals("-"))
/*     */     {
/* 570 */       c(new xh(this.h.k.b, 17));
/*     */     }
/* 572 */     else if ((packet2handshake.a == null) || (packet2handshake.a.trim().length() == 0))
/*     */     {
/* 574 */       this.g.a("disconnect.genericReason", new Object[] { "The server responded with an invalid server key" });
/*     */     }
/*     */     else
/*     */     {
/*     */       try
/*     */       {
/* 581 */         URL url = new URL("http://session.minecraft.net/game/joinserver.jsp?user=" + this.h.k.b + "&sessionId=" + this.h.k.c + "&serverId=" + packet2handshake.a);
/* 582 */         BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(url.openStream()));
/* 583 */         String s = bufferedreader.readLine();
/* 584 */         bufferedreader.close();
/* 585 */         if (s.equalsIgnoreCase("ok"))
/*     */         {
/* 587 */           c(new xh(this.h.k.b, 17));
/*     */         }
/*     */         else {
/* 590 */           this.g.a("disconnect.loginFailedInfo", new Object[] { s });
/*     */         }
/*     */ 
/*     */       }
/*     */       catch (Exception exception)
/*     */       {
/* 597 */         exception.printStackTrace();
/* 598 */         this.g.a("disconnect.genericReason", new Object[] { "Internal client error: " + exception.toString() });
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void c()
/*     */   {
/* 607 */     this.f = true;
/* 608 */     this.g.a();
/* 609 */     this.g.a("disconnect.closed", new Object[0]);
/*     */   }
/*     */ 
/*     */   public void a(ut packet24mobspawn)
/*     */   {
/* 614 */     double d = packet24mobspawn.c / 32.0D;
/* 615 */     double d1 = packet24mobspawn.d / 32.0D;
/* 616 */     double d2 = packet24mobspawn.e / 32.0D;
/* 617 */     float f = packet24mobspawn.f * 360 / 256.0F;
/* 618 */     float f1 = packet24mobspawn.g * 360 / 256.0F;
/* 619 */     wd entityliving = (wd)um.a(packet24mobspawn.b, this.h.f);
/* 620 */     entityliving.ak = packet24mobspawn.c;
/* 621 */     entityliving.al = packet24mobspawn.d;
/* 622 */     entityliving.am = packet24mobspawn.e;
/* 623 */     entityliving.f = packet24mobspawn.a;
/* 624 */     entityliving.b(d, d1, d2, f, f1);
/* 625 */     entityliving.bu = true;
/* 626 */     this.i.a(packet24mobspawn.a, entityliving);
/* 627 */     List list = packet24mobspawn.b();
/* 628 */     if (list != null)
/*     */     {
/* 630 */       entityliving.t().a(list);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(th packet4updatetime)
/*     */   {
/* 636 */     this.h.f.a(packet4updatetime.a);
/*     */   }
/*     */ 
/*     */   public void a(zi packet6spawnposition)
/*     */   {
/* 641 */     this.h.h.a(new ps(packet6spawnposition.a, packet6spawnposition.b, packet6spawnposition.c));
/* 642 */     this.h.f.x().a(packet6spawnposition.a, packet6spawnposition.b, packet6spawnposition.c);
/*     */   }
/*     */ 
/*     */   public void a(xa packet39attachentity)
/*     */   {
/* 647 */     Object obj = a(packet39attachentity.a);
/* 648 */     kj entity = a(packet39attachentity.b);
/* 649 */     if (packet39attachentity.a == this.h.h.f)
/*     */     {
/* 651 */       obj = this.h.h;
/*     */     }
/* 653 */     if (obj == null)
/*     */     {
/* 655 */       return;
/*     */     }
/*     */ 
/* 658 */     ((kj)obj).g(entity);
/*     */   }
/*     */ 
/*     */   public void a(fb packet38entitystatus)
/*     */   {
/* 665 */     kj entity = a(packet38entitystatus.a);
/* 666 */     if (entity != null)
/*     */     {
/* 668 */       entity.a(packet38entitystatus.b);
/*     */     }
/*     */   }
/*     */ 
/*     */   private kj a(int i)
/*     */   {
/* 674 */     if (i == this.h.h.f)
/*     */     {
/* 676 */       return this.h.h;
/*     */     }
/*     */ 
/* 679 */     return this.i.a(i);
/*     */   }
/*     */ 
/*     */   public void a(cs packet8updatehealth)
/*     */   {
/* 685 */     this.h.h.b(packet8updatehealth.a);
/* 686 */     this.h.h.at().a(packet8updatehealth.b);
/* 687 */     this.h.h.at().b(packet8updatehealth.c);
/*     */   }
/*     */ 
/*     */   public void a(gg packet43experience)
/*     */   {
/* 692 */     this.h.h.c(packet43experience.a, packet43experience.b, packet43experience.c);
/*     */   }
/*     */ 
/*     */   public void a(ik packet9respawn)
/*     */   {
/* 697 */     if ((packet9respawn.b != this.h.h.aE) || (packet9respawn.a != this.h.h.k.s()))
/*     */     {
/* 699 */       this.j = false;
/* 700 */       if (this.protoWorld == null)
/*     */       {
/* 702 */         this.i = new gx(this, new dx(packet9respawn.a, packet9respawn.e, false), packet9respawn.b, packet9respawn.c);
/* 703 */         this.i.I = true;
/* 704 */         this.h.a(this.i);
/*     */       }
/*     */       else {
/* 707 */         WorldWithLayersClient client1 = new WorldWithLayersClient(this, this.protoWorld, packet9respawn.b, packet9respawn.c);
/* 708 */         client1.C.setGameType(packet9respawn.e);
/* 709 */         client1.I = true;
/* 710 */         for (rv layer : client1.layers)
/* 711 */           layer.I = true;
/* 712 */         this.i = new WorldWithLayersClientNet(client1);
/* 713 */         this.h.a(client1);
/*     */       }
/* 715 */       this.h.h.aE = packet9respawn.b;
/* 716 */       this.h.a(new dp(this));
/*     */     }
/* 718 */     this.h.a(true, packet9respawn.b);
/* 719 */     ((np)this.h.c).a(packet9respawn.e == 1);
/*     */   }
/*     */ 
/*     */   public void a(zn packet60explosion)
/*     */   {
/* 724 */     zf explosion = new zf(this.h.f, null, packet60explosion.a, packet60explosion.b, packet60explosion.c, packet60explosion.d);
/* 725 */     explosion.g = packet60explosion.e;
/* 726 */     explosion.a(true);
/*     */   }
/*     */ 
/*     */   public void a(ey packet100openwindow)
/*     */   {
/* 731 */     if (packet100openwindow.b == 0)
/*     */     {
/* 733 */       jf inventorybasic = new jf(packet100openwindow.c, packet100openwindow.d);
/* 734 */       this.h.h.a(inventorybasic);
/* 735 */       this.h.h.au.f = packet100openwindow.a;
/*     */     }
/* 737 */     else if (packet100openwindow.b == 2)
/*     */     {
/* 739 */       aaa tileentityfurnace = new aaa();
/* 740 */       this.h.h.a(tileentityfurnace);
/* 741 */       this.h.h.au.f = packet100openwindow.a;
/*     */     }
/* 743 */     else if (packet100openwindow.b == 3)
/*     */     {
/* 745 */       an tileentitydispenser = new an();
/* 746 */       this.h.h.a(tileentitydispenser);
/* 747 */       this.h.h.au.f = packet100openwindow.a;
/*     */     }
/* 749 */     else if (packet100openwindow.b == 1)
/*     */     {
/* 751 */       qs entityplayersp = this.h.h;
/* 752 */       this.h.h.a(et.b(entityplayersp.o), et.b(entityplayersp.p), et.b(entityplayersp.q));
/* 753 */       this.h.h.au.f = packet100openwindow.a;
/*     */     }
/*     */     else {
/* 756 */       MineUpModloaderMpAdapter.get().handleGUI(packet100openwindow);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(ei packet103setslot)
/*     */   {
/* 762 */     if (packet103setslot.a == -1)
/*     */     {
/* 764 */       this.h.h.as.b(packet103setslot.c);
/*     */     }
/* 766 */     else if ((packet103setslot.a == 0) && (packet103setslot.b >= 36) && (packet103setslot.b < 45))
/*     */     {
/* 768 */       ul itemstack = this.h.h.at.b(packet103setslot.b).a();
/* 769 */       if ((packet103setslot.c != null) && ((itemstack == null) || (itemstack.a < packet103setslot.c.a)))
/*     */       {
/* 771 */         packet103setslot.c.b = 5;
/*     */       }
/* 773 */       this.h.h.at.a(packet103setslot.b, packet103setslot.c);
/*     */     }
/* 775 */     else if (packet103setslot.a == this.h.h.au.f)
/*     */     {
/* 777 */       this.h.h.au.a(packet103setslot.b, packet103setslot.c);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(id packet106transaction)
/*     */   {
/* 783 */     cf container = null;
/* 784 */     if (packet106transaction.a == 0)
/*     */     {
/* 786 */       container = this.h.h.at;
/*     */     }
/* 788 */     else if (packet106transaction.a == this.h.h.au.f)
/*     */     {
/* 790 */       container = this.h.h.au;
/*     */     }
/* 792 */     if (container != null)
/*     */     {
/* 794 */       if (packet106transaction.c)
/*     */       {
/* 796 */         container.a(packet106transaction.b);
/*     */       }
/*     */       else {
/* 799 */         container.b(packet106transaction.b);
/* 800 */         c(new id(packet106transaction.a, packet106transaction.b, true));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(vf packet104windowitems)
/*     */   {
/* 807 */     if (packet104windowitems.a == 0)
/*     */     {
/* 809 */       this.h.h.at.a(packet104windowitems.b);
/*     */     }
/* 811 */     else if (packet104windowitems.a == this.h.h.au.f)
/*     */     {
/* 813 */       this.h.h.au.a(packet104windowitems.b);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(abh packet130updatesign)
/*     */   {
/* 819 */     if (this.h.f.d(packet130updatesign.a, packet130updatesign.b, packet130updatesign.c))
/*     */     {
/* 821 */       ij tileentity = this.h.f.b(packet130updatesign.a, packet130updatesign.b, packet130updatesign.c);
/* 822 */       if ((tileentity instanceof od))
/*     */       {
/* 824 */         od tileentitysign = (od)tileentity;
/* 825 */         for (int i = 0; i < 4; i++)
/*     */         {
/* 827 */           tileentitysign.a[i] = packet130updatesign.d[i];
/*     */         }
/*     */ 
/* 830 */         tileentitysign.l();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(hf packet105updateprogressbar)
/*     */   {
/* 837 */     a(packet105updateprogressbar);
/* 838 */     if ((this.h.h.au != null) && (this.h.h.au.f == packet105updateprogressbar.a))
/*     */     {
/* 840 */       this.h.h.au.a(packet105updateprogressbar.b, packet105updateprogressbar.c);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(ot packet5playerinventory)
/*     */   {
/* 846 */     kj entity = a(packet5playerinventory.a);
/* 847 */     if (entity != null)
/*     */     {
/* 849 */       entity.b(packet5playerinventory.b, packet5playerinventory.c, packet5playerinventory.d);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(wl packet101closewindow)
/*     */   {
/* 855 */     this.h.h.U();
/*     */   }
/*     */ 
/*     */   public void a(mq packet54playnoteblock)
/*     */   {
/* 860 */     this.h.f.e(packet54playnoteblock.a, packet54playnoteblock.b, packet54playnoteblock.c, packet54playnoteblock.d, packet54playnoteblock.e);
/*     */   }
/*     */ 
/*     */   public void a(qc packet70bed)
/*     */   {
/* 865 */     int i = packet70bed.b;
/* 866 */     if ((i >= 0) && (i < qc.a.length) && (qc.a[i] != null))
/*     */     {
/* 868 */       this.h.h.b(qc.a[i]);
/*     */     }
/* 870 */     if (i == 1)
/*     */     {
/* 872 */       this.i.x().b(true);
/* 873 */       this.i.j(1.0F);
/*     */     }
/* 875 */     else if (i == 2)
/*     */     {
/* 877 */       this.i.x().b(false);
/* 878 */       this.i.j(0.0F);
/*     */     }
/* 880 */     else if (i == 3)
/*     */     {
/* 882 */       ((np)this.h.c).a(packet70bed.c == 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(aa packet131mapdata)
/*     */   {
/* 888 */     if (packet131mapdata.a == sv.be.br)
/*     */     {
/* 890 */       ng.a(packet131mapdata.b, this.h.f).a(packet131mapdata.c);
/*     */     }
/*     */     else
/* 893 */       System.out.println("Unknown itemid: " + packet131mapdata.b);
/*     */   }
/*     */ 
/*     */   public void a(de packet61doorchange)
/*     */   {
/* 899 */     this.h.f.f(packet61doorchange.a, packet61doorchange.c, packet61doorchange.d, packet61doorchange.e, packet61doorchange.b);
/*     */   }
/*     */ 
/*     */   public void a(hy packet200statistic)
/*     */   {
/* 904 */     ((aan)this.h.h).b(fd.a(packet200statistic.a), packet200statistic.b);
/*     */   }
/*     */ 
/*     */   public void a(qx packet41entityeffect)
/*     */   {
/* 909 */     kj entity = a(packet41entityeffect.a);
/* 910 */     if ((entity == null) || (!(entity instanceof wd)))
/*     */     {
/* 912 */       return;
/*     */     }
/*     */ 
/* 915 */     ((wd)entity).a(new ade(packet41entityeffect.b, packet41entityeffect.d, packet41entityeffect.c));
/*     */   }
/*     */ 
/*     */   public void a(ww packet42removeentityeffect)
/*     */   {
/* 922 */     kj entity = a(packet42removeentityeffect.a);
/* 923 */     if ((entity == null) || (!(entity instanceof wd)))
/*     */     {
/* 925 */       return;
/*     */     }
/*     */ 
/* 928 */     ((wd)entity).f(packet42removeentityeffect.b);
/*     */   }
/*     */ 
/*     */   public boolean a()
/*     */   {
/* 935 */     return false;
/*     */   }
/*     */ 
/*     */   public void a(rd packet201playerinfo)
/*     */   {
/* 940 */     ab guisavinglevelstring = (ab)this.k.get(packet201playerinfo.a);
/* 941 */     if ((guisavinglevelstring == null) && (packet201playerinfo.b))
/*     */     {
/* 943 */       guisavinglevelstring = new ab(packet201playerinfo.a);
/* 944 */       this.k.put(packet201playerinfo.a, guisavinglevelstring);
/* 945 */       this.c.add(guisavinglevelstring);
/*     */     }
/* 947 */     if ((guisavinglevelstring != null) && (!packet201playerinfo.b))
/*     */     {
/* 949 */       this.k.remove(packet201playerinfo.a);
/* 950 */       this.c.remove(guisavinglevelstring);
/*     */     }
/* 952 */     if ((packet201playerinfo.b) && (guisavinglevelstring != null))
/*     */     {
/* 954 */       guisavinglevelstring.b = packet201playerinfo.c;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void a(wh packet0keepalive)
/*     */   {
/* 960 */     c(new wh(packet0keepalive.a));
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/* 976 */     MineUpModloaderMpAdapter.get().init();
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     wt
 * JD-Core Version:    0.6.2
 */