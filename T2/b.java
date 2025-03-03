package T2;

import S2.c;
import S2.f;
import W2.m;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

public abstract class b implements g {

    /* renamed from: U  reason: collision with root package name */
    public final int f4984U;

    /* renamed from: V  reason: collision with root package name */
    public final int f4985V;

    /* renamed from: W  reason: collision with root package name */
    public c f4986W;

    public b() {
        this(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    }

    public final void a(c cVar) {
        this.f4986W = cVar;
    }

    public void b(Drawable drawable) {
    }

    public final void c() {
    }

    public final void d(f fVar) {
    }

    public final void e(Drawable drawable) {
    }

    public final c f() {
        return this.f4986W;
    }

    public final void h(f fVar) {
        fVar.b(this.f4984U, this.f4985V);
    }

    public final void j() {
    }

    public final void k() {
    }

    public b(int i, int i8) {
        if (m.i(i, i8)) {
            this.f4984U = i;
            this.f4985V = i8;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i8);
    }
}
