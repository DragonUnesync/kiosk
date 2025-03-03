package D;

import L.a;
import Q0.g;
import android.util.Size;
import u.C1477r;

/* renamed from: D.j  reason: case insensitive filesystem */
public final class C0050j {

    /* renamed from: a  reason: collision with root package name */
    public final int f908a;

    /* renamed from: b  reason: collision with root package name */
    public final G0 f909b;

    /* renamed from: c  reason: collision with root package name */
    public final long f910c;

    public C0050j(int i, G0 g02, long j7) {
        if (i != 0) {
            this.f908a = i;
            this.f909b = g02;
            this.f910c = j7;
            return;
        }
        throw new NullPointerException("Null configType");
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        return 1;
    }

    public static C0050j b(int i, int i8, Size size, C0052k kVar) {
        int a8 = a(i8);
        G0 g02 = G0.NOT_SUPPORT;
        int a9 = a.a(size);
        if (i == 1) {
            if (a9 <= a.a((Size) kVar.f913b.get(Integer.valueOf(i8)))) {
                g02 = G0.s720p;
            } else {
                if (a9 <= a.a((Size) kVar.f915d.get(Integer.valueOf(i8)))) {
                    g02 = G0.s1440p;
                }
            }
        } else if (a9 <= a.a(kVar.f912a)) {
            g02 = G0.VGA;
        } else if (a9 <= a.a(kVar.f914c)) {
            g02 = G0.PREVIEW;
        } else if (a9 <= a.a(kVar.e)) {
            g02 = G0.RECORD;
        } else {
            if (a9 <= a.a((Size) kVar.f916f.get(Integer.valueOf(i8)))) {
                g02 = G0.MAXIMUM;
            } else {
                Size size2 = (Size) kVar.f917g.get(Integer.valueOf(i8));
                if (size2 != null) {
                    if (a9 <= size2.getHeight() * size2.getWidth()) {
                        g02 = G0.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new C0050j(a8, g02, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0050j)) {
            return false;
        }
        C0050j jVar = (C0050j) obj;
        if (!C1477r.a(this.f908a, jVar.f908a) || !this.f909b.equals(jVar.f909b) || this.f910c != jVar.f910c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j7 = this.f910c;
        return ((((C1477r.h(this.f908a) ^ 1000003) * 1000003) ^ this.f909b.hashCode()) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.f908a;
        if (i == 1) {
            str = "PRIV";
        } else if (i == 2) {
            str = "YUV";
        } else if (i == 3) {
            str = "JPEG";
        } else if (i == 4) {
            str = "JPEG_R";
        } else if (i != 5) {
            str = "null";
        } else {
            str = "RAW";
        }
        sb.append(str);
        sb.append(", configSize=");
        sb.append(this.f909b);
        sb.append(", streamUseCase=");
        return g.o(sb, this.f910c, "}");
    }
}
