package de.ozerov.fully;

import Z1.c;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import d4.k;
import n2.a;

/* renamed from: de.ozerov.fully.e3  reason: case insensitive filesystem */
public final /* synthetic */ class C0690e3 implements TextView.OnEditorActionListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10611U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f10612V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f10613W;

    public /* synthetic */ C0690e3(Object obj, KeyEvent.Callback callback, int i) {
        this.f10611U = i;
        this.f10612V = obj;
        this.f10613W = callback;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = true;
        KeyEvent.Callback callback = this.f10613W;
        Object obj = this.f10612V;
        switch (this.f10611U) {
            case 0:
                int i8 = ProvisioningActivity.f10263k0;
                ProvisioningActivity provisioningActivity = (ProvisioningActivity) obj;
                provisioningActivity.getClass();
                if (i != 2 && (keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                    return false;
                }
                String trim = ((EditText) callback).getText().toString().trim();
                if (trim.isEmpty()) {
                    return true;
                }
                provisioningActivity.d();
                new C0723k0(provisioningActivity, trim).execute(new Void[0]);
                return true;
            default:
                g5 g5Var = (g5) obj;
                g5Var.getClass();
                if (keyEvent == null) {
                    return false;
                }
                if (i == 2 || (keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                    EditText editText = g5Var.f10661c;
                    String a8 = P.a(editText.getText().toString());
                    C0780t4 t4Var = (C0780t4) callback;
                    if (P.I(a8)) {
                        g5Var.g(a8);
                    } else {
                        k kVar = g5Var.f10677u;
                        if (!kVar.N2(((c) kVar.f9767W).r("searchProviderUrl", "")).equals("")) {
                            g5Var.g(kVar.N2(((c) kVar.f9767W).r("searchProviderUrl", "")) + a.k1(editText.getText().toString()));
                        } else {
                            a.b1(t4Var, "Wrong URL dismissed");
                        }
                    }
                    C0794w0.V(t4Var);
                    editText.clearFocus();
                } else {
                    z = false;
                }
                return z;
        }
    }
}
