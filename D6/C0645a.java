package d6;

import com.samsung.android.knox.accounts.HostAuth;
import f6.C0909B;
import f6.C0911a;
import f6.C0929t;
import f6.L;
import g6.A0;
import g6.B;
import java.net.SocketAddress;
import java.nio.channels.UnsupportedAddressTypeException;

/* renamed from: d6.a  reason: case insensitive filesystem */
public abstract class C0645a implements C0646b {
    private final C0929t executor;
    private final A0 matcher;

    public C0645a(C0929t tVar, Class<SocketAddress> cls) {
        this.executor = (C0929t) B.checkNotNull(tVar, "executor");
        this.matcher = A0.get(cls);
    }

    public abstract boolean doIsResolved(SocketAddress socketAddress);

    public abstract void doResolve(SocketAddress socketAddress, L l8);

    public C0929t executor() {
        return this.executor;
    }

    public final boolean isResolved(SocketAddress socketAddress) {
        if (isSupported(socketAddress)) {
            return doIsResolved(socketAddress);
        }
        throw new UnsupportedAddressTypeException();
    }

    public boolean isSupported(SocketAddress socketAddress) {
        return this.matcher.match(socketAddress);
    }

    public final C0909B resolve(SocketAddress socketAddress) {
        if (!isSupported((SocketAddress) B.checkNotNull(socketAddress, HostAuth.ADDRESS))) {
            return ((C0911a) executor()).newFailedFuture(new UnsupportedAddressTypeException());
        } else if (isResolved(socketAddress)) {
            return ((C0911a) this.executor).newSucceededFuture(socketAddress);
        } else {
            try {
                L newPromise = ((C0911a) executor()).newPromise();
                doResolve(socketAddress, newPromise);
                return newPromise;
            } catch (Exception e) {
                return ((C0911a) executor()).newFailedFuture(e);
            }
        }
    }
}
