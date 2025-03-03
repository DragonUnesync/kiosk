package Z0;

import B.q0;
import H3.M;
import H3.O;
import H3.i0;
import K1.i;
import M0.C0129q;
import M0.C0132u;
import M0.I;
import M0.J;
import P0.r;
import P0.w;
import P0.z;
import Q0.g;
import U1.j;
import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1.F;
import p1.G;
import p1.l;
import p1.o;
import p1.p;
import p1.q;
import p1.s;

public final class t implements o {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6938j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public final String f6939a;

    /* renamed from: b  reason: collision with root package name */
    public final w f6940b;

    /* renamed from: c  reason: collision with root package name */
    public final r f6941c = new r();

    /* renamed from: d  reason: collision with root package name */
    public final i f6942d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public q f6943f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f6944g = new byte[1024];

    /* renamed from: h  reason: collision with root package name */
    public int f6945h;

    public t(String str, w wVar, i iVar, boolean z) {
        this.f6939a = str;
        this.f6940b = wVar;
        this.f6942d = iVar;
        this.e = z;
    }

    public final void a(long j7, long j8) {
        throw new IllegalStateException();
    }

    public final G b(long j7) {
        G q7 = this.f6943f.q(0, 3);
        C0129q qVar = new C0129q();
        qVar.f2999m = I.o("text/vtt");
        qVar.f2992d = this.f6939a;
        qVar.f3004r = j7;
        g.v(qVar, q7);
        this.f6943f.g();
        return q7;
    }

    public final o c() {
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        String j7;
        int i8;
        this.f6943f.getClass();
        int i9 = (int) ((l) pVar).f14407W;
        int i10 = this.f6945h;
        byte[] bArr = this.f6944g;
        if (i10 == bArr.length) {
            if (i9 != -1) {
                i8 = i9;
            } else {
                i8 = bArr.length;
            }
            this.f6944g = Arrays.copyOf(bArr, (i8 * 3) / 2);
        }
        byte[] bArr2 = this.f6944g;
        int i11 = this.f6945h;
        int x8 = ((l) pVar).x(bArr2, i11, bArr2.length - i11);
        if (x8 != -1) {
            int i12 = this.f6945h + x8;
            this.f6945h = i12;
            if (i9 == -1 || i12 != i9) {
                return 0;
            }
        }
        r rVar = new r(this.f6944g);
        j.d(rVar);
        String j8 = rVar.j(StandardCharsets.UTF_8);
        long j9 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(j8)) {
                if (j8.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = i.matcher(j8);
                    if (matcher2.find()) {
                        Matcher matcher3 = f6938j.matcher(j8);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = j.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            int i13 = z.f3748a;
                            j9 = z.W(parseLong, 1000000, 90000, RoundingMode.DOWN);
                        } else {
                            throw J.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(j8));
                        }
                    } else {
                        throw J.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(j8));
                    }
                }
                j8 = rVar.j(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String j11 = rVar.j(StandardCharsets.UTF_8);
                    if (j11 == null) {
                        break;
                    } else if (j.f5419a.matcher(j11).matches()) {
                        do {
                            j7 = rVar.j(StandardCharsets.UTF_8);
                            if (j7 == null) {
                                break;
                            }
                        } while (j7.isEmpty());
                    } else {
                        Matcher matcher4 = U1.i.f5415a.matcher(j11);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0);
                } else {
                    String group3 = matcher.group(1);
                    group3.getClass();
                    long c8 = j.c(group3);
                    int i14 = z.f3748a;
                    long b8 = this.f6940b.b(z.W((j9 + c8) - j10, 90000, 1000000, RoundingMode.DOWN) % 8589934592L);
                    G b9 = b(b8 - c8);
                    byte[] bArr3 = this.f6944g;
                    int i15 = this.f6945h;
                    r rVar2 = this.f6941c;
                    rVar2.F(i15, bArr3);
                    b9.a(this.f6945h, rVar2);
                    b9.e(b8, 1, this.f6945h, 0, (F) null);
                }
                return -1;
            }
        }
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        l lVar = (l) pVar;
        lVar.r(this.f6944g, 0, 6, false);
        byte[] bArr = this.f6944g;
        r rVar = this.f6941c;
        rVar.F(6, bArr);
        if (j.a(rVar)) {
            return true;
        }
        lVar.r(this.f6944g, 6, 3, false);
        rVar.F(9, this.f6944g);
        return j.a(rVar);
    }

    public final void l(q qVar) {
        if (this.e) {
            qVar = new q0(qVar, (M1.j) this.f6942d);
        }
        this.f6943f = qVar;
        qVar.l(new s(-9223372036854775807L));
    }

    public final void release() {
    }
}
