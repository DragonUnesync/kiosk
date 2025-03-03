package Y6;

import N.e;
import P6.f;
import d7.C0658c;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6642j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6643k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f6644l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f6645m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f6646a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6647b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6648c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6649d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6650f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6651g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6652h;
    public final boolean i;

    public i(String str, String str2, long j7, String str3, String str4, boolean z, boolean z6, boolean z8, boolean z9) {
        this.f6646a = str;
        this.f6647b = str2;
        this.f6648c = j7;
        this.f6649d = str3;
        this.e = str4;
        this.f6650f = z;
        this.f6651g = z6;
        this.f6652h = z8;
        this.i = z9;
    }

    public final String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6646a);
        sb.append('=');
        sb.append(this.f6647b);
        if (this.f6652h) {
            long j7 = this.f6648c;
            if (j7 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) C0658c.f9771a.get()).format(new Date(j7));
                f.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f6649d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f6650f) {
            sb.append("; secure");
        }
        if (this.f6651g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        f.d(sb2, "toString()");
        return sb2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (f.a(iVar.f6646a, this.f6646a) && f.a(iVar.f6647b, this.f6647b) && iVar.f6648c == this.f6648c && f.a(iVar.f6649d, this.f6649d) && f.a(iVar.e, this.e) && iVar.f6650f == this.f6650f && iVar.f6651g == this.f6651g && iVar.f6652h == this.f6652h && iVar.i == this.i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        int i9;
        int i10;
        int u3 = e.u(e.u(527, 31, this.f6646a), 31, this.f6647b);
        long j7 = this.f6648c;
        int u8 = e.u(e.u((u3 + ((int) (j7 ^ (j7 >>> 32)))) * 31, 31, this.f6649d), 31, this.e);
        int i11 = 1237;
        if (this.f6650f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i12 = (u8 + i8) * 31;
        if (this.f6651g) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i13 = (i12 + i9) * 31;
        if (this.f6652h) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.i) {
            i11 = 1231;
        }
        return i14 + i11;
    }

    public final String toString() {
        return a(false);
    }
}
