package B2;

import E2.g;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface e {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, g gVar);

    int c(InputStream inputStream, g gVar);

    ImageHeaderParser$ImageType d(InputStream inputStream);
}
