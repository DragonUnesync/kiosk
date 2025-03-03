package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.emoji2.text.h;
import androidx.recyclerview.widget.RecyclerView;

public final class k<S> extends t {

    /* renamed from: Q0  reason: collision with root package name */
    public int f9292Q0;

    /* renamed from: R0  reason: collision with root package name */
    public b f9293R0;

    /* renamed from: S0  reason: collision with root package name */
    public o f9294S0;

    /* renamed from: T0  reason: collision with root package name */
    public int f9295T0;

    /* renamed from: U0  reason: collision with root package name */
    public c f9296U0;

    /* renamed from: V0  reason: collision with root package name */
    public RecyclerView f9297V0;

    /* renamed from: W0  reason: collision with root package name */
    public RecyclerView f9298W0;

    /* renamed from: X0  reason: collision with root package name */
    public View f9299X0;

    /* renamed from: Y0  reason: collision with root package name */
    public View f9300Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public View f9301Z0;

    /* renamed from: a1  reason: collision with root package name */
    public View f9302a1;

    public final void E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f9292Q0);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9293R0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9294S0);
    }

    public final void O(o oVar) {
        boolean z;
        s sVar = (s) this.f9298W0.getAdapter();
        int x8 = sVar.f9345a.f9268U.x(oVar);
        int x9 = x8 - sVar.f9345a.f9268U.x(this.f9294S0);
        boolean z6 = false;
        if (Math.abs(x9) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (x9 > 0) {
            z6 = true;
        }
        this.f9294S0 = oVar;
        if (z && z6) {
            this.f9298W0.scrollToPosition(x8 - 3);
            this.f9298W0.post(new h(x8, 1, (Object) this));
        } else if (z) {
            this.f9298W0.scrollToPosition(x8 + 3);
            this.f9298W0.post(new h(x8, 1, (Object) this));
        } else {
            this.f9298W0.post(new h(x8, 1, (Object) this));
        }
    }

    public final void P(int i) {
        this.f9295T0 = i;
        if (i == 2) {
            this.f9297V0.getLayoutManager().B0(this.f9294S0.f9331W - ((y) this.f9297V0.getAdapter()).f9351a.f9293R0.f9268U.f9331W);
            this.f9301Z0.setVisibility(0);
            this.f9302a1.setVisibility(8);
            this.f9299X0.setVisibility(8);
            this.f9300Y0.setVisibility(8);
        } else if (i == 1) {
            this.f9301Z0.setVisibility(8);
            this.f9302a1.setVisibility(0);
            this.f9299X0.setVisibility(0);
            this.f9300Y0.setVisibility(0);
            O(this.f9294S0);
        }
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        if (bundle == null) {
            bundle = this.f8064Z;
        }
        this.f9292Q0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.f9293R0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f9294S0 = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0191, code lost:
        r13 = new androidx.recyclerview.widget.B();
        r0 = r10.f9298W0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View y(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.j()
            int r1 = r10.f9292Q0
            r13.<init>(r0, r1)
            com.google.android.material.datepicker.c r0 = new com.google.android.material.datepicker.c
            r0.<init>(r13)
            r10.f9296U0 = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            com.google.android.material.datepicker.b r0 = r10.f9293R0
            com.google.android.material.datepicker.o r0 = r0.f9268U
            r1 = 16843277(0x101020d, float:2.369503E-38)
            boolean r2 = com.google.android.material.datepicker.m.U(r13, r1)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002a
            r2 = 2131558542(0x7f0d008e, float:1.8742403E38)
            r5 = 1
            goto L_0x002e
        L_0x002a:
            r2 = 2131558537(0x7f0d0089, float:1.8742393E38)
            r5 = 0
        L_0x002e:
            android.view.View r11 = r11.inflate(r2, r12, r4)
            android.content.Context r12 = r10.K()
            android.content.res.Resources r12 = r12.getResources()
            r2 = 2131165878(0x7f0702b6, float:1.7945986E38)
            int r2 = r12.getDimensionPixelSize(r2)
            r6 = 2131165879(0x7f0702b7, float:1.7945988E38)
            int r6 = r12.getDimensionPixelOffset(r6)
            int r6 = r6 + r2
            r2 = 2131165877(0x7f0702b5, float:1.7945984E38)
            int r2 = r12.getDimensionPixelOffset(r2)
            int r2 = r2 + r6
            r6 = 2131165862(0x7f0702a6, float:1.7945953E38)
            int r6 = r12.getDimensionPixelSize(r6)
            int r7 = com.google.android.material.datepicker.p.f9336X
            r8 = 2131165857(0x7f0702a1, float:1.7945943E38)
            int r8 = r12.getDimensionPixelSize(r8)
            int r8 = r8 * r7
            int r7 = r7 - r3
            r9 = 2131165876(0x7f0702b4, float:1.7945981E38)
            int r9 = r12.getDimensionPixelOffset(r9)
            int r9 = r9 * r7
            int r9 = r9 + r8
            r7 = 2131165854(0x7f07029e, float:1.7945937E38)
            int r12 = r12.getDimensionPixelOffset(r7)
            int r2 = r2 + r6
            int r2 = r2 + r9
            int r2 = r2 + r12
            r11.setMinimumHeight(r2)
            r12 = 2131362275(0x7f0a01e3, float:1.8344326E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            com.google.android.material.datepicker.g r2 = new com.google.android.material.datepicker.g
            r6 = 0
            r2.<init>(r6)
            v0.C1510H.p(r12, r2)
            com.google.android.material.datepicker.b r2 = r10.f9293R0
            int r2 = r2.f9272Y
            com.google.android.material.datepicker.e r6 = new com.google.android.material.datepicker.e
            if (r2 <= 0) goto L_0x0099
            r6.<init>(r2)
            goto L_0x009c
        L_0x0099:
            r6.<init>()
        L_0x009c:
            r12.setAdapter(r6)
            int r0 = r0.f9332X
            r12.setNumColumns(r0)
            r12.setEnabled(r4)
            r12 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.f9298W0 = r12
            com.google.android.material.datepicker.h r12 = new com.google.android.material.datepicker.h
            r12.<init>(r10, r5, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9298W0
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f9298W0
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r0)
            com.google.android.material.datepicker.s r12 = new com.google.android.material.datepicker.s
            com.google.android.material.datepicker.b r0 = r10.f9293R0
            Z1.c r2 = new Z1.c
            r4 = 9
            r2.<init>((int) r4, (java.lang.Object) r10)
            r12.<init>(r13, r0, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9298W0
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            r2 = 2131427381(0x7f0b0035, float:1.8476377E38)
            int r0 = r0.getInteger(r2)
            r2 = 2131362281(0x7f0a01e9, float:1.8344338E38)
            android.view.View r4 = r11.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r10.f9297V0 = r4
            if (r4 == 0) goto L_0x010f
            r4.setHasFixedSize(r3)
            androidx.recyclerview.widget.RecyclerView r4 = r10.f9297V0
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>(r0)
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9297V0
            com.google.android.material.datepicker.y r4 = new com.google.android.material.datepicker.y
            r4.<init>(r10)
            r0.setAdapter(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9297V0
            com.google.android.material.datepicker.i r4 = new com.google.android.material.datepicker.i
            r4.<init>(r10)
            r0.addItemDecoration(r4)
        L_0x010f:
            r0 = 2131362268(0x7f0a01dc, float:1.8344312E38)
            android.view.View r4 = r11.findViewById(r0)
            if (r4 == 0) goto L_0x018b
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r4 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r4)
            B3.g r4 = new B3.g
            r5 = 1
            r4.<init>(r5, r10)
            v0.C1510H.p(r0, r4)
            r4 = 2131362270(0x7f0a01de, float:1.8344316E38)
            android.view.View r4 = r11.findViewById(r4)
            r10.f9299X0 = r4
            java.lang.String r5 = "NAVIGATION_PREV_TAG"
            r4.setTag(r5)
            r4 = 2131362269(0x7f0a01dd, float:1.8344314E38)
            android.view.View r4 = r11.findViewById(r4)
            r10.f9300Y0 = r4
            java.lang.String r5 = "NAVIGATION_NEXT_TAG"
            r4.setTag(r5)
            android.view.View r2 = r11.findViewById(r2)
            r10.f9301Z0 = r2
            r2 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            android.view.View r2 = r11.findViewById(r2)
            r10.f9302a1 = r2
            r10.P(r3)
            com.google.android.material.datepicker.o r2 = r10.f9294S0
            java.lang.String r2 = r2.w()
            r0.setText(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r10.f9298W0
            com.google.android.material.datepicker.j r3 = new com.google.android.material.datepicker.j
            r3.<init>(r10, r12, r0)
            r2.addOnScrollListener(r3)
            Y1.K r2 = new Y1.K
            r3 = 1
            r2.<init>(r3, r10)
            r0.setOnClickListener(r2)
            android.view.View r0 = r10.f9300Y0
            com.google.android.material.datepicker.f r2 = new com.google.android.material.datepicker.f
            r2.<init>(r10, r12, r3)
            r0.setOnClickListener(r2)
            android.view.View r0 = r10.f9299X0
            com.google.android.material.datepicker.f r2 = new com.google.android.material.datepicker.f
            r3 = 0
            r2.<init>(r10, r12, r3)
            r0.setOnClickListener(r2)
        L_0x018b:
            boolean r13 = com.google.android.material.datepicker.m.U(r13, r1)
            if (r13 != 0) goto L_0x01da
            androidx.recyclerview.widget.B r13 = new androidx.recyclerview.widget.B
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9298W0
            androidx.recyclerview.widget.RecyclerView r1 = r13.f8264a
            if (r1 != r0) goto L_0x019d
            goto L_0x01da
        L_0x019d:
            androidx.recyclerview.widget.m0 r2 = r13.f8265b
            if (r1 == 0) goto L_0x01aa
            r1.removeOnScrollListener(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r13.f8264a
            r3 = 0
            r1.setOnFlingListener(r3)
        L_0x01aa:
            r13.f8264a = r0
            if (r0 == 0) goto L_0x01da
            androidx.recyclerview.widget.U r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x01d2
            androidx.recyclerview.widget.RecyclerView r0 = r13.f8264a
            r0.addOnScrollListener(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f8264a
            r0.setOnFlingListener(r13)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r13.f8264a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r13.f()
            goto L_0x01da
        L_0x01d2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L_0x01da:
            androidx.recyclerview.widget.RecyclerView r13 = r10.f9298W0
            com.google.android.material.datepicker.o r0 = r10.f9294S0
            com.google.android.material.datepicker.b r12 = r12.f9345a
            com.google.android.material.datepicker.o r12 = r12.f9268U
            int r12 = r12.x(r0)
            r13.scrollToPosition(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f9298W0
            com.google.android.material.datepicker.g r13 = new com.google.android.material.datepicker.g
            r0 = 1
            r13.<init>(r0)
            v0.C1510H.p(r12, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.k.y(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
