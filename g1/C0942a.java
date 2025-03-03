package g1;

import F.h;
import N1.f;
import N7.a;
import P0.r;
import P0.z;
import f1.C0896i;
import java.math.RoundingMode;
import p1.F;
import p1.G;
import p1.q;

/* renamed from: g1.a  reason: case insensitive filesystem */
public final class C0942a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11839a;

    /* renamed from: b  reason: collision with root package name */
    public final f f11840b = new f();

    /* renamed from: c  reason: collision with root package name */
    public final int f11841c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11842d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11843f;

    /* renamed from: g  reason: collision with root package name */
    public long f11844g;

    /* renamed from: h  reason: collision with root package name */
    public G f11845h;
    public long i;

    public C0942a(C0896i iVar) {
        this.f11839a = iVar;
        this.f11841c = iVar.f11547b;
        String str = (String) iVar.f11549d.get("mode");
        str.getClass();
        if (h.n(str, "AAC-hbr")) {
            this.f11842d = 13;
            this.e = 3;
        } else if (h.n(str, "AAC-lbr")) {
            this.f11842d = 6;
            this.e = 2;
        } else {
            throw new UnsupportedOperationException("AAC mode not supported");
        }
        this.f11843f = this.e + this.f11842d;
    }

    public final void a(long j7, long j8) {
        this.f11844g = j7;
        this.i = j8;
    }

    public final void b(r rVar, long j7, int i8, boolean z) {
        r rVar2 = rVar;
        this.f11845h.getClass();
        short s8 = rVar.s();
        int i9 = s8 / this.f11843f;
        long x8 = a.x(this.i, j7, this.f11844g, this.f11841c);
        f fVar = this.f11840b;
        fVar.q(rVar2);
        int i10 = this.e;
        int i11 = this.f11842d;
        if (i9 == 1) {
            int i12 = fVar.i(i11);
            fVar.u(i10);
            this.f11845h.a(rVar.a(), rVar2);
            if (z) {
                this.f11845h.e(x8, 1, i12, 0, (F) null);
                return;
            }
            return;
        }
        rVar2.I((s8 + 7) / 8);
        long j8 = x8;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = fVar.i(i11);
            fVar.u(i10);
            this.f11845h.a(i14, rVar2);
            this.f11845h.e(j8, 1, i14, 0, (F) null);
            j8 += z.W((long) i9, 1000000, (long) this.f11841c, RoundingMode.DOWN);
        }
    }

    public final void c(long j7) {
        this.f11844g = j7;
    }

    public final void d(q qVar, int i8) {
        G q7 = qVar.q(i8, 1);
        this.f11845h = q7;
        q7.c(this.f11839a.f11548c);
    }
}
