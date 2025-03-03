package g7;

import P6.f;
import Q7.g;
import Y6.r;
import com.samsung.android.knox.accounts.HostAuth;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k7.C1163a;
import k7.C1164b;
import k7.C1166d;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile n f12045a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f12046b = Logger.getLogger(r.class.getName());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: g7.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: g7.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: g7.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: g7.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: g7.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: g7.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: g7.n} */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21, types: [g7.m] */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25, types: [g7.e] */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v30, types: [g7.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r2 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r2 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        if (r2 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if (java.lang.Integer.parseInt(r4) >= 9) goto L_0x0158;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARNING: Unknown variable types count: 3 */
    static {
        /*
            r0 = 1
            r1 = 0
            boolean r2 = a1.C0410a.s()
            r3 = 0
            if (r2 == 0) goto L_0x0075
            java.util.Map r0 = h7.C1085c.f12621b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet r5 = h7.C1085c.f12620a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x0013
            r4.setUseParentHandlers(r1)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L_0x0044
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            goto L_0x0050
        L_0x0044:
            r5 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r5)
            if (r2 == 0) goto L_0x004e
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            goto L_0x0050
        L_0x004e:
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
        L_0x0050:
            r4.setLevel(r2)
            h7.d r2 = h7.C1086d.f12622a
            r4.addHandler(r2)
            goto L_0x0013
        L_0x0059:
            boolean r0 = g7.C0993a.f12022d
            if (r0 == 0) goto L_0x0063
            g7.a r0 = new g7.a
            r0.<init>()
            goto L_0x0064
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r0 != 0) goto L_0x0161
            boolean r0 = g7.C0995c.e
            if (r0 == 0) goto L_0x006f
            g7.c r3 = new g7.c
            r3.<init>()
        L_0x006f:
            P6.f.b(r3)
        L_0x0072:
            r0 = r3
            goto L_0x0161
        L_0x0075:
            java.security.Provider[] r2 = java.security.Security.getProviders()
            r2 = r2[r1]
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0097
            boolean r2 = g7.h.f12033d
            if (r2 == 0) goto L_0x0091
            g7.h r2 = new g7.h
            r2.<init>()
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            if (r2 == 0) goto L_0x0097
        L_0x0094:
            r0 = r2
            goto L_0x0161
        L_0x0097:
            java.security.Provider[] r2 = java.security.Security.getProviders()
            r2 = r2[r1]
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "BC"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00b7
            boolean r2 = g7.C0997e.f12030d
            if (r2 == 0) goto L_0x00b3
            g7.e r2 = new g7.e
            r2.<init>()
            goto L_0x00b4
        L_0x00b3:
            r2 = r3
        L_0x00b4:
            if (r2 == 0) goto L_0x00b7
            goto L_0x0094
        L_0x00b7:
            java.security.Provider[] r2 = java.security.Security.getProviders()
            r2 = r2[r1]
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "OpenJSSE"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00d7
            boolean r2 = g7.m.f12043d
            if (r2 == 0) goto L_0x00d3
            g7.m r2 = new g7.m
            r2.<init>()
            goto L_0x00d4
        L_0x00d3:
            r2 = r3
        L_0x00d4:
            if (r2 == 0) goto L_0x00d7
            goto L_0x0094
        L_0x00d7:
            boolean r2 = g7.k.f12042c
            if (r2 == 0) goto L_0x00e1
            g7.k r2 = new g7.k
            r2.<init>()
            goto L_0x00e2
        L_0x00e1:
            r2 = r3
        L_0x00e2:
            if (r2 == 0) goto L_0x00e5
            goto L_0x0094
        L_0x00e5:
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "java.specification.version"
            java.lang.String r5 = "unknown"
            java.lang.String r4 = java.lang.System.getProperty(r4, r5)
            java.lang.String r5 = "jvmVersion"
            P6.f.d(r4, r5)     // Catch:{ NumberFormatException -> 0x00fd }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00fd }
            r5 = 9
            if (r4 < r5) goto L_0x00fd
            goto L_0x0158
        L_0x00fd:
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r4 = java.lang.Class.forName(r4, r0, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r5 = java.lang.Class.forName(r5, r0, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r11 = java.lang.Class.forName(r6, r0, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r12 = java.lang.Class.forName(r6, r0, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r6 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            r7[r1] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            r7[r0] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.reflect.Method r8 = r4.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r5 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            r6[r1] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.reflect.Method r9 = r4.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r5 = "remove"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            r0[r1] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.reflect.Method r10 = r4.getMethod(r5, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            g7.j r0 = new g7.j     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r1 = "putMethod"
            P6.f.d(r8, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r1 = "getMethod"
            P6.f.d(r9, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r1 = "removeMethod"
            P6.f.d(r10, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r1 = "clientProviderClass"
            P6.f.d(r11, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            java.lang.String r1 = "serverProviderClass"
            P6.f.d(r12, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0157 }
            r3 = r0
            goto L_0x0158
        L_0x0157:
        L_0x0158:
            if (r3 == 0) goto L_0x015c
            goto L_0x0072
        L_0x015c:
            g7.n r0 = new g7.n
            r0.<init>()
        L_0x0161:
            f12045a = r0
            java.lang.Class<Y6.r> r0 = Y6.r.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f12046b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.n.<clinit>():void");
    }

    public static void i(int i, String str, Throwable th) {
        Level level;
        f.e(str, "message");
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f12046b.log(level, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public g b(X509TrustManager x509TrustManager) {
        return new C1163a(c(x509TrustManager));
    }

    public C1166d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        f.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C1164b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        f.e(inetSocketAddress, HostAuth.ADDRESS);
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f12046b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        f.e(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        f.e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext instance = SSLContext.getInstance("TLS");
        f.d(instance, "getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k8 = k();
            k8.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = k8.getSocketFactory();
            f.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        f.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                f.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        f.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
