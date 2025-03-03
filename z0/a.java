package Z0;

import R0.A;
import R0.h;
import R0.j;
import R0.l;
import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements h {

    /* renamed from: U  reason: collision with root package name */
    public final h f6767U;

    /* renamed from: V  reason: collision with root package name */
    public final byte[] f6768V;

    /* renamed from: W  reason: collision with root package name */
    public final byte[] f6769W;

    /* renamed from: X  reason: collision with root package name */
    public CipherInputStream f6770X;

    public a(h hVar, byte[] bArr, byte[] bArr2) {
        this.f6767U = hVar;
        this.f6768V = bArr;
        this.f6769W = bArr2;
    }

    public final void close() {
        if (this.f6770X != null) {
            this.f6770X = null;
            this.f6767U.close();
        }
    }

    public final long f(l lVar) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f6768V, "AES"), new IvParameterSpec(this.f6769W));
                j jVar = new j(this.f6767U, lVar);
                this.f6770X = new CipherInputStream(jVar, instance);
                if (jVar.f4269X) {
                    return -1;
                }
                jVar.f4266U.f(jVar.f4267V);
                jVar.f4269X = true;
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final Map j() {
        return this.f6767U.j();
    }

    public final void o(A a8) {
        a8.getClass();
        this.f6767U.o(a8);
    }

    public final Uri p() {
        return this.f6767U.p();
    }

    public final int x(byte[] bArr, int i, int i8) {
        this.f6770X.getClass();
        int read = this.f6770X.read(bArr, i, i8);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
