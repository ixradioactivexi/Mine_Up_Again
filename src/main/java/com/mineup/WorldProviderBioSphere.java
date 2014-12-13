/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ 
/*    */ public class WorldProviderBioSphere extends acz
/*    */ {
/*    */   protected void a()
/*    */   {
/*    */     try
/*    */     {
/* 20 */       Class weather = Class.forName("BiosphereWeather");
/* 21 */       this.b = ((nu)weather.getDeclaredConstructor(new Class[] { rv.class }).newInstance(new Object[] { this.a }));
/*    */     } catch (ClassNotFoundException ignored) {
/*    */     } catch (InstantiationException ignored) {
/*    */     } catch (IllegalAccessException ignored) {
/*    */     } catch (IllegalArgumentException ignored) {
/*    */     } catch (InvocationTargetException ignored) {
/*    */     }
/*    */     catch (NoSuchMethodException ignored) {
/*    */     }
/*    */     catch (SecurityException ignored) {
/*    */     }
/*    */   }
/*    */ 
/*    */   public bf b() {
/* 35 */     bf res = null;
/*    */     try {
/* 37 */       Class gen = Class.forName("BiosphereGen");
/* 38 */       res = (bf)gen.getDeclaredConstructor(new Class[] { rv.class, Long.TYPE, Boolean.TYPE }).newInstance(new Object[] { this.a, Long.valueOf(this.a.s()), Boolean.valueOf(this.a.x().r()) });
/*    */     } catch (ClassNotFoundException ignored) {
/*    */     } catch (InstantiationException ignored) {
/*    */     } catch (IllegalAccessException ignored) {
/*    */     } catch (IllegalArgumentException ignored) {
/*    */     } catch (InvocationTargetException ignored) {
/*    */     } catch (NoSuchMethodException ignored) {
/*    */     } catch (SecurityException ignored) {
/*    */     }
/* 47 */     return res;
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     WorldProviderBioSphere
 * JD-Core Version:    0.6.2
 */