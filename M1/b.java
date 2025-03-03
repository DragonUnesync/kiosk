package M1;

import B7.g;
import H3.C0102t;
import H3.O;
import H3.g0;
import P0.l;
import P0.z;
import java.util.List;

public final class b implements d {

    /* renamed from: W  reason: collision with root package name */
    public static final C0102t f3068W;

    /* renamed from: U  reason: collision with root package name */
    public final O f3069U;

    /* renamed from: V  reason: collision with root package name */
    public final long[] f3070V;

    static {
        g0 g0Var = g0.f2070U;
        g gVar = new g(14);
        g0Var.getClass();
        f3068W = new C0102t(gVar, g0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(H3.i0 r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 0
            r19.<init>()
            int r3 = r20.size()
            r6 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r6) goto L_0x0091
            java.util.Iterator r3 = r20.iterator()
            java.lang.Object r9 = r3.next()
            boolean r10 = r3.hasNext()
            if (r10 != 0) goto L_0x0056
            M1.a r9 = (M1.a) r9
            long r10 = r9.f3065b
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002c
            r4 = 0
            goto L_0x002d
        L_0x002c:
            r4 = r10
        L_0x002d:
            H3.O r3 = r9.f3064a
            long r9 = r9.f3066c
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0042
            H3.i0 r1 = H3.O.r(r3)
            r0.f3069U = r1
            long[] r1 = new long[r6]
            r1[r2] = r4
            r0.f3070V = r1
            goto L_0x0055
        L_0x0042:
            H3.i0 r7 = H3.O.p()
            H3.i0 r3 = H3.O.s(r3, r7)
            r0.f3069U = r3
            long r9 = r9 + r4
            long[] r1 = new long[r1]
            r1[r2] = r4
            r1[r6] = r9
            r0.f3070V = r1
        L_0x0055:
            return
        L_0x0056:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "expected one element but was: <"
            r1.<init>(r4)
            r1.append(r9)
        L_0x0060:
            r4 = 4
            if (r2 >= r4) goto L_0x0077
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0077
            java.lang.String r4 = ", "
            r1.append(r4)
            java.lang.Object r4 = r3.next()
            r1.append(r4)
            int r2 = r2 + r6
            goto L_0x0060
        L_0x0077:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0082
            java.lang.String r2 = ", ..."
            r1.append(r2)
        L_0x0082:
            r2 = 62
            r1.append(r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0091:
            int r3 = r20.size()
            int r3 = r3 * 2
            long[] r1 = new long[r3]
            r0.f3070V = r1
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            H3.t r3 = f3068W
            r9 = r20
            H3.i0 r3 = H3.O.u(r3, r9)
            r9 = 0
        L_0x00b1:
            int r10 = r3.size()
            if (r2 >= r10) goto L_0x011e
            java.lang.Object r10 = r3.get(r2)
            M1.a r10 = (M1.a) r10
            long r11 = r10.f3065b
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x00c5
            r11 = 0
        L_0x00c5:
            long r13 = r10.f3066c
            long r15 = r11 + r13
            H3.O r10 = r10.f3064a
            if (r9 == 0) goto L_0x00fe
            long[] r4 = r0.f3070V
            int r5 = r9 + -1
            r17 = r4[r5]
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d8
            goto L_0x00fe
        L_0x00d8:
            if (r4 != 0) goto L_0x00ea
            java.lang.Object r4 = r1.get(r5)
            H3.O r4 = (H3.O) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00ea
            r1.set(r5, r10)
            goto L_0x00f8
        L_0x00ea:
            java.lang.String r4 = "CuesWithTimingSubtitle"
            java.lang.String r7 = "Truncating unsupported overlapping cues."
            P0.l.B(r4, r7)
            long[] r4 = r0.f3070V
            r4[r5] = r11
            r1.set(r5, r10)
        L_0x00f8:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0109
        L_0x00fe:
            long[] r4 = r0.f3070V
            int r5 = r9 + 1
            r4[r9] = r11
            r1.add(r10)
            r9 = r5
            goto L_0x00f8
        L_0x0109:
            int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x011b
            long[] r7 = r0.f3070V
            int r8 = r9 + 1
            r7[r9] = r15
            H3.i0 r7 = H3.O.p()
            r1.add(r7)
            r9 = r8
        L_0x011b:
            int r2 = r2 + r6
            r7 = r4
            goto L_0x00b1
        L_0x011e:
            H3.O r1 = H3.O.m(r1)
            r0.f3069U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.b.<init>(H3.i0):void");
    }

    public final List X(long j7) {
        int e = z.e(this.f3070V, j7, false);
        if (e == -1) {
            return O.p();
        }
        return (O) this.f3069U.get(e);
    }

    public final int c(long j7) {
        int a8 = z.a(this.f3070V, j7, false);
        if (a8 < this.f3069U.size()) {
            return a8;
        }
        return -1;
    }

    public final long s(int i) {
        boolean z;
        if (i < this.f3069U.size()) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        return this.f3070V[i];
    }

    public final int s0() {
        return this.f3069U.size();
    }
}
