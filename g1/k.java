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
import java.util.Locale;
import p1.F;
import p1.G;
import p1.q;

public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11901a;

    /* renamed from: b  reason: collision with root package name */
    public G f11902b;

    /* renamed from: c  reason: collision with root package name */
    public long f11903c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public int f11904d = -1;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f11905f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f11906g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11907h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11908j;

    public k(C0896i iVar) {
        this.f11901a = iVar;
    }

    public final void a(long j7, long j8) {
        this.f11903c = j7;
        this.e = -1;
        this.f11906g = j8;
    }

    public final void b(r rVar, long j7, int i8, boolean z) {
        boolean z6;
        r rVar2 = rVar;
        int i9 = i8;
        l.k(this.f11902b);
        int v4 = rVar.v();
        if ((v4 & 16) == 16 && (v4 & 7) == 0) {
            if (this.f11907h && this.e > 0) {
                G g8 = this.f11902b;
                g8.getClass();
                long j8 = this.f11905f;
                boolean z8 = this.i;
                g8.e(j8, z8 ? 1 : 0, this.e, 0, (F) null);
                this.e = -1;
                this.f11905f = -9223372036854775807L;
                this.f11907h = false;
            }
            this.f11907h = true;
        } else if (this.f11907h) {
            int a8 = C0894g.a(this.f11904d);
            if (i9 < a8) {
                int i10 = z.f3748a;
                Locale locale = Locale.US;
                l.B("RtpVP8Reader", e.v("Received RTP packet with unexpected sequence number. Expected: ", a8, "; received: ", i9, ". Dropping packet."));
                return;
            }
        } else {
            l.B("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
            return;
        }
        if ((v4 & 128) != 0) {
            int v8 = rVar.v();
            if (!((v8 & 128) == 0 || (rVar.v() & 128) == 0)) {
                rVar2.I(1);
            }
            if ((v8 & 64) != 0) {
                rVar2.I(1);
            }
            if (!((v8 & 32) == 0 && (16 & v8) == 0)) {
                rVar2.I(1);
            }
        }
        if (this.e == -1 && this.f11907h) {
            if ((rVar.f() & 1) == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.i = z6;
        }
        if (!this.f11908j) {
            int i11 = rVar2.f3733b;
            rVar2.H(i11 + 6);
            int o2 = rVar.o() & 16383;
            int o8 = rVar.o() & 16383;
            rVar2.H(i11);
            M0.r rVar3 = this.f11901a.f11548c;
            if (!(o2 == rVar3.f3043u && o8 == rVar3.f3044v)) {
                G g9 = this.f11902b;
                C0129q a9 = rVar3.a();
                a9.f3006t = o2;
                a9.f3007u = o8;
                g.v(a9, g9);
            }
            this.f11908j = true;
        }
        int a10 = rVar.a();
        this.f11902b.a(a10, rVar2);
        int i12 = this.e;
        if (i12 == -1) {
            this.e = a10;
        } else {
            this.e = i12 + a10;
        }
        this.f11905f = a.x(this.f11906g, j7, this.f11903c, 90000);
        if (z) {
            G g10 = this.f11902b;
            g10.getClass();
            long j9 = this.f11905f;
            boolean z9 = this.i;
            g10.e(j9, z9 ? 1 : 0, this.e, 0, (F) null);
            this.e = -1;
            this.f11905f = -9223372036854775807L;
            this.f11907h = false;
        }
        this.f11904d = i9;
    }

    public final void c(long j7) {
        boolean z;
        if (this.f11903c == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        this.f11903c = j7;
    }

    public final void d(q qVar, int i8) {
        G q7 = qVar.q(i8, 2);
        this.f11902b = q7;
        q7.c(this.f11901a.f11548c);
    }
}
