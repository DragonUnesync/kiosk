package Y6;

import C6.e;
import D6.k;
import O6.a;
import P6.f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final x f6656a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6657b;

    /* renamed from: c  reason: collision with root package name */
    public final List f6658c;

    /* renamed from: d  reason: collision with root package name */
    public final e f6659d;

    public l(x xVar, g gVar, List list, a aVar) {
        this.f6656a = xVar;
        this.f6657b = gVar;
        this.f6658c = list;
        this.f6659d = g7.l.i(new k(aVar));
    }

    public final List a() {
        return (List) this.f6659d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f6656a != this.f6656a || !f.a(lVar.f6657b, this.f6657b) || !f.a(lVar.a(), a()) || !f.a(lVar.f6658c, this.f6658c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6657b.hashCode();
        int hashCode2 = a().hashCode();
        return this.f6658c.hashCode() + ((hashCode2 + ((hashCode + ((this.f6656a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        List<Certificate> a8 = a();
        ArrayList arrayList = new ArrayList(k.M(a8));
        for (Certificate certificate : a8) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                f.d(str2, "type");
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f6656a);
        sb.append(" cipherSuite=");
        sb.append(this.f6657b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f6658c;
        ArrayList arrayList2 = new ArrayList(k.M(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                f.d(str, "type");
            }
            arrayList2.add(str);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
