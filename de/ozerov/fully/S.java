package de.ozerov.fully;

import P5.O;
import android.os.Bundle;
import java.util.Timer;
import org.altbeacon.beacon.service.RangedBeacon;

public final class S extends L {

    /* renamed from: f  reason: collision with root package name */
    public Timer f10323f;

    public final void a() {
        e(false, false);
    }

    public final void b() {
        super.b();
        synchronized (this) {
            d();
            this.f10323f = new Timer();
            try {
                this.f10323f.schedule(new O(3, this), 600000, 600000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void c() {
        d();
        super.c();
    }

    public final synchronized void d() {
        Timer timer = this.f10323f;
        if (timer != null) {
            timer.cancel();
            this.f10323f.purge();
            this.f10323f = null;
        }
    }

    public final void e(boolean z, boolean z6) {
        if (this.f10066a && this.f10068c.w() && this.f10068c.f9961z0.u().booleanValue() && this.f10068c.f9961z0.J1().booleanValue()) {
            CloudService cloudService = (CloudService) this.f10069d;
            Bundle E8 = this.f10068c.E();
            E8.putBoolean("onMovement", z);
            E8.putBoolean("highEmergency", z6);
            cloudService.f9844d0 = true;
            cloudService.f9846f0 = E8;
            boolean z8 = E8.getBoolean("onMovement", false);
            if (E8.getBoolean("highEmergency", false)) {
                cloudService.b();
                cloudService.f9840Z = System.currentTimeMillis();
            } else if (!z8 || cloudService.f9842b0 >= CloudService.f9834i0 || System.currentTimeMillis() - cloudService.f9841a0 <= RangedBeacon.DEFAULT_MAX_TRACKING_AGE) {
                long j7 = cloudService.f9842b0;
                long j8 = CloudService.f9834i0;
                if (j7 < j8 && System.currentTimeMillis() - cloudService.f9840Z > RangedBeacon.DEFAULT_MAX_TRACKING_AGE) {
                    cloudService.b();
                    cloudService.f9840Z = System.currentTimeMillis();
                } else if (cloudService.f9837W == null || (System.currentTimeMillis() - cloudService.f9839Y > j8 * 10 && cloudService.f9839Y != 0)) {
                    cloudService.b();
                }
            } else {
                cloudService.b();
                long currentTimeMillis = System.currentTimeMillis();
                cloudService.f9840Z = currentTimeMillis;
                cloudService.f9841a0 = currentTimeMillis;
            }
        }
    }
}
