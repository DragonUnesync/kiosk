package G5;

import B.B;
import B3.o;
import H3.P;
import H5.f;
import M0.C0117e;
import N7.a;
import P0.z;
import V0.C0339d;
import V0.C0340e;
import V0.C0341f;
import V0.y;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.v4.media.session.b;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n2.g;
import n2.h;
import n2.i;
import t2.C1424f;
import t2.C1426h;
import t2.k;
import t2.l;
import t2.n;
import t2.p;
import u2.j;
import u2.q;
import v2.C1558a;
import v2.C1559b;
import v2.c;
import y2.C1628c;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public Object f1711a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1712b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1713c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1714d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f1715f;

    /* renamed from: g  reason: collision with root package name */
    public Object f1716g;

    /* renamed from: h  reason: collision with root package name */
    public Object f1717h;
    public Object i;

    /* renamed from: j  reason: collision with root package name */
    public Object f1718j;

    public m(f fVar, j jVar, Handler handler) {
        this.f1712b = false;
        this.f1717h = new Object();
        this.i = new o(1, this);
        this.f1718j = new A.f(25, (Object) this);
        b.U();
        this.f1713c = fVar;
        this.f1715f = jVar;
        this.e = handler;
    }

    public static void d(g gVar, i iVar) {
        if (!gVar.f13736b.equals(iVar)) {
            throw new IllegalArgumentException("requested " + iVar + " but was " + gVar.f13736b);
        }
    }

    public void a(C1424f fVar, n2.f fVar2) {
        n2.f fVar3 = (n2.f) this.f1711a;
        if (fVar3 == null || !fVar3.f13731c) {
            throw new IllegalStateException("no current label");
        }
        fVar3.f13729a.add(fVar);
        int i8 = fVar.f15196U.e;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 6) {
                            throw new IllegalArgumentException();
                        } else if (fVar2 == null) {
                            ArrayList arrayList = new ArrayList((ArrayList) this.i);
                            n2.f fVar4 = new n2.f();
                            b(fVar4);
                            n2.f fVar5 = (n2.f) this.f1711a;
                            fVar5.e = fVar4;
                            fVar5.f13733f = null;
                            fVar5.f13732d = arrayList;
                            this.f1711a = fVar4;
                            fVar4.f13731c = true;
                        } else {
                            throw new IllegalArgumentException("unexpected branch: " + fVar2);
                        }
                    } else if (fVar2 != null) {
                        List emptyList = Collections.emptyList();
                        n2.f fVar6 = new n2.f();
                        b(fVar6);
                        n2.f fVar7 = (n2.f) this.f1711a;
                        fVar7.e = fVar6;
                        fVar7.f13733f = fVar2;
                        fVar7.f13732d = emptyList;
                        this.f1711a = fVar6;
                        fVar6.f13731c = true;
                    } else {
                        throw new IllegalArgumentException("branch == null");
                    }
                } else if (fVar2 != null) {
                    ((n2.f) this.f1711a).e = fVar2;
                    this.f1711a = null;
                } else {
                    throw new IllegalArgumentException("branch == null");
                }
            } else if (fVar2 == null) {
                this.f1711a = null;
            } else {
                throw new IllegalArgumentException("unexpected branch: " + fVar2);
            }
        } else if (fVar2 != null) {
            throw new IllegalArgumentException("unexpected branch: " + fVar2);
        }
    }

    public void b(n2.f fVar) {
        m mVar = fVar.f13730b;
        if (mVar != this) {
            if (mVar == null) {
                fVar.f13730b = this;
                ((ArrayList) this.f1714d).add(fVar);
                return;
            }
            throw new IllegalArgumentException("Cannot adopt label; it belongs to another Code");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r6 == 7) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(n2.g r12, n2.g r13) {
        /*
            r11 = this;
            n2.i r0 = r13.f13736b
            v2.c r0 = r0.f13754b
            int r1 = r0.f16076V
            r2 = 9
            r3 = 1
            if (r1 != r2) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r4 = 0
            if (r2 == 0) goto L_0x0037
            t2.q r0 = new t2.q
            t2.n r6 = t2.o.f15250L1
            t2.k r13 = r13.a()
            t2.l r8 = t2.l.h(r13)
            n2.i r13 = r12.f13736b
            u2.u r10 = r13.f13755c
            java.lang.Object r13 = r11.f1717h
            r7 = r13
            t2.p r7 = (t2.p) r7
            java.lang.Object r13 = r11.f1718j
            r9 = r13
            v2.b r9 = (v2.C1559b) r9
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.a(r0, r4)
            r11.j(r12, r3)
            goto L_0x00da
        L_0x0037:
            t2.i r2 = new t2.i
            n2.i r3 = r12.f13736b
            v2.c r3 = r3.f13754b
            r5 = 6
            if (r1 != r5) goto L_0x0059
            int r1 = r3.f16076V
            r6 = 2
            if (r1 == r6) goto L_0x0055
            r6 = 3
            if (r1 == r6) goto L_0x0051
            r6 = 8
            if (r1 == r6) goto L_0x004d
            goto L_0x0059
        L_0x004d:
            t2.n r0 = t2.o.f15291Z0
            goto L_0x00c4
        L_0x0051:
            t2.n r0 = t2.o.f15288Y0
            goto L_0x00c4
        L_0x0055:
            t2.n r0 = t2.o.f15285X0
            goto L_0x00c4
        L_0x0059:
            t2.n r1 = t2.o.f15293a
            int r1 = r3.b()
            int r6 = r0.b()
            r7 = 7
            r8 = 5
            r9 = 4
            if (r6 == r9) goto L_0x009e
            if (r6 == r8) goto L_0x008e
            if (r6 == r5) goto L_0x006f
            if (r6 != r7) goto L_0x00a7
            goto L_0x0075
        L_0x006f:
            if (r1 == r9) goto L_0x008b
            if (r1 == r8) goto L_0x0088
            if (r1 == r7) goto L_0x0085
        L_0x0075:
            if (r1 == r9) goto L_0x0082
            if (r1 == r8) goto L_0x007f
            if (r1 == r5) goto L_0x007c
            goto L_0x008e
        L_0x007c:
            t2.n r0 = t2.o.f15249L0
            goto L_0x00c4
        L_0x007f:
            t2.n r0 = t2.o.f15270S0
            goto L_0x00c4
        L_0x0082:
            t2.n r0 = t2.o.f15279V0
            goto L_0x00c4
        L_0x0085:
            t2.n r0 = t2.o.f15258O0
            goto L_0x00c4
        L_0x0088:
            t2.n r0 = t2.o.f15267R0
            goto L_0x00c4
        L_0x008b:
            t2.n r0 = t2.o.f15276U0
            goto L_0x00c4
        L_0x008e:
            if (r1 == r9) goto L_0x009b
            if (r1 == r5) goto L_0x0098
            if (r1 == r7) goto L_0x0095
            goto L_0x009e
        L_0x0095:
            t2.n r0 = t2.o.f15261P0
            goto L_0x00c4
        L_0x0098:
            t2.n r0 = t2.o.f15252M0
            goto L_0x00c4
        L_0x009b:
            t2.n r0 = t2.o.f15282W0
            goto L_0x00c4
        L_0x009e:
            if (r1 == r8) goto L_0x00c2
            if (r1 == r5) goto L_0x00bf
            if (r1 != r7) goto L_0x00a7
            t2.n r0 = t2.o.f15264Q0
            goto L_0x00c4
        L_0x00a7:
            v2.b r12 = v2.C1559b.i(r3, r0)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "bad types: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00bf:
            t2.n r0 = t2.o.f15255N0
            goto L_0x00c4
        L_0x00c2:
            t2.n r0 = t2.o.f15273T0
        L_0x00c4:
            t2.k r12 = r12.a()
            t2.k r13 = r13.a()
            t2.l r13 = t2.l.h(r13)
            java.lang.Object r1 = r11.f1717h
            t2.p r1 = (t2.p) r1
            r2.<init>(r0, r1, r12, r13)
            r11.a(r2, r4)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.m.c(n2.g, n2.g):void");
    }

    public g e(int i8, i iVar) {
        if (((g) this.e) != null) {
            i8++;
        }
        g gVar = (g) ((ArrayList) this.f1715f).get(i8);
        d(gVar, iVar);
        return gVar;
    }

    public void f() {
        n nVar;
        if (!this.f1712b) {
            this.f1712b = true;
            Iterator it = ((ArrayList) this.f1716g).iterator();
            int i8 = 0;
            while (it.hasNext()) {
                g gVar = (g) it.next();
                gVar.f13737c = i8;
                i iVar = gVar.f13736b;
                gVar.f13738d = k.e(i8, iVar.f13754b);
                i8 += iVar.f13754b.d();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) this.f1715f).iterator();
            int i9 = i8;
            while (it2.hasNext()) {
                g gVar2 = (g) it2.next();
                j i10 = j.i(i9 - i8);
                gVar2.f13737c = i9;
                i iVar2 = gVar2.f13736b;
                gVar2.f13738d = k.e(i9, iVar2.f13754b);
                i9 += iVar2.f13754b.d();
                c cVar = iVar2.f13754b;
                n nVar2 = t2.o.f15293a;
                int b8 = cVar.b();
                if (b8 == 4) {
                    nVar = t2.o.f15327j;
                } else if (b8 == 5) {
                    nVar = t2.o.i;
                } else if (b8 == 6) {
                    nVar = t2.o.f15316g;
                } else if (b8 == 7) {
                    nVar = t2.o.f15320h;
                } else if (b8 == 9) {
                    nVar = t2.o.f15331k;
                } else {
                    t2.o.a(cVar);
                    throw null;
                }
                n nVar3 = nVar;
                arrayList.add(new C1426h(nVar3, (p) this.f1717h, gVar2.a(), l.f15206W, i10));
            }
            ((n2.f) ((ArrayList) this.f1714d).get(0)).f13729a.addAll(0, arrayList);
            return;
        }
        throw new AssertionError();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [y2.c, t2.l] */
    public void g(n nVar, h hVar, g gVar, g gVar2, g... gVarArr) {
        int i8;
        if (gVar2 != null) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        ? cVar = new C1628c(gVarArr.length + i8);
        if (gVar2 != null) {
            cVar.f(0, gVar2.a());
        }
        for (int i9 = 0; i9 < gVarArr.length; i9++) {
            cVar.f(i9 + i8, gVarArr[i9].a());
        }
        q qVar = hVar.e;
        n nVar2 = nVar;
        a(new t2.q(nVar2, (p) this.f1717h, cVar, (C1559b) this.f1718j, qVar), (n2.f) null);
        if (gVar != null) {
            j(gVar, false);
        }
    }

    public void h(h hVar, g gVar, g gVar2, g... gVarArr) {
        String a8 = hVar.a(true);
        if (a8 != null) {
            ConcurrentHashMap concurrentHashMap = C1558a.f16000Y;
            C1558a aVar = (C1558a) concurrentHashMap.get(a8);
            if (aVar == null) {
                C1558a b8 = C1558a.b(a8);
                C1558a aVar2 = (C1558a) concurrentHashMap.putIfAbsent(b8.f16001U, b8);
                if (aVar2 != null) {
                    aVar = aVar2;
                } else {
                    aVar = b8;
                }
            }
            n nVar = t2.o.f15293a;
            g(new n(51, aVar.c(), C1559b.f16018d0), hVar, gVar, gVar2, gVarArr);
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = C1558a.f16000Y;
        throw new NullPointerException("descriptor == null");
    }

    public void i(g gVar, Object obj) {
        n nVar;
        if (obj == null) {
            nVar = t2.o.f15351q;
        } else {
            c cVar = gVar.f13736b.f13754b;
            n nVar2 = t2.o.f15293a;
            cVar.getClass();
            if (cVar == c.f16059j0) {
                nVar = t2.o.f15351q;
            } else {
                int b8 = cVar.b();
                if (b8 == 4) {
                    nVar = t2.o.f15346o;
                } else if (b8 == 5) {
                    nVar = t2.o.f15343n;
                } else if (b8 == 6) {
                    nVar = t2.o.f15335l;
                } else if (b8 == 7) {
                    nVar = t2.o.f15339m;
                } else if (b8 == 9) {
                    nVar = t2.o.f15349p;
                } else {
                    t2.o.a(cVar);
                    throw null;
                }
            }
        }
        n nVar3 = nVar;
        if (nVar3.e == 1) {
            a(new C1426h(nVar3, (p) this.f1717h, gVar.a(), l.f15206W, a.i(obj)), (n2.f) null);
            return;
        }
        a(new t2.q(nVar3, (p) this.f1717h, l.f15206W, (C1559b) this.f1718j, a.i(obj)), (n2.f) null);
        j(gVar, true);
    }

    public void j(g gVar, boolean z) {
        n nVar;
        if (z) {
            c cVar = gVar.f13736b.f13754b;
            n nVar2 = t2.o.f15293a;
            cVar.getClass();
            nVar = new n(56, cVar, C1559b.f16011W, (String) null);
        } else {
            c cVar2 = gVar.f13736b.f13754b;
            n nVar3 = t2.o.f15293a;
            cVar2.getClass();
            nVar = new n(55, cVar2, C1559b.f16011W, (String) null);
        }
        a(new t2.i(nVar, (p) this.f1717h, gVar.a(), l.f15206W), (n2.f) null);
    }

    public g k(i iVar) {
        if (!this.f1712b) {
            g gVar = new g(this, iVar);
            ((ArrayList) this.f1716g).add(gVar);
            return gVar;
        }
        throw new IllegalStateException("Cannot allocate locals after adding instructions");
    }

    public void l(C0339d dVar) {
        k1.p pVar;
        String str;
        String str2;
        if (this.f1712b && !dVar.equals((C0339d) this.f1717h)) {
            this.f1717h = dVar;
            y yVar = (y) ((B) this.f1714d).f141V;
            yVar.getClass();
            Looper myLooper = Looper.myLooper();
            Looper looper = yVar.f5650f0;
            if (looper != myLooper) {
                if (looper == null) {
                    str = "null";
                } else {
                    str = looper.getThread().getName();
                }
                if (myLooper == null) {
                    str2 = "null";
                } else {
                    str2 = myLooper.getThread().getName();
                }
                throw new IllegalStateException("Current looper (" + str2 + ") is not the playback looper (" + str + ")");
            } else if (!dVar.equals(yVar.f5669w)) {
                yVar.f5669w = dVar;
                P p3 = yVar.f5664r;
                if (p3 != null) {
                    V0.B b8 = (V0.B) p3.f2027U;
                    synchronized (b8.f4798U) {
                        pVar = b8.f4814k0;
                    }
                    if (pVar != null) {
                        pVar.h();
                    }
                }
            }
        }
    }

    public void m(g gVar) {
        n nVar;
        i iVar = gVar.f13736b;
        h hVar = (h) this.f1713c;
        boolean equals = iVar.equals(hVar.f13740b);
        i iVar2 = gVar.f13736b;
        if (equals) {
            c cVar = iVar2.f13754b;
            n nVar2 = t2.o.f15293a;
            int b8 = cVar.b();
            if (b8 == 0) {
                nVar = t2.o.f15295a1;
            } else if (b8 == 9) {
                nVar = t2.o.f15314f1;
            } else if (b8 == 4) {
                nVar = t2.o.f15310e1;
            } else if (b8 == 5) {
                nVar = t2.o.f15307d1;
            } else if (b8 == 6) {
                nVar = t2.o.f15299b1;
            } else if (b8 == 7) {
                nVar = t2.o.f15303c1;
            } else {
                t2.o.a(cVar);
                throw null;
            }
            a(new t2.i(nVar, (p) this.f1717h, (k) null, l.h(gVar.a())), (n2.f) null);
            return;
        }
        throw new IllegalArgumentException("declared " + hVar.f13740b + " but returned " + iVar2);
    }

    public void n() {
        h hVar = (h) this.f1713c;
        if (hVar.f13740b.equals(i.f13749l)) {
            a(new t2.i(t2.o.f15295a1, (p) this.f1717h, (k) null, l.f15206W), (n2.f) null);
            return;
        }
        throw new IllegalArgumentException("declared " + hVar.f13740b + " but returned void");
    }

    public void o(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        P p3 = (P) this.i;
        P p8 = null;
        if (p3 == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) p3.f2027U;
        }
        int i8 = z.f3748a;
        if (!Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            if (audioDeviceInfo != null) {
                p8 = new P((Object) audioDeviceInfo);
            }
            this.i = p8;
            l(C0339d.b((Context) this.f1713c, (C0117e) this.f1718j, p8));
        }
    }

    public m(Context context, B b8, C0117e eVar, P p3) {
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.f1713c = applicationContext;
        this.f1714d = b8;
        this.f1718j = eVar;
        this.i = p3;
        int i8 = z.f3748a;
        Looper myLooper = Looper.myLooper();
        C0341f fVar = null;
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, (Handler.Callback) null);
        this.f1711a = handler;
        this.e = z.f3748a >= 23 ? new C0340e(this) : null;
        this.f1715f = new N5.f(4, this);
        C0339d dVar = C0339d.f5512c;
        String str = z.f3750c;
        if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
            uri = Settings.Global.getUriFor("external_surround_sound_enabled");
        } else {
            uri = null;
        }
        this.f1716g = uri != null ? new C0341f(this, handler, applicationContext.getContentResolver(), uri) : fVar;
    }

    public m(n2.c cVar) {
        this.f1714d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f1715f = arrayList;
        this.f1716g = new ArrayList();
        this.f1717h = p.f15377a;
        new ArrayList();
        this.i = new ArrayList();
        this.f1718j = C1559b.f16011W;
        h hVar = cVar.f13716a;
        this.f1713c = hVar;
        if ((cVar.f13717b & 8) != 0) {
            this.e = null;
        } else {
            g gVar = new g(this, hVar.f13739a);
            this.e = gVar;
            arrayList.add(gVar);
        }
        for (i gVar2 : hVar.f13742d.f13756a) {
            ((ArrayList) this.f1715f).add(new g(this, gVar2));
        }
        n2.f fVar = new n2.f();
        this.f1711a = fVar;
        b(fVar);
        ((n2.f) this.f1711a).f13731c = true;
    }
}
