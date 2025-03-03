package Y6;

import P6.f;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final a f6755a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f6756b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f6757c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        f.e(inetSocketAddress, "socketAddress");
        this.f6755a = aVar;
        this.f6756b = proxy;
        this.f6757c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (!f.a(wVar.f6755a, this.f6755a) || !f.a(wVar.f6756b, this.f6756b) || !f.a(wVar.f6757c, this.f6757c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6756b.hashCode();
        return this.f6757c.hashCode() + ((hashCode + ((this.f6755a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f6757c + '}';
    }
}
