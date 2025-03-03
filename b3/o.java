package B3;

import android.os.Handler;

public final class o implements Handler.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f442U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f443V;

    public /* synthetic */ o(int i, Object obj) {
        this.f442U = i;
        this.f443V = obj;
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [G5.a, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0126, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        r9.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0135, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0131 A[ExcHandler: all (r0v13 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:48:0x0111] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = 2
            r4 = 1
            int r5 = r1.f442U
            switch(r5) {
                case 0: goto L_0x020e;
                case 1: goto L_0x003b;
                case 2: goto L_0x0029;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r5 = r0.what
            java.lang.Object r6 = r1.f443V
            O2.g r6 = (O2.g) r6
            if (r5 != r4) goto L_0x001c
            java.lang.Object r0 = r0.obj
            O2.e r0 = (O2.e) r0
            r6.b(r0)
            r3 = 1
            goto L_0x0028
        L_0x001c:
            if (r5 != r2) goto L_0x0027
            java.lang.Object r0 = r0.obj
            O2.e r0 = (O2.e) r0
            com.bumptech.glide.o r2 = r6.f3628d
            r2.n(r0)
        L_0x0027:
            r3 = 0
        L_0x0028:
            return r3
        L_0x0029:
            int r0 = r0.what
            java.lang.Object r2 = r1.f443V
            H5.b r2 = (H5.b) r2
            r2.getClass()
            if (r0 != r4) goto L_0x0039
            r2.b()
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            return r3
        L_0x003b:
            int r2 = r0.what
            r5 = 2131362662(0x7f0a0366, float:1.834511E38)
            java.lang.Object r6 = r1.f443V
            G5.m r6 = (G5.m) r6
            if (r2 != r5) goto L_0x01f5
            java.lang.Object r0 = r0.obj
            G5.w r0 = (G5.w) r0
            r6.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r6.f1716g
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r0.f1740d = r2
            G5.q r5 = r0.f1737a
            if (r2 != 0) goto L_0x005e
            r2 = 0
            goto L_0x0100
        L_0x005e:
            byte[] r2 = r5.f1720a
            int r10 = r0.f1739c
            int r11 = r5.f1722c
            int r12 = r5.f1721b
            r13 = 90
            if (r10 == r13) goto L_0x00ac
            r13 = 180(0xb4, float:2.52E-43)
            if (r10 == r13) goto L_0x0095
            r13 = 270(0x10e, float:3.78E-43)
            if (r10 == r13) goto L_0x0074
            r10 = r5
            goto L_0x00cb
        L_0x0074:
            G5.q r10 = new G5.q
            int r13 = r12 * r11
            byte[] r14 = new byte[r13]
            int r13 = r13 - r4
            r15 = 0
        L_0x007c:
            if (r15 >= r12) goto L_0x0091
            int r16 = r11 + -1
        L_0x0080:
            if (r16 < 0) goto L_0x008f
            int r17 = r16 * r12
            int r17 = r17 + r15
            byte r17 = r2[r17]
            r14[r13] = r17
            int r13 = r13 + -1
            int r16 = r16 + -1
            goto L_0x0080
        L_0x008f:
            int r15 = r15 + r4
            goto L_0x007c
        L_0x0091:
            r10.<init>(r14, r11, r12)
            goto L_0x00cb
        L_0x0095:
            G5.q r10 = new G5.q
            int r13 = r12 * r11
            byte[] r14 = new byte[r13]
            int r15 = r13 + -1
            r3 = 0
        L_0x009e:
            if (r3 >= r13) goto L_0x00a8
            byte r17 = r2[r3]
            r14[r15] = r17
            int r15 = r15 + -1
            int r3 = r3 + r4
            goto L_0x009e
        L_0x00a8:
            r10.<init>(r14, r12, r11)
            goto L_0x00cb
        L_0x00ac:
            G5.q r10 = new G5.q
            int r3 = r12 * r11
            byte[] r3 = new byte[r3]
            r13 = 0
            r14 = 0
        L_0x00b4:
            if (r13 >= r12) goto L_0x00c8
            int r15 = r11 + -1
        L_0x00b8:
            if (r15 < 0) goto L_0x00c6
            int r17 = r15 * r12
            int r17 = r17 + r13
            byte r17 = r2[r17]
            r3[r14] = r17
            int r14 = r14 + r4
            int r15 = r15 + -1
            goto L_0x00b8
        L_0x00c6:
            int r13 = r13 + r4
            goto L_0x00b4
        L_0x00c8:
            r10.<init>(r3, r11, r12)
        L_0x00cb:
            android.graphics.Rect r2 = r0.f1740d
            int r3 = r2.width()
            int r11 = r2.height()
            int r12 = r2.top
            int r13 = r3 * r11
            byte[] r13 = new byte[r13]
            int r14 = r10.f1721b
            int r12 = r12 * r14
            int r2 = r2.left
            int r12 = r12 + r2
            r2 = 0
        L_0x00e3:
            if (r2 >= r11) goto L_0x00ef
            int r15 = r2 * r3
            byte[] r9 = r10.f1720a
            java.lang.System.arraycopy(r9, r12, r13, r15, r3)
            int r12 = r12 + r14
            int r2 = r2 + r4
            goto L_0x00e3
        L_0x00ef:
            M3.i r2 = new M3.i
            r17 = r2
            r18 = r13
            r19 = r3
            r20 = r11
            r21 = r3
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x0100:
            if (r2 == 0) goto L_0x013a
            java.lang.Object r3 = r6.f1715f
            G5.j r3 = (G5.j) r3
            A1.d r2 = r3.b(r2)
            M3.g r9 = r3.f1708a
            java.util.ArrayList r3 = r3.f1709b
            r3.clear()
            boolean r3 = r9 instanceof M3.g     // Catch:{ Exception -> 0x0126, all -> 0x0131 }
            if (r3 == 0) goto L_0x0128
            M3.j[] r3 = r9.f3143b     // Catch:{ Exception -> 0x0126, all -> 0x0131 }
            if (r3 != 0) goto L_0x011d
            r3 = 0
            r9.d(r3)     // Catch:{ Exception -> 0x0126, all -> 0x0131 }
        L_0x011d:
            M3.l r2 = r9.c(r2)     // Catch:{ Exception -> 0x0126, all -> 0x0131 }
        L_0x0121:
            r9.a()
            r9 = r2
            goto L_0x013c
        L_0x0126:
            r3 = 0
            goto L_0x0136
        L_0x0128:
            r3 = 0
            r9.d(r3)     // Catch:{ Exception -> 0x0136, all -> 0x0131 }
            M3.l r2 = r9.c(r2)     // Catch:{ Exception -> 0x0136, all -> 0x0131 }
            goto L_0x0121
        L_0x0131:
            r0 = move-exception
            r9.a()
            throw r0
        L_0x0136:
            r9.a()
            goto L_0x013b
        L_0x013a:
            r3 = 0
        L_0x013b:
            r9 = r3
        L_0x013c:
            java.lang.Object r2 = r6.e
            android.os.Handler r2 = (android.os.Handler) r2
            if (r9 == 0) goto L_0x017d
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r12 = "Found barcode in "
            r3.<init>(r12)
            long r10 = r10 - r7
            r3.append(r10)
            java.lang.String r7 = " ms"
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "m"
            android.util.Log.d(r7, r3)
            if (r2 == 0) goto L_0x0189
            G5.a r3 = new G5.a
            r3.<init>()
            r3.f1658a = r9
            r3.f1659b = r0
            r7 = 2131362664(0x7f0a0368, float:1.8345115E38)
            android.os.Message r3 = android.os.Message.obtain(r2, r7, r3)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r3.setData(r7)
            r3.sendToTarget()
            goto L_0x0189
        L_0x017d:
            if (r2 == 0) goto L_0x0189
            r3 = 2131362663(0x7f0a0367, float:1.8345113E38)
            android.os.Message r3 = android.os.Message.obtain(r2, r3)
            r3.sendToTarget()
        L_0x0189:
            if (r2 == 0) goto L_0x01e1
            java.lang.Object r3 = r6.f1715f
            G5.j r3 = (G5.j) r3
            r3.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList r3 = r3.f1709b
            r7.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r8 = r7.size()
            r3.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x01a6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01d7
            java.lang.Object r8 = r7.next()
            M3.n r8 = (M3.n) r8
            float r9 = r8.f3164a
            float r10 = (float) r4
            float r9 = r9 * r10
            android.graphics.Rect r11 = r0.f1740d
            int r12 = r11.left
            float r12 = (float) r12
            float r9 = r9 + r12
            float r8 = r8.f3165b
            float r8 = r8 * r10
            int r10 = r11.top
            float r10 = (float) r10
            float r8 = r8 + r10
            boolean r10 = r0.e
            if (r10 == 0) goto L_0x01ce
            int r10 = r5.f1721b
            float r10 = (float) r10
            float r9 = r10 - r9
        L_0x01ce:
            M3.n r10 = new M3.n
            r10.<init>(r9, r8)
            r3.add(r10)
            goto L_0x01a6
        L_0x01d7:
            r0 = 2131362666(0x7f0a036a, float:1.834512E38)
            android.os.Message r0 = android.os.Message.obtain(r2, r0, r3)
            r0.sendToTarget()
        L_0x01e1:
            java.lang.Object r0 = r6.f1713c
            H5.f r0 = (H5.f) r0
            android.os.Handler r2 = r0.f2182h
            H5.d r3 = new H5.d
            java.lang.Object r5 = r6.f1718j
            A.f r5 = (A.f) r5
            r6 = 0
            r3.<init>(r0, r5, r6)
            r2.post(r3)
            goto L_0x020d
        L_0x01f5:
            r0 = 2131362667(0x7f0a036b, float:1.8345121E38)
            if (r2 != r0) goto L_0x020d
            java.lang.Object r0 = r6.f1713c
            H5.f r0 = (H5.f) r0
            android.os.Handler r2 = r0.f2182h
            H5.d r3 = new H5.d
            java.lang.Object r5 = r6.f1718j
            A.f r5 = (A.f) r5
            r6 = 0
            r3.<init>(r0, r5, r6)
            r2.post(r3)
        L_0x020d:
            return r4
        L_0x020e:
            r6 = 0
            int r3 = r0.what
            if (r3 == 0) goto L_0x0215
            r3 = 0
            goto L_0x0231
        L_0x0215:
            java.lang.Object r3 = r1.f443V
            B3.q r3 = (B3.q) r3
            java.lang.Object r0 = r0.obj
            B3.p r0 = (B3.p) r0
            java.lang.Object r5 = r3.f449U
            monitor-enter(r5)
            java.lang.Object r6 = r3.f451W     // Catch:{ all -> 0x0232 }
            B3.p r6 = (B3.p) r6     // Catch:{ all -> 0x0232 }
            if (r6 == r0) goto L_0x022c
            java.lang.Object r6 = r3.f452X     // Catch:{ all -> 0x0232 }
            B3.p r6 = (B3.p) r6     // Catch:{ all -> 0x0232 }
            if (r6 != r0) goto L_0x022f
        L_0x022c:
            r3.p(r0, r2)     // Catch:{ all -> 0x0232 }
        L_0x022f:
            monitor-exit(r5)     // Catch:{ all -> 0x0232 }
            r3 = 1
        L_0x0231:
            return r3
        L_0x0232:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0232 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.o.handleMessage(android.os.Message):boolean");
    }
}
