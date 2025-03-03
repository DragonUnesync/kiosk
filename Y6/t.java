package Y6;

import C7.d;
import D.s0;
import Q5.a;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public d f6728a;

    /* renamed from: b  reason: collision with root package name */
    public s f6729b;

    /* renamed from: c  reason: collision with root package name */
    public int f6730c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f6731d;
    public l e;

    /* renamed from: f  reason: collision with root package name */
    public s0 f6732f = new s0(5);

    /* renamed from: g  reason: collision with root package name */
    public v f6733g;

    /* renamed from: h  reason: collision with root package name */
    public u f6734h;
    public u i;

    /* renamed from: j  reason: collision with root package name */
    public u f6735j;

    /* renamed from: k  reason: collision with root package name */
    public long f6736k;

    /* renamed from: l  reason: collision with root package name */
    public long f6737l;

    /* renamed from: m  reason: collision with root package name */
    public a f6738m;

    public static void b(String str, u uVar) {
        if (uVar == null) {
            return;
        }
        if (uVar.f6745a0 != null) {
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        } else if (uVar.f6746b0 != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
        } else if (uVar.f6747c0 != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
        } else if (uVar.f6748d0 != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
        }
    }

    public final u a() {
        int i8 = this.f6730c;
        if (i8 >= 0) {
            d dVar = this.f6728a;
            if (dVar != null) {
                s sVar = this.f6729b;
                if (sVar != null) {
                    String str = this.f6731d;
                    if (str != null) {
                        return new u(dVar, sVar, str, i8, this.e, this.f6732f.g(), this.f6733g, this.f6734h, this.i, this.f6735j, this.f6736k, this.f6737l, this.f6738m);
                    }
                    throw new IllegalStateException("message == null");
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
        throw new IllegalStateException(("code < 0: " + this.f6730c).toString());
    }
}
