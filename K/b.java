package K;

import A.f;
import B.j0;
import D.C0041e0;
import D.C0053k0;
import D.I;
import D.N;
import J.a;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.C1412a;
import x.C1594a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2535a;

    public b(int i) {
        boolean z;
        boolean z6;
        boolean z8;
        switch (i) {
            case 4:
                if (((StillCaptureFlashStopRepeatingQuirk) C1594a.f16229a.j(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f2535a = z;
                return;
            case 5:
                if (C1594a.f16229a.j(TorchIsClosedAfterImageCapturingQuirk.class) != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f2535a = z6;
                return;
            default:
                if (a.f2336a.j(SurfaceOrderQuirk.class) != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f2535a = z8;
                return;
        }
    }

    public static I c(I i) {
        j0 j0Var = new j0();
        j0Var.f264U = i.f790c;
        for (N add : DesugarCollections.unmodifiableList(i.f788a)) {
            ((HashSet) j0Var.f266W).add(add);
        }
        j0Var.e(i.f789b);
        C0041e0 b8 = C0041e0.b();
        b8.e(C1412a.i0(CaptureRequest.FLASH_MODE), 0);
        j0Var.e(new f(1, (Object) C0053k0.a(b8)));
        return j0Var.f();
    }

    public synchronized void a() {
        while (!this.f2535a) {
            wait();
        }
    }

    public synchronized void b() {
        this.f2535a = false;
    }

    public boolean d(ArrayList arrayList, boolean z) {
        if (!this.f2535a || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean e() {
        if (this.f2535a) {
            return false;
        }
        this.f2535a = true;
        notifyAll();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(java.util.ArrayList r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f2535a
            r1 = 0
            if (r0 == 0) goto L_0x002c
            if (r4 != 0) goto L_0x0008
            goto L_0x002c
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002c
            java.lang.Object r4 = r3.next()
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 2
            if (r4 == r0) goto L_0x002a
            r0 = 3
            if (r4 != r0) goto L_0x000c
        L_0x002a:
            r3 = 1
            return r3
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K.b.f(java.util.ArrayList, boolean):boolean");
    }
}
