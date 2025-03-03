package E0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.g;
import androidx.emoji2.text.j;
import java.lang.ref.WeakReference;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f1300a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f1301b;

    public c(TextView textView, d dVar) {
        this.f1300a = new WeakReference(textView);
        this.f1301b = new WeakReference(dVar);
    }

    public final void b() {
        InputFilter[] filters;
        int i;
        TextView textView = (TextView) this.f1300a.get();
        InputFilter inputFilter = (InputFilter) this.f1301b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i8 = 0;
            while (i8 < filters.length) {
                if (filters[i8] != inputFilter) {
                    i8++;
                } else if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j a8 = j.a();
                    if (text == null) {
                        i = 0;
                    } else {
                        a8.getClass();
                        i = text.length();
                    }
                    CharSequence e = a8.e(text, 0, i);
                    if (text != e) {
                        int selectionStart = Selection.getSelectionStart(e);
                        int selectionEnd = Selection.getSelectionEnd(e);
                        textView.setText(e);
                        if (e instanceof Spannable) {
                            Spannable spannable = (Spannable) e;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
