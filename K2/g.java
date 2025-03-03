package K2;

import B2.i;
import B2.k;
import D2.D;
import W2.b;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2611a;

    /* renamed from: b  reason: collision with root package name */
    public final C0111c f2612b;

    public g(int i) {
        this.f2611a = i;
        switch (i) {
            case 1:
                this.f2612b = new C0111c();
                return;
            default:
                this.f2612b = new C0111c();
                return;
        }
    }

    public final D a(Object obj, int i, int i8, i iVar) {
        switch (this.f2611a) {
            case 0:
                return this.f2612b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i8, iVar);
            default:
                return this.f2612b.c(ImageDecoder.createSource(b.b((InputStream) obj)), i, i8, iVar);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f2611a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return true;
            default:
                InputStream inputStream = (InputStream) obj;
                return true;
        }
    }
}
