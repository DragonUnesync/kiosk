package androidx.fragment.app;

import P6.f;
import Q0.g;
import android.view.View;

/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0453d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7989U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0462m f7990V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ W f7991W;

    public /* synthetic */ C0453d(C0462m mVar, W w2, int i) {
        this.f7989U = i;
        this.f7990V = mVar;
        this.f7991W = w2;
    }

    public final void run() {
        switch (this.f7989U) {
            case 0:
                C0462m mVar = this.f7990V;
                f.e(mVar, "this$0");
                W w2 = this.f7991W;
                f.e(w2, "$operation");
                mVar.a(w2);
                return;
            case 1:
                C0462m mVar2 = this.f7990V;
                f.e(mVar2, "this$0");
                W w4 = this.f7991W;
                if (mVar2.f8009b.contains(w4)) {
                    int i = w4.f7944a;
                    View view = w4.f7946c.f8045A0;
                    f.d(view, "operation.fragment.mView");
                    g.b(i, view, mVar2.f8008a);
                    return;
                }
                return;
            default:
                C0462m mVar3 = this.f7990V;
                f.e(mVar3, "this$0");
                W w7 = this.f7991W;
                mVar3.f8009b.remove(w7);
                mVar3.f8010c.remove(w7);
                return;
        }
    }
}
