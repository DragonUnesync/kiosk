package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import de.ozerov.fully.K2;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1515M;
import v0.C1516N;
import v0.C1551x;

public final class r extends C1516N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12235b;

    public /* synthetic */ r(int i, Object obj) {
        this.f12234a = i;
        this.f12235b = obj;
    }

    public final void a() {
        Object obj = this.f12235b;
        switch (this.f12234a) {
            case 0:
                p pVar = (p) obj;
                pVar.f12231V.p0.setAlpha(1.0f);
                C1000A a8 = pVar.f12231V;
                a8.f12091s0.d((C1515M) null);
                a8.f12091s0 = null;
                return;
            case 1:
                C1000A a9 = (C1000A) obj;
                a9.p0.setAlpha(1.0f);
                a9.f12091s0.d((C1515M) null);
                a9.f12091s0 = null;
                return;
            default:
                K2 k22 = (K2) obj;
                ((C1000A) k22.f10051W).p0.setVisibility(8);
                C1000A a10 = (C1000A) k22.f10051W;
                PopupWindow popupWindow = a10.f12089q0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (a10.p0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    C1551x.c((View) a10.p0.getParent());
                }
                a10.p0.e();
                a10.f12091s0.d((C1515M) null);
                a10.f12091s0 = null;
                ViewGroup viewGroup = a10.f12093u0;
                WeakHashMap weakHashMap2 = C1510H.f15874a;
                C1551x.c(viewGroup);
                return;
        }
    }

    public void c() {
        Object obj = this.f12235b;
        switch (this.f12234a) {
            case 0:
                ((p) obj).f12231V.p0.setVisibility(0);
                return;
            case 1:
                C1000A a8 = (C1000A) obj;
                a8.p0.setVisibility(0);
                if (a8.p0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    C1551x.c((View) a8.p0.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
