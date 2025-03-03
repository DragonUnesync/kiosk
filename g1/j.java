package g1;

import N.e;
import N7.a;
import P0.r;
import P0.z;
import android.util.Log;
import f1.C0894g;
import f1.C0896i;
import java.util.Locale;
import p1.F;
import p1.G;
import p1.q;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11897a;

    /* renamed from: b  reason: collision with root package name */
    public G f11898b;

    /* renamed from: c  reason: collision with root package name */
    public long f11899c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public long f11900d = 0;
    public int e = -1;

    public j(C0896i iVar) {
        this.f11897a = iVar;
    }

    public final void a(long j7, long j8) {
        this.f11899c = j7;
        this.f11900d = j8;
    }

    public final void b(r rVar, long j7, int i, boolean z) {
        int a8;
        int i8 = i;
        this.f11898b.getClass();
        int i9 = this.e;
        if (!(i9 == -1 || i8 == (a8 = C0894g.a(i9)))) {
            int i10 = z.f3748a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", e.v("Received RTP packet with unexpected sequence number. Expected: ", a8, "; received: ", i8, "."));
        }
        long x8 = a.x(this.f11900d, j7, this.f11899c, this.f11897a.f11547b);
        int a9 = rVar.a();
        this.f11898b.a(a9, rVar);
        this.f11898b.e(x8, 1, a9, 0, (F) null);
        this.e = i8;
    }

    public final void c(long j7) {
        this.f11899c = j7;
    }

    public final void d(q qVar, int i) {
        G q7 = qVar.q(i, 1);
        this.f11898b = q7;
        q7.c(this.f11897a.f11548c);
    }
}
