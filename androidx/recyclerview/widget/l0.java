package androidx.recyclerview.widget;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import v0.C1529b;
import w0.C1576e;

public final class l0 extends C1529b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f8446d;
    public final k0 e;

    public l0(RecyclerView recyclerView) {
        this.f8446d = recyclerView;
        k0 k0Var = this.e;
        if (k0Var != null) {
            this.e = k0Var;
        } else {
            this.e = new k0(this);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f8446d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().f0(accessibilityEvent);
            }
        }
    }

    public final void d(View view, C1576e eVar) {
        this.f15919a.onInitializeAccessibilityNodeInfo(view, eVar.f16192a);
        RecyclerView recyclerView = this.f8446d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            Q layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f8309V;
            layoutManager.g0(recyclerView2.mRecycler, recyclerView2.mState, eVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            boolean r9 = super.g(r9, r10, r11)
            r11 = 1
            if (r9 == 0) goto L_0x0008
            return r11
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r9 = r8.f8446d
            boolean r0 = r9.hasPendingAdapterUpdates()
            r1 = 0
            if (r0 != 0) goto L_0x00b7
            androidx.recyclerview.widget.Q r0 = r9.getLayoutManager()
            if (r0 == 0) goto L_0x00b7
            androidx.recyclerview.widget.Q r9 = r9.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r9.f8309V
            androidx.recyclerview.widget.Z r0 = r0.mRecycler
            int r0 = r9.f8322i0
            int r2 = r9.f8321h0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r4 = r9.f8309V
            android.graphics.Matrix r4 = r4.getMatrix()
            boolean r4 = r4.isIdentity()
            if (r4 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r4 = r9.f8309V
            boolean r4 = r4.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L_0x0044
            int r0 = r3.height()
            int r2 = r3.width()
        L_0x0044:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r10 == r3) goto L_0x007e
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r10 == r3) goto L_0x004f
            r3 = 0
            r4 = 0
            goto L_0x00a7
        L_0x004f:
            androidx.recyclerview.widget.RecyclerView r10 = r9.f8309V
            r3 = -1
            boolean r10 = r10.canScrollVertically(r3)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.getPaddingTop()
            int r0 = r0 - r10
            int r10 = r9.getPaddingBottom()
            int r0 = r0 - r10
            int r10 = -r0
            goto L_0x0065
        L_0x0064:
            r10 = 0
        L_0x0065:
            androidx.recyclerview.widget.RecyclerView r0 = r9.f8309V
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L_0x007b
            int r0 = r9.getPaddingLeft()
            int r2 = r2 - r0
            int r0 = r9.getPaddingRight()
            int r2 = r2 - r0
            int r0 = -r2
        L_0x0078:
            r4 = r10
            r3 = r0
            goto L_0x00a7
        L_0x007b:
            r4 = r10
            r3 = 0
            goto L_0x00a7
        L_0x007e:
            androidx.recyclerview.widget.RecyclerView r10 = r9.f8309V
            boolean r10 = r10.canScrollVertically(r11)
            if (r10 == 0) goto L_0x0092
            int r10 = r9.getPaddingTop()
            int r0 = r0 - r10
            int r10 = r9.getPaddingBottom()
            int r0 = r0 - r10
            r10 = r0
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            androidx.recyclerview.widget.RecyclerView r0 = r9.f8309V
            boolean r0 = r0.canScrollHorizontally(r11)
            if (r0 == 0) goto L_0x007b
            int r0 = r9.getPaddingLeft()
            int r2 = r2 - r0
            int r0 = r9.getPaddingRight()
            int r0 = r2 - r0
            goto L_0x0078
        L_0x00a7:
            if (r4 != 0) goto L_0x00ad
            if (r3 != 0) goto L_0x00ad
            r11 = 0
            goto L_0x00b6
        L_0x00ad:
            androidx.recyclerview.widget.RecyclerView r2 = r9.f8309V
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            r2.smoothScrollBy(r3, r4, r5, r6, r7)
        L_0x00b6:
            return r11
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l0.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
