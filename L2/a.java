package L2;

import K2.j;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.data.h;
import java.nio.ByteBuffer;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2692a;

    public /* synthetic */ a(int i) {
        this.f2692a = i;
    }

    public final Class a() {
        switch (this.f2692a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    public final g b(Object obj) {
        switch (this.f2692a) {
            case 0:
                return new j(4, (ByteBuffer) obj);
            case 1:
                return new h(obj);
            default:
                return new h((ParcelFileDescriptor) obj);
        }
    }
}
