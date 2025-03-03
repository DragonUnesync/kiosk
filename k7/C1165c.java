package k7;

import D6.r;
import P6.f;
import Q0.g;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import u.C1477r;

/* renamed from: k7.c  reason: case insensitive filesystem */
public final class C1165c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final C1165c f13054a = new Object();

    public static List a(X509Certificate x509Certificate, int i) {
        r rVar = r.f1269U;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return rVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (f.a(next.get(0), Integer.valueOf(i))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return rVar;
        }
    }

    public static boolean b(String str) {
        int i;
        char c8;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(C1477r.c(length2, "endIndex < beginIndex: ", " < 0").toString());
        } else if (length2 <= str.length()) {
            long j7 = 0;
            int i8 = 0;
            while (i8 < length2) {
                char charAt = str.charAt(i8);
                if (charAt < 128) {
                    j7++;
                } else {
                    if (charAt < 2048) {
                        i = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i = 3;
                    } else {
                        int i9 = i8 + 1;
                        if (i9 < length2) {
                            c8 = str.charAt(i9);
                        } else {
                            c8 = 0;
                        }
                        if (charAt > 56319 || c8 < 56320 || c8 > 57343) {
                            j7++;
                            i8 = i9;
                        } else {
                            j7 += (long) 4;
                            i8 += 2;
                        }
                    }
                    j7 += (long) i;
                }
                i8++;
            }
            if (length == ((int) j7)) {
                return true;
            }
            return false;
        } else {
            StringBuilder p3 = g.p(length2, "endIndex > string.length: ", " > ");
            p3.append(str.length());
            throw new IllegalArgumentException(p3.toString().toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            r0 = 1
            java.lang.String r1 = "host"
            P6.f.e(r11, r1)
            byte[] r1 = Z6.b.f6982a
            P6.j r1 = Z6.b.e
            r1.getClass()
            java.lang.Object r1 = r1.f3955V
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r1 = r1.matches()
            r2 = 0
            if (r1 == 0) goto L_0x004a
            java.lang.String r11 = android.support.v4.media.session.b.N(r11)
            r1 = 7
            java.util.List r12 = a(r12, r1)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x002e
        L_0x002b:
            r0 = 0
            goto L_0x012f
        L_0x002e:
            java.util.Iterator r12 = r12.iterator()
        L_0x0032:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = android.support.v4.media.session.b.N(r1)
            boolean r1 = P6.f.a(r11, r1)
            if (r1 == 0) goto L_0x0032
            goto L_0x012f
        L_0x004a:
            boolean r1 = b(r11)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r4 = "US"
            if (r1 == 0) goto L_0x0060
            java.util.Locale r1 = java.util.Locale.US
            P6.f.d(r1, r4)
            java.lang.String r11 = r11.toLowerCase(r1)
            P6.f.d(r11, r3)
        L_0x0060:
            r1 = 2
            java.util.List r12 = a(r12, r1)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x006c
            goto L_0x002b
        L_0x006c:
            java.util.Iterator r12 = r12.iterator()
        L_0x0070:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r11.length()
            if (r5 != 0) goto L_0x0084
            goto L_0x00fe
        L_0x0084:
            java.lang.String r5 = "."
            boolean r6 = W6.l.a0(r11, r5, r2)
            if (r6 != 0) goto L_0x00fe
            java.lang.String r6 = ".."
            boolean r7 = r11.endsWith(r6)
            if (r7 == 0) goto L_0x0096
            goto L_0x00fe
        L_0x0096:
            if (r1 == 0) goto L_0x00fe
            int r7 = r1.length()
            if (r7 != 0) goto L_0x009f
            goto L_0x00fe
        L_0x009f:
            boolean r7 = W6.l.a0(r1, r5, r2)
            if (r7 != 0) goto L_0x00fe
            boolean r6 = r1.endsWith(r6)
            if (r6 == 0) goto L_0x00ac
            goto L_0x00fe
        L_0x00ac:
            boolean r6 = r11.endsWith(r5)
            if (r6 != 0) goto L_0x00b7
            java.lang.String r6 = r11.concat(r5)
            goto L_0x00b8
        L_0x00b7:
            r6 = r11
        L_0x00b8:
            boolean r7 = r1.endsWith(r5)
            if (r7 != 0) goto L_0x00c2
            java.lang.String r1 = r1.concat(r5)
        L_0x00c2:
            boolean r5 = b(r1)
            if (r5 == 0) goto L_0x00d4
            java.util.Locale r5 = java.util.Locale.US
            P6.f.d(r5, r4)
            java.lang.String r1 = r1.toLowerCase(r5)
            P6.f.d(r1, r3)
        L_0x00d4:
            java.lang.String r5 = "*"
            boolean r5 = W6.d.c0(r1, r5)
            if (r5 != 0) goto L_0x00e1
            boolean r1 = P6.f.a(r6, r1)
            goto L_0x012d
        L_0x00e1:
            java.lang.String r5 = "*."
            boolean r7 = W6.l.a0(r1, r5, r2)
            if (r7 == 0) goto L_0x00fe
            r7 = 42
            r8 = 4
            int r7 = W6.d.f0(r1, r7, r0, r2, r8)
            r9 = -1
            if (r7 == r9) goto L_0x00f4
            goto L_0x00fe
        L_0x00f4:
            int r7 = r6.length()
            int r10 = r1.length()
            if (r7 >= r10) goto L_0x0100
        L_0x00fe:
            r1 = 0
            goto L_0x012d
        L_0x0100:
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0107
            goto L_0x00fe
        L_0x0107:
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            P6.f.d(r1, r5)
            boolean r5 = r6.endsWith(r1)
            if (r5 != 0) goto L_0x0117
            goto L_0x00fe
        L_0x0117:
            int r5 = r6.length()
            int r1 = r1.length()
            int r5 = r5 - r1
            if (r5 <= 0) goto L_0x012c
            int r5 = r5 - r0
            r1 = 46
            int r1 = W6.d.i0(r6, r1, r5, r8)
            if (r1 == r9) goto L_0x012c
            goto L_0x00fe
        L_0x012c:
            r1 = 1
        L_0x012d:
            if (r1 == 0) goto L_0x0070
        L_0x012f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.C1165c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        f.e(str, "host");
        f.e(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            f.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
