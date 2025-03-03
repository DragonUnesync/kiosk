package x4;

import A4.g;
import H4.c;
import H4.d;
import O4.a;
import T5.C0245f0;
import T5.C0260n;
import T5.K;
import T5.O0;
import T5.W;
import T5.Y;
import V5.e;
import V5.h;
import Z5.C;
import Z5.L;
import Z5.a0;
import a6.C0427A;
import a6.C0428B;
import a6.O;
import b6.C0539b1;
import b6.C0542c1;
import b6.C1;
import b6.J1;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.TrustManagerFactory;
import m4.C1214b;
import r4.C1389a;
import y4.C1634a;
import z4.f;

public final class b extends C0245f0 {

    /* renamed from: U  reason: collision with root package name */
    public final C1214b f16273U;

    /* renamed from: V  reason: collision with root package name */
    public final a f16274V;

    /* renamed from: W  reason: collision with root package name */
    public final z4.b f16275W;

    /* renamed from: X  reason: collision with root package name */
    public final C1389a f16276X;

    /* renamed from: Y  reason: collision with root package name */
    public final f f16277Y;

    /* renamed from: Z  reason: collision with root package name */
    public final g f16278Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C1634a f16279a0;

    /* renamed from: b0  reason: collision with root package name */
    public final L5.a f16280b0;

    public b(C1214b bVar, a aVar, z4.b bVar2, C1389a aVar2, f fVar, g gVar, C1634a aVar3, L5.a aVar4) {
        this.f16273U = bVar;
        this.f16274V = aVar;
        this.f16275W = bVar2;
        this.f16276X = aVar2;
        this.f16277Y = fVar;
        this.f16278Z = gVar;
        this.f16279a0 = aVar3;
        this.f16280b0 = aVar4;
    }

    public final void c(K k8) {
        ((O0) ((O0) ((O0) ((O0) ((C0260n) k8).pipeline()).addLast("encoder", (W) this.f16276X)).addLast("auth", (W) this.f16279a0)).addLast("connect", (W) this.f16277Y)).addLast("disconnect", (W) this.f16278Z);
    }

    public final void d(K k8) {
        String str;
        K k9 = k8;
        C1214b bVar = this.f16273U;
        m4.g gVar = bVar.f13365l.f13382c;
        if (gVar == null) {
            c(k8);
            return;
        }
        d dVar = (d) this.f16280b0.get();
        C1605a aVar = new C1605a(this, 1);
        F4.b bVar2 = new F4.b(2, this);
        dVar.getClass();
        try {
            m4.f fVar = bVar.f13365l;
            InetSocketAddress inetSocketAddress = fVar.f13380a;
            if (fVar.f13381b == null) {
                str = "ws";
            } else {
                str = "wss";
            }
            C0427A newHandshaker = C0428B.newHandshaker(new URI(str, (String) null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), "/", "", (String) null), O.V13, "mqtt", true, (L) null, 268435460, true, false);
            ((O0) ((O0) ((O0) ((O0) ((O0) ((C0260n) k9).pipeline()).addLast("http.codec", (W) new C())).addLast("http.aggregator", (W) new a0(65535))).addLast("http.headers", (W) new c(gVar.f13384b))).addLast("ws.handshake", (W) new H4.f(newHandshaker, aVar, bVar2))).addLast("ws.mqtt", (W) dVar.f2152a);
        } catch (URISyntaxException e) {
            bVar2.accept(k9, e);
        }
    }

    public final void handlerAdded(Y y8) {
        ((O0) y8.pipeline()).remove((W) this);
        h tcpNoDelay = ((e) ((e) ((e) ((W5.e) ((V5.g) y8.channel())).config()).setAutoClose(false)).setKeepAlive(true)).setTcpNoDelay(true);
        C1214b bVar = this.f16273U;
        bVar.f13365l.getClass();
        ((e) tcpNoDelay).setConnectTimeoutMillis(10000);
        K channel = y8.channel();
        bVar.f13365l.getClass();
        m4.f fVar = bVar.f13365l;
        m4.e eVar = fVar.f13381b;
        if (eVar == null) {
            d(channel);
            return;
        }
        C1605a aVar = new C1605a(this, 0);
        F4.b bVar2 = new F4.b(2, this);
        InetSocketAddress inetSocketAddress = fVar.f13380a;
        try {
            C0539b1 b1Var = bVar.f13366m;
            if (b1Var == null) {
                b1Var = C0542c1.forClient().trustManager((TrustManagerFactory) null).keyManager((KeyManagerFactory) null).protocols((String[]) null).ciphers((Iterable<String>) null, J1.INSTANCE).build();
                bVar.f13366m = b1Var;
            }
            C0260n nVar = (C0260n) channel;
            C1 newHandler = b1Var.newHandler(nVar.alloc(), inetSocketAddress.getHostString(), inetSocketAddress.getPort());
            newHandler.setHandshakeTimeoutMillis((long) 10000);
            HostnameVerifier hostnameVerifier = eVar.f13378a;
            if (hostnameVerifier == null) {
                SSLParameters sSLParameters = newHandler.engine().getSSLParameters();
                sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
                newHandler.engine().setSSLParameters(sSLParameters);
            }
            ((O0) ((O0) nVar.pipeline()).addLast("ssl", (W) newHandler)).addLast("ssl.adapter", (W) new E4.a(newHandler, inetSocketAddress.getHostString(), hostnameVerifier, aVar, bVar2));
        } catch (Throwable th) {
            bVar2.accept(channel, th);
        }
    }

    public final boolean isSharable() {
        return false;
    }
}
