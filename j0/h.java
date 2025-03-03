package j0;

import E.e;
import P6.f;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import v0.C1536i;

public abstract class h extends Activity implements r, C1536i {

    /* renamed from: U  reason: collision with root package name */
    public final t f12835U = new t(this);

    public final boolean b(KeyEvent keyEvent) {
        f.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        if (e.j(decorView, keyEvent)) {
            return true;
        }
        return e.k(this, decorView, this, keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        if (e.j(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = H.f8116V;
        F.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        f.e(bundle, "outState");
        C0486m mVar = C0486m.f8147W;
        t tVar = this.f12835U;
        tVar.c("setCurrentState");
        tVar.e(mVar);
        super.onSaveInstanceState(bundle);
    }
}
