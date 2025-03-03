package androidx.activity;

import P6.f;
import R.e;
import U.p;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.J;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import b2.C0526e;
import b2.C0527f;
import com.bumptech.glide.manager.q;
import g7.C0996d;

public class l extends Dialog implements r, v, C0527f {

    /* renamed from: U  reason: collision with root package name */
    public t f7305U;

    /* renamed from: V  reason: collision with root package name */
    public final q f7306V = new q((C0527f) this);

    /* renamed from: W  reason: collision with root package name */
    public final u f7307W = new u(new p(9, (Object) this));

    public l(Context context, int i) {
        super(context, i);
    }

    public static void b(l lVar) {
        f.e(lVar, "this$0");
        super.onBackPressed();
    }

    public final C0526e a() {
        return (C0526e) this.f7306V.f9082X;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final t c() {
        t tVar = this.f7305U;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f7305U = tVar2;
        return tVar2;
    }

    public final void d() {
        Window window = getWindow();
        f.b(window);
        View decorView = window.getDecorView();
        f.d(decorView, "window!!.decorView");
        J.b(decorView, this);
        Window window2 = getWindow();
        f.b(window2);
        View decorView2 = window2.getDecorView();
        f.d(decorView2, "window!!.decorView");
        C0996d.y(decorView2, this);
        Window window3 = getWindow();
        f.b(window3);
        View decorView3 = window3.getDecorView();
        f.d(decorView3, "window!!.decorView");
        e.t(decorView3, this);
    }

    public final t e() {
        return c();
    }

    public final void onBackPressed() {
        this.f7307W.b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher f8 = getOnBackInvokedDispatcher();
            f.d(f8, "onBackInvokedDispatcher");
            u uVar = this.f7307W;
            uVar.getClass();
            uVar.e = f8;
            uVar.c(uVar.f7354g);
        }
        this.f7306V.i(bundle);
        c().d(C0485l.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        f.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f7306V.k(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public final void onStart() {
        super.onStart();
        c().d(C0485l.ON_RESUME);
    }

    public void onStop() {
        c().d(C0485l.ON_DESTROY);
        this.f7305U = null;
        super.onStop();
    }

    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    public void setContentView(View view) {
        f.e(view, "view");
        d();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
