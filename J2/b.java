package J2;

import B2.a;
import B2.h;
import B2.i;
import B2.j;
import K2.n;
import K2.p;
import K2.v;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;

public final class b implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final v f2493a = v.a();

    /* renamed from: b  reason: collision with root package name */
    public final int f2494b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2495c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2496d;
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2497f;

    /* renamed from: g  reason: collision with root package name */
    public final j f2498g;

    public b(int i, int i8, i iVar) {
        boolean z;
        this.f2494b = i;
        this.f2495c = i8;
        this.f2496d = (a) iVar.c(p.f2626f);
        this.e = (n) iVar.c(n.f2623g);
        h hVar = p.i;
        if (iVar.c(hVar) == null || !((Boolean) iVar.c(hVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f2497f = z;
        this.f2498g = (j) iVar.c(p.f2627g);
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [J2.a, java.lang.Object] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        if (this.f2493a.c(this.f2494b, this.f2495c, this.f2497f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f2496d == a.f379V) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new Object());
        Size l8 = imageInfo.getSize();
        int i = this.f2494b;
        if (i == Integer.MIN_VALUE) {
            i = l8.getWidth();
        }
        int i8 = this.f2495c;
        if (i8 == Integer.MIN_VALUE) {
            i8 = l8.getHeight();
        }
        float b8 = this.e.b(l8.getWidth(), l8.getHeight(), i, i8);
        int round = Math.round(((float) l8.getWidth()) * b8);
        int round2 = Math.round(((float) l8.getHeight()) * b8);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + l8.getWidth() + "x" + l8.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b8);
        }
        imageDecoder.setTargetSize(round, round2);
        j jVar = this.f2498g;
        if (jVar != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
                if (jVar != j.f389U || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) {
                    named = ColorSpace.Named.SRGB;
                } else {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i9 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
