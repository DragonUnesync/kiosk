package A3;

import Q0.g;
import R.e;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import h0.C1026a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n2.a;

public final class d extends e {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f85c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1026a f86d;

    public /* synthetic */ d(C1026a aVar, int i) {
        this.f85c = i;
        this.f86d = aVar;
    }

    public final int b(View view, int i) {
        switch (this.f85c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f86d;
                return a.o(i, sideSheetBehavior.f9370a.u(), sideSheetBehavior.f9370a.t());
            default:
                return view.getLeft();
        }
    }

    public final int c(View view, int i) {
        switch (this.f85c) {
            case 0:
                return view.getTop();
            default:
                return a.o(i, ((BottomSheetBehavior) this.f86d).x(), k());
        }
    }

    public int j(View view) {
        switch (this.f85c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f86d;
                return sideSheetBehavior.f9379l + sideSheetBehavior.f9382o;
            default:
                return super.j(view);
        }
    }

    public int k() {
        switch (this.f85c) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f86d;
                if (bottomSheetBehavior.f9171I) {
                    return bottomSheetBehavior.f9182T;
                }
                return bottomSheetBehavior.f9169G;
            default:
                return super.k();
        }
    }

    public final void p(int i) {
        switch (this.f85c) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f86d;
                    if (sideSheetBehavior.f9375g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f86d;
                    if (bottomSheetBehavior.f9173K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void q(View view, int i, int i8) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f85c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f86d;
                WeakReference weakReference = sideSheetBehavior.f9384q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                    sideSheetBehavior.f9370a.Q(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f9388u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f9370a.c(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw g.k(it);
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f86d).u(i8);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (java.lang.Math.abs(r6.getTop() - r2.x()) < java.lang.Math.abs(r6.getTop() - r2.f9167E)) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (java.lang.Math.abs(r7 - r2.f9166D) < java.lang.Math.abs(r7 - r2.f9169G)) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r0.f9370a.D(r6) == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        if (java.lang.Math.abs(r7 - r0.f9370a.q()) < java.lang.Math.abs(r7 - r0.f9370a.r())) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r7 > r2.f9167E) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            int r0 = r5.f85c
            switch(r0) {
                case 0: goto L_0x00f0;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 6
            r1 = 3
            h0.a r2 = r5.f86d
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            r3 = 0
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0027
            boolean r7 = r2.f9191b
            if (r7 == 0) goto L_0x0017
        L_0x0014:
            r0 = 3
            goto L_0x00e8
        L_0x0017:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            r2.getClass()
            int r8 = r2.f9167E
            if (r7 <= r8) goto L_0x0014
            goto L_0x00e8
        L_0x0027:
            boolean r4 = r2.f9171I
            if (r4 == 0) goto L_0x0076
            boolean r4 = r2.D(r6, r8)
            if (r4 == 0) goto L_0x0076
            float r7 = java.lang.Math.abs(r7)
            float r3 = java.lang.Math.abs(r8)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0044
            int r7 = r2.f9195d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0053
        L_0x0044:
            int r7 = r6.getTop()
            int r8 = r2.f9182T
            int r3 = r2.x()
            int r3 = r3 + r8
            int r3 = r3 / 2
            if (r7 <= r3) goto L_0x0056
        L_0x0053:
            r0 = 5
            goto L_0x00e8
        L_0x0056:
            boolean r7 = r2.f9191b
            if (r7 == 0) goto L_0x005b
            goto L_0x0014
        L_0x005b:
            int r7 = r6.getTop()
            int r8 = r2.x()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r3 = r2.f9167E
            int r8 = r8 - r3
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x00e8
            goto L_0x0014
        L_0x0076:
            r4 = 4
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0088
            goto L_0x00a7
        L_0x0088:
            boolean r7 = r2.f9191b
            if (r7 == 0) goto L_0x008e
        L_0x008c:
            r0 = 4
            goto L_0x00e8
        L_0x008e:
            int r7 = r6.getTop()
            int r8 = r2.f9167E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r2.f9169G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            r2.getClass()
            goto L_0x00e8
        L_0x00a7:
            int r7 = r6.getTop()
            boolean r8 = r2.f9191b
            if (r8 == 0) goto L_0x00c2
            int r8 = r2.f9166D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.f9169G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            goto L_0x0014
        L_0x00c2:
            int r8 = r2.f9167E
            if (r7 >= r8) goto L_0x00d6
            int r8 = r2.f9169G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x00d2
            goto L_0x0014
        L_0x00d2:
            r2.getClass()
            goto L_0x00e8
        L_0x00d6:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r2.f9169G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            r2.getClass()
        L_0x00e8:
            r2.getClass()
            r7 = 1
            r2.E(r6, r0, r7)
            return
        L_0x00f0:
            h0.a r0 = r5.f86d
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            D7.b r1 = r0.f9370a
            boolean r1 = r1.B(r7)
            r2 = 3
            if (r1 == 0) goto L_0x00fe
            goto L_0x0148
        L_0x00fe:
            D7.b r1 = r0.f9370a
            boolean r1 = r1.M(r6, r7)
            r3 = 5
            if (r1 == 0) goto L_0x0119
            D7.b r1 = r0.f9370a
            boolean r7 = r1.E(r7, r8)
            if (r7 != 0) goto L_0x0117
            D7.b r7 = r0.f9370a
            boolean r7 = r7.D(r6)
            if (r7 == 0) goto L_0x0148
        L_0x0117:
            r2 = 5
            goto L_0x0148
        L_0x0119:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x012b
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x012b
            goto L_0x0117
        L_0x012b:
            int r7 = r6.getLeft()
            D7.b r8 = r0.f9370a
            int r8 = r8.q()
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            D7.b r1 = r0.f9370a
            int r1 = r1.r()
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x0117
        L_0x0148:
            r7 = 1
            r0.t(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.d.r(android.view.View, float, float):void");
    }

    public final boolean w(View view, int i) {
        WeakReference weakReference;
        View view2;
        switch (this.f85c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f86d;
                if (sideSheetBehavior.f9376h == 1 || (weakReference = sideSheetBehavior.f9383p) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f86d;
                int i8 = bottomSheetBehavior.f9174L;
                if (i8 == 1 || bottomSheetBehavior.f9190a0) {
                    return false;
                }
                if (i8 == 3 && bottomSheetBehavior.f9187Y == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.f9184V;
                    if (weakReference2 != null) {
                        view2 = (View) weakReference2.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f9183U;
                if (weakReference3 == null || weakReference3.get() != view) {
                    return false;
                }
                return true;
        }
    }
}
