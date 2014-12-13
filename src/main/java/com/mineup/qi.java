/*     */ public class qi extends sv
/*     */ {
/*     */   private int a;
/*     */ 
/*     */   public qi(int i)
/*     */   {
/*  17 */     super(i);
/*  18 */     this.a = (i + 256);
/*  19 */     d(lr.m[(i + 256)].a(2));
/*     */   }
/*     */ 
/*     */   public int b()
/*     */   {
/*  24 */     return this.a;
/*     */   }
/*     */ 
/*     */   public boolean a(ul itemstack, sz entityplayer, rv world, int i, int j, int k, int l)
/*     */   {
/*  29 */     int i1 = world.a(i, j, k);
/*  30 */     if (i1 == lr.aT.bA)
/*     */     {
/*  32 */       l = 0;
/*     */     }
/*  34 */     else if (i1 != lr.bv.bA)
/*     */     {
/*  36 */       if (l == 0)
/*     */       {
/*  38 */         j--;
/*     */       }
/*  40 */       if (l == 1)
/*     */       {
/*  42 */         j++;
/*     */       }
/*  44 */       if (l == 2)
/*     */       {
/*  46 */         k--;
/*     */       }
/*  48 */       if (l == 3)
/*     */       {
/*  50 */         k++;
/*     */       }
/*  52 */       if (l == 4)
/*     */       {
/*  54 */         i--;
/*     */       }
/*  56 */       if (l == 5)
/*     */       {
/*  58 */         i++;
/*     */       }
/*     */     }
/*  61 */     if (itemstack.a == 0)
/*     */     {
/*  63 */       return false;
/*     */     }
/*  65 */     if ((entityplayer != null) && (!entityplayer.e(i, j, k)))
/*     */     {
/*  67 */       return false;
/*     */     }
/*  69 */     world.getClass();
/*  70 */     if ((j == world.getWorldMaxY() - 1) && (lr.m[this.a].bN.a()))
/*     */     {
/*  72 */       return false;
/*     */     }
/*  74 */     if (world.a(this.a, i, j, k, false, l))
/*     */     {
/*  76 */       lr block = lr.m[this.a];
/*  77 */       if (world.d(i, j, k, this.a, b(itemstack.i())))
/*     */       {
/*  79 */         if (world.a(i, j, k) == this.a)
/*     */         {
/*  81 */           lr.m[this.a].c(world, i, j, k, l);
/*  82 */           lr.m[this.a].a(world, i, j, k, entityplayer);
/*     */         }
/*  84 */         world.a(i + 0.5F, j + 0.5F, k + 0.5F, block.bL.d(), (block.bL.b() + 1.0F) / 2.0F, block.bL.c() * 0.8F);
/*  85 */         itemstack.a -= 1;
/*     */       }
/*  87 */       return true;
/*     */     }
/*     */ 
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */   public String a(ul itemstack)
/*     */   {
/*  96 */     return lr.m[this.a].p();
/*     */   }
/*     */ 
/*     */   public String c()
/*     */   {
/* 101 */     return lr.m[this.a].p();
/*     */   }
/*     */ }

/* Location:           /Users/Scott/Downloads/mine-up_0.2.6.1.zip
 * Qualified Name:     qi
 * JD-Core Version:    0.6.2
 */