package de.ozerov.fully;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.u3  reason: case insensitive filesystem */
public final class C0785u3 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10997a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0797w3 f10998b;

    public /* synthetic */ C0785u3(C0797w3 w3Var, int i) {
        this.f10997a = i;
        this.f10998b = w3Var;
    }

    public final void onReceive(Context context, Intent intent) {
        C0797w3 w3Var = this.f10998b;
        switch (this.f10997a) {
            case 0:
                w3Var.f11044c = true;
                U0.e("onScreensaverStart", (HashMap) null);
                w3Var.f11042a.f9935X0.b0("onScreensaverStart", (JSONObject) null);
                return;
            default:
                w3Var.f11044c = false;
                U0.e("onScreensaverStop", (HashMap) null);
                w3Var.f11042a.f9935X0.b0("onScreensaverStop", (JSONObject) null);
                w3Var.a();
                return;
        }
    }
}
