package o;

import G.l;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import l0.C1169b;

public final class S extends C1169b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f13888h;
    public final /* synthetic */ int i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WeakReference f13889j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ X f13890k;

    public S(X x8, int i8, int i9, WeakReference weakReference) {
        this.f13890k = x8;
        this.f13888h = i8;
        this.i = i9;
        this.f13889j = weakReference;
    }

    public final void h(int i8) {
    }

    public final void i(Typeface typeface) {
        int i8;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i8 = this.f13888h) != -1) {
            if ((this.i & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = W.a(typeface, i8, z);
        }
        X x8 = this.f13890k;
        if (x8.f13906m) {
            x8.f13905l = typeface;
            TextView textView = (TextView) this.f13889j.get();
            if (textView == null) {
                return;
            }
            if (textView.isAttachedToWindow()) {
                textView.post(new l((Object) textView, (Object) typeface, x8.f13903j, 6));
            } else {
                textView.setTypeface(typeface, x8.f13903j);
            }
        }
    }
}
