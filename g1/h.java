package g1;

import M0.C0129q;
import N.e;
import N7.a;
import P0.l;
import P0.r;
import P0.z;
import Q0.g;
import f1.C0894g;
import f1.C0896i;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import p1.C1332b;
import p1.F;
import p1.G;
import p1.q;

public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11891a;

    /* renamed from: b  reason: collision with root package name */
    public G f11892b;

    /* renamed from: c  reason: collision with root package name */
    public long f11893c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f11894d;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11895f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11896g;

    public h(C0896i iVar) {
        this.f11891a = iVar;
    }

    public final void a(long j7, long j8) {
        this.f11893c = j7;
        this.f11894d = j8;
    }

    public final void b(r rVar, long j7, int i, boolean z) {
        boolean z6;
        r rVar2 = rVar;
        int i8 = i;
        l.k(this.f11892b);
        boolean z8 = false;
        if (!this.f11895f) {
            int i9 = rVar2.f3733b;
            if (rVar2.f3734c > 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            l.c("ID Header has insufficient data", z6);
            l.c("ID Header missing", rVar2.t(8, StandardCharsets.UTF_8).equals("OpusHead"));
            if (rVar.v() == 1) {
                z8 = true;
            }
            l.c("version number must always be 1", z8);
            rVar2.H(i9);
            ArrayList b8 = C1332b.b(rVar2.f3732a);
            C0129q a8 = this.f11891a.f11548c.a();
            a8.f3002p = b8;
            g.v(a8, this.f11892b);
            this.f11895f = true;
        } else if (!this.f11896g) {
            if (rVar2.f3734c >= 8) {
                z8 = true;
            }
            l.c("Comment Header has insufficient data", z8);
            l.c("Comment Header should follow ID Header", rVar2.t(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f11896g = true;
        } else {
            int a9 = C0894g.a(this.e);
            if (i8 != a9) {
                int i10 = z.f3748a;
                Locale locale = Locale.US;
                l.B("RtpOpusReader", e.v("Received RTP packet with unexpected sequence number. Expected: ", a9, "; received: ", i8, "."));
            }
            int a10 = rVar.a();
            this.f11892b.a(a10, rVar2);
            this.f11892b.e(a.x(this.f11894d, j7, this.f11893c, 48000), 1, a10, 0, (F) null);
        }
        this.e = i8;
    }

    public final void c(long j7) {
        this.f11893c = j7;
    }

    public final void d(q qVar, int i) {
        G q7 = qVar.q(i, 1);
        this.f11892b = q7;
        q7.c(this.f11891a.f11548c);
    }
}
