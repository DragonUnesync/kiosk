package androidx.fragment.app;

import E2.a;
import P6.f;
import R2.c;

/* renamed from: androidx.fragment.app.g  reason: case insensitive filesystem */
public final class C0456g extends a {

    /* renamed from: W  reason: collision with root package name */
    public final boolean f7997W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f7998X;

    /* renamed from: Y  reason: collision with root package name */
    public c f7999Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0456g(W w2, boolean z) {
        super(w2);
        f.e(w2, "operation");
        this.f7997W = z;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00e2 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e2 A[SYNTHETIC, Splitter:B:73:0x00e2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final R2.c p(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = r8.f7998X
            if (r0 == 0) goto L_0x0008
            R2.c r9 = r8.f7999Y
            goto L_0x0103
        L_0x0008:
            java.lang.Object r0 = r8.f1328V
            androidx.fragment.app.W r0 = (androidx.fragment.app.W) r0
            androidx.fragment.app.v r1 = r0.f7946c
            int r0 = r0.f7944a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 != r3) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            androidx.fragment.app.u r3 = r1.f8048D0
            if (r3 != 0) goto L_0x001e
            r5 = 0
            goto L_0x0020
        L_0x001e:
            int r5 = r3.f8039f
        L_0x0020:
            boolean r6 = r8.f7997W
            if (r6 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x002d
            if (r3 != 0) goto L_0x002a
        L_0x0028:
            r3 = 0
            goto L_0x0040
        L_0x002a:
            int r3 = r3.f8038d
            goto L_0x0040
        L_0x002d:
            if (r3 != 0) goto L_0x0030
            goto L_0x0028
        L_0x0030:
            int r3 = r3.e
            goto L_0x0040
        L_0x0033:
            if (r0 == 0) goto L_0x003b
            if (r3 != 0) goto L_0x0038
            goto L_0x0028
        L_0x0038:
            int r3 = r3.f8036b
            goto L_0x0040
        L_0x003b:
            if (r3 != 0) goto L_0x003e
            goto L_0x0028
        L_0x003e:
            int r3 = r3.f8037c
        L_0x0040:
            r1.M(r2, r2, r2, r2)
            android.view.ViewGroup r2 = r1.f8089z0
            r6 = 0
            if (r2 == 0) goto L_0x0056
            r7 = 2131362628(0x7f0a0344, float:1.8345042E38)
            java.lang.Object r2 = r2.getTag(r7)
            if (r2 == 0) goto L_0x0056
            android.view.ViewGroup r2 = r1.f8089z0
            r2.setTag(r7, r6)
        L_0x0056:
            android.view.ViewGroup r1 = r1.f8089z0
            if (r1 == 0) goto L_0x0063
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L_0x0063
        L_0x0060:
            r9 = r6
            goto L_0x00ff
        L_0x0063:
            if (r3 != 0) goto L_0x00c1
            if (r5 == 0) goto L_0x00c1
            r1 = 4097(0x1001, float:5.741E-42)
            if (r5 == r1) goto L_0x00b7
            r1 = 8194(0x2002, float:1.1482E-41)
            if (r5 == r1) goto L_0x00ad
            r1 = 8197(0x2005, float:1.1486E-41)
            if (r5 == r1) goto L_0x009b
            r1 = 4099(0x1003, float:5.744E-42)
            if (r5 == r1) goto L_0x0091
            r1 = 4100(0x1004, float:5.745E-42)
            if (r5 == r1) goto L_0x007e
            r0 = -1
            r3 = -1
            goto L_0x00c1
        L_0x007e:
            if (r0 == 0) goto L_0x0088
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
            int r0 = E.e.x(r9, r0)
            goto L_0x008f
        L_0x0088:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            int r0 = E.e.x(r9, r0)
        L_0x008f:
            r3 = r0
            goto L_0x00c1
        L_0x0091:
            if (r0 == 0) goto L_0x0097
            r0 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x008f
        L_0x0097:
            r0 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L_0x008f
        L_0x009b:
            if (r0 == 0) goto L_0x00a5
            r0 = 16842938(0x10100ba, float:2.369408E-38)
            int r0 = E.e.x(r9, r0)
            goto L_0x008f
        L_0x00a5:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            int r0 = E.e.x(r9, r0)
            goto L_0x008f
        L_0x00ad:
            if (r0 == 0) goto L_0x00b3
            r0 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x008f
        L_0x00b3:
            r0 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L_0x008f
        L_0x00b7:
            if (r0 == 0) goto L_0x00bd
            r0 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x008f
        L_0x00bd:
            r0 = 2130837512(0x7f020008, float:1.727998E38)
            goto L_0x008f
        L_0x00c1:
            if (r3 == 0) goto L_0x0060
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = r0.getResourceTypeName(r3)
            java.lang.String r1 = "anim"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e2
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r9, r3)     // Catch:{ NotFoundException -> 0x00e0, RuntimeException -> 0x00e2 }
            if (r1 == 0) goto L_0x0060
            R2.c r2 = new R2.c     // Catch:{ NotFoundException -> 0x00e0, RuntimeException -> 0x00e2 }
            r2.<init>((android.view.animation.Animation) r1)     // Catch:{ NotFoundException -> 0x00e0, RuntimeException -> 0x00e2 }
        L_0x00de:
            r9 = r2
            goto L_0x00ff
        L_0x00e0:
            r9 = move-exception
            throw r9
        L_0x00e2:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r9, r3)     // Catch:{ RuntimeException -> 0x00ee }
            if (r1 == 0) goto L_0x0060
            R2.c r2 = new R2.c     // Catch:{ RuntimeException -> 0x00ee }
            r2.<init>((android.animation.Animator) r1)     // Catch:{ RuntimeException -> 0x00ee }
            goto L_0x00de
        L_0x00ee:
            r1 = move-exception
            if (r0 != 0) goto L_0x00fe
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r3)
            if (r9 == 0) goto L_0x0060
            R2.c r0 = new R2.c
            r0.<init>((android.view.animation.Animation) r9)
            r9 = r0
            goto L_0x00ff
        L_0x00fe:
            throw r1
        L_0x00ff:
            r8.f7999Y = r9
            r8.f7998X = r4
        L_0x0103:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0456g.p(android.content.Context):R2.c");
    }
}
