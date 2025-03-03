package H2;

import B2.f;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

public final class g implements f {

    /* renamed from: b  reason: collision with root package name */
    public final k f1955b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f1956c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1957d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public URL f1958f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f1959g;

    /* renamed from: h  reason: collision with root package name */
    public int f1960h;

    public g(URL url) {
        k kVar = h.f1961a;
        W2.f.c(url, "Argument must not be null");
        this.f1956c = url;
        this.f1957d = null;
        W2.f.c(kVar, "Argument must not be null");
        this.f1955b = kVar;
    }

    public final void a(MessageDigest messageDigest) {
        if (this.f1959g == null) {
            this.f1959g = c().getBytes(f.f383a);
        }
        messageDigest.update(this.f1959g);
    }

    public final String c() {
        String str = this.f1957d;
        if (str != null) {
            return str;
        }
        URL url = this.f1956c;
        W2.f.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f1958f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.f1957d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f1956c;
                    W2.f.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f1958f = new URL(this.e);
        }
        return this.f1958f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!c().equals(gVar.c()) || !this.f1955b.equals(gVar.f1955b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f1960h == 0) {
            int hashCode = c().hashCode();
            this.f1960h = hashCode;
            this.f1960h = this.f1955b.f1964b.hashCode() + (hashCode * 31);
        }
        return this.f1960h;
    }

    public final String toString() {
        return c();
    }

    public g(String str) {
        k kVar = h.f1961a;
        this.f1956c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f1957d = str;
            W2.f.c(kVar, "Argument must not be null");
            this.f1955b = kVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
