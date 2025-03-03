package de.ozerov.fully.remoteadmin;

import P5.O;
import P5.P;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import de.ozerov.fully.I;
import java.util.Timer;
import org.altbeacon.beacon.service.RangedBeacon;

public class RemoteAdminService extends I {

    /* renamed from: V  reason: collision with root package name */
    public P f10934V;

    public final IBinder onBind(Intent intent) {
        P p3 = new P(this);
        this.f10934V = p3;
        p3.j();
        synchronized (p3) {
            try {
                O o2 = new O(0, p3);
                if (p3.f3869l != null) {
                    p3.q();
                }
                p3.f3869l = new Timer();
                p3.f3868k = new Handler();
                p3.f3869l.schedule(o2, RangedBeacon.DEFAULT_MAX_TRACKING_AGE, 10000);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return this.f10005U;
    }

    public final boolean onUnbind(Intent intent) {
        P p3 = this.f10934V;
        p3.q();
        p3.k();
        this.f10934V = null;
        return super.onUnbind(intent);
    }
}
