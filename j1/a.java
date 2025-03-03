package J1;

import P0.r;
import p1.C1332b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f2340a;

    /* renamed from: b  reason: collision with root package name */
    public int f2341b;

    /* renamed from: c  reason: collision with root package name */
    public int f2342c;

    /* renamed from: d  reason: collision with root package name */
    public long f2343d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final r f2344f;

    /* renamed from: g  reason: collision with root package name */
    public final r f2345g;

    /* renamed from: h  reason: collision with root package name */
    public int f2346h;
    public int i;

    public a(r rVar, r rVar2, boolean z) {
        this.f2345g = rVar;
        this.f2344f = rVar2;
        this.e = z;
        rVar2.H(12);
        this.f2340a = rVar2.z();
        rVar.H(12);
        this.i = rVar.z();
        C1332b.d("first_chunk must be 1", rVar.i() != 1 ? false : true);
        this.f2341b = -1;
    }

    public final boolean a() {
        long j7;
        int i8;
        int i9 = this.f2341b + 1;
        this.f2341b = i9;
        if (i9 == this.f2340a) {
            return false;
        }
        boolean z = this.e;
        r rVar = this.f2344f;
        if (z) {
            j7 = rVar.A();
        } else {
            j7 = rVar.x();
        }
        this.f2343d = j7;
        if (this.f2341b == this.f2346h) {
            r rVar2 = this.f2345g;
            this.f2342c = rVar2.z();
            rVar2.I(4);
            int i10 = this.i - 1;
            this.i = i10;
            if (i10 > 0) {
                i8 = rVar2.z() - 1;
            } else {
                i8 = -1;
            }
            this.f2346h = i8;
        }
        return true;
    }
}
