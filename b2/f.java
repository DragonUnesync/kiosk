package B2;

import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f383a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
