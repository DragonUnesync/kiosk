package T2;

import B3.d;
import S2.c;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.o;

public final class e extends b {

    /* renamed from: Y  reason: collision with root package name */
    public static final Handler f4993Y = new Handler(Looper.getMainLooper(), new d(2));

    /* renamed from: X  reason: collision with root package name */
    public final o f4994X;

    public e(o oVar, int i, int i8) {
        super(i, i8);
        this.f4994X = oVar;
    }

    public final void g(Drawable drawable) {
    }

    public final void i(Object obj) {
        c cVar = this.f4986W;
        if (cVar != null && cVar.k()) {
            f4993Y.obtainMessage(1, this).sendToTarget();
        }
    }
}
