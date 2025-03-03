package F0;

import java.io.InputStream;

public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f1424U.mark(Integer.MAX_VALUE);
    }

    public final void l(long j7) {
        int i = this.f1426W;
        if (((long) i) > j7) {
            this.f1426W = 0;
            this.f1424U.reset();
        } else {
            j7 -= (long) i;
        }
        k((int) j7);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1424U.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
