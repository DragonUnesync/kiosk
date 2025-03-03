package C3;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f612a;

    public p(s sVar) {
        this.f612a = sVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        s sVar = this.f612a;
        if (sVar.p0 != textInputLayout.getEditText()) {
            EditText editText = sVar.p0;
            o oVar = sVar.f639s0;
            if (editText != null) {
                editText.removeTextChangedListener(oVar);
                if (sVar.p0.getOnFocusChangeListener() == sVar.b().e()) {
                    sVar.p0.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            sVar.p0 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(oVar);
            }
            sVar.b().m(sVar.p0);
            sVar.j(sVar.b());
        }
    }
}
