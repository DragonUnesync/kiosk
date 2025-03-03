package V1;

import M0.C0129q;
import M0.I;
import P0.l;
import P0.r;
import Q0.g;
import java.util.Collections;
import java.util.List;
import p1.F;
import p1.G;
import p1.q;

/* renamed from: V1.h  reason: case insensitive filesystem */
public final class C0349h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5783a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5784b;

    /* renamed from: c  reason: collision with root package name */
    public long f5785c;

    /* renamed from: d  reason: collision with root package name */
    public int f5786d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f5787f;

    /* renamed from: g  reason: collision with root package name */
    public Object f5788g;

    public C0349h(List list) {
        this.f5783a = 0;
        this.f5787f = list;
        this.f5788g = new G[list.size()];
        this.f5785c = -9223372036854775807L;
    }

    public final void a() {
        switch (this.f5783a) {
            case 0:
                this.f5784b = false;
                this.f5785c = -9223372036854775807L;
                return;
            default:
                this.f5784b = false;
                this.f5785c = -9223372036854775807L;
                return;
        }
    }

    public final void e(r rVar) {
        boolean z;
        boolean z6;
        switch (this.f5783a) {
            case 0:
                if (this.f5784b) {
                    if (this.f5786d == 2) {
                        if (rVar.a() == 0) {
                            z6 = false;
                        } else {
                            if (rVar.v() != 32) {
                                this.f5784b = false;
                            }
                            this.f5786d--;
                            z6 = this.f5784b;
                        }
                        if (!z6) {
                            return;
                        }
                    }
                    if (this.f5786d == 1) {
                        if (rVar.a() == 0) {
                            z = false;
                        } else {
                            if (rVar.v() != 0) {
                                this.f5784b = false;
                            }
                            this.f5786d--;
                            z = this.f5784b;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = rVar.f3733b;
                    int a8 = rVar.a();
                    for (G a9 : (G[]) this.f5788g) {
                        rVar.H(i);
                        a9.a(a8, rVar);
                    }
                    this.e += a8;
                    return;
                }
                return;
            default:
                l.k((G) this.f5788g);
                if (this.f5784b) {
                    int a10 = rVar.a();
                    int i8 = this.e;
                    if (i8 < 10) {
                        int min = Math.min(a10, 10 - i8);
                        byte[] bArr = rVar.f3732a;
                        int i9 = rVar.f3733b;
                        r rVar2 = (r) this.f5787f;
                        System.arraycopy(bArr, i9, rVar2.f3732a, this.e, min);
                        if (this.e + min == 10) {
                            rVar2.H(0);
                            if (73 == rVar2.v() && 68 == rVar2.v() && 51 == rVar2.v()) {
                                rVar2.I(3);
                                this.f5786d = rVar2.u() + 10;
                            } else {
                                l.B("Id3Reader", "Discarding invalid ID3 tag");
                                this.f5784b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.f5786d - this.e);
                    ((G) this.f5788g).a(min2, rVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    public final void f(boolean z) {
        boolean z6;
        int i;
        boolean z8;
        switch (this.f5783a) {
            case 0:
                if (this.f5784b) {
                    if (this.f5785c != -9223372036854775807L) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    l.j(z6);
                    for (G e8 : (G[]) this.f5788g) {
                        e8.e(this.f5785c, 1, this.e, 0, (F) null);
                    }
                    this.f5784b = false;
                    return;
                }
                return;
            default:
                l.k((G) this.f5788g);
                if (this.f5784b && (i = this.f5786d) != 0 && this.e == i) {
                    if (this.f5785c != -9223372036854775807L) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    l.j(z8);
                    ((G) this.f5788g).e(this.f5785c, 1, this.f5786d, 0, (F) null);
                    this.f5784b = false;
                    return;
                }
                return;
        }
    }

    public final void g(int i, long j7) {
        switch (this.f5783a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f5784b = true;
                    this.f5785c = j7;
                    this.e = 0;
                    this.f5786d = 2;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.f5784b = true;
                    this.f5785c = j7;
                    this.f5786d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public final void h(q qVar, G g8) {
        switch (this.f5783a) {
            case 0:
                int i = 0;
                while (true) {
                    G[] gArr = (G[]) this.f5788g;
                    if (i < gArr.length) {
                        F f8 = (F) ((List) this.f5787f).get(i);
                        g8.c();
                        g8.d();
                        G q7 = qVar.q(g8.f5716c, 3);
                        C0129q qVar2 = new C0129q();
                        g8.d();
                        qVar2.f2989a = (String) g8.e;
                        qVar2.f2999m = I.o("application/dvbsubs");
                        qVar2.f3002p = Collections.singletonList(f8.f5713b);
                        qVar2.f2992d = f8.f5712a;
                        g.v(qVar2, q7);
                        gArr[i] = q7;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                g8.c();
                g8.d();
                G q8 = qVar.q(g8.f5716c, 5);
                this.f5788g = q8;
                C0129q qVar3 = new C0129q();
                g8.d();
                qVar3.f2989a = (String) g8.e;
                qVar3.f2999m = I.o("application/id3");
                g.v(qVar3, q8);
                return;
        }
    }

    public C0349h() {
        this.f5783a = 1;
        this.f5787f = new r(10);
        this.f5785c = -9223372036854775807L;
    }
}
