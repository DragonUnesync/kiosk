package b6;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.D0;
import e6.C0844c;
import e6.C0852k;
import e6.r;
import g6.B;
import java.nio.charset.Charset;
import java.security.PrivateKey;

/* renamed from: b6.s0  reason: case insensitive filesystem */
public final class C0580s0 extends C0844c implements PrivateKey, C0578r0 {
    private static final byte[] BEGIN_PRIVATE_KEY;
    private static final byte[] END_PRIVATE_KEY;
    private final C0185n content;

    static {
        Charset charset = C0852k.US_ASCII;
        BEGIN_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\n".getBytes(charset);
        END_PRIVATE_KEY = "\n-----END PRIVATE KEY-----\n".getBytes(charset);
    }

    private C0580s0(C0185n nVar) {
        this.content = (C0185n) B.checkNotNull(nVar, "content");
    }

    public static C0578r0 toPEM(C0187o oVar, boolean z, PrivateKey privateKey) {
        if (privateKey instanceof C0578r0) {
            return ((C0578r0) privateKey).retain();
        }
        byte[] encoded = privateKey.getEncoded();
        if (encoded != null) {
            return toPEM(oVar, z, encoded);
        }
        throw new IllegalArgumentException(privateKey.getClass().getName().concat(" does not support encoding"));
    }

    public static C0580s0 valueOf(byte[] bArr) {
        return valueOf(D0.wrappedBuffer(bArr));
    }

    public C0185n content() {
        int refCnt = refCnt();
        if (refCnt > 0) {
            return this.content;
        }
        throw new r(refCnt);
    }

    public void deallocate() {
        H1.zerooutAndRelease(this.content);
    }

    public void destroy() {
        release(refCnt());
    }

    public String getAlgorithm() {
        throw new UnsupportedOperationException();
    }

    public byte[] getEncoded() {
        throw new UnsupportedOperationException();
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public boolean isDestroyed() {
        if (refCnt() == 0) {
            return true;
        }
        return false;
    }

    public boolean isSensitive() {
        return true;
    }

    public static C0580s0 valueOf(C0185n nVar) {
        return new C0580s0(nVar);
    }

    public C0580s0 touch(Object obj) {
        this.content.touch(obj);
        return this;
    }

    public C0580s0 retain() {
        return (C0580s0) super.retain();
    }

    public static C0578r0 toPEM(C0187o oVar, boolean z, byte[] bArr) {
        C0185n directBuffer;
        C0185n wrappedBuffer = D0.wrappedBuffer(bArr);
        try {
            wrappedBuffer = H1.toBase64(oVar, wrappedBuffer);
            try {
                byte[] bArr2 = BEGIN_PRIVATE_KEY;
                int length = bArr2.length + wrappedBuffer.readableBytes();
                byte[] bArr3 = END_PRIVATE_KEY;
                int length2 = length + bArr3.length;
                directBuffer = z ? ((C0163c) oVar).directBuffer(length2) : ((C0163c) oVar).buffer(length2);
                directBuffer.writeBytes(bArr2);
                directBuffer.writeBytes(wrappedBuffer);
                directBuffer.writeBytes(bArr3);
                C0582t0 t0Var = new C0582t0(directBuffer, true);
                H1.zerooutAndRelease(wrappedBuffer);
                return t0Var;
            } catch (Throwable th) {
                H1.zerooutAndRelease(wrappedBuffer);
                throw th;
            }
        } finally {
            H1.zerooutAndRelease(wrappedBuffer);
        }
    }
}
