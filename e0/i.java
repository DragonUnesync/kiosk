package E0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.j;

public final class i implements TextWatcher {

    /* renamed from: U  reason: collision with root package name */
    public final EditText f1312U;

    /* renamed from: V  reason: collision with root package name */
    public h f1313V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f1314W = true;

    public i(EditText editText) {
        this.f1312U = editText;
    }

    public static void a(EditText editText, int i) {
        int i8;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j a8 = j.a();
            if (editableText == null) {
                i8 = 0;
            } else {
                a8.getClass();
                i8 = editableText.length();
            }
            a8.e(editableText, 0, i8);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        EditText editText = this.f1312U;
        if (!editText.isInEditMode() && this.f1314W && j.f7792k != null && i8 <= i9 && (charSequence instanceof Spannable)) {
            int b8 = j.a().b();
            if (b8 != 0) {
                if (b8 == 1) {
                    j.a().e((Spannable) charSequence, i, i9 + i);
                    return;
                } else if (b8 != 3) {
                    return;
                }
            }
            j a8 = j.a();
            if (this.f1313V == null) {
                this.f1313V = new h(editText);
            }
            a8.f(this.f1313V);
        }
    }
}
