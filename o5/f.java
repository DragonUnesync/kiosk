package O5;

import Z1.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import d4.k;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.P;
import de.ozerov.fully.U0;
import java.util.HashMap;
import n2.a;
import org.json.JSONObject;

public final class f extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f3673a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3674b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f3675c;

    public f(FullyActivity fullyActivity) {
        this.f3673a = fullyActivity;
        this.f3674b = new k((Context) fullyActivity, 1);
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        if (intent != null && intent.getAction() != null) {
            boolean equals = "android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction());
            FullyActivity fullyActivity = this.f3673a;
            k kVar = this.f3674b;
            if (equals) {
                P.f10238g = Boolean.TRUE;
                if (fullyActivity != null) {
                    fullyActivity.f9929R0.H();
                    fullyActivity.f9960y1.e(false, false);
                    U0.e("powerOn", (HashMap) null);
                    fullyActivity.f9935X0.b0("powerOn", (JSONObject) null);
                    if (((c) kVar.f9767W).n("wakeupOnPowerConnect", false)) {
                        C0794w0.K0(fullyActivity, kVar.Z().booleanValue());
                    }
                    c cVar = (c) kVar.f9767W;
                    if (cVar.n("sleepOnPowerConnect", false)) {
                        fullyActivity.f9944g1.d(1000);
                    } else if (cVar.n("screenOffOnPowerConnect", false)) {
                        new Handler().postDelayed(new e(this, 0), 1000);
                    }
                    if (cVar.n("ignoreMovementWhenPlugged", false)) {
                        fullyActivity.f9913C0.c();
                    }
                }
            }
            if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction())) {
                P.f10238g = Boolean.FALSE;
                if (fullyActivity != null) {
                    fullyActivity.f9929R0.H();
                    fullyActivity.f9960y1.e(false, false);
                    U0.e("powerOff", (HashMap) null);
                    fullyActivity.f9935X0.b0("powerOff", (JSONObject) null);
                    boolean n4 = ((c) kVar.f9767W).n("sleepOnPowerDisconnect", false);
                    c cVar2 = (c) kVar.f9767W;
                    if (n4) {
                        Handler handler = this.f3675c;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages((Object) null);
                        }
                        Handler handler2 = new Handler();
                        this.f3675c = handler2;
                        e eVar = new e(this, 1);
                        try {
                            i = Integer.parseInt(cVar2.r("sleepOnPowerDisconnectDelay", "0"));
                        } catch (Exception unused) {
                            i = 0;
                        }
                        handler2.postDelayed(eVar, (long) i);
                    }
                    if (kVar.t2() > 0) {
                        a.b1(context, "Shutdown in " + kVar.t2() + " seconds...");
                        new Handler().postDelayed(new e(this, context), (long) (kVar.t2() * 1000));
                    }
                    if (cVar2.n("movementWhenUnplugged", false)) {
                        fullyActivity.f9946i1.g("unplug");
                    }
                    if (cVar2.n("setVolumeLevelsOnPowerDisconnect", false)) {
                        C0794w0.E0(fullyActivity, cVar2.r("volumeLevels", ""));
                    }
                }
            }
        }
    }
}
