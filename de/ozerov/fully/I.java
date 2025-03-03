package de.ozerov.fully;

import android.app.Service;
import android.os.Binder;

public abstract class I extends Service {

    /* renamed from: U  reason: collision with root package name */
    public J f10005U = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, de.ozerov.fully.J] */
    public final void onCreate() {
        super.onCreate();
        ? binder = new Binder();
        binder.f10015b = this;
        this.f10005U = binder;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f10005U.f10015b = null;
        this.f10005U = null;
    }
}
