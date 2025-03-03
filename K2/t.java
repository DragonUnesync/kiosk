package K2;

import B2.e;
import E2.g;
import W2.a;
import W2.b;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class t implements e {
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final int b(ByteBuffer byteBuffer, g gVar) {
        AtomicReference atomicReference = b.f6155a;
        return c(new a(byteBuffer), gVar);
    }

    public final int c(InputStream inputStream, g gVar) {
        int c8 = new F0.g(inputStream).c(1, "Orientation");
        if (c8 == 0) {
            return -1;
        }
        return c8;
    }

    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
