package de.ozerov.fully;

import android.content.Context;
import android.net.http.SslCertificate;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: de.ozerov.fully.l1  reason: case insensitive filesystem */
public abstract class C0730l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f10784a;

    static {
        Object[] objArr = {new C0724k1(0), new C0724k1(1), new C0724k1(2), new C0724k1(3), new C0724k1(4), new C0724k1(7), new C0724k1(5), new C0724k1(6)};
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        f10784a = new ArrayList(DesugarCollections.unmodifiableList(arrayList));
    }

    public static void a(Context context, SslCertificate sslCertificate) {
        Certificate certificate;
        Certificate certificate2;
        char c8;
        String cName = sslCertificate.getIssuedBy().getCName();
        Iterator it = f10784a.iterator();
        while (it.hasNext()) {
            C0724k1 k1Var = (C0724k1) it.next();
            switch (k1Var.f10768a) {
                case 0:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886081));
                    break;
                case 1:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886082));
                    break;
                case 2:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886083));
                    break;
                case 3:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886084));
                    break;
                case 4:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886085));
                    break;
                case 5:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886086));
                    break;
                case 6:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886087));
                    break;
                default:
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886088));
                    break;
            }
            if (new SslCertificate((X509Certificate) certificate).getIssuedTo().getCName().equals(cName)) {
                byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
                if (byteArray == null) {
                    certificate2 = null;
                } else {
                    certificate2 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
                }
                if (certificate.getType().equals("X.509")) {
                    ((X509Certificate) certificate).checkValidity();
                }
                certificate2.verify(certificate.getPublicKey());
                switch (k1Var.f10768a) {
                    case 0:
                    case 1:
                        c8 = 1;
                        break;
                    default:
                        c8 = 2;
                        break;
                }
                if (c8 != 1) {
                    a(context, new SslCertificate((X509Certificate) certificate));
                    return;
                }
                return;
            }
        }
        throw new CertificateException("Unable to find certificate trusted anchor");
    }
}
