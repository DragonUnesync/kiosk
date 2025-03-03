package y;

import D.C0061o0;
import D.s0;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import x.C1594a;

/* renamed from: y.b  reason: case insensitive filesystem */
public final class C1610b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16326a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16327b;

    public C1610b(s0 s0Var, int i) {
        boolean z;
        boolean z6;
        switch (i) {
            case 1:
                s0Var.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = s0Var.f949a.iterator();
                while (it.hasNext()) {
                    C0061o0 o0Var = (C0061o0) it.next();
                    if (CaptureIntentPreviewQuirk.class.isAssignableFrom(o0Var.getClass())) {
                        arrayList.add(o0Var);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        z = ((CaptureIntentPreviewQuirk) it2.next()).a() ? true : z;
                    } else {
                        z = false;
                    }
                }
                this.f16326a = z;
                this.f16327b = s0Var.h(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.f16326a = s0Var.h(ImageCaptureFailWithAutoFlashQuirk.class);
                if (C1594a.f16229a.j(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f16327b = z6;
                return;
        }
    }
}
