package M1;

import M0.C0122j;
import M0.C0129q;
import M0.I;
import P0.l;
import P0.r;
import P0.z;
import Q0.g;
import java.io.EOFException;
import p1.E;
import p1.F;
import p1.G;

public final class n implements G {

    /* renamed from: a  reason: collision with root package name */
    public final G f3093a;

    /* renamed from: b  reason: collision with root package name */
    public final j f3094b;

    /* renamed from: c  reason: collision with root package name */
    public final r f3095c = new r();

    /* renamed from: d  reason: collision with root package name */
    public int f3096d = 0;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f3097f = z.f3752f;

    /* renamed from: g  reason: collision with root package name */
    public l f3098g;

    /* renamed from: h  reason: collision with root package name */
    public M0.r f3099h;

    public n(G g8, j jVar) {
        this.f3093a = g8;
        this.f3094b = jVar;
    }

    public final /* synthetic */ void a(int i, r rVar) {
        E.c(this, rVar, i);
    }

    public final int b(C0122j jVar, int i, boolean z) {
        return d(jVar, i, z);
    }

    public final void c(M0.r rVar) {
        boolean z;
        l lVar;
        rVar.f3036n.getClass();
        String str = rVar.f3036n;
        if (I.i(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        boolean equals = rVar.equals(this.f3099h);
        j jVar = this.f3094b;
        if (!equals) {
            this.f3099h = rVar;
            if (jVar.a(rVar)) {
                lVar = jVar.j(rVar);
            } else {
                lVar = null;
            }
            this.f3098g = lVar;
        }
        l lVar2 = this.f3098g;
        G g8 = this.f3093a;
        if (lVar2 == null) {
            g8.c(rVar);
            return;
        }
        C0129q a8 = rVar.a();
        a8.f2999m = I.o("application/x-media3-cues");
        a8.f2996j = str;
        a8.f3004r = Long.MAX_VALUE;
        a8.f2985H = jVar.o(rVar);
        g.v(a8, g8);
    }

    public final int d(C0122j jVar, int i, boolean z) {
        if (this.f3098g == null) {
            return this.f3093a.d(jVar, i, z);
        }
        g(i);
        int x8 = jVar.x(this.f3097f, this.e, i);
        if (x8 != -1) {
            this.e += x8;
            return x8;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void e(long j7, int i, int i8, int i9, F f8) {
        boolean z;
        if (this.f3098g == null) {
            this.f3093a.e(j7, i, i8, i9, f8);
            return;
        }
        if (f8 == null) {
            z = true;
        } else {
            z = false;
        }
        l.c("DRM on subtitles is not supported", z);
        int i10 = (this.e - i9) - i8;
        this.f3098g.D(this.f3097f, i10, i8, k.f3087c, new m(this, j7, i));
        int i11 = i10 + i8;
        this.f3096d = i11;
        if (i11 == this.e) {
            this.f3096d = 0;
            this.e = 0;
        }
    }

    public final void f(r rVar, int i, int i8) {
        if (this.f3098g == null) {
            this.f3093a.f(rVar, i, i8);
            return;
        }
        g(i);
        rVar.g(this.f3097f, this.e, i);
        this.e += i;
    }

    public final void g(int i) {
        byte[] bArr;
        int length = this.f3097f.length;
        int i8 = this.e;
        if (length - i8 < i) {
            int i9 = i8 - this.f3096d;
            int max = Math.max(i9 * 2, i + i9);
            byte[] bArr2 = this.f3097f;
            if (max <= bArr2.length) {
                bArr = bArr2;
            } else {
                bArr = new byte[max];
            }
            System.arraycopy(bArr2, this.f3096d, bArr, 0, i9);
            this.f3096d = 0;
            this.e = i9;
            this.f3097f = bArr;
        }
    }
}
