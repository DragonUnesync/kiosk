package o;

import android.content.Context;
import android.view.View;
import android.view.Window;
import n.C1225a;

public final class n1 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final C1225a f14014U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ o1 f14015V;

    /* JADX WARNING: type inference failed for: r0v0, types: [n.a, java.lang.Object] */
    public n1(o1 o1Var) {
        this.f14015V = o1Var;
        Context context = o1Var.f14023a.getContext();
        CharSequence charSequence = o1Var.f14029h;
        ? obj = new Object();
        obj.f13416Y = 4096;
        obj.f13418a0 = 4096;
        obj.f13423f0 = null;
        obj.f13424g0 = null;
        obj.f13425h0 = false;
        obj.f13426i0 = false;
        obj.f13427j0 = 16;
        obj.f13420c0 = context;
        obj.f13412U = charSequence;
        this.f14014U = obj;
    }

    public final void onClick(View view) {
        o1 o1Var = this.f14015V;
        Window.Callback callback = o1Var.f14031k;
        if (callback != null && o1Var.f14032l) {
            callback.onMenuItemSelected(0, this.f14014U);
        }
    }
}
