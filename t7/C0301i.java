package T7;

/* 'enum' modifier removed */
/* renamed from: T7.i  reason: case insensitive filesystem */
public final class C0301i extends B {
    public C0301i() {
        super("InSelect", 15);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r8.equals("optgroup") == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(Q0.d r13, T7.C0287b r14) {
        /*
            r12 = this;
            java.lang.String r0 = "select"
            java.lang.String r1 = "template"
            r2 = 3
            r3 = 2
            java.lang.String r4 = "option"
            java.lang.String r5 = "optgroup"
            r6 = 1
            r7 = 0
            int r8 = r13.f4018V
            int r8 = u.C1477r.h(r8)
            if (r8 == 0) goto L_0x0167
            T7.u r9 = T7.B.f5054X
            java.lang.String r10 = "html"
            if (r8 == r6) goto L_0x00e0
            if (r8 == r3) goto L_0x004f
            if (r8 == r2) goto L_0x0048
            r0 = 4
            if (r8 == r0) goto L_0x0033
            r13 = 5
            if (r8 == r13) goto L_0x0028
            r14.s(r12)
            return r7
        L_0x0028:
            boolean r13 = r14.b(r10)
            if (r13 != 0) goto L_0x0123
            r14.s(r12)
            goto L_0x0123
        L_0x0033:
            T7.I r13 = (T7.I) r13
            java.lang.String r0 = r13.f5095W
            java.lang.String r1 = T7.B.f5074s0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r14.s(r12)
            return r7
        L_0x0043:
            r14.C(r13)
            goto L_0x0123
        L_0x0048:
            T7.J r13 = (T7.J) r13
            r14.E(r13)
            goto L_0x0123
        L_0x004f:
            r8 = r13
            T7.M r8 = (T7.M) r8
            java.lang.String r8 = r8.f5105X
            r8.getClass()
            r10 = -1
            int r11 = r8.hashCode()
            switch(r11) {
                case -1321546630: goto L_0x007a;
                case -1010136971: goto L_0x0071;
                case -906021636: goto L_0x0068;
                case -80773204: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            r2 = -1
            goto L_0x0082
        L_0x0061:
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L_0x0082
            goto L_0x005f
        L_0x0068:
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x005f
        L_0x006f:
            r2 = 2
            goto L_0x0082
        L_0x0071:
            boolean r0 = r8.equals(r4)
            if (r0 != 0) goto L_0x0078
            goto L_0x005f
        L_0x0078:
            r2 = 1
            goto L_0x0082
        L_0x007a:
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x0081
            goto L_0x005f
        L_0x0081:
            r2 = 0
        L_0x0082:
            switch(r2) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00b9;
                case 3: goto L_0x0089;
                default: goto L_0x0085;
            }
        L_0x0085:
            r14.s(r12)
            return r7
        L_0x0089:
            boolean r13 = r14.b(r4)
            if (r13 == 0) goto L_0x00aa
            S7.k r13 = r14.a()
            S7.k r13 = r14.k(r13)
            if (r13 == 0) goto L_0x00aa
            S7.k r13 = r14.a()
            S7.k r13 = r14.k(r13)
            boolean r13 = r13.o(r5)
            if (r13 == 0) goto L_0x00aa
            r14.i(r4)
        L_0x00aa:
            boolean r13 = r14.b(r5)
            if (r13 == 0) goto L_0x00b5
            r14.g()
            goto L_0x0123
        L_0x00b5:
            r14.s(r12)
            goto L_0x0123
        L_0x00b9:
            boolean r13 = r14.z(r8)
            if (r13 != 0) goto L_0x00c3
            r14.s(r12)
            return r7
        L_0x00c3:
            r14.N(r8)
            r14.T()
            goto L_0x0123
        L_0x00ca:
            boolean r13 = r14.b(r4)
            if (r13 == 0) goto L_0x00d4
            r14.g()
            goto L_0x0123
        L_0x00d4:
            r14.s(r12)
            goto L_0x0123
        L_0x00d8:
            r14.getClass()
            boolean r13 = r9.d(r13, r14)
            return r13
        L_0x00e0:
            r2 = r13
            T7.N r2 = (T7.N) r2
            java.lang.String r3 = r2.f5105X
            boolean r8 = r3.equals(r10)
            if (r8 == 0) goto L_0x00f5
            T7.x r13 = T7.B.f5057a0
            r14.getClass()
            boolean r13 = r13.d(r2, r14)
            return r13
        L_0x00f5:
            boolean r8 = r3.equals(r4)
            if (r8 == 0) goto L_0x0108
            boolean r13 = r14.b(r4)
            if (r13 == 0) goto L_0x0104
            r14.i(r4)
        L_0x0104:
            r14.F(r2)
            goto L_0x0123
        L_0x0108:
            boolean r8 = r3.equals(r5)
            if (r8 == 0) goto L_0x0124
            boolean r13 = r14.b(r4)
            if (r13 == 0) goto L_0x0117
            r14.i(r4)
        L_0x0117:
            boolean r13 = r14.b(r5)
            if (r13 == 0) goto L_0x0120
            r14.i(r5)
        L_0x0120:
            r14.F(r2)
        L_0x0123:
            return r6
        L_0x0124:
            boolean r4 = r3.equals(r0)
            if (r4 == 0) goto L_0x0132
            r14.s(r12)
            boolean r13 = r14.i(r0)
            return r13
        L_0x0132:
            java.lang.String[] r4 = T7.A.f5020G
            boolean r4 = R7.h.d(r3, r4)
            if (r4 == 0) goto L_0x014c
            r14.s(r12)
            boolean r13 = r14.z(r0)
            if (r13 != 0) goto L_0x0144
            return r7
        L_0x0144:
            r14.i(r0)
            boolean r13 = r14.h(r2)
            return r13
        L_0x014c:
            java.lang.String r0 = "script"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x015f
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x015b
            goto L_0x015f
        L_0x015b:
            r14.s(r12)
            return r7
        L_0x015f:
            r14.getClass()
            boolean r13 = r9.d(r13, r14)
            return r13
        L_0x0167:
            r14.s(r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.C0301i.d(Q0.d, T7.b):boolean");
    }
}
