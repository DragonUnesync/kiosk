package M0;

import N.e;
import P0.z;
import Q0.g;
import java.util.Arrays;

/* renamed from: M0.i  reason: case insensitive filesystem */
public final class C0121i {

    /* renamed from: h  reason: collision with root package name */
    public static final C0121i f2956h = new C0121i(1, 2, 3, -1, -1, (byte[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f2957a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2958b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2959c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f2960d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2961f;

    /* renamed from: g  reason: collision with root package name */
    public int f2962g;

    static {
        e.D(0, 1, 2, 3, 4);
        z.J(5);
    }

    public C0121i(int i, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f2957a = i;
        this.f2958b = i8;
        this.f2959c = i9;
        this.f2960d = bArr;
        this.e = i10;
        this.f2961f = i11;
    }

    public static String a(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i != 2) {
            return g.m(i, "Undefined color range ");
        }
        return "Limited range";
    }

    public static String b(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i != 2) {
            return g.m(i, "Undefined color space ");
        }
        return "BT601";
    }

    public static String c(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i != 7) {
            return g.m(i, "Undefined color transfer ");
        }
        return "HLG";
    }

    public static boolean e(C0121i iVar) {
        int i;
        int i8;
        int i9;
        int i10;
        if (iVar == null) {
            return true;
        }
        int i11 = iVar.f2957a;
        if ((i11 == -1 || i11 == 1 || i11 == 2) && (((i = iVar.f2958b) == -1 || i == 2) && (((i8 = iVar.f2959c) == -1 || i8 == 3) && iVar.f2960d == null && (((i9 = iVar.f2961f) == -1 || i9 == 8) && ((i10 = iVar.e) == -1 || i10 == 8))))) {
            return true;
        }
        return false;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 9) {
            return 6;
        }
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            return 2;
        }
        return -1;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i == 18) {
            return 7;
        }
        if (i == 6 || i == 7) {
            return 3;
        }
        return -1;
    }

    public final boolean d() {
        if (this.f2957a == -1 || this.f2958b == -1 || this.f2959c == -1) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0121i.class != obj.getClass()) {
            return false;
        }
        C0121i iVar = (C0121i) obj;
        if (this.f2957a == iVar.f2957a && this.f2958b == iVar.f2958b && this.f2959c == iVar.f2959c && Arrays.equals(this.f2960d, iVar.f2960d) && this.e == iVar.e && this.f2961f == iVar.f2961f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2962g == 0) {
            this.f2962g = ((((Arrays.hashCode(this.f2960d) + ((((((527 + this.f2957a) * 31) + this.f2958b) * 31) + this.f2959c) * 31)) * 31) + this.e) * 31) + this.f2961f;
        }
        return this.f2962g;
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f2957a));
        sb.append(", ");
        sb.append(a(this.f2958b));
        sb.append(", ");
        sb.append(c(this.f2959c));
        sb.append(", ");
        if (this.f2960d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", ");
        String str2 = "NA";
        int i = this.e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(", ");
        int i8 = this.f2961f;
        if (i8 != -1) {
            str2 = i8 + "bit Chroma";
        }
        return e.A(sb, str2, ")");
    }
}
