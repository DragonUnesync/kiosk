package T7;

import B.q0;
import S7.g;
import S7.l;
import java.io.Reader;

public final class j1 extends i1 {
    public final String c() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    public final E d() {
        return E.f5080d;
    }

    public final void e(Reader reader, String str, q0 q0Var) {
        super.e(reader, str, q0Var);
        g gVar = this.f5246d.f4553d0;
        gVar.f4552Z = 2;
        gVar.f4547U = l.xhtml;
        gVar.f4549W = false;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [S7.o, S7.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r8.startsWith("?") != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(Q0.d r8) {
        /*
            r7 = this;
            r7.f5248g = r8
            int r0 = r8.f4018V
            int r0 = u.C1477r.h(r0)
            r1 = 1
            if (r0 == 0) goto L_0x014f
            r2 = 0
            if (r0 == r1) goto L_0x00ef
            r3 = 2
            if (r0 == r3) goto L_0x009d
            r2 = 3
            if (r0 == r2) goto L_0x005d
            r2 = 4
            if (r0 == r2) goto L_0x0041
            r2 = 5
            if (r0 != r2) goto L_0x001c
            goto L_0x017e
        L_0x001c:
            int r8 = r8.f4018V
            switch(r8) {
                case 1: goto L_0x0033;
                case 2: goto L_0x0030;
                case 3: goto L_0x002d;
                case 4: goto L_0x002a;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.String r8 = "null"
            goto L_0x0035
        L_0x0024:
            java.lang.String r8 = "EOF"
            goto L_0x0035
        L_0x0027:
            java.lang.String r8 = "Character"
            goto L_0x0035
        L_0x002a:
            java.lang.String r8 = "Comment"
            goto L_0x0035
        L_0x002d:
            java.lang.String r8 = "EndTag"
            goto L_0x0035
        L_0x0030:
            java.lang.String r8 = "StartTag"
            goto L_0x0035
        L_0x0033:
            java.lang.String r8 = "Doctype"
        L_0x0035:
            java.lang.String r0 = "Unexpected token type: "
            java.lang.String r8 = r0.concat(r8)
            Q7.h r0 = new Q7.h
            r0.<init>(r8)
            throw r0
        L_0x0041:
            T7.I r8 = (T7.I) r8
            java.lang.String r0 = r8.f5095W
            boolean r8 = r8 instanceof T7.H
            if (r8 == 0) goto L_0x004f
            S7.d r8 = new S7.d
            r8.<init>(r0)
            goto L_0x0054
        L_0x004f:
            S7.v r8 = new S7.v
            r8.<init>(r0)
        L_0x0054:
            S7.k r0 = r7.a()
            r0.C(r8)
            goto L_0x017e
        L_0x005d:
            T7.J r8 = (T7.J) r8
            S7.e r0 = new S7.e
            java.lang.String r2 = r8.f5097X
            if (r2 == 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            java.lang.StringBuilder r2 = r8.f5096W
            java.lang.String r2 = r2.toString()
        L_0x006c:
            r0.<init>(r2)
            boolean r8 = r8.f5098Y
            if (r8 == 0) goto L_0x0094
            java.lang.String r8 = r0.C()
            int r2 = r8.length()
            if (r2 <= r1) goto L_0x0094
            java.lang.String r2 = "!"
            boolean r2 = r8.startsWith(r2)
            if (r2 != 0) goto L_0x008d
            java.lang.String r2 = "?"
            boolean r8 = r8.startsWith(r2)
            if (r8 == 0) goto L_0x0094
        L_0x008d:
            S7.w r8 = r0.E()
            if (r8 == 0) goto L_0x0094
            r0 = r8
        L_0x0094:
            S7.k r8 = r7.a()
            r8.C(r0)
            goto L_0x017e
        L_0x009d:
            T7.M r8 = (T7.M) r8
            T7.E r0 = r7.f5249h
            java.lang.String r8 = r8.f5104W
            java.lang.String r8 = r0.b(r8)
            java.util.ArrayList r0 = r7.e
            int r0 = r0.size()
            int r3 = r0 + -1
            r4 = 256(0x100, float:3.59E-43)
            if (r3 < r4) goto L_0x00b6
            int r0 = r0 + -257
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            java.util.ArrayList r3 = r7.e
            int r3 = r3.size()
            int r3 = r3 - r1
        L_0x00be:
            if (r3 < r0) goto L_0x00d7
            java.util.ArrayList r4 = r7.e
            java.lang.Object r4 = r4.get(r3)
            S7.k r4 = (S7.k) r4
            java.lang.String r5 = r4.q()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x00d4
            r2 = r4
            goto L_0x00d7
        L_0x00d4:
            int r3 = r3 + -1
            goto L_0x00be
        L_0x00d7:
            if (r2 != 0) goto L_0x00db
            goto L_0x017e
        L_0x00db:
            java.util.ArrayList r8 = r7.e
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e2:
            if (r8 < 0) goto L_0x017e
            S7.k r0 = r7.g()
            if (r0 != r2) goto L_0x00ec
            goto L_0x017e
        L_0x00ec:
            int r8 = r8 + -1
            goto L_0x00e2
        L_0x00ef:
            T7.N r8 = (T7.N) r8
            java.lang.String r0 = r8.f5104W
            if (r0 == 0) goto L_0x0147
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r8.f5104W
            T7.E r3 = r7.f5249h
            java.util.HashMap r4 = r7.i
            java.lang.Object r4 = r4.get(r0)
            T7.G r4 = (T7.G) r4
            java.lang.String r5 = "http://www.w3.org/XML/1998/namespace"
            if (r4 == 0) goto L_0x0113
            java.lang.String r6 = r4.f5087W
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x011c
        L_0x0113:
            T7.G r4 = T7.G.b(r0, r5, r3)
            java.util.HashMap r3 = r7.i
            r3.put(r0, r4)
        L_0x011c:
            S7.c r0 = r8.f5107Z
            if (r0 == 0) goto L_0x0125
            T7.E r3 = r7.f5249h
            r0.f(r3)
        L_0x0125:
            S7.k r0 = new S7.k
            T7.E r3 = r7.f5249h
            S7.c r5 = r8.f5107Z
            r3.a(r5)
            r0.<init>(r4, r2, r5)
            S7.k r2 = r7.a()
            r2.C(r0)
            java.util.ArrayList r2 = r7.e
            r2.add(r0)
            boolean r8 = r8.f5106Y
            if (r8 == 0) goto L_0x017e
            r4.f5091a0 = r1
            r7.g()
            goto L_0x017e
        L_0x0147:
            Q7.h r8 = new Q7.h
            java.lang.String r0 = "Must be false"
            r8.<init>(r0)
            throw r8
        L_0x014f:
            T7.K r8 = (T7.K) r8
            S7.i r0 = new S7.i
            T7.E r2 = r7.f5249h
            java.lang.StringBuilder r3 = r8.f5099W
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.b(r3)
            java.lang.StringBuilder r3 = r8.f5101Y
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = r8.f5102Z
            java.lang.String r4 = r4.toString()
            r0.<init>(r2, r3, r4)
            java.lang.String r8 = r8.f5100X
            if (r8 == 0) goto L_0x0177
            java.lang.String r2 = "pubSysKey"
            r0.d(r2, r8)
        L_0x0177:
            S7.k r8 = r7.a()
            r8.C(r0)
        L_0x017e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.j1.h(Q0.d):boolean");
    }
}
