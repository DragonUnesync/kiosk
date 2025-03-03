package v;

import F.i;
import android.hardware.camera2.CameraManager;
import de.ozerov.fully.M2;
import u.C1474o;

public final class q extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final i f15864a;

    /* renamed from: b  reason: collision with root package name */
    public final C1474o f15865b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15866c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f15867d = false;

    public q(i iVar, C1474o oVar) {
        this.f15864a = iVar;
        this.f15865b = oVar;
    }

    public final void a() {
        synchronized (this.f15866c) {
            this.f15867d = true;
        }
    }

    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f15866c) {
            try {
                if (!this.f15867d) {
                    this.f15864a.execute(new M2(18, (Object) this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onCameraAvailable(String str) {
        synchronized (this.f15866c) {
            try {
                if (!this.f15867d) {
                    this.f15864a.execute(new p(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onCameraUnavailable(String str) {
        synchronized (this.f15866c) {
            try {
                if (!this.f15867d) {
                    this.f15864a.execute(new p(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
