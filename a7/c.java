package A7;

import C6.b;
import P6.f;
import android.content.Context;
import g7.l;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.security.BaseKeyStoreFactory$Type;

public abstract class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final String f133a;

    public c(String str) {
        f.e(str, "certificateType");
        this.f133a = str;
    }

    public static String b() {
        String defaultType = KeyStore.getDefaultType();
        f.d(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    public abstract InputStream a(Context context);

    public final KeyStore create(Context context) {
        KeyStore keyStore;
        f.e(context, "context");
        InputStream a8 = a(context);
        if (a8 == null) {
            return null;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(a8);
        try {
            keyStore = KeyStore.getInstance(b());
            int i = b.f132a[BaseKeyStoreFactory$Type.CERTIFICATE.ordinal()];
            if (i == 1) {
                Certificate generateCertificate = CertificateFactory.getInstance(this.f133a).generateCertificate(bufferedInputStream);
                keyStore.load((InputStream) null, (char[]) null);
                keyStore.setCertificateEntry("ca", generateCertificate);
            } else if (i == 2) {
                keyStore.load(bufferedInputStream, (char[]) null);
            } else {
                throw new b(0);
            }
        } catch (CertificateException e) {
            ErrorReporter errorReporter = C1247a.f13789a;
            a.B("Could not load certificate", e);
            keyStore = null;
            l.c(bufferedInputStream, (Throwable) null);
            return keyStore;
        } catch (KeyStoreException e8) {
            ErrorReporter errorReporter2 = C1247a.f13789a;
            a.B("Could not load keystore", e8);
            keyStore = null;
            l.c(bufferedInputStream, (Throwable) null);
            return keyStore;
        } catch (NoSuchAlgorithmException e9) {
            ErrorReporter errorReporter3 = C1247a.f13789a;
            a.B("Could not load keystore", e9);
            keyStore = null;
            l.c(bufferedInputStream, (Throwable) null);
            return keyStore;
        } catch (IOException e10) {
            try {
                ErrorReporter errorReporter4 = C1247a.f13789a;
                a.B("Could not load keystore", e10);
                keyStore = null;
                l.c(bufferedInputStream, (Throwable) null);
                return keyStore;
            } catch (Throwable th) {
                l.c(bufferedInputStream, th);
                throw th;
            }
        }
        l.c(bufferedInputStream, (Throwable) null);
        return keyStore;
    }
}
