package W2;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.altbeacon.bluetooth.Pdu;

public final class a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: U  reason: collision with root package name */
    public final ByteBuffer f6153U;

    /* renamed from: V  reason: collision with root package name */
    public int f6154V = -1;

    public a(ByteBuffer byteBuffer) {
        this.f6153U = byteBuffer;
    }

    public final int available() {
        return this.f6153U.remaining();
    }

    public final synchronized void mark(int i) {
        this.f6154V = this.f6153U.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.f6153U;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & Pdu.MANUFACTURER_DATA_PDU_TYPE;
    }

    public final synchronized void reset() {
        int i = this.f6154V;
        if (i != -1) {
            this.f6153U.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j7) {
        ByteBuffer byteBuffer = this.f6153U;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j7, (long) byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i8) {
        ByteBuffer byteBuffer = this.f6153U;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i8, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
