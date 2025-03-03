package F0;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource {

    /* renamed from: U  reason: collision with root package name */
    public long f1420U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ f f1421V;

    public a(f fVar) {
        this.f1421V = fVar;
    }

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j7, byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (j7 < 0) {
            return -1;
        }
        try {
            long j8 = this.f1420U;
            if (j8 != j7) {
                if (j8 >= 0 && j7 >= j8 + ((long) this.f1421V.f1424U.available())) {
                    return -1;
                }
                this.f1421V.l(j7);
                this.f1420U = j7;
            }
            if (i8 > this.f1421V.f1424U.available()) {
                i8 = this.f1421V.f1424U.available();
            }
            int read = this.f1421V.read(bArr, i, i8);
            if (read >= 0) {
                this.f1420U += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f1420U = -1;
        return -1;
    }
}
