package Q5;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static int f4126d;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f4127a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4128b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4129c;

    public b(Object obj, e eVar) {
        if (obj instanceof String) {
            this.f4127a = new String[]{(String) obj};
        } else if (obj instanceof List) {
            this.f4127a = (String[]) ((List) obj).toArray(new String[0]);
        } else if (obj instanceof String[]) {
            this.f4127a = (String[]) obj;
        } else {
            throw new IllegalArgumentException("commands parameter must be of type String, List<String> or String[]");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        Locale locale = Locale.ENGLISH;
        int i = f4126d + 1;
        f4126d = i;
        sb.append(String.format(locale, "-%08x", new Object[]{Integer.valueOf(i)}));
        this.f4129c = sb.toString();
        this.f4128b = eVar;
    }
}
