package o;

import A.f;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import g.C0940a;
import n2.a;

/* renamed from: o.v  reason: case insensitive filesystem */
public final class C1298v {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f14097a;

    /* renamed from: b  reason: collision with root package name */
    public final f f14098b;

    public C1298v(TextView textView) {
        this.f14097a = textView;
        this.f14098b = new f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((a) this.f14098b.f17V).M(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f14097a.getContext().obtainStyledAttributes(attributeSet, C0940a.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((a) this.f14098b.f17V).W0(z);
    }

    public final void d(boolean z) {
        ((a) this.f14098b.f17V).X0(z);
    }
}
