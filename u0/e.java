package U0;

import M0.X;
import h1.C1031B;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f5333a;

    /* renamed from: b  reason: collision with root package name */
    public int f5334b;

    /* renamed from: c  reason: collision with root package name */
    public long f5335c;

    /* renamed from: d  reason: collision with root package name */
    public final C1031B f5336d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5337f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f5338g;

    public e(f fVar, String str, int i, C1031B b8) {
        long j7;
        this.f5338g = fVar;
        this.f5333a = str;
        this.f5334b = i;
        if (b8 == null) {
            j7 = -1;
        } else {
            j7 = b8.f12280d;
        }
        this.f5335c = j7;
        if (b8 != null && b8.b()) {
            this.f5336d = b8;
        }
    }

    public final boolean a(a aVar) {
        C1031B b8 = aVar.f5317d;
        if (b8 != null) {
            long j7 = this.f5335c;
            if (j7 == -1) {
                return false;
            }
            if (b8.f12280d > j7) {
                return true;
            }
            C1031B b9 = this.f5336d;
            if (b9 == null) {
                return false;
            }
            X x8 = aVar.f5315b;
            int b10 = x8.b(b8.f12277a);
            int b11 = x8.b(b9.f12277a);
            if (b8.f12280d < b9.f12280d || b10 < b11) {
                return false;
            }
            if (b10 > b11) {
                return true;
            }
            boolean b12 = b8.b();
            int i = b9.f12278b;
            if (b12) {
                int i8 = b8.f12278b;
                if (i8 > i) {
                    return true;
                }
                if (i8 != i || b8.f12279c <= b9.f12279c) {
                    return false;
                }
                return true;
            }
            int i9 = b8.e;
            if (i9 == -1 || i9 > i) {
                return true;
            }
            return false;
        } else if (this.f5334b != aVar.f5316c) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.o()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(M0.X r7, M0.X r8) {
        /*
            r6 = this;
            int r0 = r6.f5334b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0011
            int r7 = r8.o()
            if (r0 >= r7) goto L_0x0036
            goto L_0x0037
        L_0x0011:
            U0.f r1 = r6.f5338g
            M0.W r4 = r1.f5340a
            r7.n(r0, r4)
            M0.W r0 = r1.f5340a
            int r4 = r0.f2881n
        L_0x001c:
            int r5 = r0.f2882o
            if (r4 > r5) goto L_0x0036
            java.lang.Object r5 = r7.l(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L_0x0033
            M0.V r7 = r1.f5341b
            M0.V r7 = r8.f(r5, r7, r2)
            int r0 = r7.f2864c
            goto L_0x0037
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0036:
            r0 = -1
        L_0x0037:
            r6.f5334b = r0
            if (r0 != r3) goto L_0x003c
            return r2
        L_0x003c:
            h1.B r7 = r6.f5336d
            r0 = 1
            if (r7 != 0) goto L_0x0042
            return r0
        L_0x0042:
            java.lang.Object r7 = r7.f12277a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L_0x004b
            r2 = 1
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.e.b(M0.X, M0.X):boolean");
    }
}
