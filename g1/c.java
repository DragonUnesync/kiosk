package g1;

import N.e;
import N7.a;
import P0.l;
import P0.r;
import P0.z;
import f1.C0894g;
import f1.C0896i;
import java.util.Locale;
import p1.F;
import p1.G;
import p1.q;

public final class c implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f11852h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11853a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11854b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11855c;

    /* renamed from: d  reason: collision with root package name */
    public G f11856d;
    public long e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f11857f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f11858g = -1;

    public c(C0896i iVar) {
        this.f11853a = iVar;
        String str = iVar.f11548c.f3036n;
        str.getClass();
        this.f11854b = "audio/amr-wb".equals(str);
        this.f11855c = iVar.f11547b;
    }

    public final void a(long j7, long j8) {
        this.e = j7;
        this.f11857f = j8;
    }

    public final void b(r rVar, long j7, int i8, boolean z) {
        boolean z6;
        String str;
        int i9;
        int a8;
        l.k(this.f11856d);
        int i10 = this.f11858g;
        if (!(i10 == -1 || i8 == (a8 = C0894g.a(i10)))) {
            int i11 = z.f3748a;
            Locale locale = Locale.US;
            l.B("RtpAmrReader", e.v("Received RTP packet with unexpected sequence number. Expected: ", a8, "; received: ", i8, "."));
        }
        boolean z8 = true;
        rVar.I(1);
        int f8 = (rVar.f() >> 3) & 15;
        if ((f8 < 0 || f8 > 8) && f8 != 15) {
            z6 = false;
        } else {
            z6 = true;
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z9 = this.f11854b;
        if (z9) {
            str = "WB";
        } else {
            str = "NB";
        }
        sb.append(str);
        sb.append(" frame type ");
        sb.append(f8);
        l.c(sb.toString(), z6);
        if (z9) {
            i9 = i[f8];
        } else {
            i9 = f11852h[f8];
        }
        int a9 = rVar.a();
        if (a9 != i9) {
            z8 = false;
        }
        l.c("compound payload not supported currently", z8);
        this.f11856d.a(a9, rVar);
        this.f11856d.e(a.x(this.f11857f, j7, this.e, this.f11855c), 1, a9, 0, (F) null);
        this.f11858g = i8;
    }

    public final void c(long j7) {
        this.e = j7;
    }

    public final void d(q qVar, int i8) {
        G q7 = qVar.q(i8, 1);
        this.f11856d = q7;
        q7.c(this.f11853a.f11548c);
    }
}
