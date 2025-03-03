package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k2.C1160q;
import n.m;
import n.o;

public final class L0 extends G0 implements H0 {

    /* renamed from: y0  reason: collision with root package name */
    public static final Method f13859y0;

    /* renamed from: x0  reason: collision with root package name */
    public C1160q f13860x0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f13859y0 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public final void l(m mVar, o oVar) {
        C1160q qVar = this.f13860x0;
        if (qVar != null) {
            qVar.l(mVar, oVar);
        }
    }

    public final C1297u0 p(Context context, boolean z) {
        K0 k02 = new K0(context, z);
        k02.setHoverListener(this);
        return k02;
    }

    public final void u(m mVar, o oVar) {
        C1160q qVar = this.f13860x0;
        if (qVar != null) {
            qVar.u(mVar, oVar);
        }
    }
}
