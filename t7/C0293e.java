package T7;

import Q0.d;

/* 'enum' modifier removed */
/* renamed from: T7.e  reason: case insensitive filesystem */
public final class C0293e extends B {
    public C0293e() {
        super("InColumnGroup", 11);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r7.equals("template") == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(Q0.d r11, T7.C0287b r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "template"
            java.lang.String r2 = "html"
            r3 = 2
            boolean r4 = T7.B.a(r11)
            r5 = 1
            if (r4 == 0) goto L_0x0013
            T7.I r11 = (T7.I) r11
            r12.C(r11)
            return r5
        L_0x0013:
            int r4 = r11.f4018V
            int r4 = u.C1477r.h(r4)
            if (r4 == 0) goto L_0x00bd
            T7.u r6 = T7.B.f5054X
            if (r4 == r5) goto L_0x0073
            if (r4 == r3) goto L_0x003f
            r0 = 3
            if (r4 == r0) goto L_0x0038
            r0 = 5
            if (r4 == r0) goto L_0x002c
            boolean r11 = r10.e(r11, r12)
            return r11
        L_0x002c:
            boolean r0 = r12.b(r2)
            if (r0 == 0) goto L_0x0033
            return r5
        L_0x0033:
            boolean r11 = r10.e(r11, r12)
            return r11
        L_0x0038:
            T7.J r11 = (T7.J) r11
            r12.E(r11)
            goto L_0x00c0
        L_0x003f:
            r2 = r11
            T7.M r2 = (T7.M) r2
            java.lang.String r2 = r2.f5105X
            r2.getClass()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006c
            java.lang.String r1 = "colgroup"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x005a
            boolean r11 = r10.e(r11, r12)
            return r11
        L_0x005a:
            boolean r11 = r12.b(r2)
            if (r11 != 0) goto L_0x0064
            r12.s(r10)
            return r0
        L_0x0064:
            r12.g()
            T7.z r11 = T7.B.f5059c0
            r12.f5161l = r11
            goto L_0x00c0
        L_0x006c:
            r12.getClass()
            r6.d(r11, r12)
            goto L_0x00c0
        L_0x0073:
            r4 = r11
            T7.N r4 = (T7.N) r4
            java.lang.String r7 = r4.f5105X
            r7.getClass()
            r8 = -1
            int r9 = r7.hashCode()
            switch(r9) {
                case -1321546630: goto L_0x0099;
                case 98688: goto L_0x008e;
                case 3213227: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            r0 = -1
            goto L_0x00a0
        L_0x0085:
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L_0x008c
            goto L_0x0083
        L_0x008c:
            r0 = 2
            goto L_0x00a0
        L_0x008e:
            java.lang.String r0 = "col"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0097
            goto L_0x0083
        L_0x0097:
            r0 = 1
            goto L_0x00a0
        L_0x0099:
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x00a0
            goto L_0x0083
        L_0x00a0:
            switch(r0) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00a8;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            boolean r11 = r10.e(r11, r12)
            return r11
        L_0x00a8:
            T7.x r0 = T7.B.f5057a0
            r12.getClass()
            boolean r11 = r0.d(r11, r12)
            return r11
        L_0x00b2:
            r12.G(r4)
            goto L_0x00c0
        L_0x00b6:
            r12.getClass()
            r6.d(r11, r12)
            goto L_0x00c0
        L_0x00bd:
            r12.s(r10)
        L_0x00c0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.C0293e.d(Q0.d, T7.b):boolean");
    }

    public final boolean e(d dVar, C0287b bVar) {
        if (!bVar.b("colgroup")) {
            bVar.s(this);
            return false;
        }
        bVar.g();
        bVar.f5161l = B.f5059c0;
        bVar.h(dVar);
        return true;
    }
}
