package E0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.j;
import n2.a;

public final class g extends a {

    /* renamed from: b  reason: collision with root package name */
    public final f f1309b;

    public g(TextView textView) {
        this.f1309b = new f(textView);
    }

    public final InputFilter[] M(InputFilter[] inputFilterArr) {
        boolean z;
        if (j.f7792k != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return inputFilterArr;
        }
        return this.f1309b.M(inputFilterArr);
    }

    public final void W0(boolean z) {
        boolean z6;
        if (j.f7792k != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            this.f1309b.W0(z);
        }
    }

    public final void X0(boolean z) {
        boolean z6;
        if (j.f7792k != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        f fVar = this.f1309b;
        if (!z6) {
            fVar.f1308d = z;
        } else {
            fVar.X0(z);
        }
    }

    public final TransformationMethod o1(TransformationMethod transformationMethod) {
        boolean z;
        if (j.f7792k != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return transformationMethod;
        }
        return this.f1309b.o1(transformationMethod);
    }

    public final boolean t0() {
        return this.f1309b.f1308d;
    }
}
