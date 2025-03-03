package de.ozerov.fully;

import C3.k;
import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class E4 implements View.OnTouchListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9884U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ K4 f9885V;

    public /* synthetic */ E4(K4 k42, int i) {
        this.f9884U = i;
        this.f9885V = k42;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f9884U) {
            case 0:
                k kVar = this.f9885V.f10064n;
                if (kVar == null || !kVar.onTouch(view, motionEvent)) {
                    return false;
                }
                return true;
            default:
                K4 k42 = this.f9885V;
                C4 c42 = k42.f10054b;
                if (c42 != null && k42.f10059h) {
                    c42.f(3000);
                }
                k kVar2 = k42.f10064n;
                if (kVar2 == null || !kVar2.onTouch(view, motionEvent)) {
                    return false;
                }
                return true;
        }
    }
}
