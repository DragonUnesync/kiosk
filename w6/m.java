package W6;

import O6.p;
import P6.g;

public final class m extends g implements p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6202U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ boolean f6203V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f6204W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, boolean z, int i) {
        super(2);
        this.f6202U = i;
        this.f6204W = obj;
        this.f6203V = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r17, java.io.Serializable r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f6202U
            switch(r1) {
                case 0: goto L_0x010e;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r17
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r18
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "$this$$receiver"
            P6.f.e(r1, r3)
            java.lang.Object r3 = r0.f6204W
            r8 = r3
            java.util.List r8 = (java.util.List) r8
            r3 = 0
            r9 = 0
            boolean r7 = r0.f6203V
            r4 = 1
            if (r7 != 0) goto L_0x005c
            int r5 = r8.size()
            if (r5 != r4) goto L_0x005c
            int r5 = r8.size()
            if (r5 == 0) goto L_0x0054
            if (r5 != r4) goto L_0x004c
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 4
            int r1 = W6.d.g0(r1, r4, r2, r3, r5)
            if (r1 >= 0) goto L_0x0041
            goto L_0x00f7
        L_0x0041:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            C6.c r2 = new C6.c
            r2.<init>(r1, r4)
            goto L_0x00f8
        L_0x004c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "List has more than one element."
            r1.<init>(r2)
            throw r1
        L_0x0054:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "List is empty."
            r1.<init>(r2)
            throw r1
        L_0x005c:
            T6.c r5 = new T6.c
            if (r2 >= 0) goto L_0x0061
            r2 = 0
        L_0x0061:
            int r3 = r1.length()
            r5.<init>(r2, r3, r4)
            boolean r3 = r1 instanceof java.lang.String
            int r6 = r5.f5008W
            int r5 = r5.f5007V
            if (r3 == 0) goto L_0x00ae
            if (r6 <= 0) goto L_0x0074
            if (r2 <= r5) goto L_0x0078
        L_0x0074:
            if (r6 >= 0) goto L_0x00f7
            if (r5 > r2) goto L_0x00f7
        L_0x0078:
            java.util.Iterator r3 = r8.iterator()
        L_0x007c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x009a
            java.lang.Object r4 = r3.next()
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            int r12 = r13.length()
            r10 = 0
            r11 = r2
            r15 = r7
            boolean r10 = W6.l.X(r10, r11, r12, r13, r14, r15)
            if (r10 == 0) goto L_0x007c
            goto L_0x009b
        L_0x009a:
            r4 = r9
        L_0x009b:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00aa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            C6.c r2 = new C6.c
            r2.<init>(r1, r4)
            goto L_0x00f8
        L_0x00aa:
            if (r2 == r5) goto L_0x00f7
            int r2 = r2 + r6
            goto L_0x0078
        L_0x00ae:
            if (r6 <= 0) goto L_0x00b2
            if (r2 <= r5) goto L_0x00b6
        L_0x00b2:
            if (r6 >= 0) goto L_0x00f7
            if (r5 > r2) goto L_0x00f7
        L_0x00b6:
            r10 = r2
        L_0x00b7:
            java.util.Iterator r11 = r8.iterator()
        L_0x00bb:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r12 = r11.next()
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            int r13 = r2.length()
            r3 = 0
            r4 = r1
            r14 = r5
            r5 = r10
            r15 = r6
            r6 = r13
            r13 = r7
            boolean r2 = W6.d.k0(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x00da
            goto L_0x00e2
        L_0x00da:
            r7 = r13
            r5 = r14
            r6 = r15
            goto L_0x00bb
        L_0x00de:
            r14 = r5
            r15 = r6
            r13 = r7
            r12 = r9
        L_0x00e2:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00f0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            C6.c r2 = new C6.c
            r2.<init>(r1, r12)
            goto L_0x00f8
        L_0x00f0:
            if (r10 == r14) goto L_0x00f7
            int r10 = r10 + r15
            r7 = r13
            r5 = r14
            r6 = r15
            goto L_0x00b7
        L_0x00f7:
            r2 = r9
        L_0x00f8:
            if (r2 == 0) goto L_0x010d
            java.lang.Object r1 = r2.f712V
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            C6.c r9 = new C6.c
            java.lang.Object r2 = r2.f711U
            r9.<init>(r2, r1)
        L_0x010d:
            return r9
        L_0x010e:
            r1 = r17
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r18
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "$this$$receiver"
            P6.f.e(r1, r3)
            java.lang.Object r3 = r0.f6204W
            char[] r3 = (char[]) r3
            boolean r4 = r0.f6203V
            int r1 = W6.d.h0(r1, r3, r2, r4)
            if (r1 >= 0) goto L_0x012d
            r1 = 0
            goto L_0x013c
        L_0x012d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            C6.c r3 = new C6.c
            r3.<init>(r1, r2)
            r1 = r3
        L_0x013c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.m.c(java.lang.Object, java.io.Serializable):java.lang.Object");
    }
}
