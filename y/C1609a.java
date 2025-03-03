package y;

import D.s0;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import x.C1594a;

/* renamed from: y.a  reason: case insensitive filesystem */
public final class C1609a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16325a;

    public /* synthetic */ C1609a(Object obj) {
        this.f16325a = obj;
    }

    public C1609a(int i) {
        switch (i) {
            case 2:
                this.f16325a = (ExtraSupportedSurfaceCombinationsQuirk) C1594a.f16229a.j(ExtraSupportedSurfaceCombinationsQuirk.class);
                return;
            default:
                this.f16325a = (SmallDisplaySizeQuirk) C1594a.f16229a.j(SmallDisplaySizeQuirk.class);
                return;
        }
    }

    public C1609a(s0 s0Var, int i) {
        switch (i) {
            case 3:
                this.f16325a = (CaptureSessionOnClosedNotCalledQuirk) s0Var.j(CaptureSessionOnClosedNotCalledQuirk.class);
                return;
            default:
                AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) s0Var.j(AeFpsRangeLegacyQuirk.class);
                if (aeFpsRangeLegacyQuirk == null) {
                    this.f16325a = null;
                    return;
                } else {
                    this.f16325a = aeFpsRangeLegacyQuirk.f7611a;
                    return;
                }
        }
    }
}
