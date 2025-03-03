package A3;

import D.C0054l;
import D.N;
import K7.d;
import N5.p;
import P5.C0140c;
import Q0.g;
import T0.C0211c;
import T0.C0212d;
import T0.C0229v;
import T0.C0232y;
import T0.F;
import U0.b;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import de.ozerov.fully.g5;
import de.ozerov.fully.i5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l0.C1169b;
import u.Y;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f82U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f83V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f84W;

    public /* synthetic */ c(int i, int i8, Object obj) {
        this.f82U = i8;
        this.f84W = obj;
        this.f83V = i;
    }

    public final void run() {
        int i;
        switch (this.f82U) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f84W;
                View view = (View) sideSheetBehavior.f9383p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f83V, false);
                    return;
                }
                return;
            case 1:
                p pVar = (p) this.f84W;
                pVar.getClass();
                pVar.z.setText(d.a(this.f83V));
                return;
            case 2:
                i5 i5Var = ((C0140c) this.f84W).f3879b.f9917F0;
                ArrayList arrayList = i5Var.f10710c;
                if (!arrayList.isEmpty() && (i = this.f83V) >= 0 && i < arrayList.size()) {
                    i5Var.e((g5) arrayList.get(i));
                    return;
                }
                return;
            case 3:
                ((C0140c) this.f84W).f3879b.f9917F0.j(this.f83V);
                return;
            case 4:
                C0212d dVar = ((C0211c) this.f84W).f4782b;
                dVar.getClass();
                int i8 = this.f83V;
                if (i8 == -3 || i8 == -2) {
                    if (i8 != -2) {
                        dVar.b(4);
                        return;
                    }
                    C0229v vVar = dVar.f4793c;
                    if (vVar != null) {
                        C0232y yVar = vVar.f4905U;
                        yVar.V(0, 1, yVar.C());
                    }
                    dVar.b(3);
                    return;
                } else if (i8 == -1) {
                    C0229v vVar2 = dVar.f4793c;
                    if (vVar2 != null) {
                        C0232y yVar2 = vVar2.f4905U;
                        yVar2.V(-1, 2, yVar2.C());
                    }
                    dVar.a();
                    dVar.b(1);
                    return;
                } else if (i8 != 1) {
                    g.u(i8, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                } else {
                    dVar.b(2);
                    C0229v vVar3 = dVar.f4793c;
                    if (vVar3 != null) {
                        C0232y yVar3 = vVar3.f4905U;
                        yVar3.V(1, 1, yVar3.C());
                        return;
                    }
                    return;
                }
            case 5:
                F f8 = (F) this.f84W;
                int i9 = f8.f4638U[this.f83V].f4799V;
                U0.d dVar2 = f8.f4660r0;
                dVar2.L(dVar2.K(), 1033, new b(6));
                return;
            case 6:
                int i10 = this.f83V;
                ScrollView scrollView = (ScrollView) this.f84W;
                scrollView.smoothScrollTo(0, scrollView.findViewById(i10).getBottom());
                return;
            case 7:
                ((TextView) this.f84W).setText(d.a(this.f83V));
                return;
            case 8:
                ((C1169b) this.f84W).h(this.f83V);
                return;
            case 9:
                ((C0054l) this.f84W).a(this.f83V);
                return;
            default:
                int i11 = this.f83V;
                Iterator it = ((LinkedHashSet) this.f84W).iterator();
                while (it.hasNext()) {
                    Y y8 = (Y) it.next();
                    if (i11 == 5) {
                        synchronized (y8.f15581p) {
                            try {
                                if (y8.n() && y8.f15582q != null) {
                                    y8.l("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it2 = y8.f15582q.iterator();
                                    while (it2.hasNext()) {
                                        ((N) it2.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        y8.getClass();
                    }
                }
                return;
        }
    }

    public /* synthetic */ c(F f8, int i, boolean z) {
        this.f82U = 5;
        this.f84W = f8;
        this.f83V = i;
    }
}
