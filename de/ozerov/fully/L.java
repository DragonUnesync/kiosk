package de.ozerov.fully;

import android.content.Intent;
import android.util.Log;

public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10066a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Class f10067b;

    /* renamed from: c  reason: collision with root package name */
    public final FullyActivity f10068c;

    /* renamed from: d  reason: collision with root package name */
    public I f10069d;
    public final K e = new K(this);

    public L(FullyActivity fullyActivity, Class cls) {
        this.f10068c = fullyActivity;
        this.f10067b = cls;
    }

    public void a() {
    }

    public void b() {
        Class cls = this.f10067b;
        FullyActivity fullyActivity = this.f10068c;
        if (!this.f10066a) {
            try {
                fullyActivity.bindService(new Intent(fullyActivity, cls), this.e, 1);
            } catch (Exception e8) {
                Log.e("L", "Failed to start service " + cls.toString() + " due to " + e8.getMessage());
            }
        }
    }

    public void c() {
        if (this.f10066a) {
            this.f10068c.unbindService(this.e);
            this.f10069d = null;
            this.f10066a = false;
        }
    }
}
