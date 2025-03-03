package de.ozerov.fully;

import android.view.View;

/* renamed from: de.ozerov.fully.x4  reason: case insensitive filesystem */
public final /* synthetic */ class C0804x4 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f11096U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C4 f11097V;

    public /* synthetic */ C0804x4(C4 c42, int i) {
        this.f11096U = i;
        this.f11097V = c42;
    }

    public final void onClick(View view) {
        switch (this.f11096U) {
            case 0:
                C4 c42 = this.f11097V;
                c42.b();
                c42.f(3000);
                return;
            default:
                this.f11097V.f(3000);
                return;
        }
    }
}
