package Y6;

import N.e;
import P6.f;
import Q0.g;
import android.support.v4.media.session.b;
import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f6590a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f6591b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f6592c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f6593d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final b f6594f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f6595g;

    /* renamed from: h  reason: collision with root package name */
    public final o f6596h;
    public final List i;

    /* renamed from: j  reason: collision with root package name */
    public final List f6597j;

    public a(String str, int i8, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        String str2;
        f.e(str, "uriHost");
        f.e(bVar, "dns");
        f.e(socketFactory, "socketFactory");
        f.e(bVar2, "proxyAuthenticator");
        f.e(list, "protocols");
        f.e(list2, "connectionSpecs");
        f.e(proxySelector, "proxySelector");
        this.f6590a = bVar;
        this.f6591b = socketFactory;
        this.f6592c = sSLSocketFactory;
        this.f6593d = hostnameVerifier;
        this.e = eVar;
        this.f6594f = bVar2;
        this.f6595g = proxySelector;
        n nVar = new n();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (str2.equalsIgnoreCase("http")) {
            nVar.f6661a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            nVar.f6661a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        String N2 = b.N(b.e(str, 0, 0, false, 7));
        if (N2 != null) {
            nVar.f6664d = N2;
            if (1 > i8 || i8 >= 65536) {
                throw new IllegalArgumentException(g.m(i8, "unexpected port: ").toString());
            }
            nVar.e = i8;
            this.f6596h = nVar.a();
            this.i = Z6.b.v(list);
            this.f6597j = Z6.b.v(list2);
            return;
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(a aVar) {
        f.e(aVar, "that");
        if (!f.a(this.f6590a, aVar.f6590a) || !f.a(this.f6594f, aVar.f6594f) || !f.a(this.i, aVar.i) || !f.a(this.f6597j, aVar.f6597j) || !f.a(this.f6595g, aVar.f6595g) || !f.a((Object) null, (Object) null) || !f.a(this.f6592c, aVar.f6592c) || !f.a(this.f6593d, aVar.f6593d) || !f.a(this.e, aVar.e) || this.f6596h.e != aVar.f6596h.e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!f.a(this.f6596h, aVar.f6596h) || !a(aVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int u3 = e.u(527, 31, this.f6596h.f6675h);
        int hashCode = this.f6594f.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.f6597j.hashCode();
        int hashCode4 = this.f6595g.hashCode();
        int hashCode5 = Objects.hashCode(this.f6592c);
        int hashCode6 = Objects.hashCode(this.f6593d);
        return Objects.hashCode(this.e) + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f6590a.hashCode() + u3) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.f6596h;
        sb.append(oVar.f6672d);
        sb.append(':');
        sb.append(oVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f6595g);
        sb.append('}');
        return sb.toString();
    }
}
