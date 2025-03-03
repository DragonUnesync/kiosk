package A3;

import M0.C;
import M0.O;
import M0.X;
import N.e;
import P0.h;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import v0.C1510H;
import w0.C1586o;

public final /* synthetic */ class b implements C1586o, h {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f79U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f80V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f81W;

    public /* synthetic */ b(int i, int i8, Object obj) {
        this.f79U = i8;
        this.f81W = obj;
        this.f80V = i;
    }

    public void a(Object obj) {
        O o2 = (O) obj;
        switch (this.f79U) {
            case 1:
                X x8 = ((T0.X) this.f81W).f4749a;
                o2.b(this.f80V);
                return;
            default:
                o2.q((C) this.f81W, this.f80V);
                return;
        }
    }

    public boolean b(View view) {
        String str;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f81W;
        sideSheetBehavior.getClass();
        int i = this.f80V;
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            throw new IllegalArgumentException(e.A(sb, str, " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f9383p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i);
        } else {
            View view2 = (View) sideSheetBehavior.f9383p.get();
            c cVar = new c(i, 0, (Object) sideSheetBehavior);
            ViewParent parent = view2.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = C1510H.f15874a;
                if (view2.isAttachedToWindow()) {
                    view2.post(cVar);
                }
            }
            cVar.run();
        }
        return true;
    }
}
