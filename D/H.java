package D;

import A1.d;
import B.C0017s;
import F.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final C0017s f783a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C0033a0(2));
        f783a = new C0017s(linkedHashSet);
    }

    public static void a(Context context, d dVar, C0017s sVar) {
        Integer num;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT < 34 || F.f(context) == 0) {
            if (sVar != null) {
                try {
                    num = sVar.b();
                    if (num == null) {
                        h.I("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                        return;
                    }
                } catch (IllegalStateException e) {
                    h.m("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                    return;
                }
            } else {
                num = null;
            }
            h.j("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + num);
            PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera")) {
                    if (sVar != null) {
                        if (num.intValue() == 1) {
                        }
                    }
                    C0017s.f304c.c(dVar.A());
                    i = 1;
                }
            } catch (IllegalArgumentException e8) {
                illegalArgumentException = e8;
                h.J("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
            }
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                    if (sVar != null) {
                        if (num.intValue() == 0) {
                        }
                    }
                    C0017s.f303b.c(dVar.A());
                    i++;
                }
            } catch (IllegalArgumentException e9) {
                illegalArgumentException = e9;
                h.J("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
            }
            try {
                f783a.c(dVar.A());
                h.j("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
                i++;
            } catch (IllegalArgumentException unused) {
            }
            if (illegalArgumentException != null) {
                h.l("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + dVar.A());
                throw new G("Expected camera missing from device.", i, illegalArgumentException);
            }
            return;
        }
        LinkedHashSet A8 = dVar.A();
        if (!A8.isEmpty()) {
            h.j("CameraValidator", "Virtual device with ID: " + F.f(context) + " has " + A8.size() + " cameras. Skipping validation.");
            return;
        }
        throw new G("No cameras available", 0, (IllegalArgumentException) null);
    }
}
