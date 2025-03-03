package U;

import B.t0;
import D.O;
import F.h;
import L3.b;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.bumptech.glide.c;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public Size f5285a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f5286b;

    /* renamed from: c  reason: collision with root package name */
    public final e f5287c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5288d = false;

    public k(FrameLayout frameLayout, e eVar) {
        this.f5286b = frameLayout;
        this.f5287c = eVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(t0 t0Var, O o2);

    public final void f() {
        boolean z;
        int i;
        View a8 = a();
        if (a8 != null && this.f5288d) {
            FrameLayout frameLayout = this.f5286b;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            int layoutDirection = frameLayout.getLayoutDirection();
            e eVar = this.f5287c;
            eVar.getClass();
            if (size.getHeight() == 0 || size.getWidth() == 0) {
                h.I("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            } else if (eVar.f()) {
                if (a8 instanceof TextureView) {
                    ((TextureView) a8).setTransform(eVar.d());
                } else {
                    Display display = a8.getDisplay();
                    boolean z6 = false;
                    if (!eVar.f5267g || display == null || display.getRotation() == eVar.e) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z8 = eVar.f5267g;
                    if (!z8) {
                        if (!z8) {
                            i = eVar.f5264c;
                        } else {
                            i = -c.z(eVar.e);
                        }
                        if (i != 0) {
                            z6 = true;
                        }
                    }
                    if (z || z6) {
                        h.l("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                    }
                }
                RectF e = eVar.e(size, layoutDirection);
                a8.setPivotX(0.0f);
                a8.setPivotY(0.0f);
                a8.setScaleX(e.width() / ((float) eVar.f5262a.getWidth()));
                a8.setScaleY(e.height() / ((float) eVar.f5262a.getHeight()));
                a8.setTranslationX(e.left - ((float) a8.getLeft()));
                a8.setTranslationY(e.top - ((float) a8.getTop()));
            }
        }
    }

    public abstract b g();
}
