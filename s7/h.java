package S7;

import B.q0;
import Q7.b;
import Q7.g;
import T7.C0287b;
import T7.E;
import T7.G;
import T7.i1;
import U7.e;
import U7.p;
import U7.r;
import g7.C0996d;
import java.nio.charset.Charset;
import java.util.Iterator;

public final class h extends k {

    /* renamed from: d0  reason: collision with root package name */
    public g f4553d0;

    /* renamed from: e0  reason: collision with root package name */
    public q0 f4554e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f4555f0;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, S7.g] */
    public h(String str, String str2) {
        super(G.b("#root", str, E.f5079c), str2, (c) null);
        ? obj = new Object();
        obj.f4547U = l.base;
        obj.f4548V = b.f4194b;
        obj.f4549W = true;
        obj.f4550X = 1;
        obj.f4551Y = 30;
        obj.f4552Z = 1;
        this.f4553d0 = obj;
        this.f4555f0 = 1;
        this.f4554e0 = new q0((i1) new C0287b());
    }

    public final k F() {
        h hVar = (h) super.h();
        hVar.f4553d0 = this.f4553d0.clone();
        return hVar;
    }

    public final k P() {
        k I8 = I();
        while (true) {
            if (I8 == null) {
                I8 = D("html");
                break;
            } else if (I8.o("html")) {
                break;
            } else {
                I8 = I8.J();
            }
        }
        for (k I9 = I8.I(); I9 != null; I9 = I9.J()) {
            if (I9.o("body") || I9.o("frameset")) {
                return I9;
            }
        }
        return I8.D("body");
    }

    public final void Q(Charset charset) {
        g gVar = this.f4553d0;
        gVar.f4548V = charset;
        int i = gVar.f4552Z;
        if (i == 1) {
            g.A("meta[charset]");
            p k8 = r.k("meta[charset]");
            k8.c();
            k kVar = (k) C0996d.z(this, k.class).filter(new e(k8, this)).findFirst().orElse((Object) null);
            if (kVar != null) {
                kVar.d("charset", this.f4553d0.f4548V.displayName());
            } else {
                k I8 = I();
                while (true) {
                    if (I8 == null) {
                        I8 = D("html");
                        break;
                    } else if (I8.o("html")) {
                        break;
                    } else {
                        I8 = I8.J();
                    }
                }
                k I9 = I8.I();
                while (true) {
                    if (I9 == null) {
                        k kVar2 = new k(G.b("head", I8.f4559X.f5087W, (E) C0996d.t(I8).f302X), I8.f(), (c) null);
                        I8.b(0, kVar2);
                        I9 = kVar2;
                        break;
                    } else if (I9.o("head")) {
                        break;
                    } else {
                        I9 = I9.J();
                    }
                }
                I9.D("meta").d("charset", this.f4553d0.f4548V.displayName());
            }
            Iterator it = M("meta[name=charset]").iterator();
            while (it.hasNext()) {
                ((k) it.next()).y();
            }
        } else if (i == 2) {
            p pVar = (p) k().get(0);
            if (pVar instanceof w) {
                w wVar = (w) pVar;
                if (wVar.C().equals("xml")) {
                    wVar.d("encoding", this.f4553d0.f4548V.displayName());
                    if (wVar.l("version")) {
                        wVar.d("version", "1.0");
                        return;
                    }
                    return;
                }
                w wVar2 = new w("xml", false);
                wVar2.d("version", "1.0");
                wVar2.d("encoding", this.f4553d0.f4548V.displayName());
                b(0, wVar2);
                return;
            }
            w wVar3 = new w("xml", false);
            wVar3.d("version", "1.0");
            wVar3.d("encoding", this.f4553d0.f4548V.displayName());
            b(0, wVar3);
        }
    }

    public final Object clone() {
        h hVar = (h) super.h();
        hVar.f4553d0 = this.f4553d0.clone();
        return hVar;
    }

    public final p h() {
        h hVar = (h) super.h();
        hVar.f4553d0 = this.f4553d0.clone();
        return hVar;
    }

    public final String q() {
        return "#document";
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [S7.p] */
    /* JADX WARNING: type inference failed for: r6v0, types: [S7.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String s() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = R7.h.b()
            java.util.List r1 = r8.f4561Z
            int r1 = r1.size()
            r2 = 0
        L_0x000b:
            r3 = 0
            if (r2 >= r1) goto L_0x0038
            java.util.List r4 = r8.f4561Z
            java.lang.Object r4 = r4.get(r2)
            S7.p r4 = (S7.p) r4
            R2.c r5 = new R2.c
            S7.p r6 = r4.B()
            boolean r7 = r6 instanceof S7.h
            if (r7 == 0) goto L_0x0023
            r3 = r6
            S7.h r3 = (S7.h) r3
        L_0x0023:
            if (r3 == 0) goto L_0x0028
        L_0x0025:
            S7.g r3 = r3.f4553d0
            goto L_0x002e
        L_0x0028:
            S7.h r3 = new S7.h
            r3.<init>()
            goto L_0x0025
        L_0x002e:
            r6 = 4
            r5.<init>(r0, r6, r3)
            D7.b.P(r5, r4)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0038:
            java.lang.String r0 = R7.h.h(r0)
            S7.p r1 = r8.B()
            boolean r2 = r1 instanceof S7.h
            if (r2 == 0) goto L_0x0047
            r3 = r1
            S7.h r3 = (S7.h) r3
        L_0x0047:
            if (r3 == 0) goto L_0x004c
            S7.g r1 = r3.f4553d0
            goto L_0x0053
        L_0x004c:
            S7.h r1 = new S7.h
            r1.<init>()
            S7.g r1 = r1.f4553d0
        L_0x0053:
            boolean r1 = r1.f4549W
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = r0.trim()
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.h.s():java.lang.String");
    }

    public h() {
        this("http://www.w3.org/1999/xhtml", "");
    }
}
