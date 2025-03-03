package u;

import A.f;
import B.j0;
import D.C0036c;
import D.C0041e0;
import D.C0053k0;
import D.U;
import N.e;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import q4.k;
import t.C1412a;
import x.C1594a;

/* renamed from: u.M  reason: case insensitive filesystem */
public final class C1453M extends C1484y {

    /* renamed from: b  reason: collision with root package name */
    public static final C1453M f15527b = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [u.M, java.lang.Object] */
    static {
        new k(28);
    }

    public final void a(U u3, j0 j0Var) {
        super.a(u3, j0Var);
        if (u3 instanceof U) {
            C0041e0 b8 = C0041e0.b();
            C0036c cVar = U.f854V;
            if (e.a(u3, cVar)) {
                int intValue = ((Integer) e.p(u3, cVar)).intValue();
                if (((ImageCapturePixelHDRPlusQuirk) C1594a.f16229a.j(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                    if (intValue == 0) {
                        CaptureRequest.Key a8 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b8.e(C1412a.i0(a8), Boolean.TRUE);
                    } else if (intValue == 1) {
                        CaptureRequest.Key a9 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b8.e(C1412a.i0(a9), Boolean.FALSE);
                    }
                }
            }
            j0Var.e(new f(1, (Object) C0053k0.a(b8)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
