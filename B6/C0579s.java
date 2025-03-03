package b6;

import android.media.MediaCodec;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: b6.s  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0579s {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof X509ExtendedTrustManager;
    }

    public static /* bridge */ /* synthetic */ boolean C(TrustManager trustManager) {
        return trustManager instanceof X509ExtendedTrustManager;
    }

    public static /* bridge */ /* synthetic */ boolean D(X509TrustManager x509TrustManager) {
        return x509TrustManager instanceof X509ExtendedTrustManager;
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern d(int i, int i8) {
        return new MediaCodec.CryptoInfo.Pattern(i, i8);
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return SNIHostName.class;
    }

    public static /* bridge */ /* synthetic */ X509ExtendedTrustManager l(TrustManager trustManager) {
        return (X509ExtendedTrustManager) trustManager;
    }

    public static /* bridge */ /* synthetic */ X509ExtendedTrustManager m(X509TrustManager x509TrustManager) {
        return (X509ExtendedTrustManager) x509TrustManager;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void n() {
        /*
            android.media.MediaCodec$CryptoInfo$Pattern r0 = new android.media.MediaCodec$CryptoInfo$Pattern
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0579s.n():void");
    }
}
