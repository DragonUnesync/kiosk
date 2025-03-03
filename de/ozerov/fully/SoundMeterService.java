package de.ozerov.fully;

import android.content.Intent;
import android.os.IBinder;

public class SoundMeterService extends I {

    /* renamed from: V  reason: collision with root package name */
    public L3 f10346V;

    public final void a(int i) {
        L3 l32 = this.f10346V;
        if (l32 != null) {
            l32.e = ((100 - i) * 32800) / 100;
            return;
        }
        synchronized (this) {
            try {
                L3 l33 = this.f10346V;
                if (l33 != null) {
                    l33.b();
                }
                L3 l34 = new L3(this);
                this.f10346V = l34;
                l34.e = ((100 - i) * 32800) / 100;
                if (!this.f10346V.a()) {
                    this.f10346V = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f10005U;
    }

    public final boolean onUnbind(Intent intent) {
        synchronized (this) {
            L3 l32 = this.f10346V;
            if (l32 != null) {
                l32.b();
                this.f10346V = null;
            }
        }
        return super.onUnbind(intent);
    }
}
