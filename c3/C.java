package C3;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import v0.C1510H;

public final class C implements TextWatcher {

    /* renamed from: U  reason: collision with root package name */
    public int f566U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ EditText f567V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f568W;

    public C(TextInputLayout textInputLayout, EditText editText) {
        this.f568W = textInputLayout;
        this.f567V = editText;
        this.f566U = editText.getLineCount();
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f568W;
        textInputLayout.u(!textInputLayout.f9463u1, false);
        if (textInputLayout.f9439h0) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.p0) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f567V;
        int lineCount = editText.getLineCount();
        int i = this.f566U;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = C1510H.f15874a;
                int minimumHeight = editText.getMinimumHeight();
                int i8 = textInputLayout.f9452n1;
                if (minimumHeight != i8) {
                    editText.setMinimumHeight(i8);
                }
            }
            this.f566U = lineCount;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
    }
}
