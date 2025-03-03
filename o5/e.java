package O5;

import android.content.Context;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.P;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3671U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ f f3672V;

    public /* synthetic */ e(f fVar, int i) {
        this.f3671U = i;
        this.f3672V = fVar;
    }

    public final void run() {
        switch (this.f3671U) {
            case 0:
                C0794w0.J0(this.f3672V.f3673a, true);
                return;
            case 1:
                f fVar = this.f3672V;
                FullyActivity fullyActivity = fVar.f3673a;
                if (fullyActivity.w() && !P.H(fullyActivity)) {
                    fullyActivity.f9944g1.d(1000);
                }
                fVar.f3675c = null;
                return;
            default:
                FullyActivity fullyActivity2 = this.f3672V.f3673a;
                if (fullyActivity2.w() && !P.H(fullyActivity2)) {
                    P.O();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e(f fVar, Context context) {
        this.f3671U = 2;
        this.f3672V = fVar;
    }
}
