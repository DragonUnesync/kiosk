package B;

import D.C0036c;
import D.C0041e0;
import D.C0053k0;
import D.L0;
import D.T;
import D.V;
import D.X;
import N5.l;
import P.a;
import P.b;
import android.util.Size;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public static final T f146a;

    /* JADX WARNING: type inference failed for: r3v0, types: [P.c, java.lang.Object] */
    static {
        Size size = new Size(640, 480);
        C0022x xVar = C0022x.f360d;
        a aVar = a.f3681a;
        Size size2 = L.a.f2674b;
        ? obj = new Object();
        obj.f3686a = size2;
        obj.f3687b = 1;
        b bVar = new b(aVar, obj, (l) null);
        E e = new E(0);
        C0036c cVar = X.f871n;
        C0041e0 e0Var = e.f145b;
        e0Var.e(cVar, size);
        e0Var.e(L0.f814w, 1);
        e0Var.e(X.i, 0);
        e0Var.e(X.f874q, bVar);
        if (xVar.equals(xVar)) {
            e0Var.e(V.f865h, xVar);
            f146a = new T(C0053k0.a(e0Var));
            return;
        }
        throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
    }
}
