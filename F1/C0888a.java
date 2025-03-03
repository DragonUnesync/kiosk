package f1;

import M0.J;
import N.e;
import P0.l;
import P0.z;
import java.util.regex.Pattern;

/* renamed from: f1.a  reason: case insensitive filesystem */
public final class C0888a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11498a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11499b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11500c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11501d;

    public C0888a(String str, int i, int i8, int i9) {
        this.f11498a = i;
        this.f11499b = str;
        this.f11500c = i8;
        this.f11501d = i9;
    }

    public static C0888a a(String str) {
        boolean z;
        boolean z6;
        int i = z.f3748a;
        String[] split = str.split(" ", 2);
        if (split.length == 2) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        String str2 = split[0];
        Pattern pattern = x.f11632a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i8 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            if (split2.length >= 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            l.d(z6);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i8 = Integer.parseInt(str4);
                    } catch (NumberFormatException e) {
                        throw J.b(e, str4);
                    }
                }
                return new C0888a(split2[0], parseInt, parseInt2, i8);
            } catch (NumberFormatException e8) {
                throw J.b(e8, str3);
            }
        } catch (NumberFormatException e9) {
            throw J.b(e9, str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0888a.class != obj.getClass()) {
            return false;
        }
        C0888a aVar = (C0888a) obj;
        if (this.f11498a == aVar.f11498a && this.f11499b.equals(aVar.f11499b) && this.f11500c == aVar.f11500c && this.f11501d == aVar.f11501d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((e.u((217 + this.f11498a) * 31, 31, this.f11499b) + this.f11500c) * 31) + this.f11501d;
    }
}
