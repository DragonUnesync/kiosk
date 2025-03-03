package Q7;

import B.q0;
import Q0.g;
import R7.a;
import R7.c;
import S7.h;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f4219c = Charset.forName("ISO-8859-1");

    /* renamed from: a  reason: collision with root package name */
    public d f4220a;

    /* renamed from: b  reason: collision with root package name */
    public e f4221b;

    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, Q7.f] */
    public final h a() {
        d dVar = this.f4220a;
        dVar.getClass();
        g.t(1, "method");
        dVar.f4198b = 1;
        e f8 = e.f(dVar, (e) null);
        this.f4221b = f8;
        g.D(f8);
        e eVar = this.f4221b;
        if (eVar.f4215k) {
            a aVar = eVar.f4212g;
            if (eVar.f4211f != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(eVar.f4211f.array(), 0, eVar.f4211f.limit());
                int i = a.f4348d0;
                a aVar2 = new a(new c(byteArrayInputStream), 0);
                eVar.f4216l = false;
                aVar = aVar2;
            }
            if (!eVar.f4216l) {
                g.D(aVar);
                eVar.f4216l = true;
                String str = eVar.i;
                String externalForm = eVar.f4197a.toExternalForm();
                d dVar2 = eVar.f4218n;
                q0 q0Var = dVar2.f4205j;
                try {
                    q0 a8 = b.a(aVar, str, externalForm, q0Var);
                    h c8 = b.c(a8, externalForm, q0Var);
                    ((a) a8.f301W).close();
                    ? obj = new Object();
                    obj.f4220a = dVar2;
                    obj.f4221b = eVar;
                    eVar.i = c8.f4553d0.f4548V.name();
                    eVar.g();
                    return c8;
                } catch (Throwable th) {
                    if (0 != 0) {
                        ((a) null.f301W).close();
                    }
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("Input stream already read and parsed, cannot re-read.");
            }
        } else {
            throw new IllegalArgumentException("Request must be executed (with .execute(), .get(), or .post() before parsing response");
        }
    }
}
