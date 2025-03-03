package C3;

import B.B;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import w0.C1576e;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f640a;

    /* renamed from: b  reason: collision with root package name */
    public final s f641b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f642c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f643d;

    public t(s sVar) {
        this.f640a = sVar.f619U;
        this.f641b = sVar;
        this.f642c = sVar.getContext();
        this.f643d = sVar.f625d0;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public B h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(C1576e eVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.f641b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
