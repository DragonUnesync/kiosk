package de.ozerov.fully;

import A.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class I2 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f10011b;

    public /* synthetic */ I2(e eVar, int i) {
        this.f10010a = i;
        this.f10011b = eVar;
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.f10010a) {
            case 0:
                this.f10011b.b();
                return;
            case 1:
                e eVar = this.f10011b;
                eVar.f11b = true;
                eVar.b();
                return;
            default:
                e eVar2 = this.f10011b;
                eVar2.f11b = false;
                eVar2.b();
                return;
        }
    }
}
