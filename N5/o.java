package N5;

import B.H;
import B.f0;
import D.C0071z;
import android.app.Service;
import android.view.OrientationEventListener;

public final class o extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public int f3427a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f3428b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(p pVar, Service service) {
        super(service);
        this.f3428b = pVar;
    }

    public final void onOrientationChanged(int i) {
        int i8;
        C0071z b8;
        if (i >= 45 && i < 135) {
            i8 = 3;
        } else if (i >= 135 && i < 225) {
            i8 = 2;
        } else if (i < 225 || i >= 315) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        if (i8 != this.f3427a) {
            p pVar = this.f3428b;
            H h5 = pVar.f3430A;
            if (h5.y(i8) && (b8 = h5.b()) != null) {
                h5.f148o.f169V = h5.g(b8, false);
            }
            f0 f0Var = pVar.f3460w;
            if (f0Var.y(i8)) {
                f0Var.D();
            }
            this.f3427a = i8;
        }
    }
}
