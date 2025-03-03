package Q1;

import N.e;
import P0.l;
import android.graphics.Color;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4099a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4100b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f4101c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f4102d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4103f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4104g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4105h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4106j;

    public d(String str, int i8, Integer num, Integer num2, float f8, boolean z, boolean z6, boolean z8, boolean z9, int i9) {
        this.f4099a = str;
        this.f4100b = i8;
        this.f4101c = num;
        this.f4102d = num2;
        this.e = f8;
        this.f4103f = z;
        this.f4104g = z6;
        this.f4105h = z8;
        this.i = z9;
        this.f4106j = i9;
    }

    public static int a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        e.H("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                return true;
            }
            return false;
        } catch (NumberFormatException e8) {
            l.C("SsaStyle", "Failed to parse boolean value: '" + str + "'", e8);
            return false;
        }
    }

    public static Integer c(String str) {
        long j7;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                j7 = Long.parseLong(str.substring(2), 16);
            } else {
                j7 = Long.parseLong(str);
            }
            if (j7 <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            l.d(z);
            int c8 = E.e.c(((j7 >> 24) & 255) ^ 255);
            int c9 = E.e.c((j7 >> 16) & 255);
            return Integer.valueOf(Color.argb(c8, E.e.c(j7 & 255), E.e.c((j7 >> 8) & 255), c9));
        } catch (IllegalArgumentException e8) {
            l.C("SsaStyle", "Failed to parse color expression: '" + str + "'", e8);
            return null;
        }
    }
}
