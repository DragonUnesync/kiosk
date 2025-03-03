package androidx.fragment.app;

import P6.f;
import android.view.ViewGroup;
import androidx.activity.b;

public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7942a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7943b;

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(ViewGroup viewGroup);

    public void c(b bVar, ViewGroup viewGroup) {
        f.e(bVar, "backEvent");
        f.e(viewGroup, "container");
    }

    public void d(ViewGroup viewGroup) {
        f.e(viewGroup, "container");
    }
}
