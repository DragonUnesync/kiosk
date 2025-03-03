package T2;

import S2.c;
import W2.f;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;

public final class a implements g {

    /* renamed from: U  reason: collision with root package name */
    public final ImageView f4980U;

    /* renamed from: V  reason: collision with root package name */
    public final h f4981V;

    /* renamed from: W  reason: collision with root package name */
    public Animatable f4982W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f4983X;

    public a(ImageView imageView, int i) {
        this.f4983X = i;
        f.c(imageView, "Argument must not be null");
        this.f4980U = imageView;
        this.f4981V = new h(imageView);
    }

    public final void a(c cVar) {
        this.f4980U.setTag(2131362129, cVar);
    }

    public final void b(Drawable drawable) {
        l((Object) null);
        this.f4982W = null;
        this.f4980U.setImageDrawable(drawable);
    }

    public final void c() {
        Animatable animatable = this.f4982W;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void d(S2.f fVar) {
        this.f4981V.f4997b.remove(fVar);
    }

    public final void e(Drawable drawable) {
        l((Object) null);
        this.f4982W = null;
        this.f4980U.setImageDrawable(drawable);
    }

    public final c f() {
        Object tag = this.f4980U.getTag(2131362129);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final void g(Drawable drawable) {
        h hVar = this.f4981V;
        ViewTreeObserver viewTreeObserver = hVar.f4996a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(hVar.f4998c);
        }
        hVar.f4998c = null;
        hVar.f4997b.clear();
        Animatable animatable = this.f4982W;
        if (animatable != null) {
            animatable.stop();
        }
        l((Object) null);
        this.f4982W = null;
        this.f4980U.setImageDrawable(drawable);
    }

    public final void h(f fVar) {
        int i;
        h hVar = this.f4981V;
        ImageView imageView = hVar.f4996a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i8 = 0;
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        int a8 = hVar.a(imageView.getWidth(), i, paddingRight);
        ImageView imageView2 = hVar.f4996a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        if (layoutParams2 != null) {
            i8 = layoutParams2.height;
        }
        int a9 = hVar.a(imageView2.getHeight(), i8, paddingBottom);
        if ((a8 > 0 || a8 == Integer.MIN_VALUE) && (a9 > 0 || a9 == Integer.MIN_VALUE)) {
            fVar.b(a8, a9);
            return;
        }
        ArrayList arrayList = hVar.f4997b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (hVar.f4998c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            c cVar = new c(hVar);
            hVar.f4998c = cVar;
            viewTreeObserver.addOnPreDrawListener(cVar);
        }
    }

    public final void i(Object obj) {
        l(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f4982W = animatable;
            animatable.start();
            return;
        }
        this.f4982W = null;
    }

    public final void j() {
        Animatable animatable = this.f4982W;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void k() {
    }

    public final void l(Object obj) {
        switch (this.f4983X) {
            case 0:
                this.f4980U.setImageBitmap((Bitmap) obj);
                return;
            default:
                this.f4980U.setImageDrawable((Drawable) obj);
                return;
        }
    }

    public final String toString() {
        return "Target for: " + this.f4980U;
    }
}
