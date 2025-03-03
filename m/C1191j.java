package m;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import v0.C1514L;
import v0.C1516N;

/* renamed from: m.j  reason: case insensitive filesystem */
public final class C1191j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f13310a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f13311b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f13312c;

    /* renamed from: d  reason: collision with root package name */
    public C1516N f13313d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final C1190i f13314f = new C1190i(this);

    public final void a() {
        if (this.e) {
            Iterator it = this.f13310a.iterator();
            while (it.hasNext()) {
                ((C1514L) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.e) {
            Iterator it = this.f13310a.iterator();
            while (it.hasNext()) {
                C1514L l8 = (C1514L) it.next();
                long j7 = this.f13311b;
                if (j7 >= 0) {
                    l8.c(j7);
                }
                Interpolator interpolator = this.f13312c;
                if (!(interpolator == null || (view = (View) l8.f15887a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f13313d != null) {
                    l8.d(this.f13314f);
                }
                View view2 = (View) l8.f15887a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
