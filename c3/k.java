package C3;

import android.os.Handler;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import de.ozerov.fully.C0717j0;
import de.ozerov.fully.C0722k;
import de.ozerov.fully.C0740n;
import de.ozerov.fully.C0779t3;
import de.ozerov.fully.X3;
import de.ozerov.fully.g5;
import n2.a;

public final /* synthetic */ class k implements View.OnTouchListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f594U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f595V;

    public /* synthetic */ k(int i, Object obj) {
        this.f594U = i;
        this.f595V = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        Object obj = this.f595V;
        switch (this.f594U) {
            case 0:
                n nVar = (n) obj;
                nVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - nVar.f607o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        nVar.f605m = false;
                    }
                    nVar.u();
                    nVar.f605m = true;
                    nVar.f607o = System.currentTimeMillis();
                }
                return false;
            case 1:
                C0740n nVar2 = (C0740n) obj;
                if (!nVar2.f10835s || nVar2.f10829m) {
                    return false;
                }
                nVar2.i();
                nVar2.f10829m = true;
                new Handler().postDelayed(new C0722k(nVar2, 0), 500);
                return true;
            case 2:
                C0717j0 j0Var = (C0717j0) obj;
                j0Var.getClass();
                if ((motionEvent.getFlags() & 1) == 0 && (2 & motionEvent.getFlags()) == 0) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    a.b1(j0Var.j(), "Overlays detected, please disable overlay apps");
                    Log.w("j0", "Overlays detected, please disable overlay apps");
                }
                return true;
            case 3:
                ((GestureDetector) obj).onTouchEvent(motionEvent);
                return true;
            case 4:
                ((C0779t3) obj).f10971R0.C();
                return true;
            case 5:
                d4.k kVar = (d4.k) obj;
                kVar.getClass();
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                X3 x32 = (X3) kVar.f9768X;
                if (x32 != null) {
                    x32.run();
                }
                return true;
            default:
                g5 g5Var = (g5) obj;
                if (!g5Var.f10673q || (!g5Var.f10671o && motionEvent.getAction() == 2)) {
                    return true;
                }
                Runnable runnable = g5Var.f10666j.f10726u;
                if (runnable == null) {
                    return false;
                }
                runnable.run();
                return false;
        }
    }
}
