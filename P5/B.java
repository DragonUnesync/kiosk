package P5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class B {
    public static final Pattern e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f3798f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f3799g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* renamed from: a  reason: collision with root package name */
    public final String f3800a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3801b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3802c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3803d;

    public B(String str) {
        String str2;
        this.f3800a = str;
        String str3 = "";
        String str4 = null;
        if (str != null) {
            Matcher matcher = e.matcher(str);
            this.f3801b = matcher.find() ? matcher.group(1) : str3;
            Matcher matcher2 = f3798f.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f3802c = str2;
        } else {
            this.f3801b = str3;
            this.f3802c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f3801b)) {
            Matcher matcher3 = f3799g.matcher(str);
            this.f3803d = matcher3.find() ? matcher3.group(2) : str4;
            return;
        }
        this.f3803d = null;
    }

    public final String a() {
        String str = this.f3802c;
        if (str == null) {
            return "UTF-8";
        }
        return str;
    }
}
