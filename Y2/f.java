package Y2;

import I.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import k0.b;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6581U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ View f6582V;

    public /* synthetic */ f(View view, int i) {
        this.f6581U = i;
        this.f6582V = view;
    }

    public final void run() {
        Object obj;
        String str;
        switch (this.f6581U) {
            case 0:
                this.f6582V.setBackground((Drawable) null);
                return;
            default:
                View view = this.f6582V;
                Context context = view.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    obj = a.j(context);
                } else {
                    if (i >= 23) {
                        str = a.k(context);
                    } else {
                        str = (String) b.f12901a.get(InputMethodManager.class);
                    }
                    if (str != null) {
                        obj = context.getSystemService(str);
                    } else {
                        obj = null;
                    }
                }
                ((InputMethodManager) obj).showSoftInput(view, 1);
                return;
        }
    }
}
