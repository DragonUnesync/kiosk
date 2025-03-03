package androidx.recyclerview.widget;

import android.view.View;
import androidx.emoji2.text.f;

public final class B extends U {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f8264a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f8265b = new m0(this);

    /* renamed from: c  reason: collision with root package name */
    public C0514z f8266c;

    /* renamed from: d  reason: collision with root package name */
    public C0514z f8267d;

    public static int b(View view, f fVar) {
        return ((fVar.c(view) / 2) + fVar.e(view)) - ((fVar.l() / 2) + fVar.k());
    }

    public static View c(Q q7, f fVar) {
        int G8 = q7.G();
        View view = null;
        if (G8 == 0) {
            return null;
        }
        int l8 = (fVar.l() / 2) + fVar.k();
        int i = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < G8; i8++) {
            View F8 = q7.F(i8);
            int abs = Math.abs(((fVar.c(F8) / 2) + fVar.e(F8)) - l8);
            if (abs < i) {
                view = F8;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(Q q7, View view) {
        int[] iArr = new int[2];
        if (q7.o()) {
            iArr[0] = b(view, d(q7));
        } else {
            iArr[0] = 0;
        }
        if (q7.p()) {
            iArr[1] = b(view, e(q7));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final f d(Q q7) {
        C0514z zVar = this.f8267d;
        if (zVar == null || ((Q) zVar.f7786b) != q7) {
            this.f8267d = new C0514z(q7, 0);
        }
        return this.f8267d;
    }

    public final f e(Q q7) {
        C0514z zVar = this.f8266c;
        if (zVar == null || ((Q) zVar.f7786b) != q7) {
            this.f8266c = new C0514z(q7, 1);
        }
        return this.f8266c;
    }

    public final void f() {
        Q layoutManager;
        View view;
        RecyclerView recyclerView = this.f8264a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.p()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.o()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a8 = a(layoutManager, view);
                int i = a8[0];
                if (i != 0 || a8[1] != 0) {
                    this.f8264a.smoothScrollBy(i, a8[1]);
                }
            }
        }
    }
}
