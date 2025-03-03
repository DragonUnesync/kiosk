package b6;

import h6.C1082c;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* renamed from: b6.q0  reason: case insensitive filesystem */
public abstract class C0577q0 {
    private static final C1082c LOGGER;
    private static final C0573o0 WRAPPER;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b6.o0} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<b6.q0> r0 = b6.C0577q0.class
            h6.c r0 = h6.d.getInstance((java.lang.Class<?>) r0)
            LOGGER = r0
            b6.l0 r1 = new b6.l0
            r1.<init>()
            java.lang.Throwable r2 = g6.Y.getUnsafeUnavailabilityCause()
            java.lang.String r3 = "Unable to access wrapped TrustManager"
            r4 = 0
            if (r2 != 0) goto L_0x004e
            javax.net.ssl.SSLContext r0 = newSSLContext()     // Catch:{ all -> 0x0029 }
            b6.m0 r2 = new b6.m0     // Catch:{ all -> 0x0029 }
            r2.<init>()     // Catch:{ all -> 0x0029 }
            r5 = 1
            javax.net.ssl.TrustManager[] r5 = new javax.net.ssl.TrustManager[r5]     // Catch:{ all -> 0x0029 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0029 }
            r0.init(r4, r5, r4)     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            r7 = r4
            r4 = r0
            r0 = r7
        L_0x002d:
            if (r4 == 0) goto L_0x0035
            h6.c r0 = LOGGER
            r0.debug((java.lang.String) r3, (java.lang.Throwable) r4)
            goto L_0x0051
        L_0x0035:
            b6.n0 r2 = new b6.n0
            r2.<init>(r0)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r2)
            boolean r2 = r0 instanceof java.lang.Throwable
            if (r2 == 0) goto L_0x004a
            h6.c r2 = LOGGER
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r2.debug((java.lang.String) r3, (java.lang.Throwable) r0)
            goto L_0x0051
        L_0x004a:
            r1 = r0
            b6.o0 r1 = (b6.C0573o0) r1
            goto L_0x0051
        L_0x004e:
            r0.debug((java.lang.String) r3, (java.lang.Throwable) r4)
        L_0x0051:
            WRAPPER = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0577q0.<clinit>():void");
    }

    /* access modifiers changed from: private */
    public static SSLContext newSSLContext() {
        return SSLContext.getInstance("TLS", "SunJSSE");
    }

    public static X509TrustManager wrapIfNeeded(X509TrustManager x509TrustManager) {
        return WRAPPER.wrapIfNeeded(x509TrustManager);
    }
}
