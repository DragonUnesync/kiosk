package de.ozerov.fully.receiver;

import U.d;
import Z1.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d4.k;
import n2.a;

public class PackageReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && context != null) {
            intent.getAction();
            intent.getDataString();
            k kVar = new k(context, 1);
            if (!intent.getAction().equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                if (intent.getAction().equals("android.intent.action.PACKAGE_REPLACED") && intent.getDataString() != null) {
                    if (!intent.getDataString().contains("com.google.android.webview") && (!intent.getDataString().contains("com.android.chrome") || !a.z0())) {
                        return;
                    }
                } else {
                    return;
                }
            }
            c cVar = (c) kVar.f9767W;
            if (cVar.n("restartAfterUpdate", true) && cVar.n("isRunning", false)) {
                BootReceiver.b(context);
                d.h(context, "Software Upgrade", 0);
            }
        }
    }
}
