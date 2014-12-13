/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ public class ListHashSetAdapter
/*     */   implements List
/*     */ {
/*  12 */   HashSet collection = new HashSet();
/*     */ 
/*     */   public boolean add(Object e) {
/*  15 */     return this.collection.add(e);
/*     */   }
/*     */ 
/*     */   public void add(int index, Object element) {
/*  19 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public boolean addAll(Collection c) {
/*  23 */     return this.collection.addAll(c);
/*     */   }
/*     */ 
/*     */   public boolean addAll(int index, Collection c) {
/*  27 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public void clear() {
/*  31 */     this.collection.clear();
/*     */   }
/*     */ 
/*     */   public boolean contains(Object o) {
/*  35 */     return this.collection.contains(o);
/*     */   }
/*     */ 
/*     */   public boolean containsAll(Collection c) {
/*  39 */     return this.collection.contains(c);
/*     */   }
/*     */ 
/*     */   public Object get(int index) {
/*  43 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public int indexOf(Object o) {
/*  47 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public boolean isEmpty() {
/*  51 */     return this.collection.isEmpty();
/*     */   }
/*     */ 
/*     */   public Iterator iterator() {
/*  55 */     return this.collection.iterator();
/*     */   }
/*     */ 
/*     */   public int lastIndexOf(Object o) {
/*  59 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public ListIterator listIterator()
/*     */   {
/*  64 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public ListIterator listIterator(int index) {
/*  68 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public boolean remove(Object o) {
/*  72 */     return this.collection.remove(o);
/*     */   }
/*     */ 
/*     */   public Object remove(int index) {
/*  76 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public boolean removeAll(Collection c) {
/*  80 */     return this.collection.removeAll(c);
/*     */   }
/*     */ 
/*     */   public boolean retainAll(Collection c) {
/*  84 */     return this.collection.retainAll(c);
/*     */   }
/*     */ 
/*     */   public Object set(int index, Object element) {
/*  88 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public int size() {
/*  92 */     return this.collection.size();
/*     */   }
/*     */ 
/*     */   public List subList(int fromIndex, int toIndex) {
/*  96 */     throw new NotImplementedException();
/*     */   }
/*     */ 
/*     */   public Object[] toArray() {
/* 100 */     return this.collection.toArray();
/*     */   }
/*     */ 
/*     */   public Object[] toArray(Object[] a) {
/* 104 */     return this.collection.toArray(a);
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     ListHashSetAdapter
 * JD-Core Version:    0.6.2
 */