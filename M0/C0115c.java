package M0;

import P0.z;
import java.util.Arrays;

/* renamed from: M0.c  reason: case insensitive filesystem */
public final class C0115c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0115c f2914c = new C0115c(new C0114b[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final C0114b f2915d;

    /* renamed from: a  reason: collision with root package name */
    public final int f2916a;

    /* renamed from: b  reason: collision with root package name */
    public final C0114b[] f2917b;

    static {
        C0114b bVar = new C0114b(-1, -1, new int[0], new C[0], new long[0]);
        int[] iArr = bVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = bVar.f2897f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f2915d = new C0114b(0, bVar.f2894b, copyOf, (C[]) Arrays.copyOf(bVar.f2896d, 0), copyOf2);
        z.J(1);
        z.J(2);
        z.J(3);
        z.J(4);
    }

    public C0115c(C0114b[] bVarArr) {
        this.f2916a = bVarArr.length;
        this.f2917b = bVarArr;
    }

    public final C0114b a(int i) {
        if (i < 0) {
            return f2915d;
        }
        return this.f2917b[i];
    }

    public final boolean b(int i) {
        if (i != this.f2916a - 1) {
            return false;
        }
        a(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0115c.class != obj.getClass()) {
            return false;
        }
        C0115c cVar = (C0115c) obj;
        int i = z.f3748a;
        if (this.f2916a != cVar.f2916a || !Arrays.equals(this.f2917b, cVar.f2917b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2917b) + (((((this.f2916a * 961) + ((int) 0)) * 31) + ((int) -9223372036854775807L)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C0114b[] bVarArr = this.f2917b;
            if (i < bVarArr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                bVarArr[i].getClass();
                for (int i8 = 0; i8 < bVarArr[i].e.length; i8++) {
                    sb.append("ad(state=");
                    int i9 = bVarArr[i].e[i8];
                    if (i9 == 0) {
                        sb.append('_');
                    } else if (i9 == 1) {
                        sb.append('R');
                    } else if (i9 == 2) {
                        sb.append('S');
                    } else if (i9 == 3) {
                        sb.append('P');
                    } else if (i9 != 4) {
                        sb.append('?');
                    } else {
                        sb.append('!');
                    }
                    sb.append(", durationUs=");
                    sb.append(bVarArr[i].f2897f[i8]);
                    sb.append(')');
                    if (i8 < bVarArr[i].e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < bVarArr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
