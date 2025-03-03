package d7;

import Y6.p;

/* renamed from: d7.b  reason: case insensitive filesystem */
public final class C0657b implements p {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cc, code lost:
        if ("close".equalsIgnoreCase(r1) != false) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf A[Catch:{ IOException -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1 A[SYNTHETIC, Splitter:B:49:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6 A[Catch:{ IOException -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee A[Catch:{ IOException -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Y6.u a(d7.C0661f r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "Connection"
            java.lang.String r2 = "close"
            java.lang.String r3 = "call"
            java.lang.String r4 = "HTTP "
            Q5.a r5 = r0.f9775d
            P6.f.b(r5)
            java.lang.Object r6 = r5.f4123b
            c7.h r6 = (c7.h) r6
            java.lang.Object r7 = r5.f4125d
            d7.d r7 = (d7.C0659d) r7
            java.lang.Object r8 = r5.e
            c7.j r8 = (c7.j) r8
            C7.d r9 = r0.e
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 0
            r0 = 1
            r13 = 0
            P6.f.e(r6, r3)     // Catch:{ IOException -> 0x0041 }
            r7.e(r9)     // Catch:{ IOException -> 0x0041 }
            java.lang.Object r14 = r9.f733W     // Catch:{ IOException -> 0x003f }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x003f }
            B.C0003d.E(r14)     // Catch:{ IOException -> 0x003f }
            r6.f(r5, r0, r13, r12)     // Catch:{ IOException -> 0x003f }
            r7.a()     // Catch:{ IOException -> 0x0039 }
            r14 = r12
            goto L_0x0052
        L_0x0039:
            r0 = move-exception
            r14 = r0
            r5.f(r14)     // Catch:{ IOException -> 0x003f }
            throw r14     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r0 = move-exception
            goto L_0x0049
        L_0x0041:
            r0 = move-exception
            P6.f.e(r6, r3)     // Catch:{ IOException -> 0x003f }
            r5.f(r0)     // Catch:{ IOException -> 0x003f }
            throw r0     // Catch:{ IOException -> 0x003f }
        L_0x0049:
            boolean r14 = r0 instanceof f7.C0938a
            if (r14 != 0) goto L_0x011d
            boolean r14 = r5.f4122a
            if (r14 == 0) goto L_0x011c
            r14 = r0
        L_0x0052:
            Y6.t r0 = r5.c(r13)     // Catch:{ IOException -> 0x009b }
            P6.f.b(r0)     // Catch:{ IOException -> 0x009b }
            P6.f.e(r6, r3)     // Catch:{ IOException -> 0x009b }
            r0.f6728a = r9     // Catch:{ IOException -> 0x009b }
            Y6.l r15 = r8.e     // Catch:{ IOException -> 0x009b }
            r0.e = r15     // Catch:{ IOException -> 0x009b }
            r0.f6736k = r10     // Catch:{ IOException -> 0x009b }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x009b }
            r0.f6737l = r12     // Catch:{ IOException -> 0x009b }
            Y6.u r0 = r0.a()     // Catch:{ IOException -> 0x009b }
            int r12 = r0.f6742X     // Catch:{ IOException -> 0x009b }
            r13 = 100
            if (r12 != r13) goto L_0x0076
        L_0x0074:
            r12 = 0
            goto L_0x007f
        L_0x0076:
            r13 = 102(0x66, float:1.43E-43)
            if (r13 > r12) goto L_0x009e
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 >= r13) goto L_0x009e
            goto L_0x0074
        L_0x007f:
            Y6.t r0 = r5.c(r12)     // Catch:{ IOException -> 0x009b }
            P6.f.b(r0)     // Catch:{ IOException -> 0x009b }
            r0.f6728a = r9     // Catch:{ IOException -> 0x009b }
            Y6.l r8 = r8.e     // Catch:{ IOException -> 0x009b }
            r0.e = r8     // Catch:{ IOException -> 0x009b }
            r0.f6736k = r10     // Catch:{ IOException -> 0x009b }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x009b }
            r0.f6737l = r8     // Catch:{ IOException -> 0x009b }
            Y6.u r0 = r0.a()     // Catch:{ IOException -> 0x009b }
            int r12 = r0.f6742X     // Catch:{ IOException -> 0x009b }
            goto L_0x009e
        L_0x009b:
            r0 = move-exception
            goto L_0x0115
        L_0x009e:
            P6.f.e(r6, r3)     // Catch:{ IOException -> 0x009b }
            Y6.t r3 = r0.k()     // Catch:{ IOException -> 0x009b }
            Y6.v r0 = r5.b(r0)     // Catch:{ IOException -> 0x009b }
            r3.f6733g = r0     // Catch:{ IOException -> 0x009b }
            Y6.u r0 = r3.a()     // Catch:{ IOException -> 0x009b }
            C7.d r3 = r0.f6739U     // Catch:{ IOException -> 0x009b }
            java.lang.Object r3 = r3.f734X     // Catch:{ IOException -> 0x009b }
            Y6.m r3 = (Y6.m) r3     // Catch:{ IOException -> 0x009b }
            java.lang.String r3 = r3.b(r1)     // Catch:{ IOException -> 0x009b }
            boolean r3 = r2.equalsIgnoreCase(r3)     // Catch:{ IOException -> 0x009b }
            if (r3 != 0) goto L_0x00ce
            Y6.m r3 = r0.f6744Z     // Catch:{ IOException -> 0x009b }
            java.lang.String r1 = r3.b(r1)     // Catch:{ IOException -> 0x009b }
            if (r1 != 0) goto L_0x00c8
            r1 = 0
        L_0x00c8:
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ IOException -> 0x009b }
            if (r1 == 0) goto L_0x00d5
        L_0x00ce:
            c7.j r1 = r7.h()     // Catch:{ IOException -> 0x009b }
            r1.l()     // Catch:{ IOException -> 0x009b }
        L_0x00d5:
            r1 = 204(0xcc, float:2.86E-43)
            if (r12 == r1) goto L_0x00dd
            r1 = 205(0xcd, float:2.87E-43)
            if (r12 != r1) goto L_0x0114
        L_0x00dd:
            Y6.v r1 = r0.f6745a0
            if (r1 == 0) goto L_0x00e6
            long r2 = r1.k()     // Catch:{ IOException -> 0x009b }
            goto L_0x00e8
        L_0x00e6:
            r2 = -1
        L_0x00e8:
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0114
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x009b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009b }
            r2.<init>(r4)     // Catch:{ IOException -> 0x009b }
            r2.append(r12)     // Catch:{ IOException -> 0x009b }
            java.lang.String r3 = " had non-zero Content-Length: "
            r2.append(r3)     // Catch:{ IOException -> 0x009b }
            if (r1 == 0) goto L_0x0108
            long r3 = r1.k()     // Catch:{ IOException -> 0x009b }
            java.lang.Long r12 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x009b }
            goto L_0x0109
        L_0x0108:
            r12 = 0
        L_0x0109:
            r2.append(r12)     // Catch:{ IOException -> 0x009b }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x009b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x009b }
            throw r0     // Catch:{ IOException -> 0x009b }
        L_0x0114:
            return r0
        L_0x0115:
            if (r14 == 0) goto L_0x011b
            g7.C0996d.a(r14, r0)
            throw r14
        L_0x011b:
            throw r0
        L_0x011c:
            throw r0
        L_0x011d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.C0657b.a(d7.f):Y6.u");
    }
}
