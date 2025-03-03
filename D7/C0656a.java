package d7;

import B.C0003d;
import B3.q;
import C7.d;
import D.s0;
import P6.f;
import Q5.a;
import Q7.g;
import Y6.j;
import Y6.n;
import Y6.o;
import Y6.p;
import Y6.r;
import Y6.u;
import Y6.w;
import Z6.b;
import c7.C0625e;
import c7.h;
import c7.m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: d7.a  reason: case insensitive filesystem */
public final class C0656a implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9769a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9770b;

    public C0656a(j jVar) {
        f.e(jVar, "cookieJar");
        this.f9770b = jVar;
    }

    public static int d(u uVar, int i) {
        String b8 = uVar.f6744Z.b("Retry-After");
        if (b8 == null) {
            b8 = null;
        }
        if (b8 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        f.d(compile, "compile(...)");
        if (!compile.matcher(b8).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b8);
        f.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: D6.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: D6.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: D6.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: D6.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: D6.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Y6.u a(d7.C0661f r32) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            int r0 = r1.f9769a
            switch(r0) {
                case 0: goto L_0x019d;
                default: goto L_0x0009;
            }
        L_0x0009:
            C7.d r0 = r2.e
            c7.h r3 = r2.f9772a
            D6.r r4 = D6.r.f1269U
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
        L_0x0013:
            r0 = 1
        L_0x0014:
            r3.getClass()
            Q5.a r11 = r3.f8931c0
            if (r11 != 0) goto L_0x0195
            monitor-enter(r3)
            boolean r11 = r3.f8933e0     // Catch:{ all -> 0x0189 }
            if (r11 != 0) goto L_0x018b
            boolean r11 = r3.f8932d0     // Catch:{ all -> 0x0189 }
            if (r11 != 0) goto L_0x0181
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0083
            c7.e r0 = new c7.e
            c7.k r11 = r3.f8925W
            java.lang.Object r12 = r4.f732V
            Y6.o r12 = (Y6.o) r12
            boolean r13 = r12.i
            Y6.r r14 = r3.f8923U
            if (r13 == 0) goto L_0x004c
            javax.net.ssl.SSLSocketFactory r13 = r14.f6710i0
            if (r13 == 0) goto L_0x0044
            k7.c r15 = r14.f6714m0
            Y6.e r5 = r14.f6715n0
            r24 = r5
            r22 = r13
            r23 = r15
            goto L_0x0052
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x004c:
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x0052:
            Y6.a r5 = new Y6.a
            Y6.b r13 = r14.f6706e0
            javax.net.SocketFactory r15 = r14.f6709h0
            Y6.b r7 = r14.f6708g0
            java.util.List r6 = r14.f6713l0
            r29 = r8
            java.util.List r8 = r14.f6712k0
            java.net.ProxySelector r14 = r14.f6707f0
            r30 = r10
            java.lang.String r10 = r12.f6672d
            int r12 = r12.e
            r17 = r5
            r18 = r10
            r19 = r12
            r20 = r13
            r21 = r15
            r25 = r7
            r26 = r6
            r27 = r8
            r28 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.<init>(r11, r5, r3)
            r3.f8929a0 = r0
            goto L_0x0087
        L_0x0083:
            r29 = r8
            r30 = r10
        L_0x0087:
            boolean r0 = r3.f8935g0     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0175
            Y6.u r0 = r2.b(r4)     // Catch:{ l -> 0x0133, IOException -> 0x00f3 }
            if (r9 == 0) goto L_0x00b8
            Y6.t r0 = r0.k()     // Catch:{ all -> 0x00ac }
            Y6.t r4 = r9.k()     // Catch:{ all -> 0x00ac }
            r5 = 0
            r4.f6733g = r5     // Catch:{ all -> 0x00ac }
            Y6.u r4 = r4.a()     // Catch:{ all -> 0x00ac }
            Y6.v r6 = r4.f6745a0     // Catch:{ all -> 0x00ac }
            if (r6 != 0) goto L_0x00b0
            r0.f6735j = r4     // Catch:{ all -> 0x00ac }
            Y6.u r0 = r0.a()     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            r9 = r0
            goto L_0x00ba
        L_0x00ac:
            r0 = move-exception
            r2 = 1
            goto L_0x017d
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "priorResponse.body != null"
            r0.<init>(r2)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00b8:
            r5 = 0
            goto L_0x00aa
        L_0x00ba:
            Q5.a r0 = r3.f8931c0     // Catch:{ all -> 0x00ac }
            C7.d r4 = r1.b(r9, r0)     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x00c7
            r6 = 0
            r3.d(r6)
            return r9
        L_0x00c7:
            Y6.v r0 = r9.f6745a0     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00ce
            Z6.b.c(r0)     // Catch:{ all -> 0x00ac }
        L_0x00ce:
            int r10 = r30 + 1
            r0 = 20
            if (r10 > r0) goto L_0x00dc
            r6 = 1
            r3.d(r6)
            r8 = r29
            goto L_0x0013
        L_0x00dc:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r2.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = "Too many follow-up requests: "
            r2.append(r4)     // Catch:{ all -> 0x00ac }
            r2.append(r10)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ac }
            r0.<init>(r2)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00f3:
            r0 = move-exception
            r5 = 0
            r6 = r0
            boolean r0 = r6 instanceof f7.C0938a     // Catch:{ all -> 0x00ac }
            r7 = 1
            r0 = r0 ^ r7
            boolean r0 = r1.c(r6, r3, r4, r0)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x011c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00ac }
            int r8 = r29.size()     // Catch:{ all -> 0x00ac }
            int r8 = r8 + r7
            r0.<init>(r8)     // Catch:{ all -> 0x00ac }
            r8 = r29
            r0.addAll(r8)     // Catch:{ all -> 0x00ac }
            r0.add(r6)     // Catch:{ all -> 0x00ac }
            r3.d(r7)
            r8 = r0
        L_0x0117:
            r10 = r30
            r0 = 0
            goto L_0x0014
        L_0x011c:
            r8 = r29
            java.util.Iterator r0 = r8.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0122:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00ac }
            if (r2 == 0) goto L_0x0132
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00ac }
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch:{ all -> 0x00ac }
            g7.C0996d.a(r6, r2)     // Catch:{ all -> 0x00ac }
            goto L_0x0122
        L_0x0132:
            throw r6     // Catch:{ all -> 0x00ac }
        L_0x0133:
            r0 = move-exception
            r8 = r29
            r5 = 0
            r6 = r0
            java.io.IOException r0 = r6.f8958V     // Catch:{ all -> 0x00ac }
            r7 = 0
            boolean r0 = r1.c(r0, r3, r4, r7)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0159
            java.io.IOException r0 = r6.f8957U     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00ac }
            int r10 = r8.size()     // Catch:{ all -> 0x00ac }
            r11 = 1
            int r10 = r10 + r11
            r6.<init>(r10)     // Catch:{ all -> 0x00ac }
            r6.addAll(r8)     // Catch:{ all -> 0x00ac }
            r6.add(r0)     // Catch:{ all -> 0x00ac }
            r3.d(r11)
            r8 = r6
            goto L_0x0117
        L_0x0159:
            java.io.IOException r0 = r6.f8957U     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "<this>"
            P6.f.e(r0, r2)     // Catch:{ all -> 0x00ac }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0164:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0174
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00ac }
            java.lang.Exception r4 = (java.lang.Exception) r4     // Catch:{ all -> 0x00ac }
            g7.C0996d.a(r0, r4)     // Catch:{ all -> 0x00ac }
            goto L_0x0164
        L_0x0174:
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x0175:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x017d:
            r3.d(r2)
            throw r0
        L_0x0181:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0189 }
            r2.<init>(r0)     // Catch:{ all -> 0x0189 }
            throw r2     // Catch:{ all -> 0x0189 }
        L_0x0189:
            r0 = move-exception
            goto L_0x0193
        L_0x018b:
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0189 }
            r2.<init>(r0)     // Catch:{ all -> 0x0189 }
            throw r2     // Catch:{ all -> 0x0189 }
        L_0x0193:
            monitor-exit(r3)
            throw r0
        L_0x0195:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x019d:
            C7.d r0 = r2.e
            B3.q r3 = r0.y()
            r4 = 0
            r5 = -1
            java.lang.String r7 = "Content-Length"
            java.lang.Object r8 = r0.f734X
            Y6.m r8 = (Y6.m) r8
            java.lang.String r9 = "Host"
            java.lang.String r10 = r8.b(r9)
            java.lang.Object r11 = r0.f732V
            Y6.o r11 = (Y6.o) r11
            if (r10 != 0) goto L_0x01bf
            java.lang.String r10 = Z6.b.u(r11, r4)
            r3.N(r9, r10)
        L_0x01bf:
            java.lang.String r9 = "Connection"
            java.lang.String r10 = r8.b(r9)
            if (r10 != 0) goto L_0x01cc
            java.lang.String r10 = "Keep-Alive"
            r3.N(r9, r10)
        L_0x01cc:
            java.lang.String r9 = "Accept-Encoding"
            java.lang.String r10 = r8.b(r9)
            java.lang.String r12 = "gzip"
            if (r10 != 0) goto L_0x01e3
            java.lang.String r10 = "Range"
            java.lang.String r10 = r8.b(r10)
            if (r10 != 0) goto L_0x01e3
            r3.N(r9, r12)
            r9 = 1
            goto L_0x01e4
        L_0x01e3:
            r9 = 0
        L_0x01e4:
            java.lang.Object r10 = r1.f9770b
            Y6.j r10 = (Y6.j) r10
            java.util.List r13 = r10.z(r11)
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L_0x023a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x01fb:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x022c
            java.lang.Object r15 = r13.next()
            int r16 = r4 + 1
            if (r4 < 0) goto L_0x0224
            Y6.i r15 = (Y6.i) r15
            if (r4 <= 0) goto L_0x0212
            java.lang.String r4 = "; "
            r14.append(r4)
        L_0x0212:
            java.lang.String r4 = r15.f6646a
            r14.append(r4)
            r4 = 61
            r14.append(r4)
            java.lang.String r4 = r15.f6647b
            r14.append(r4)
            r4 = r16
            goto L_0x01fb
        L_0x0224:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r2 = "Index overflow has happened."
            r0.<init>(r2)
            throw r0
        L_0x022c:
            java.lang.String r4 = r14.toString()
            java.lang.String r13 = "StringBuilder().apply(builderAction).toString()"
            P6.f.d(r4, r13)
            java.lang.String r13 = "Cookie"
            r3.N(r13, r4)
        L_0x023a:
            java.lang.String r4 = "User-Agent"
            java.lang.String r8 = r8.b(r4)
            if (r8 != 0) goto L_0x0247
            java.lang.String r8 = "okhttp/4.12.0"
            r3.N(r4, r8)
        L_0x0247:
            C7.d r3 = r3.n()
            Y6.u r2 = r2.b(r3)
            Y6.m r3 = r2.f6744Z
            d7.C0660e.b(r10, r11, r3)
            Y6.t r4 = r2.k()
            r4.f6728a = r0
            if (r9 == 0) goto L_0x02a4
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r8 = r3.b(r0)
            if (r8 != 0) goto L_0x0265
            r8 = 0
        L_0x0265:
            boolean r8 = r12.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x02a4
            boolean r8 = d7.C0660e.a(r2)
            if (r8 == 0) goto L_0x02a4
            Y6.v r2 = r2.f6745a0
            if (r2 == 0) goto L_0x02a4
            l7.k r8 = new l7.k
            l7.h r2 = r2.l()
            r8.<init>(r2)
            D.s0 r2 = r3.d()
            r2.n(r0)
            r2.n(r7)
            Y6.m r0 = r2.g()
            D.s0 r0 = r0.d()
            r4.f6732f = r0
            java.lang.String r0 = "Content-Type"
            r3.b(r0)
            Y6.v r0 = new Y6.v
            l7.q r2 = new l7.q
            r2.<init>(r8)
            r3 = 1
            r0.<init>(r5, r2, r3)
            r4.f6733g = r0
        L_0x02a4:
            Y6.u r0 = r4.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.C0656a.a(d7.f):Y6.u");
    }

    public d b(u uVar, a aVar) {
        w wVar;
        n nVar;
        o oVar;
        c7.j jVar;
        if (aVar == null || (jVar = (c7.j) aVar.e) == null) {
            wVar = null;
        } else {
            wVar = jVar.f8939b;
        }
        int i = uVar.f6742X;
        String str = (String) uVar.f6739U.f733W;
        boolean z = false;
        if (!(i == 307 || i == 308)) {
            if (i == 401) {
                ((r) this.f9770b).f6702a0.getClass();
                return null;
            } else if (i != 421) {
                if (i == 503) {
                    u uVar2 = uVar.f6748d0;
                    if ((uVar2 == null || uVar2.f6742X != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                        return uVar.f6739U;
                    }
                    return null;
                } else if (i == 407) {
                    f.b(wVar);
                    if (wVar.f6756b.type() == Proxy.Type.HTTP) {
                        ((r) this.f9770b).f6708g0.getClass();
                        return null;
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (!((r) this.f9770b).f6701Z) {
                    return null;
                } else {
                    u uVar3 = uVar.f6748d0;
                    if ((uVar3 == null || uVar3.f6742X != 408) && d(uVar, 0) <= 0) {
                        return uVar.f6739U;
                    }
                    return null;
                }
            } else if (aVar == null || f.a(((Y6.a) ((C0625e) aVar.f4124c).e).f6596h.f6672d, ((c7.j) aVar.e).f8939b.f6755a.f6596h.f6672d)) {
                return null;
            } else {
                c7.j jVar2 = (c7.j) aVar.e;
                synchronized (jVar2) {
                    jVar2.f8946k = true;
                }
                return uVar.f6739U;
            }
        }
        r rVar = (r) this.f9770b;
        if (!rVar.f6703b0) {
            return null;
        }
        String b8 = uVar.f6744Z.b("Location");
        if (b8 == null) {
            b8 = null;
        }
        if (b8 == null) {
            return null;
        }
        d dVar = uVar.f6739U;
        o oVar2 = (o) dVar.f732V;
        oVar2.getClass();
        try {
            nVar = new n();
            nVar.c(oVar2, b8);
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        if (nVar != null) {
            oVar = nVar.a();
        } else {
            oVar = null;
        }
        if (oVar == null) {
            return null;
        }
        if (!f.a(oVar.f6669a, ((o) dVar.f732V).f6669a) && !rVar.f6704c0) {
            return null;
        }
        q y8 = dVar.y();
        if (C0003d.E(str)) {
            boolean equals = str.equals("PROPFIND");
            int i8 = uVar.f6742X;
            if (equals || i8 == 308 || i8 == 307) {
                z = true;
            }
            if (str.equals("PROPFIND") || i8 == 308 || i8 == 307) {
                y8.U(str, (g) null);
            } else {
                y8.U("GET", (g) null);
            }
            if (!z) {
                ((s0) y8.f451W).n("Transfer-Encoding");
                ((s0) y8.f451W).n("Content-Length");
                ((s0) y8.f451W).n("Content-Type");
            }
        }
        if (!b.a((o) dVar.f732V, oVar)) {
            ((s0) y8.f451W).n("Authorization");
        }
        y8.f449U = oVar;
        return y8.n();
    }

    public boolean c(IOException iOException, h hVar, d dVar, boolean z) {
        boolean z6;
        m mVar;
        c7.j jVar;
        if (!((r) this.f9770b).f6701Z) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        C0625e eVar = hVar.f8929a0;
        f.b(eVar);
        int i = eVar.f8914a;
        if (i == 0 && eVar.f8915b == 0 && eVar.f8916c == 0) {
            z6 = false;
        } else {
            if (((w) eVar.i) == null) {
                w wVar = null;
                if (i <= 1 && eVar.f8915b <= 1 && eVar.f8916c <= 0 && (jVar = ((h) eVar.f8918f).f8930b0) != null) {
                    synchronized (jVar) {
                        if (jVar.f8947l == 0) {
                            if (b.a(jVar.f8939b.f6755a.f6596h, ((Y6.a) eVar.e).f6596h)) {
                                wVar = jVar.f8939b;
                            }
                        }
                    }
                }
                if (wVar != null) {
                    eVar.i = wVar;
                } else {
                    D2.j jVar2 = (D2.j) eVar.f8919g;
                    if ((jVar2 == null || !jVar2.p()) && (mVar = (m) eVar.f8920h) != null) {
                        z6 = mVar.i();
                    }
                }
            }
            z6 = true;
        }
        if (!z6) {
            return false;
        }
        return true;
    }

    public C0656a(r rVar) {
        f.e(rVar, "client");
        this.f9770b = rVar;
    }
}
