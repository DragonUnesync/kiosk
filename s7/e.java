package S7;

import B.q0;
import T7.C0287b;
import T7.E;
import T7.i1;
import g7.C0996d;
import java.io.StringReader;

public final class e extends o {
    public final w E() {
        String C8 = C();
        boolean z = true;
        String substring = C8.substring(1, C8.length() - 1);
        if (substring.length() <= 1 || (!substring.startsWith("!") && !substring.startsWith("?"))) {
            z = false;
        }
        if (z) {
            return null;
        }
        String y8 = N.e.y("<", substring, ">");
        q0 q0Var = new q0((i1) new C0287b());
        q0Var.f302X = E.f5080d;
        String f8 = f();
        h f9 = ((i1) q0Var.f300V).f(new StringReader(y8), f8, q0Var);
        if (f9.P().E().size() <= 0) {
            return null;
        }
        k kVar = (k) f9.P().E().get(0);
        w wVar = new w(((E) C0996d.t(f9).f302X).b(kVar.f4559X.f5085U), C8.startsWith("!"));
        wVar.e().b(kVar.e());
        return wVar;
    }

    public final Object clone() {
        return (e) super.clone();
    }

    public final p h() {
        return (e) super.clone();
    }

    public final String q() {
        return "#comment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (R7.h.e(((S7.v) r0).C()) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.lang.StringBuilder r3, int r4, S7.g r5) {
        /*
            r2 = this;
            boolean r0 = r5.f4549W
            if (r0 == 0) goto L_0x0032
            int r0 = r2.f4579V
            if (r0 != 0) goto L_0x0009
            goto L_0x0020
        L_0x0009:
            r1 = 1
            if (r0 != r1) goto L_0x0032
            S7.p r0 = r2.w()
            boolean r1 = r0 instanceof S7.v
            if (r1 == 0) goto L_0x0032
            S7.v r0 = (S7.v) r0
            java.lang.String r0 = r0.C()
            boolean r0 = R7.h.e(r0)
            if (r0 == 0) goto L_0x0032
        L_0x0020:
            S7.p r0 = r2.f4578U
            boolean r1 = r0 instanceof S7.k
            if (r1 == 0) goto L_0x0032
            S7.k r0 = (S7.k) r0
            T7.G r0 = r0.f4559X
            boolean r0 = r0.f5089Y
            if (r0 != 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            S7.p.n(r3, r4, r5)
        L_0x0032:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.C()
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = "-->"
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.e.t(java.lang.StringBuilder, int, S7.g):void");
    }

    public final void u(StringBuilder sb, int i, g gVar) {
    }
}
