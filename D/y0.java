package D;

import A.f;
import A.h;
import B.C0022x;
import B.j0;
import C7.d;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import t.C1412a;
import u.C1446F;
import x.C1594a;
import y.C1612d;

public final class y0 extends x0 {
    /* JADX WARNING: type inference failed for: r0v2, types: [D.x0, D.y0] */
    public static y0 d(L0 l02, Size size) {
        if (l02.P() != null) {
            ? x0Var = new x0();
            C0 a02 = l02.a0();
            C0053k0 k0Var = C0053k0.f919W;
            int i = C0.a().f752g.f790c;
            if (a02 != null) {
                i = a02.f752g.f790c;
                for (CameraDevice.StateCallback stateCallback : a02.f749c) {
                    ArrayList arrayList = x0Var.f960c;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : a02.f750d) {
                    ArrayList arrayList2 = x0Var.f961d;
                    if (!arrayList2.contains(stateCallback2)) {
                        arrayList2.add(stateCallback2);
                    }
                }
                x0Var.f959b.a(a02.f752g.f791d);
                k0Var = a02.f752g.f789b;
            }
            j0 j0Var = x0Var.f959b;
            j0Var.getClass();
            j0Var.f267X = C0041e0.c(k0Var);
            if (l02 instanceof C0059n0) {
                Rational rational = C1612d.f16329a;
                if (((PreviewPixelHDRnetQuirk) C1594a.f16229a.j(PreviewPixelHDRnetQuirk.class)) != null && !C1612d.f16329a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    C0041e0 b8 = C0041e0.b();
                    b8.e(C1412a.i0(CaptureRequest.TONEMAP_MODE), 2);
                    x0Var.f959b.e(new f(1, (Object) C0053k0.a(b8)));
                }
            }
            x0Var.f959b.f264U = ((Integer) l02.o0(C1412a.f15159W, Integer.valueOf(i))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) l02.o0(C1412a.f15161Y, new CameraDevice.StateCallback());
            ArrayList arrayList3 = x0Var.f960c;
            if (!arrayList3.contains(stateCallback3)) {
                arrayList3.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) l02.o0(C1412a.f15162Z, new CameraCaptureSession.StateCallback());
            ArrayList arrayList4 = x0Var.f961d;
            if (!arrayList4.contains(stateCallback4)) {
                arrayList4.add(stateCallback4);
            }
            C1446F f8 = new C1446F((CameraCaptureSession.CaptureCallback) l02.o0(C1412a.f15163a0, new CameraCaptureSession.CaptureCallback()));
            x0Var.f959b.d(f8);
            ArrayList arrayList5 = x0Var.e;
            if (!arrayList5.contains(f8)) {
                arrayList5.add(f8);
            }
            int l8 = l02.l();
            if (l8 != 0) {
                j0 j0Var2 = x0Var.f959b;
                j0Var2.getClass();
                if (l8 != 0) {
                    ((C0041e0) j0Var2.f267X).e(L0.f809C, Integer.valueOf(l8));
                }
            }
            int B8 = l02.B();
            if (B8 != 0) {
                j0 j0Var3 = x0Var.f959b;
                j0Var3.getClass();
                if (B8 != 0) {
                    ((C0041e0) j0Var3.f267X).e(L0.f808B, Integer.valueOf(B8));
                }
            }
            C0041e0 b9 = C0041e0.b();
            C0036c cVar = C1412a.f15164b0;
            b9.e(cVar, (String) l02.o0(cVar, (Object) null));
            C0036c cVar2 = C1412a.f15160X;
            Long l9 = (Long) l02.o0(cVar2, -1L);
            l9.getClass();
            b9.e(cVar2, l9);
            x0Var.f959b.e(b9);
            x0Var.f959b.e(h.e(l02).c());
            return x0Var;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + l02.d0(l02.toString()));
    }

    public final void a(K k8) {
        this.f959b.e(k8);
    }

    public final void b(N n4, C0022x xVar, int i) {
        d a8 = C0044g.a(n4);
        if (xVar != null) {
            a8.f736Z = xVar;
            a8.f734X = Integer.valueOf(i);
            this.f958a.add(a8.b());
            ((HashSet) this.f959b.f266W).add(n4);
            return;
        }
        throw new NullPointerException("Null dynamicRange");
    }

    public final C0 c() {
        return new C0(new ArrayList(this.f958a), new ArrayList(this.f960c), new ArrayList(this.f961d), new ArrayList(this.e), this.f959b.f(), this.f962f, this.f963g, this.f964h);
    }
}
