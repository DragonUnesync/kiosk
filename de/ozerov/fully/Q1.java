package de.ozerov.fully;

import D2.o;
import android.content.Context;
import android.util.Log;
import d4.k;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.C1216a;
import n2.a;
import o5.C1321a;
import o5.C1322b;

public final /* synthetic */ class Q1 implements C1216a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f10290a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f10291b;

    public /* synthetic */ Q1(Context context, k kVar) {
        this.f10290a = kVar;
        this.f10291b = context;
    }

    public final void a(o oVar) {
        k kVar = this.f10290a;
        kVar.getClass();
        Throwable th = (Throwable) oVar.f1138W;
        if (!(th instanceof C1322b)) {
            boolean z = th instanceof C1321a;
            AtomicBoolean atomicBoolean = (AtomicBoolean) kVar.f9766V;
            Context context = this.f10291b;
            if (z) {
                if (atomicBoolean.get()) {
                    oVar.i().l0(false);
                    return;
                }
                StringBuilder sb = new StringBuilder("Connect failed because of negative CONNACK with code ");
                C1321a aVar = (C1321a) th;
                sb.append(aVar.f14274V.a());
                Log.w("k", sb.toString());
                a.b1(context, "MQTT connection failed due to " + aVar.f14274V.a());
            } else if (th.getMessage() == null) {
            } else {
                if (atomicBoolean.get()) {
                    oVar.i().l0(false);
                    return;
                }
                Log.w("k", "MQTT connection failed due to " + th.getMessage());
                a.b1(context, "MQTT connection failed");
            }
        }
    }
}
