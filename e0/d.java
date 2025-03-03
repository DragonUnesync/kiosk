package E0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.j;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1302a;

    /* renamed from: b  reason: collision with root package name */
    public c f1303b;

    public d(TextView textView) {
        this.f1302a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f1302a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b8 = j.a().b();
        if (b8 != 0) {
            if (b8 != 1) {
                if (b8 != 3) {
                    return charSequence;
                }
            } else if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i == 0 && i8 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i8);
                }
                return j.a().e(charSequence, 0, charSequence.length());
            }
        }
        j a8 = j.a();
        if (this.f1303b == null) {
            this.f1303b = new c(textView, this);
        }
        a8.f(this.f1303b);
        return charSequence;
    }
}
