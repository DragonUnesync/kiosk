package u;

import android.hardware.camera2.CameraManager;

/* renamed from: u.o  reason: case insensitive filesystem */
public final class C1474o extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final String f15672a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15673b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1479t f15674c;

    public C1474o(C1479t tVar, String str) {
        this.f15674c = tVar;
        this.f15672a = str;
    }

    public final void onCameraAvailable(String str) {
        if (this.f15672a.equals(str)) {
            this.f15673b = true;
            if (this.f15674c.f15685B0 == 4) {
                this.f15674c.K(false);
            }
        }
    }

    public final void onCameraUnavailable(String str) {
        if (this.f15672a.equals(str)) {
            this.f15673b = false;
        }
    }
}
