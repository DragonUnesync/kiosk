package a6;

import N.e;
import Q0.g;
import T5.C0260n;
import T5.C0274u0;
import T5.K;
import T5.O0;
import T5.P;
import T5.W;
import T5.Y;
import Z5.C;
import Z5.C0405x;
import Z5.C0406y;
import Z5.E;
import Z5.G;
import Z5.L;
import Z5.a0;
import Z5.j0;
import Z5.l0;
import Z5.n0;
import e6.C0847f;
import e6.C0862v;
import f6.d0;
import java.net.URI;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a6.A  reason: case insensitive filesystem */
public abstract class C0427A {
    private static final AtomicIntegerFieldUpdater<C0427A> FORCE_CLOSE_INIT_UPDATER = AtomicIntegerFieldUpdater.newUpdater(C0427A.class, "forceCloseInit");
    private static final String HTTPS_SCHEME_PREFIX = (n0.HTTPS + "://");
    private static final String HTTP_SCHEME_PREFIX = (n0.HTTP + "://");
    private final boolean absoluteUpgradeUrl;
    private volatile String actualSubprotocol;
    protected final L customHeaders;
    private final String expectedSubprotocol;
    private volatile int forceCloseInit;
    private volatile long forceCloseTimeoutMillis = 10000;
    protected final boolean generateOriginHeader;
    private volatile boolean handshakeComplete;
    private final int maxFramePayloadLength;
    private final URI uri;
    private final O version;

    public C0427A(URI uri2, O o2, String str, L l8, int i, long j7, boolean z, boolean z6) {
        this.uri = uri2;
        this.version = o2;
        this.expectedSubprotocol = str;
        this.customHeaders = l8;
        this.maxFramePayloadLength = i;
        this.forceCloseTimeoutMillis = j7;
        this.absoluteUpgradeUrl = z;
        this.generateOriginHeader = z6;
    }

    private void setActualSubprotocol(String str) {
        this.actualSubprotocol = str;
    }

    private void setHandshakeComplete() {
        this.handshakeComplete = true;
    }

    public static CharSequence websocketHostValue(URI uri2) {
        int port = uri2.getPort();
        if (port == -1) {
            return uri2.getHost();
        }
        String host = uri2.getHost();
        String scheme = uri2.getScheme();
        n0 n0Var = n0.HTTP;
        if (port != n0Var.port()) {
            n0 n0Var2 = n0.HTTPS;
            if (port != n0Var2.port()) {
                return C0862v.toSocketAddressString(host, port);
            }
            if (n0Var2.name().contentEquals(scheme) || K.WSS.name().contentEquals(scheme)) {
                return host;
            }
            return C0862v.toSocketAddressString(host, port);
        } else if (n0Var.name().contentEquals(scheme) || K.WS.name().contentEquals(scheme)) {
            return host;
        } else {
            return C0862v.toSocketAddressString(host, port);
        }
    }

    public static CharSequence websocketOriginValue(URI uri2) {
        int i;
        String str;
        String scheme = uri2.getScheme();
        int port = uri2.getPort();
        K k8 = K.WSS;
        if (k8.name().contentEquals(scheme) || n0.HTTPS.name().contentEquals(scheme) || (scheme == null && port == k8.port())) {
            str = HTTPS_SCHEME_PREFIX;
            i = k8.port();
        } else {
            str = HTTP_SCHEME_PREFIX;
            i = K.WS.port();
        }
        String lowerCase = uri2.getHost().toLowerCase(Locale.US);
        if (port == i || port == -1) {
            return e.x(str, lowerCase);
        }
        StringBuilder r8 = g.r(str);
        r8.append(C0862v.toSocketAddressString(lowerCase, port));
        return r8.toString();
    }

    public String expectedSubprotocol() {
        return this.expectedSubprotocol;
    }

    public final void finishHandshake(K k8, C0406y yVar) {
        String str;
        verify(yVar);
        String str2 = yVar.headers().get((CharSequence) G.SEC_WEBSOCKET_PROTOCOL);
        if (str2 != null) {
            str = str2.trim();
        } else {
            str = null;
        }
        String str3 = this.expectedSubprotocol;
        if (str3 == null) {
            str3 = "";
        }
        if (!str3.isEmpty() || str != null) {
            if (!str3.isEmpty() && str != null && !str.isEmpty()) {
                String[] split = str3.split(",");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    if (split[i].trim().equals(str)) {
                        setActualSubprotocol(str);
                    } else {
                        i++;
                    }
                }
            }
            String str4 = this.expectedSubprotocol;
            throw new s("Invalid subprotocol. Actual: " + str + ". Expected one of: " + str4, yVar);
        }
        setActualSubprotocol(this.expectedSubprotocol);
        setHandshakeComplete();
        C0260n nVar = (C0260n) k8;
        O0 o02 = (O0) nVar.pipeline();
        E e = (E) o02.get(E.class);
        a0 a0Var = (a0) o02.get(a0.class);
        if (a0Var != null) {
            o02.remove((W) a0Var);
        }
        Y context = o02.context((Class<? extends W>) l0.class);
        if (context == null) {
            Y context2 = o02.context((Class<? extends W>) C.class);
            if (context2 != null) {
                C c8 = (C) context2.handler();
                c8.removeOutboundHandler();
                o02.addAfter(context2.name(), "ws-decoder", newWebsocketDecoder());
                ((d0) nVar.eventLoop()).execute(new u(this, o02, c8));
                return;
            }
            throw new IllegalStateException("ChannelPipeline does not contain an HttpRequestEncoder or HttpClientCodec");
        }
        Class cls = j0.class;
        if (o02.get(cls) != null) {
            o02.remove(cls);
        }
        o02.addAfter(context.name(), "ws-decoder", newWebsocketDecoder());
        ((d0) nVar.eventLoop()).execute(new v(this, o02, context));
    }

    public final P handshake(K k8, C0274u0 u0Var) {
        String str;
        C0260n nVar = (C0260n) k8;
        O0 o02 = (O0) nVar.pipeline();
        if (((l0) o02.get(l0.class)) == null && ((C) o02.get(C.class)) == null) {
            u0Var.setFailure(new IllegalStateException("ChannelPipeline does not contain an HttpResponseDecoder or HttpClientCodec"));
            return u0Var;
        }
        if (this.uri.getHost() == null) {
            L l8 = this.customHeaders;
            if (l8 == null || !l8.contains((CharSequence) G.HOST)) {
                u0Var.setFailure(new IllegalArgumentException("Cannot generate the 'host' header value, webSocketURI should contain host or passed through customHeaders"));
                return u0Var;
            } else if (this.generateOriginHeader) {
                L l9 = this.customHeaders;
                C0847f fVar = G.ORIGIN;
                if (!l9.contains((CharSequence) fVar)) {
                    O o2 = this.version;
                    if (o2 == O.V07 || o2 == O.V08) {
                        str = G.SEC_WEBSOCKET_ORIGIN.toString();
                    } else {
                        str = fVar.toString();
                    }
                    u0Var.setFailure(new IllegalArgumentException(e.y("Cannot generate the '", str, "' header value, webSocketURI should contain host or disable generateOriginHeader or pass value through customHeaders")));
                    return u0Var;
                }
            }
        }
        nVar.writeAndFlush(newHandshakeRequest()).addListener(new t(this, u0Var));
        return u0Var;
    }

    public int maxFramePayloadLength() {
        return this.maxFramePayloadLength;
    }

    public abstract C0405x newHandshakeRequest();

    public abstract I newWebSocketEncoder();

    public abstract H newWebsocketDecoder();

    public String upgradeUrl(URI uri2) {
        if (this.absoluteUpgradeUrl) {
            return uri2.toString();
        }
        String rawPath = uri2.getRawPath();
        if (rawPath == null || rawPath.isEmpty()) {
            rawPath = "/";
        }
        String rawQuery = uri2.getRawQuery();
        if (rawQuery == null || rawQuery.isEmpty()) {
            return rawPath;
        }
        return rawPath + '?' + rawQuery;
    }

    public URI uri() {
        return this.uri;
    }

    public abstract void verify(C0406y yVar);

    public O version() {
        return this.version;
    }
}
