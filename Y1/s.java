package Y1;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6532U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ w f6533V;

    public /* synthetic */ s(w wVar, int i) {
        this.f6532U = i;
        this.f6533V = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f6532U
            switch(r0) {
                case 0: goto L_0x0190;
                case 1: goto L_0x00e8;
                case 2: goto L_0x002b;
                case 3: goto L_0x0023;
                case 4: goto L_0x001b;
                case 5: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 2
            Y1.w r1 = r11.f6533V
            r1.i(r0)
            return
        L_0x000c:
            Y1.w r0 = r11.f6533V
            android.animation.AnimatorSet r1 = r0.f6553l
            r1.start()
            Y1.s r1 = r0.f6562u
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.e(r1, r2)
            return
        L_0x001b:
            Y1.w r0 = r11.f6533V
            android.animation.AnimatorSet r0 = r0.f6554m
            r0.start()
            return
        L_0x0023:
            Y1.w r0 = r11.f6533V
            android.animation.AnimatorSet r0 = r0.f6555n
            r0.start()
            return
        L_0x002b:
            Y1.w r0 = r11.f6533V
            android.view.ViewGroup r1 = r0.f6548f
            if (r1 == 0) goto L_0x00e7
            android.view.ViewGroup r2 = r0.f6549g
            if (r2 != 0) goto L_0x0037
            goto L_0x00e7
        L_0x0037:
            Y1.r r3 = r0.f6544a
            int r4 = r3.getWidth()
            int r5 = r3.getPaddingLeft()
            int r4 = r4 - r5
            int r3 = r3.getPaddingRight()
            int r4 = r4 - r3
        L_0x0047:
            int r3 = r2.getChildCount()
            r5 = 1
            r6 = 0
            if (r3 <= r5) goto L_0x0060
            int r3 = r2.getChildCount()
            int r3 = r3 + -2
            android.view.View r5 = r2.getChildAt(r3)
            r2.removeViewAt(r3)
            r1.addView(r5, r6)
            goto L_0x0047
        L_0x0060:
            android.view.View r3 = r0.f6552k
            if (r3 == 0) goto L_0x0069
            r7 = 8
            r3.setVisibility(r7)
        L_0x0069:
            android.view.ViewGroup r7 = r0.i
            int r7 = Y1.w.c(r7)
            int r8 = r1.getChildCount()
            int r8 = r8 - r5
            r9 = 0
        L_0x0075:
            if (r9 >= r8) goto L_0x0083
            android.view.View r10 = r1.getChildAt(r9)
            int r10 = Y1.w.c(r10)
            int r7 = r7 + r10
            int r9 = r9 + 1
            goto L_0x0075
        L_0x0083:
            if (r7 <= r4) goto L_0x00cd
            if (r3 == 0) goto L_0x008f
            r3.setVisibility(r6)
            int r0 = Y1.w.c(r3)
            int r7 = r7 + r0
        L_0x008f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 0
        L_0x0095:
            if (r3 >= r8) goto L_0x00a9
            android.view.View r9 = r1.getChildAt(r3)
            int r10 = Y1.w.c(r9)
            int r7 = r7 - r10
            r0.add(r9)
            if (r7 > r4) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            int r3 = r3 + 1
            goto L_0x0095
        L_0x00a9:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x00e7
            int r3 = r0.size()
            r1.removeViews(r6, r3)
        L_0x00b6:
            int r1 = r0.size()
            if (r6 >= r1) goto L_0x00e7
            int r1 = r2.getChildCount()
            int r1 = r1 - r5
            java.lang.Object r3 = r0.get(r6)
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3, r1)
            int r6 = r6 + 1
            goto L_0x00b6
        L_0x00cd:
            android.view.ViewGroup r1 = r0.f6550h
            if (r1 == 0) goto L_0x00e7
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00e7
            android.animation.ValueAnimator r1 = r0.f6559r
            boolean r2 = r1.isStarted()
            if (r2 != 0) goto L_0x00e7
            android.animation.ValueAnimator r0 = r0.f6558q
            r0.cancel()
            r1.start()
        L_0x00e7:
            return
        L_0x00e8:
            Y1.w r0 = r11.f6533V
            android.view.ViewGroup r1 = r0.e
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L_0x00fa
            boolean r4 = r0.f6541A
            if (r4 == 0) goto L_0x00f6
            r4 = 0
            goto L_0x00f7
        L_0x00f6:
            r4 = 4
        L_0x00f7:
            r1.setVisibility(r4)
        L_0x00fa:
            android.view.View r1 = r0.f6551j
            if (r1 == 0) goto L_0x016c
            Y1.r r4 = r0.f6544a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165366(0x7f0700b6, float:1.7944947E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            if (r5 == 0) goto L_0x011d
            boolean r6 = r0.f6541A
            if (r6 == 0) goto L_0x0118
            r4 = 0
        L_0x0118:
            r5.bottomMargin = r4
            r1.setLayoutParams(r5)
        L_0x011d:
            boolean r4 = r1 instanceof Y1.C0372e
            if (r4 == 0) goto L_0x016c
            Y1.e r1 = (Y1.C0372e) r1
            boolean r4 = r0.f6541A
            r5 = 0
            android.graphics.Rect r6 = r1.f6403U
            r7 = 1
            if (r4 == 0) goto L_0x013e
            android.animation.ValueAnimator r4 = r1.f6392B0
            boolean r8 = r4.isStarted()
            if (r8 == 0) goto L_0x0136
            r4.cancel()
        L_0x0136:
            r1.f6394D0 = r7
            r1.f6393C0 = r5
            r1.invalidate(r6)
            goto L_0x016c
        L_0x013e:
            int r4 = r0.z
            if (r4 != r7) goto L_0x0155
            android.animation.ValueAnimator r4 = r1.f6392B0
            boolean r7 = r4.isStarted()
            if (r7 == 0) goto L_0x014d
            r4.cancel()
        L_0x014d:
            r1.f6394D0 = r3
            r1.f6393C0 = r5
            r1.invalidate(r6)
            goto L_0x016c
        L_0x0155:
            r5 = 3
            if (r4 == r5) goto L_0x016c
            android.animation.ValueAnimator r4 = r1.f6392B0
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0163
            r4.cancel()
        L_0x0163:
            r1.f6394D0 = r3
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f6393C0 = r4
            r1.invalidate(r6)
        L_0x016c:
            java.util.ArrayList r1 = r0.f6566y
            java.util.Iterator r1 = r1.iterator()
        L_0x0172:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x018f
            java.lang.Object r4 = r1.next()
            android.view.View r4 = (android.view.View) r4
            boolean r5 = r0.f6541A
            if (r5 == 0) goto L_0x018a
            boolean r5 = Y1.w.j(r4)
            if (r5 == 0) goto L_0x018a
            r5 = 4
            goto L_0x018b
        L_0x018a:
            r5 = 0
        L_0x018b:
            r4.setVisibility(r5)
            goto L_0x0172
        L_0x018f:
            return
        L_0x0190:
            Y1.w r0 = r11.f6533V
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.s.run():void");
    }
}
