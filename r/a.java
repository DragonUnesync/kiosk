package R;

import android.text.TextUtils;
import j$.util.Objects;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f4223Y = new a("", 1, 3, 0);

    /* renamed from: Z  reason: collision with root package name */
    public static final a f4224Z = new a("", 1, 4, 0);

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f4225a0 = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    /* renamed from: U  reason: collision with root package name */
    public final int f4226U;

    /* renamed from: V  reason: collision with root package name */
    public final int f4227V;

    /* renamed from: W  reason: collision with root package name */
    public final int f4228W;

    /* renamed from: X  reason: collision with root package name */
    public final String f4229X;

    static {
        new a("", 1, 0, 0);
        new a("", 1, 1, 0);
        new a("", 1, 2, 0);
    }

    public a(String str, int i, int i8, int i9) {
        this.f4226U = i;
        this.f4227V = i8;
        this.f4228W = i9;
        if (str != null) {
            this.f4229X = str;
            return;
        }
        throw new NullPointerException("Null description");
    }

    public static BigInteger a(a aVar) {
        return BigInteger.valueOf((long) aVar.f4226U).shiftLeft(32).or(BigInteger.valueOf((long) aVar.f4227V)).shiftLeft(32).or(BigInteger.valueOf((long) aVar.f4228W));
    }

    public static a c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f4225a0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2));
        int parseInt3 = Integer.parseInt(matcher.group(3));
        if (matcher.group(4) != null) {
            str2 = matcher.group(4);
        } else {
            str2 = "";
        }
        return new a(str2, parseInt, parseInt2, parseInt3);
    }

    public final int b() {
        return this.f4226U;
    }

    public final int compareTo(Object obj) {
        return a(this).compareTo(a((a) obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Integer.valueOf(this.f4226U).equals(Integer.valueOf(aVar.f4226U)) || !Integer.valueOf(this.f4227V).equals(Integer.valueOf(aVar.f4227V)) || !Integer.valueOf(this.f4228W).equals(Integer.valueOf(aVar.f4228W))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f4226U), Integer.valueOf(this.f4227V), Integer.valueOf(this.f4228W)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f4226U + "." + this.f4227V + "." + this.f4228W);
        String str = this.f4229X;
        if (!TextUtils.isEmpty(str)) {
            sb.append("-" + str);
        }
        return sb.toString();
    }
}
