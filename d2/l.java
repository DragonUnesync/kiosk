package D2;

import B.q0;
import B2.f;
import B2.i;
import K2.p;
import W2.c;
import W2.h;
import X2.b;
import X2.d;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.e;
import com.bumptech.glide.load.data.g;
import java.util.ArrayList;
import java.util.Collections;
import u.C1477r;

public final class l implements C0078g, Runnable, Comparable, b {

    /* renamed from: U  reason: collision with root package name */
    public final i f1098U = new i();

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f1099V = new ArrayList();

    /* renamed from: W  reason: collision with root package name */
    public final d f1100W = new Object();

    /* renamed from: X  reason: collision with root package name */
    public final p f1101X;

    /* renamed from: Y  reason: collision with root package name */
    public final q0 f1102Y;

    /* renamed from: Z  reason: collision with root package name */
    public final q0 f1103Z = new q0(3);

    /* renamed from: a0  reason: collision with root package name */
    public final k f1104a0 = new Object();

    /* renamed from: b0  reason: collision with root package name */
    public e f1105b0;

    /* renamed from: c0  reason: collision with root package name */
    public f f1106c0;

    /* renamed from: d0  reason: collision with root package name */
    public com.bumptech.glide.f f1107d0;

    /* renamed from: e0  reason: collision with root package name */
    public v f1108e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1109f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f1110g0;

    /* renamed from: h0  reason: collision with root package name */
    public n f1111h0;

    /* renamed from: i0  reason: collision with root package name */
    public i f1112i0;

    /* renamed from: j0  reason: collision with root package name */
    public u f1113j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1114k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f1115l0;

    /* renamed from: m0  reason: collision with root package name */
    public Object f1116m0;

    /* renamed from: n0  reason: collision with root package name */
    public Thread f1117n0;

    /* renamed from: o0  reason: collision with root package name */
    public f f1118o0;
    public f p0;

    /* renamed from: q0  reason: collision with root package name */
    public Object f1119q0;

    /* renamed from: r0  reason: collision with root package name */
    public com.bumptech.glide.load.data.e f1120r0;

    /* renamed from: s0  reason: collision with root package name */
    public volatile C0079h f1121s0;

    /* renamed from: t0  reason: collision with root package name */
    public volatile boolean f1122t0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile boolean f1123u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f1124v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f1125w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f1126x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f1127y0;

    /* JADX WARNING: type inference failed for: r0v2, types: [X2.d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [D2.k, java.lang.Object] */
    public l(p pVar, q0 q0Var) {
        this.f1101X = pVar;
        this.f1102Y = q0Var;
    }

    public final void a(f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i) {
        eVar.b();
        y yVar = new y("Fetching data failed", Collections.singletonList(exc));
        Class a8 = eVar.a();
        yVar.f1196V = fVar;
        yVar.f1197W = i;
        yVar.f1198X = a8;
        this.f1099V.add(yVar);
        if (Thread.currentThread() != this.f1117n0) {
            o(2);
        } else {
            p();
        }
    }

    public final d b() {
        return this.f1100W;
    }

    public final void c(f fVar, Object obj, com.bumptech.glide.load.data.e eVar, int i, f fVar2) {
        this.f1118o0 = fVar;
        this.f1119q0 = obj;
        this.f1120r0 = eVar;
        this.f1127y0 = i;
        this.p0 = fVar2;
        boolean z = false;
        if (fVar != this.f1098U.a().get(0)) {
            z = true;
        }
        this.f1124v0 = z;
        if (Thread.currentThread() != this.f1117n0) {
            o(3);
        } else {
            f();
        }
    }

    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int ordinal = this.f1107d0.ordinal() - lVar.f1107d0.ordinal();
        if (ordinal == 0) {
            return this.f1114k0 - lVar.f1114k0;
        }
        return ordinal;
    }

    public final D d(com.bumptech.glide.load.data.e eVar, Object obj, int i) {
        if (obj == null) {
            eVar.b();
            return null;
        }
        try {
            int i8 = h.f6165b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            D e = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + e, elapsedRealtimeNanos, (String) null);
            }
            return e;
        } finally {
            eVar.b();
        }
    }

    public final D e(int i, Object obj) {
        boolean z;
        Class<?> cls = obj.getClass();
        i iVar = this.f1098U;
        B c8 = iVar.c(cls);
        i iVar2 = this.f1112i0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i == 4 || iVar.f1092r) {
                z = true;
            } else {
                z = false;
            }
            B2.h hVar = p.i;
            Boolean bool = (Boolean) iVar2.c(hVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                iVar2 = new i();
                i iVar3 = this.f1112i0;
                c cVar = iVar2.f388b;
                cVar.g(iVar3.f388b);
                cVar.put(hVar, Boolean.valueOf(z));
            }
        }
        i iVar4 = iVar2;
        g h5 = this.f1105b0.b().h(obj);
        try {
            return c8.a(this.f1109f0, this.f1110g0, iVar4, new j(i, (Object) this), h5);
        } finally {
            h5.b();
        }
    }

    public final void f() {
        D d8;
        q0 q0Var;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", this.f1115l0, "data: " + this.f1119q0 + ", cache key: " + this.f1118o0 + ", fetcher: " + this.f1120r0);
        }
        C c8 = null;
        try {
            d8 = d(this.f1120r0, this.f1119q0, this.f1127y0);
        } catch (y e) {
            f fVar = this.p0;
            int i = this.f1127y0;
            e.f1196V = fVar;
            e.f1197W = i;
            e.f1198X = null;
            this.f1099V.add(e);
            d8 = null;
        }
        if (d8 != null) {
            int i8 = this.f1127y0;
            boolean z = this.f1124v0;
            if (d8 instanceof z) {
                ((z) d8).a();
            }
            boolean z6 = true;
            if (((C) this.f1103Z.f302X) != null) {
                c8 = (C) C.f1029Y.a();
                c8.f1033X = false;
                c8.f1032W = true;
                c8.f1031V = d8;
                d8 = c8;
            }
            r();
            u uVar = this.f1113j0;
            synchronized (uVar) {
                uVar.f1170h0 = d8;
                uVar.f1171i0 = i8;
                uVar.p0 = z;
            }
            uVar.h();
            this.f1125w0 = 5;
            try {
                q0Var = this.f1103Z;
                if (((C) q0Var.f302X) == null) {
                    z6 = false;
                }
                if (z6) {
                    p pVar = this.f1101X;
                    i iVar = this.f1112i0;
                    q0Var.getClass();
                    pVar.a().i((f) q0Var.f300V, new q0((Object) (B2.l) q0Var.f301W, (Object) (C) q0Var.f302X, (Object) iVar, 2));
                    ((C) q0Var.f302X).a();
                }
                if (c8 != null) {
                    c8.a();
                }
                k();
            } catch (Throwable th) {
                if (c8 != null) {
                    c8.a();
                }
                throw th;
            }
        } else {
            p();
        }
    }

    public final C0079h g() {
        int h5 = C1477r.h(this.f1125w0);
        i iVar = this.f1098U;
        if (h5 == 1) {
            return new E(iVar, this);
        }
        if (h5 == 2) {
            return new C0076e(iVar.a(), iVar, this);
        }
        if (h5 == 3) {
            return new H(iVar, this);
        }
        if (h5 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(N.e.N(this.f1125w0)));
    }

    public final int h(int i) {
        boolean z;
        boolean z6;
        int h5 = C1477r.h(i);
        if (h5 == 0) {
            switch (this.f1111h0.f1135a) {
                case 0:
                case 1:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return h(2);
        } else if (h5 == 1) {
            switch (this.f1111h0.f1135a) {
                case 0:
                    z6 = false;
                    break;
                default:
                    z6 = true;
                    break;
            }
            if (z6) {
                return 3;
            }
            return h(3);
        } else if (h5 == 2) {
            return 4;
        } else {
            if (h5 == 3 || h5 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(N.e.N(i)));
        }
    }

    public final void i(String str, long j7, String str2) {
        String str3;
        StringBuilder B8 = N.e.B(str, " in ");
        B8.append(h.a(j7));
        B8.append(", load key: ");
        B8.append(this.f1108e0);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        B8.append(str3);
        B8.append(", thread: ");
        B8.append(Thread.currentThread().getName());
        Log.v("DecodeJob", B8.toString());
    }

    public final void j() {
        r();
        y yVar = new y("Failed to load resource", new ArrayList(this.f1099V));
        u uVar = this.f1113j0;
        synchronized (uVar) {
            uVar.f1173k0 = yVar;
        }
        uVar.g();
        l();
    }

    public final void k() {
        boolean b8;
        k kVar = this.f1104a0;
        synchronized (kVar) {
            kVar.f1096b = true;
            b8 = kVar.b();
        }
        if (b8) {
            n();
        }
    }

    public final void l() {
        boolean b8;
        k kVar = this.f1104a0;
        synchronized (kVar) {
            kVar.f1097c = true;
            b8 = kVar.b();
        }
        if (b8) {
            n();
        }
    }

    public final void m() {
        boolean b8;
        k kVar = this.f1104a0;
        synchronized (kVar) {
            kVar.f1095a = true;
            b8 = kVar.b();
        }
        if (b8) {
            n();
        }
    }

    public final void n() {
        k kVar = this.f1104a0;
        synchronized (kVar) {
            kVar.f1096b = false;
            kVar.f1095a = false;
            kVar.f1097c = false;
        }
        q0 q0Var = this.f1103Z;
        q0Var.f300V = null;
        q0Var.f301W = null;
        q0Var.f302X = null;
        i iVar = this.f1098U;
        iVar.f1079c = null;
        iVar.f1080d = null;
        iVar.f1088n = null;
        iVar.f1082g = null;
        iVar.f1085k = null;
        iVar.i = null;
        iVar.f1089o = null;
        iVar.f1084j = null;
        iVar.f1090p = null;
        iVar.f1077a.clear();
        iVar.f1086l = false;
        iVar.f1078b.clear();
        iVar.f1087m = false;
        this.f1122t0 = false;
        this.f1105b0 = null;
        this.f1106c0 = null;
        this.f1112i0 = null;
        this.f1107d0 = null;
        this.f1108e0 = null;
        this.f1113j0 = null;
        this.f1125w0 = 0;
        this.f1121s0 = null;
        this.f1117n0 = null;
        this.f1118o0 = null;
        this.f1119q0 = null;
        this.f1127y0 = 0;
        this.f1120r0 = null;
        this.f1115l0 = 0;
        this.f1123u0 = false;
        this.f1099V.clear();
        this.f1102Y.A(this);
    }

    public final void o(int i) {
        G2.e eVar;
        this.f1126x0 = i;
        u uVar = this.f1113j0;
        if (uVar.f1169g0) {
            eVar = uVar.f1165c0;
        } else {
            eVar = uVar.f1164b0;
        }
        eVar.execute(this);
    }

    public final void p() {
        this.f1117n0 = Thread.currentThread();
        int i = h.f6165b;
        this.f1115l0 = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.f1123u0 && this.f1121s0 != null && !(z = this.f1121s0.b())) {
            this.f1125w0 = h(this.f1125w0);
            this.f1121s0 = g();
            if (this.f1125w0 == 4) {
                o(2);
                return;
            }
        }
        if ((this.f1125w0 == 6 || this.f1123u0) && !z) {
            j();
        }
    }

    public final void q() {
        String str;
        int h5 = C1477r.h(this.f1126x0);
        if (h5 == 0) {
            this.f1125w0 = h(1);
            this.f1121s0 = g();
            p();
        } else if (h5 == 1) {
            p();
        } else if (h5 == 2) {
            f();
        } else {
            int i = this.f1126x0;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i == 2) {
                str = "SWITCH_TO_SOURCE_SERVICE";
            } else if (i != 3) {
                str = "null";
            } else {
                str = "DECODE_DATA";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    public final void r() {
        Throwable th;
        this.f1100W.a();
        if (this.f1122t0) {
            if (this.f1099V.isEmpty()) {
                th = null;
            } else {
                th = (Throwable) Q0.g.l(1, this.f1099V);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f1122t0 = true;
    }

    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f1120r0;
        try {
            if (this.f1123u0) {
                j();
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            }
            q();
            if (eVar != null) {
                eVar.b();
            }
        } catch (C0075d e) {
            throw e;
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.b();
            }
            throw th;
        }
    }
}
