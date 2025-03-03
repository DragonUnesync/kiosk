package R5;

import T5.C0260n;
import T5.C0270s0;
import T5.C0274u0;
import T5.K;
import T5.O0;
import T5.P;
import d6.C0645a;
import d6.C0648d;
import f6.C0909B;
import f6.d0;
import g6.B;
import h6.C1082c;
import h6.d;
import java.net.SocketAddress;

public final class h extends b {
    private static final C1082c logger = d.getInstance((Class<?>) h.class);
    private final i config = new i(this);
    private volatile boolean disableResolver;
    private volatile SocketAddress remoteAddress;

    public h() {
    }

    /* access modifiers changed from: private */
    public static void doConnect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        K channel = u0Var.channel();
        ((d0) channel.eventLoop()).execute(new f(socketAddress2, channel, socketAddress, u0Var));
    }

    private P doResolveAndConnect(SocketAddress socketAddress, SocketAddress socketAddress2) {
        P initAndRegister = initAndRegister();
        K channel = initAndRegister.channel();
        if (!initAndRegister.isDone()) {
            a aVar = new a(channel);
            initAndRegister.addListener(new d(this, aVar, channel, socketAddress, socketAddress2));
            return aVar;
        } else if (!initAndRegister.isSuccess()) {
            return initAndRegister;
        } else {
            C0260n nVar = (C0260n) channel;
            return doResolveAndConnect0(nVar, socketAddress, socketAddress2, nVar.newPromise());
        }
    }

    /* access modifiers changed from: private */
    public P doResolveAndConnect0(K k8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        try {
            if (this.disableResolver) {
                doConnect(socketAddress, socketAddress2, u0Var);
                return u0Var;
            }
            C0645a aVar = (C0645a) g.getOrDefault((g) null).getResolver(k8.eventLoop());
            if (aVar.isSupported(socketAddress)) {
                if (!aVar.isResolved(socketAddress)) {
                    C0909B resolve = aVar.resolve(socketAddress);
                    if (resolve.isDone()) {
                        Throwable cause = resolve.cause();
                        if (cause != null) {
                            ((C0260n) k8).close();
                            u0Var.setFailure(cause);
                        } else {
                            doConnect((SocketAddress) resolve.getNow(), socketAddress2, u0Var);
                        }
                        return u0Var;
                    }
                    resolve.addListener(new e(this, k8, u0Var, socketAddress2));
                    return u0Var;
                }
            }
            doConnect(socketAddress, socketAddress2, u0Var);
            return u0Var;
        } catch (Throwable th) {
            u0Var.tryFailure(th);
        }
    }

    public P connect(SocketAddress socketAddress, SocketAddress socketAddress2) {
        B.checkNotNull(socketAddress, "remoteAddress");
        validate();
        return doResolveAndConnect(socketAddress, socketAddress2);
    }

    public void init(K k8) {
        C0260n nVar = (C0260n) k8;
        C0270s0 pipeline = nVar.pipeline();
        ((O0) pipeline).addLast(this.config.handler());
        b.setChannelOptions(nVar, newOptionsArray(), logger);
        b.setAttributes(nVar, newAttributesArray());
    }

    public final SocketAddress remoteAddress() {
        return this.remoteAddress;
    }

    public final C0648d resolver() {
        if (this.disableResolver) {
            return null;
        }
        return g.getOrDefault((g) null);
    }

    public h validate() {
        super.validate();
        if (this.config.handler() != null) {
            return this;
        }
        throw new IllegalStateException("handler not set");
    }

    public h clone() {
        return new h(this);
    }

    public final i config() {
        return this.config;
    }

    private h(h hVar) {
        super(hVar);
        hVar.getClass();
        this.disableResolver = hVar.disableResolver;
        this.remoteAddress = hVar.remoteAddress;
    }
}
