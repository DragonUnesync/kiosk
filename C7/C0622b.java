package c7;

import E6.a;
import P6.f;
import T0.g0;
import Y6.g;
import Y6.h;
import Z6.b;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: c7.b  reason: case insensitive filesystem */
public final class C0622b {

    /* renamed from: a  reason: collision with root package name */
    public final List f8897a;

    /* renamed from: b  reason: collision with root package name */
    public int f8898b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8899c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8900d;

    public C0622b(List list) {
        f.e(list, "connectionSpecs");
        this.f8897a = list;
    }

    public final h a(SSLSocket sSLSocket) {
        h hVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        SSLSocket sSLSocket2 = sSLSocket;
        int i = this.f8898b;
        List list = this.f8897a;
        int size = list.size();
        while (true) {
            if (i >= size) {
                hVar = null;
                break;
            }
            hVar = (h) list.get(i);
            if (hVar.b(sSLSocket2)) {
                this.f8898b = i + 1;
                break;
            }
            i++;
        }
        if (hVar != null) {
            int i8 = this.f8898b;
            int size2 = list.size();
            while (true) {
                if (i8 >= size2) {
                    z = false;
                    break;
                } else if (((h) list.get(i8)).b(sSLSocket2)) {
                    z = true;
                    break;
                } else {
                    i8++;
                }
            }
            this.f8899c = z;
            boolean z6 = this.f8900d;
            String[] strArr3 = hVar.f6640c;
            if (strArr3 != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                f.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                strArr = b.o(enabledCipherSuites, strArr3, g.f6620c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr4 = hVar.f6641d;
            if (strArr4 != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                f.d(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = b.o(enabledProtocols, strArr4, a.f1375V);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            f.d(supportedCipherSuites, "supportedCipherSuites");
            Y6.f fVar = g.f6620c;
            byte[] bArr = b.f6982a;
            int length = supportedCipherSuites.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                } else if (fVar.compare(supportedCipherSuites[i9], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                } else {
                    i9++;
                }
            }
            if (z6 && i9 != -1) {
                f.d(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i9];
                f.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                f.d(copyOf, "copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            g0 g0Var = new g0(false);
            g0Var.f4839c = hVar.f6638a;
            g0Var.f4838b = strArr3;
            g0Var.e = strArr4;
            g0Var.f4840d = hVar.f6639b;
            f.d(strArr, "cipherSuitesIntersection");
            g0Var.c((String[]) Arrays.copyOf(strArr, strArr.length));
            f.d(strArr2, "tlsVersionsIntersection");
            g0Var.f((String[]) Arrays.copyOf(strArr2, strArr2.length));
            h a8 = g0Var.a();
            if (a8.c() != null) {
                sSLSocket2.setEnabledProtocols(a8.f6641d);
            }
            if (a8.a() != null) {
                sSLSocket2.setEnabledCipherSuites(a8.f6640c);
            }
            return hVar;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f8900d);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        f.b(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        f.d(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
