package M1;

import K1.i;
import P0.c;
import P0.h;
import P0.l;
import P0.r;
import U0.a;
import h1.C1031B;
import java.util.HashMap;
import p1.F;

public final /* synthetic */ class m implements c, h {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3090U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ long f3091V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f3092W;

    public /* synthetic */ m(n nVar, long j7, int i) {
        this.f3092W = nVar;
        this.f3091V = j7;
        this.f3090U = i;
    }

    public void a(Object obj) {
        long j7;
        U0.h hVar = (U0.h) obj;
        hVar.getClass();
        a aVar = (a) this.f3092W;
        C1031B b8 = aVar.f5317d;
        if (b8 != null) {
            String d8 = hVar.f5348b.d(aVar.f5315b, b8);
            HashMap hashMap = hVar.f5353h;
            Long l8 = (Long) hashMap.get(d8);
            HashMap hashMap2 = hVar.f5352g;
            Long l9 = (Long) hashMap2.get(d8);
            long j8 = 0;
            if (l8 == null) {
                j7 = 0;
            } else {
                j7 = l8.longValue();
            }
            hashMap.put(d8, Long.valueOf(j7 + this.f3091V));
            if (l9 != null) {
                j8 = l9.longValue();
            }
            hashMap2.put(d8, Long.valueOf(j8 + ((long) this.f3090U)));
        }
    }

    public void accept(Object obj) {
        boolean z;
        a aVar = (a) obj;
        n nVar = (n) this.f3092W;
        l.k(nVar.f3099h);
        byte[] t8 = i.t(aVar.f3064a, aVar.f3066c);
        r rVar = nVar.f3095c;
        rVar.getClass();
        rVar.F(t8.length, t8);
        nVar.f3093a.a(t8.length, rVar);
        long j7 = this.f3091V;
        long j8 = aVar.f3065b;
        if (j8 == -9223372036854775807L) {
            if (nVar.f3099h.f3041s == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
        } else {
            long j9 = nVar.f3099h.f3041s;
            if (j9 == Long.MAX_VALUE) {
                j7 += j8;
            } else {
                j7 = j8 + j9;
            }
        }
        long j10 = j7;
        nVar.f3093a.e(j10, this.f3090U, t8.length, 0, (F) null);
    }

    public /* synthetic */ m(a aVar, int i, long j7, long j8) {
        this.f3092W = aVar;
        this.f3090U = i;
        this.f3091V = j7;
    }
}
