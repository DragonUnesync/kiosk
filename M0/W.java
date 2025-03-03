package M0;

import H3.M;
import H3.O;
import H3.i0;
import N.e;
import P0.z;
import android.net.Uri;
import com.bumptech.glide.c;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

public final class W {

    /* renamed from: q  reason: collision with root package name */
    public static final Object f2868q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static final C f2869r;

    /* renamed from: a  reason: collision with root package name */
    public Object f2870a = f2868q;

    /* renamed from: b  reason: collision with root package name */
    public Object f2871b;

    /* renamed from: c  reason: collision with root package name */
    public C f2872c = f2869r;

    /* renamed from: d  reason: collision with root package name */
    public Object f2873d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f2874f;

    /* renamed from: g  reason: collision with root package name */
    public long f2875g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2876h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public C0136y f2877j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2878k;

    /* renamed from: l  reason: collision with root package name */
    public long f2879l;

    /* renamed from: m  reason: collision with root package name */
    public long f2880m;

    /* renamed from: n  reason: collision with root package name */
    public int f2881n;

    /* renamed from: o  reason: collision with root package name */
    public int f2882o;

    /* renamed from: p  reason: collision with root package name */
    public long f2883p;

    /* JADX WARNING: type inference failed for: r10v0, types: [M0.v, M0.w] */
    static {
        C0137z zVar;
        C0132u uVar = new C0132u();
        M m8 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        List emptyList = Collections.emptyList();
        i0 i0Var2 = i0.f2073Y;
        C0135x xVar = new C0135x();
        A a8 = A.f2783a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            zVar = new C0137z(uri, (String) null, (c) null, emptyList, i0Var2, -9223372036854775807L);
        } else {
            zVar = null;
        }
        f2869r = new C("androidx.media3.common.Timeline", new C0133v(uVar), zVar, new C0136y(xVar), F.z, a8);
        e.D(1, 2, 3, 4, 5);
        e.D(6, 7, 8, 9, 10);
        z.J(11);
        z.J(12);
        z.J(13);
    }

    public final boolean a() {
        if (this.f2877j != null) {
            return true;
        }
        return false;
    }

    public final void b(C c8, Object obj, long j7, long j8, long j9, boolean z, boolean z6, C0136y yVar, long j10, long j11, int i8, long j12) {
        C c9;
        C c10 = c8;
        this.f2870a = f2868q;
        if (c10 != null) {
            c9 = c10;
        } else {
            c9 = f2869r;
        }
        this.f2872c = c9;
        if (c10 != null) {
            C0137z zVar = c10.f2786b;
        }
        this.f2873d = obj;
        this.e = j7;
        this.f2874f = j8;
        this.f2875g = j9;
        this.f2876h = z;
        this.i = z6;
        this.f2877j = yVar;
        this.f2879l = j10;
        this.f2880m = j11;
        this.f2881n = 0;
        this.f2882o = i8;
        this.f2883p = j12;
        this.f2878k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (W.class.equals(obj.getClass())) {
                W w2 = (W) obj;
                if (Objects.equals(this.f2870a, w2.f2870a) && Objects.equals(this.f2872c, w2.f2872c) && Objects.equals(this.f2873d, w2.f2873d) && Objects.equals(this.f2877j, w2.f2877j) && this.e == w2.e && this.f2874f == w2.f2874f && this.f2875g == w2.f2875g && this.f2876h == w2.f2876h && this.i == w2.i && this.f2878k == w2.f2878k && this.f2879l == w2.f2879l && this.f2880m == w2.f2880m && this.f2881n == w2.f2881n && this.f2882o == w2.f2882o && this.f2883p == w2.f2883p) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        int hashCode = (this.f2872c.hashCode() + ((this.f2870a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f2873d;
        int i9 = 0;
        if (obj == null) {
            i8 = 0;
        } else {
            i8 = obj.hashCode();
        }
        int i10 = (hashCode + i8) * 31;
        C0136y yVar = this.f2877j;
        if (yVar != null) {
            i9 = yVar.hashCode();
        }
        long j7 = this.e;
        long j8 = this.f2874f;
        long j9 = this.f2875g;
        long j10 = this.f2879l;
        long j11 = this.f2880m;
        long j12 = this.f2883p;
        return ((((((((((((((((((((((i10 + i9) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f2876h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.f2878k ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f2881n) * 31) + this.f2882o) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }
}
