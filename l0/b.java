package L0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final IntentFilter f2680a;

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastReceiver f2681b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2682c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2683d;

    public b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f2680a = intentFilter;
        this.f2681b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f2681b);
        sb.append(" filter=");
        sb.append(this.f2680a);
        if (this.f2683d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
