package M2;

import A1.d;
import B2.i;
import B2.k;
import D2.D;
import E2.g;
import W2.b;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3100a;

    /* renamed from: b  reason: collision with root package name */
    public final d f3101b;

    public /* synthetic */ a(d dVar, int i) {
        this.f3100a = i;
        this.f3101b = dVar;
    }

    public final D a(Object obj, int i, int i8, i iVar) {
        switch (this.f3100a) {
            case 0:
                return d.m(ImageDecoder.createSource((ByteBuffer) obj), i, i8, iVar);
            default:
                return d.m(ImageDecoder.createSource(b.b((InputStream) obj)), i, i8, iVar);
        }
    }

    public final boolean b(Object obj, i iVar) {
        switch (this.f3100a) {
            case 0:
                ImageHeaderParser$ImageType o2 = N7.a.o((ArrayList) this.f3101b.f35V, (ByteBuffer) obj);
                if (o2 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && o2 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return true;
                }
                return false;
            default:
                d dVar = this.f3101b;
                ImageHeaderParser$ImageType n4 = N7.a.n((ArrayList) dVar.f35V, (InputStream) obj, (g) dVar.f36W);
                if (n4 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && n4 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return true;
                }
                return false;
        }
    }
}
