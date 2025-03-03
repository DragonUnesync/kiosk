package U;

import A.g;
import B.B;
import B.C0002c;
import B.t0;
import B7.e;
import D.O;
import G5.c;
import L3.b;
import a0.m;
import a0.n;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.bumptech.glide.d;
import j0.f;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class t extends k {
    public TextureView e;

    /* renamed from: f  reason: collision with root package name */
    public SurfaceTexture f5308f;

    /* renamed from: g  reason: collision with root package name */
    public m f5309g;

    /* renamed from: h  reason: collision with root package name */
    public t0 f5310h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public SurfaceTexture f5311j;

    /* renamed from: k  reason: collision with root package name */
    public AtomicReference f5312k;

    /* renamed from: l  reason: collision with root package name */
    public O f5313l;

    public final View a() {
        return this.e;
    }

    public final Bitmap b() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    public final void c() {
        SurfaceTexture surfaceTexture;
        if (this.i && this.f5311j != null && this.e.getSurfaceTexture() != (surfaceTexture = this.f5311j)) {
            this.e.setSurfaceTexture(surfaceTexture);
            this.f5311j = null;
            this.i = false;
        }
    }

    public final void d() {
        this.i = true;
    }

    public final void e(t0 t0Var, O o2) {
        this.f5285a = t0Var.f307b;
        this.f5313l = o2;
        FrameLayout frameLayout = this.f5286b;
        frameLayout.getClass();
        this.f5285a.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f5285a.getWidth(), this.f5285a.getHeight()));
        this.e.setSurfaceTextureListener(new c(1, this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        t0 t0Var2 = this.f5310h;
        if (t0Var2 != null) {
            t0Var2.c();
        }
        this.f5310h = t0Var;
        Executor d8 = f.d(this.e.getContext());
        C0002c cVar = new C0002c((Object) this, 24, (Object) t0Var);
        n nVar = t0Var.f313j.f7013c;
        if (nVar != null) {
            nVar.d(cVar, d8);
        }
        h();
    }

    public final b g() {
        return d.i(new B(22, this));
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f5285a;
        if (size != null && (surfaceTexture = this.f5308f) != null && this.f5310h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f5285a.getHeight());
            Surface surface = new Surface(this.f5308f);
            t0 t0Var = this.f5310h;
            m i8 = d.i(new g(this, 7, surface));
            this.f5309g = i8;
            i8.f7017V.d(new e(this, surface, i8, t0Var, 3), f.d(this.e.getContext()));
            this.f5288d = true;
            f();
        }
    }
}
