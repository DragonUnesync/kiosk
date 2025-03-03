package i1;

import M0.C0122j;
import M0.r;
import P0.z;
import p1.E;
import p1.F;
import p1.G;
import p1.n;

/* renamed from: i1.c  reason: case insensitive filesystem */
public final class C1090c implements G {

    /* renamed from: a  reason: collision with root package name */
    public final int f12643a;

    /* renamed from: b  reason: collision with root package name */
    public final r f12644b;

    /* renamed from: c  reason: collision with root package name */
    public final n f12645c = new n();

    /* renamed from: d  reason: collision with root package name */
    public r f12646d;
    public G e;

    /* renamed from: f  reason: collision with root package name */
    public long f12647f;

    public C1090c(int i, int i8, r rVar) {
        this.f12643a = i8;
        this.f12644b = rVar;
    }

    public final /* synthetic */ void a(int i, P0.r rVar) {
        E.c(this, rVar, i);
    }

    public final int b(C0122j jVar, int i, boolean z) {
        return d(jVar, i, z);
    }

    public final void c(r rVar) {
        r rVar2 = this.f12644b;
        if (rVar2 != null) {
            rVar = rVar.e(rVar2);
        }
        this.f12646d = rVar;
        G g8 = this.e;
        int i = z.f3748a;
        g8.c(rVar);
    }

    public final int d(C0122j jVar, int i, boolean z) {
        G g8 = this.e;
        int i8 = z.f3748a;
        return g8.b(jVar, i, z);
    }

    public final void e(long j7, int i, int i8, int i9, F f8) {
        long j8 = this.f12647f;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            this.e = this.f12645c;
        }
        G g8 = this.e;
        int i10 = z.f3748a;
        g8.e(j7, i, i8, i9, f8);
    }

    public final void f(P0.r rVar, int i, int i8) {
        G g8 = this.e;
        int i9 = z.f3748a;
        g8.a(i, rVar);
    }
}
