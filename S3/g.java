package S3;

import java.nio.charset.Charset;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4531a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f4532b;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        f4531a = name;
        if ("SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name)) {
            z = true;
        } else {
            z = false;
        }
        f4532b = z;
    }
}
