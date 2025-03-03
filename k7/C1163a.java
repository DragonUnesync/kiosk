package k7;

import P6.f;
import Q7.g;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: k7.a  reason: case insensitive filesystem */
public final class C1163a extends g {

    /* renamed from: a  reason: collision with root package name */
    public final C1166d f13052a;

    public C1163a(C1166d dVar) {
        f.e(dVar, "trustRootIndex");
        this.f13052a = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1163a) || !f.a(((C1163a) obj).f13052a, this.f13052a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13052a.hashCode();
    }

    public final List k(String str, List list) {
        f.e(list, "chain");
        f.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        f.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            f.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a8 = this.f13052a.a(x509Certificate);
            if (a8 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a8)) {
                    arrayList.add(a8);
                }
                if (f.a(a8.getIssuerDN(), a8.getSubjectDN())) {
                    try {
                        a8.verify(a8.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                f.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    f.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (f.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
