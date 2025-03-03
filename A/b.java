package A;

import G.i;
import G5.g;
import H5.f;
import P0.z;
import P5.C0140c;
import Q3.a;
import T0.C0232y;
import T0.r;
import a0.j;
import android.os.Handler;
import androidx.camera.lifecycle.c;
import com.bumptech.glide.d;
import org.altbeacon.beacon.BeaconManager;
import u.C1467h;
import u.C1479t;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ boolean f3V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f4W;

    public /* synthetic */ b(Object obj, boolean z, int i) {
        this.f2U = i;
        this.f4W = obj;
        this.f3V = z;
    }

    public final void run() {
        switch (this.f2U) {
            case 0:
                e eVar = (e) this.f4W;
                boolean z = eVar.f10a;
                boolean z6 = this.f3V;
                if (z != z6) {
                    eVar.f10a = z6;
                    if (!z6) {
                        Exception exc = new Exception("The camera control has became inactive.");
                        j jVar = (j) eVar.f15g;
                        if (jVar != null) {
                            jVar.b(exc);
                            eVar.f15g = null;
                            return;
                        }
                        return;
                    } else if (eVar.f11b) {
                        C1467h hVar = (C1467h) eVar.f12c;
                        hVar.getClass();
                        i.d(d.i(new c(17, hVar))).d(new d(0, eVar), (F.i) eVar.f13d);
                        eVar.f11b = false;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((f) this.f4W).f2178c.e(this.f3V);
                return;
            case 2:
                ((C0140c) this.f4W).f3879b.f9933V0.n(this.f3V, false, (Runnable) null);
                return;
            case 3:
                ((a) this.f4W).f4107a.e(this.f3V);
                return;
            case 4:
                Q3.f fVar = (Q3.f) ((N5.f) this.f4W).f3378b;
                fVar.f4113V = this.f3V;
                if (fVar.f4112U) {
                    ((Handler) fVar.f4116Y).removeCallbacksAndMessages((Object) null);
                    if (fVar.f4113V) {
                        ((Handler) fVar.f4116Y).postDelayed((g) fVar.f4117Z, BeaconManager.DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                V0.i iVar = (V0.i) this.f4W;
                iVar.getClass();
                int i = z.f3748a;
                C0232y yVar = iVar.f5528c.f4905U;
                boolean z8 = yVar.f4932U0;
                boolean z9 = this.f3V;
                if (z8 != z9) {
                    yVar.f4932U0 = z9;
                    yVar.f4952g0.e(23, new r(z9, 1));
                    return;
                }
                return;
            default:
                C1479t tVar = (C1479t) this.f4W;
                boolean z10 = this.f3V;
                tVar.f15713w0 = z10;
                if (z10 && tVar.f15685B0 == 4) {
                    tVar.J(false);
                    return;
                }
                return;
        }
    }
}
