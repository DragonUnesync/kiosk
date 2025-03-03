package K2;

import D2.D;
import W2.f;
import W2.m;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

public final class z implements D {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2655U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f2656V;

    public /* synthetic */ z(int i, Object obj) {
        this.f2655U = i;
        this.f2656V = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void f() {
    }

    public final int c() {
        switch (this.f2655U) {
            case 0:
                return m.c((Bitmap) this.f2656V);
            case 1:
                return ((byte[]) this.f2656V).length;
            case 2:
                return m.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f2656V).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f2656V).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    public final Class d() {
        switch (this.f2655U) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f2656V).getClass();
        }
    }

    public final void e() {
        switch (this.f2655U) {
            case 0:
            case 1:
                return;
            case 2:
                ((AnimatedImageDrawable) this.f2656V).stop();
                ((AnimatedImageDrawable) this.f2656V).clearAnimationCallbacks();
                return;
            default:
                return;
        }
    }

    public final Object get() {
        switch (this.f2655U) {
            case 0:
                return (Bitmap) this.f2656V;
            case 1:
                return (byte[]) this.f2656V;
            case 2:
                return (AnimatedImageDrawable) this.f2656V;
            default:
                return (File) this.f2656V;
        }
    }

    public z(byte[] bArr) {
        this.f2655U = 1;
        f.c(bArr, "Argument must not be null");
        this.f2656V = bArr;
    }

    public z(File file) {
        this.f2655U = 3;
        f.c(file, "Argument must not be null");
        this.f2656V = file;
    }
}
