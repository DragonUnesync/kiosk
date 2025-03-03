package W2;

import androidx.recyclerview.widget.RecyclerView;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.OutputStream;

public final class j extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: U  reason: collision with root package name */
    public int f6168U = RecyclerView.UNDEFINED_DURATION;

    public j(e eVar) {
        super(eVar);
    }

    public final int available() {
        int i = this.f6168U;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public final long k(long j7) {
        int i = this.f6168U;
        if (i == 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE || j7 <= ((long) i)) {
            return j7;
        }
        return (long) i;
    }

    public final void l(long j7) {
        int i = this.f6168U;
        if (i != Integer.MIN_VALUE && j7 != -1) {
            this.f6168U = (int) (((long) i) - j7);
        }
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f6168U = i;
    }

    public final int read() {
        if (k(1) == -1) {
            return -1;
        }
        int read = super.read();
        l(1);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f6168U = RecyclerView.UNDEFINED_DURATION;
    }

    public final long skip(long j7) {
        long k8 = k(j7);
        if (k8 == -1) {
            return 0;
        }
        long skip = super.skip(k8);
        l(skip);
        return skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i8) {
        int k8 = (int) k((long) i8);
        if (k8 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, k8);
        l((long) read);
        return read;
    }
}
