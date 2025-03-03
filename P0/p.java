package P0;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

public final class p extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final q f3723a;

    public p(q qVar) {
        this.f3723a = qVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z;
        int c8 = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (c8 == 3 || c8 == 4 || c8 == 5) {
            z = true;
        } else {
            z = false;
        }
        q qVar = this.f3723a;
        if (z) {
            i = 10;
        }
        q.b(i, qVar);
    }
}
