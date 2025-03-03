package W2;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class d extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: U  reason: collision with root package name */
    public final long f6157U;

    /* renamed from: V  reason: collision with root package name */
    public int f6158V;

    public d(InputStream inputStream, long j7) {
        super(inputStream);
        this.f6157U = j7;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f6157U - ((long) this.f6158V), (long) this.in.available());
    }

    public final void k(int i) {
        if (i >= 0) {
            this.f6158V += i;
            return;
        }
        long j7 = this.f6157U;
        if (j7 - ((long) this.f6158V) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + j7 + ", but read: " + this.f6158V);
        }
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        k(read >= 0 ? 1 : -1);
        return read;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i8) {
        int read;
        read = super.read(bArr, i, i8);
        k(read);
        return read;
    }
}
