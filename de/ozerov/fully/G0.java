package de.ozerov.fully;

import android.app.AlertDialog;
import android.view.KeyEvent;
import android.widget.TextView;
import o.s1;

public final /* synthetic */ class G0 implements TextView.OnEditorActionListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9964U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f9965V;

    public /* synthetic */ G0(int i, Object obj) {
        this.f9964U = i;
        this.f9965V = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object obj = this.f9965V;
        switch (this.f9964U) {
            case 0:
                s1 s1Var = (s1) obj;
                if (i == 6) {
                    ((AlertDialog) s1Var.f14071b).getButton(-1).performClick();
                    return true;
                }
                s1Var.getClass();
                return false;
            case 1:
                J3 j32 = (J3) obj;
                if (i != 2) {
                    j32.getClass();
                    if (!(keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                        return false;
                    }
                }
                j32.P();
                return true;
            default:
                int i8 = TextPref.f10366Z;
                TextPref textPref = (TextPref) obj;
                if (i == 6) {
                    textPref.onClick(textPref.getDialog(), -1);
                    if (textPref.getDialog().isShowing()) {
                        textPref.getDialog().dismiss();
                    }
                    return true;
                }
                textPref.getClass();
                return false;
        }
    }
}
