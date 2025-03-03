package f1;

import M0.J;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final z f11643c = new z(0, -9223372036854775807L);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f11644d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a  reason: collision with root package name */
    public final long f11645a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11646b;

    public z(long j7, long j8) {
        this.f11645a = j7;
        this.f11646b = j8;
    }

    public static z a(String str) {
        long j7;
        long j8;
        Matcher matcher = f11644d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = x.f11632a;
        if (matches) {
            String group = matcher.group(1);
            if (group != null) {
                int i = P0.z.f3748a;
                if (group.equals("now")) {
                    j7 = 0;
                } else {
                    j7 = (long) (Float.parseFloat(group) * 1000.0f);
                }
                String group2 = matcher.group(2);
                if (group2 != null) {
                    try {
                        j8 = (long) (Float.parseFloat(group2) * 1000.0f);
                        if (j8 < j7) {
                            throw J.b((Exception) null, str);
                        }
                    } catch (NumberFormatException e) {
                        throw J.b(e, group2);
                    }
                } else {
                    j8 = -9223372036854775807L;
                }
                return new z(j7, j8);
            }
            throw J.b((Exception) null, str);
        }
        throw J.b((Exception) null, str);
    }
}
