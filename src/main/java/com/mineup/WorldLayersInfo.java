/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class WorldLayersInfo
/*     */ {
/* 103 */   List<WorldLayersInfo.ChildWorldInfo> underworld = new ArrayList(); List<WorldLayersInfo.ChildWorldInfo> overworld = new ArrayList();
/* 104 */   WorldLayersInfo.ChildWorldInfo world = new WorldLayersInfo.ChildWorldInfo("world", 0L); WorldLayersInfo.ChildWorldInfo fasttravel = null;
/*     */ 
/*     */   public WorldLayersInfo()
/*     */   {
/*     */   }
/*     */ 
/*     */   public WorldLayersInfo(xb nbttagcompound)
/*     */   {
/* 100 */     loadFromNBTTagCompound(nbttagcompound);
/*     */   }
/*     */ 
/*     */   public List<WorldLayersInfo.ChildWorldInfo> getUnderworld()
/*     */   {
/* 107 */     return this.underworld;
/*     */   }
/*     */ 
/*     */   public List<WorldLayersInfo.ChildWorldInfo> getOverworld() {
/* 111 */     return this.overworld;
/*     */   }
/*     */ 
/*     */   public WorldLayersInfo.ChildWorldInfo getWorld() {
/* 115 */     return this.world;
/*     */   }
/*     */ 
/*     */   public void copyFrom(WorldLayersInfo info) {
/* 119 */     this.underworld.clear();
/* 120 */     this.overworld.clear();
/* 121 */     this.world = new WorldLayersInfo.ChildWorldInfo(info.world);
/* 122 */     for (WorldLayersInfo.ChildWorldInfo w : info.underworld)
/* 123 */       this.underworld.add(new WorldLayersInfo.ChildWorldInfo(w));
/* 124 */     for (WorldLayersInfo.ChildWorldInfo w : info.overworld)
/* 125 */       this.overworld.add(new WorldLayersInfo.ChildWorldInfo(w));
/* 126 */     if (info.fasttravel != null)
/* 127 */       this.fasttravel = new WorldLayersInfo.ChildWorldInfo(info.fasttravel);
/* 128 */     else this.fasttravel = null; 
/*     */   }
/*     */ 
/*     */   public void setRandomSeed(long seed)
/*     */   {
/* 132 */     this.world.setRandomSeed(seed);
/* 133 */     for (WorldLayersInfo.ChildWorldInfo info : this.overworld)
/* 134 */       info.setRandomSeed(seed);
/* 135 */     for (WorldLayersInfo.ChildWorldInfo info : this.underworld)
/* 136 */       info.setRandomSeed(seed);
/*     */   }
/*     */ 
/*     */   public void addWorld(WorldProviderType type, String name) {
/* 140 */     if (name.equals(""))
/* 141 */       return;
/* 142 */     WorldLayersInfo.ChildWorldInfo info = new WorldLayersInfo.ChildWorldInfo(name, 0L);
/* 143 */     switch (WorldLayersInfo.1.$SwitchMap$net$minecraft$src$WorldProviderType[type.ordinal()]) {
/*     */     case 1:
/* 145 */       this.world = info;
/* 146 */       break;
/*     */     case 2:
/* 148 */       this.underworld.add(info);
/* 149 */       break;
/*     */     case 3:
/* 151 */       this.overworld.add(info);
/* 152 */       break;
/*     */     case 4:
/* 154 */       this.fasttravel = info;
/*     */     }
/*     */   }
/*     */ 
/*     */   public WorldLayersInfo.ChildWorldInfo getFastTravel()
/*     */   {
/* 161 */     return this.fasttravel;
/*     */   }
/*     */ 
/*     */   private List<WorldLayersInfo.ChildWorldInfo> loadList(xb nbttagcompound) {
/* 165 */     ArrayList list = new ArrayList();
/* 166 */     for (int i = 0; 
/* 167 */       nbttagcompound.b(i + ""); i++)
/*     */     {
/* 168 */       list.add(new WorldLayersInfo.ChildWorldInfo(nbttagcompound.k(i + "")));
/*     */     }
/*     */ 
/* 171 */     return list;
/*     */   }
/*     */ 
/*     */   private xb saveList(List<WorldLayersInfo.ChildWorldInfo> list) {
/* 175 */     xb nbttagcompound = new xb();
/* 176 */     for (int i = 0; i < list.size(); i++)
/* 177 */       nbttagcompound.a(i + "", ((WorldLayersInfo.ChildWorldInfo)list.get(i)).getNBTTagCompound());
/* 178 */     return nbttagcompound;
/*     */   }
/*     */ 
/*     */   public void loadFromNBTTagCompound(xb nbttagcompound) {
/* 182 */     this.overworld = loadList(nbttagcompound.k("overworld"));
/* 183 */     this.underworld = loadList(nbttagcompound.k("underworld"));
/* 184 */     this.world = new WorldLayersInfo.ChildWorldInfo(nbttagcompound.k("world"));
/* 185 */     if (nbttagcompound.b("fasttravel"))
/* 186 */       this.fasttravel = new WorldLayersInfo.ChildWorldInfo(nbttagcompound.k("fasttravel"));
/*     */   }
/*     */ 
/*     */   public xb getNBTTagCompound() {
/* 190 */     xb nbttagcompound = new xb();
/* 191 */     nbttagcompound.a("overworld", saveList(this.overworld));
/* 192 */     nbttagcompound.a("underworld", saveList(this.underworld));
/* 193 */     nbttagcompound.a("world", this.world.getNBTTagCompound());
/* 194 */     if (this.fasttravel != null)
/* 195 */       nbttagcompound.a("fasttravel", this.fasttravel.getNBTTagCompound());
/* 196 */     return nbttagcompound;
/*     */   }
/*     */ 
/*     */   public static WorldLayersInfo getDefaultWorldLayersInfo() {
/* 200 */     WorldLayersInfo info = new WorldLayersInfo();
/* 201 */     info.overworld.add(new WorldLayersInfo.ChildWorldInfo("skylands", 0L));
/* 202 */     info.fasttravel = new WorldLayersInfo.ChildWorldInfo("nether", 0L);
/* 203 */     return info;
/*     */   }
/*     */ 
/*     */   public static class ChildWorldInfo
/*     */   {
/*     */     String worldType;
/*     */     long randomSeed;
/*     */     public int rainTime;
/*     */     public boolean raining;
/*     */     public int thunderTime;
/*     */     public boolean thundering;
/*     */ 
/*     */     public long getRandomSeed()
/*     */     {
/*  12 */       return this.randomSeed;
/*     */     }
/*     */ 
/*     */     public void setRandomSeed(long randomSeed) {
/*  16 */       this.randomSeed = randomSeed;
/*     */     }
/*     */ 
/*     */     public ChildWorldInfo(String worldType, long randomSeed)
/*     */     {
/*  25 */       this.worldType = worldType;
/*  26 */       this.randomSeed = randomSeed;
/*     */     }
/*     */ 
/*     */     public ChildWorldInfo(String worldType, rl worldInfo) {
/*  30 */       this(worldType, worldInfo.b());
/*  31 */       copyFrom(worldInfo);
/*     */     }
/*     */ 
/*     */     public ChildWorldInfo(xb nbttagcompound) {
/*  35 */       loadFromNBTTagCompound(nbttagcompound);
/*     */     }
/*     */ 
/*     */     public ChildWorldInfo(ChildWorldInfo info) {
/*  39 */       copyFrom(info);
/*     */     }
/*     */ 
/*     */     public String getWorldType() {
/*  43 */       return this.worldType;
/*     */     }
/*     */ 
/*     */     public void setWorldType(String worldType) {
/*  47 */       this.worldType = worldType;
/*     */     }
/*     */ 
/*     */     public void apply(rl w) {
/*  51 */       w.b(this.raining);
/*  52 */       w.a(this.thundering);
/*  53 */       w.f(this.rainTime);
/*  54 */       w.e(this.thunderTime);
/*     */     }
/*     */ 
/*     */     public void copyFrom(ChildWorldInfo worldInfo) {
/*  58 */       this.worldType = worldInfo.worldType;
/*  59 */       this.randomSeed = worldInfo.randomSeed;
/*     */ 
/*  61 */       this.rainTime = worldInfo.rainTime;
/*  62 */       this.raining = worldInfo.raining;
/*  63 */       this.thundering = worldInfo.thundering;
/*  64 */       this.thunderTime = worldInfo.thunderTime;
/*     */     }
/*     */ 
/*     */     public void copyFrom(rl worldInfo) {
/*  68 */       this.rainTime = worldInfo.p();
/*  69 */       this.raining = worldInfo.o();
/*  70 */       this.thundering = worldInfo.m();
/*  71 */       this.thunderTime = worldInfo.n();
/*     */     }
/*     */ 
/*     */     public void loadFromNBTTagCompound(xb nbttagcompound) {
/*  75 */       this.worldType = nbttagcompound.i("worldType");
/*  76 */       this.randomSeed = nbttagcompound.f("randomSeed");
/*  77 */       this.rainTime = nbttagcompound.e("rainTime");
/*  78 */       this.raining = nbttagcompound.m("raining");
/*  79 */       this.thunderTime = nbttagcompound.e("thunderTime");
/*  80 */       this.thundering = nbttagcompound.m("thundering");
/*     */     }
/*     */ 
/*     */     public xb getNBTTagCompound() {
/*  84 */       xb nbttagcompound = new xb();
/*  85 */       nbttagcompound.a("worldType", this.worldType);
/*  86 */       nbttagcompound.a("randomSeed", this.randomSeed);
/*  87 */       nbttagcompound.a("rainTime", this.rainTime);
/*  88 */       nbttagcompound.a("raining", this.raining);
/*  89 */       nbttagcompound.a("thunderTime", this.thunderTime);
/*  90 */       nbttagcompound.a("thundering", this.thundering);
/*  91 */       return nbttagcompound;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     WorldLayersInfo
 * JD-Core Version:    0.6.2
 */