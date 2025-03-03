package K2;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class C extends MediaDataSource {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f2591U;

    public C(ByteBuffer byteBuffer) {
        this.f2591U = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f2591U.limit();
    }

    public final int readAt(long j7, byte[] bArr, int i, int i8) {
        if (j7 >= ((long) this.f2591U.limit())) {
            return -1;
        }
        this.f2591U.position((int) j7);
        int min = Math.min(i8, this.f2591U.remaining());
        this.f2591U.get(bArr, i, min);
        return min;
    }
}
