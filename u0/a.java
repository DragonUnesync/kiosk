package U0;

import M0.X;
import h1.C1031B;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f5314a;

    /* renamed from: b  reason: collision with root package name */
    public final X f5315b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5316c;

    /* renamed from: d  reason: collision with root package name */
    public final C1031B f5317d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final X f5318f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5319g;

    /* renamed from: h  reason: collision with root package name */
    public final C1031B f5320h;
    public final long i;

    /* renamed from: j  reason: collision with root package name */
    public final long f5321j;

    public a(long j7, X x8, int i8, C1031B b8, long j8, X x9, int i9, C1031B b9, long j9, long j10) {
        this.f5314a = j7;
        this.f5315b = x8;
        this.f5316c = i8;
        this.f5317d = b8;
        this.e = j8;
        this.f5318f = x9;
        this.f5319g = i9;
        this.f5320h = b9;
        this.i = j9;
        this.f5321j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5314a == aVar.f5314a && this.f5316c == aVar.f5316c && this.e == aVar.e && this.f5319g == aVar.f5319g && this.i == aVar.i && this.f5321j == aVar.f5321j && N7.a.e(this.f5315b, aVar.f5315b) && N7.a.e(this.f5317d, aVar.f5317d) && N7.a.e(this.f5318f, aVar.f5318f) && N7.a.e(this.f5320h, aVar.f5320h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.f5314a);
        Integer valueOf2 = Integer.valueOf(this.f5316c);
        Long valueOf3 = Long.valueOf(this.e);
        Integer valueOf4 = Integer.valueOf(this.f5319g);
        Long valueOf5 = Long.valueOf(this.i);
        Long valueOf6 = Long.valueOf(this.f5321j);
        return Arrays.hashCode(new Object[]{valueOf, this.f5315b, valueOf2, this.f5317d, valueOf3, this.f5318f, valueOf4, this.f5320h, valueOf5, valueOf6});
    }
}
