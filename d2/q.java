package D2;

import B.q0;
import B2.i;
import F.a;
import F2.f;
import W2.c;
import W2.h;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import o.s1;
import z3.e;

public final class q {
    public static final boolean i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final A f1142a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1143b;

    /* renamed from: c  reason: collision with root package name */
    public final f f1144c;

    /* renamed from: d  reason: collision with root package name */
    public final s1 f1145d;
    public final G e;

    /* renamed from: f  reason: collision with root package name */
    public final p f1146f;

    /* renamed from: g  reason: collision with root package name */
    public final o f1147g;

    /* renamed from: h  reason: collision with root package name */
    public final B3.q f1148h;

    public q(f fVar, A.f fVar2, G2.e eVar, G2.e eVar2, G2.e eVar3, G2.e eVar4) {
        this.f1144c = fVar;
        p pVar = new p(fVar2);
        this.f1146f = pVar;
        B3.q qVar = new B3.q(3);
        this.f1148h = qVar;
        synchronized (this) {
            synchronized (qVar) {
                qVar.f452X = this;
            }
        }
        this.f1143b = new e(18);
        this.f1142a = new A(0);
        this.f1145d = new s1(eVar, eVar2, eVar3, eVar4, this, this);
        this.f1147g = new o(pVar);
        this.e = new G(0);
        fVar.f1522d = this;
    }

    public static void d(String str, long j7, v vVar) {
        StringBuilder B8 = N.e.B(str, " in ");
        B8.append(h.a(j7));
        B8.append("ms, key: ");
        B8.append(vVar);
        Log.v("Engine", B8.toString());
    }

    public static void g(D d8) {
        if (d8 instanceof w) {
            ((w) d8).b();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final q0 a(com.bumptech.glide.e eVar, Object obj, B2.f fVar, int i8, int i9, Class cls, Class cls2, com.bumptech.glide.f fVar2, n nVar, c cVar, boolean z, boolean z6, i iVar, boolean z8, boolean z9, S2.f fVar3, a aVar) {
        long j7;
        if (i) {
            int i10 = h.f6165b;
            j7 = SystemClock.elapsedRealtimeNanos();
        } else {
            j7 = 0;
        }
        long j8 = j7;
        this.f1143b.getClass();
        v vVar = new v(obj, fVar, i8, i9, cVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                w c8 = c(vVar, z8, j8);
                if (c8 == null) {
                    q0 h5 = h(eVar, obj, fVar, i8, i9, cls, cls2, fVar2, nVar, cVar, z, z6, iVar, z8, z9, fVar3, aVar, vVar, j8);
                    return h5;
                }
                fVar3.m(c8, 5, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final w b(v vVar) {
        w wVar;
        Object obj;
        f fVar = this.f1144c;
        synchronized (fVar) {
            W2.i iVar = (W2.i) ((LinkedHashMap) fVar.f5608c).remove(vVar);
            wVar = null;
            if (iVar == null) {
                obj = null;
            } else {
                fVar.f5607b -= (long) iVar.f6167b;
                obj = iVar.f6166a;
            }
        }
        D d8 = (D) obj;
        if (d8 != null) {
            if (d8 instanceof w) {
                wVar = (w) d8;
            } else {
                wVar = new w(d8, true, true, vVar, this);
            }
        }
        if (wVar != null) {
            wVar.a();
            this.f1148h.i(vVar, wVar);
        }
        return wVar;
    }

    public final w c(v vVar, boolean z, long j7) {
        w wVar;
        if (!z) {
            return null;
        }
        B3.q qVar = this.f1148h;
        synchronized (qVar) {
            C0074c cVar = (C0074c) ((HashMap) qVar.f450V).get(vVar);
            if (cVar == null) {
                wVar = null;
            } else {
                wVar = (w) cVar.get();
                if (wVar == null) {
                    qVar.q(cVar);
                }
            }
        }
        if (wVar != null) {
            wVar.a();
        }
        if (wVar != null) {
            if (i) {
                d("Loaded resource from active resources", j7, vVar);
            }
            return wVar;
        }
        w b8 = b(vVar);
        if (b8 == null) {
            return null;
        }
        if (i) {
            d("Loaded resource from cache", j7, vVar);
        }
        return b8;
    }

    public final synchronized void e(u uVar, v vVar, w wVar) {
        if (wVar != null) {
            try {
                if (wVar.f1185U) {
                    this.f1148h.i(vVar, wVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        A a8 = this.f1142a;
        a8.getClass();
        uVar.getClass();
        HashMap hashMap = a8.f1025a;
        if (uVar.equals(hashMap.get(vVar))) {
            hashMap.remove(vVar);
        }
    }

    public final void f(v vVar, w wVar) {
        B3.q qVar = this.f1148h;
        synchronized (qVar) {
            C0074c cVar = (C0074c) ((HashMap) qVar.f450V).remove(vVar);
            if (cVar != null) {
                cVar.f1065c = null;
                cVar.clear();
            }
        }
        if (wVar.f1185U) {
            D d8 = (D) this.f1144c.f(vVar, wVar);
        } else {
            this.e.j(wVar, false);
        }
    }

    public final q0 h(com.bumptech.glide.e eVar, Object obj, B2.f fVar, int i8, int i9, Class cls, Class cls2, com.bumptech.glide.f fVar2, n nVar, c cVar, boolean z, boolean z6, i iVar, boolean z8, boolean z9, S2.f fVar3, a aVar, v vVar, long j7) {
        com.bumptech.glide.e eVar2 = eVar;
        Object obj2 = obj;
        B2.f fVar4 = fVar;
        int i10 = i8;
        int i11 = i9;
        com.bumptech.glide.f fVar5 = fVar2;
        n nVar2 = nVar;
        i iVar2 = iVar;
        S2.f fVar6 = fVar3;
        a aVar2 = aVar;
        v vVar2 = vVar;
        long j8 = j7;
        u uVar = (u) this.f1142a.f1025a.get(vVar2);
        if (uVar != null) {
            uVar.a(fVar6, aVar2);
            if (i) {
                d("Added to existing load", j8, vVar2);
            }
            return new q0(this, fVar6, uVar);
        }
        u uVar2 = (u) ((q0) this.f1145d.f14075g).a();
        synchronized (uVar2) {
            uVar2.f1167e0 = vVar2;
            uVar2.f1168f0 = z8;
            uVar2.f1169g0 = z9;
        }
        o oVar = this.f1147g;
        l lVar = (l) ((q0) oVar.f1139X).a();
        int i12 = oVar.f1137V;
        oVar.f1137V = i12 + 1;
        i iVar3 = lVar.f1098U;
        iVar3.f1079c = eVar2;
        iVar3.f1080d = obj2;
        iVar3.f1088n = fVar4;
        iVar3.e = i10;
        iVar3.f1081f = i11;
        iVar3.f1090p = nVar2;
        iVar3.f1082g = cls;
        iVar3.f1083h = lVar.f1101X;
        iVar3.f1085k = cls2;
        iVar3.f1089o = fVar5;
        iVar3.i = iVar2;
        iVar3.f1084j = cVar;
        iVar3.f1091q = z;
        iVar3.f1092r = z6;
        lVar.f1105b0 = eVar2;
        lVar.f1106c0 = fVar4;
        lVar.f1107d0 = fVar5;
        lVar.f1108e0 = vVar2;
        lVar.f1109f0 = i10;
        lVar.f1110g0 = i11;
        lVar.f1111h0 = nVar2;
        lVar.f1112i0 = iVar2;
        lVar.f1113j0 = uVar2;
        lVar.f1114k0 = i12;
        lVar.f1126x0 = 1;
        lVar.f1116m0 = obj2;
        A a8 = this.f1142a;
        a8.getClass();
        a8.f1025a.put(vVar2, uVar2);
        S2.f fVar7 = fVar3;
        uVar2.a(fVar7, aVar2);
        uVar2.k(lVar);
        if (i) {
            d("Started new load", j7, vVar2);
        }
        return new q0(this, fVar7, uVar2);
    }
}
