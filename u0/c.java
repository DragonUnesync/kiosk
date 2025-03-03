package U0;

import G3.d;
import H3.C0103u;
import M0.J;
import M0.Y;
import M1.a;
import P0.h;
import Q7.g;
import T5.K;
import T5.O;
import W5.e;
import Z0.q;
import android.graphics.Bitmap;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C;
import de.ozerov.fully.C0704h;
import f5.C0906d;
import g2.n;
import g2.o;
import g2.p;
import h1.C1059z;
import h1.V;
import h1.f0;
import i1.C1094g;
import java.io.IOException;

public final /* synthetic */ class c implements h, d, C, O, o, P0.c {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f5323U;

    public /* synthetic */ c(int i) {
        this.f5323U = i;
    }

    public static Bitmap d(int i, byte[] bArr) {
        try {
            return g.r(i, bArr);
        } catch (J e) {
            throw new Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e8) {
            throw new Exception(e8);
        }
    }

    private final void e() {
    }

    public void a(Object obj) {
        h hVar = (h) obj;
        switch (this.f5323U) {
            case 0:
                hVar.getClass();
                return;
            case 1:
                hVar.getClass();
                return;
            case 2:
                hVar.getClass();
                return;
            case 3:
                hVar.getClass();
                return;
            case 4:
                hVar.getClass();
                return;
            case 5:
                hVar.getClass();
                return;
            default:
                hVar.getClass();
                return;
        }
    }

    public void accept(Object obj) {
        ((V) obj).f12399b.getClass();
    }

    public Object apply(Object obj) {
        switch (this.f5323U) {
            case 7:
                return H3.O.r(Integer.valueOf(((C1094g) obj).f12673U));
            case 8:
                q qVar = (q) obj;
                qVar.a();
                f0 f0Var = qVar.f6882C0;
                return H3.O.m(C0103u.z(f0Var.f12470b, new c(27)));
            case 24:
                return ((p1.o) obj).c().getClass().getSimpleName();
            case 25:
                f0 j7 = ((C1059z) obj).j();
                return H3.O.m(C0103u.z(j7.f12470b, new c(27)));
            case 27:
                return Integer.valueOf(((Y) obj).f2887c);
            case 28:
                return Long.valueOf(((a) obj).f3065b);
            default:
                return Long.valueOf(((a) obj).f3066c);
        }
    }

    public void b(n nVar, p pVar, boolean z) {
        switch (this.f5323U) {
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                nVar.f(pVar);
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                nVar.g(pVar);
                return;
            case 21:
                nVar.e(pVar);
                return;
            case 22:
                nVar.c();
                return;
            default:
                nVar.d();
                return;
        }
    }

    public void c() {
        switch (this.f5323U) {
            case 12:
                return;
            case 13:
                int i = C0704h.e;
                return;
            default:
                return;
        }
    }

    public K newChannel() {
        switch (this.f5323U) {
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                return new e();
            default:
                return C0906d.a();
        }
    }
}
