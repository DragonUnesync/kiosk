package de.ozerov.fully;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class K implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f10037a;

    public K(L l8) {
        this.f10037a = l8;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            L l8 = this.f10037a;
            l8.f10069d = ((J) iBinder).f10015b;
            l8.f10066a = true;
            l8.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10037a.f10066a = false;
    }
}
