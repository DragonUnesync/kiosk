package R0;

import P0.l;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import org.altbeacon.bluetooth.Pdu;

public final class j extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: U  reason: collision with root package name */
    public final h f4266U;

    /* renamed from: V  reason: collision with root package name */
    public final l f4267V;

    /* renamed from: W  reason: collision with root package name */
    public final byte[] f4268W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f4269X = false;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f4270Y = false;

    public j(h hVar, l lVar) {
        this.f4266U = hVar;
        this.f4267V = lVar;
        this.f4268W = new byte[1];
    }

    public final void close() {
        if (!this.f4270Y) {
            this.f4266U.close();
            this.f4270Y = true;
        }
    }

    public final int read() {
        byte[] bArr = this.f4268W;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i8) {
        l.j(!this.f4270Y);
        boolean z = this.f4269X;
        h hVar = this.f4266U;
        if (!z) {
            hVar.f(this.f4267V);
            this.f4269X = true;
        }
        int x8 = hVar.x(bArr, i, i8);
        if (x8 == -1) {
            return -1;
        }
        return x8;
    }
}
