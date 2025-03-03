package U7;

public final class f extends p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5442a;

    public /* synthetic */ f(int i) {
        this.f5442a = i;
    }

    public int a() {
        switch (this.f5442a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(S7.k r6, S7.k r7) {
        /*
            r5 = this;
            int r0 = r5.f5442a
            switch(r0) {
                case 0: goto L_0x0176;
                case 1: goto L_0x013b;
                case 2: goto L_0x0127;
                case 3: goto L_0x00f4;
                case 4: goto L_0x00b0;
                case 5: goto L_0x0080;
                case 6: goto L_0x0072;
                case 7: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r6 != r7) goto L_0x0009
            r6 = 1
            goto L_0x000a
        L_0x0009:
            r6 = 0
        L_0x000a:
            return r6
        L_0x000b:
            boolean r6 = r7 instanceof S7.r
            if (r6 == 0) goto L_0x0011
            r6 = 1
            goto L_0x0071
        L_0x0011:
            java.util.List r6 = r7.f4561Z
            j$.util.stream.Stream r6 = j$.util.Collection.-EL.stream(r6)
            G7.e r0 = new G7.e
            r1 = 3
            r0.<init>(r1)
            j$.util.stream.Stream r6 = r6.filter(r0)
            D4.h r0 = new D4.h
            r1 = 7
            r0.<init>(r1)
            j$.util.stream.Stream r6 = r6.map(r0)
            j$.util.stream.Collector r0 = j$.util.stream.Collectors.toList()
            D4.h r1 = new D4.h
            r2 = 8
            r1.<init>(r2)
            j$.util.stream.Collector r0 = j$.util.stream.Collectors.collectingAndThen(r0, r1)
            java.lang.Object r6 = r6.collect(r0)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0044:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r6.next()
            S7.v r0 = (S7.v) r0
            S7.r r1 = new S7.r
            T7.G r2 = r7.f4559X
            java.lang.String r3 = r2.f5085U
            java.lang.String r2 = r2.f5087W
            T7.E r4 = T7.E.f5080d
            T7.G r2 = T7.G.b(r3, r2, r4)
            java.lang.String r3 = r7.f()
            S7.c r4 = r7.e()
            r1.<init>(r2, r3, r4)
            r0.A(r1)
            r1.C(r0)
            goto L_0x0044
        L_0x0070:
            r6 = 0
        L_0x0071:
            return r6
        L_0x0072:
            boolean r0 = r6 instanceof S7.h
            if (r0 == 0) goto L_0x007a
            S7.k r6 = r6.I()
        L_0x007a:
            if (r7 != r6) goto L_0x007e
            r6 = 1
            goto L_0x007f
        L_0x007e:
            r6 = 0
        L_0x007f:
            return r6
        L_0x0080:
            S7.p r6 = r7.f4578U
            S7.k r6 = (S7.k) r6
            r0 = 0
            if (r6 == 0) goto L_0x00af
            boolean r1 = r6 instanceof S7.h
            if (r1 == 0) goto L_0x008c
            goto L_0x00af
        L_0x008c:
            S7.k r6 = r6.I()
            r1 = 0
        L_0x0091:
            r2 = 1
            if (r6 == 0) goto L_0x00ac
            T7.G r3 = r6.f4559X
            java.lang.String r3 = r3.f5086V
            T7.G r4 = r7.f4559X
            java.lang.String r4 = r4.f5086V
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00a4
            int r1 = r1 + 1
        L_0x00a4:
            if (r1 <= r2) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            S7.k r6 = r6.J()
            goto L_0x0091
        L_0x00ac:
            if (r1 != r2) goto L_0x00af
            r0 = 1
        L_0x00af:
            return r0
        L_0x00b0:
            S7.p r6 = r7.f4578U
            r0 = r6
            S7.k r0 = (S7.k) r0
            r1 = 0
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r0 instanceof S7.h
            if (r0 != 0) goto L_0x00f3
            r0 = 1
            if (r6 != 0) goto L_0x00c5
            U7.d r6 = new U7.d
            r6.<init>(r1)
            goto L_0x00ec
        L_0x00c5:
            S7.k r6 = (S7.k) r6
            java.util.List r6 = r6.E()
            U7.d r2 = new U7.d
            int r3 = r6.size()
            int r3 = r3 - r0
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L_0x00d9:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r3 = r6.next()
            S7.k r3 = (S7.k) r3
            if (r3 == r7) goto L_0x00d9
            r2.add(r3)
            goto L_0x00d9
        L_0x00eb:
            r6 = r2
        L_0x00ec:
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00f3
            r1 = 1
        L_0x00f3:
            return r1
        L_0x00f4:
            S7.p r6 = r7.f4578U
            S7.k r6 = (S7.k) r6
            if (r6 == 0) goto L_0x0125
            boolean r0 = r6 instanceof S7.h
            if (r0 != 0) goto L_0x0125
            int r0 = r6.g()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0108
            r6 = r2
            goto L_0x0113
        L_0x0108:
            java.util.List r6 = r6.k()
            int r0 = r0 - r1
            java.lang.Object r6 = r6.get(r0)
            S7.p r6 = (S7.p) r6
        L_0x0113:
            if (r6 == 0) goto L_0x0122
            boolean r0 = r6 instanceof S7.k
            if (r0 == 0) goto L_0x011d
            r2 = r6
            S7.k r2 = (S7.k) r2
            goto L_0x0122
        L_0x011d:
            S7.p r6 = r6.w()
            goto L_0x0113
        L_0x0122:
            if (r7 != r2) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r1 = 0
        L_0x0126:
            return r1
        L_0x0127:
            S7.p r6 = r7.f4578U
            S7.k r6 = (S7.k) r6
            if (r6 == 0) goto L_0x0139
            boolean r0 = r6 instanceof S7.h
            if (r0 != 0) goto L_0x0139
            S7.k r6 = r6.I()
            if (r7 != r6) goto L_0x0139
            r6 = 1
            goto L_0x013a
        L_0x0139:
            r6 = 0
        L_0x013a:
            return r6
        L_0x013b:
            int r6 = r7.g()
            r0 = 0
            if (r6 != 0) goto L_0x0144
            r6 = 0
            goto L_0x014e
        L_0x0144:
            java.util.List r6 = r7.k()
            java.lang.Object r6 = r6.get(r0)
            S7.p r6 = (S7.p) r6
        L_0x014e:
            if (r6 == 0) goto L_0x0174
            boolean r7 = r6 instanceof S7.v
            if (r7 == 0) goto L_0x0162
            r7 = r6
            S7.v r7 = (S7.v) r7
            java.lang.String r7 = r7.C()
            boolean r7 = R7.h.e(r7)
            if (r7 != 0) goto L_0x016f
            goto L_0x0175
        L_0x0162:
            boolean r7 = r6 instanceof S7.e
            if (r7 != 0) goto L_0x016f
            boolean r7 = r6 instanceof S7.w
            if (r7 != 0) goto L_0x016f
            boolean r7 = r6 instanceof S7.i
            if (r7 != 0) goto L_0x016f
            goto L_0x0175
        L_0x016f:
            S7.p r6 = r6.p()
            goto L_0x014e
        L_0x0174:
            r0 = 1
        L_0x0175:
            return r0
        L_0x0176:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.f.b(S7.k, S7.k):boolean");
    }

    public final String toString() {
        switch (this.f5442a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return "";
        }
    }
}
