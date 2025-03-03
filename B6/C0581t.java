package b6;

import J4.b;
import e6.C0852k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLParameters;

/* renamed from: b6.t  reason: case insensitive filesystem */
public abstract class C0581t {
    public static List getSniHostName(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return Collections.emptyList();
        }
        return Collections.singletonList(b.m(bArr));
    }

    public static List<String> getSniHostNames(SSLParameters sSLParameters) {
        List<Object> h5 = sSLParameters.getServerNames();
        if (h5 == null || h5.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(h5.size());
        for (Object n4 : h5) {
            SNIServerName n5 = b.n(n4);
            if (b.z(n5)) {
                arrayList.add(b.l(n5).getAsciiName());
            } else {
                throw new IllegalArgumentException("Only " + C0579s.e().getName() + " instances are supported, but found: " + n5);
            }
        }
        return arrayList;
    }

    public static boolean getUseCipherSuitesOrder(SSLParameters sSLParameters) {
        return sSLParameters.getUseCipherSuitesOrder();
    }

    public static boolean isValidHostNameForSNI(String str) {
        try {
            b.o();
            b.u(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void setSNIMatchers(SSLParameters sSLParameters, Collection<?> collection) {
        sSLParameters.setSNIMatchers(collection);
    }

    public static void setSniHostNames(SSLParameters sSLParameters, List<String> list) {
        sSLParameters.setServerNames(getSniHostNames(list));
    }

    public static void setUseCipherSuitesOrder(SSLParameters sSLParameters, boolean z) {
        sSLParameters.setUseCipherSuitesOrder(z);
    }

    public static List getSniHostNames(List<String> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String bytes : list) {
            b.o();
            arrayList.add(b.m(bytes.getBytes(C0852k.UTF_8)));
        }
        return arrayList;
    }
}
