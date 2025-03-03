package J4;

import android.media.MediaCodec;
import java.net.ProtocolFamily;
import java.security.AlgorithmConstraints;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;

public abstract /* synthetic */ class b {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern c() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return ProtocolFamily.class;
    }

    public static /* bridge */ /* synthetic */ AlgorithmConstraints g(Object obj) {
        return (AlgorithmConstraints) obj;
    }

    public static /* bridge */ /* synthetic */ SNIHostName l(Object obj) {
        return (SNIHostName) obj;
    }

    public static /* synthetic */ SNIHostName m(byte[] bArr) {
        return new SNIHostName(bArr);
    }

    public static /* bridge */ /* synthetic */ SNIServerName n(Object obj) {
        return (SNIServerName) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void o() {
        /*
            javax.net.ssl.SNIHostName r0 = new javax.net.ssl.SNIHostName
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.b.o():void");
    }

    public static /* synthetic */ void u(String str) {
        new SNIHostName(str);
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof SNIHostName;
    }
}
