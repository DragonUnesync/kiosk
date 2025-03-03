package V0;

import H3.I;
import H3.U;
import H3.x0;
import P0.z;
import java.util.Set;

/* renamed from: V0.c  reason: case insensitive filesystem */
public final class C0338c {

    /* renamed from: d  reason: collision with root package name */
    public static final C0338c f5508d;

    /* renamed from: a  reason: collision with root package name */
    public final int f5509a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5510b;

    /* renamed from: c  reason: collision with root package name */
    public final U f5511c;

    /* JADX WARNING: type inference failed for: r1v1, types: [H3.T, H3.I] */
    static {
        C0338c cVar;
        if (z.f3748a >= 33) {
            ? i = new I(4);
            for (int i8 = 1; i8 <= 10; i8++) {
                i.a(Integer.valueOf(z.r(i8)));
            }
            cVar = new C0338c(2, (Set) i.g());
        } else {
            cVar = new C0338c(2, 10);
        }
        f5508d = cVar;
    }

    public C0338c(int i, Set set) {
        this.f5509a = i;
        U l8 = U.l(set);
        this.f5511c = l8;
        x0 h5 = l8.iterator();
        int i8 = 0;
        while (h5.hasNext()) {
            i8 = Math.max(i8, Integer.bitCount(((Integer) h5.next()).intValue()));
        }
        this.f5510b = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (V0.C0338c) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof V0.C0338c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            V0.c r5 = (V0.C0338c) r5
            int r1 = r5.f5509a
            int r3 = r4.f5509a
            if (r3 != r1) goto L_0x0025
            int r1 = r4.f5510b
            int r3 = r5.f5510b
            if (r1 != r3) goto L_0x0025
            int r1 = P0.z.f3748a
            H3.U r1 = r4.f5511c
            H3.U r5 = r5.f5511c
            boolean r5 = j$.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.C0338c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i8 = ((this.f5509a * 31) + this.f5510b) * 31;
        U u3 = this.f5511c;
        if (u3 == null) {
            i = 0;
        } else {
            i = u3.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f5509a + ", maxChannelCount=" + this.f5510b + ", channelMasks=" + this.f5511c + "]";
    }

    public C0338c(int i, int i8) {
        this.f5509a = i;
        this.f5510b = i8;
        this.f5511c = null;
    }
}
