/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.HashSet;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public class EntitiesCollection extends ListHashSetAdapter
/*    */ {
/*  7 */   HashMap<Class, Integer> countByType = new HashMap();
/*    */ 
/*    */   public void decCount(kj e) {
/* 10 */     Class clazz = e.getClass();
/* 11 */     if (!this.countByType.containsKey(clazz))
/* 12 */       return;
/* 13 */     this.countByType.put(clazz, Integer.valueOf(((Integer)this.countByType.get(clazz)).intValue() - 1));
/*    */   }
/*    */ 
/*    */   public void incCount(kj e) {
/* 17 */     Class clazz = e.getClass();
/* 18 */     int val = 0;
/* 19 */     if (this.countByType.containsKey(clazz))
/* 20 */       val = ((Integer)this.countByType.get(clazz)).intValue();
/* 21 */     this.countByType.put(clazz, Integer.valueOf(val + 1));
/*    */   }
/*    */ 
/*    */   public boolean add(Object e)
/*    */   {
/* 26 */     boolean res = this.collection.add(e);
/* 27 */     if (res)
/* 28 */       incCount((kj)e);
/* 29 */     return res;
/*    */   }
/*    */ 
/*    */   public boolean addAll(Collection c)
/*    */   {
/* 34 */     boolean res = false;
/* 35 */     for (Iterator i$ = c.iterator(); i$.hasNext(); ) { Object e = i$.next();
/* 36 */       res |= add(e);
/*    */     }
/* 38 */     return res;
/*    */   }
/*    */ 
/*    */   public boolean remove(Object e)
/*    */   {
/* 43 */     boolean res = this.collection.remove(e);
/* 44 */     if (res)
/* 45 */       decCount((kj)e);
/* 46 */     return res;
/*    */   }
/*    */ 
/*    */   public boolean removeAll(Collection c)
/*    */   {
/* 51 */     boolean res = false;
/* 52 */     for (Iterator i$ = c.iterator(); i$.hasNext(); ) { Object e = i$.next();
/* 53 */       res |= remove(e);
/*    */     }
/* 55 */     return res;
/*    */   }
/*    */ 
/*    */   public int getCountByClass(Class clazz) {
/* 59 */     int s = 0;
/* 60 */     for (Class clazz1 : this.countByType.keySet())
/* 61 */       if (clazz.isAssignableFrom(clazz1))
/* 62 */         s += ((Integer)this.countByType.get(clazz1)).intValue();
/* 63 */     return s;
/*    */   }
/*    */ 
/*    */   public void clear()
/*    */   {
/* 68 */     this.collection.clear();
/* 69 */     this.countByType.clear();
/*    */   }
/*    */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     EntitiesCollection
 * JD-Core Version:    0.6.2
 */