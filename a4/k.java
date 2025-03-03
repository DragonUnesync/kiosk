package a4;

import M3.d;
import M3.h;
import M3.l;
import S3.a;
import java.util.Arrays;
import java.util.Map;

public abstract class k extends C0425h {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7212d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};

    /* renamed from: f  reason: collision with root package name */
    public static final int[][] f7213f;

    /* renamed from: g  reason: collision with root package name */
    public static final int[][] f7214g;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f7215a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final j f7216b = new j(0);

    /* renamed from: c  reason: collision with root package name */
    public final j f7217c = new j(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f7213f = iArr;
        int[][] iArr2 = new int[20][];
        f7214g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f7213f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i8 = 0; i8 < iArr3.length; i8++) {
                iArr4[i8] = iArr3[(iArr3.length - i8) - 1];
            }
            f7214g[i] = iArr4;
        }
    }

    public static int i(a aVar, int[] iArr, int i, int[][] iArr2) {
        C0425h.f(i, aVar, iArr);
        int length = iArr2.length;
        float f8 = 0.48f;
        int i8 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            float e8 = C0425h.e(iArr, iArr2[i9], 0.7f);
            if (e8 < f8) {
                i8 = i9;
                f8 = e8;
            }
        }
        if (i8 >= 0) {
            return i8;
        }
        throw h.f3144W;
    }

    public static int[] m(a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int i8;
        int i9 = aVar.f4504V;
        if (z) {
            i8 = aVar.c(i);
        } else {
            i8 = aVar.b(i);
        }
        int length = iArr.length;
        boolean z6 = z;
        int i10 = 0;
        int i11 = i8;
        while (i8 < i9) {
            if (aVar.a(i8) != z6) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else if (C0425h.e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i11, i8};
                } else {
                    i11 += iArr2[0] + iArr2[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i12);
                    iArr2[i12] = 0;
                    iArr2[i10] = 0;
                    i10--;
                }
                iArr2[i10] = 1;
                z6 = !z6;
            }
            i8++;
        }
        throw h.f3144W;
    }

    public static int[] n(a aVar) {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = m(aVar, i, false, f7212d, iArr);
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            int i10 = i8 - (i9 - i8);
            if (i10 >= 0) {
                z = aVar.d(i10, i8);
            }
            i = i9;
        }
        return iArr2;
    }

    public l c(int i, a aVar, Map map) {
        return l(i, aVar, n(aVar), map);
    }

    public boolean h(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        int digit = Character.digit(str.charAt(i), 10);
        CharSequence subSequence = str.subSequence(0, i);
        int length2 = subSequence.length();
        int i8 = 0;
        for (int i9 = length2 - 1; i9 >= 0; i9 -= 2) {
            int charAt = subSequence.charAt(i9) - '0';
            if (charAt < 0 || charAt > 9) {
                throw d.a();
            }
            i8 += charAt;
        }
        int i10 = i8 * 3;
        for (int i11 = length2 - 2; i11 >= 0; i11 -= 2) {
            int charAt2 = subSequence.charAt(i11) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw d.a();
            }
            i10 += charAt2;
        }
        if ((1000 - i10) % 10 == digit) {
            return true;
        }
        return false;
    }

    public int[] j(a aVar, int i) {
        return m(aVar, i, false, f7212d, new int[3]);
    }

    public abstract int k(a aVar, int[] iArr, StringBuilder sb);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public M3.l l(int r11, S3.a r12, int[] r13, java.util.Map r14) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r14 != 0) goto L_0x0007
            r3 = r2
            goto L_0x000f
        L_0x0007:
            M3.c r3 = M3.c.f3133d0
            java.lang.Object r3 = r14.get(r3)
            M3.o r3 = (M3.o) r3
        L_0x000f:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0023
            M3.n r5 = new M3.n
            r6 = r13[r0]
            r7 = r13[r1]
            int r6 = r6 + r7
            float r6 = (float) r6
            float r6 = r6 / r4
            float r7 = (float) r11
            r5.<init>(r6, r7)
            r3.a(r5)
        L_0x0023:
            java.lang.StringBuilder r5 = r10.f7215a
            r5.setLength(r0)
            int r6 = r10.k(r12, r13, r5)
            if (r3 == 0) goto L_0x0038
            M3.n r7 = new M3.n
            float r8 = (float) r6
            float r9 = (float) r11
            r7.<init>(r8, r9)
            r3.a(r7)
        L_0x0038:
            int[] r6 = r10.j(r12, r6)
            if (r3 == 0) goto L_0x004e
            M3.n r7 = new M3.n
            r8 = r6[r0]
            r9 = r6[r1]
            int r8 = r8 + r9
            float r8 = (float) r8
            float r8 = r8 / r4
            float r9 = (float) r11
            r7.<init>(r8, r9)
            r3.a(r7)
        L_0x004e:
            r3 = r6[r1]
            r7 = r6[r0]
            int r7 = r3 - r7
            int r7 = r7 + r3
            int r8 = r12.f4504V
            if (r7 >= r8) goto L_0x0618
            boolean r3 = r12.d(r3, r7)
            if (r3 == 0) goto L_0x0618
            java.lang.String r3 = r5.toString()
            int r5 = r3.length()
            r7 = 8
            if (r5 < r7) goto L_0x0613
            boolean r5 = r10.h(r3)
            if (r5 == 0) goto L_0x060e
            r5 = r13[r1]
            r13 = r13[r0]
            int r5 = r5 + r13
            float r13 = (float) r5
            float r13 = r13 / r4
            r5 = r6[r1]
            r7 = r6[r0]
            int r5 = r5 + r7
            float r5 = (float) r5
            float r5 = r5 / r4
            M3.a r4 = r10.o()
            M3.l r7 = new M3.l
            M3.n r8 = new M3.n
            float r9 = (float) r11
            r8.<init>(r13, r9)
            M3.n r13 = new M3.n
            r13.<init>(r5, r9)
            r5 = 2
            M3.n[] r5 = new M3.n[r5]
            r5[r0] = r8
            r5[r1] = r13
            r7.<init>(r3, r2, r5, r4)
            a4.j r13 = r10.f7216b     // Catch:{ k -> 0x00d3 }
            r5 = r6[r1]     // Catch:{ k -> 0x00d3 }
            M3.l r11 = r13.b(r11, r5, r12)     // Catch:{ k -> 0x00d3 }
            M3.m r12 = M3.m.f3159a0     // Catch:{ k -> 0x00d3 }
            java.lang.String r13 = r11.f3149a     // Catch:{ k -> 0x00d3 }
            r7.b(r12, r13)     // Catch:{ k -> 0x00d3 }
            java.util.EnumMap r12 = r11.e     // Catch:{ k -> 0x00d3 }
            r7.a(r12)     // Catch:{ k -> 0x00d3 }
            M3.n[] r12 = r11.f3151c     // Catch:{ k -> 0x00d3 }
            M3.n[] r13 = r7.f3151c     // Catch:{ k -> 0x00d3 }
            if (r13 != 0) goto L_0x00b7
            r7.f3151c = r12     // Catch:{ k -> 0x00d3 }
            goto L_0x00cc
        L_0x00b7:
            if (r12 == 0) goto L_0x00cc
            int r5 = r12.length     // Catch:{ k -> 0x00d3 }
            if (r5 <= 0) goto L_0x00cc
            int r5 = r13.length     // Catch:{ k -> 0x00d3 }
            int r6 = r12.length     // Catch:{ k -> 0x00d3 }
            int r5 = r5 + r6
            M3.n[] r5 = new M3.n[r5]     // Catch:{ k -> 0x00d3 }
            int r6 = r13.length     // Catch:{ k -> 0x00d3 }
            java.lang.System.arraycopy(r13, r0, r5, r0, r6)     // Catch:{ k -> 0x00d3 }
            int r13 = r13.length     // Catch:{ k -> 0x00d3 }
            int r6 = r12.length     // Catch:{ k -> 0x00d3 }
            java.lang.System.arraycopy(r12, r0, r5, r13, r6)     // Catch:{ k -> 0x00d3 }
            r7.f3151c = r5     // Catch:{ k -> 0x00d3 }
        L_0x00cc:
            java.lang.String r11 = r11.f3149a     // Catch:{ k -> 0x00d3 }
            int r11 = r11.length()     // Catch:{ k -> 0x00d3 }
            goto L_0x00d5
        L_0x00d3:
            r11 = 0
        L_0x00d5:
            if (r14 != 0) goto L_0x00d9
            r12 = r2
            goto L_0x00e1
        L_0x00d9:
            M3.c r12 = M3.c.f3134e0
            java.lang.Object r12 = r14.get(r12)
            int[] r12 = (int[]) r12
        L_0x00e1:
            if (r12 == 0) goto L_0x00f1
            int r13 = r12.length
            r14 = 0
        L_0x00e5:
            if (r14 >= r13) goto L_0x00ee
            r5 = r12[r14]
            if (r11 != r5) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            int r14 = r14 + r1
            goto L_0x00e5
        L_0x00ee:
            M3.h r11 = M3.h.f3144W
            throw r11
        L_0x00f1:
            M3.a r11 = M3.a.f3113b0
            if (r4 == r11) goto L_0x00f9
            M3.a r11 = M3.a.f3120i0
            if (r4 != r11) goto L_0x060a
        L_0x00f9:
            a4.j r11 = r10.f7217c
            monitor-enter(r11)
            java.lang.Object r12 = r11.f7210a     // Catch:{ all -> 0x060b }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x060b }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x060b }
            if (r12 != 0) goto L_0x0109
            monitor-exit(r11)
            goto L_0x05ca
        L_0x0109:
            r12 = 19
            int[] r12 = new int[]{r0, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "US/CA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 39
            r13 = 30
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "US"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 139(0x8b, float:1.95E-43)
            r13 = 60
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "US/CA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 379(0x17b, float:5.31E-43)
            r13 = 300(0x12c, float:4.2E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "FR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 380(0x17c, float:5.32E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "BG"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 383(0x17f, float:5.37E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "SI"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 385(0x181, float:5.4E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "HR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 387(0x183, float:5.42E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "BA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 440(0x1b8, float:6.17E-43)
            r13 = 400(0x190, float:5.6E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "DE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 459(0x1cb, float:6.43E-43)
            r13 = 450(0x1c2, float:6.3E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "JP"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 469(0x1d5, float:6.57E-43)
            r13 = 460(0x1cc, float:6.45E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "RU"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 471(0x1d7, float:6.6E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "TW"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 474(0x1da, float:6.64E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "EE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 475(0x1db, float:6.66E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "LV"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 476(0x1dc, float:6.67E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "AZ"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 477(0x1dd, float:6.68E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "LT"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 478(0x1de, float:6.7E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "UZ"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 479(0x1df, float:6.71E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "LK"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 480(0x1e0, float:6.73E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PH"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 481(0x1e1, float:6.74E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "BY"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 482(0x1e2, float:6.75E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "UA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 484(0x1e4, float:6.78E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MD"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 485(0x1e5, float:6.8E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "AM"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 486(0x1e6, float:6.81E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "GE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 487(0x1e7, float:6.82E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "KZ"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 489(0x1e9, float:6.85E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "HK"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 499(0x1f3, float:6.99E-43)
            r13 = 490(0x1ea, float:6.87E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "JP"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 509(0x1fd, float:7.13E-43)
            r13 = 500(0x1f4, float:7.0E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "GB"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 520(0x208, float:7.29E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "GR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 528(0x210, float:7.4E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "LB"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 529(0x211, float:7.41E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CY"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 531(0x213, float:7.44E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MK"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 535(0x217, float:7.5E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MT"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 539(0x21b, float:7.55E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "IE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 549(0x225, float:7.7E-43)
            r13 = 540(0x21c, float:7.57E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "BE/LU"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 560(0x230, float:7.85E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PT"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 569(0x239, float:7.97E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "IS"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 579(0x243, float:8.11E-43)
            r13 = 570(0x23a, float:7.99E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "DK"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 590(0x24e, float:8.27E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PL"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 594(0x252, float:8.32E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "RO"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 599(0x257, float:8.4E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "HU"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 601(0x259, float:8.42E-43)
            r13 = 600(0x258, float:8.41E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "ZA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 603(0x25b, float:8.45E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "GH"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 608(0x260, float:8.52E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "BH"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 609(0x261, float:8.53E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MU"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 611(0x263, float:8.56E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 613(0x265, float:8.59E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "DZ"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 616(0x268, float:8.63E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "KE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 618(0x26a, float:8.66E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CI"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 619(0x26b, float:8.67E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "TN"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 621(0x26d, float:8.7E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "SY"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 622(0x26e, float:8.72E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "EG"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 624(0x270, float:8.74E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "LY"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 625(0x271, float:8.76E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "JO"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 626(0x272, float:8.77E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "IR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 627(0x273, float:8.79E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "KW"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 628(0x274, float:8.8E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "SA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 629(0x275, float:8.81E-43)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "AE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 649(0x289, float:9.1E-43)
            r13 = 640(0x280, float:8.97E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "FI"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 695(0x2b7, float:9.74E-43)
            r13 = 690(0x2b2, float:9.67E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CN"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 709(0x2c5, float:9.94E-43)
            r13 = 700(0x2bc, float:9.81E-43)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "NO"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 729(0x2d9, float:1.022E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "IL"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 739(0x2e3, float:1.036E-42)
            r13 = 730(0x2da, float:1.023E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "SE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 740(0x2e4, float:1.037E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "GT"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 741(0x2e5, float:1.038E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "SV"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 742(0x2e6, float:1.04E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "HN"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 743(0x2e7, float:1.041E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "NI"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 744(0x2e8, float:1.043E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 745(0x2e9, float:1.044E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 746(0x2ea, float:1.045E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "DO"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 750(0x2ee, float:1.051E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MX"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 755(0x2f3, float:1.058E-42)
            r13 = 754(0x2f2, float:1.057E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CA"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 759(0x2f7, float:1.064E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "VE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 769(0x301, float:1.078E-42)
            r13 = 760(0x2f8, float:1.065E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CH"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 770(0x302, float:1.079E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CO"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 773(0x305, float:1.083E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "UY"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 775(0x307, float:1.086E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 777(0x309, float:1.089E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "BO"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 779(0x30b, float:1.092E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "AR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 780(0x30c, float:1.093E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CL"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 784(0x310, float:1.099E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PY"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 785(0x311, float:1.1E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PE"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 786(0x312, float:1.101E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "EC"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 790(0x316, float:1.107E-42)
            r13 = 789(0x315, float:1.106E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "BR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 839(0x347, float:1.176E-42)
            r13 = 800(0x320, float:1.121E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "IT"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 849(0x351, float:1.19E-42)
            r13 = 840(0x348, float:1.177E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "ES"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 850(0x352, float:1.191E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CU"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 858(0x35a, float:1.202E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "SK"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 859(0x35b, float:1.204E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "CZ"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 860(0x35c, float:1.205E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "YU"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 865(0x361, float:1.212E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MN"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 867(0x363, float:1.215E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "KP"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 869(0x365, float:1.218E-42)
            r13 = 868(0x364, float:1.216E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "TR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 879(0x36f, float:1.232E-42)
            r13 = 870(0x366, float:1.219E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "NL"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 880(0x370, float:1.233E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "KR"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 885(0x375, float:1.24E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "TH"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 888(0x378, float:1.244E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "SG"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 890(0x37a, float:1.247E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "IN"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 893(0x37d, float:1.251E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "VN"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 896(0x380, float:1.256E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "PK"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 899(0x383, float:1.26E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "ID"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 919(0x397, float:1.288E-42)
            r13 = 900(0x384, float:1.261E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "AT"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 939(0x3ab, float:1.316E-42)
            r13 = 930(0x3a2, float:1.303E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "AU"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 949(0x3b5, float:1.33E-42)
            r13 = 940(0x3ac, float:1.317E-42)
            int[] r12 = new int[]{r13, r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "AZ"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 955(0x3bb, float:1.338E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MY"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            r12 = 958(0x3be, float:1.342E-42)
            int[] r12 = new int[]{r12}     // Catch:{ all -> 0x060b }
            java.lang.String r13 = "MO"
            r11.a(r12, r13)     // Catch:{ all -> 0x060b }
            monitor-exit(r11)
        L_0x05ca:
            r12 = 3
            java.lang.String r12 = r3.substring(r0, r12)
            int r12 = java.lang.Integer.parseInt(r12)
            java.lang.Object r13 = r11.f7210a
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            r14 = 0
        L_0x05dc:
            if (r14 >= r13) goto L_0x0603
            java.lang.Object r3 = r11.f7210a
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r14)
            int[] r3 = (int[]) r3
            r4 = r3[r0]
            if (r12 >= r4) goto L_0x05ed
            goto L_0x0603
        L_0x05ed:
            int r5 = r3.length
            if (r5 != r1) goto L_0x05f1
            goto L_0x05f3
        L_0x05f1:
            r4 = r3[r1]
        L_0x05f3:
            if (r12 > r4) goto L_0x0601
            java.lang.Object r11 = r11.f7211b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r11 = r11.get(r14)
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0603
        L_0x0601:
            int r14 = r14 + r1
            goto L_0x05dc
        L_0x0603:
            if (r2 == 0) goto L_0x060a
            M3.m r11 = M3.m.f3158Z
            r7.b(r11, r2)
        L_0x060a:
            return r7
        L_0x060b:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x060b }
            throw r12
        L_0x060e:
            M3.b r11 = M3.b.a()
            throw r11
        L_0x0613:
            M3.d r11 = M3.d.a()
            throw r11
        L_0x0618:
            M3.h r11 = M3.h.f3144W
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.k.l(int, S3.a, int[], java.util.Map):M3.l");
    }

    public abstract M3.a o();
}
