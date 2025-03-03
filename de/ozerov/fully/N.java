package de.ozerov.fully;

import Z1.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import org.json.JSONObject;

public final class N extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ O f10147b;

    public /* synthetic */ N(O o2, int i) {
        this.f10146a = i;
        this.f10147b = o2;
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.f10146a) {
            case 0:
                O o2 = this.f10147b;
                if (o2.f10172b.W().booleanValue()) {
                    o2.f10171a.onUserInteraction();
                    return;
                }
                return;
            case 1:
                O o8 = this.f10147b;
                if (o8.f10172b.W().booleanValue()) {
                    o8.f10171a.onUserInteraction();
                    return;
                }
                return;
            case 2:
                this.f10147b.f10190v = false;
                return;
            case 3:
                this.f10147b.f10190v = true;
                return;
            case 4:
                this.f10147b.f10193y = false;
                return;
            case 5:
                this.f10147b.f10193y = true;
                return;
            case 6:
                O o9 = this.f10147b;
                o9.getClass();
                o9.f10171a.f9922K0.b();
                U0.e("foreground", (HashMap) null);
                o9.f10171a.f9935X0.b0("foreground", (JSONObject) null);
                return;
            default:
                O o10 = this.f10147b;
                o10.getClass();
                boolean n4 = ((c) o10.f10172b.f9767W).n("forceImmersive", false);
                FullyActivity fullyActivity = o10.f10171a;
                if (n4) {
                    fullyActivity.f9922K0.c();
                }
                U0.e("background", (HashMap) null);
                fullyActivity.f9935X0.b0("background", (JSONObject) null);
                return;
        }
    }
}
