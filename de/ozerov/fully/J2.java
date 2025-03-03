package de.ozerov.fully;

import U.p;
import Z1.c;
import android.content.Context;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.util.Log;
import d4.k;
import n2.a;

public final class J2 extends PhoneStateListener {

    /* renamed from: a  reason: collision with root package name */
    public int f10024a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K2 f10025b;

    public J2(K2 k22) {
        this.f10025b = k22;
    }

    public final void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        K2 k22 = this.f10025b;
        k kVar = new k((Context) (FullyActivity) k22.f10050V, 1);
        FullyActivity fullyActivity = (FullyActivity) k22.f10050V;
        c cVar = (c) kVar.f9767W;
        if (i != 1) {
            if (i == 2 && this.f10024a == 0 && cVar.n("disableOutgoingCalls", false) && kVar.c0().booleanValue() && fullyActivity.f9921J0.i()) {
                Log.w("K2", "Blocking outgoing call");
                a.b1(fullyActivity, "Outgoing call blocked");
                new Handler().postDelayed(new p(29, (Object) this), 500);
            }
        } else if (cVar.n("disableIncomingCalls", false) && kVar.c0().booleanValue() && fullyActivity.f9921J0.i()) {
            Log.w("K2", "Blocking incoming call");
            a.b1(fullyActivity, "Incoming call blocked");
            P.e(fullyActivity);
        }
        this.f10024a = i;
    }
}
