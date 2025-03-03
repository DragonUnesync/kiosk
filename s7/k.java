package S7;

import D7.b;
import H3.P;
import Q7.g;
import R7.h;
import T7.E;
import T7.G;
import U7.d;
import U7.e;
import U7.p;
import U7.r;
import g7.C0996d;
import j$.util.stream.Collectors;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class k extends p {

    /* renamed from: b0  reason: collision with root package name */
    public static final List f4557b0 = Collections.emptyList();

    /* renamed from: c0  reason: collision with root package name */
    public static final String f4558c0 = "/baseUri";

    /* renamed from: X  reason: collision with root package name */
    public final G f4559X;

    /* renamed from: Y  reason: collision with root package name */
    public WeakReference f4560Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f4561Z;

    /* renamed from: a0  reason: collision with root package name */
    public c f4562a0;

    static {
        Pattern.compile("\\s+");
    }

    public k(G g8, String str, c cVar) {
        g.D(g8);
        this.f4561Z = p.f4577W;
        this.f4562a0 = cVar;
        this.f4559X = g8;
        if (str != null) {
            G(str);
        }
    }

    public static boolean L(p pVar) {
        if (pVar instanceof k) {
            k kVar = (k) pVar;
            int i = 0;
            while (!kVar.f4559X.f5092b0) {
                kVar = (k) kVar.f4578U;
                i++;
                if (i < 6) {
                    if (kVar == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final p B() {
        p pVar = this;
        while (true) {
            p pVar2 = pVar.f4578U;
            if (pVar2 == null) {
                return (k) pVar;
            }
            pVar = pVar2;
        }
    }

    public final void C(p pVar) {
        p pVar2 = pVar.f4578U;
        if (pVar2 != null) {
            pVar2.z(pVar);
        }
        pVar.f4578U = this;
        k();
        this.f4561Z.add(pVar);
        pVar.f4579V = this.f4561Z.size() - 1;
    }

    public final k D(String str) {
        k kVar = new k(G.b(str, this.f4559X.f5087W, (E) C0996d.t(this).f302X), f(), (c) null);
        C(kVar);
        return kVar;
    }

    public final List E() {
        List list;
        if (this.f4561Z.size() == 0) {
            return f4557b0;
        }
        WeakReference weakReference = this.f4560Y;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f4561Z.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            p pVar = (p) this.f4561Z.get(i);
            if (pVar instanceof k) {
                arrayList.add((k) pVar);
            }
        }
        this.f4560Y = new WeakReference(arrayList);
        return arrayList;
    }

    /* renamed from: F */
    public k h() {
        return (k) super.clone();
    }

    public final void G(String str) {
        e().n(f4558c0, str);
    }

    public final int H() {
        p pVar = this.f4578U;
        if (((k) pVar) == null) {
            return 0;
        }
        List E8 = ((k) pVar).E();
        int size = E8.size();
        for (int i = 0; i < size; i++) {
            if (E8.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    public final k I() {
        p pVar;
        if (g() == 0) {
            pVar = null;
        } else {
            pVar = (p) k().get(0);
        }
        while (pVar != null) {
            if (pVar instanceof k) {
                return (k) pVar;
            }
            pVar = pVar.p();
        }
        return null;
    }

    public final k J() {
        p pVar = this;
        do {
            pVar = pVar.p();
            if (pVar == null) {
                return null;
            }
        } while (!(pVar instanceof k));
        return (k) pVar;
    }

    public final String K() {
        StringBuilder b8 = h.b();
        for (int i = 0; i < this.f4561Z.size(); i++) {
            p pVar = (p) this.f4561Z.get(i);
            if (pVar instanceof v) {
                v vVar = (v) pVar;
                String C8 = vVar.C();
                if (L(vVar.f4578U) || (vVar instanceof d)) {
                    b8.append(C8);
                } else {
                    h.a(C8, b8, v.F(b8));
                }
            } else if (pVar.o("br") && !v.F(b8)) {
                b8.append(" ");
            }
        }
        return h.h(b8).trim();
    }

    public final d M(String str) {
        g.A(str);
        p k8 = r.k(str);
        g.D(k8);
        k8.c();
        return (d) C0996d.z(this, k.class).filter(new e(k8, this)).collect(Collectors.toCollection(new E7.d(8)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (R7.h.e(((S7.v) r3).C()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (o("br") == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean N(S7.g r3) {
        /*
            r2 = this;
            boolean r3 = r3.f4549W
            if (r3 == 0) goto L_0x0055
            T7.G r3 = r2.f4559X
            boolean r3 = r3.f5088X
            if (r3 != 0) goto L_0x0017
            S7.p r0 = r2.f4578U
            S7.k r0 = (S7.k) r0
            if (r0 == 0) goto L_0x0055
            T7.G r0 = r0.f4559X
            boolean r0 = r0.f5089Y
            if (r0 != 0) goto L_0x0017
            goto L_0x0055
        L_0x0017:
            r0 = 1
            if (r3 == 0) goto L_0x001b
            goto L_0x004c
        L_0x001b:
            S7.p r3 = r2.f4578U
            S7.k r3 = (S7.k) r3
            if (r3 == 0) goto L_0x0027
            T7.G r3 = r3.f4559X
            boolean r3 = r3.f5088X
            if (r3 == 0) goto L_0x004c
        L_0x0027:
            int r3 = r2.f4579V
            if (r3 != 0) goto L_0x002c
            goto L_0x004c
        L_0x002c:
            if (r3 != r0) goto L_0x0043
            S7.p r3 = r2.w()
            boolean r1 = r3 instanceof S7.v
            if (r1 == 0) goto L_0x0043
            S7.v r3 = (S7.v) r3
            java.lang.String r3 = r3.C()
            boolean r3 = R7.h.e(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x004c
        L_0x0043:
            java.lang.String r3 = "br"
            boolean r3 = r2.o(r3)
            if (r3 != 0) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            S7.p r3 = r2.f4578U
            boolean r3 = L(r3)
            if (r3 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.k.N(S7.g):boolean");
    }

    public final String O() {
        StringBuilder b8 = h.b();
        b.P(new P((Object) b8), this);
        return h.h(b8).trim();
    }

    public final c e() {
        if (this.f4562a0 == null) {
            this.f4562a0 = new c();
        }
        return this.f4562a0;
    }

    public final String f() {
        for (k kVar = this; kVar != null; kVar = (k) kVar.f4578U) {
            c cVar = kVar.f4562a0;
            if (cVar != null) {
                String str = f4558c0;
                if (cVar.i(str)) {
                    return kVar.f4562a0.g(str);
                }
            }
        }
        return "";
    }

    public final int g() {
        return this.f4561Z.size();
    }

    public final p i(p pVar) {
        c cVar;
        k kVar = (k) super.i(pVar);
        c cVar2 = this.f4562a0;
        if (cVar2 != null) {
            cVar = cVar2.clone();
        } else {
            cVar = null;
        }
        kVar.f4562a0 = cVar;
        j jVar = new j(kVar, this.f4561Z.size());
        kVar.f4561Z = jVar;
        jVar.addAll(this.f4561Z);
        return kVar;
    }

    public final p j() {
        for (p pVar : this.f4561Z) {
            pVar.f4578U = null;
        }
        this.f4561Z.clear();
        return this;
    }

    public final List k() {
        if (this.f4561Z == p.f4577W) {
            this.f4561Z = new j(this, 4);
        }
        return this.f4561Z;
    }

    public final boolean m() {
        if (this.f4562a0 != null) {
            return true;
        }
        return false;
    }

    public String q() {
        return this.f4559X.f5085U;
    }

    public final String r() {
        return this.f4559X.f5086V;
    }

    public void t(StringBuilder sb, int i, g gVar) {
        boolean z;
        if (N(gVar)) {
            if (!(sb instanceof StringBuilder)) {
                p.n(sb, i, gVar);
            } else if (sb.length() > 0) {
                p.n(sb, i, gVar);
            }
        }
        Appendable append = sb.append('<');
        G g8 = this.f4559X;
        append.append(g8.f5085U);
        c cVar = this.f4562a0;
        if (cVar != null) {
            cVar.j(sb, gVar);
        }
        if (this.f4561Z.isEmpty()) {
            boolean z6 = g8.f5090Z;
            if (z6 || g8.f5091a0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (gVar.f4552Z != 1 || !z6) {
                    sb.append(" />");
                    return;
                } else {
                    sb.append('>');
                    return;
                }
            }
        }
        sb.append('>');
    }

    public void u(StringBuilder sb, int i, g gVar) {
        boolean isEmpty = this.f4561Z.isEmpty();
        G g8 = this.f4559X;
        if (!isEmpty || (!g8.f5090Z && !g8.f5091a0)) {
            if (gVar.f4549W && !this.f4561Z.isEmpty() && g8.f5089Y && !L(this.f4578U)) {
                p.n(sb, i, gVar);
            }
            sb.append("</").append(g8.f5085U).append('>');
        }
    }

    public final p v() {
        return (k) this.f4578U;
    }

    public k(String str) {
        this(G.b(str, "http://www.w3.org/1999/xhtml", E.f5080d), "", (c) null);
    }
}
