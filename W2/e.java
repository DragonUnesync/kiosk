package W2;

import K2.w;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;

public final class e extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: W  reason: collision with root package name */
    public static final ArrayDeque f6159W = new ArrayDeque(0);

    /* renamed from: U  reason: collision with root package name */
    public w f6160U;

    /* renamed from: V  reason: collision with root package name */
    public IOException f6161V;

    static {
        char[] cArr = m.f6173a;
    }

    public final int available() {
        return this.f6160U.available();
    }

    public final void close() {
        this.f6160U.close();
    }

    public final void k() {
        this.f6161V = null;
        this.f6160U = null;
        ArrayDeque arrayDeque = f6159W;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    public final void mark(int i) {
        this.f6160U.mark(i);
    }

    public final boolean markSupported() {
        this.f6160U.getClass();
        return true;
    }

    public final int read() {
        try {
            return this.f6160U.read();
        } catch (IOException e) {
            this.f6161V = e;
            throw e;
        }
    }

    public final synchronized void reset() {
        this.f6160U.reset();
    }

    public final long skip(long j7) {
        try {
            return this.f6160U.skip(j7);
        } catch (IOException e) {
            this.f6161V = e;
            throw e;
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        try {
            return this.f6160U.read(bArr);
        } catch (IOException e) {
            this.f6161V = e;
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i8) {
        try {
            return this.f6160U.read(bArr, i, i8);
        } catch (IOException e) {
            this.f6161V = e;
            throw e;
        }
    }
}
