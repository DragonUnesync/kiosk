package U7;

import R7.b;
import S7.k;
import java.util.regex.Pattern;

public final class j extends p {

    /* renamed from: a  reason: collision with root package name */
    public final String f5449a;

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f5450b;

    public j(String str, Pattern pattern) {
        this.f5449a = b.b(str);
        this.f5450b = pattern;
    }

    public final int a() {
        return 8;
    }

    public final boolean b(k kVar, k kVar2) {
        String str = this.f5449a;
        if (!kVar2.l(str) || !this.f5450b.matcher(kVar2.c(str)).find()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String pattern = this.f5450b.toString();
        return "[" + this.f5449a + "~=" + pattern + "]";
    }
}
