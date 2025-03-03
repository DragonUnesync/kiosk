package T7;

import Q0.d;
import R7.h;

public enum B {
    ;
    

    /* renamed from: s0  reason: collision with root package name */
    public static final String f5074s0 = null;

    static {
        f5074s0 = String.valueOf(0);
    }

    public static boolean a(d dVar) {
        if (dVar.j()) {
            return h.e(((I) dVar).f5095W);
        }
        return false;
    }

    public static void b(N n4, C0287b bVar) {
        bVar.f5245c.p(h1.f5201Y);
        bVar.f5162m = bVar.f5161l;
        bVar.f5161l = f5058b0;
        bVar.F(n4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(T7.N r7, S7.k r8) {
        /*
            S7.c r7 = r7.f5107Z
            if (r7 == 0) goto L_0x007b
            r7.getClass()
            S7.b r0 = new S7.b
            r0.<init>(r7)
        L_0x000c:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x007b
            java.lang.Object r7 = r0.next()
            S7.a r7 = (S7.a) r7
            S7.c r1 = r8.e()
            java.lang.String r2 = r7.f4538U
            boolean r3 = r1.i(r2)
            if (r3 != 0) goto L_0x000c
            S7.c r3 = r7.f4540W
            if (r3 != 0) goto L_0x002b
            int r2 = S7.s.f4586c
            goto L_0x006d
        L_0x002b:
            boolean r4 = r3.i(r2)
            if (r4 != 0) goto L_0x0034
            int r2 = S7.s.f4586c
            goto L_0x006d
        L_0x0034:
            java.lang.String r4 = "/jsoup.userdata"
            boolean r5 = r3.i(r4)
            if (r5 != 0) goto L_0x003e
            r3 = 0
            goto L_0x005b
        L_0x003e:
            int r5 = r3.k(r4)
            r6 = -1
            if (r5 != r6) goto L_0x004e
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.c(r4, r5)
            goto L_0x0055
        L_0x004e:
            java.lang.Object[] r3 = r3.f4546W
            r3 = r3[r5]
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5
        L_0x0055:
            java.lang.String r3 = "jsoup.attrs"
            java.lang.Object r3 = r5.get(r3)
        L_0x005b:
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0062
            int r2 = S7.s.f4586c
            goto L_0x006d
        L_0x0062:
            java.lang.Object r2 = r3.get(r2)
            S7.s r2 = (S7.s) r2
            if (r2 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            int r2 = S7.s.f4586c
        L_0x006d:
            java.lang.String r2 = r7.f4539V
            if (r2 != 0) goto L_0x0073
            java.lang.String r2 = ""
        L_0x0073:
            java.lang.String r3 = r7.f4538U
            r1.n(r3, r2)
            r7.f4540W = r1
            goto L_0x000c
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.B.c(T7.N, S7.k):void");
    }

    public abstract boolean d(d dVar, C0287b bVar);
}
