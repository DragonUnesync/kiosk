package b6;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.D0;
import e6.C0852k;
import g6.B;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: b6.u0  reason: case insensitive filesystem */
public abstract class C0584u0 extends X509Certificate implements C0578r0 {
    private static final byte[] BEGIN_CERT;
    private static final byte[] END_CERT;

    static {
        Charset charset = C0852k.US_ASCII;
        BEGIN_CERT = "-----BEGIN CERTIFICATE-----\n".getBytes(charset);
        END_CERT = "\n-----END CERTIFICATE-----\n".getBytes(charset);
    }

    private static C0185n append(C0187o oVar, boolean z, C0578r0 r0Var, int i, C0185n nVar) {
        C0185n content = r0Var.content();
        if (nVar == null) {
            nVar = newBuffer(oVar, z, content.readableBytes() * i);
        }
        nVar.writeBytes(content.slice());
        return nVar;
    }

    private static C0185n newBuffer(C0187o oVar, boolean z, int i) {
        C0163c cVar = (C0163c) oVar;
        if (z) {
            return cVar.directBuffer(i);
        }
        return cVar.buffer(i);
    }

    public static C0578r0 toPEM(C0187o oVar, boolean z, X509Certificate... x509CertificateArr) {
        B.checkNonEmpty((T[]) x509CertificateArr, "chain");
        if (x509CertificateArr.length == 1) {
            X509Certificate x509Certificate = x509CertificateArr[0];
            if (x509Certificate instanceof C0578r0) {
                return ((C0578r0) x509Certificate).retain();
            }
        }
        C0185n nVar = null;
        try {
            int length = x509CertificateArr.length;
            int i = 0;
            while (i < length) {
                X509Certificate x509Certificate2 = x509CertificateArr[i];
                if (x509Certificate2 != null) {
                    if (x509Certificate2 instanceof C0578r0) {
                        nVar = append(oVar, z, (C0578r0) x509Certificate2, x509CertificateArr.length, nVar);
                    } else {
                        nVar = append(oVar, z, x509Certificate2, x509CertificateArr.length, nVar);
                    }
                    i++;
                } else {
                    throw new IllegalArgumentException("Null element in chain: " + Arrays.toString(x509CertificateArr));
                }
            }
            return new C0582t0(nVar, false);
        } catch (Throwable th) {
            if (nVar != null) {
                nVar.release();
            }
            throw th;
        }
    }

    private static C0185n append(C0187o oVar, boolean z, X509Certificate x509Certificate, int i, C0185n nVar) {
        C0185n wrappedBuffer = D0.wrappedBuffer(x509Certificate.getEncoded());
        try {
            wrappedBuffer = H1.toBase64(oVar, wrappedBuffer);
            if (nVar == null) {
                nVar = newBuffer(oVar, z, (BEGIN_CERT.length + wrappedBuffer.readableBytes() + END_CERT.length) * i);
            }
            nVar.writeBytes(BEGIN_CERT);
            nVar.writeBytes(wrappedBuffer);
            nVar.writeBytes(END_CERT);
            wrappedBuffer.release();
            return nVar;
        } catch (Throwable th) {
            throw th;
        } finally {
            wrappedBuffer.release();
        }
    }
}
