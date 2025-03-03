package c7;

import C7.d;
import D.s0;
import P6.f;
import Q7.g;
import Y6.a;
import Y6.l;
import Y6.m;
import Y6.r;
import Y6.s;
import Y6.t;
import Y6.u;
import Y6.w;
import Z1.c;
import Z6.b;
import b7.C0596b;
import b7.C0598d;
import d7.C0659d;
import d7.C0661f;
import e7.C0869d;
import f7.C0936A;
import f7.h;
import f7.o;
import f7.p;
import f7.x;
import g7.n;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import l7.i;
import l7.q;
import l7.y;

public final class j extends h {

    /* renamed from: b  reason: collision with root package name */
    public final w f8939b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f8940c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f8941d;
    public l e;

    /* renamed from: f  reason: collision with root package name */
    public s f8942f;

    /* renamed from: g  reason: collision with root package name */
    public o f8943g;

    /* renamed from: h  reason: collision with root package name */
    public q f8944h;
    public l7.o i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8945j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8946k;

    /* renamed from: l  reason: collision with root package name */
    public int f8947l;

    /* renamed from: m  reason: collision with root package name */
    public int f8948m;

    /* renamed from: n  reason: collision with root package name */
    public int f8949n;

    /* renamed from: o  reason: collision with root package name */
    public int f8950o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f8951p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f8952q = Long.MAX_VALUE;

    public j(k kVar, w wVar) {
        f.e(kVar, "connectionPool");
        f.e(wVar, "route");
        this.f8939b = wVar;
    }

    public static void d(r rVar, w wVar, IOException iOException) {
        f.e(rVar, "client");
        f.e(wVar, "failedRoute");
        f.e(iOException, "failure");
        if (wVar.f6756b.type() != Proxy.Type.DIRECT) {
            a aVar = wVar.f6755a;
            aVar.f6595g.connectFailed(aVar.f6596h.f(), wVar.f6756b.address(), iOException);
        }
        c cVar = rVar.f6719s0;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.f6955V).add(wVar);
        }
    }

    public final synchronized void a(o oVar, C0936A a8) {
        int i8;
        f.e(oVar, "connection");
        f.e(a8, "settings");
        if ((a8.f11693a & 16) != 0) {
            i8 = a8.f11694b[4];
        } else {
            i8 = Integer.MAX_VALUE;
        }
        this.f8950o = i8;
    }

    public final void b(f7.w wVar) {
        wVar.c(8, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r8, int r9, int r10, boolean r11, c7.h r12) {
        /*
            r7 = this;
            java.lang.String r0 = "inetSocketAddress"
            java.lang.String r1 = "call"
            P6.f.e(r12, r1)
            Y6.s r1 = r7.f8942f
            if (r1 != 0) goto L_0x0127
            Y6.w r1 = r7.f8939b
            Y6.a r1 = r1.f6755a
            java.util.List r1 = r1.f6597j
            c7.b r2 = new c7.b
            r2.<init>(r1)
            Y6.w r3 = r7.f8939b
            Y6.a r3 = r3.f6755a
            javax.net.ssl.SSLSocketFactory r4 = r3.f6592c
            if (r4 != 0) goto L_0x0059
            Y6.h r3 = Y6.h.f6637f
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x004c
            Y6.w r1 = r7.f8939b
            Y6.a r1 = r1.f6755a
            Y6.o r1 = r1.f6596h
            java.lang.String r1 = r1.f6672d
            g7.n r3 = g7.n.f12045a
            g7.n r3 = g7.n.f12045a
            boolean r3 = r3.h(r1)
            if (r3 == 0) goto L_0x0039
            goto L_0x0063
        L_0x0039:
            c7.l r8 = new c7.l
            java.net.UnknownServiceException r9 = new java.net.UnknownServiceException
            java.lang.String r10 = "CLEARTEXT communication to "
            java.lang.String r11 = " not permitted by network security policy"
            java.lang.String r10 = N.e.y(r10, r1, r11)
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x004c:
            c7.l r8 = new c7.l
            java.net.UnknownServiceException r9 = new java.net.UnknownServiceException
            java.lang.String r10 = "CLEARTEXT communication not enabled for client"
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x0059:
            java.util.List r1 = r3.i
            Y6.s r3 = Y6.s.H2_PRIOR_KNOWLEDGE
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x011a
        L_0x0063:
            r1 = 0
            r3 = r1
        L_0x0065:
            r4 = 1
            Y6.w r5 = r7.f8939b     // Catch:{ IOException -> 0x0085 }
            Y6.a r6 = r5.f6755a     // Catch:{ IOException -> 0x0085 }
            javax.net.ssl.SSLSocketFactory r6 = r6.f6592c     // Catch:{ IOException -> 0x0085 }
            if (r6 == 0) goto L_0x007a
            java.net.Proxy r5 = r5.f6756b     // Catch:{ IOException -> 0x0085 }
            java.net.Proxy$Type r5 = r5.type()     // Catch:{ IOException -> 0x0085 }
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x0085 }
            if (r5 != r6) goto L_0x007a
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            if (r5 == 0) goto L_0x0087
            r7.f(r8, r9, r10, r12)     // Catch:{ IOException -> 0x0085 }
            java.net.Socket r5 = r7.f8940c     // Catch:{ IOException -> 0x0085 }
            if (r5 != 0) goto L_0x008a
            goto L_0x0094
        L_0x0085:
            r5 = move-exception
            goto L_0x00bf
        L_0x0087:
            r7.e(r8, r9, r12)     // Catch:{ IOException -> 0x0085 }
        L_0x008a:
            r7.g(r2, r12)     // Catch:{ IOException -> 0x0085 }
            Y6.w r5 = r7.f8939b     // Catch:{ IOException -> 0x0085 }
            java.net.InetSocketAddress r5 = r5.f6757c     // Catch:{ IOException -> 0x0085 }
            P6.f.e(r5, r0)     // Catch:{ IOException -> 0x0085 }
        L_0x0094:
            Y6.w r8 = r7.f8939b
            Y6.a r9 = r8.f6755a
            javax.net.ssl.SSLSocketFactory r9 = r9.f6592c
            if (r9 == 0) goto L_0x00b8
            java.net.Proxy r8 = r8.f6756b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.HTTP
            if (r8 != r9) goto L_0x00b8
            java.net.Socket r8 = r7.f8940c
            if (r8 == 0) goto L_0x00ab
            goto L_0x00b8
        L_0x00ab:
            c7.l r8 = new c7.l
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r10 = "Too many tunnel connections attempted: 21"
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x00b8:
            long r8 = java.lang.System.nanoTime()
            r7.f8952q = r8
            return
        L_0x00bf:
            java.net.Socket r6 = r7.f8941d
            if (r6 == 0) goto L_0x00c6
            Z6.b.d(r6)
        L_0x00c6:
            java.net.Socket r6 = r7.f8940c
            if (r6 == 0) goto L_0x00cd
            Z6.b.d(r6)
        L_0x00cd:
            r7.f8941d = r1
            r7.f8940c = r1
            r7.f8944h = r1
            r7.i = r1
            r7.e = r1
            r7.f8942f = r1
            r7.f8943g = r1
            r7.f8950o = r4
            Y6.w r6 = r7.f8939b
            java.net.InetSocketAddress r6 = r6.f6757c
            P6.f.e(r6, r0)
            if (r3 != 0) goto L_0x00ec
            c7.l r3 = new c7.l
            r3.<init>(r5)
            goto L_0x00f3
        L_0x00ec:
            java.io.IOException r6 = r3.f8957U
            g7.C0996d.a(r6, r5)
            r3.f8958V = r5
        L_0x00f3:
            if (r11 == 0) goto L_0x0119
            r2.f8900d = r4
            boolean r4 = r2.f8899c
            if (r4 == 0) goto L_0x0119
            boolean r4 = r5 instanceof java.net.ProtocolException
            if (r4 != 0) goto L_0x0119
            boolean r4 = r5 instanceof java.io.InterruptedIOException
            if (r4 != 0) goto L_0x0119
            boolean r4 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L_0x010f
            java.lang.Throwable r4 = r5.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 != 0) goto L_0x0119
        L_0x010f:
            boolean r4 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 != 0) goto L_0x0119
            boolean r4 = r5 instanceof javax.net.ssl.SSLException
            if (r4 == 0) goto L_0x0119
            goto L_0x0065
        L_0x0119:
            throw r3
        L_0x011a:
            c7.l r8 = new c7.l
            java.net.UnknownServiceException r9 = new java.net.UnknownServiceException
            java.lang.String r10 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x0127:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "already connected"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.j.c(int, int, int, boolean, c7.h):void");
    }

    public final void e(int i8, int i9, h hVar) {
        int i10;
        Socket socket;
        w wVar = this.f8939b;
        Proxy proxy = wVar.f6756b;
        a aVar = wVar.f6755a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = i.f8938a[type.ordinal()];
        }
        if (i10 == 1 || i10 == 2) {
            socket = aVar.f6591b.createSocket();
            f.b(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f8940c = socket;
        InetSocketAddress inetSocketAddress = this.f8939b.f6757c;
        f.e(hVar, "call");
        f.e(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i9);
        try {
            n nVar = n.f12045a;
            n.f12045a.e(socket, this.f8939b.f6757c, i8);
            try {
                this.f8944h = new q(g7.l.p(socket));
                this.i = new l7.o(g7.l.o(socket));
            } catch (NullPointerException e8) {
                if (f.a(e8.getMessage(), "throw with null exception")) {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f8939b.f6757c);
            connectException.initCause(e9);
            throw connectException;
        }
    }

    public final void f(int i8, int i9, int i10, h hVar) {
        B3.q qVar = new B3.q(9);
        w wVar = this.f8939b;
        Y6.o oVar = wVar.f6755a.f6596h;
        f.e(oVar, "url");
        qVar.f449U = oVar;
        qVar.U("CONNECT", (g) null);
        a aVar = wVar.f6755a;
        qVar.N("Host", b.u(aVar.f6596h, true));
        qVar.N("Proxy-Connection", "Keep-Alive");
        qVar.N("User-Agent", "okhttp/4.12.0");
        d n4 = qVar.n();
        s0 s0Var = new s0(5);
        F.h.f("Proxy-Authenticate");
        F.h.g("OkHttp-Preemptive", "Proxy-Authenticate");
        s0Var.n("Proxy-Authenticate");
        s0Var.f("Proxy-Authenticate", "OkHttp-Preemptive");
        s0Var.g();
        aVar.f6594f.getClass();
        e(i8, i9, hVar);
        q qVar2 = this.f8944h;
        f.b(qVar2);
        l7.o oVar2 = this.i;
        f.b(oVar2);
        m mVar = new m((r) null, this, qVar2, oVar2);
        y a8 = qVar2.f13236U.a();
        long j7 = (long) i9;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a8.g(j7, timeUnit);
        oVar2.f13232U.a().g((long) i10, timeUnit);
        mVar.l((m) n4.f734X, "CONNECT " + b.u((Y6.o) n4.f732V, true) + " HTTP/1.1");
        mVar.a();
        t f8 = mVar.f(false);
        f.b(f8);
        f8.f6728a = n4;
        u a9 = f8.a();
        long j8 = b.j(a9);
        if (j8 != -1) {
            C0869d j9 = mVar.j(j8);
            b.s(j9, Integer.MAX_VALUE, timeUnit);
            j9.close();
        }
        int i11 = a9.f6742X;
        if (i11 != 200) {
            if (i11 == 407) {
                aVar.f6594f.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(Q0.g.m(i11, "Unexpected response code for CONNECT: "));
        } else if (!qVar2.f13237V.k() || !oVar2.f13233V.k()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(c7.C0622b r12, c7.h r13) {
        /*
            r11 = this;
            r0 = 1
            Y6.w r1 = r11.f8939b
            Y6.a r1 = r1.f6755a
            javax.net.ssl.SSLSocketFactory r2 = r1.f6592c
            Y6.s r3 = Y6.s.HTTP_1_1
            if (r2 != 0) goto L_0x0026
            java.util.List r12 = r1.i
            Y6.s r13 = Y6.s.H2_PRIOR_KNOWLEDGE
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x001f
            java.net.Socket r12 = r11.f8940c
            r11.f8941d = r12
            r11.f8942f = r13
            r11.m()
            return
        L_0x001f:
            java.net.Socket r12 = r11.f8940c
            r11.f8941d = r12
            r11.f8942f = r3
            return
        L_0x0026:
            java.lang.String r1 = "call"
            P6.f.e(r13, r1)
            java.lang.String r13 = "Hostname "
            java.lang.String r1 = "\n              |Hostname "
            Y6.w r2 = r11.f8939b
            Y6.a r2 = r2.f6755a
            javax.net.ssl.SSLSocketFactory r4 = r2.f6592c
            r5 = 0
            P6.f.b(r4)     // Catch:{ all -> 0x016a }
            java.net.Socket r6 = r11.f8940c     // Catch:{ all -> 0x016a }
            Y6.o r7 = r2.f6596h     // Catch:{ all -> 0x016a }
            java.lang.String r8 = r7.f6672d     // Catch:{ all -> 0x016a }
            int r7 = r7.e     // Catch:{ all -> 0x016a }
            java.net.Socket r4 = r4.createSocket(r6, r8, r7, r0)     // Catch:{ all -> 0x016a }
            java.lang.String r6 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            P6.f.c(r4, r6)     // Catch:{ all -> 0x016a }
            javax.net.ssl.SSLSocket r4 = (javax.net.ssl.SSLSocket) r4     // Catch:{ all -> 0x016a }
            Y6.h r12 = r12.a(r4)     // Catch:{ all -> 0x0062 }
            boolean r6 = r12.f6639b     // Catch:{ all -> 0x0062 }
            if (r6 == 0) goto L_0x0066
            g7.n r6 = g7.n.f12045a     // Catch:{ all -> 0x0062 }
            g7.n r6 = g7.n.f12045a     // Catch:{ all -> 0x0062 }
            Y6.o r7 = r2.f6596h     // Catch:{ all -> 0x0062 }
            java.lang.String r7 = r7.f6672d     // Catch:{ all -> 0x0062 }
            java.util.List r8 = r2.i     // Catch:{ all -> 0x0062 }
            r6.d(r4, r7, r8)     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r12 = move-exception
            r5 = r4
            goto L_0x016b
        L_0x0066:
            r4.startHandshake()     // Catch:{ all -> 0x0062 }
            javax.net.ssl.SSLSession r6 = r4.getSession()     // Catch:{ all -> 0x0062 }
            java.lang.String r7 = "sslSocketSession"
            P6.f.d(r6, r7)     // Catch:{ all -> 0x0062 }
            Y6.l r7 = E.e.m(r6)     // Catch:{ all -> 0x0062 }
            javax.net.ssl.HostnameVerifier r8 = r2.f6593d     // Catch:{ all -> 0x0062 }
            P6.f.b(r8)     // Catch:{ all -> 0x0062 }
            Y6.o r9 = r2.f6596h     // Catch:{ all -> 0x0062 }
            java.lang.String r9 = r9.f6672d     // Catch:{ all -> 0x0062 }
            boolean r6 = r8.verify(r9, r6)     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x0109
            java.util.List r12 = r7.a()     // Catch:{ all -> 0x0062 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x00ee
            r13 = 0
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            P6.f.c(r12, r13)     // Catch:{ all -> 0x0062 }
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12     // Catch:{ all -> 0x0062 }
            javax.net.ssl.SSLPeerUnverifiedException r13 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r0.<init>(r1)     // Catch:{ all -> 0x0062 }
            Y6.o r1 = r2.f6596h     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r1.f6672d     // Catch:{ all -> 0x0062 }
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = " not verified:\n              |    certificate: "
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            Y6.e r1 = Y6.e.f6616c     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = D7.b.J(r12)     // Catch:{ all -> 0x0062 }
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "\n              |    DN: "
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.security.Principal r1 = r12.getSubjectDN()     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0062 }
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "\n              |    subjectAltNames: "
            r0.append(r1)     // Catch:{ all -> 0x0062 }
            r1 = 7
            java.util.List r1 = k7.C1165c.a(r12, r1)     // Catch:{ all -> 0x0062 }
            r2 = 2
            java.util.List r12 = k7.C1165c.a(r12, r2)     // Catch:{ all -> 0x0062 }
            java.util.ArrayList r12 = D6.i.R(r1, r12)     // Catch:{ all -> 0x0062 }
            r0.append(r12)     // Catch:{ all -> 0x0062 }
            java.lang.String r12 = "\n              "
            r0.append(r12)     // Catch:{ all -> 0x0062 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x0062 }
            java.lang.String r12 = W6.e.V(r12)     // Catch:{ all -> 0x0062 }
            r13.<init>(r12)     // Catch:{ all -> 0x0062 }
            throw r13     // Catch:{ all -> 0x0062 }
        L_0x00ee:
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r0.<init>(r13)     // Catch:{ all -> 0x0062 }
            Y6.o r13 = r2.f6596h     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = r13.f6672d     // Catch:{ all -> 0x0062 }
            r0.append(r13)     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = " not verified (no certificates)"
            r0.append(r13)     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0062 }
            r12.<init>(r13)     // Catch:{ all -> 0x0062 }
            throw r12     // Catch:{ all -> 0x0062 }
        L_0x0109:
            Y6.e r13 = r2.e     // Catch:{ all -> 0x0062 }
            P6.f.b(r13)     // Catch:{ all -> 0x0062 }
            Y6.l r1 = new Y6.l     // Catch:{ all -> 0x0062 }
            Y6.x r6 = r7.f6656a     // Catch:{ all -> 0x0062 }
            Y6.g r8 = r7.f6657b     // Catch:{ all -> 0x0062 }
            java.util.List r9 = r7.f6658c     // Catch:{ all -> 0x0062 }
            Y6.d r10 = new Y6.d     // Catch:{ all -> 0x0062 }
            r10.<init>(r13, r7, r2, r0)     // Catch:{ all -> 0x0062 }
            r1.<init>(r6, r8, r9, r10)     // Catch:{ all -> 0x0062 }
            r11.e = r1     // Catch:{ all -> 0x0062 }
            Y6.o r0 = r2.f6596h     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.f6672d     // Catch:{ all -> 0x0062 }
            Y6.k r1 = new Y6.k     // Catch:{ all -> 0x0062 }
            r2 = 3
            r1.<init>(r2, r11)     // Catch:{ all -> 0x0062 }
            r13.a(r0, r1)     // Catch:{ all -> 0x0062 }
            boolean r12 = r12.f6639b     // Catch:{ all -> 0x0062 }
            if (r12 == 0) goto L_0x0139
            g7.n r12 = g7.n.f12045a     // Catch:{ all -> 0x0062 }
            g7.n r12 = g7.n.f12045a     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = r12.f(r4)     // Catch:{ all -> 0x0062 }
        L_0x0139:
            r11.f8941d = r4     // Catch:{ all -> 0x0062 }
            l7.c r12 = g7.l.p(r4)     // Catch:{ all -> 0x0062 }
            l7.q r13 = new l7.q     // Catch:{ all -> 0x0062 }
            r13.<init>(r12)     // Catch:{ all -> 0x0062 }
            r11.f8944h = r13     // Catch:{ all -> 0x0062 }
            l7.b r12 = g7.l.o(r4)     // Catch:{ all -> 0x0062 }
            l7.o r13 = new l7.o     // Catch:{ all -> 0x0062 }
            r13.<init>(r12)     // Catch:{ all -> 0x0062 }
            r11.i = r13     // Catch:{ all -> 0x0062 }
            if (r5 == 0) goto L_0x0157
            Y6.s r3 = N7.a.h(r5)     // Catch:{ all -> 0x0062 }
        L_0x0157:
            r11.f8942f = r3     // Catch:{ all -> 0x0062 }
            g7.n r12 = g7.n.f12045a
            g7.n r12 = g7.n.f12045a
            r12.a(r4)
            Y6.s r12 = r11.f8942f
            Y6.s r13 = Y6.s.HTTP_2
            if (r12 != r13) goto L_0x0169
            r11.m()
        L_0x0169:
            return
        L_0x016a:
            r12 = move-exception
        L_0x016b:
            if (r5 == 0) goto L_0x0174
            g7.n r13 = g7.n.f12045a
            g7.n r13 = g7.n.f12045a
            r13.a(r5)
        L_0x0174:
            if (r5 == 0) goto L_0x0179
            Z6.b.d(r5)
        L_0x0179:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.j.g(c7.b, c7.h):void");
    }

    public final synchronized void h() {
        this.f8948m++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (k7.C1165c.c(r1, (java.security.cert.X509Certificate) r10) != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(Y6.a r9, java.util.List r10) {
        /*
            r8 = this;
            r0 = 0
            byte[] r1 = Z6.b.f6982a
            java.util.ArrayList r1 = r8.f8951p
            int r1 = r1.size()
            int r2 = r8.f8950o
            if (r1 >= r2) goto L_0x00cc
            boolean r1 = r8.f8945j
            if (r1 == 0) goto L_0x0013
            goto L_0x00cc
        L_0x0013:
            Y6.w r1 = r8.f8939b
            Y6.a r2 = r1.f6755a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L_0x001e
            return r0
        L_0x001e:
            Y6.o r2 = r9.f6596h
            java.lang.String r3 = r2.f6672d
            Y6.a r4 = r1.f6755a
            Y6.o r5 = r4.f6596h
            java.lang.String r5 = r5.f6672d
            boolean r3 = P6.f.a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L_0x0030
            return r5
        L_0x0030:
            f7.o r3 = r8.f8943g
            if (r3 != 0) goto L_0x0035
            return r0
        L_0x0035:
            if (r10 == 0) goto L_0x00cc
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x003f
            goto L_0x00cc
        L_0x003f:
            java.util.Iterator r10 = r10.iterator()
        L_0x0043:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00cc
            java.lang.Object r3 = r10.next()
            Y6.w r3 = (Y6.w) r3
            java.net.Proxy r6 = r3.f6756b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L_0x0043
            java.net.Proxy r6 = r1.f6756b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L_0x0043
            java.net.InetSocketAddress r3 = r3.f6757c
            java.net.InetSocketAddress r6 = r1.f6757c
            boolean r3 = P6.f.a(r6, r3)
            if (r3 == 0) goto L_0x0043
            k7.c r10 = k7.C1165c.f13054a
            javax.net.ssl.HostnameVerifier r1 = r9.f6593d
            if (r1 == r10) goto L_0x0072
            return r0
        L_0x0072:
            byte[] r10 = Z6.b.f6982a
            Y6.o r10 = r4.f6596h
            int r1 = r10.e
            int r3 = r2.e
            if (r3 == r1) goto L_0x007d
            goto L_0x00cc
        L_0x007d:
            java.lang.String r10 = r10.f6672d
            java.lang.String r1 = r2.f6672d
            boolean r10 = P6.f.a(r1, r10)
            if (r10 == 0) goto L_0x0088
            goto L_0x00ab
        L_0x0088:
            boolean r10 = r8.f8946k
            if (r10 != 0) goto L_0x00cc
            Y6.l r10 = r8.e
            if (r10 == 0) goto L_0x00cc
            java.util.List r10 = r10.a()
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x00cc
            java.lang.Object r10 = r10.get(r0)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            P6.f.c(r10, r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = k7.C1165c.c(r1, r10)
            if (r10 == 0) goto L_0x00cc
        L_0x00ab:
            Y6.e r9 = r9.e     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            P6.f.b(r9)     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            Y6.l r10 = r8.e     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            P6.f.b(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            java.util.List r10 = r10.a()     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            java.lang.String r2 = "hostname"
            P6.f.e(r1, r2)     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            java.lang.String r2 = "peerCertificates"
            P6.f.e(r10, r2)     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            Y6.d r2 = new Y6.d     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            r2.<init>(r9, r10, r1, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            r9.a(r1, r2)     // Catch:{ SSLPeerUnverifiedException -> 0x00cc }
            return r5
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.j.i(Y6.a, java.util.List):boolean");
    }

    public final boolean j(boolean z) {
        long j7;
        int soTimeout;
        byte[] bArr = b.f6982a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f8940c;
        f.b(socket);
        Socket socket2 = this.f8941d;
        f.b(socket2);
        q qVar = this.f8944h;
        f.b(qVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o oVar = this.f8943g;
        if (oVar != null) {
            return oVar.m(nanoTime);
        }
        synchronized (this) {
            j7 = nanoTime - this.f8952q;
        }
        if (j7 < 10000000000L || !z) {
            return true;
        }
        try {
            soTimeout = socket2.getSoTimeout();
            socket2.setSoTimeout(1);
            boolean z6 = !qVar.k();
            socket2.setSoTimeout(soTimeout);
            return z6;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket2.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public final C0659d k(r rVar, C0661f fVar) {
        f.e(rVar, "client");
        Socket socket = this.f8941d;
        f.b(socket);
        q qVar = this.f8944h;
        f.b(qVar);
        l7.o oVar = this.i;
        f.b(oVar);
        o oVar2 = this.f8943g;
        if (oVar2 != null) {
            return new p(rVar, this, fVar, oVar2);
        }
        int i8 = fVar.f9777g;
        socket.setSoTimeout(i8);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.f13236U.a().g((long) i8, timeUnit);
        oVar.f13232U.a().g((long) fVar.f9778h, timeUnit);
        return new m(rVar, this, qVar, oVar);
    }

    public final synchronized void l() {
        this.f8945j = true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [u.O, java.lang.Object] */
    public final void m() {
        int i8;
        Socket socket = this.f8941d;
        f.b(socket);
        q qVar = this.f8944h;
        f.b(qVar);
        l7.o oVar = this.i;
        f.b(oVar);
        socket.setSoTimeout(0);
        C0598d dVar = C0598d.f8695h;
        f.e(dVar, "taskRunner");
        ? obj = new Object();
        obj.f15529a = dVar;
        obj.f15533f = h.f11722a;
        String str = this.f8939b.f6755a.f6596h.f6672d;
        f.e(str, "peerName");
        obj.f15530b = socket;
        String str2 = b.f6986f + ' ' + str;
        f.e(str2, "<set-?>");
        obj.f15531c = str2;
        obj.f15532d = qVar;
        obj.e = oVar;
        obj.f15533f = this;
        o oVar2 = new o(obj);
        this.f8943g = oVar2;
        C0936A a8 = o.f11737t0;
        if ((a8.f11693a & 16) != 0) {
            i8 = a8.f11694b[4];
        } else {
            i8 = Integer.MAX_VALUE;
        }
        this.f8950o = i8;
        x xVar = oVar2.f11759q0;
        synchronized (xVar) {
            try {
                if (!xVar.f11806X) {
                    Logger logger = x.f11802Z;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(b.h(">> CONNECTION " + f7.f.f11718a.b(), new Object[0]));
                    }
                    l7.o oVar3 = xVar.f11803U;
                    i iVar = f7.f.f11718a;
                    oVar3.getClass();
                    f.e(iVar, "byteString");
                    if (!oVar3.f13234W) {
                        oVar3.f13233V.w(iVar);
                        oVar3.k();
                        xVar.f11803U.flush();
                    } else {
                        throw new IllegalStateException("closed");
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        oVar2.f11759q0.r(oVar2.f11753j0);
        int a9 = oVar2.f11753j0.a();
        if (a9 != 65535) {
            oVar2.f11759q0.s(0, (long) (a9 - 65535));
        }
        dVar.e().c(new C0596b(oVar2.f11760r0, 0, oVar2.f11740W), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        w wVar = this.f8939b;
        sb.append(wVar.f6755a.f6596h.f6672d);
        sb.append(':');
        sb.append(wVar.f6755a.f6596h.e);
        sb.append(", proxy=");
        sb.append(wVar.f6756b);
        sb.append(" hostAddress=");
        sb.append(wVar.f6757c);
        sb.append(" cipherSuite=");
        l lVar = this.e;
        if (lVar == null || (obj = lVar.f6657b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f8942f);
        sb.append('}');
        return sb.toString();
    }
}
