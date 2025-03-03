package G5;

import android.content.DialogInterface;
import b3.C0528a;
import de.ozerov.fully.C0704h;
import de.ozerov.fully.C0711i0;
import de.ozerov.fully.C0717j0;
import de.ozerov.fully.C0772s2;
import de.ozerov.fully.C0807y1;
import de.ozerov.fully.V1;
import de.ozerov.fully.V4;
import java.util.HashMap;
import o.s1;

public final /* synthetic */ class h implements DialogInterface.OnCancelListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1694U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f1695V;

    public /* synthetic */ h(int i, Object obj) {
        this.f1694U = i;
        this.f1695V = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1694U) {
            case 0:
                ((i) this.f1695V).f1697a.finish();
                return;
            case 1:
                C0704h hVar = (C0704h) this.f1695V;
                if (hVar.f10680a != null && hVar.f10680a.isShowing()) {
                    hVar.f10680a.dismiss();
                    hVar.f10680a = null;
                    return;
                }
                return;
            case 2:
                C0711i0 i0Var = (C0711i0) this.f1695V;
                if (i0Var.f10701b != null && i0Var.f10701b.isShowing()) {
                    i0Var.f10701b.dismiss();
                    i0Var.f10701b = null;
                    ((C0717j0) i0Var.f10702c).f10741Z0 = null;
                    return;
                }
                return;
            case 3:
                C0772s2 s2Var = (C0772s2) ((s1) this.f1695V).f14074f;
                if (s2Var != null) {
                    s2Var.f10950a.cancel();
                    return;
                }
                return;
            case 4:
                ((C0528a) this.f1695V).c();
                return;
            case 5:
                C0711i0 i0Var2 = (C0711i0) this.f1695V;
                if (i0Var2.f10701b != null && i0Var2.f10701b.isShowing()) {
                    i0Var2.f10701b.dismiss();
                    i0Var2.f10701b = null;
                    return;
                }
                return;
            case 6:
                C0807y1 y1Var = (C0807y1) this.f1695V;
                if (y1Var.f11113b != null && y1Var.f11113b.isShowing()) {
                    y1Var.f11113b.dismiss();
                    y1Var.f11113b = null;
                    return;
                }
                return;
            case 7:
                C0807y1 y1Var2 = (C0807y1) this.f1695V;
                if (y1Var2.f11113b != null && y1Var2.f11113b.isShowing()) {
                    y1Var2.f11113b.dismiss();
                    y1Var2.f11113b = null;
                    return;
                }
                return;
            case 8:
                C0711i0 i0Var3 = (C0711i0) this.f1695V;
                if (i0Var3.f10701b != null && i0Var3.f10701b.isShowing()) {
                    i0Var3.f10701b.dismiss();
                    i0Var3.f10701b = null;
                    return;
                }
                return;
            default:
                V4 v4 = (V4) this.f1695V;
                long j7 = v4.f10451k;
                if (j7 != -1) {
                    HashMap hashMap = (HashMap) v4.f10453m.f3810W;
                    V1 v12 = (V1) hashMap.get(Long.valueOf(j7));
                    if (v12 != null && !v12.isCancelled()) {
                        v12.cancel(true);
                        hashMap.remove(Long.valueOf(j7));
                    }
                    v4.f10451k = -1;
                }
                v4.d();
                return;
        }
    }
}
