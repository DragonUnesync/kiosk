package de.ozerov.fully;

import C3.C0025a;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;

public final /* synthetic */ class l5 implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m5 f10791a;

    public /* synthetic */ l5(m5 m5Var) {
        this.f10791a = m5Var;
    }

    public final void onShow(DialogInterface dialogInterface) {
        m5 m5Var = this.f10791a;
        AlertDialog alertDialog = m5Var.w1;
        if (alertDialog != null) {
            Button button = alertDialog.getButton(-3);
            button.setVisibility(0);
            button.setText("Rescan");
            button.setOnClickListener(new C0025a(19, m5Var));
        }
    }
}
