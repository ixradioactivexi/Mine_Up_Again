/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ExtendedWorldProvider
/*     */ {
/*     */   private static ExtendedWorldProvider head;
/*     */   protected ExtendedWorldProvider next;
/*  91 */   private static HashMap<String, ExtendedWorldProvider.WorldProviderEntry> worldProviders = new HashMap();
/*     */ 
/*     */   public static ExtendedWorldProvider get()
/*     */   {
/*  19 */     return head;
/*     */   }
/*     */ 
/*     */   public static void addToStack(ExtendedWorldProvider provider)
/*     */   {
/*  28 */     provider.next = head;
/*  29 */     head = provider;
/*     */   }
/*     */ 
/*     */   public int getWorldMinY(rv world)
/*     */   {
/*  39 */     return 0;
/*     */   }
/*     */ 
/*     */   public int getWorldMaxY(rv world)
/*     */   {
/*  49 */     return 128;
/*     */   }
/*     */ 
/*     */   public acz getWorldProviderAt(rv world, int x, int y, int z)
/*     */   {
/*  60 */     return world.y;
/*     */   }
/*     */ 
/*     */   public Collection getEntityList(rv world)
/*     */   {
/*  71 */     return world.g;
/*     */   }
/*     */ 
/*     */   public static acz getProviderForWorldType(String type)
/*     */   {
/*  94 */     if (!worldProviders.containsKey(type))
/*  95 */       return null;
/*  96 */     Class prov = ((ExtendedWorldProvider.WorldProviderEntry)worldProviders.get(type)).clazz;
/*  97 */     acz res = null;
/*     */     try {
/*  99 */       res = (acz)prov.newInstance();
/* 100 */       res.setName(((ExtendedWorldProvider.WorldProviderEntry)worldProviders.get(type)).dimensionName);
/*     */     } catch (InstantiationException ignored) {
/*     */     } catch (IllegalAccessException ignored) {
/*     */     }
/* 104 */     return res;
/*     */   }
/*     */ 
/*     */   public static void registerWorldProvider(String worldType, Class<? extends acz> clazz, WorldProviderType type)
/*     */   {
/* 109 */     worldProviders.put(worldType, new ExtendedWorldProvider.WorldProviderEntry(worldType, clazz, worldType, type));
/*     */   }
/*     */ 
/*     */   public static void registerWorldProvider(String worldType, Class<? extends acz> clazz, String dimensionName, WorldProviderType type)
/*     */   {
/* 114 */     worldProviders.put(worldType, new ExtendedWorldProvider.WorldProviderEntry(worldType, clazz, dimensionName, type));
/*     */   }
/*     */ 
/*     */   public static List<String> getProviders() {
/* 118 */     ArrayList list = new ArrayList();
/* 119 */     list.addAll(worldProviders.keySet());
/* 120 */     Collections.sort(list);
/* 121 */     return list;
/*     */   }
/*     */ 
/*     */   public static List<String> getProvidersByType(WorldProviderType type) {
/* 125 */     ArrayList list = new ArrayList();
/* 126 */     for (String key : worldProviders.keySet())
/* 127 */       if ((((ExtendedWorldProvider.WorldProviderEntry)worldProviders.get(key)).type == type) || ((((ExtendedWorldProvider.WorldProviderEntry)worldProviders.get(key)).type != WorldProviderType.WORLD) && (type == WorldProviderType.FASTTRAVEL)))
/*     */       {
/* 129 */         list.add(key);
/*     */       }
/* 130 */     Collections.sort(list);
/* 131 */     return list;
/*     */   }
/*     */ 
/*     */   static {
/* 135 */     addToStack(new ExtendedWorldProvider());
/* 136 */     registerWorldProvider("world", js.class, "", WorldProviderType.WORLD);
/* 137 */     registerWorldProvider("nether", aci.class, "1", WorldProviderType.UNDERWORLD);
/* 138 */     registerWorldProvider("nether-2", aci.class, WorldProviderType.UNDERWORLD);
/* 139 */     registerWorldProvider("skylands", am.class, "2", WorldProviderType.OVERWORLD);
/* 140 */     registerWorldProvider("skyblock", WorldProviderSkyBlock.class, WorldProviderType.OVERWORLD);
/*     */     try {
/* 142 */       Class biosphere = Class.forName("BiosphereWeather");
/* 143 */       registerWorldProvider("biospheres", WorldProviderBioSphere.class, WorldProviderType.OVERWORLD);
/* 144 */       System.out.println("Mine Up mod has found Biospheres");
/*     */     }
/*     */     catch (Exception ignored)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class WorldProviderEntry
/*     */   {
/*     */     String name;
/*     */     Class<? extends acz> clazz;
/*     */     String dimensionName;
/*     */     WorldProviderType type;
/*     */ 
/*     */     public WorldProviderEntry(String name, Class<? extends acz> clazz, String dimensionName, WorldProviderType type)
/*     */     {
/*  83 */       this.name = name;
/*  84 */       this.clazz = clazz;
/*  85 */       this.dimensionName = dimensionName;
/*  86 */       this.type = type;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ExtendedWorldProvider
 * JD-Core Version:    0.6.2
 */