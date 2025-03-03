package de.ozerov.fully;

import android.app.ProgressDialog;
import n2.a;

public final class F extends ProgressDialog {

    /* renamed from: U  reason: collision with root package name */
    public final C0780t4 f9886U;

    public F(C0780t4 t4Var, String str) {
        super(t4Var);
        this.f9886U = t4Var;
        setTitle("");
        setMessage(str);
        setIndeterminate(false);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public final void show() {
        getWindow().addFlags(8);
        try {
            super.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        a.r(this.f9886U.getWindow(), getWindow());
        getWindow().clearFlags(8);
    }
}
