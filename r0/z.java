package R0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class z implements h {

    /* renamed from: U  reason: collision with root package name */
    public final h f4322U;

    /* renamed from: V  reason: collision with root package name */
    public long f4323V;

    /* renamed from: W  reason: collision with root package name */
    public Uri f4324W = Uri.EMPTY;

    public z(h hVar) {
        hVar.getClass();
        this.f4322U = hVar;
        Collections.emptyMap();
    }

    public final void close() {
        this.f4322U.close();
    }

    public final long f(l lVar) {
        h hVar = this.f4322U;
        this.f4324W = lVar.f4277a;
        Collections.emptyMap();
        try {
            return hVar.f(lVar);
        } finally {
            Uri p3 = hVar.p();
            if (p3 != null) {
                this.f4324W = p3;
            }
            hVar.j();
        }
    }

    public final Map j() {
        return this.f4322U.j();
    }

    public final void o(A a8) {
        a8.getClass();
        this.f4322U.o(a8);
    }

    public final Uri p() {
        return this.f4322U.p();
    }

    public final int x(byte[] bArr, int i, int i8) {
        int x8 = this.f4322U.x(bArr, i, i8);
        if (x8 != -1) {
            this.f4323V += (long) x8;
        }
        return x8;
    }
}
