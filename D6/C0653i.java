package d6;

import f6.C0929t;
import f6.L;
import java.net.InetSocketAddress;

/* renamed from: d6.i  reason: case insensitive filesystem */
public final class C0653i extends C0645a {
    final C0654j nameResolver;

    public C0653i(C0929t tVar, C0654j jVar) {
        super(tVar, InetSocketAddress.class);
        this.nameResolver = jVar;
    }

    public void close() {
        ((C0655k) this.nameResolver).close();
    }

    public boolean doIsResolved(InetSocketAddress inetSocketAddress) {
        return !inetSocketAddress.isUnresolved();
    }

    public void doResolve(InetSocketAddress inetSocketAddress, L l8) {
        ((C0655k) this.nameResolver).resolve(inetSocketAddress.getHostName()).addListener(new C0652h(this, l8, inetSocketAddress));
    }
}
