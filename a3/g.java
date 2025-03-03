package A3;

import A.d;
import C0.e;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import h0.C1026a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import v0.C1510H;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f89a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f90b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f91c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f92d;
    public final /* synthetic */ C1026a e;

    public g(SideSheetBehavior sideSheetBehavior) {
        this.e = sideSheetBehavior;
        this.f92d = new d(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.f92d;
        C1026a aVar = this.e;
        switch (this.f89a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar;
                WeakReference weakReference = sideSheetBehavior.f9383p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f90b = i;
                    if (!this.f91c) {
                        WeakHashMap weakHashMap = C1510H.f15874a;
                        ((View) sideSheetBehavior.f9383p.get()).postOnAnimation((d) runnable);
                        this.f91c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar;
                WeakReference weakReference2 = bottomSheetBehavior.f9183U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f90b = i;
                    if (!this.f91c) {
                        WeakHashMap weakHashMap2 = C1510H.f15874a;
                        ((View) bottomSheetBehavior.f9183U.get()).postOnAnimation((e) runnable);
                        this.f91c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g(BottomSheetBehavior bottomSheetBehavior) {
        this.e = bottomSheetBehavior;
        this.f92d = new e(21, this);
    }
}
