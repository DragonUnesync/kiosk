package de.ozerov.fully;

import N5.e;
import Z1.c;
import android.content.Context;
import android.util.Base64;
import d4.k;
import java.util.Timer;

public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f10016a;

    /* renamed from: b  reason: collision with root package name */
    public Timer f10017b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Boolean f10018c = null;

    /* renamed from: d  reason: collision with root package name */
    public B3 f10019d;
    public B3 e;

    public J0(FullyActivity fullyActivity) {
        this.f10016a = fullyActivity;
    }

    public final void a() {
        Timer timer = this.f10017b;
        if (!(timer == null || timer == null)) {
            timer.cancel();
            this.f10017b.purge();
            this.f10017b = null;
        }
        this.f10017b = new Timer();
        k kVar = new k((Context) this.f10016a, 1);
        try {
            this.f10017b.schedule(new e(this, 2, ((c) kVar.f9767W).r("connectionTestPingIp", new String(Base64.decode("OC44LjguOA==", 2)))), 0, 10000);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
