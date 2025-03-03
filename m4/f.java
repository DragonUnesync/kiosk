package m4;

import e6.C0862v;
import j$.util.Objects;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final f f13379d;

    /* renamed from: a  reason: collision with root package name */
    public final InetSocketAddress f13380a;

    /* renamed from: b  reason: collision with root package name */
    public final e f13381b;

    /* renamed from: c  reason: collision with root package name */
    public final g f13382c;

    static {
        InetSocketAddress inetSocketAddress;
        byte[] createByteArrayFromIpAddressString = C0862v.createByteArrayFromIpAddressString("localhost");
        if (createByteArrayFromIpAddressString != null) {
            try {
                inetSocketAddress = new InetSocketAddress(InetAddress.getByAddress(createByteArrayFromIpAddressString), 1883);
            } catch (UnknownHostException unused) {
            }
            f13379d = new f(inetSocketAddress, (e) null, (g) null);
        }
        inetSocketAddress = InetSocketAddress.createUnresolved("localhost", 1883);
        f13379d = new f(inetSocketAddress, (e) null, (g) null);
    }

    public f(InetSocketAddress inetSocketAddress, e eVar, g gVar) {
        this.f13380a = inetSocketAddress;
        this.f13381b = eVar;
        this.f13382c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f13380a.equals(fVar.f13380a) || !Objects.equals(this.f13381b, fVar.f13381b) || !Objects.equals(this.f13382c, fVar.f13382c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.f13381b);
        return ((((Objects.hashCode(this.f13382c) + ((hashCode + (this.f13380a.hashCode() * 961)) * 31)) * 961) + 10000) * 31) + 60000;
    }
}
