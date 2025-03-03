package de.ozerov.fully;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import n2.a;

/* renamed from: de.ozerov.fully.j  reason: case insensitive filesystem */
public final /* synthetic */ class C0716j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0740n f10729a;

    public /* synthetic */ C0716j(C0740n nVar) {
        this.f10729a = nVar;
    }

    public void a() {
        C0740n nVar = this.f10729a;
        nVar.d();
        a.b1(nVar.f10819a, "Failed playing media: " + nVar.f10830n);
        nVar.e();
    }

    public boolean b(int i, KeyEvent keyEvent) {
        C0740n nVar = this.f10729a;
        nVar.getClass();
        if (i == 4) {
            if (keyEvent.getAction() == 0) {
                return true;
            }
            if (keyEvent.getAction() == 1) {
                if (!nVar.f10835s && !nVar.f10836t) {
                    return true;
                }
                nVar.i();
                return true;
            }
        }
        return false;
    }

    public void c() {
        C0740n nVar = this.f10729a;
        nVar.d();
        ViewGroup viewGroup = nVar.f10822d;
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(0.0f);
        FrameLayout frameLayout = nVar.f10824g;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(0);
        frameLayout.animate().alpha(1.0f).setDuration((long) (nVar.f10840x / 2));
        new Handler().postDelayed(new C0722k(nVar, 2), (long) (nVar.f10840x / 2));
        W2 w2 = nVar.f10816F;
        if (w2 != null) {
            w2.run();
        }
    }
}
