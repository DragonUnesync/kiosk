package n1;

import C3.r;
import M0.h0;
import P0.m;
import k2.C1160q;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final C1160q f13698a;

    /* renamed from: b  reason: collision with root package name */
    public final r f13699b;

    /* renamed from: c  reason: collision with root package name */
    public final q f13700c = new q();

    /* renamed from: d  reason: collision with root package name */
    public final r f13701d = new r();
    public final r e = new r();

    /* renamed from: f  reason: collision with root package name */
    public final m f13702f;

    /* renamed from: g  reason: collision with root package name */
    public h0 f13703g;

    /* renamed from: h  reason: collision with root package name */
    public h0 f13704h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public long f13705j;

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, P0.m] */
    public v(C1160q qVar, r rVar) {
        this.f13698a = qVar;
        this.f13699b = rVar;
        ? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f3719a = 0;
        obj.f3720b = 0;
        obj.f3722d = new long[highestOneBit];
        obj.f3721c = highestOneBit - 1;
        this.f13702f = obj;
        this.f13704h = h0.f2952d;
        this.f13705j = -9223372036854775807L;
    }
}
