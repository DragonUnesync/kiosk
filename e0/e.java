package E0;

import B.q0;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f1304a;

    /* renamed from: b  reason: collision with root package name */
    public final z3.e f1305b;

    public e(KeyListener keyListener) {
        z3.e eVar = new z3.e(21);
        this.f1304a = keyListener;
        this.f1305b = eVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1304a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.f1304a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        boolean z6;
        this.f1305b.getClass();
        if (i == 67) {
            z = q0.n(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = q0.n(editable, keyEvent, true);
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 || this.f1304a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1304a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1304a.onKeyUp(view, editable, i, keyEvent);
    }
}
