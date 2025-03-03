package W6;

import P6.f;
import java.nio.charset.Charset;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f6191a;

    static {
        Charset forName = Charset.forName("UTF-8");
        f.d(forName, "forName(...)");
        f6191a = forName;
        f.d(Charset.forName("UTF-16"), "forName(...)");
        f.d(Charset.forName("UTF-16BE"), "forName(...)");
        f.d(Charset.forName("UTF-16LE"), "forName(...)");
        f.d(Charset.forName("US-ASCII"), "forName(...)");
        f.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
