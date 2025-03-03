package M7;

import java.io.StringWriter;
import java.util.Locale;

public final class f extends d {

    /* renamed from: b  reason: collision with root package name */
    public final int f3188b;

    public f(int i) {
        this.f3188b = i;
    }

    public final boolean b(int i, StringWriter stringWriter) {
        if (i >= 32 && i <= this.f3188b) {
            return false;
        }
        if (i > 65535) {
            char[] chars = Character.toChars(i);
            StringBuilder sb = new StringBuilder("\\u");
            String hexString = Integer.toHexString(chars[0]);
            Locale locale = Locale.ENGLISH;
            sb.append(hexString.toUpperCase(locale));
            sb.append("\\u");
            sb.append(Integer.toHexString(chars[1]).toUpperCase(locale));
            stringWriter.write(sb.toString());
        } else {
            stringWriter.write("\\u");
            char[] cArr = c.f3179a;
            stringWriter.write(cArr[(i >> 12) & 15]);
            stringWriter.write(cArr[(i >> 8) & 15]);
            stringWriter.write(cArr[(i >> 4) & 15]);
            stringWriter.write(cArr[i & 15]);
        }
        return true;
    }
}
