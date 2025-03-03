package m4;

import j$.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLParameters;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final e f13377b;

    /* renamed from: a  reason: collision with root package name */
    public final HostnameVerifier f13378a;

    static {
        HostnameVerifier hostnameVerifier;
        try {
            new SSLParameters().setEndpointIdentificationAlgorithm("HTTPS");
            hostnameVerifier = null;
        } catch (NoSuchMethodError unused) {
            hostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
        }
        f13377b = new e(hostnameVerifier);
    }

    public e(HostnameVerifier hostnameVerifier) {
        this.f13378a = hostnameVerifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        return Objects.equals(this.f13378a, eVar.f13378a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f13378a) + 310000;
    }
}
