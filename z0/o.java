package Z0;

import A1.b;
import A1.c;
import M0.C0122j;
import M0.C0129q;
import M0.I;
import M0.r;
import P0.l;
import Q0.g;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
import p1.E;
import p1.F;
import p1.G;

public final class o implements G {

    /* renamed from: f  reason: collision with root package name */
    public static final r f6871f;

    /* renamed from: g  reason: collision with root package name */
    public static final r f6872g;

    /* renamed from: a  reason: collision with root package name */
    public final G f6873a;

    /* renamed from: b  reason: collision with root package name */
    public final r f6874b;

    /* renamed from: c  reason: collision with root package name */
    public r f6875c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f6876d;
    public int e;

    static {
        C0129q qVar = new C0129q();
        qVar.f2999m = I.o("application/id3");
        f6871f = new r(qVar);
        C0129q qVar2 = new C0129q();
        qVar2.f2999m = I.o("application/x-emsg");
        f6872g = new r(qVar2);
    }

    public o(G g8, int i) {
        this.f6873a = g8;
        if (i == 1) {
            this.f6874b = f6871f;
        } else if (i == 3) {
            this.f6874b = f6872g;
        } else {
            throw new IllegalArgumentException(g.m(i, "Unknown metadataType: "));
        }
        this.f6876d = new byte[0];
        this.e = 0;
    }

    public final /* synthetic */ void a(int i, P0.r rVar) {
        E.c(this, rVar, i);
    }

    public final int b(C0122j jVar, int i, boolean z) {
        return d(jVar, i, z);
    }

    public final void c(r rVar) {
        this.f6875c = rVar;
        this.f6873a.c(this.f6874b);
    }

    public final int d(C0122j jVar, int i, boolean z) {
        int i8 = this.e + i;
        byte[] bArr = this.f6876d;
        if (bArr.length < i8) {
            this.f6876d = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        int x8 = jVar.x(this.f6876d, this.e, i);
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
        this.f6875c.getClass();
        int i10 = this.e - i9;
        P0.r rVar = new P0.r(Arrays.copyOfRange(this.f6876d, i10 - i8, i10));
        byte[] bArr = this.f6876d;
        System.arraycopy(bArr, i10, bArr, 0, i9);
        this.e = i9;
        String str = this.f6875c.f3036n;
        r rVar2 = this.f6874b;
        if (!Objects.equals(str, rVar2.f3036n)) {
            if ("application/x-emsg".equals(this.f6875c.f3036n)) {
                b H8 = c.H(rVar);
                r i11 = H8.i();
                String str2 = rVar2.f3036n;
                if (i11 == null || !Objects.equals(str2, i11.f3036n)) {
                    r i12 = H8.i();
                    l.B("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + i12);
                    return;
                }
                byte[] s8 = H8.s();
                s8.getClass();
                rVar = new P0.r(s8);
            } else {
                l.B("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f6875c.f3036n);
                return;
            }
        }
        int a8 = rVar.a();
        G g8 = this.f6873a;
        g8.a(a8, rVar);
        g8.e(j7, i, a8, 0, f8);
    }

    public final void f(P0.r rVar, int i, int i8) {
        int i9 = this.e + i;
        byte[] bArr = this.f6876d;
        if (bArr.length < i9) {
            this.f6876d = Arrays.copyOf(bArr, (i9 / 2) + i9);
        }
        rVar.g(this.f6876d, this.e, i);
        this.e += i;
    }
}
