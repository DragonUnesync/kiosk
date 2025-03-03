package p2;

import y2.C1628c;

/* renamed from: p2.b  reason: case insensitive filesystem */
public final class C1340b extends C1628c implements Comparable {

    /* renamed from: W  reason: collision with root package name */
    public static final C1340b f14454W = new C1628c(0);

    public final String a() {
        return i("", "");
    }

    /* renamed from: h */
    public final int compareTo(C1340b bVar) {
        if (this == bVar) {
            return 0;
        }
        int length = this.f16371V.length;
        int length2 = bVar.f16371V.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            int a8 = ((C1339a) e(i)).compareTo((C1339a) bVar.e(i));
            if (a8 != 0) {
                return a8;
            }
        }
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String i(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Object[] r1 = r6.f16371V
            int r1 = r1.length
            r0.append(r7)
            r0.append(r8)
            java.lang.String r8 = "catch "
            r0.append(r8)
            r8 = 0
            r2 = 0
        L_0x0017:
            if (r2 >= r1) goto L_0x0075
            java.lang.Object r3 = r6.e(r2)
            p2.a r3 = (p2.C1339a) r3
            if (r2 == 0) goto L_0x002e
            java.lang.String r4 = ",\n"
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = "  "
            r0.append(r4)
        L_0x002e:
            int r4 = r1 + -1
            if (r2 != r4) goto L_0x0051
            java.lang.Object[] r4 = r6.f16371V
            int r4 = r4.length
            if (r4 != 0) goto L_0x0039
            r4 = 0
            goto L_0x0049
        L_0x0039:
            int r4 = r4 + -1
            java.lang.Object r4 = r6.e(r4)
            p2.a r4 = (p2.C1339a) r4
            u2.u r5 = u2.u.f15769X
            u2.u r4 = r4.f14452U
            boolean r4 = r4.equals(r5)
        L_0x0049:
            if (r4 == 0) goto L_0x0051
            java.lang.String r4 = "<any>"
            r0.append(r4)
            goto L_0x005c
        L_0x0051:
            u2.u r4 = r3.f14452U
            v2.c r4 = r4.f15772U
            java.lang.String r4 = r4.a()
            r0.append(r4)
        L_0x005c:
            java.lang.String r4 = " -> "
            r0.append(r4)
            int r3 = r3.f14453V
            char r4 = (char) r3
            if (r3 != r4) goto L_0x006b
            java.lang.String r3 = android.support.v4.media.session.b.P(r3)
            goto L_0x006f
        L_0x006b:
            java.lang.String r3 = android.support.v4.media.session.b.Q(r3)
        L_0x006f:
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0075:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C1340b.i(java.lang.String, java.lang.String):java.lang.String");
    }
}
