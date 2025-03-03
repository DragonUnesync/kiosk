package U1;

import M0.J;
import P0.r;
import P0.z;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f5419a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(r rVar) {
        rVar.getClass();
        String j7 = rVar.j(StandardCharsets.UTF_8);
        if (j7 == null || !j7.startsWith("WEBVTT")) {
            return false;
        }
        return true;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = z.f3748a;
        String[] split = str.split("\\.", 2);
        long j7 = 0;
        for (String parseLong : split[0].split(":", -1)) {
            j7 = (j7 * 60) + Long.parseLong(parseLong);
        }
        long j8 = j7 * 1000;
        if (split.length == 2) {
            j8 += Long.parseLong(split[1]);
        }
        return j8 * 1000;
    }

    public static void d(r rVar) {
        int i = rVar.f3733b;
        if (!a(rVar)) {
            rVar.H(i);
            throw J.a((RuntimeException) null, "Expected WEBVTT. Got " + rVar.j(StandardCharsets.UTF_8));
        }
    }
}
