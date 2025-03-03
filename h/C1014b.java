package h;

import G.h;
import M.d;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import r0.C1371e;
import v.i;
import v0.C1519Q;
import v0.C1523V;

/* renamed from: h.b  reason: case insensitive filesystem */
public final class C1014b implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12159U = 1;

    /* renamed from: V  reason: collision with root package name */
    public Object f12160V;

    /* renamed from: W  reason: collision with root package name */
    public Object f12161W;

    /* renamed from: X  reason: collision with root package name */
    public Object f12162X;

    public /* synthetic */ C1014b() {
    }

    public final void run() {
        Object obj;
        switch (this.f12159U) {
            case 0:
                C1018f.b(((C1018f) this.f12162X).e, (View) this.f12160V, (View) this.f12161W);
                return;
            case 1:
                try {
                    obj = ((C1371e) this.f12160V).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f12162X).post(new h((d) this.f12161W, 8, obj));
                return;
            default:
                C1519Q.h((View) this.f12160V, (i) this.f12161W);
                ((ValueAnimator) this.f12162X).start();
                return;
        }
    }

    public C1014b(C1018f fVar, View view, View view2) {
        this.f12162X = fVar;
        this.f12160V = view;
        this.f12161W = view2;
    }

    public C1014b(View view, C1523V v4, i iVar, ValueAnimator valueAnimator) {
        this.f12160V = view;
        this.f12161W = iVar;
        this.f12162X = valueAnimator;
    }
}
