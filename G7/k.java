package g7;

import P6.f;
import Y6.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class k extends n {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f12042c;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r1.intValue() >= 9) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0063 A[SYNTHETIC] */
    static {
        /*
            r0 = 1
            r1 = 10
            java.lang.String r2 = "java.specification.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0070
            R.e.a(r1)
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0017
            goto L_0x0070
        L_0x0017:
            char r6 = r2.charAt(r3)
            r7 = 48
            int r7 = P6.f.f(r6, r7)
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r7 >= 0) goto L_0x003a
            if (r5 != r0) goto L_0x0029
            goto L_0x0070
        L_0x0029:
            r7 = 43
            if (r6 == r7) goto L_0x0037
            r7 = 45
            if (r6 == r7) goto L_0x0032
            goto L_0x0070
        L_0x0032:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r7 = 1
            goto L_0x003c
        L_0x0037:
            r6 = 1
        L_0x0038:
            r7 = 0
            goto L_0x003c
        L_0x003a:
            r6 = 0
            goto L_0x0038
        L_0x003c:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = 0
            r11 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L_0x0043:
            if (r6 >= r5) goto L_0x0063
            char r12 = r2.charAt(r6)
            int r12 = java.lang.Character.digit(r12, r1)
            if (r12 >= 0) goto L_0x0050
            goto L_0x0070
        L_0x0050:
            if (r10 >= r11) goto L_0x0059
            if (r11 != r9) goto L_0x0070
            int r11 = r8 / 10
            if (r10 >= r11) goto L_0x0059
            goto L_0x0070
        L_0x0059:
            int r10 = r10 * 10
            int r13 = r8 + r12
            if (r10 >= r13) goto L_0x0060
            goto L_0x0070
        L_0x0060:
            int r10 = r10 - r12
            int r6 = r6 + r0
            goto L_0x0043
        L_0x0063:
            if (r7 == 0) goto L_0x006a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x0071
        L_0x006a:
            int r1 = -r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0071
        L_0x0070:
            r1 = r4
        L_0x0071:
            if (r1 == 0) goto L_0x007e
            int r1 = r1.intValue()
            r2 = 9
            if (r1 < r2) goto L_0x007c
            goto L_0x0085
        L_0x007c:
            r0 = 0
            goto L_0x0085
        L_0x007e:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            r1.getMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x007c }
        L_0x0085:
            f12042c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.k.<clinit>():void");
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((s) next) != s.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(D6.k.M(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f6727U);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public final String f(SSLSocket sSLSocket) {
        boolean z;
        try {
            String j7 = sSLSocket.getApplicationProtocol();
            if (j7 == null) {
                z = true;
            } else {
                z = j7.equals("");
            }
            if (z) {
                return null;
            }
            return j7;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
