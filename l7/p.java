package l7;

import P6.f;
import com.bumptech.glide.d;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.altbeacon.bluetooth.Pdu;

public final class p extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ q f13235U;

    public p(q qVar) {
        this.f13235U = qVar;
    }

    public final int available() {
        q qVar = this.f13235U;
        if (!qVar.f13238W) {
            return (int) Math.min(qVar.f13237V.f13216V, (long) Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.f13235U.close();
    }

    public final int read() {
        q qVar = this.f13235U;
        if (!qVar.f13238W) {
            f fVar = qVar.f13237V;
            if (fVar.f13216V == 0 && qVar.f13236U.f(fVar, 8192) == -1) {
                return -1;
            }
            return fVar.n() & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f13235U + ".inputStream()";
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i8) {
        f.e(bArr, "data");
        q qVar = this.f13235U;
        if (!qVar.f13238W) {
            d.c((long) bArr.length, (long) i, (long) i8);
            f fVar = qVar.f13237V;
            if (fVar.f13216V == 0 && qVar.f13236U.f(fVar, 8192) == -1) {
                return -1;
            }
            return fVar.m(bArr, i, i8);
        }
        throw new IOException("closed");
    }
}
