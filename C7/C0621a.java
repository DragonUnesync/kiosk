package c7;

import C7.d;
import P6.f;
import Y6.p;
import Y6.r;
import Y6.u;
import d7.C0659d;
import d7.C0661f;
import java.io.IOException;

/* renamed from: c7.a  reason: case insensitive filesystem */
public final class C0621a implements p {

    /* renamed from: a  reason: collision with root package name */
    public static final C0621a f8896a = new Object();

    /* JADX WARNING: type inference failed for: r3v1, types: [Q5.a, java.lang.Object] */
    public final u a(C0661f fVar) {
        h hVar = fVar.f9772a;
        hVar.getClass();
        synchronized (hVar) {
            try {
                if (!hVar.f8934f0) {
                    throw new IllegalStateException("released");
                } else if (hVar.f8933e0) {
                    throw new IllegalStateException("Check failed.");
                } else if (hVar.f8932d0) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0625e eVar = hVar.f8929a0;
        f.b(eVar);
        r rVar = hVar.f8923U;
        f.e(rVar, "client");
        try {
            C0659d k8 = eVar.c(fVar.f9776f, fVar.f9777g, fVar.f9778h, rVar.f6701Z, !f.a((String) fVar.e.f733W, "GET")).k(rVar, fVar);
            f.e(hVar, "call");
            f.e(eVar, "finder");
            ? obj = new Object();
            obj.f4123b = hVar;
            obj.f4124c = eVar;
            obj.f4125d = k8;
            obj.e = k8.h();
            hVar.f8931c0 = obj;
            hVar.f8936h0 = obj;
            synchronized (hVar) {
                hVar.f8932d0 = true;
                hVar.f8933e0 = true;
            }
            if (!hVar.f8935g0) {
                return C0661f.a(fVar, 0, obj, (d) null, 61).b(fVar.e);
            }
            throw new IOException("Canceled");
        } catch (l e) {
            eVar.e(e.f8958V);
            throw e;
        } catch (IOException e8) {
            eVar.e(e8);
            throw new l(e8);
        }
    }
}
