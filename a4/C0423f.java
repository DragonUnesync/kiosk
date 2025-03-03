package a4;

import M3.h;
import S3.a;

/* renamed from: a4.f  reason: case insensitive filesystem */
public final class C0423f extends C0425h {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7198b = {6, 8, 10, 12, 14};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7199c = {1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f7200d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a  reason: collision with root package name */
    public int f7201a = -1;

    public static int h(int[] iArr) {
        float f8 = 0.38f;
        int i = -1;
        for (int i8 = 0; i8 < 20; i8++) {
            float e8 = C0425h.e(iArr, e[i8], 0.5f);
            if (e8 < f8) {
                i = i8;
                f8 = e8;
            } else if (e8 == f8) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw h.f3144W;
    }

    public static int[] i(int i, a aVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i8 = aVar.f4504V;
        int i9 = i;
        boolean z = false;
        int i10 = 0;
        while (i < i8) {
            if (aVar.a(i) != z) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else if (C0425h.e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i9, i};
                } else {
                    i9 += iArr2[0] + iArr2[1];
                    int i11 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i11);
                    iArr2[i11] = 0;
                    iArr2[i10] = 0;
                    i10--;
                }
                iArr2[i10] = 1;
                z = !z;
            }
            i++;
        }
        throw h.f3144W;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r7 = i(r9, r2, r7[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l c(int r19, S3.a r20, java.util.Map r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            r0 = r21
            r3 = 2
            r4 = 0
            r5 = 1
            int r6 = r2.f4504V
            int r7 = r2.b(r4)
            if (r7 == r6) goto L_0x00fc
            int[] r6 = f7199c
            int[] r6 = i(r7, r2, r6)
            r7 = r6[r5]
            r8 = r6[r4]
            int r7 = r7 - r8
            int r7 = r7 / 4
            r1.f7201a = r7
            r1.j(r2, r8)
            int[][] r7 = f7200d
            r20.e()
            int r8 = r2.f4504V     // Catch:{ all -> 0x0037 }
            int r9 = r2.b(r4)     // Catch:{ all -> 0x0037 }
            if (r9 == r8) goto L_0x00f5
            r8 = r7[r4]     // Catch:{ h -> 0x003a }
            int[] r7 = i(r9, r2, r8)     // Catch:{ h -> 0x003a }
            goto L_0x0040
        L_0x0037:
            r0 = move-exception
            goto L_0x00f8
        L_0x003a:
            r7 = r7[r5]     // Catch:{ all -> 0x0037 }
            int[] r7 = i(r9, r2, r7)     // Catch:{ all -> 0x0037 }
        L_0x0040:
            r8 = r7[r4]     // Catch:{ all -> 0x0037 }
            r1.j(r2, r8)     // Catch:{ all -> 0x0037 }
            r8 = r7[r4]     // Catch:{ all -> 0x0037 }
            int r9 = r2.f4504V     // Catch:{ all -> 0x0037 }
            r10 = r7[r5]     // Catch:{ all -> 0x0037 }
            int r10 = r9 - r10
            r7[r4] = r10     // Catch:{ all -> 0x0037 }
            int r9 = r9 - r8
            r7[r5] = r9     // Catch:{ all -> 0x0037 }
            r20.e()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 20
            r8.<init>(r9)
            r9 = r6[r5]
            r10 = r7[r4]
            r11 = 10
            int[] r12 = new int[r11]
            r13 = 5
            int[] r14 = new int[r13]
            int[] r15 = new int[r13]
        L_0x0069:
            if (r9 >= r10) goto L_0x009d
            a4.C0425h.f(r9, r2, r12)
        L_0x006e:
            if (r4 >= r13) goto L_0x007e
            int r16 = r4 * 2
            r17 = r12[r16]
            r14[r4] = r17
            int r16 = r16 + 1
            r16 = r12[r16]
            r15[r4] = r16
            int r4 = r4 + r5
            goto L_0x006e
        L_0x007e:
            int r4 = h(r14)
            int r4 = r4 + 48
            char r4 = (char) r4
            r8.append(r4)
            int r4 = h(r15)
            int r4 = r4 + 48
            char r4 = (char) r4
            r8.append(r4)
            r4 = 0
        L_0x0093:
            if (r4 >= r11) goto L_0x009b
            r16 = r12[r4]
            int r9 = r9 + r16
            int r4 = r4 + r5
            goto L_0x0093
        L_0x009b:
            r4 = 0
            goto L_0x0069
        L_0x009d:
            java.lang.String r2 = r8.toString()
            r4 = 0
            if (r0 == 0) goto L_0x00ad
            M3.c r8 = M3.c.f3129Z
            java.lang.Object r0 = r0.get(r8)
            int[] r0 = (int[]) r0
            goto L_0x00ae
        L_0x00ad:
            r0 = r4
        L_0x00ae:
            if (r0 != 0) goto L_0x00b2
            int[] r0 = f7198b
        L_0x00b2:
            int r8 = r2.length()
            int r9 = r0.length
            r10 = 0
            r11 = 0
        L_0x00b9:
            if (r10 >= r9) goto L_0x00c6
            r12 = r0[r10]
            if (r8 != r12) goto L_0x00c1
            r0 = 1
            goto L_0x00c7
        L_0x00c1:
            if (r12 <= r11) goto L_0x00c4
            r11 = r12
        L_0x00c4:
            int r10 = r10 + r5
            goto L_0x00b9
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r0 != 0) goto L_0x00cc
            if (r8 <= r11) goto L_0x00cc
            r0 = 1
        L_0x00cc:
            if (r0 == 0) goto L_0x00f0
            M3.l r0 = new M3.l
            M3.n r8 = new M3.n
            r6 = r6[r5]
            float r6 = (float) r6
            r9 = r19
            float r9 = (float) r9
            r8.<init>(r6, r9)
            M3.n r6 = new M3.n
            r10 = 0
            r7 = r7[r10]
            float r7 = (float) r7
            r6.<init>(r7, r9)
            M3.n[] r3 = new M3.n[r3]
            r3[r10] = r8
            r3[r5] = r6
            M3.a r5 = M3.a.f3114c0
            r0.<init>(r2, r4, r3, r5)
            return r0
        L_0x00f0:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x00f5:
            M3.h r0 = M3.h.f3144W     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x00f8:
            r20.e()
            throw r0
        L_0x00fc:
            M3.h r0 = M3.h.f3144W
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C0423f.c(int, S3.a, java.util.Map):M3.l");
    }

    public final void j(a aVar, int i) {
        int min = Math.min(this.f7201a * 10, i);
        int i8 = i - 1;
        while (min > 0 && i8 >= 0 && !aVar.a(i8)) {
            min--;
            i8--;
        }
        if (min != 0) {
            throw h.f3144W;
        }
    }
}
