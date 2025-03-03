package C3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

public final class A extends t {
    public final int e = 2131230862;

    /* renamed from: f  reason: collision with root package name */
    public EditText f554f;

    /* renamed from: g  reason: collision with root package name */
    public final C0025a f555g = new C0025a(2, this);

    public A(s sVar, int i) {
        super(sVar);
        if (i != 0) {
            this.e = i;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return 2131951920;
    }

    public final int d() {
        return this.e;
    }

    public final View.OnClickListener f() {
        return this.f555g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        boolean z;
        EditText editText = this.f554f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public final void m(EditText editText) {
        this.f554f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f554f;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f554f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f554f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
