package f7;

import C6.g;
import O6.a;
import Z6.b;
import java.io.IOException;

public final class k implements a {

    /* renamed from: U  reason: collision with root package name */
    public final s f11728U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ o f11729V;

    public k(o oVar, s sVar) {
        this.f11729V = oVar;
        this.f11728U = sVar;
    }

    public final Object invoke() {
        o oVar = this.f11729V;
        s sVar = this.f11728U;
        try {
            if (sVar.k(true, this)) {
                do {
                } while (sVar.k(false, this));
                oVar.k(1, 9, (IOException) null);
                b.c(sVar);
                return g.f721c;
            }
            throw new IOException("Required SETTINGS preface not received");
        } catch (IOException e) {
            oVar.k(2, 2, e);
        } catch (Throwable th) {
            oVar.k(3, 3, (IOException) null);
            b.c(sVar);
            throw th;
        }
    }
}
