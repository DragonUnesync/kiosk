package f7;

import C7.d;
import D.s0;
import D6.h;
import N.e;
import P6.f;
import Y6.m;
import Y6.o;
import Y6.r;
import Y6.s;
import Y6.t;
import Y6.u;
import Z6.b;
import c7.j;
import com.samsung.android.knox.accounts.HostAuth;
import d7.C0659d;
import d7.C0660e;
import d7.C0661f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l7.i;
import l7.w;

public final class p implements C0659d {

    /* renamed from: g  reason: collision with root package name */
    public static final List f11762g = b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List f11763h = b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final j f11764a;

    /* renamed from: b  reason: collision with root package name */
    public final C0661f f11765b;

    /* renamed from: c  reason: collision with root package name */
    public final o f11766c;

    /* renamed from: d  reason: collision with root package name */
    public volatile w f11767d;
    public final s e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f11768f;

    public p(r rVar, j jVar, C0661f fVar, o oVar) {
        f.e(rVar, "client");
        f.e(jVar, "connection");
        f.e(oVar, "http2Connection");
        this.f11764a = jVar;
        this.f11765b = fVar;
        this.f11766c = oVar;
        s sVar = s.H2_PRIOR_KNOWLEDGE;
        this.e = !rVar.f6713l0.contains(sVar) ? s.HTTP_2 : sVar;
    }

    public final void a() {
        w wVar = this.f11767d;
        f.b(wVar);
        wVar.g().close();
    }

    public final w b(u uVar) {
        w wVar = this.f11767d;
        f.b(wVar);
        return wVar.i;
    }

    public final void c() {
        this.f11766c.flush();
    }

    public final void cancel() {
        this.f11768f = true;
        w wVar = this.f11767d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    public final long d(u uVar) {
        if (!C0660e.a(uVar)) {
            return 0;
        }
        return b.j(uVar);
    }

    public final void e(d dVar) {
        int i;
        w wVar;
        if (this.f11767d == null) {
            dVar.getClass();
            m mVar = (m) dVar.f734X;
            ArrayList arrayList = new ArrayList(mVar.size() + 4);
            arrayList.add(new C0939b(C0939b.f11697f, (String) dVar.f733W));
            i iVar = C0939b.f11698g;
            o oVar = (o) dVar.f732V;
            f.e(oVar, "url");
            String b8 = oVar.b();
            String d8 = oVar.d();
            if (d8 != null) {
                b8 = b8 + '?' + d8;
            }
            arrayList.add(new C0939b(iVar, b8));
            String b9 = ((m) dVar.f734X).b("Host");
            if (b9 != null) {
                arrayList.add(new C0939b(C0939b.i, b9));
            }
            arrayList.add(new C0939b(C0939b.f11699h, oVar.f6669a));
            int size = mVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                String c8 = mVar.c(i8);
                Locale locale = Locale.US;
                f.d(locale, "US");
                String lowerCase = c8.toLowerCase(locale);
                f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!f11762g.contains(lowerCase) || (lowerCase.equals("te") && f.a(mVar.f(i8), "trailers"))) {
                    arrayList.add(new C0939b(lowerCase, mVar.f(i8)));
                }
            }
            o oVar2 = this.f11766c;
            oVar2.getClass();
            boolean z = !false;
            synchronized (oVar2.f11759q0) {
                synchronized (oVar2) {
                    try {
                        if (oVar2.f11742Y > 1073741823) {
                            oVar2.o(8);
                        }
                        if (!oVar2.f11743Z) {
                            i = oVar2.f11742Y;
                            oVar2.f11742Y = i + 2;
                            wVar = new w(i, oVar2, z, false, (m) null);
                            if (wVar.i()) {
                                oVar2.f11739V.put(Integer.valueOf(i), wVar);
                            }
                        } else {
                            throw new IOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oVar2.f11759q0.o(z, i, arrayList);
            }
            oVar2.f11759q0.flush();
            this.f11767d = wVar;
            if (!this.f11768f) {
                w wVar2 = this.f11767d;
                f.b(wVar2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                wVar2.f11798k.g((long) this.f11765b.f9777g, timeUnit);
                w wVar3 = this.f11767d;
                f.b(wVar3);
                wVar3.f11799l.g((long) this.f11765b.f9778h, timeUnit);
                return;
            }
            w wVar4 = this.f11767d;
            f.b(wVar4);
            wVar4.e(9);
            throw new IOException("Canceled");
        }
    }

    /* JADX INFO: finally extract failed */
    public final t f(boolean z) {
        m mVar;
        w wVar = this.f11767d;
        if (wVar != null) {
            synchronized (wVar) {
                wVar.f11798k.h();
                while (wVar.f11795g.isEmpty() && wVar.f11800m == 0) {
                    try {
                        wVar.l();
                    } catch (Throwable th) {
                        wVar.f11798k.k();
                        throw th;
                    }
                }
                wVar.f11798k.k();
                if (!wVar.f11795g.isEmpty()) {
                    Object removeFirst = wVar.f11795g.removeFirst();
                    f.d(removeFirst, "headersQueue.removeFirst()");
                    mVar = (m) removeFirst;
                } else {
                    Throwable th2 = wVar.f11801n;
                    if (th2 == null) {
                        int i = wVar.f11800m;
                        e.C(i);
                        th2 = new C0937B(i);
                    }
                    throw th2;
                }
            }
            s sVar = this.e;
            f.e(sVar, HostAuth.PROTOCOL);
            ArrayList arrayList = new ArrayList(20);
            int size = mVar.size();
            D2.o oVar = null;
            for (int i8 = 0; i8 < size; i8++) {
                String c8 = mVar.c(i8);
                String f8 = mVar.f(i8);
                if (f.a(c8, ":status")) {
                    oVar = D7.b.I("HTTP/1.1 " + f8);
                } else if (!f11763h.contains(c8)) {
                    f.e(c8, "name");
                    f.e(f8, "value");
                    arrayList.add(c8);
                    arrayList.add(W6.d.s0(f8).toString());
                }
            }
            if (oVar != null) {
                t tVar = new t();
                tVar.f6729b = sVar;
                tVar.f6730c = oVar.f1137V;
                tVar.f6731d = (String) oVar.f1139X;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                s0 s0Var = new s0(5);
                ArrayList arrayList2 = s0Var.f949a;
                f.e(arrayList2, "<this>");
                f.e(strArr, "elements");
                arrayList2.addAll(h.A(strArr));
                tVar.f6732f = s0Var;
                if (!z || tVar.f6730c != 100) {
                    return tVar;
                }
                return null;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    public final l7.u g(d dVar, long j7) {
        w wVar = this.f11767d;
        f.b(wVar);
        return wVar.g();
    }

    public final j h() {
        return this.f11764a;
    }
}
