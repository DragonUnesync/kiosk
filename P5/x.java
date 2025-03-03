package P5;

import android.app.admin.DevicePolicyManager;
import de.ozerov.fully.DeviceOwnerReceiver;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.P;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3937U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0140c f3938V;

    public /* synthetic */ x(C0140c cVar, int i) {
        this.f3937U = i;
        this.f3938V = cVar;
    }

    public final void run() {
        switch (this.f3937U) {
            case 0:
                FullyActivity fullyActivity = this.f3938V.f3879b;
                P.K();
                return;
            default:
                C0140c cVar = this.f3938V;
                ((DevicePolicyManager) cVar.f3879b.getSystemService("device_policy")).reboot(DeviceOwnerReceiver.a(cVar.f3879b));
                return;
        }
    }
}
