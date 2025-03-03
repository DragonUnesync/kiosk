package K2;

import A2.d;
import B2.i;
import B2.k;
import D2.D;
import D7.c;
import E2.b;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import z3.e;

/* renamed from: K2.c  reason: case insensitive filesystem */
public final class C0111c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2604a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2605b;

    public C0111c() {
        this.f2604a = 0;
        this.f2605b = new e(22);
    }

    public final D a(Object obj, int i, int i8, i iVar) {
        switch (this.f2604a) {
            case 0:
                return c(c.g(obj), i, i8, iVar);
            default:
                return C0112d.b(this.f2605b, ((d) obj).b());
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f2604a) {
            case 0:
                c.u(obj);
                return true;
            default:
                d dVar = (d) obj;
                return true;
        }
    }

    public C0112d c(ImageDecoder.Source source, int i, int i8, i iVar) {
        Bitmap e = ImageDecoder.decodeBitmap(source, new J2.b(i, i8, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + e.getWidth() + "x" + e.getHeight() + "] for [" + i + "x" + i8 + "]");
        }
        return new C0112d((b) (e) this.f2605b, e);
    }

    public C0111c(b bVar) {
        this.f2604a = 1;
        this.f2605b = bVar;
    }
}
