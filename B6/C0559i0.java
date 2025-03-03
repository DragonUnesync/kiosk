package b6;

import javax.net.ssl.X509KeyManager;

/* renamed from: b6.i0  reason: case insensitive filesystem */
public final class C0559i0 {
    private final Iterable<String> aliases;
    /* access modifiers changed from: private */
    public final X509KeyManager keyManager;
    private final String password;

    public C0559i0(X509KeyManager x509KeyManager, String str, Iterable<String> iterable) {
        this.keyManager = x509KeyManager;
        this.password = str;
        this.aliases = iterable;
    }

    public V newProvider() {
        return new C0556h0(this.keyManager, this.password, this.aliases);
    }
}
