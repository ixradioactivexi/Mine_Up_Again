/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ public class ry extends qr
/*     */ {
/*  21 */   private HashMap<WorldProviderType, GuiButtonList> buttons = new HashMap();
/*  22 */   private HashMap<WorldProviderType, GuiButtonList> buttons2 = new HashMap();
/*     */   private qr a;
/*     */   private zq b;
/*     */   private zq c;
/*     */   private String d;
/*     */   private String f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private boolean i;
/*     */   private vj j;
/*     */   private vj k;
/*     */   private vj s;
/*     */   private vj t;
/*     */   private String u;
/*     */   private String v;
/*     */ 
/*     */   public ry(qr guiscreen)
/*     */   {
/*  27 */     this.f = "survival";
/*  28 */     this.g = true;
/*  29 */     this.a = guiscreen;
/*     */   }
/*     */ 
/*     */   public void p_()
/*     */   {
/*  34 */     this.b.b();
/*  35 */     this.c.b();
/*     */   }
/*     */ 
/*     */   public void a()
/*     */   {
/*  40 */     wv stringtranslate = wv.a();
/*  41 */     Keyboard.enableRepeatEvents(true);
/*  42 */     this.o.clear();
/*  43 */     this.o.add(new vj(0, this.m / 2 - 155, this.n - 28, 150, 20, stringtranslate.a("selectWorld.create")));
/*  44 */     this.o.add(new vj(1, this.m / 2 + 5, this.n - 28, 150, 20, stringtranslate.a("gui.cancel")));
/*  45 */     this.o.add(this.j = new vj(2, this.m / 2 - 75, 100, 150, 20, stringtranslate.a("selectWorld.gameMode")));
/*  46 */     this.o.add(this.k = new vj(3, this.m / 2 - 75, 190, 150, 20, stringtranslate.a("selectWorld.moreWorldOptions")));
/*  47 */     this.o.add(this.s = new vj(4, this.m / 2 - 155, 100, 150, 20, stringtranslate.a("selectWorld.mapFeatures")));
/*  48 */     this.s.i = false;
/*  49 */     this.o.add(this.t = new vj(5, this.m / 2 + 5, 100, 150, 20, stringtranslate.a("selectWorld.mapType")));
/*  50 */     this.t.i = false;
/*  51 */     this.t.h = false;
/*  52 */     this.b = new zq(this, this.q, this.m / 2 - 100, 60, 200, 20, stringtranslate.a("selectWorld.newWorld"));
/*  53 */     this.b.a = true;
/*  54 */     this.b.a(32);
/*     */ 
/*  56 */     int k = 6; int x = this.m / 2 - 50; int y = 90;
/*  57 */     for (WorldProviderType wpt : WorldProviderType.values())
/*     */     {
/*  59 */       List list = ExtendedWorldProvider.getProvidersByType(wpt);
/*  60 */       if (wpt != WorldProviderType.WORLD)
/*  61 */         list.add("");
/*  62 */       GuiButtonList btn = new GuiButtonList(k, x, y, 100, 20, wpt.defValue(), list);
/*  63 */       btn.i = false;
/*  64 */       y += 25;
/*  65 */       k++;
/*  66 */       this.buttons.put(wpt, btn);
/*  67 */       this.o.add(btn);
/*     */     }
/*  69 */     x = this.m / 2 + 60; y = 90;
/*  70 */     for (WorldProviderType wpt : WorldProviderType.values())
/*     */     {
/*  72 */       if ((wpt != WorldProviderType.WORLD) && (wpt != WorldProviderType.FASTTRAVEL)) {
/*  73 */         List list = ExtendedWorldProvider.getProvidersByType(wpt);
/*  74 */         list.add("");
/*  75 */         GuiButtonList btn = new GuiButtonList(k, x, y, 100, 20, "", list);
/*  76 */         btn.i = false;
/*  77 */         k++;
/*  78 */         this.buttons2.put(wpt, btn);
/*  79 */         this.o.add(btn);
/*     */       }
/*  81 */       y += 25;
/*     */     }
/*  83 */     this.c = new zq(this, this.q, this.m / 2 - 100, 60, 200, 20, "");
/*  84 */     c();
/*  85 */     g();
/*     */   }
/*     */ 
/*     */   private void c()
/*     */   {
/*  90 */     this.d = this.b.a().trim();
/*  91 */     char[] ac = sb.b;
/*  92 */     int i = ac.length;
/*  93 */     for (int j = 0; j < i; j++)
/*     */     {
/*  95 */       char c = ac[j];
/*  96 */       this.d = this.d.replace(c, '_');
/*     */     }
/*     */ 
/*  99 */     if (et.a(this.d))
/*     */     {
/* 101 */       this.d = "World";
/*     */     }
/* 103 */     this.d = a(this.l.c(), this.d);
/*     */   }
/*     */ 
/*     */   private void g()
/*     */   {
/* 109 */     wv stringtranslate = wv.a();
/* 110 */     this.j.f = (stringtranslate.a("selectWorld.gameMode") + " " + stringtranslate.a(new StringBuilder().append("selectWorld.gameMode.").append(this.f).toString()));
/* 111 */     this.u = stringtranslate.a("selectWorld.gameMode." + this.f + ".line1");
/* 112 */     this.v = stringtranslate.a("selectWorld.gameMode." + this.f + ".line2");
/* 113 */     this.s.f = (stringtranslate.a("selectWorld.mapFeatures") + " ");
/* 114 */     if (this.g)
/* 115 */       this.s.f += stringtranslate.a("options.on");
/*     */     else {
/* 117 */       this.s.f += stringtranslate.a("options.off");
/*     */     }
/* 119 */     this.t.f = (stringtranslate.a("selectWorld.mapType") + " " + stringtranslate.a("selectWorld.mapType.normal"));
/*     */   }
/*     */ 
/*     */   public static String a(hr isaveformat, String s)
/*     */   {
/* 125 */     while (isaveformat.b(s) != null) s = s + "-";
/* 126 */     return s;
/*     */   }
/*     */ 
/*     */   public void d()
/*     */   {
/* 131 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */ 
/*     */   protected void a(vj guibutton)
/*     */   {
/* 136 */     if ((guibutton instanceof GuiButtonList))
/*     */     {
/* 138 */       GuiButtonList guibtn = (GuiButtonList)guibutton;
/* 139 */       guibtn.switchToNext();
/* 140 */       label162: if (!guibtn.getValue().equals("")) {
/* 141 */         Iterator i$ = this.buttons.values().iterator();
/*     */         while (true) { if (!i$.hasNext()) break label95; GuiButtonList btn = (GuiButtonList)i$.next();
/* 142 */           if ((btn != guibtn) && (btn.getValue().equals(guibtn.getValue()))) {
/* 143 */             guibtn = btn;
/* 144 */             guibtn.switchToNext();
/* 145 */             break;
/*     */           } }
/* 147 */         label95: Iterator i$ = this.buttons2.values().iterator();
/*     */         while (true) { if (!i$.hasNext()) break label162; GuiButtonList btn = (GuiButtonList)i$.next();
/* 148 */           if ((btn != guibtn) && (btn.getValue().equals(guibtn.getValue()))) {
/* 149 */             guibtn = btn;
/* 150 */             guibtn.switchToNext();
/* 151 */             break;
/*     */           }
/*     */         }
/*     */       }
/* 155 */       return;
/*     */     }
/* 157 */     if (!guibutton.h)
/*     */     {
/* 159 */       return;
/*     */     }
/* 161 */     if (guibutton.g == 1)
/*     */     {
/* 163 */       this.l.a(this.a);
/*     */     }
/* 165 */     else if (guibutton.g == 0)
/*     */     {
/* 167 */       this.l.a(null);
/* 168 */       if (this.h)
/*     */       {
/* 170 */         return;
/*     */       }
/* 172 */       this.h = true;
/* 173 */       long l = new Random().nextLong();
/* 174 */       String s = this.c.a();
/* 175 */       if (!et.a(s))
/*     */       {
/*     */         try
/*     */         {
/* 179 */           long l1 = Long.parseLong(s);
/* 180 */           if (l1 != 0L)
/*     */           {
/* 182 */             l = l1;
/*     */           }
/*     */         }
/*     */         catch (NumberFormatException numberformatexception)
/*     */         {
/* 187 */           l = s.hashCode();
/*     */         }
/*     */       }
/* 190 */       int i = 0;
/* 191 */       if (this.f.equals("creative"))
/*     */       {
/* 193 */         i = 1;
/* 194 */         this.l.c = new yf(this.l);
/*     */       }
/*     */       else {
/* 197 */         this.l.c = new xu(this.l);
/*     */       }
/* 199 */       WorldLayersInfo info = new WorldLayersInfo();
/* 200 */       for (WorldProviderType type : WorldProviderType.values())
/* 201 */         info.addWorld(type, ((GuiButtonList)this.buttons.get(type)).getValue());
/* 202 */       for (WorldProviderType type : WorldProviderType.specialWorlds())
/* 203 */         info.addWorld(type, ((GuiButtonList)this.buttons2.get(type)).getValue());
/* 204 */       info.setRandomSeed(l);
/* 205 */       this.l.a(this.d, this.b.a(), new dx(l, i, this.g, info));
/* 206 */       this.l.a(null);
/*     */     }
/* 208 */     else if (guibutton.g == 3)
/*     */     {
/* 210 */       this.i = (!this.i);
/* 211 */       this.j.i = (!this.i);
/*     */ 
/* 213 */       for (vj g : this.buttons.values())
/* 214 */         g.i = this.i;
/* 215 */       for (vj g : this.buttons2.values()) {
/* 216 */         g.i = this.i;
/*     */       }
/*     */ 
/* 219 */       if (this.i)
/*     */       {
/* 221 */         wv stringtranslate = wv.a();
/* 222 */         this.k.f = stringtranslate.a("gui.done");
/*     */       }
/*     */       else {
/* 225 */         wv stringtranslate1 = wv.a();
/* 226 */         this.k.f = stringtranslate1.a("selectWorld.moreWorldOptions");
/*     */       }
/*     */     }
/* 229 */     else if (guibutton.g == 2)
/*     */     {
/* 231 */       if (this.f.equals("survival"))
/*     */       {
/* 233 */         this.f = "creative";
/*     */       }
/*     */       else {
/* 236 */         this.f = "survival";
/*     */       }
/* 238 */       g();
/*     */     }
/* 240 */     else if (guibutton.g == 4)
/*     */     {
/* 242 */       this.g = (!this.g);
/* 243 */       g();
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void a(char c, int i)
/*     */   {
/* 249 */     if ((this.b.a) && (!this.i))
/*     */     {
/* 251 */       this.b.a(c, i);
/*     */     }
/* 253 */     else if ((this.c.a) && (this.i))
/*     */     {
/* 255 */       this.c.a(c, i);
/*     */     }
/* 257 */     if (c == '\r')
/*     */     {
/* 259 */       a((vj)this.o.get(0));
/*     */     }
/* 261 */     ((vj)this.o.get(0)).h = (this.b.a().length() > 0);
/* 262 */     c();
/*     */   }
/*     */ 
/*     */   protected void a(int i, int j, int k)
/*     */   {
/* 267 */     super.a(i, j, k);
/* 268 */     if (!this.i)
/*     */     {
/* 270 */       this.b.a(i, j, k);
/*     */     }
/*     */     else
/* 273 */       this.c.a(i, j, k);
/*     */   }
/*     */ 
/*     */   public void a(int i, int j, float f)
/*     */   {
/* 279 */     wv stringtranslate = wv.a();
/* 280 */     k();
/* 281 */     a(this.q, stringtranslate.a("selectWorld.create"), this.m / 2, 20, 16777215);
/* 282 */     if (!this.i)
/*     */     {
/* 284 */       b(this.q, stringtranslate.a("selectWorld.enterName"), this.m / 2 - 100, 47, 10526880);
/* 285 */       b(this.q, stringtranslate.a("selectWorld.resultFolder") + " " + this.d, this.m / 2 - 100, 85, 10526880);
/* 286 */       this.b.c();
/* 287 */       b(this.q, this.u, this.m / 2 - 100, 122, 10526880);
/* 288 */       b(this.q, this.v, this.m / 2 - 100, 134, 10526880);
/*     */     }
/*     */     else {
/* 291 */       b(this.q, stringtranslate.a("selectWorld.enterSeed"), this.m / 2 - 100, 47, 10526880);
/*     */ 
/* 293 */       int x = this.m / 2 - 130; int y = 90;
/* 294 */       for (WorldProviderType wpt : WorldProviderType.values())
/*     */       {
/* 296 */         b(this.q, wpt.toString() + ": ", x, y + 5, 10526880);
/* 297 */         y += 25;
/*     */       }
/*     */ 
/* 301 */       this.c.c();
/*     */     }
/* 303 */     super.a(i, j, f);
/*     */   }
/*     */ 
/*     */   public void l()
/*     */   {
/* 308 */     if (this.b.a)
/*     */     {
/* 310 */       this.b.a(false);
/* 311 */       this.c.a(true);
/*     */     }
/*     */     else {
/* 314 */       this.b.a(true);
/* 315 */       this.c.a(false);
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ry
 * JD-Core Version:    0.6.2
 */