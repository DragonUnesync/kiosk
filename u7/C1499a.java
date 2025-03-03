package u7;

import N7.a;
import P6.f;
import Q0.g;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.sender.HttpSender$Method;
import r7.C1395d;
import r7.C1399h;

/* renamed from: u7.a  reason: case insensitive filesystem */
public abstract class C1499a {

    /* renamed from: a  reason: collision with root package name */
    public final C1395d f15818a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f15819b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpSender$Method f15820c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15821d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15822f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15823g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f15824h;
    public final C1399h i;

    public C1499a(C1395d dVar, Context context, HttpSender$Method httpSender$Method, String str, String str2, int i8, int i9, Map map) {
        f.e(dVar, "config");
        f.e(context, "context");
        f.e(httpSender$Method, "method");
        this.f15818a = dVar;
        this.f15819b = context;
        this.f15820c = httpSender$Method;
        this.f15821d = str;
        this.e = str2;
        this.f15822f = i8;
        this.f15823g = i9;
        this.f15824h = map;
        this.i = (C1399h) a.k(dVar, C1399h.class);
    }

    public static void c(int i8, String str) {
        ErrorReporter errorReporter = C1247a.f13789a;
        if (i8 >= 200 && i8 < 300) {
            n2.a.l0("Request received by server");
        } else if (i8 == 408 || i8 >= 500) {
            n2.a.m1("Could not send ACRA Post responseCode=" + i8 + " message=" + str);
            throw new IOException(g.m(i8, "Host returned error code "));
        } else if (i8 >= 400) {
            n2.a.m1(i8 + ": Client error - request will be discarded");
        } else {
            n2.a.m1("Could not send ACRA Post - request will be discarded. responseCode=" + i8 + " message=" + str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(javax.net.ssl.HttpsURLConnection r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r1 = javax.net.ssl.TrustManagerFactory.getInstance(r1)
            android.content.Context r2 = r9.f15819b
            java.lang.String r3 = "context"
            P6.f.e(r2, r3)
            r7.d r3 = r9.f15818a
            java.lang.String r4 = "config"
            P6.f.e(r3, r4)
            java.lang.Class<r7.h> r4 = r7.C1399h.class
            r7.a r3 = N7.a.k(r3, r4)
            r7.h r3 = (r7.C1399h) r3
            java.lang.String r4 = "clazz"
            java.lang.Class r5 = r3.f15016c0
            P6.f.e(r5, r4)
            java.lang.String r4 = "Failed to create instance of class "
            r6 = 0
            java.lang.Object r4 = r5.newInstance()     // Catch:{ InstantiationException -> 0x003f, IllegalAccessException -> 0x002e }
            goto L_0x0050
        L_0x002e:
            r7 = move-exception
            org.acra.ErrorReporter r8 = n7.C1247a.f13789a
            org.acra.ErrorReporter r8 = n7.C1247a.f13789a
            java.lang.String r5 = r5.getName()
            java.lang.String r4 = r4.concat(r5)
            n2.a.B(r4, r7)
            goto L_0x004f
        L_0x003f:
            r7 = move-exception
            org.acra.ErrorReporter r8 = n7.C1247a.f13789a
            org.acra.ErrorReporter r8 = n7.C1247a.f13789a
            java.lang.String r5 = r5.getName()
            java.lang.String r4 = r4.concat(r5)
            n2.a.B(r4, r7)
        L_0x004f:
            r4 = r6
        L_0x0050:
            if (r4 != 0) goto L_0x0057
            A7.e r4 = new A7.e
            r4.<init>()
        L_0x0057:
            A7.d r4 = (A7.d) r4
            java.security.KeyStore r4 = r4.create(r2)
            if (r4 != 0) goto L_0x00a0
            java.lang.Integer r5 = r3.f15018e0
            java.lang.String r7 = r3.f15019f0
            if (r5 == 0) goto L_0x0073
            A7.g r0 = new A7.g
            int r3 = r5.intValue()
            r0.<init>(r7, r3)
            java.security.KeyStore r4 = r0.create(r2)
            goto L_0x00a0
        L_0x0073:
            java.lang.String r3 = r3.f15017d0
            if (r3 == 0) goto L_0x00a0
            java.lang.String r4 = "asset://"
            boolean r4 = W6.l.a0(r3, r4, r0)
            if (r4 == 0) goto L_0x0095
            A7.a r4 = new A7.a
            r5 = 8
            java.lang.String r3 = r3.substring(r5)
            java.lang.String r5 = "substring(...)"
            P6.f.d(r3, r5)
            r4.<init>(r0, r7, r3)
            java.security.KeyStore r0 = r4.create(r2)
        L_0x0093:
            r4 = r0
            goto L_0x00a0
        L_0x0095:
            A7.a r0 = new A7.a
            r4 = 1
            r0.<init>(r4, r7, r3)
            java.security.KeyStore r0 = r0.create(r2)
            goto L_0x0093
        L_0x00a0:
            r1.init(r4)
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            javax.net.ssl.TrustManager[] r1 = r1.getTrustManagers()
            r0.init(r6, r1, r6)
            A7.f r1 = new A7.f
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.lang.String r2 = "getSocketFactory(...)"
            P6.f.d(r0, r2)
            r7.h r2 = r9.i
            java.util.List r2 = r2.f15022i0
            r1.<init>(r0, r2)
            r10.setSSLSocketFactory(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.C1499a.a(javax.net.ssl.HttpsURLConnection):void");
    }

    public abstract String b(Context context, Object obj);

    public final void d(URL url, Object obj) {
        String str;
        f.e(url, "url");
        URLConnection openConnection = url.openConnection();
        f.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                a((HttpsURLConnection) httpURLConnection);
            } catch (GeneralSecurityException e8) {
                ErrorReporter errorReporter = C1247a.f13789a;
                n2.a.B("Could not configure SSL for ACRA request to " + url, e8);
            }
        }
        httpURLConnection.setConnectTimeout(this.f15822f);
        httpURLConnection.setReadTimeout(this.f15823g);
        httpURLConnection.setRequestProperty("User-Agent", String.format("Android ACRA %1$s", Arrays.copyOf(new Object[]{"5.12.0"}, 1)));
        httpURLConnection.setRequestProperty("Accept", "text/html,application/xml,application/json,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
        httpURLConnection.setRequestProperty("Content-Type", b(this.f15819b, obj));
        String str2 = this.f15821d;
        if (!(str2 == null || (str = this.e) == null)) {
            String str3 = str2 + ":" + str;
            Charset charset = W6.a.f6191a;
            byte[] bytes = str3.getBytes(charset);
            f.d(bytes, "getBytes(...)");
            byte[] encode = Base64.encode(bytes, 2);
            f.d(encode, "encode(...)");
            httpURLConnection.setRequestProperty("Authorization", "Basic ".concat(new String(encode, charset)));
        }
        C1399h hVar = this.i;
        if (hVar.f15020g0) {
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
        Map map = this.f15824h;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        ErrorReporter errorReporter2 = C1247a.f13789a;
        try {
            f(httpURLConnection, this.f15820c, obj);
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            f.d(responseMessage, "getResponseMessage(...)");
            c(responseCode, responseMessage);
            httpURLConnection.disconnect();
        } catch (SocketTimeoutException e9) {
            if (hVar.f15015b0) {
                ErrorReporter errorReporter3 = C1247a.f13789a;
                Log.w("a", "Dropped report due to timeout");
                return;
            }
            throw e9;
        }
    }

    public abstract void e(FilterOutputStream filterOutputStream, Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        g7.l.c(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.net.HttpURLConnection r4, org.acra.sender.HttpSender$Method r5, java.lang.Object r6) {
        /*
            r3 = this;
            java.lang.String r0 = "method"
            P6.f.e(r5, r0)
            java.lang.String r5 = r5.name()
            r4.setRequestMethod(r5)
            r5 = 1
            r4.setDoOutput(r5)
            r7.h r5 = r3.i
            boolean r0 = r5.f15021h0
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x001b
            r4.setChunkedStreamingMode(r1)
        L_0x001b:
            java.lang.String r0 = "http.keepAlive"
            java.lang.String r2 = "false"
            java.lang.System.setProperty(r0, r2)
            r4.connect()
            boolean r5 = r5.f15020g0
            if (r5 == 0) goto L_0x0033
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream
            java.io.OutputStream r4 = r4.getOutputStream()
            r5.<init>(r4, r1)
            goto L_0x003c
        L_0x0033:
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream
            java.io.OutputStream r4 = r4.getOutputStream()
            r5.<init>(r4)
        L_0x003c:
            r3.e(r5, r6)     // Catch:{ all -> 0x0047 }
            r5.flush()     // Catch:{ all -> 0x0047 }
            r4 = 0
            g7.l.c(r5, r4)
            return
        L_0x0047:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r6 = move-exception
            g7.l.c(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.C1499a.f(java.net.HttpURLConnection, org.acra.sender.HttpSender$Method, java.lang.Object):void");
    }
}
