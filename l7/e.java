package l7;

import P6.f;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import org.altbeacon.bluetooth.Pdu;

public final class e extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ f f13214U;

    public e(f fVar) {
        this.f13214U = fVar;
    }

    public final int available() {
        return (int) Math.min(this.f13214U.f13216V, (long) Integer.MAX_VALUE);
    }

    public final void close() {
    }

    public final int read() {
        f fVar = this.f13214U;
        if (fVar.f13216V > 0) {
            return fVar.n() & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        }
        return -1;
    }

    public final String toString() {
        return this.f13214U + ".inputStream()";
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i8) {
        f.e(bArr, "sink");
        return this.f13214U.m(bArr, i, i8);
    }
}
