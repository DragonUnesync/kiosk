package T;

import B.B;
import D7.b;
import E.e;
import F.h;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import com.bumptech.glide.manager.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4596a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ImageWriter f4597b;

    /* renamed from: c  reason: collision with root package name */
    public final q f4598c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4599d;
    public final Surface e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4600f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4601g;

    /* renamed from: h  reason: collision with root package name */
    public long f4602h;

    public a(Surface surface, Size size, boolean z) {
        boolean z6 = false;
        this.f4599d = false;
        this.f4602h = -1;
        this.f4601g = z;
        z6 = (S.a.f4375a.j(CaptureOutputSurfaceOccupiedQuirk.class) != null || z) ? true : z6;
        this.f4600f = z6;
        if (Build.VERSION.SDK_INT < 29 || !z6) {
            this.e = surface;
            this.f4598c = null;
            this.f4597b = null;
            return;
        }
        h.j("CaptureOutputSurface", "Enabling intermediate surface");
        q i = e.i(size.getWidth(), size.getHeight(), 35, 2);
        this.f4598c = i;
        this.e = i.j();
        this.f4597b = ImageWriter.newInstance(surface, 2, 35);
        i.E(new B(14, this), b.l());
    }

    public final void a() {
        synchronized (this.f4596a) {
            try {
                this.f4599d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f4600f) {
                    this.f4598c.C();
                    this.f4598c.close();
                    this.f4597b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Surface b() {
        return this.e;
    }
}
